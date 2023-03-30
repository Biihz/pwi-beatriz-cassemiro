
package atividade;

public class atividade {
    
    void Resul(){
        int par = 0;
        int impar = 1;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " Par");
                par = par + i;
            } else {
                System.out.println(i + " Impar");
                impar = impar + i;
            }
            System.out.println("Os valores de par são: " + par );
            
            System.out.println("Os valores de impar são: " + impar);
            
            if (par > impar){
                System.out.println("Os números pares são maiores!");
            } else {
                System.out.println("Os número impares são menores!");

        }
    }
    }
}
