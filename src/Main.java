//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static void enumerate_while() {
        int i = 1;

        while (i <= 100) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
            i++;
        }
    }

    static void enumerate_for() {
        for (int j = 1; j <= 100; j++) {
            System.out.println("j = " + j);
        }
    }

    static void enumerate_even() {
        for (int j = 0; j <= 100; j++) {
            if (j % 2 == 0) {
                System.out.println("j pair = " + j);
            }
        }
    }
    static void enumerate_odd() {
        for (int j = 0; j <= 100; j++) {
            if (j % 2 != 0) {
                System.out.println("j impair = " + j);
            }
        }
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Exercice 1 - Suites de nombres simples");

        // une boucle while, qui affiche tous les nombres de 1 à 100.
        enumerate_while();

        // une boucle for, qui affiche tous les nombres de 1 à 100.
        enumerate_for();

        // Affichage des nombres pairs
        enumerate_even();

        // Affichage des nombres impairs
        enumerate_odd();

    }
}

