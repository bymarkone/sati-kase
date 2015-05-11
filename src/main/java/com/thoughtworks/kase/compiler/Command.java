package com.thoughtworks.kase.compiler;

import lombok.Value;

import java.util.List;

@Value
public class Command {
  String name;
  List<String> parameters;
}
