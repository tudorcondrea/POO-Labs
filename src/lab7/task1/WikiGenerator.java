package lab7.task1;

import lab7.task1.document.DokuWikiVisitor;
import lab7.task1.document.MarkdownVisitor;
import lab7.task1.document.TextSegment;

import java.util.List;

/**
 * Uses visitors to parse documents and provide dokuwiki and markdown outputs.
 */
public class WikiGenerator {

    private final List<TextSegment> textSegments;

    public WikiGenerator(List<TextSegment> textSegments) {
        this.textSegments = textSegments;
    }

    public StringBuilder getDokuWikiDocument() {
        DokuWikiVisitor v = new DokuWikiVisitor();
        StringBuilder string = new StringBuilder();
        for (TextSegment segment : textSegments) {
            string.append(segment.accept(v).toString());
        }
        return string;
    }

    public StringBuilder getMarkdownDocument() {
        MarkdownVisitor v = new MarkdownVisitor();
        StringBuilder string = new StringBuilder();
        for (TextSegment segment : textSegments) {
            string.append(segment.accept(v).toString());
        }
        return string;
    }
}
