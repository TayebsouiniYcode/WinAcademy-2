import java.rmi.server.ExportException;
import java.util.Scanner;

public class AdminServices {
    Application app = new Application();

    public void manageSchool() {
        int choix = 0 ;
        do {
            System.out.println("1. Create school");
            System.out.println("2. Show all school");
            System.out.println("3. Shearch school");
            System.out.println("4. Delete school");
            System.out.println("99. Cancel");
            System.out.print("Enter a number : ");

            choix = Integer.parseInt(Application.scan());

            switch (choix) {
                case 1:
                    addSchool();
                    break;
                case 2:
                    showAllSchool();
                    break;
                case 3:
                    getSchool();
                    break;
                case 4:
                    deleteSchool();
                    break;
                default:
                    Application.show("");
            }
        } while (choix != 99);
    }

    /**
     * School traitement
     * ######################################### School ################################################
     */
    public void addSchool() {
        Application.show("Enter school Number: ");
        int numero = Integer.parseInt(Application.scan());

        Application.show("Enter school name: ");
        String name = Application.scan();

        Application.show("Enter school site: ");
        String site = Application.scan();

        app.addSchool(numero, name, site);
    }

    public void deleteSchool()
    {
        showAllSchool();
        Application.show("Enter school number: ");
        int schoolNumber = Integer.parseInt(Application.scan());
        app.deleteSchool(schoolNumber);
    }

    public void showAllSchool()
    {
        //Application.show(Application.schools.toString());
        Application.schools.forEach((key, value) -> System.out.println("Number: " + key + " " + value));
    }

    public void getSchool(){
        String value  = Application.scan();
        School school = new School();

        for (Integer key : Application.schools.keySet()) {
            school = Application.schools.get(key);
            try{
                if (school.getName().equals(value) || school.getSite().equals(value) || school.getNumero() == Integer.parseInt(value) ){
                    Application.show(Application.schools.get(key).toString());
                } else {
                    Application.show("not found");
                }
            } catch (Exception ex) {
                Application.show("Error: " + ex.toString());
            }

        }
    }


    // Departement
    public void manageDepartement()
    {
        int choix = 0 ;
        do {
            System.out.println("1. Create Departement");
            System.out.println("2. Show all Departement");
            System.out.println("3. Shearch school");
            System.out.println("4. Delete school");
            System.out.println("99. Cancel");
            System.out.print("Enter a number : ");

            choix = Integer.parseInt(Application.scan());

            switch (choix) {
                case 1:
                    addSchool();
                    break;
                case 2:
                    showAllSchool();
                    break;
                case 3:
                    getSchool();
                    break;
            }
        } while (choix != 99);
    }
}
