package com.thoughtworks.kase.compiler;

import com.thoughtworks.kase.antlr.KaseLexer;
import com.thoughtworks.kase.antlr.KaseParser;
import com.thoughtworks.sati.languages.compiler.Compiler;
import com.thoughtworks.sati.languages.compiler.Runtime;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class KaseCompiler implements Compiler {

  @Override
  public String name() {
    return "kase";
  }

  public void compileAndRun(Runtime runtime, String content) {
    KaseParser.CommandsContext context = parse(content);
    KaseSemanticModel semanticModel = interpret(context);
    runtime.execute(semanticModel);
  }

  private KaseSemanticModel interpret(KaseParser.CommandsContext context) {
    KaseInterpreter interpreter = new KaseInterpreter();
    interpreter.visit(context);
    return interpreter.semanticModel();
  }

  public KaseParser.CommandsContext parse(String content) {
    ANTLRInputStream input = new ANTLRInputStream(content);
    KaseLexer lexer = new KaseLexer(input);
    CommonTokenStream tokenStream = new CommonTokenStream(lexer);
    KaseParser parser = new KaseParser(tokenStream);
    return parser.commands();
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) return true;
    if (!(obj instanceof KaseCompiler)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    return this.getClass().getName().hashCode();
  }

}
