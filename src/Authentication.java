import java.util.Scanner;

public class Authentication {
    private String email;
    private String password;

    // Getters and setters ------------------------------------------------------------------
    public String getEmail ( ) {
        return email;
    }

    public String getPassword ( ) {
        return password;
    }

    public void setEmail ( String email ) {
        this.email = email;
    }

    public void setPassword ( String password ) {
        this.password = password;
    }

    // Contructors ---------------------------------------------------------------------------
    public void Authentication(){}

    public void Authentication(String email, String password){
        this.email = email;
        this.password = password;
    }

    public static void login(){
        Scanner scan = new Scanner ( System.in );
        Authentication auth = new Authentication ();


        System.out.println ("Enter your email: " );
        auth.email = scan.next ();
        System.out.println ("Enter your password: " );
        auth.password = scan.next ();


        try{
            Application.getUsers ().forEach ( (key, value) -> {
                if(value.getEmail ().equals ( auth.email )) {
                    Application.getUser ().setEmail ( value.getEmail () );
                    Application.getUser ().setFirstname ( value.getFirstname () );
                    Application.getUser ().setLastname ( value.getLastname () );
                    Application.getUser ().setId ( value.getId () );
                    Application.getUser ().setPassword ( value.getPassword () );
                    Application.getUser ().setPhone ( value.getPhone () );
                    Application.getUser ().setStatus ( value.getStatus () );
                }
            } );
            if (Application.getUser ().getEmail ().equals (  auth.email ) && Application.getUser ().getPassword ().equals (  auth.password) && Application.getUser ().getStatus ()){
                System.out.println ("Welcome, " + Application.getUser ().getFirstname () + " " + Application.getUser ().getLastname () );
            } else {
                System.out.println ("Informations invalide !" );
                System.exit(0);
            }
        } catch ( Exception ex){
            System.out.println ("Invalide informations !!" );
            System.out.println ("Error: " + ex.toString () );
            System.exit ( 0 );
        }
    }
}
