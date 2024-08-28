
package matriz;


import java.util.Random;



public class Matriz {

   
    public static void main(String[] args) {
        
        int dimen = 9350;
        Random random = new Random ();
        long Tiempo1 = System.currentTimeMillis();
        int [][] Array = new int [dimen][dimen];
        
        for (int i = 0; i < dimen; i++) {
            for (int j = 0; j < dimen; j++) {
                Array [i][j] = random.nextInt(100);
            }
        }
        long Tiempo2 = System.currentTimeMillis();
        long TiempoFinal = (Tiempo2 - Tiempo1);
        
        System.out.println(  TiempoFinal + " ms");
    }
    
}
