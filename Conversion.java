public class Conversion {
    String user; //the string user typed
    
    Conversion() {}

    Conversion(String user) {
        this.user = user;
    
    }

    public void convert_ascii() {
        String ascii_s = "";
        for (int i=0; i < this.user.length();i++) {
            int ascillage;
            ascillage = (int) this.user.charAt(i);
            System.out.println(ascillage);
            ascii_s += ascillage;  
            ascii_s += " ";
        }
        System.out.println(ascii_s);
    };
    
    public static void main(String[]args) {
        Conversion myInput = new Conversion();
        System.out.println(myInput);
        myInput.user = "Saluss";
        myInput.convert_ascii();
    }

}