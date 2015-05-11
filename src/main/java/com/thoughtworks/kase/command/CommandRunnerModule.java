package com.thoughtworks.kase.command;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.MapBinder;

public class CommandRunnerModule extends AbstractModule {
  @Override
  protected void configure() {
    MapBinder<String, CommandRunner> runners = MapBinder.newMapBinder(binder(), String.class, CommandRunner.class);
    runners.addBinding("hi").to(GreetingsCommandRunner.class);
    runners.addBinding("use").to(UseLanguageCommandRunner.class);
  }
}
