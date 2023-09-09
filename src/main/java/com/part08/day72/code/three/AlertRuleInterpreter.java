package com.part08.day72.code.three;

import java.util.Map;

public class AlertRuleInterpreter {
    private Expression expression;

    public AlertRuleInterpreter(String ruleExpression) {
        this.expression = new OrExpression(ruleExpression);
    }

    public boolean interpreter(Map<String, Long> stats) {
        return expression.interpreter(stats);
    }
}
