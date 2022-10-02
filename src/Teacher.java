public class Teacher extends User{
    private String date_fonction;


    public Teacher(){}
    public Teacher(String date_fonction, int id_user, String firstname, String lastname, String email, String password, String phone, Boolean status)
    {
        super(id_user, firstname, lastname, email, password, phone, status);
        addUserToApplication();
        this.date_fonction = date_fonction;
    }

    public String getDate_fonction() {
        return date_fonction;
    }

    public void setDate_fonction(String date_fonction) {
        this.date_fonction = date_fonction;
    }

    public void addUserToApplication(){
        User user = new User ( this.id,
                this.firstname,
                this.lastname,
                this.email,
                this.password,
                this.phone,
                this.status );

        Application.setUser ( user );
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "date_fonction='" + date_fonction + '\'' +
                ", id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", status=" + status +
                '}';
    }
}
