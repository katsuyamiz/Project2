package MiniProject2;

import javax.swing.*;
import java.beans.beancontext.BeanContextServiceRevokedEvent;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class InputCollector {



    ContactList list = new ContactList();
    Scanner in = new Scanner(System.in);


    public static boolean isInt(String prompt){
        if(prompt.isEmpty()) return false;
        try {
            double d = Double.parseDouble((prompt));
        }
        catch (NumberFormatException nfe){
            return false;
        }

        return isInt(prompt);
    }



    public void userOption(String option){
        while (true) {
                System.out.print("\nEnter your option: ");
                option = in.nextLine();


                if (Objects.equals(option, "1") || Objects.equals(option, "2") || Objects.equals(option, "3") || Objects.equals(option, "4") || Objects.equals(option, "5")) {

                    switch (option) {
                        case "1":
                            list.displayContact();

                            break;

                        case "2":
                            list.addContact(list.newContact);
                            break;

                        case "3":
                            list.removeContact();
                            break;

                        case "4":
                            list.updateContact();
                            break;

                        case "5":
                            System.out.println("Bye");
                            System.exit(0);

                    }
                }else{
                    System.out.println("Invalid Input. Enter number between 1 and 5.");
                }

            }
            }



    public static String getUserInput(String prompt){

        return prompt;
    }
}
