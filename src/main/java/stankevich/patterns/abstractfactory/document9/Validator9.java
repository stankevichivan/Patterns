package stankevich.patterns.abstractfactory.document9;

import stankevich.patterns.abstractfactory.Validator;

public class Validator9 implements Validator {
    @Override
    public void validate() {
        System.out.println("document 9 validating");
    }
}
