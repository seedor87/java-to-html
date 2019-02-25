import java.util.ArrayList;

public abstract class TableRow extends Tag {

    protected java.util.List<TableCell> cells;

    TableRow(String beg, String end) {
        super(beg, end);
        this.cells = new ArrayList<TableCell>();
    }

    TableRow() {
        super("<tr>", "</tr>");
        this.cells = new ArrayList<TableCell>();
    }

    public void append(TableCell cell) {
        cells.add(cell);
    }

    @Override
    public String contentsAsString() {
        StringBuilder sb = new StringBuilder();
        for (TableCell cell : cells) {
            sb.append(cell);
        }
        return sb.toString();
    }
}
