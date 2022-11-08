import java.util.Scanner;

/*
 * 
Haz un script que reciba por parámetro al menos 4 nombres de persona y devuelva un saludo separado por comas del tipo “¡Hola Ana, Andrés, Juan, Manuel !”

 */
public class ejercicio2{
    public static void main(String[] args){
        
        System.out.println("Escribe un nombre: ");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();

        System.out.println("Escribe un nombre: ");
        String nombre2 = sc.nextLine();

        System.out.println("Escribe un nombre: ");
        String nombre3 = sc.nextLine();

        System.out.println("Escribe un nombre: ");
        String nombre4 = sc.nextLine();

        System.out.println("¡Hola " + nombre + ", " + nombre2 + ", " + nombre3 + ", " + nombre4 + "!");
        
    }
}

