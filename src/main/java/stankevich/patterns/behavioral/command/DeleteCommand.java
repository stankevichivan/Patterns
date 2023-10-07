package stankevich.patterns.behavioral.command;

public class DeleteCommand implements Command {

    DocumentOperations documentOperations;

    public DeleteCommand(DocumentOperations documentOperations) {
        this.documentOperations = documentOperations;
    }

    @Override
    public void execute() {
        documentOperations.delete();
    }
}
