public class Menu {
    public static void teacher(){
        AdminServices adminServices = new AdminServices ();
        Menu menu = new Menu ();
        int choix = 0;

        do{
            System.out.println ("\t\t\t\t Teacher Management !! By " + "Username");
            System.out.println ("\t\t\t\t 1. Create Teacher" );
            System.out.println ("\t\t\t\t 2. Show Teachers" );
            System.out.println ("\t\t\t\t 3. Search Teaches" );
            System.out.println ("\t\t\t\t 4. Update Teacher" );
            System.out.println ("\t\t\t\t 5. Delete Teacher" );
            System.out.println ("\t\t\t\t 99 Cancel" );

            switch (choix){
                case 1:
                    adminServices.createTeacher (  );
                    break;
                case 2:
                    //adminServices.showAllTeachers();
                    break;
                case 3:
                    //menu.subMenuSearchTeacher();
                    break;
            }
        } while(choix != 99);
    }
}
