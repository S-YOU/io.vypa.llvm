// This is a generated file. Not intended for manual editing.
package io.vypa.llvm.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface LLVMInstruction extends PsiElement {

  @Nullable
  LLVMArgumentList getArgumentList();

  @Nullable
  LLVMAtomicOrdering getAtomicOrdering();

  @Nullable
  LLVMCallingConvention getCallingConvention();

  @NotNull
  List<LLVMClause> getClauseList();

  @Nullable
  LLVMFPPredicate getFPPredicate();

  @NotNull
  List<LLVMFastMathsFlag> getFastMathsFlagList();

  @NotNull
  List<LLVMFunctionAttribute> getFunctionAttributeList();

  @NotNull
  List<LLVMIndex> getIndexList();

  @Nullable
  LLVMIntPredicate getIntPredicate();

  @NotNull
  List<LLVMOperandBundle> getOperandBundleList();

  @Nullable
  LLVMOperation getOperation();

  @NotNull
  List<LLVMReturnAttribute> getReturnAttributeList();

  @Nullable
  LLVMType getType();

  @Nullable
  LLVMTypedValue getTypedValue();

  @Nullable
  LLVMValue getValue();

  @Nullable
  PsiElement getGlobalIdentifier();

  @Nullable
  PsiElement getIntergerLiteral();

}
