import java.util.*;

public class Calculadora {

    int opcionActual;
    public static int Sumar(){
        Scanner sc = new Scanner(System.out);
        System.out.println("1er numero");
        float n1 = sc.nextFloat();
        System.out.println("2do numero");
        float n2 = sc.nextFloat();
        System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
        return n1 + n2;
    }

    public static int Restar(){
        Scanner sc = new Scanner(System.out);
        System.out.println("1er numero");
        float n1 = sc.nextFloat();
        System.out.println("2do numero");
        float n2 = sc.nextFloat();
        System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
        return n1 - n2;
    }

    
    public static void main(String[] args){
        opcionActual = 0;
        do {
            System.out.println("Elije una opcion");
            System.out.println("0 - Sumar");
            System.out.println("1 - Restar");
            System.out.println("2 - Multiplicar");
            System.out.println("3 - Dividr");
            System.out.println("4 - Salir");
            switch (opcionActual){
                case 0:
                    Sumar();
                    break;
                case 1:
                    Restar();
                    break;
                case 2:
                    Multiplicar();
                    break;
                case 3:
                    Dividir();
                default:
                    System.out.println("Opcion invalidad");

            }
        } while (opcion != 4);
    }
}
