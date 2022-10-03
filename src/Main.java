import java.awt.*;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Application.fakeData();
        //Application.testCreateAddress();
        //Authentication.login();

        if (Application.getUser ().getStatus ()) {
            Menu.menuPrincipal();
        }
    }

}