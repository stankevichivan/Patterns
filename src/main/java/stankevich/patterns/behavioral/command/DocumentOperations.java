package stankevich.patterns.behavioral.command;

public class DocumentOperations {
    public void create() {
        System.out.println("creating document");
    }

    public void edit() {
        System.out.println("editing document");
    }

    public void copy() {
        System.out.println("copying document");
    }

    public void delete() {
        System.out.println("deleting document");
    }
}
