import java.util.HashMap;

public class Student extends User{
    private String date_entree;
    private HashMap<Integer, Evaluation> evaluations = new HashMap <> (  );

    public void setEvaluation(Evaluation evaluation) {
        int count = this.evaluations.size () +1;
        this.evaluations.put ( count , evaluation );
    }

    public HashMap<Integer, Evaluation> getEvaluations(){
        return this.evaluations;
    }

    public void setDate_entree ( String date_entree ) {
        this.date_entree = date_entree;
    }

    public String getDate_entree ( ) {
        return date_entree;
    }

    public Student(){};
    public Student(int id, String date_entree, int id_user, String firstname, String lastname, String email, String password, String phone, Boolean status)
    {
        super(id_user, firstname, lastname, email, password, phone, status);
        this.id = id;
        this.date_entree = date_entree;
    }
}
