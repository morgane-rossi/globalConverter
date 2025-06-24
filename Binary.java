public class Binary extends Conversion {
    private String user;

    Binary() {}

    Binary(String user) {
        super(user);
        this.user = user;
    }

    public void convert() {
        this.convert_ascii();
    }

}
