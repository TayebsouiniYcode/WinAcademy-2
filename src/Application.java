import java.util.HashMap;
import java.util.Scanner;

public class Application {

    public static User getUser ( ) {
        Application app = new Application ();
        return app.user;
    }

    public static void setUser ( User user ) {
        Application.user = user;
    }

    private static User user = new User (  );

    static HashMap < Integer, School > schools = new HashMap < Integer, School > ( );

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

    public void addSchool ( int numero , String name , String site ) {
        School school = new School ( numero , name , site );
        this.schools.put ( numero , school );
        show ( "Success" );
    }

    public void addSchool ( int numero , String name , String site , String city , String country , String postal_code , String address ) {
        Address address1 = new Address ( city , country , postal_code , address );
        School school = new School ( numero , name , site , address1 );
        Application.schools.put ( school.getNumero ( ) , school );
        System.out.println ( "Success" );
    }

    public void deleteSchool ( int number ) {
        this.schools.remove ( number );
        Application.show ( "Success" );
    }

    public void addDepartement ( int id , String name , String description , int schoolNumber ) {
        Departement departement = new Departement ( id , name , description );
        Application.schools.get ( schoolNumber ).setDepartements ( id , departement );
        System.out.println ( "Success" );
    }

    public static void fakeData()
    {
        //fake data
        Application.schools.put(1, new School(1, "Youcode Youssoufia", "youcode.ma"));
        Application.schools.put(2, new School(2, "Youcode Safi", "youcode.ma"));
        Application.schools.put(3, new School(3, "Youcode Marrakech", "youcode.ma"));
        Application.schools.put(4, new School(4, "Youcode Meknes", "youcode.ma"));

        Application.users.put ( 1, new User ( 1, "Tayeb",
                "Souini", "tayeb@gmail.com",
                "123", "0607189671", true ) );
    }

}
