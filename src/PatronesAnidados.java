import java.util.Scanner;

public class PatronesAnidados {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese el numero de patrones que desea reproducir: ");
        int numero = sc.nextInt();
        patron1(numero);
        patron2(numero);
        patron3(numero);
        patron4(numero);

    }

    private static void patron1(int serie) {
        System.out.println("Patron n1:");
        for (int i = 1; i <= serie; i++) {
            for (int j = 1; j <= serie ; j++) {
                if (i == serie || i == 1) {
                    System.out.print("*");
                } else if (j==1 || j==serie){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }

    private static void patron2(int serie) {
        System.out.println("Patron n2: ");
        for (int i = 1; i <= serie; i++) {
            for (int j = 1; j <= serie ; j++) {
                if (i == serie || i == 1) {
                    System.out.print("*");
                } else if (j== serie-i+1 ){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    private static void patron3(int serie) {
        System.out.println("Patron n3: ");
        for (int i = 1; i <= serie; i++) {
            for (int j = 1; j <= serie; j++) {
                if (j == serie - i + 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
    private static void patron4(int serie) {
        System.out.println("Patron n4: ");
        for (int i = 1; i <= serie; i++) {
            for (int j = 1; j <= serie ; j++) {
                if (i == 1 || i == serie ) {
                    if (i==1) {
                        if (j<serie) {
                            System.out.print("*");
                        }
                    }
                     if (i== serie) {
                         if (j==1){
                             System.out.print(" ");
                         } else {
                             System.out.print("*");
                         }
                     }
                }else if (j==1 || j==serie){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }
}
