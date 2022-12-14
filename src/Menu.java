import java.util.Scanner;

public class Menu {
    public static void menuPrincipal(){
        AdminServices adminServices = new AdminServices();
        Menu menu = new Menu ();
        int choix;

        do {
            Application.show("\t\t\tWelcome");
            Application.show("\t\t1. Manage school");
            Application.show("\t\t2. Manage departement");
            Application.show("\t\t3. Manage teacher");
            Application.show ( "\t\t4. Manage Student" );
            System.out.println ("\t\t5. Manage Matieres" );
            System.out.println ("\t\t6. Manage Evaluation" );
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
                case 4:
                    menu.subMenuManageStudent();
                    break;
                case 5:
                    menu.subMenuManageMatieres();
                    break;
                case 6:
                    menu.subMenuMaganeEvaluation();
                    break;
                case 7:
                    adminServices.showAccount();
                    break;
                case 98:
                    Authentication.login();
                    break;

            }
        } while (choix != 99);

        Application.show("Good luck!!");
        System.exit(0);

    }

    public static void teacher(){
        AdminServices adminServices = new AdminServices ();
        Menu menu = new Menu ();
        int choix;

        do{
            System.out.println ("\t\t\t\t Teacher Management !! By " + "Username");
            System.out.println ("\t\t\t\t 1. Create Teacher" );
            System.out.println ("\t\t\t\t 2. Show Teachers" );
            //System.out.println ("\t\t\t\t 3. Search Teaches" );
            System.out.println ("\t\t\t\t 4. Update Teacher" );
            System.out.println ("\t\t\t\t 5. Delete Teacher" );
            System.out.println ("\t\t\t\t 6. Assigne Matiere to Teacher" );
            System.out.println ("\t\t\t\t 99 Cancel" );
            choix = Integer.parseInt ( Application.scan () );

            switch (choix){
                case 1:
                    adminServices.createTeacher (  );
                    break;
                case 2:
                    adminServices.showAllTeachers();
                    break;
                case 3:
                    //menu.subMenuSearchTeacher();
                    break;
                case 4:
                    adminServices.updateTeacher();
                case 5:
                    adminServices.deleteTeacher();
                case 6:
                    menu.subMenuAddMatiereToTeacher();
                    break;
            }
        } while(choix != 99);
    }

    public static void subMenuManageStudent()
    {
        AdminServices adminServices = new AdminServices ();
        int choix;

        do {
            System.out.println ("1. Create Student" );
            System.out.println ("2. Update Student" );
            System.out.println ("3. Delete Student" );
            System.out.println ("4. Show Students" );
            System.out.println ("5. Show All Evaluations" );
            System.out.println ("99. Cancel" );
            choix = Integer.parseInt ( Application.scan () );
            switch (choix){
                case 1:
                    adminServices.createStudent();
                    break;
                case 2:
                    adminServices.updateStudent();
                    break;
                case 3:
                    adminServices.deleteStudent();
                    break;
                case 4:
                    adminServices.getAllStudent();
                    break;
                case 5:
                    adminServices.getAllEvaluation();
                    break;
                default:
                    System.out.println ("Enter a valide number !!" );
            }
        } while (choix != 99);
    }

    public static void subMenuAddMatiereToTeacher() {
        Application.schools.forEach ( (key, value) -> {
            value.getDepartements ().forEach ( (depatementKey, departement) -> {
                System.out.println (departement.getTeachers ().toString () );
            });
        } );

        System.out.println ("Enter Teacher number: " );
        int teacherNumber = Integer.parseInt ( Application.scan () );

        System.out.println (Application.getMatieres ().toString () );
        System.out.println ("Enter Choise one matiere: " );
        int matiereNumber = Integer.parseInt ( Application.scan () );

        AdminServices adminServices = new AdminServices ();
        adminServices.assigneMatiereToTeacher(teacherNumber, matiereNumber);
    }

    public static int subMenuUpdateTeacher() {
        int choix;

        do {
            System.out.println ("1. firstname" );
            System.out.println ("2. lastname" );
            System.out.println ("3. email" );
            System.out.println ("4. phone" );
            System.out.println ("5. password" );
            System.out.println ("99. cancel " );
            System.out.println ("Enter number: " );
            choix = Integer.parseInt ( Application.scan () );

            switch (choix){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    return choix;
            }

        } while (choix != 99);

        return choix;
    }

    public static void subMenuManageMatieres(){
        AdminServices adminServices = new AdminServices ();
        int choix;

        do {
            System.out.println ("1. Create Matiere" );
            System.out.println ("2. Update Matiere" );
            System.out.println ("3. Delete MAtiere" );
            System.out.println ("4. Show All Matiere" );
            System.out.println ("5. Show Matiere by School" );
            System.out.println ("6. Show Matiere by Departement" );
            System.out.println ("99. Cancel" );
            choix = Integer.parseInt ( Application.scan () );

            switch (choix) {
                case 1:
                    adminServices.createMatiere();
                    break;
                case 2:
                    adminServices.updateMatiere ();
                    break;
                case 3:
                    adminServices.deleteMatiere();
                case 4:
                    adminServices.getAllMatiere();
                    break;
                case 5:
                case 6:
                    System.out.println ("Fonction coming soon" );
                    break;
                default:
                    System.out.println ("Enter a valide number: " );
            }
        } while (choix != 99);
    }

    public static void subMenuMaganeEvaluation(){
        AdminServices adminServices = new AdminServices ();
        int choix;

        do {
            System.out.println ("1. add Evaluation" );
            System.out.println ("99. Cancel" );
            choix = Integer.parseInt ( Application.scan () );

            switch (choix){
                case 1:
                    adminServices.addEvaluation();
                    break;
            }

        }while (choix != 99);
    }
}
