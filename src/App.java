import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor introduce tu nombre");
        String nombre = scanner.nextLine();

        System.out.println("Hola " + nombre);
    }
}
