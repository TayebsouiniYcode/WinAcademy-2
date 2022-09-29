import java.util.HashMap;
import java.util.Scanner;

public class Application {

    static HashMap<Integer, School> schools = new HashMap<Integer, School>();

    public static void show(String str)
    {
        System.out.println(str);
    }

    public static String scan()
    {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public void addSchool(int numero, String name, String site)
    {
        School school = new School(numero, name, site);
        this.schools.put(numero, school);
        show("Success");
    }

    public void addSchool(int numero, String name, String site, String city, String country, String postal_code, String address)
    {
        Address address1 = new Address(city, country, postal_code, address);
        School school = new School(numero, name, site, address1);
        Application.schools.put(school.getNumero(), school);
        System.out.println("Success");
    }

    public void deleteSchool(int number)
    {
        this.schools.remove(number);
        Application.show("Success");
    }

}
