package com.part08.day72.code.two;

public class DivisionExpression implements Expression {
    private Expression expression1;
    private Expression expression2;

    public DivisionExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public long interpreter() {
        return this.expression1.interpreter() / this.expression2.interpreter();
    }
    
}
