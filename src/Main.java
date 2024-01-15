import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static void describe() {
        ArrayList<String> bestFormateur = new ArrayList<String>();
        bestFormateur.add("Jean");
        bestFormateur.add("Ahmed");
        bestFormateur.add("Lea");
        bestFormateur.add("Blanca");

        for (int i = 0; i < bestFormateur.size(); i++) {

            int nombreCaracteres = bestFormateur.get(i).length();
            System.out.println(("Nombre de caractères dans \"" + bestFormateur.get(i) + "\": " + nombreCaracteres));
        }
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Traitement de chaînes de caractères");
        describe();
    }
}