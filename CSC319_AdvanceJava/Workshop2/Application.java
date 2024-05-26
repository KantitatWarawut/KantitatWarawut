import iteration1.AddExpression;
import iteration1.Expression;
import iteration1.NumberExpression;

import iteration2.PlusPlusExpression;
import iteration2.RandomExpression;

import iteration3.BooleanExpression;
import iteration3.XORExpression;
import iteration4.Context;
import iteration4.ContextType;

public class Application {
    public static void main(String[] args) {
        // Create the context, if needed
        Context context = new Context(ContextType.REVERSE); // ContextType = {NORMAL, REVERSE}

        // Using AddExpression
        Expression<Integer> addExpression = new AddExpression(
                new AddExpression(new NumberExpression(2), new NumberExpression(3)),
                new NumberExpression(4));
        
        System.out.println("Add: " + addExpression.interpret(context));

        // Using PlusPlusExpression
        Expression<Integer> plusplusExpression = new PlusPlusExpression(new NumberExpression(2));

        System.out.println("PlusPlus: " + plusplusExpression.interpret(context));

        // Using RandomExpression
        Expression<Integer> randomExpression1 = new RandomExpression(new NumberExpression(0), new NumberExpression(4));
        Expression<Integer> randomExpression2 = new RandomExpression(new NumberExpression(10));
        Expression<Integer> randomExpression3 = new RandomExpression();

        System.out.println("Random1: " + randomExpression1.interpret(context));
        System.out.println("Random2: " + randomExpression2.interpret(context));
        System.out.println("Random3: " + randomExpression3.interpret(context));

        // Using XORExpression
        Expression<Boolean> xorExpression = new XORExpression(
            new XORExpression(new BooleanExpression(false), new BooleanExpression(true)),
            new XORExpression(new BooleanExpression(true), new BooleanExpression(false))
        );

        System.out.println("XOR: " + xorExpression.interpret(context));
    }
}
