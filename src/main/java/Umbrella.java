// import java.util.Scanner;

public class Umbrella {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        System.out.println("Willkommen im Sonnenschein");

        double height = 0.0;
        double radius = 0.0;
        // for-each-schleife
        int index = 0;
        for(String s:args) {
            System.out.println(s);
            switch (index) {
                case 0 -> height = Double.parseDouble(s);
                case 1 -> radius = Double.parseDouble(s);
                default -> System.out.println();
            }
            index++;
        }

/*
        // Eingaben (E)
        System.out.print("Height: ");
        double height = scanner.nextDouble();

        System.out.print("Radius: ");
        double radius = scanner.nextDouble();
*/

        // Verarbeitung (V)
        double area = 2 * Math.PI * radius * height;

        // Ausgabe (A)
        System.out.printf("Area = %5.3f m²", area);
    }
}
