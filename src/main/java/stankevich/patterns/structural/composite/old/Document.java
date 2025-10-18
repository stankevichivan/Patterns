package stankevich.patterns.structural.composite.old;

import java.util.ArrayList;
import java.util.List;

public class Document {
    List<Validator> validatorList = new ArrayList<>();

    void addValidator(Validator validator) {
        validatorList.add(validator);
    }

    void removeValidator(Validator validator) {
        validatorList.remove(validator);
    }

    void validateDocument() {
        System.out.println("validating documents");
        validatorList.forEach(Validator::validate);
    }
}
