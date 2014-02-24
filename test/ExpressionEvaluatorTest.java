import expressionevaluator.BinaryOperation;
import expressionevaluator.Constant;
import expressionevaluator.Operation;
import org.junit.Assert;
import org.junit.Test;

public class ExpressionEvaluatorTest {

    @Test
    public void constantExpressionTest() {
        Assert.assertEquals(0, new Constant(0).evaluator());
        Assert.assertEquals(4, new Constant(4).evaluator());
        Assert.assertEquals(20, new Constant(20).evaluator());
    }
    @Test
    public void addIntegerIntegerExpressionTest() {
        Assert.assertEquals(4, new Operation(new BinaryOperation ( new Constant(2), new Constant(2))).addOperation());
        Assert.assertEquals(20, new Operation(new BinaryOperation ( new Constant(5), new Constant(15))).addOperation());
        Assert.assertEquals(220, new Operation(new BinaryOperation ( new Constant(220), new Constant(0))).addOperation());
    }
    @Test
    public void addDoubleIntegerExpressionTest() {
        Assert.assertEquals(4.2, new Operation(new BinaryOperation ( new Constant(2.2), new Constant(2))).addOperation());
        Assert.assertEquals(20.4, new Operation(new BinaryOperation ( new Constant(5.4), new Constant(15))).addOperation());
        Assert.assertEquals(220.9, new Operation(new BinaryOperation ( new Constant(220.9), new Constant(0))).addOperation());
    }
}
