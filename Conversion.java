import java.util.List;
import java.util.ArrayList;

abstract class Conversion {
    
    //A T T R I B U T E S
    protected String user; //the string typed by user
    
    //C O N S T R U C T O R S
    Conversion() {} //Empty constructor to aid development

    Conversion(String user) {
        this.user = user;
    }

    //F U N C T I O N S
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
        //Returns a list of each caracters converted in ASCII.
        List<Integer> ascii_s = new ArrayList<>();
        
        for (int i=0; i < this.user.length();i++) {
            int ascillage;
            ascillage = (int) this.user.charAt(i);
            ascii_s.add(ascillage);
        }
   
        return ascii_s;
    }


    //A B S T R A C T  M E T H O D S
    abstract protected void convert();
}