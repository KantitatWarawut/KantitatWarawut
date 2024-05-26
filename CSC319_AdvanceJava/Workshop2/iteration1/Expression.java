import iteration4.Context;

public interface Expression<T> {
    T interpret(Context context);
}