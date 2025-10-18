package stankevich.patterns.behavioral.command.old;

public class CommandRunner {
    public static void main(String[] args) {
        DocumentOperations documentOperations = new DocumentOperations();
        DocumentController controller = new DocumentController(
                new CreateCommand(documentOperations),
                new EditCommand(documentOperations),
                new CopyCommand(documentOperations),
                new DeleteCommand(documentOperations)
        );
        controller.createDocument();
        controller.copyDocument();
        controller.editDocument();
        controller.deleteDocument();
    }
}
