import java.awt.*;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Application.fakeData();
        Authentication.login();

        if (Application.getUser ().getStatus ()){
            AdminServices adminServices = new AdminServices();
            int choix = 0;

            do {
                Application.show("\t\t\tWelcome");
                Application.show("\t\t1. Manage school");
                Application.show("\t\t2. Manage departement");
                Application.show("\t\t3. Manage teacher");

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

                }
            } while (choix != 00);

            Application.show("Good luck!!");
            System.exit(0);
        }
        //School school1 = new School(1, "Moussa ibno noussair", "moussa.ma");
        //school1.addAddress(1, "Youssoufia", "Maroc", "46300", "numero 1 rue sebtah Qu El mohammadi");

        //school1.addDepartement(1, "Informatique", "département d'informatique");
        //school1.addDepartement(2, "Math", "département du Mats");

        //Teacher teacher1 = new Teacher("01/01/2022", 1, "Aymen", "Benhima", "aymen@gmail.com", "123", "060504453", true);

        //Teacher teacher2 = new Teacher("01/01/2022", 2, "Youssef", "Ouadid", "youssef@gmail.com", "123", "060504353", true);
        //Teacher teacher3 = new Teacher("01/01/2022", 3, "Bouchra", "Merzak", "bouchra@gmail.com", "123", "060504853", true);
        //Teacher teacher4 = new Teacher("01/01/2023", 4, "Ahmed", "Rafya", "ahmed@gmail.com", "123", "060504753", false);
        //Teacher teacher5 = new Teacher("01/01/2023", 5, "Abdelhafid", "Deyan", "abdelhafid@gmail.com", "123", "060534453", false);

        //System.out.println(teacher1.toString() + "\n\n\n");
        //System.out.println(school1.toString());
    }

}