package expressionevaluator;

public class Constant implements Expression{
    private Object constant;

    public Constant(Object constant) {
        this.constant = constant;
    }
    @Override
    public Object evaluator() {
        return constant;
    }
}
