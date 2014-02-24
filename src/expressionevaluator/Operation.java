package expressionevaluator;

public class Operation {
    private BinaryOperation numbers;

    public Operation(BinaryOperation numbers) {
        this.numbers = numbers;
    }
    public Object addOperation(){
        if (numbers.getLeft().evaluator() instanceof Integer)
            if(numbers.getRigth().evaluator() instanceof Integer)
                return (Integer) numbers.getLeft().evaluator() + (Integer) numbers.getRigth().evaluator();
            else
                return (Integer) numbers.getLeft().evaluator() + (Double) numbers.getRigth().evaluator();
        
        else 
            if(numbers.getRigth().evaluator() instanceof Integer)
                return (Double) numbers.getLeft().evaluator() + (Integer) numbers.getRigth().evaluator();
            else
                return (Double) numbers.getLeft().evaluator() + (Double) numbers.getRigth().evaluator();
    }

}
