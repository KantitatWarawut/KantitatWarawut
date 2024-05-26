import iteration1.Expression;
import iteration4.Context;
import iteration4.ContextType;

public class BooleanExpression implements Expression<Boolean> {
    private boolean bool;

    public BooleanExpression(boolean bool) {
        this.bool = bool;
    }

    @Override
    public Boolean interpret(Context context) {
        if(context.isReverse() == ContextType.REVERSE){
            return !bool;
        }else{
            return bool;
        }
    }
}
