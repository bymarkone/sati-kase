package com.thoughtworks.kase.compiler;

import com.thoughtworks.sati.languages.compiler.SemanticModel;
import lombok.Value;

import java.util.List;

@Value
public class KaseSemanticModel implements SemanticModel {
  private List<Command> commands;
}
