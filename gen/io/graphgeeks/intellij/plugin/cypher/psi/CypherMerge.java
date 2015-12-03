// This is a generated file. Not intended for manual editing.
package io.graphgeeks.intellij.plugin.cypher.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CypherMerge extends PsiElement {

  @NotNull
  List<CypherMergeAction> getMergeActionList();

  @NotNull
  CypherPatternPart getPatternPart();

  @NotNull
  PsiElement getKMerge();

}