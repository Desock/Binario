
package decimalabinario;
import java.util.Scanner;

public class DecimalABinario {
/* Los cambios realizados han sido los siguientes: He eliminado el "do while" debido a que todo el rato entraba
    en el primer print. Por lo tanto se elimino tambien la variable "i".
    En el metodo donde se realiza la conversion, lo cambie de void a int para poder mostrar por pantalla el resultado
    de la funcion a traves del print de dentro del main. Tambien se cambio el simbolo "^" por el de modulo (%) para
    obtener el resto de la division de n / 2. Ademas, se cambio la condicion del if para que fuera == para si,
    en caso que el numero n fuera 1 directamente haga print de n.
    
    
    */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.print("Introduzca un número que sea mayor que 0: ");                                                           
            n = sc.nextInt();
        

        System.out.print(decBin(n));
        
    }

  
    //Método para pasar de decimal a binario
    public static int decBin(int n) {
        if (n == 1) {
            System.out.print(n);
        } else {
            decBin(n / 2);
        }
         return n % 2;
    }
}

    

    

