package Classes;
import java.util.ArrayList;
import java.util.List;


public class ContactManger {
    ArrayList<Contact> contactlist = new ArrayList<>();


    public void CreateContact(Contact c) {
        if (contactlist.contains(c)) {
            System.out.println("This contact is already in your contacts.");
        } else {
            // Add the new contact to the list
            contactlist.add(c);
            System.out.println("Contact added successfully!");
        }
    }

    public void DisplayContacts() {
        for (Contact c : contactlist) {
            System.out.println("les informations de votre Contact est " + " " + c.getfirstName() + "\t" + c.getlastName() + "\t" +
                    c.getAddress() + "\t" + c.getPhone() + "\t" + c.getEmail());
        }
    }

    public Contact UpdateContact(Contact c, String email) {
        for (int i = 0; i < contactlist.size(); i++) {
            if (email.equals(contactlist.get(i).getEmail())) {
                 return contactlist.set(i, c);

            }

        }
        return null;

    }


    public void delete(String email){
        for (Contact c : contactlist){
            if (c.getEmail().equals(email)){
                contactlist.remove(c);
                System.out.println(" has been deleted");
                return;
            }
        }
        System.out.println("not exist");

    }
    public ArrayList<Contact> Rechercher(String name)
    {
        ArrayList<Contact> list = new ArrayList<>();
        for (Contact c : contactlist){
            if (c.getfirstName().equals(name)){
                list.add(c);
            }
        }
        return list;

    }


}
