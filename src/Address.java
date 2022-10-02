public class Address {
    private int id;
    private String city;
    private String country;
    private String code_postal;
    private String address;

    public Address(){}
    public Address (int id, String ville, String pays, String code_postal, String address)
    {
        this.id = id;
        this.city = ville;
        this.country = pays;
        this.code_postal = code_postal;
        this.address = address;
    }


    public int getId ( ) {
        return id;
    }

    public String getCity ( ) {
        return city;
    }

    public String getCountry ( ) {
        return country;
    }

    public String getCode_postal ( ) {
        return code_postal;
    }

    public String getAddress ( ) {
        return address;
    }

    public void setId ( int id ) {
        this.id = id;
    }

    public void setCity ( String city ) {
        this.city = city;
    }

    public void setCountry ( String country ) {
        this.country = country;
    }

    public void setCode_postal ( String code_postal ) {
        this.code_postal = code_postal;
    }

    public void setAddress ( String address ) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", ville='" + city + '\'' +
                ", pays='" + country + '\'' +
                ", code_postal='" + code_postal + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
