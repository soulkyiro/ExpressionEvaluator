package expressionevaluator;

public class Operation {

    private BinaryOperation numbers;

    public Operation(BinaryOperation numbers) {
        this.numbers = numbers;
    }

    public Object addOperation() {
        Factory factory = new Factory();

        return factory.builder(numbers);
    }

}
