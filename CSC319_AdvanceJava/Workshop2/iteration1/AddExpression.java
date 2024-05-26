import iteration4.Context;

public class AddExpression implements Expression<Integer> {
    private Expression<Integer> leftExpression;
    private Expression<Integer> rightExpression;

    public AddExpression(Expression<Integer> leftExpression, Expression<Integer> rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public Integer interpret(Context context) {
        return leftExpression.interpret(context) + rightExpression.interpret(context);
    }
}