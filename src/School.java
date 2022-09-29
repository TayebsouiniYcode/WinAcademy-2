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

    public Departement getDepartement(int id)
    {
        return this.departements.get(id);
    }

    public void removeDepartement(int id)
    {
        this.departements.remove(id);
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

    public void addAddress(Address address){
        //this.address.setId(id);
        //this.address.setVille(ville);
        //this.address.setPays(pays);
        //this.address.setCode_postal(code_postal);
        //this.address.setAddress(address);
        this.address = address;
    }

    public String addDepartement(int id, String name, String description)
    {
        Departement dep = new Departement(id, name, description);
        try{
            this.departements.put(dep.getId(), dep);
            return "Success";
        } catch (Exception ex) {
            return "Error : " + ex.toString();
        }
    }

    public void addDepartement(Departement departement)
    {

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

    public void setDepartements(int id, Departement departement) {
        this.departements.put(id, departement);
    }
}
