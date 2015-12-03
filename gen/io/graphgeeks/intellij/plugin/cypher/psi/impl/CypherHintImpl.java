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

public class CypherHintImpl extends ASTWrapperPsiElement implements CypherHint {

  public CypherHintImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CypherVisitor) ((CypherVisitor)visitor).visitHint(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<CypherIdentifier> getIdentifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CypherIdentifier.class);
  }

  @Override
  @Nullable
  public CypherNodeLabel getNodeLabel() {
    return findChildByClass(CypherNodeLabel.class);
  }

  @Override
  @Nullable
  public CypherPropertyKeyName getPropertyKeyName() {
    return findChildByClass(CypherPropertyKeyName.class);
  }

  @Override
  @Nullable
  public PsiElement getKUsingIndex() {
    return findChildByType(K_USING_INDEX);
  }

  @Override
  @Nullable
  public PsiElement getKUsingJoinOn() {
    return findChildByType(K_USING_JOIN_ON);
  }

  @Override
  @Nullable
  public PsiElement getKUsingScan() {
    return findChildByType(K_USING_SCAN);
  }

}