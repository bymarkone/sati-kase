package com.thoughtworks.kase.compiler;

import com.thoughtworks.kase.antlr.KaseBaseVisitor;
import com.thoughtworks.kase.antlr.KaseParser;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;


public class KaseInterpreter extends KaseBaseVisitor {

  private List<Command> commands;

  public KaseInterpreter() {
    this.commands = new ArrayList<>();
  }

  @Override
  public Object visitCommand(@NotNull KaseParser.CommandContext ctx) {
    String name = ctx.name().ID().getText();
    List<String> params = ctx.params().param().stream().map(param -> param.ID().getText()).collect(toList());
    Command command = new Command(name, params);
    commands.add(command);
    return super.visitCommand(ctx);
  }

  public KaseSemanticModel semanticModel() {
    return new KaseSemanticModel(commands);
  }

}
