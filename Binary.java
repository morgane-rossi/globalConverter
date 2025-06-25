import java.util.List;
import java.util.ArrayList;

class Binary extends Conversion {
    
    //A T T R I B U T E S

    //private
    private String userB;

    //C O N S T R U C T O R S
    Binary() {} //Empty constructor to aid development.

    Binary(String userB) {
        super(userB);
        this.userB = userB;
    }

    //G E T T E R S  /  S E T T E R S
    public String get_user() {
        return this.userB;
    }

    public void set_user(String newUserB) {
        this.userB = newUserB;
    }

    //F U N C T I O N S
    protected void convert() {
        List<Integer> ascii_list = get_ascii_list();
        System.out.println(ascii_list);

        String bin_string = "";

        for (int i = 0; i <= ascii_list.size()-1;i++) {
            int actual_ascii = ascii_list.get(i);
            
            while(actual_ascii > 0) {
                actual_ascii /= 2;
                if (actual_ascii % 2 == 0) {
                    bin_string += 0;
                }
                else {
                    bin_string += 1;
                }
                
            }
            bin_string += " , ";
        }
        System.out.println(bin_string);
        System.out.println("");
    }
    
    public static void main(String[]args) {
        Binary bina = new Binary("Salus");
        System.out.println(bina.get_user());
        bina.convert();
    }
}