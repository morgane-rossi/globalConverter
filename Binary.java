class Binary extends Conversion {
    
    private String userB;

    Binary() {
        
    }

    Binary(String userB) {
        super(userB);
        this.userB = userB;
    }

    public String get_user() {
        return this.userB;
    }

    public void set_user(String newUserB) {
        this.userB = newUserB;
    }

    public void convert() {
    }

}

class Main {
    public static void main(String[]args) {
    }
}