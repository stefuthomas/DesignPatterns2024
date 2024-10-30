package Assignment13;

public interface FileSystemElement {
    void accept(FileSystemVisitor visitor);
    int getSize();
}
