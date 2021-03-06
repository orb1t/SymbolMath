package org.symbolmath.ast.operation;

import org.symbolmath.ast.ASTElement;

public class DivideOperation extends BinaryOperation {

  public DivideOperation(ASTElement left, ASTElement right) {
    super(left, right);
  }

  @Override
  public String toString() {
    return left + "/" + right;
  }
}
