package Classes;

public class Contact {
    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private String phone;
    private String email;


//    public Contact(int id,String firstName,String lastName,String address,String email,String phone){
//        this.id=id;
//        this.firstName=firstName;
//        this.lastName=lastName;
//        this.address=address;
//        this.phone=phone;
//        this.email=email;
//
//    }

    public Contact(String firstName, String lastName, String address, String phoneNumber, String emailAddress) {
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.phone=phoneNumber;
        this.email=emailAddress;
    }

    public String getfirstName() {
        return this.firstName;
    }

    public String setfirstName(){
        return (this.firstName = firstName);
    }

    public String getlastName() {
        return this.lastName;
    }

    public String setlastName(){
        return (this.lastName = lastName);
    }

    public String getAddress() {
        return this.address;
    }

    public String setAddress(){
        return (this.address = address);
    }

    public String getEmail() {
        return this.email;
    }

    public String setEmail(){
        return (this.email = email);
    }

    public String getPhone() {
        return this.phone;
    }

    public String setPhone(){
        return (this.phone = phone);
    }
    void displayContact(){
        System.out.println("Contact ID:"  + " First Name:" + firstName + " Last Name:" + lastName);
        System.out.println("Address:" + address);
        System.out.println("Phone Number:" + phone);
        System.out.println("Email Address:" + email);
    }
//
//    public void viewContacts() {
//        System.out.println(this.firstName());
//        System.out.println(this.lastName());
//        System.out.println(this.address());
//        System.out.println(this.email());
//        System.out.println(this.phone());
//
//    }


    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
