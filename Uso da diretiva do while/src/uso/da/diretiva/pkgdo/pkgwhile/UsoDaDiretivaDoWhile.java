/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uso.da.diretiva.pkgdo.pkgwhile;

/**
 *
 * @author John
 */
public class UsoDaDiretivaDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int min = Integer.parseInt(args[0]), max = Integer.parseInt(args[1]);
        do{
            System.out.println(min + " < " + max);
            min++; max--;
        }while(min < max);
        System.out.println(min + " < " + max + " Condicao invalida!");
    }
}
