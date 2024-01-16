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

    static float getInputUser2() {
        System.out.println("Exercice 2 - Suite de Fibonacci");

        Scanner inputUser = new Scanner(System.in);
        System.out.println("Entrer un epsilon");

        return inputUser.nextFloat();
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

    static ArrayList<Integer> getApproxiamationFibo(float epsilon) {
        float phi = (float) (1 + Math.sqrt(5)) / 2;
        ArrayList<Integer> fibonacciArrayList = new ArrayList<>();
        ArrayList<Integer> fiboNumber = new ArrayList<>();

        fibonacciArrayList.add(1);
        fibonacciArrayList.add(1);
        fibonacciArrayList.add(2);
        int i = fibonacciArrayList.size();

        do {
            fibonacciArrayList.add(i, fibonacciArrayList.get(i - 2) + fibonacciArrayList.get(i - 1));
            i++;
        } while ((Math.abs((float) fibonacciArrayList.get(i - 1) / fibonacciArrayList.get(i - 2) - phi)) > epsilon);

        fiboNumber.add(fibonacciArrayList.get(i - 1));
        fiboNumber.add(fibonacciArrayList.get(i - 2));
        return fiboNumber;
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Suite de Fibonacci!");

        int inputUser = getInputUser();
        System.out.println(getFibonacciArrayList(inputUser));

        float inputUser2 = getInputUser2();
        System.out.println(getApproxiamationFibo(inputUser2));

    }
}