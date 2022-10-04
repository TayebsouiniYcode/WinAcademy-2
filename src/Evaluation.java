public class Evaluation {
    private int id_matiere;

    public void setId_matiere ( int id_matiere ) {
        this.id_matiere = id_matiere;
    }

    public void setDate ( String date ) {
        this.date = date;
    }

    public void setNote ( double note ) {
        this.note = note;
    }

    public int getId_matiere ( ) {
        return id_matiere;
    }

    public String getDate ( ) {
        return date;
    }

    public double getNote ( ) {
        return note;
    }

    private String date;
    private double note;

    public Evaluation(){}
    public Evaluation(int id_matiere, String date, double note)
    {
        this.id_matiere = id_matiere;
        this.date = date;
        this.note = note;
    }
}
