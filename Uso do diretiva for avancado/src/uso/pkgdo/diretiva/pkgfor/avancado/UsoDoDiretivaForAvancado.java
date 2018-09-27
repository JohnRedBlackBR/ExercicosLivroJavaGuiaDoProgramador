/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uso.pkgdo.diretiva.pkgfor.avancado;

/**
 *
 * @author John
 */
public class UsoDoDiretivaForAvancado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double arranjo[] = {1.1964, 6.1995, 6.1935, 7.1935, 12.1968};
        
        System.out.print("For comun [ ");
        int tamanho = arranjo.length;
        for(int i = 0; i < tamanho ; i++){
            System.out.print(arranjo[i] + " ");
        }
        System.out.println("] Fim");
        
        System.out.print("For avancado [ ");
        for(double elemento: arranjo){
            System.out.print(elemento + " ");
        }
        System.out.println("] Fim");
    }
    
}
