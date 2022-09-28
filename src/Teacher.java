public class Teacher extends User{
    private String date_fonction;

    public Teacher(String date_fonction, int id_user, String firstname, String lastname, String email, String password, String phone, Boolean status)
    {
        super(id_user, firstname, lastname, email, password, phone, status);
        this.date_fonction = date_fonction;
    }

    public String getDate_fonction() {
        return date_fonction;
    }

    public void setDate_fonction(String date_fonction) {
        this.date_fonction = date_fonction;
    }
}
