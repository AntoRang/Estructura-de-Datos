package Prueba;
/**
 * Created by AntonioRang on 10/12/17.
 */
public class EjerciciosStackYQueue {
    public static void main(String[] args) {
        System.out.println("Testing balanced symbols");
        System.out.println(checkForBalance("t = arr[3] + a) - 4"));
        System.out.println(checkForBalance("if (arr(3] < 4)"));
        System.out.println(checkForBalance("System.out.println(std.charAt(3);"));
        System.out.println(checkForBalance("while (i > 100) { sum += i; i++; }"));
        System.out.println();

        System.out.println("Testing postfix evaluation");
        System.out.println("4 3 5 * + => " + postfixEval("4 3 5 * +"));
        System.out.println("1 2 * 3  4 / - => " + postfixEval("1 2 * 3 4 / -"));
        System.out.println("1 2 * 3 * 4 * 5 * 6 * => " + postfixEval("1 2 * 3 * 4 * 5 * 6 *"));
        System.out.println("1 2 3 * 4 + 5 / + => " + postfixEval("1 2 3 * 4 + 5 / +"));
        System.out.println("2 2 * 4 1 * 3 * - 2 1 * / => " + postfixEval("2 2 * 4 1 * 3 * - 2 1 * /"));
        System.out.println("3 8 + * 9 => " + postfixEval("3 8 + * 9"));
        System.out.println("9 8 + 7 => " + postfixEval("9 8 + 7"));
        System.out.println();

        System.out.println("Testing Fibonacci sequence");
        fibonacci(10);
        System.out.println();

        System.out.println("Testing the Printer class");
        Printer printer = new Printer();
        printer.printDocument("gato.jpg");
        printer.printDocument("tarea.docx");
        printer.printDocument("meme.png");
        try {
            printer.runPrinter();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println();

    }

    public static String checkForBalance(String cod){
        return "";
    }

    public static String postfixEval(String ecu){
        return "";
    }

    public static void fibonacci(int n){
    }


}
