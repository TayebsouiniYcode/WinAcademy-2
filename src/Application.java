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
        return sc.next();
    }

    public void addSchool(int numero, String name, String site)
    {
        School school = new School(numero, name, site);
        this.schools.put(numero, school);
        show("Success");
    }

    public void deleteSchool(int number)
    {
        this.schools.remove(number);
        Application.show("Success");
    }
}
