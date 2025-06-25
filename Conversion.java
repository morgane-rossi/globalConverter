import java.util.List;
import java.util.ArrayList;

abstract class Conversion {
    protected String user;//the string user typed
    
    Conversion() {}

    Conversion(String user) {
        this.user = user;
    }

    protected String convert_ascii() {
        //Return the conversion of the String to Ascii.
        String ascii_s = "";
        for (int i=0; i < this.user.length();i++) {
            int ascillage;
            ascillage = (int) this.user.charAt(i);
            ascii_s += ascillage;  
            ascii_s += " ";
        }
        this.user = ascii_s;
        return this.user;
    }

    protected List<Integer> get_ascii_list() {
        
        List<Integer> ascii_s = new ArrayList<>();
        
        for (int i=0; i < this.user.length();i++) {
            int ascillage;
            ascillage = (int) this.user.charAt(i);
            ascii_s.add(ascillage);
        }
   
        return ascii_s;
    }

    abstract protected void convert();

}