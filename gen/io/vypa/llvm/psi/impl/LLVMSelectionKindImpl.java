// This is a generated file. Not intended for manual editing.
package io.vypa.llvm.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import io.vypa.llvm.psi.LLVMSelectionKind;
import io.vypa.llvm.psi.LLVMVisitor;
import org.jetbrains.annotations.NotNull;

public class LLVMSelectionKindImpl extends ASTWrapperPsiElement implements LLVMSelectionKind {

  public LLVMSelectionKindImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LLVMVisitor) ((LLVMVisitor)visitor).visitSelectionKind(this);
    else super.accept(visitor);
  }

}
