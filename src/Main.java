import java.awt.*;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Application.fakeData();
        //Application.testCreateAddress();
        //Authentication.login();

        if (Application.getUser ().getStatus ()){
            AdminServices adminServices = new AdminServices();
            int choix = 0;

            do {
                Application.show("\t\t\tWelcome");
                Application.show("\t\t1. Manage school");
                Application.show("\t\t2. Manage departement");
                Application.show("\t\t3. Manage teacher");
                System.out.println ("\t\t4. Manage note" );
                System.out.println ("\t\t5. Account" );
                System.out.println ("98. Deconnecter" );

                System.out.println("Enter a number : ");
                Scanner sc = new Scanner(System.in);
                choix = sc.nextInt();

                switch (choix) {
                    case 1 :
                        adminServices.manageSchool();
                        break;
                    case 2:
                        adminServices.manageDepartement();
                        break;
                    case 3:
                        adminServices.manageTeacher();
                        break;
                    case 5:
                        adminServices.showAccount();
                        break;
                    case 98:
                        Authentication.login();
                        break;

                }
            } while (choix != 00);

            Application.show("Good luck!!");
            System.exit(0);
        }
    }

}