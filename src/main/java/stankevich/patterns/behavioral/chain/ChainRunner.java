package stankevich.patterns.behavioral.chain;

public class ChainRunner {
    public static void main(String[] args) {
        Validator validator1 = new Stage1Validator();
        Validator validator2 = new Stage2Validator();
        Validator validator3 = new Stage3Validator();

        validator1.setNext(validator2);
        validator2.setNext(validator3);

        validator1.validateAndCallNext();
        System.out.println();
        validator2.validateAndCallNext();
        System.out.println();
        validator3.validateAndCallNext();
    }
}
