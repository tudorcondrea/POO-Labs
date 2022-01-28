package lab7.task1.document;

public class UrlSegment extends TextSegment{
    private String url, description;

    public UrlSegment(String url, String content) {
        super(content);
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public StringBuilder accept(DocumentVisitor visitor) {
        return visitor.visit(this);
    }
}
