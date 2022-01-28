package lab7.task1.document;

public interface DocumentVisitor {

    public StringBuilder visit(ItalicTextSegment segment);

    public StringBuilder visit(BoldTextSegment segment);

    public StringBuilder visit(UrlSegment segment);

    public StringBuilder visit(PlainTextSegment segment);
}
