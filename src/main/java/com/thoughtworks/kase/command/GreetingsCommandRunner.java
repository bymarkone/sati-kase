package com.thoughtworks.kase.command;

import com.thoughtworks.kase.compiler.Command;
import com.thoughtworks.kase.compiler.KaseRuntimeEnvironment;
import com.thoughtworks.sati.languages.compiler.RuntimeEnvironment;
import com.thoughtworks.sati.languages.compiler.RuntimeEnvironments;

import java.io.IOException;
import java.io.Writer;
import java.util.Optional;

public class GreetingsCommandRunner implements CommandRunner {

  @Override
  public void run() {
    Optional<KaseRuntimeEnvironment> _environment = RuntimeEnvironments.retrieve(KaseRuntimeEnvironment.class, Thread.currentThread().getName());
    KaseRuntimeEnvironment environment = _environment.get();

    Command command = environment.getCommand();
    Writer writer = environment.getWriter();
    try {
      writer.write(command.getName());
      writer.flush();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
