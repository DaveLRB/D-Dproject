public class Quote {

    String text;
    String filename;

    public Quote(String filename, String text) {
        this.text = text;
        this.filename=filename;
    }
    public String getText() {
        return text;
    }

    public String getFilename() {
        return filename;
    }

}
