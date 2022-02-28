package lab7.task1.document;

public interface Visitable {
    public StringBuilder accept(DocumentVisitor v);
}
