package simuladordecajeroautomatico;

import java.util.Scanner;

public class SimuladorCajeroAutomatico {
    public static void main(String[] args) {
        int opcion, ingreso, retiro;
        Scanner sc = new Scanner(System.in);
        System.out.println("****************************************************************");
        System.out.println("***************BIENVENIDO A TU CAJERO AUTOMÁTICO****************");
        System.out.println("****************************************************************");
        do {
            System.out.println("ELIGE UNA OPCIÓN: ");
            System.out.println("1. Consultar tu saldo");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ha elegido consultar su saldo.");
                    System.out.println("Su saldo es de: 1200€");
                    System.out.println("**********************************************************");
                    break;
                    case 2:
                        System.out.println("Ha elegido ingresar dinero");
                        System.out.println("¿Cuánto dinero quiere ingresar?");
                        ingreso = sc.nextInt();
                        System.out.println("Su nuevo saldo es de: "+(1200+ingreso)+"€");
                        System.out.println("**********************************************************");
                        break;
                        case 3:
                            System.out.println("Ha elegido retirar dinero");
                            System.out.println("¿Cuánto dinero quiere retirar?");
                            retiro = sc.nextInt();
                            while(retiro<=0 || retiro>1200){
                                System.out.println("Cantidad no valida, intentelo de nuevo.");
                                System.out.println("**********************************************************");
                                break;
                            }
                            break;
            }
        }
        while (opcion!=4);
        System.out.println("¡GRACIAS!");
    }
}
