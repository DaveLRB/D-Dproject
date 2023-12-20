public class Quote {

    String text;
    String filename;

    public Quote(String filename, String text) {
        this.filename=filename;
        this.text = text;
    }
    public String getText() {
        return text;
    }
    public String getFilename() {
        return filename;
    }

}
