import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static int getInputUser() {
        System.out.println("Exercice 1 - Suites de nombres simples");

        Scanner inputUser = new Scanner(System.in);
        System.out.println("Entrer un nombre entier");

        return inputUser.nextInt();
    }

    static int findTheLowestInt(int number){
        int lowestNumber = (int) Math.ceil(Math.sqrt(number));
        return lowestNumber*lowestNumber;
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Exercice 2");
        int intputUser = getInputUser();
        int result = findTheLowestInt(intputUser);
        System.out.println("Le plus petit carré est : " +result);

    }
}

