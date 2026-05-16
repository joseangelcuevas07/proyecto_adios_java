import java.util.Scanner;
public class AdiosJava{
    public static void main(String[] args) {
        int numero1, numero2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe el numero 1: ");
        numero1 = scanner.nextInt();
        System.out.println("Escribe el numero 2: ");
        numero2 = scanner.nextInt();
        int resultado = numero1 + numero2;
        System.out.println("La suma es: " + resultado);
        System.out.println("======================================");
        
        int resta = restar(numero1, numero2);
        System.out.println("La resta es: " + resta);

              //clase persona
        Persona persona1;
        persona1 = new Persona("Roberto Degante Lopez");

        persona1.setEdad(35);
        persona1.setTelefono("257-896-36-75");
        persona1.setGenero('M');
        persona1.setDireccion("calle 2 de Abril #16");

        System.out.println("===================================================");
        System.out.println("DATOS DE LA PERSONA");
        System.out.println(persona1.toString());
    }
    

    public static int restar (int n1, int n2){
        return n1 - n2;
    }

}