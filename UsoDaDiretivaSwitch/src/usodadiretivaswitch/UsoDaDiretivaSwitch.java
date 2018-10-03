/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usodadiretivaswitch;

/**
 *
 * @author John
 */
public class UsoDaDiretivaSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if(args.length > 0){ // testa prensença de argumentos
            switch(args[0].charAt(0)){ // avalia inicio do primeiro argumento
                case 'a': //argumento com inicial a minuscula ou maiuscula
                case 'A': System.out.println("Vogal A.");
                    break;
                case 'e':
                case 'E': System.out.println("Vogal E.");
                    break;
                case 'i':
                case 'I': System.out.println("Vogal I.");
                    break;
                case 'o':
                case 'O': System.out.println("Vogal O.");
                    break;
                case 'u':
                case 'U': System.out.println("Vogal U.");
                    break;
                default: //inicial não e uma vogal
                    System.out.println("Não e uma vogal");
            }
        }
    }
    
}
