public class Address {
    private static int id = 0;
    private String ville;
    private String pays;
    private String code_postal;
    private String address;

    public Address(){}

    public Address (int id, String ville, String pays, String code_postal, String address)
    {
        this.id = id;
        this.ville = ville;
        this.pays = pays;
        this.code_postal = code_postal;
        this.address = address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public void setCode_postal(String code_postal) {
        this.code_postal = code_postal;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static int getId() {
        return id;
    }

    public String getVille() {
        return ville;
    }

    public String getPays() {
        return pays;
    }

    public String getCode_postal() {
        return code_postal;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", ville='" + ville + '\'' +
                ", pays='" + pays + '\'' +
                ", code_postal='" + code_postal + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
