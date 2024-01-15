import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static void enumerate_while(int inputUser) {
        int i = 1;

        while (i <= inputUser) {
            System.out.println("i = " + i);
            i++;
        }
    }

    static void enumerate_for(int userNumber) {
        for (int j = 1; j <= userNumber; j++) {
            System.out.println("j = " + j);
        }
    }

    static void enumerate_even(int userNumber) {
        for (int j = 0; j <= userNumber; j++) {
            if (j % 2 == 0) {
                System.out.println("j pair = " + j);
            }
        }
    }
    static void enumerate_odd(int userNumber) {
        for (int j = 0; j <= userNumber; j++) {
            if (j % 2 != 0) {
                System.out.println("j impair = " + j);
            }
        }
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Exercice 1 - Suites de nombres simples");

        Scanner inputUser = new Scanner(System.in);
        System.out.println("Entrer un nombre entier");

    int userNumber = inputUser.nextInt();
        // une boucle while, qui affiche tous les nombres de 1 à 100.
        enumerate_while(userNumber);

        // une boucle for, qui affiche tous les nombres de 1 à 100.
        enumerate_for(userNumber);

        // Affichage des nombres pairs
        enumerate_even(userNumber);

        // Affichage des nombres impairs
        enumerate_odd(userNumber);

    }
}

