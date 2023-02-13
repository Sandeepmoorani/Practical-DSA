import java.util.Scanner;
// in this file i make ContactApp 

class ContacApp {
    static String[][] contacts = new String[200][2];
    static int count = 0;

    public static void add_Contact(String name, long number) {
        contacts[count][0] = name;
        contacts[count][1] = String.valueOf(number);
        count++;
    }

    public static boolean search_contact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name to Search ");
        String nam = sc.nextLine();
        String name = nam.trim();
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i][0] == null || contacts[i][1] == null)
                continue;
            if (contacts[i][0].equalsIgnoreCase(name)) {
                System.out.println("Your searched contact is  [ " + contacts[i][0] + "  " + contacts[i][1] + " ]");
                return true;
            }

        }
        return false;

    }

    public static void update_contact() {
        boolean find = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name for update  ");
        String name = sc.nextLine().trim();

        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i][0] == null || contacts[i][1] == null)
                continue;

            else if (contacts[i][0].equalsIgnoreCase(name)) {
                System.out.print("Enter new Name : ");
                String newName = sc.nextLine();
                System.out.print("Enter new number : 92-");
                String newNumber = sc.nextLine();
                contacts[i][0] = newName;
                contacts[i][1] = String.valueOf(newNumber);
                find = true;
                break;
            }

        }

        if (find == false) {
            System.out.println("This contact is not exist");

        }
    }

    // not done
    public static void delete_contact() {
        int size = contacts.length;
        boolean deleted = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name to delete ");
        String name = sc.nextLine().trim();
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i][0] == null || contacts[i][1] == null)
                continue;

            if (contacts[i][0].equalsIgnoreCase(name)) {
                for (int j = i; j < contacts.length - 1; j++) {
                    contacts[j][0] = contacts[j + 1][0];
                    contacts[j][0] = contacts[j + 1][0];
                }
                contacts[size - 1][0] = null;
                contacts[size - 1][1] = null;
                deleted = true;

            }

        }

        if (deleted != true)
            System.out.println("Sorry contact doesn't exist");
        else if (deleted == true)
            System.out.println("your contact deleted succesfully");
    }

    public static void display_contact() {
        for (int i = 0; i < contacts.length; i++) {

            if (contacts[i][0] == null || contacts[i][1] == null)
                continue;
            System.out.println(contacts[i][0] + "   " + contacts[i][1]);

        }
    }

}

public class Lab2{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char c;

        ContacApp.add_Contact("kelash", 3873488);
        ContacApp.add_Contact("sandeep", 2342323);
        ContacApp.add_Contact("Haresh", 234343342);
        do {

            System.out.println("WELCOME TO MY CONTACT APP ");
            System.out.println("1-Add contact");
            System.out.println("2-Search contact");
            System.out.println("3-Update contact");
            System.out.println("4-Delete contact");
            System.out.println("5-Show all contact");
            System.out.println("Enter your choice ");
            int choice = sc.nextInt();
            // ContacApp.add_Contact("kelash", 234324);

            switch (choice) {
                case 1: {
                    Scanner scan = new Scanner(System.in);
                    System.out.print("Enter Name of contact holder : ");
                    String name = scan.nextLine();
                    System.out.print("Enter Number of contact holder:  92- ");
                    int number = scan.nextInt();
                    ContacApp.add_Contact(name, number);
                    break;
                }
                case 2: {
                    ContacApp.search_contact();
                    break;
                }
                case 3: {
                    ContacApp.update_contact();
                    break;
                }
                case 4: {
                    ContacApp.delete_contact();
                    break;
                }
                case 5: {
                    ContacApp.display_contact();
                    ;
                    break;
                }
            }
            System.out.println("Do you want to continue Enter y");
            c = sc.next().charAt(0);
        } while (c == 'y' || c == 'Y');

    }
}
