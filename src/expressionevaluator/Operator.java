package expressionevaluator;

public class Operator implements Expression{
    private String operator;

    public Operator(String operator) {
        this.operator = operator;
    }
    @Override
    public String evaluator() {
        return "add";
    }


    
}
