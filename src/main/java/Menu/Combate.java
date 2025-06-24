package Menu;

import Inimigos.Goblin;
import Heros.Personagem;
import Items.Item;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Combate {

    public static boolean iniciarCombate(Personagem personagem, Personagem monstro) {
        Scanner ler = new Scanner(System.in);
        System.out.println("\n--- UM " + monstro.getNome().toUpperCase() + " APARECEU! ---");

        while (personagem.estaVivo() && monstro.estaVivo()) {

            System.out.println("\n--- SEU TURNO ---");
            System.out.println("Vida do Herói: " + personagem.getVidaAtual());
            System.out.println("Vida do Monstro: " + monstro.getVidaAtual());
            System.out.println("Escolha sua ação: [1] Atacar [2] Fugir");
            int escolha = 0;

            while (escolha == 0) {

                try {
                    escolha = ler.nextInt();
                } catch (InputMismatchException e) {
                    ler.nextLine();
                    System.out.println("Valor inválido.");
                }
            }

            if (escolha > 0) {
                if (escolha == 1) {
                    personagem.atacar(monstro);
                } else {
                    System.out.println("Você fugiu da batalha!");
                    return true;
                }
                if (monstro.estaVivo()) {
                    System.out.println("\n--- TURNO DO MONSTRO ---");
                    monstro.atacar(personagem);
                }
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
