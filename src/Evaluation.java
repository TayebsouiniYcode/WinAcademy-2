public class Evaluation {
    int id_etudiant;
    int id_matiere;
    String date;
    double note;

    public Evaluation(int id_etudiant, int id_matiere, String date, double note)
    {
        this.id_etudiant = id_etudiant;
        this.id_matiere = id_matiere;
        this.date = date;
        this.note = note;
    }
}
