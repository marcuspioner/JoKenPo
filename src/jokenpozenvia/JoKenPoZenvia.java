package jokenpozenvia;

import java.util.Scanner;
/**
 *
 * @author Marcus Pioner <marcuspioner@outlook.com>
 */
public class JoKenPoZenvia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int vegetta, goku;

        System.out.println("Por favor escolha entre os números 0, 1 e 2 , sendo : ");
        System.out.println("=== Pedra = 0 ===");
        System.out.println("=== Papel = 1 ===");
        System.out.println("=== Tesoura = 2 ===");

        System.out.println("Vegetta: ");
        vegetta = scan.nextInt();

        System.out.println("Goku: ");
        goku = scan.nextInt();

        switch (vegetta) {
            case 0:
                switch (goku) {
                    case 0:
                        System.out.println("Empate");
                        break;
                    case 1:
                        System.out.println("Goku: Puxa Vegetta acho que venci!!!");
                        break;
                    case 2:
                        System.out.println("Vegetta: Venci! Você é um inseto Kakaroto!!!");
                        break;
                    default:
                        System.out.println("Ow puxa resposta errada!!! Junte as esferas do dragão e tente novamente");
                }
                break;
                
            case 1:
                switch (goku) {
                    case 0:
                        System.out.println("Vegetta: Venci! Você é um inseto Kakaroto!!!!!!");
                        break;
                    case 1:
                        System.out.println(" Empatou");
                        break;
                    case 2:
                        System.out.println("Goku: Puxa Vegetta acho que venci!!!");
                        break;
                    default:
                        System.out.println("Ow puxa resposta errada!!! Junte as esferas do dragão e tente novamente");
                }
                break;
                
            case 2:
                switch (goku) {
                    case 0:
                        System.out.println("Goku: Puxa Vegetta acho que venci!!!");
                        break;
                    case 1:
                        System.out.println("Vegetta: Venci! Você é um inseto Kakaroto!!!!!!");
                        break;
                    case 2:
                        System.out.println("Empate");
                        break;
                    default:
                        System.out.println("Ow puxa resposta errada!!! Junte as esferas do dragão e tente novamente");
                }
                break;
            default:
                System.out.println("Ow puxa resposta errada!!! Junte as esferas do dragão e tente novamente");
        }
    }
}
