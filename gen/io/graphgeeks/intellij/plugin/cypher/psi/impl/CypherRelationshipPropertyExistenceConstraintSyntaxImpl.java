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

public class CypherRelationshipPropertyExistenceConstraintSyntaxImpl extends ASTWrapperPsiElement implements CypherRelationshipPropertyExistenceConstraintSyntax {

  public CypherRelationshipPropertyExistenceConstraintSyntaxImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CypherVisitor) ((CypherVisitor)visitor).visitRelationshipPropertyExistenceConstraintSyntax(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public CypherPropertyExpression getPropertyExpression() {
    return findNotNullChildByClass(CypherPropertyExpression.class);
  }

  @Override
  @NotNull
  public CypherRelationshipPatternSyntax getRelationshipPatternSyntax() {
    return findNotNullChildByClass(CypherRelationshipPatternSyntax.class);
  }

  @Override
  @NotNull
  public PsiElement getKAssertExists() {
    return findNotNullChildByType(K_ASSERT_EXISTS);
  }

  @Override
  @NotNull
  public PsiElement getKConstraintOn() {
    return findNotNullChildByType(K_CONSTRAINT_ON);
  }

}
