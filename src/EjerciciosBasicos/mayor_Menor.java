// ---------------------------------------------------------
// Declara 2 variables numéricas (con el valor que desees),
// he indica cual es mayor de los dos. Si son iguales
// indicarlo también. Ves cambiando los valores para comprobar que funciona.
// ---------------------------------------------------------
package EjerciciosBasicos;

public class mayor_Menor {

    public static void main(String[] args) {
        int num1=10, num2=2;

        if(num1 == num2){
           System.out.println("Son iguales");
        } else {
            if(num1 >= num2){
                System.out.println("El mayor es el numero 1: " + num1);
            } else {
                System.out.println("El mayor es el numero 2: " + num2);
            }
        }

    }
}
