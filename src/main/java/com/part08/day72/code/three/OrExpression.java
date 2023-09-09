package com.part08.day72.code.three;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OrExpression implements Expression {
    private List<Expression> expressions = new ArrayList<>();

    public OrExpression(String strOrExpression) {
        String[] andExpressions = strOrExpression.trim().split("\\|\\|");
        for (String andExpr : andExpressions) {
            expressions.add(new AndExpression(andExpr));
        }
    }

    public OrExpression(List<Expression> expressions) {
        this.expressions.addAll(expressions);
    }

    @Override
    public boolean interpreter(Map<String, Long> stats) {
     for (Expression expr : expressions) {
        if (expr.interpreter(stats)) {
            return true;
        }
     }
     return false;
    }
}
