package com.thoughtworks.kase;

import com.google.inject.AbstractModule;
import com.thoughtworks.sati.languages.compiler.Compiler;
import com.thoughtworks.sati.languages.multi.MultiLanguageCompiler;

public class KaseModule extends AbstractModule {
  @Override
  protected void configure() {
    bind(Compiler.class).to(MultiLanguageCompiler.class);
  }
}
