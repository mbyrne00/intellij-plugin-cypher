// This is a generated file. Not intended for manual editing.
package io.graphgeeks.intellij.plugin.cypher.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static io.graphgeeks.intellij.plugin.cypher.psi.CypherTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import io.graphgeeks.intellij.plugin.cypher.psi.*;

public class CypherForeachImpl extends ASTWrapperPsiElement implements CypherForeach {

  public CypherForeachImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CypherVisitor) ((CypherVisitor)visitor).visitForeach(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<CypherClause> getClauseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CypherClause.class);
  }

  @Override
  @NotNull
  public CypherExpression getExpression() {
    return findNotNullChildByClass(CypherExpression.class);
  }

  @Override
  @NotNull
  public CypherIdentifier getIdentifier() {
    return findNotNullChildByClass(CypherIdentifier.class);
  }

  @Override
  @NotNull
  public PsiElement getKForeach() {
    return findNotNullChildByType(K_FOREACH);
  }

  @Override
  @NotNull
  public PsiElement getKIn() {
    return findNotNullChildByType(K_IN);
  }

}