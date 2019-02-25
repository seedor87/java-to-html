import java.util.ArrayList;

public class List extends Tag {

    enum ListTag {
        UL("<ul>", "</ul>"),
        OL("<ol>", "</ol>");
        private String beg;
        private String end;
        ListTag(String beg, String end) {
            this.beg = beg;
            this.end = end;
        }

    }
    private ListTag tag;
    private java.util.List<Tag> contents;

    List(ListTag tag) {
        super(tag.beg, tag.end);
        this.tag = tag;
        contents = new ArrayList<>();
    }

    public void append(Tag tag) {
        this.contents.add(tag);
    }

    @Override
    public String contentsAsString() {
        StringBuilder body = new StringBuilder();
        for (Tag tag : this.contents) {
            body.append("<li>" + tag + "</li>");
        }
        return body.toString();
    }
}
