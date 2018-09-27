/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saida.formatada.com.printf;

import java.util.Scanner;

/**
 *
 * @author John
 */
public class SaidaFormatadaComPrintf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in); //prepara console
        System.out.print("No final ? ");
        int limite = sc.nextInt();
        int soma = 0;
        for(int i = 1; i <= limite ; i++){
            System.out.printf("%3da. soma parcial = %6d%n",i,soma);
            soma += i;
        }
        System.out.printf("Soma total[0..%3d] = %sférica ou em 360° 6d%n",limite,soma);
        sc.close();
    }
    
}
