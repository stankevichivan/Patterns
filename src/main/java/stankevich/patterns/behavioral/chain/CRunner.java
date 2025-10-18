package stankevich.patterns.behavioral.chain;

public class CRunner {
    public static void main(String[] args) {

        Approver manager = new Manager();
        Approver director = new Director();
        Approver ceo = new CEO();

        manager.setNext(director);
        director.setNext(ceo);

        System.out.println("Заявка на 500:");
        manager.processRequest(new Purchase(500));

        System.out.println("\nЗаявка на 3000:");
        manager.processRequest(new Purchase(3000));

        System.out.println("\nЗаявка на 10000:");
        manager.processRequest(new Purchase(10000));
    }
}
