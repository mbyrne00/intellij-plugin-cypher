// This is a generated file. Not intended for manual editing.
package com.neueda4j.intellij.plugin.cypher.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.neueda4j.intellij.plugin.cypher.psi.CypherTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.neueda4j.intellij.plugin.cypher.psi.*;

public class CypherOrderImpl extends ASTWrapperPsiElement implements CypherOrder {

  public CypherOrderImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CypherVisitor) ((CypherVisitor)visitor).visitOrder(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<CypherSortItem> getSortItemList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CypherSortItem.class);
  }

  @Override
  @NotNull
  public PsiElement getKBy() {
    return findNotNullChildByType(K_BY);
  }

  @Override
  @NotNull
  public PsiElement getKOrder() {
    return findNotNullChildByType(K_ORDER);
  }

}
