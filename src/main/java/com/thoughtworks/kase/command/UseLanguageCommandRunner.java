package com.thoughtworks.kase.command;

import com.google.inject.Inject;
import com.thoughtworks.kase.compiler.Command;
import com.thoughtworks.kase.compiler.KaseRuntimeEnvironment;
import com.thoughtworks.sati.languages.compiler.RuntimeEnvironments;
import com.thoughtworks.sati.languages.multi.AllCompilers;

import java.io.IOException;
import java.io.Writer;
import java.util.Optional;

public class UseLanguageCommandRunner implements CommandRunner {

  private AllCompilers allCompilers;

  @Inject
  public UseLanguageCommandRunner(AllCompilers allCompilers) {
    this.allCompilers = allCompilers;
  }

  @Override
  public void run() {
    Optional<KaseRuntimeEnvironment> environment = RuntimeEnvironments.retrieve(KaseRuntimeEnvironment.class, Thread.currentThread().getName());

    Command command = environment.get().getCommand();
    Optional<String> compilerName = command.getParameters().stream().findFirst();
    compilerName.ifPresent((name) -> {
      boolean defined = allCompilers.defineCompilerInUse(name);
      if (defined) {
        successfullyUseLanguageMessage(environment, name);
      } else {
        unsuccessfullyUseLanguageMessage(environment, name);
      }
    });
  }

  private void unsuccessfullyUseLanguageMessage(Optional<KaseRuntimeEnvironment> environment, String languageName) {
    Writer writer = environment.get().getWriter();
    try {
      writer.write("There was a problem using language " + languageName);
      writer.flush();
    } catch (IOException e) {
      e.printStackTrace();
    }  }

  private void successfullyUseLanguageMessage(Optional<KaseRuntimeEnvironment> environment, String languageName) {
    Writer writer = environment.get().getWriter();
    try {
      writer.write("Using language " + languageName);
      writer.flush();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
