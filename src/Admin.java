public class Admin extends User{
    private int id;

    public Admin(int id, String date_entree, int id_user, String firstname, String lastname, String email, String password, String phone, Boolean status)
    {
        super(id_user, firstname, lastname, email, password, phone, status);
        this.id = id;
    }
}
