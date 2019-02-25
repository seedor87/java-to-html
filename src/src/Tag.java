public abstract class Tag {

    protected String beg;
    protected String end;
    Tag contents;

    Tag(String beg, String end) {
        this.beg = beg;
        this.end = end;

    }
    @Override
    public String toString() {
        return this.beg + this.contentsAsString() + this.end;
    }

    public abstract String contentsAsString();
}
