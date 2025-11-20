import java.util.Scanner;

public class Util {
    private static final Scanner scanner = new Scanner(System.in);

    public static String lerTexto(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    public static int lerInteiro(String mensagem) {
        System.out.print(mensagem);
        return Integer.parseInt(scanner.nextLine());
    }

    public static double lerDouble(String mensagem) {
        System.out.print(mensagem);
        return Double.parseDouble(scanner.nextLine());
    }
}
