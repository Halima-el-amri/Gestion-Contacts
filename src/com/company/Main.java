package com.company;

import Classes.Contact;
import Classes.ContactManger;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // Create an instance variable for the contact list
    private ArrayList<Contact> contactList = new ArrayList<>();
    private static ContactManger contactManger;
    // Create a scanner as a class variable to avoid resource leak warning
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main(); // Create an instance of the Main class
         contactManger = new ContactManger();
        manage:
        while (true){
            System.out.println(" Option chose for adding 1 | for updating contact 2 |for display list 3 |to delete 4 | to search 5 |  to exit 6 ");
            int option = input.nextInt();
            Contact contact;
            switch(option){
                case 1 :
                     contact = collectContactInformation();
                    contactManger.CreateContact(contact);
                    break;
                case 2 :
                    System.out.println("Type email");
                    String email = input.next();
                     contact = collectContactInformation();
                    Contact contact1 = contactManger.UpdateContact(contact,email);
                    if(contact1 == null){
                        System.out.println("No contact found with this email");
                    }
                    break;
                case 3 :
                    contactManger.DisplayContacts();
                    break;
                case 4:
                    System.out.println("Type email");
                    String emailD = input.next();
                    contactManger.delete(emailD);
                    break;
                case 5 :
                    System.out.println("Type name");
                    String name = input.next();
                    ArrayList<Contact> list = contactManger.Rechercher(name);
                    if (list.isEmpty()){
                        System.out.println("There is no contact");
                    }else{
                        list.forEach(c -> System.out.println(c.toString()));
                    }

                    break ;
                case 6:

                    break manage;

            }
        }

    }

    // Method to collect contact information
    public static  Contact collectContactInformation() {

        System.out.println("Please enter First Name: ");
        String firstName = input.next();
        System.out.println("Please enter Last Name: ");
        String lastName = input.next();
        System.out.println("Please enter Address: ");
        String address = input.next();
        System.out.println("Please enter Phone Number: ");
        String phoneNumber = input.next();
        System.out.println("Please enter Email Address: ");
        String emailAddress = input.next();

        // Create a new Contact object
        Contact newContact = new Contact(firstName, lastName, address, phoneNumber, emailAddress);
       return newContact;


    }
    }

