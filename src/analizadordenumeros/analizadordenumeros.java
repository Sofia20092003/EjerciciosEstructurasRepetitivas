package analizadordenumeros;

import java.util.Scanner;

public class analizadordenumeros {
    public static void main(String[] args) {
        int opcion;
        Scanner sc = new Scanner(System.in);
        System.out.println("*****************************************************************");
        System.out.println("****************BIENVENIDO AL ANALIZADOR DE NÚMEROS**************");
        System.out.println("*****************************************************************");

        do {
            int menor=Integer.MIN_VALUE;
            int mayor=Integer.MAX_VALUE;
            boolean primernumero= true;
            for (int i=1; i<=5; i++){
                System.out.println("Introduce los números que quieras comparar: ");
                int numeroactual=sc.nextInt();
                if(primernumero){
                    menor=numeroactual;
                    mayor=numeroactual;
                    primernumero=false;
                }else{
                    if(numeroactual < menor){
                        menor=numeroactual;
                    }
                    if(numeroactual > mayor){
                        mayor=numeroactual;
                    }
                }
            }
            System.out.println("El numero mayor es: "+mayor);
            System.out.println("El numero menor es: "+menor);
            System.out.println("*****************************************************************");
            System.out.println("Desea analizar otro grupo de 5 numeros? \n" +
                    "1. si \n" +
                    "2. No");
            opcion=sc.nextInt();
        }
        while (opcion!=2);
        System.out.println("Programa finalizado.");
    }
}
