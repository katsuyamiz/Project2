package MiniProject2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ContactList {

    Contact newContact = new Contact();

    ArrayList<Contact> contactBook = new ArrayList<>();
    Scanner in = new Scanner(System.in);

    public void displayContact() {

            if(contactBook.isEmpty()){
                System.out.println("No contact found");
            }else{
                for (Contact s : contactBook) {
                    System.out.println(s.toString());
                }
            }


    }


    public void addContact(Contact newContact) {
        while (true) {

            newContact = new Contact();
            System.out.println("Enter name:");
            String name = in.nextLine();
            if (!name.isEmpty()) {
                newContact.setName(name);
                break;
            } else {
                System.out.println("This field is required");

            }
        }

        System.out.println("Enter email:");
        String email = in.nextLine();


        while (true) {
            System.out.println("Enter mobile number:");
            String mobileNum = in.nextLine();
            if (!mobileNum.isEmpty()) {
                newContact.setMobileNum(mobileNum);
                break;
            } else {
                System.out.println("This field is required");
            }

        }

        System.out.println("Enter work number:");
        String workNum = in.nextLine();

        System.out.println("Enter home number:");
        String homeNum = in.nextLine();

        System.out.println("Enter city");
        String address = in.nextLine();

        int position = contactBook.size();


        newContact.setEmail(email);
        newContact.setWorkNum(workNum);
        newContact.setHomeNum(homeNum);
        newContact.setAddress(address);
        newContact.setIndex(position);


        contactBook.add(newContact);
        System.out.println("Successfully added a new contact!");
    }



    public void removeContact() {

        if (contactBook.isEmpty()) {
            System.out.println("No contact found");
        } else {
            displayContact();

            while (true) {
                System.out.println("Enter index of contact to remove");
                int index = in.nextInt();

                if (index < 0 || index > contactBook.size())
                    System.out.println("Enter a number between 0 and " + (contactBook.size() - 1));
                else {
                    contactBook.remove(index);
                    System.out.println("Successfully removed a contact!");
                    break;

                }
            }
        }
    }

    public void updateContact() {


        if(contactBook.isEmpty()){
            System.out.println("No contact found");
        }

            displayContact();
            System.out.println("Enter index of contact to update");
            int index = in.nextInt();

            while (true) {

                if (index < 0 || index > contactBook.size())
                    System.out.println("Enter a number between 0 and " + (contactBook.size() - 1));
                else {
                    break;
                }
            }

        System.out.println("Enter name:");
        String name = in.nextLine();
        while (true) {


            if (!name.isEmpty()) {
                newContact.setName(name);
                break;
            } else {
                System.out.println("This field is required");
               name = in.nextLine();

            }
        }

            System.out.println("Enter email:");
            String email = in.nextLine();


        System.out.println("Enter mobile number:");
       String mobileNum = in.nextLine();
            while (true) {

                if (!mobileNum.isEmpty()) {
                    newContact.setMobileNum(mobileNum);
                    break;
                } else {
                    System.out.println("This field is required");
                    mobileNum = in.nextLine();
                }

            }

            System.out.println("Enter work number:");
            String workNum = in.nextLine();

            System.out.println("Enter home number:");
            String homeNum = in.nextLine();

            System.out.println("Enter city");
            String address = in.nextLine();


            newContact.setEmail(email);
            newContact.setWorkNum(workNum);
            newContact.setHomeNum(homeNum);
            newContact.setAddress(address);


            contactBook.set(index, newContact);
            System.out.println("Successfully updated a contact!");


        }

        }
