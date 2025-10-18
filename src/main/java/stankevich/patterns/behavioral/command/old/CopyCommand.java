package stankevich.patterns.behavioral.command.old;

public class CopyCommand implements Command{

    DocumentOperations documentOperations;

    public CopyCommand(DocumentOperations documentOperations) {
        this.documentOperations = documentOperations;
    }

    @Override
    public void execute() {
        documentOperations.copy();
    }
}
