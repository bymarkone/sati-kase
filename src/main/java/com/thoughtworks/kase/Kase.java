package com.thoughtworks.kase;

import com.google.inject.Inject;
import com.thoughtworks.kase.command.CommandRunners;
import com.thoughtworks.kase.compiler.KaseRuntime;
import com.thoughtworks.sati.languages.compiler.Compiler;

import java.io.Console;

public class Kase {

  private Compiler compiler;
  private CommandRunners commandRunners;

  @Inject
  public Kase(Compiler compiler, CommandRunners commandRunners) {
    this.compiler = compiler;
    this.commandRunners = commandRunners;
  }

  public void start() {
    Console console = System.console();
    KaseRuntime runtime = new KaseRuntime(console.writer(), commandRunners);
    console.printf(commandRunners.toString());
    console.printf("%s", "\n\nHey, I'm Sati!\n");
    String line;
    while ((line = console.readLine("> ")) != null) {
      try {
        runInCompiler(runtime, line);
      } catch (Exception e) {
        e.printStackTrace();
        console.writer().write("Erro ao executar o commando.");
      }
      console.writer().write("\n");
    }
  }

  private void runInCompiler(KaseRuntime runtime, String line) {
    compiler.compileAndRun(runtime, line);
  }

}
