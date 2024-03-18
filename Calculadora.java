import java.util.*;

public class Calculadora {

    public static float Sumar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1er numero");
        float n1 = sc.nextFloat();
        System.out.println("2do numero");
        float n2 = sc.nextFloat();
        System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
        return n1 + n2;
    }

    public static float Restar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1er numero");
        float n1 = sc.nextFloat();
        System.out.println("2do numero");
        float n2 = sc.nextFloat();
        System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
        return n1 - n2;
    }

    public static float Multiplicar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1er numero");
        float n1 = sc.nextFloat();
        System.out.println("2do numero");
        float n2 = sc.nextFloat();
        System.out.println(n1 + " * " + n2 + " = " + (n1*n2));
        return n1 - n2;
    }

    public static float Dividir(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1er numero");
        float n1 = sc.nextFloat();
        System.out.println("2do numero");
        float n2 = sc.nextFloat();
        if (n2 != 0){
            System.out.println(n1 + " / " + n2 + " = " + (n1/n2));
            return n1 / n2;
        }
        System.out.println("No es posible dividir entre 0");
        return 0;

    }


    public static void main(String[] args){
        int opcionActual = 0;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Elije una opcion");
            System.out.println("0 - Sumar");
            System.out.println("1 - Restar");
            System.out.println("2 - Multiplicar");
            System.out.println("3 - Dividr");
            System.out.println("4 - Salir");
            opcionActual = scan.nextInt();
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
                case 4:
                    break;
                default:
                    System.out.println("Opcion invalida");

            }
        } while (opcionActual != 4);
    }
}
