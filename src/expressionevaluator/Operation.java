package expressionevaluator;

import operation.Operator;

public class Operation implements Expression{

    private final BinaryOperation numbers;
    private final String enumerator;

    public Operation(String enumerator, BinaryOperation numbers) {
        this.numbers = numbers;
        this.enumerator = enumerator;
    }

    @Override
    public Object evaluator() {
        return ((Operator) new Factory().builder(enumerator, numbers.getLeft().evaluator(),numbers.getRigth().evaluator())).calculate(numbers.getLeft().evaluator(), numbers.getRigth().evaluator());
    }

}
