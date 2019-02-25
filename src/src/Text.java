public class Text extends Tag {

    enum TextTag {
        P ("<p>", "</p>"),
        H ("<h>", "</h>"),
        B ("<b>", "</b>"),
        MARK ("<mark>", "</mark>"),
        NONE("","");
        private String beg, end;
        TextTag(String beg, String end) {
            this.beg = beg;
            this.end = end;
        }
    }

    private TextTag tag;
    private String text;

    Text(TextTag tag, String text) {
        super(tag.beg, tag.end);
        this.tag = tag;
        this.text = text;
    }

    Text(String text) {
        super(TextTag.NONE.beg, TextTag.NONE.end);
        this.tag = tag;
        this.text = text;
    }

    @Override
    public String contentsAsString() {
        return this.text;
    }
}
