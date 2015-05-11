package com.thoughtworks.kase.command;

import com.google.inject.Inject;

import java.util.Map;

public class CommandRunners {

  private Map<String, CommandRunner> availableRunners;

  @Inject
  public CommandRunners(Map<String, CommandRunner> availableRunners) {
    this.availableRunners = availableRunners;
  }

  public CommandRunner runnerFor(String name) {
    return availableRunners.get(name);
  }

  @Override
  public String toString() {
    return availableRunners.values().stream().map(cr -> cr.getClass().getName()).reduce((accum, i) -> accum + "," + i).get();
  }
}
