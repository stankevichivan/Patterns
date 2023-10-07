package stankevich.patterns.behavioral.command;

public class DocumentController {
    Command create;
    Command edit;
    Command copy;
    Command delete;

    public DocumentController(Command create, Command edit, Command copy, Command delete) {
        this.create = create;
        this.edit = edit;
        this.copy = copy;
        this.delete = delete;
    }

    public void createDocument() {
        create.execute();
    }

    public void editDocument() {
        edit.execute();
    }

    public void copyDocument() {
        copy.execute();
    }

    public void deleteDocument() {
        delete.execute();
    }
}
