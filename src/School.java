import java.util.HashMap;

public class School {
    private int numero;
    private String name;
    private String site;
    private Address address;
    private HashMap<Integer, Departement> departements = new HashMap<Integer, Departement>();

    public int getNumero() {
        return numero;
    }
    public String getName() {
        return name;
    }
    public String getSite() {
        return site;
    }
    public Address getAddress() {
        return address;
    }
    public HashMap<Integer, Departement> getDepartements() {
        return departements;
    }
    public Departement getDepartement(int id) {return this.departements.get(id);}

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSite(String site) {
        this.site = site;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public void setDepartement( int id, Departement departement) {
        this.departements.put(id, departement);
    }

    public School() {};
    public School(int numero, String name, String site)
    {
        this.numero = numero;
        this.name = name;
        this.site = site;
    }

    public School(int numero, String name, String site, Address address)
    {
        this.numero = numero;
        this.name = name;
        this.site = site;
        this.address = address;
    }

    public void removeDepartement(int id)
    {

        this.departements.remove(id);
    }

    @Override
    public String toString() {
        return "School{" +
                "numero=" + numero +
                ", name='" + name + '\'' +
                ", site='" + site + '\'' +
                ", \n address=" + address +
                ", \n departements" + departements +
                '}';
    }
}
