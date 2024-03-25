// -------------------------------------------------------------------
// Declara dos variables numéricas (con el valor que desees),
// muestra por consola la suma, resta, multiplicación, división y
// módulo (resto de la división).
// -------------------------------------------------------------------
package EjerciciosBasicos;

public class calculadora_HardCode {
   public static void main(String[] args) {
       double num1 = 10, num2 = 5;
       double suma = num1 + num2;
       double resta = num1 - num2;
       double multi = num1 * num2;
       double div = num1 / num2;
       double modulo = num1 % num2;

       System.out.println("El resultado de las operaciones de los numeros " + num1 + " y " + num2 + " son:");
       System.out.println("Suma: " + suma);
       System.out.println("Resta: " + resta);
       System.out.println("Multiplicacion: " + multi);
       System.out.println("Division: " + div);
       System.out.println("Modulo: " + modulo);
    }





}
