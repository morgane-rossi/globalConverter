abstract class Conversion {
    protected String user; //the string user typed
    
    Conversion() {}

    Conversion(String user) {
        this.user = user;
    }

    protected void convert_ascii() {
        String ascii_s = "";
        for (int i=0; i < this.user.length();i++) {
            int ascillage;
            ascillage = (int) this.user.charAt(i);
            ascii_s += ascillage;  
            ascii_s += " ";
        }
        this.user = ascii_s;
    };

    abstract protected void convert();
}   