import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String args[]) {

        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("./test.html"));

            HTMLDocument doc = new HTMLDocument("testing");
            Div div = new Div();
            List ul = new List(List.ListTag.UL);
            for (int i = 0; i < 5; i++) {
                ul.append(new Text(Text.TextTag.P, "i: " + i));
            }
            div.add(ul);
            doc.append(div);

            div = new Div();
            boolean isHeader = true;
            Table table = new Table();
            TableRow row;
            row = new TableHead();
            TableCell cell;
            for (int i = 0; i < 4; i++) {
                cell = new TableCell(false, new Text("0 " + i));
                row.append(cell);
            }
            table.append(row);
            for (int j = 1; j < 3; j++) {
                row = new TableBody();
                for (int i = 0; i < 4; i++) {
                    cell = new TableCell(false, new Text(j + " " + i));
                    row.append(cell);
                }
                table.append(row);
            }
            row = new TableFoot();
            for (int i = 0; i < 4; i++) {
                cell = new TableCell(false, new Text("3 " + i));
                row.append(cell);
            }
            table.append(row);

            div.add(table);
            doc.append(div);

            writer.write(doc.toString());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.flush();
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
                System.exit(1);
            }
        }
    }
}
