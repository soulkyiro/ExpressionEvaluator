/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package expressionevaluator;

/**
 *
 * @author Soulkyiro
 */
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
