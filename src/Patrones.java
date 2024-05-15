import java.util.Scanner;

public class Patrones {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese el numero de patrones que desea reproducir: ");
        int numero = sc.nextInt();
        patron1(numero);
        patron2(numero);
        patron3(numero);
        
        
    }

    private static void patron1(int serie) {
        System.out.println("patron 1: ");
        for (int i = 1; i <= serie; i++) {
              if (i %2 ==0){
                  System.out.print(".");
              }    else {
                  System.out.print("*");
              }
        }
        System.out.println();
    }

    private static void patron2(int serie) {
        System.out.println("patron 2: ");
        int contador = 1;
        for (int i = 1; i <= serie; i++) {
            System.out.print(contador);
            contador ++;
            if (contador >4) {
                contador= 1;
            }
        }
        System.out.println();
    }

    private static void patron3(int serie) {
        System.out.println("patron 3: ");
        for (int i = 1; i <= serie; i++) {
            if (i %3 ==0){
                System.out.print("*");
            }    else {
                System.out.print("|");
            }
        }
        System.out.println();
    }
}