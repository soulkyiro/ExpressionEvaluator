
import expressionevaluator.Expression;
import org.junit.Assert;
import org.junit.Test;

public class ExpressionEvaluatorTest {

    @Test
    public void mathematicalExpressionTest() {
        Assert.assertEquals(0, new Expression("2+2").valueExpression());
    }
}
