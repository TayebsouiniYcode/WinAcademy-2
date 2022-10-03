public class AdminServices {
    Application app = new Application();

    public void manageSchool() {
        int choix = 0;
        do {
            System.out.println("1. Create school");
            System.out.println("2. Update school");
            System.out.println("3. Show all school");
            System.out.println("4. Search school");
            System.out.println("5. Delete school");
            System.out.println("99. Cancel");
            System.out.print("Enter a number : ");

            choix = Integer.parseInt(Application.scan());

            switch (choix) {
                case 1:
                    addSchool();
                    break;
                case 2:
                    updateSchool();
                    break;
                case 3:
                    showAllSchool();
                    break;
                case 4:
                    getSchool();
                    break;
                case 5:
                    deleteSchool();
                    break;

                default:
                    Application.show("");
            }
        } while (choix != 99);
    }

    /**
     * School traitement
     * ######################################### School ################################################
     */
    public void addSchool() {
        Application.show("Enter school Number: ");
        int numero = Integer.parseInt(Application.scan());

        Application.show("Enter school name: ");
        String name = Application.scan();

        Application.show("Enter school site: ");
        String site = Application.scan();

        Application.show("Enter city: ");
        String city = Application.scan();

        Application.show("Enter country: ");
        String country = Application.scan();

        Application.show("Enter postal code: ");
        String code_postal = Application.scan();

        Application.show("Enter address: ");
        String address = Application.scan();

        app.addSchool(numero, name, site, city, country, code_postal, address);
    }

    public void deleteSchool()
    {
        showAllSchool();
        Application.show("Enter school number: ");
        int schoolNumber = Integer.parseInt(Application.scan());
        app.deleteSchool(schoolNumber);
    }

    public void updateSchool()
    {
        showAllSchool();
        System.out.println("Enter school number: ");
        int schoolNumber = Integer.parseInt(Application.scan());
        System.out.println("1. Update school name");
        System.out.println("2. Update school site");
        System.out.println("3. Update school address");
        System.out.println("Enter a number: ");
        int choix = Integer.parseInt(Application.scan());

        switch (choix){
            case 1:
                updateSchoolName(schoolNumber);
                break;
            case 2:
                updateSchoolSite(schoolNumber);
                break;
            case 3:
                System.out.println("This fonctionnality is not found");
                //updateSchoolAddress(schoolNumber);
                break;
            default:
                System.out.println("Enter a valide number :)");
        }
    }

    public void updateSchoolName(int schoolNumber)
    {
        School school = Application.schools.get(schoolNumber);
        System.out.println("Enter name: ");
        String str = Application.scan();
        school.setName(str);

        Application.schools.put(school.getNumero(), school);
        System.out.println("Success");
    }
    public void updateSchoolSite(int schoolNumber)
    {
        School school = Application.schools.get(schoolNumber);
        System.out.println("Enter site: ");
        String str = Application.scan();
        school.setSite(str);

        Application.schools.put(school.getNumero(), school);
        System.out.println("Success");
    }

    public void showAllSchool()
    {
        //Application.show(Application.schools.toString());
        Application.schools.forEach((key, value) -> System.out.println("Number: " + key +
                " \t|\t name: " + value.getName() +
                " \t|\t site: " + value.getSite()));
    }

    public void getSchool(){
        String value  = Application.scan();
        School school = new School();

        for (Integer key : Application.schools.keySet()) {
            school = Application.schools.get(key);
            try{
                if (school.getName().equals(value) || school.getSite().equals(value) || school.getNumero() == Integer.parseInt(value) ){
                    Application.show(Application.schools.get(key).toString());
                } else {
                    Application.show("not found");
                }
            } catch (Exception ex) {
                Application.show("Error: " + ex.toString());
            }
        }
    }


    // Departement
    public void manageDepartement()
    {
        int choix = 0 ;
        do {
            System.out.println("1. Create Departement");
            System.out.println("2. Show Departements");
            System.out.println("4. Update departement");
            System.out.println("5. Delete departement");
            System.out.println ("6. Add Teacher to departement" );
            System.out.println ("7. Add responsable" );
            System.out.println("99. Cancel");
            System.out.print("Enter a number : ");

            choix = Integer.parseInt(Application.scan());

            switch (choix) {
                case 1:
                    addDepartement();
                    break;
                case 2:
                    showDepartement();
                    break;
                case 3:
                    System.out.println("Coming soon... !!!");
                    break;
                case 4:
                    updateDepartement();
                    break;
                case 5:
                    deleteDepartement();
                    break;
                case 6:
                    addTeacherToDepartement();
                    break;
                case 7:
                    addResponsable();
                    break;
                default:
                    System.out.println ("enter valide number !!" );
            }
        } while (choix != 99);
    }

    public void addDepartement()
    {
        showAllSchool();
        System.out.println("Enter school number");
        int schoolNumber = Integer.parseInt(Application.scan());

        System.out.println("Enter id departement: ");
        int id = Integer.parseInt(Application.scan());

        System.out.println("Enter departement name: ");
        String name = Application.scan();

        System.out.println("Enter departement description: ");
        String description = Application.scan();

        app.addDepartement(id, name, description, schoolNumber);
    }

    public int showDepartement()
    {
        showAllSchool();
        Application.show("Enter school number : ");
        int schoolNumber = Integer.parseInt(Application.scan());
        System.out.println(Application.schools.get(schoolNumber).getDepartements());
        return schoolNumber;
    }
    public void updateDepartement()
    {
        int schoolNumber = showDepartement();
        System.out.println("Enter departement number: ");
        int departementNumber = Integer.parseInt(Application.scan());

        System.out.println("1. Update name: ");
        System.out.println("2. Update description: ");
        int choix = Integer.parseInt(Application.scan());

        switch (choix){
            case 1:
                updateDepratementName(departementNumber, schoolNumber);
                break;
            case 2:
                updateDepartementDescription(departementNumber, schoolNumber);
                break;
            default:
                System.out.println("Number not valide !!");
        }
    }

    public void deleteDepartement()
    {
        int schoolNumber = showDepartement();
        System.out.println("Enter departement number: ");
        int departementNumber = Integer.parseInt(Application.scan());

        Application.schools.get(schoolNumber).removeDepartement(departementNumber);

        System.out.println("Success");
    }
    public void updateDepratementName(int departementNumber, int schoolNumber)
    {
        System.out.println("Enter name: ");
        String name = Application.scan();

        Departement departement = Application.schools.get(schoolNumber).getDepartement(departementNumber);
        departement.setName(name);

        Application.schools.get(schoolNumber).setDepartement (departementNumber, departement);

        System.out.println("Success");
    }

    public void updateDepartementDescription(int departementNumber, int schoolNumber)
    {
        System.out.println("Enter description: ");
        String description = Application.scan();

        Departement departement = Application.schools.get(schoolNumber).getDepartement(departementNumber);
        departement.setDescription(description);

        Application.schools.get(schoolNumber).setDepartement (departementNumber, departement);

        System.out.println("Success");
    }

    public void addResponsable(){
        System.out.println (Application.schools.toString ());
        System.out.println ( "Enter school number: ");
        int schoolNumber = Integer.parseInt (Application.scan ());
        System.out.println ( Application.schools.get ( schoolNumber ).getDepartements ().toString ());
        System.out.println ("Enter departement number: " );
        int departementNumber = Integer.parseInt (Application.scan ());

        System.out.println (Application.schools.get ( schoolNumber ).getDepartement ( departementNumber ).getTeachers ().toString ());

        System.out.println ("Select teacher: " );
        int teacherNumber = Integer.parseInt ( Application.scan () );

        if (Application.schools.get ( schoolNumber ).getDepartement ( departementNumber ).getTeachers ().containsKey ( teacherNumber )) {
            System.out.println ("school: " + schoolNumber + " departement: " + departementNumber + " teacher: " + teacherNumber);
        }

    }

    public void addTeacherToDepartement() {
        System.out.println (Application.schools.toString () );
        System.out.println ("Enter School number: " );
        int schoolNumber = Integer.parseInt ( Application.scan () );

        System.out.println (Application.schools.get ( schoolNumber ).getDepartements ().toString () );
        System.out.println ("Enter departement number: " );
        int departementNumber = Integer.parseInt ( Application.scan () );

        Teacher teacher = new Teacher (  );
        System.out.println ("Enter Teacher (id): " );
        teacher.setId ( Integer.parseInt ( Application.scan () ) );

        System.out.println ("Enter Teacher Firstname: " );
        teacher.setFirstname ( Application.scan () );

        System.out.println ("Enter Teacher lastname: " );
        teacher.setLastname ( Application.scan () );

        System.out.println ("Enter Teacher email: " );
        teacher.setEmail ( Application.scan () );

        System.out.println ("Enter Teacher password: " );
        teacher.setPassword ( Application.scan () );

        System.out.println ("Enter Teacher phone number: " );
        teacher.setPhone ( Application.scan () );

        System.out.println ("Enter Teacher date fonction: JJ/MM/AAAA" );
        teacher.setDate_fonction ( Application.scan () );

        System.out.println ("Teacher account Avtice (ture) Or Not (false)," );
        teacher.setStatus ( Boolean.parseBoolean ( Application.scan () ) );

        Application.schools.get ( schoolNumber ).getDepartement ( departementNumber ).setTeacher ( teacher );
        System.out.println ("Success !! " );

    }

    public void createTeacher()
    {
        System.out.println (Application.schools.toString());
        System.out.println ("Enter school number: " );
        int schoolNumber = Integer.parseInt ( Application.scan () );

        System.out.println (Application.schools.get ( schoolNumber ).getDepartements ().toString () );
        System.out.println ("Enter departement number: " );
        int departementNumber = Integer.parseInt ( Application.scan () );


        Teacher teacher = new Teacher (  );

        System.out.println ("Enter Firstname: " );
        teacher.setFirstname ( Application.scan () );

        System.out.println ("Enter lastname: " );
        teacher.setLastname ( Application.scan () );

        System.out.println ("Enter email: " );
        teacher.setEmail ( Application.scan () );

        System.out.println ("Enter password: " );
        teacher.setPassword ( Application.scan () );

        System.out.println ("Enter number phone: " );
        teacher.setPhone ( Application.scan () );

        System.out.println ("Enter user id: " );
        teacher.setId ( Integer.parseInt (  Application.scan ()) );

        System.out.println ("Enter status: " );
        teacher.setStatus ( Boolean.parseBoolean ( Application.scan ()) );

        System.out.println ("Enter date : JJ/MM/AAAA: " );
        teacher.setDate_fonction ( Application.scan () );

        teacher.addUserToApplication();
        Application.schools.get ( schoolNumber ).getDepartement ( departementNumber ).setTeacher ( teacher );
    }

    public void manageTeacher(){
        Menu.teacher();
    }
    // Account methos
    public void showAccount(){
        Application.getUsers ().forEach ( (key, value) ->{
            System.out.println (value.getEmail () );
        } );
    }

    // Student methods ----------------------------------------------------
    public static void createStudent(){

    }

    // Teacher Methods ----------------------------------------------------------------------
    public void assigneMatiereToTeacher(int teacherNumber, int matiereNumber){
        Application.schools.forEach ( (key, value) -> {
            value.getDepartements ().forEach ( (departementKey, departement) ->{
                if (departement.getTeachers ( ).containsKey ( teacherNumber ) ) {
                    departement.getTecher ( teacherNumber ).setId_matiere ( matiereNumber );
                } else {
                    System.out.println ("Teacher not exist !!" );
                }
            } );
        } );
    }

    // Matiere Methods ---------------------------------------------------------------------------
    public void createMatiere(){
        Matiere matiere = new Matiere (  );
        System.out.println ("Enter Id Matiere: " );
        matiere.setId ( Integer.parseInt ( Application.scan () ));

        System.out.println ("Enter Matier name: " );
        matiere.setName ( Application.scan () );

        System.out.println ("Enter Matiere description: " );
        matiere.setDescription ( Application.scan () );

        Application.setMatiere ( matiere );
    }
    public void updateMatiere(){
        System.out.println (Application.getMatieres ().toString () );
        System.out.println ("Enter Matiere number: " );
        int matiereNumber = Integer.parseInt ( Application.scan () );

        int choix = 0;
        do {
            System.out.println ("1. Update name: " );
            System.out.println ("2. Update Description: " );
            choix = Integer.parseInt ( Application.scan () );
            System.out.println ("99. Cancel" );

            switch (choix){
                case 1:
                    updateMatiereName(matiereNumber);
                    break;
                case 2:
                    updateMatiereDescription(matiereNumber);
                    break;
                default:
                    System.out.println ("Enter a valide number !!" );
            }
        } while (choix != 99 );

    }

    public void updateMatiereName(int matierNumber){
        System.out.println ("Enter Matiere name: " );
        Application.getMatiere ( matierNumber ).setName ( Application.scan () );
        System.out.println ("Success" );
    }

    public void updateMatiereDescription(int matierNumber){
        System.out.println ("Enter Description: " );
        Application.getMatiere ( matierNumber ).setDescription ( Application.scan () );
        System.out.println ("Success" );
    }

    public void getAllMatiere(){
        System.out.println (Application.getMatieres ().toString () );
    }

    public void deleteMatiere(){
        System.out.println (Application.getMatieres ().toString () );
        System.out.println ("Select Matiere number: " );
        int matiereNumber = Integer.parseInt ( Application.scan () );

        Application.schools.forEach ( (schoolNumber, school) -> {
            school.getDepartements ().forEach ( (departementKey, departement) -> {
                departement.getTeachers ().forEach ( (teacherKey, teacher) -> {
                    if (teacher.getId_matiere () == matiereNumber){
                        teacher.setId_matiere ( 0 );
                    }
                } );
            } );
        } );

        Application.getMatieres ().remove ( matiereNumber );
    }

}