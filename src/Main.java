import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static int getInputUser() {
        System.out.println("Exercice 2 - Suite de Fibonacci");

        Scanner inputUser = new Scanner(System.in);
        System.out.println("Entrer un nombre entier");

        return inputUser.nextInt();
    }

    static ArrayList<Integer> getFibonacciArrayList(int inputUser) {
        ArrayList<Integer> fibonacciArrayList = new ArrayList<>();
        fibonacciArrayList.add(0);
        fibonacciArrayList.add(1);
        for (int i = 2; i < inputUser; i++) {
            fibonacciArrayList.add(i, fibonacciArrayList.get(i - 2) + fibonacciArrayList.get(i - 1));
        }
        return fibonacciArrayList;
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Suite de Fibonacci!");
        int inputUser = getInputUser();
        System.out.println(getFibonacciArrayList(inputUser));

    }
}