package expressionevaluator;

public class Operation {
    private BinaryOperation numbers;

    public Operation(BinaryOperation numbers) {
        this.numbers = numbers;
    }
    public Object addOperation(){
        return (Integer) numbers.getLeft().evaluator() + (Integer) numbers.getRigth().evaluator();
    }
}
