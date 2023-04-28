class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public String getFirstName() {
        if (firstName == ""){
            return "";
        }
        return firstName;
    }

    public String getLastName() {
        if (lastName == ""){
            return "";
        }
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        if ((getFirstName() == null) && (getLastName() == null)){
            return "Unknown";
        } else if ((getFirstName() != null) && (getLastName() != null)){
            return getFirstName() + " " + getLastName();
        } else if (getLastName() == null){
            return getFirstName();
        } else if (getFirstName() == null){
            return getLastName();
        }
        else {
            return null;
        }
    }

    public static void main(String[] args) {
        User user = new User();
        user.setFirstName(null);
        user.setLastName("last");
        System.out.println(user.getFullName());
    }


}