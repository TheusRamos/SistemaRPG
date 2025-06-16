/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

import Heros.Arqueiro;
import Heros.DancarinoDasLaminas;
import Heros.Mago;
import Heros.Personagem;
import java.util.Scanner;

/**
 *
 * @author Servidor
 */
public class novoPersonagem {

    public static Personagem criarPersonagem() {

        Scanner ler = new Scanner(System.in);

        Personagem novoPersonagem = null;

        System.out.println("--- CRIAÇÃO DE PERSONAGEM ---");
        System.out.println("Escolha sua classe: ");
        System.out.println("[1] Mago");
        System.out.println("[2] Arqueiro");
        System.out.println("[3] Dançarino das lâminas");
        int escolha = ler.nextInt();
        boolean looping = true;
        while (looping) {
            switch (escolha) {
                case 1:
                    System.out.println("Digite o nome do heroi: ");
                    String nomeMago = ler.nextLine();
                    Mago novoMago = new Mago(nomeMago);
                    if (escolha == 1) {
                        novoPersonagem = novoMago;
                    }
                    looping = false;
                    break;

                case 2:
                    System.out.println("Digite o nome do heroi: ");
                    String nomeArqueiro = ler.nextLine();
                    Arqueiro novoArqueiro = new Arqueiro(nomeArqueiro);
                    if (escolha == 2) {
                        novoPersonagem = novoArqueiro;
                    }
                    looping = false;
                    break;

                case 3:
                    System.out.println("Digite o nome do heroi: ");
                    String nomeDancarinoDasLaminas = ler.nextLine();
                    DancarinoDasLaminas novoDancarinoDasLaminas = new DancarinoDasLaminas(nomeDancarinoDasLaminas);
                    if (escolha == 3) {
                        novoPersonagem = novoDancarinoDasLaminas;
                    }
                    looping = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
        return novoPersonagem;
    }
}
