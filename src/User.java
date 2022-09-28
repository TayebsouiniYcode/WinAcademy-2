public class User {
    protected int id;
    protected String firstname;
    protected String lastname;
    protected String email;
    protected String password;
    protected String phone;
    protected Boolean status;

    public  User(int id, String firstname, String lastname, String email, String password, String phone, Boolean status)
    {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.status = status;

    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
