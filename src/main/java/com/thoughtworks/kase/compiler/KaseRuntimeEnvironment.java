package com.thoughtworks.kase.compiler;

import com.thoughtworks.sati.languages.compiler.RuntimeEnvironment;
import lombok.Value;

import java.io.Writer;

@Value
public class KaseRuntimeEnvironment implements RuntimeEnvironment {
  private Command command;
  private Writer writer;
}
