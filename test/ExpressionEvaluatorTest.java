import expressionevaluator.BinaryOperation;
import expressionevaluator.Constant;
import expressionevaluator.Expression;
import org.junit.Assert;
import org.junit.Test;

public class ExpressionEvaluatorTest {

    @Test
    public void constantExpressionTest() {
        Assert.assertEquals(0, new Constant(0).evaluator());
        Assert.assertEquals(4, new Constant(4).evaluator());
        Assert.assertEquals(20, new Constant(20).evaluator());
    }
}
