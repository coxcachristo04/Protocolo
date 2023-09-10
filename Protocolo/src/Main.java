import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int numeroD = rand.nextInt(9) + 1;

        System.out.println("Ingrese el mensaje que desee encriptar");
        String mensaje = scanner.nextLine();

        while (!mensaje.matches("^[a-zA-Z0-9]+$")) {
            System.out.println("Por favor ingrese un mensaje que solo contenga números y letras.");
            mensaje = scanner.nextLine();
        }

        char desface[] = mensaje.toCharArray();

        for (int i = 0; i < desface.length; i++){
            desface[i] = (char)(desface[i] + (char)numeroD);
        }
        String encriptado = String.valueOf(desface);

        System.out.println("encriptado = " + encriptado);
        System.out.println("numeroD = " + numeroD); //numeroD es lo que se desfazo

    }
}
