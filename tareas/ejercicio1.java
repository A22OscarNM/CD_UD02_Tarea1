import java.util.Scanner;

/*
 * Signo del zodíaco
 * Crea que al introducir el año que naciste te devuelva
tu signo del zodíaco chino.
Para conocer el signo del horóscopo chino, debemos
dividir el año de nacimiento entre 12. El resto, entre
0 y 11, está asociado a un signo según la siguiente
tabla:

0 -Mono
1- Gallo
2 -Perro
2 - Cerdo
4 -Rata 
5- Buey 
6 - Tigre
7 - Conejo
8 - Dragón
9 -Serepiente
10- Caballo
11 - Cabra 

 */


public class ejercicio1{
    public static void main(String[] args){
        System.out.println("Escribe el año en el que naciste");
        Scanner sc = new Scanner(System.in);
        int anho = sc.nextInt();


        int resultado = anho%12;

        String a[] = {"Mono", "Gallo", "Perro", "Cerdo", "Rata", "Buey", "Tigre", "Conejo", "Dragon", "Serpiente", "Caballo", "Cabra"};
        
        System.out.println("Tu signo es " + a[resultado]);
    }
}