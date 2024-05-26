import iteration1.Expression;
import iteration4.Context;

public class XORExpression implements Expression<Boolean> {
    private Expression<Boolean> leftExpression;
    private Expression<Boolean> rightExpression;

    public XORExpression(Expression<Boolean> leftExpression, Expression<Boolean> rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public Boolean interpret(Context context) {
        return leftExpression.interpret(context) ^ rightExpression.interpret(context);
    }
}
