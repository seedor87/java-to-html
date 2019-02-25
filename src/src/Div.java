public class Div extends Tag {

    Div() {
        super("<div>", "</div>");
    }

    public void add(Tag contents) {
        this.contents = contents;
    }

    @Override
    public String contentsAsString() {
        return this.contents.toString();
    }
}
