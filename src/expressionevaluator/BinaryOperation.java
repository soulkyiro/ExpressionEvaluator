package expressionevaluator;

public class BinaryOperation {

    private final Expression left;
    private final Expression rigth;

    public BinaryOperation(Expression left, Expression rigth) {
        this.left = left;
        this.rigth = rigth;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRigth() {
        return rigth;
    }

}
