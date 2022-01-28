package lab7.task1.document;

public class DokuWikiVisitor implements DocumentVisitor{
    @Override
    public StringBuilder visit(ItalicTextSegment segment) {
        StringBuilder string = new StringBuilder();
        string.append("//");
        string.append(segment.getContent());
        string.append("//");
        return string;
    }

    @Override
    public StringBuilder visit(BoldTextSegment segment) {
        StringBuilder string = new StringBuilder();
        string.append("**");
        string.append(segment.getContent());
        string.append("**");
        return string;
    }

    @Override
    public StringBuilder visit(UrlSegment segment) {
        StringBuilder string = new StringBuilder();
        string.append("[[");
        string.append(segment.getUrl());
        string.append("|");
        string.append(segment.getContent());
        string.append("]]");
        return string;
    }

    @Override
    public StringBuilder visit(PlainTextSegment segment) {
        StringBuilder string = new StringBuilder();
        string.append(segment.getContent());
        return string;
    }
}
