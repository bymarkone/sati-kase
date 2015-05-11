package com.thoughtworks.kase;

import com.google.inject.Inject;
import com.thoughtworks.kase.compiler.KaseCompiler;
import com.thoughtworks.sati.languages.multi.AllCompilers;

public class KaseConfiguration {

  private AllCompilers allCompilers;
  private KaseCompiler kaseCompiler;

  @Inject
  public KaseConfiguration(AllCompilers allCompilers, KaseCompiler kaseCompiler) {
    this.allCompilers = allCompilers;
    this.kaseCompiler = kaseCompiler;
  }

  public void apply() {
    allCompilers.addCompiler(0, kaseCompiler);
  }
}
