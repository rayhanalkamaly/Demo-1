import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("===== Library System =====");
        System.out.println("1. Login as Student");
        System.out.println("2. Login as Admin");
        System.out.println("3. Exit");
        System.out.print("Choose option (1-3): ");

        int pilUser = userInput.nextInt();

        switch (pilUser) {
            case 1:
                Scanner nim = new Scanner(System.in);
                System.out.print("Enter your NIM: ");
                String NIM = nim.nextLine();
                if (NIM.length() == 15) {
                    System.out.print("Successfull Login as Student");
                } else {
                    System.out.print("User Not Found");
                }
                break;
            case 2:
                Scanner username = new Scanner(System.in);
                Scanner password = new Scanner(System.in);
                System.out.println("Enter your username: ");
                String UserName = username.nextLine();
                System.out.println("Enter your password: ");
                String Password = password.nextLine();

                if(UserName.equals("admin") && Password.equals("admin")){
                    System.out.println("Successfull Login as Admin");
                } else {
                    System.out.println("Admin User not found!");
                }
                break;
            case 3:
                System.out.println("adios");
                break;

        }
    }
}