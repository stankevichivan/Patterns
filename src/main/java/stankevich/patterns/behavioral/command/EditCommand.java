package stankevich.patterns.behavioral.command;

public class EditCommand implements Command {

    DocumentOperations documentOperations;

    public EditCommand(DocumentOperations documentOperations) {
        this.documentOperations = documentOperations;
    }

    @Override
    public void execute() {
        documentOperations.edit();
    }
}
