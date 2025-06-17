package Menu; // Ou um novo pacote "Controllers"

import Inimigos.Inimigo;
import Heros.Personagem;
import Items.Item;
import java.util.Scanner;

public class Combate {

    public static boolean iniciarCombate(Personagem personagem, Inimigo monstro) {
        Scanner ler = new Scanner(System.in);
        System.out.println("\n--- UM " + monstro.getNome().toUpperCase() + " APARECEU! ---");
        
        while (personagem.estaVivo() && monstro.estaVivo()) {
            // Turno do Herói
            System.out.println("\n--- SEU TURNO ---");
            System.out.println("Vida do Herói: " + personagem.getVidaAtual());
            System.out.println("Vida do Monstro: " + monstro.getVidaAtual());
            System.out.println("Escolha sua ação: [1] Atacar [2] Fugir");
            int escolha = ler.nextInt();

            if (escolha == 1) {
                personagem.atacar(monstro);
            } else {
                System.out.println("Você fugiu da batalha!");
                return true; // Considera que o jogador sobreviveu
            }

            // Turno do Monstro (se ele ainda estiver vivo)
            if (monstro.estaVivo()) {
                System.out.println("\n--- TURNO DO MONSTRO ---");
                monstro.atacar(personagem);
            }
        }

        // Fim do combate
        if (personagem.estaVivo()) {
            System.out.println("\nVocê venceu a batalha!");
            Item loot = monstro.droparLoot();
            if (loot != null) {
                System.out.println("Você encontrou um item: " + loot.getNome());
                personagem.getInventario().add(loot);
            }
            return true;
        } else {
            System.out.println("\nVocê foi derrotado... Fim de jogo.");
            return false;
        }
    }
}
