import java.util.HashMap;

public class Departement {
    private int id;
    private String name;
    private String description;
    private HashMap<Integer, Teacher> teachers = new HashMap<Integer, Teacher>();

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
                "} \n";
    }

    public boolean addTeacher(int id_user, String firstname, String lastname, String email, String password, String phone, boolean status, String date_fonction)
    {
        Teacher teacher = new Teacher(date_fonction, id_user, firstname, lastname, email, password, phone, status);

        teachers.put(teacher.getId(), teacher);
        return true;
    }

    // Getters and Setters
    public void setTeachers(HashMap<Integer, Teacher> teachers) {
        this.teachers = teachers;
    }

    public HashMap<Integer, Teacher> getTeachers() {
        return teachers;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

}
