package ru.regenix.jphp.tokenizer.token.stmt;

import ru.regenix.jphp.tokenizer.TokenType;
import ru.regenix.jphp.tokenizer.TokenMeta;
import ru.regenix.jphp.tokenizer.token.expr.value.VariableExprToken;

import java.util.Set;

public class ForStmtToken extends StmtToken {
    private Set<VariableExprToken> local;
    private Set<VariableExprToken> initLocal;
    private Set<VariableExprToken> iterationLocal;
    private ExprStmtToken initExpr;
    private ExprStmtToken condition;
    private ExprStmtToken iterationExpr;

    private BodyStmtToken body;

    public ForStmtToken(TokenMeta meta) {
        super(meta, TokenType.T_FOR);
    }

    public ExprStmtToken getInitExpr() {
        return initExpr;
    }

    public void setInitExpr(ExprStmtToken initExpr) {
        this.initExpr = initExpr;
    }

    public ExprStmtToken getCondition() {
        return condition;
    }

    public void setCondition(ExprStmtToken condition) {
        this.condition = condition;
    }

    public ExprStmtToken getIterationExpr() {
        return iterationExpr;
    }

    public void setIterationExpr(ExprStmtToken iterationExpr) {
        this.iterationExpr = iterationExpr;
    }

    public Set<VariableExprToken> getLocal() {
        return local;
    }

    public void setLocal(Set<VariableExprToken> local) {
        this.local = local;
    }

    public BodyStmtToken getBody() {
        return body;
    }

    public void setBody(BodyStmtToken body) {
        this.body = body;
    }

    public Set<VariableExprToken> getInitLocal() {
        return initLocal;
    }

    public void setInitLocal(Set<VariableExprToken> initLocal) {
        this.initLocal = initLocal;
    }

    public Set<VariableExprToken> getIterationLocal() {
        return iterationLocal;
    }

    public void setIterationLocal(Set<VariableExprToken> iterationLocal) {
        this.iterationLocal = iterationLocal;
    }
}