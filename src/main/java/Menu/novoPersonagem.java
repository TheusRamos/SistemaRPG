package Menu;

import Heros.Arqueiro;
import Heros.DancarinoDasLaminas;
import Heros.Mago;
import Heros.Personagem;
import java.util.Scanner;

public class novoPersonagem {

    public static Personagem criarPersonagem() {
        Scanner ler = new Scanner(System.in);
        Personagem personagemCriado = null;

        while (personagemCriado == null) {
            System.out.println("\n--- CRIAÇÃO DE PERSONAGEM ---");
            System.out.println("Escolha sua classe: ");
            System.out.println("[1] Mago");
            System.out.println("[2] Arqueiro");
            System.out.println("[3] Dançarino das lâminas");

            int escolha = ler.nextInt();
            ler.nextLine(); // <<-- ESSA LINHA CORRIGE O BUG! ELA CONSOME O "ENTER".

            System.out.println("\nDigite o nome do seu novo herói: ");
            String nome = ler.nextLine();

            switch (escolha) {
                case 1:
                    personagemCriado = new Mago(nome);
                    break;
                case 2:
                    personagemCriado = new Arqueiro(nome);
                    break;
                case 3:
                    personagemCriado = new DancarinoDasLaminas(nome);
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
                    break;
            }
        }
        return personagemCriado;
    }
}