package com.thoughtworks.kase.compiler;

import com.thoughtworks.kase.command.CommandRunner;
import com.thoughtworks.kase.command.CommandRunners;
import com.thoughtworks.sati.languages.compiler.Runtime;
import com.thoughtworks.sati.languages.compiler.RuntimeEnvironments;
import com.thoughtworks.sati.languages.compiler.SemanticModel;

import java.io.PrintWriter;
import java.util.List;

public class KaseRuntime implements Runtime  {

  private final PrintWriter writer;
  private final CommandRunners commandRunners;

  public KaseRuntime(PrintWriter writer, CommandRunners commandRunners) {
    this.writer = writer;
    this.commandRunners = commandRunners;
  }

  @Override
  public void execute(SemanticModel _semanticModel) {
    KaseSemanticModel semanticModel = (KaseSemanticModel) _semanticModel;
    List<Command> commands = semanticModel.getCommands();
    commands.forEach(command -> runOnThread(command, commandRunners.runnerFor(command.getName())));
  }

  private void runOnThread(Command command, CommandRunner runner) {
    String threadName = command.getName() + System.currentTimeMillis();
    Thread thread = new Thread(runner::run, threadName);
    RuntimeEnvironments.store(threadName, new KaseRuntimeEnvironment(command, writer));
    thread.start();
    try {
      thread.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
