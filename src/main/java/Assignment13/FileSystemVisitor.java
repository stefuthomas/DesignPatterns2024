package Assignment13;

public interface FileSystemVisitor {
    void visit(File file);
    void visit(Directory directory);
}
