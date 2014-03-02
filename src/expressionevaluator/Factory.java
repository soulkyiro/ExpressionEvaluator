package expressionevaluator;

import java.util.HashMap;
import operation.Operator;

public class Factory {

    HashMap<String, Object> dictionary;

    public Factory() {
        dictionary = new HashMap<>();
        dictionary.put("addIntegerInteger", new Operator() {

            @Override
            public Object calculate(Object left, Object rigth) {
                return (int) left + (int) rigth;
            }
        });
        dictionary.put("addIntegerDouble", new Operator() {

            @Override
            public Object calculate(Object left, Object rigth) {
                return (int) left + (double) rigth;
            }
        });
        dictionary.put("addDoubleInteger", new Operator() {

            @Override
            public Object calculate(Object left, Object rigth) {
                return (double) left + (int) rigth;
            }
        });
        dictionary.put("addDoubleDouble", new Operator() {

            @Override
            public Object calculate(Object left, Object rigth) {
                return (double) left + (double) rigth;
            }
        });
        dictionary.put("subIntegerInteger", new Operator() {

            @Override
            public Object calculate(Object left, Object rigth) {
                return (int) left - (int) rigth;
            }
        });
        dictionary.put("subIntegerDouble", new Operator() {

            @Override
            public Object calculate(Object left, Object rigth) {
                return (int) left - (double) rigth;
            }
        });
        dictionary.put("subDoubleInteger", new Operator() {

            @Override
            public Object calculate(Object left, Object rigth) {
                return (double) left - (int) rigth;
            }
        });
        dictionary.put("subDoubleDouble", new Operator() {

            @Override
            public Object calculate(Object left, Object rigth) {
                return (double) left - (double) rigth;
            }
        });
    }

    public Object builder(String operator, Object left, Object rigth) {
        return dictionary.get(operator+getNameType(left)+getNameType(rigth));
    }
    private String getNameType(Object number){
        return number.getClass().getSimpleName();
    }

}
