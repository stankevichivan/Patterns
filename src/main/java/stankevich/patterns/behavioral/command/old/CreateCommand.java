package stankevich.patterns.behavioral.command.old;

public class CreateCommand implements Command {
    DocumentOperations documentOperations;

    public CreateCommand(DocumentOperations documentOperations) {
        this.documentOperations = documentOperations;
    }

    @Override
    public void execute() {
        documentOperations.create();
    }
}
