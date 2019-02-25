public class TableCell extends Tag {

    private Tag contents;
    TableCell(boolean isHeader, Tag contents) {
        super(isHeader ? "<th>" : "<td>", isHeader ? "</th>" : "</td>");
        this.contents = contents;
    }

    TableCell(Tag contents) {
        super("<td>", "</td>");
        this.contents = contents;
    }

    @Override
    public String contentsAsString() {
        return contents.toString();
    }
}
