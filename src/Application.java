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
        Application.schools.put(1, new School(1, "Youcode", "youcode.ma"));
        Application.schools.get ( 1 ).setAddress ( new Address ( 1, "Youssoufia", "Morocco", "46300", "Rue Mohammed V" ) );
        Application.schools.put(2, new School(2, "1337", "1337.ma"));
        Application.schools.get ( 1 ).setAddress ( new Address ( 2, "Kheribga", "Morocco", "4000", "Rue Tit Melil" ) );

        // departement
        Application.schools.get ( 1 ).setDepartement ( 1, new Departement ( 1, "Youssoufia", "Departement de L'Youssoufia" ) );
        Application.schools.get ( 1 ).setDepartement ( 2, new Departement ( 2, "Safi", "Departement de Safi" ) );

        Application.schools.get ( 2 ).setDepartement ( 1, new Departement ( 1, "Kheribga", "Departement de kheribga" ) );
        Application.schools.get ( 2 ).setDepartement ( 2, new Departement ( 2, "Benguerir", "Departement de benguerir" ) );

        // teacher
        Application.schools.get ( 1 ).getDepartement ( 1 ).setTeacher ( new Teacher ( "01/09/2018", 1,  "Youssef", "ouadid", "youssef@gmail.com", "123", "0609909993", true) );
        Application.schools.get ( 1 ).getDepartement ( 1 ).setTeacher ( new Teacher ( "01/09/2018", 2,  "Ahmed", "Rafya", "ahmed@gmail.com", "123", "4325342543", true) );
        Application.schools.get ( 1 ).getDepartement ( 1 ).setTeacher ( new Teacher ( "01/09/2018", 3,  "Bouchra", "Merzak", "bouchra@gmail.com", "123", "0743214321", true) );
        Application.schools.get ( 1 ).getDepartement ( 1 ).setTeacher ( new Teacher ( "01/09/2018", 4,  "Abdelhafid", "Edir", "abdelhafid@gmail.com", "123", "07423432423", true) );

        Application.schools.get ( 1 ).getDepartement ( 2 ).setTeacher ( new Teacher ( "01/09/2019", 1,  "Yassine", "Bahil", "yassine@gmail.com", "123", "0942343", true) );
        Application.schools.get ( 1 ).getDepartement ( 2 ).setTeacher ( new Teacher ( "01/09/20189", 2,  "Ilyas", "Raouf", "ilyas@gmail.com", "123", "06734843843", true) );




        Application.setStudent (
                new Student ( 1, "01/09/2020", 1,
                        "Tayeb", "SOUINI", "tayeb@gmail.com",
                        "123", "0607189671", true ) );
        Application.setStudent (
                new Student ( 2, "01/09/2020", 2,
                        "abdelaziz", "afrakla", "abdelaziz@gmail.com",
                        "123", "0607189671", true ) );
        Application.setStudent (
                new Student ( 3, "01/09/2020", 3,
                        "aymen", "darji", "aymen@gmail.com",
                        "123", "0607189671", true ) );
        Application.setStudent (
                new Student ( 4, "01/09/2020", 4,
                        "abdeslam", "el boukri", "abdesalam@gmail.com",
                        "123", "0607189671", true ) );

        Application.setMatiere (
                new Matiere ( 1, "Informatique", "description matiere informatique" )
        );
        Application.setMatiere (
                new Matiere ( 2, "Math", "description matiere Math" )
        );
        Application.setMatiere (
                new Matiere ( 3, "Java", "description matiere Java" )
        );

        Application.schools.get ( 1 ).getDepartement ( 1 ).getTecher ( 1 ).setId_matiere ( 1 );
        Application.schools.get ( 1 ).getDepartement ( 1 ).getTecher ( 2 ).setId_matiere ( 1 );
        Application.schools.get ( 1 ).getDepartement ( 1 ).getTecher ( 3 ).setId_matiere ( 2 );
        Application.schools.get ( 1 ).getDepartement ( 1 ).getTecher ( 4 ).setId_matiere ( 3 );


        Application.getStudent ( 1 ).setEvaluation (
                new Evaluation ( 1, "22/12/2022" , 17.20 )
        );
        Application.getStudent ( 1 ).setEvaluation (
                new Evaluation ( 1, "21/01/2023" , 13.00 )
        );
        Application.getStudent ( 1 ).setEvaluation (
                new Evaluation ( 2, "22/12/2022" , 20.00 )
        );
        Application.getStudent ( 1 ).setEvaluation (
                new Evaluation ( 3, "22/12/2022" , 10.00 )
        );

        Application.getStudent ( 2 ).setEvaluation (
                new Evaluation ( 1, "22/12/2022" , 15.00 )
        );
        Application.getStudent ( 2 ).setEvaluation (
                new Evaluation ( 1, "22/12/2022" , 10.56 )
        );
        Application.getStudent ( 2 ).setEvaluation (
                new Evaluation ( 2, "22/12/2022" , 20.00 )
        );

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
