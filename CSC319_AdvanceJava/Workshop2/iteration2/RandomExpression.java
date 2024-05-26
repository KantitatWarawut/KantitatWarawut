import iteration1.Expression;
import iteration1.NumberExpression;
import iteration4.Context;

import java.util.Random;

public class RandomExpression implements Expression<Integer> {
    private Expression<Integer> leftExpression;
    private Expression<Integer> rightExpression;

    public RandomExpression(Expression<Integer> leftExpression, Expression<Integer> rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    public RandomExpression(Expression<Integer> expression) {
        this.leftExpression = new NumberExpression(0);
        this.rightExpression = expression;
    }

    public RandomExpression() {
        this.leftExpression = new NumberExpression(0);
        this.rightExpression = new NumberExpression(Integer.MAX_VALUE);
    }

    @Override
    public Integer interpret(Context context) {
        Random rand = new Random();
        int leftVal = leftExpression.interpret(context);
        int rightVal = rightExpression.interpret(context);
        int minVal = Math.min(leftVal, rightVal);
        int maxVal = Math.max(leftVal, rightVal);

        return minVal + rand.nextInt(maxVal - minVal);
    }

}
