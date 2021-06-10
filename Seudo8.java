import java.util.Scanner;

public class Seudo8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int random;
        String bandera;
        bandera = "N";
        while (!bandera.equals("S") && !bandera.equals("s")) {
            random = (int) (Math.random() * (100000 - 0) + 0);
            while (random % 5 != 0) {
                random = (int) (Math.random() * (100000 - 0) + 0);
            }
            System.out.println("Numero random es " + random);
            System.out.println("pulse S para salir");
            bandera = scanner.nextLine();
        }
    }
}