public class HTMLDocument {

   private String start = "<!DOCTYPE html><html> <head> <title>%s</title></head><body>";
   private String end = "</body></html>";
   private StringBuilder body = new StringBuilder();

   HTMLDocument(String title) {
       this.start = String.format(this.start, title);
   }

   public void append(Tag tag) {
       body.append(tag);
   }

   @Override
    public String toString() {
       return this.start + this.body + this.end;
   }
}
