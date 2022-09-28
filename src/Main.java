public class Main {
    public static void main(String[] args) {

        School school1 = new School(1, "Moussa ibno noussair", "moussa.ma");
        school1.addAddress(1, "Youssoufia", "Maroc", "46300", "numero 1 rue sebtah Qu El mohammadi");

        school1.addDepartement(1, "Informatique", "département d'informatique");
        school1.addDepartement(2, "Math", "département du Mats");


        System.out.println(school1.toString());
    }
}