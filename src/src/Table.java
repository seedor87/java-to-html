import java.util.ArrayList;

public class Table extends Tag {

    private java.util.List<TableRow> rows;

    Table() {
        super("<table>", "</table>");
        rows = new ArrayList<TableRow>();
    }

    public void append(TableRow row) {
        rows.add(row);
    }

    @Override
    public String contentsAsString() {
        StringBuilder sb = new StringBuilder();
        for (TableRow row : rows) {
            sb.append(row);
        }
        return sb.toString();
    }
}
