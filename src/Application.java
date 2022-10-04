import java.util.HashMap;
import java.util.Scanner;

public class Application {
    private static HashMap<Integer, Matiere> matieres = new HashMap <> (  );
    private static HashMap<Integer, Student> students = new HashMap <> (  );

    public static void setStudent(Student student){
        Application.students.put ( student.getId (), student );
    }

    public static Student getStudent(int id){
        return Application.students.get ( id );
    }

    public static HashMap<Integer, Student> getStudents(){
        Application app = new Application ();
        return app.students;
    }

    public static void setMatiere(Matiere matiere){
        Application.matieres.put ( matiere.getId(), matiere );
    }

    public static Matiere getMatiere(int id){
        return Application.matieres.get ( id );
    }

    public static HashMap<Integer, Matiere> getMatieres(){
        return Application.matieres;
    }


    public static User getUser ( ) {
        Application app = new Application ();
        return app.user;
    }

    public static void setUser ( User user ) {
        Application.user = user;
    }

    private static User user = new User (  );

    static HashMap < Integer, School > schools = new HashMap < Integer, School > ( );
    public static HashMap<Integer, School> getSchools(){
        return Application.schools;
    }

    private static HashMap<Integer, User> users = new HashMap <> (  );
    public static HashMap < Integer, User > getUsers ( ) {
        return users;
    }
    public static void setUsers ( int id, User user ) {
        Application.users.put ( id, user );
    }


    public static void show ( String str ) {
        System.out.println ( str );
    }

    public static String scan ( ) {
        Scanner sc = new Scanner ( System.in );
        return sc.nextLine ( );
    }





    public void addDepartement ( int id , String name , String description , int schoolNumber ) {
        Departement departement = new Departement ( id , name , description );
        Application.schools.get ( schoolNumber ).setDepartement ( id , departement );
        System.out.println ( "Success" );
    }

    public static void fakeData()
    {
        //fake data
        Application.schools.put(1, new School(1, "Youcode Youssoufia", "youcode.ma"));
        Application.schools.put(2, new School(2, "Youcode Safi", "youcode.ma"));
        Application.schools.put(3, new School(3, "Youcode Marrakech", "youcode.ma"));
        Application.schools.put(4, new School(4, "Youcode Meknes", "youcode.ma"));

        // departement
        Application.schools.get ( 1 ).setDepartement ( 1, new Departement ( 1, "Informatique", "Departement d'informatique" ) );
        Application.schools.get ( 1 ).setDepartement ( 2, new Departement ( 2, "Math", "Departement de math" ) );
        Application.schools.get ( 1 ).setDepartement ( 3, new Departement ( 3, "Arabe", "Departement d'arabe" ) );
        Application.schools.get ( 2 ).setDepartement ( 1, new Departement ( 4, "Informatique", "Departement d'informatique" ) );
        Application.schools.get ( 2 ).setDepartement ( 2, new Departement ( 5, "Math", "Departement Math" ) );

        // teacher
        Application.schools.get ( 1 ).getDepartement ( 1 ).setTeacher ( new Teacher ( "22/12/2020", 1,  "Tayeb", "SOUINI", "tayeb@gmail.com", "123", "0607189671", true) );
        Application.schools.get ( 1 ).getDepartement ( 1 ).setTeacher ( new Teacher ( "22/12/2020", 2,  "Mourad", "esserakh", "mourad@gmail.com", "123", "0607189671", true) );
        Application.schools.get ( 1 ).getDepartement ( 1 ).setTeacher ( new Teacher ( "22/12/2022", 3,  "Fouad", "Rawan", "fouad@gmail.com", "123", "0607189671", true) );
        Application.schools.get ( 1 ).getDepartement ( 2 ).setTeacher ( new Teacher ( "22/12/2023", 4,  "Ahmed", "Edir", "Ahmed@gmail.com", "123", "0607189671", true) );

        /*
        Application.users.put ( 1, new User ( 1, "Tayeb",
                "Souini", "tayeb@gmail.com",
                "123", "0607189671", true ) );
        Application.users.put ( 2, new User ( 1, "mourad",
                "esserakh", "mourad@gmail.com",
                "123", "0607189671", true ) );
        Application.users.put ( 3, new User ( 1, "fouad",
                "raouan", "fouad@gmail.com",
                "123", "0607189671", true ) );

         */
    }

    // School Methods -------------------------------------------------------------------------------------
    public void addSchool ( int numero , String name , String site , String city , String country , String postal_code , String address ) {
        Address address1 = new Address (numero, city , country , postal_code , address );
        School school = new School ( numero , name , site , address1 );
        Application.schools.put ( school.getNumero ( ) , school );
        System.out.println ( "Success" );
    }

    public void deleteSchool ( int number ) {
        this.schools.remove ( number );
        Application.show ( "Success" );
    }
    // ----------------------------------------------------------------------------------------------------
}
