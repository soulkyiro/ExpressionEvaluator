package expressionevaluator;

import java.util.HashMap;

public class Factory {

    HashMap<String, Object> dictionary;

    public Factory() {
        dictionary = new HashMap<>();
    }

    public Object builder(Object numbers) {
        BinaryOperation operation = (BinaryOperation) numbers;
        if (operation.getLeft().evaluator() instanceof Integer) {
            if (operation.getRigth().evaluator() instanceof Integer) {
                return (Integer) operation.getLeft().evaluator() + (Integer) operation.getRigth().evaluator();
            } else {
                return (Integer) operation.getLeft().evaluator() + (Double) operation.getRigth().evaluator();
            }
        } else if (operation.getRigth().evaluator() instanceof Integer) {
            return (Double) operation.getLeft().evaluator() + (Integer) operation.getRigth().evaluator();
        } else {
            return (Double) operation.getLeft().evaluator() + (Double) operation.getRigth().evaluator();
        }
    }

}
