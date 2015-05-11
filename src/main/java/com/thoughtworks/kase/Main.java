package com.thoughtworks.kase;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.thoughtworks.kase.command.CommandRunnerModule;
import com.thoughtworks.sati.languages.LanguagesModule;

public class Main {

  public static void main(String[] args) {
    Injector injector = Guice.createInjector(new LanguagesModule(), new KaseModule(), new CommandRunnerModule());
    KaseConfiguration configuration = injector.getInstance(KaseConfiguration.class);
    configuration.apply();
    Kase kase = injector.getInstance(Kase.class);
    kase.start();
  }
}
