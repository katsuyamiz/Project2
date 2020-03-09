package MiniProject2;

public class Driver {



    public static void main(String[] args) {


InputCollector icr = new InputCollector();
Contact cnt = new Contact();

        //String usernameInput = InputCollector.getUserInput("Enter your username");


        System.out.print("+===  Contact  App  ===+\n" +
                         "| 1. List all Contacts |\n" +
                         "| 2. Add new Contact   |\n" +
                         "| 3. Remove Contact    |\n" +
                         "| 4. Update Contact    |\n" +
                         "| 5. Quit              |\n" +
                         "+======================+\n"

        );
        icr.userOption("1");
        icr.userOption("2");
        icr.userOption("3");
        icr.userOption("4");
        icr.userOption("5");

        //System.out.println("\n" + usernameInput);




    }
}
