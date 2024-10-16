
//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

       
        

        Scanner scanner = new Scanner(System.in);

        System.err.println("Ingrese la cantida de personas: ");
        int cantidadPersonas = 10;
        scanner.nextLine();
        Persona[] persona = new Persona[cantidadPersonas];


        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.println("Ingrese el nombre de la Persona " + ( i + 1 )+" : ");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese la edad de la persona. "+(i+1));
            int edad = scanner.nextInt();
            persona[i] = new Persona(nombre, edad);
            
        }
          Arrays.sort(persona, (p1, p2) -> Integer.compare(p1.getEdad(), p2.getEdad()));
          System.out.print("Ingrese la edad que desea buscar: ");
          int edadBuscada = scanner.nextInt();
          int resultado = busquedaBinaria(persona, edadBuscada);
        
        /*scanner.close();
        for(Persona persona1 : persona){
            System.out.println(persona1);

        }*/
        



        




    }
}
