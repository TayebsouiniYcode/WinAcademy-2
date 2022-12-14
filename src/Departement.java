import java.util.HashMap;

public class Departement {
    private int id;
    private String name;
    private String description;
    // to refact
    private Teacher responsable = new Teacher (  );
    private HashMap<Integer, Teacher> teachers = new HashMap<Integer, Teacher>();

    // Getters and setters ---------------------------------------------------------------
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Teacher getResponsable ( ) {
        return responsable;
    }
    public void setResponsable ( Teacher responsable ) {
        this.responsable = responsable;
    }

    public void setTeacher(Teacher teacher) {
        this.teachers.put ( teacher.getId (), teacher );
    }
    public Teacher getTecher(int id) { return this.teachers.get ( id );}

    public HashMap<Integer, Teacher> getTeachers(){
        return teachers;
    }

    // constructor ---------------------------------------------------------------------------
    public Departement(int id, String name, String description)
    {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", teachers=" + teachers + '\'' +
                ", responsable " + responsable + '\'' +
                "} \n";
    }
}
