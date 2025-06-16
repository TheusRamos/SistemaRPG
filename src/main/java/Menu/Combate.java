package Menu; // Ou um novo pacote "Controllers"

import Inimigos.Inimigo;
import Heros.Personagem;
import Items.Item;
import java.util.Scanner;

public class Combate {

    public static boolean iniciarCombate(Personagem heroi, Inimigo monstro) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- UM " + monstro.getNome().toUpperCase() + " APARECEU! ---");

        while (heroi.estaVivo() && monstro.estaVivo()) {
            // Turno do Herói
            System.out.println("\n--- SEU TURNO ---");
            System.out.println("Vida do Herói: " + heroi.getVidaAtual());
            System.out.println("Vida do Monstro: " + monstro.getVidaAtual());
            System.out.println("Escolha sua ação: [1] Atacar [2] Fugir");
            int escolha = scanner.nextInt();

            if (escolha == 1) {
                heroi.atacar(monstro);
            } else {
                System.out.println("Você fugiu da batalha!");
                return true; // Considera que o jogador sobreviveu
            }

            // Turno do Monstro (se ele ainda estiver vivo)
            if (monstro.estaVivo()) {
                System.out.println("\n--- TURNO DO MONSTRO ---");
                monstro.atacar(heroi);
            }
        }

        // Fim do combate
        if (heroi.estaVivo()) {
            System.out.println("\nVocê venceu a batalha!");
            Item loot = monstro.droparLoot();
            if (loot != null) {
                System.out.println("Você encontrou um item: " + loot.getNome());
                heroi.getInventario().add(loot);
            }
            return true;
        } else {
            System.out.println("\nVocê foi derrotado... Fim de jogo.");
            return false;
        }
    }
}