import java.time.LocalDate;

public class Responsable {
    int id;
    int id_departement;
    int id_enseignant;
    String date_debut;
    String date_fin;

    public Responsable(int id, int id_departement, int id_enseignant,String date_debut, String date_fin )
    {
        this.id = id;
        this.id_departement = id_departement;
        this.id_enseignant = id_enseignant;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
    }
}
