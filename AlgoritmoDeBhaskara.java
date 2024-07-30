/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmo.de.bhaskara;

import java.util.Scanner;

/**
 *
 * @author Isa
 */
public class AlgoritmoDeBhaskara {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
     
     float a, b, c, x1, x2, delta, raiz, div, div2;
     
     System.out.println("Vamos calcular Bhaskara!");
        System.out.println("Primeiro vamos decidir os valores de A, B e C.");
        
        System.out.println("Valor A: ");
       a = teclado.nextFloat();
       
        System.out.println("Valor B: ");
        b = teclado.nextFloat();
        
        System.out.println("Valor C: ");
        c = teclado.nextFloat();
        
        System.out.println(a + ", " + b + " e " + c);
        //VALORES OK
        
        System.out.println(" ");
         
        System.out.println("Agora, vamos calcular o DELTA.");
        System.out.println("O calculo de delta e feito fazendo sua potencia, multiplicando 4 por A e C e entao subtraindo os dois resultados. Assim, teremos o resultado: ");
        delta = (a*a)-4*a*c;
        System.out.println(delta);
        //CALCULO DO DELTA OK
        
        System.out.println(" ");
        
        System.out.println("Agora, vamos encontrar a RAIZ QUADRADA de DELTA.");
        System.out.println("Para descobrirmos a raiz basta sabermos qual numero multiplicado por ele mesmo resulta no numero dentro da raiz.");
        System.out.println("No caso de " + delta + ", teremos o resultado: ");
        raiz = (float) Math.sqrt(delta) ;
        
        System.out.println(raiz);
        //RAIZ QUADRADA OK
        
        System.out.println(" ");
        
        System.out.println("Agora que ja sabemos o DELTA e a RAIZ, podemos fazer o restante do calculo!");
        
        System.out.println(" ");
        
        System.out.println("Vamos calcular o X1 a seguir:");
        System.out.println("Para fazermos esse calculo precisaremos fazer a soma de -(B) com o resultado da RAIZ, para então fazermos a divisao por 2xA.");
        System.out.println("O resultado final de X1 sera:");
        x1 = -b + raiz;
        div = x1 / (2*a);
        
        System.out.println("X1= " + div);
        
        System.out.println(" ");
        
        System.out.println("Vamos calcular o X2 a seguir:");
        System.out.println("Para fazermos esse calculo precisaremos fazer a subtracao de -(B) com o resultado da RAIZ, para então fazermos a divisao por 2xA.");
        System.out.println("O resultado final de X2 sera:");
        x2 = -b - raiz;
        div2 = x2 / (2*a);
        
        System.out.println("X2= " + div2);
        //OK
    }
    
}
