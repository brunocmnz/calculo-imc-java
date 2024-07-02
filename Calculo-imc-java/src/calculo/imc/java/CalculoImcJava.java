/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculo.imc.java;

/**
 *
 * @author bruno
 */
public class CalculoImcJava {
    
    public static double calculaImc(double altura, double peso) {
        return  (peso / (Math.pow(altura, 2)));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double altura = 1.8;
        double peso = 85.5;
        double imc = calculaImc(altura, peso);
        System.out.printf("Meu imc é: %.2f\n",imc);
    }
    
}
