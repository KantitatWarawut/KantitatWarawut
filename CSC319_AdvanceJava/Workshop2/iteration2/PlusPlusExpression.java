import iteration1.Expression;
import iteration4.Context;
import iteration4.ContextType;

public class PlusPlusExpression implements Expression<Integer>{
    private Expression<Integer> expression;

    public PlusPlusExpression(Expression<Integer> expression) {
        this.expression = expression;
    }

    @Override
    public Integer interpret(Context context) {
        if (context.isReverse() == ContextType.REVERSE) {
            return expression.interpret(context) - 1;
        }else{
            return expression.interpret(context) + 1;
        }
    }
}
