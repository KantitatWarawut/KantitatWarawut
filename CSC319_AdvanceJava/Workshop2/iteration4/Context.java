public class Context {
    // Add any needed Context here
    private ContextType _isReverse;

    public Context(ContextType isReverse) {
        _isReverse = isReverse;
    }

    public Context(){
        this(ContextType.NORMAL);
    }

    public ContextType isReverse() {
        return _isReverse;
    }
}
