
package javaapplication1;


public class JavaApplication1 {

   
    public static void main(String[] args) {
        
        
        int num1 = 220;
        int num2 = 284;

        if (sonAmigos(num1, num2)) {
            System.out.println(num1 + " y " + num2 + " son numeros amigos.");
        } else {
            System.out.println(num1 + " y " + num2 + " no son números amigos.");
        }
    }
    
    public static boolean sonAmigos (int a, int b){
        return (sumaDivisores(a) == b) && (sumaDivisores(b) == a);
    }
    
    public static int sumaDivisores (int num){
        
        int suma = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                suma += i;
            }
        }
        return suma;
    }
    
}
