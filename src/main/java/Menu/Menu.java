/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

import Heros.Arqueiro;
import Heros.DancarinoDasLaminas;
import Heros.Mago;
import Heros.Personagem;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Servidor
 */
public class Menu {

    Scanner ler = new Scanner(System.in);

    public static void exibirMenu() {
        System.out.println("\t\t-------------------------------- MENU PRINCIPAL --------------------------------");
        System.out.println("\n                                [1] NOVO JOGO    [2] CARREGAR JOGO    [3] SAIR");

    }

    public static Personagem novoJogo() {
        return novoPersonagem.criarPersonagem();
    }

    public static Personagem carregarJogo() {
        Scanner ler = new Scanner(System.in);
        List<Personagem> personagensCarregados = carregarPersonagem.carregar();
        System.out.println("Qual personagem deseja carregar? ");
        int contador = 0;
        for (Personagem e : personagensCarregados) {
            Personagem personagemAtual = e;
            if (personagemAtual instanceof Mago) {
                System.out.println(contador + " [Mago] -->  " + personagemAtual.getNome());
                contador++;
            }
            if (personagemAtual instanceof Arqueiro) {
                System.out.println(contador + " [Arqueiro] -->  " + personagemAtual.getNome());
                contador++;
            }
            if (personagemAtual instanceof DancarinoDasLaminas) {
                System.out.println(contador + " [DancarinoDasLaminas] -->  " + personagemAtual.getNome());
                contador++;
            }
        }
        System.out.print("Digite o NÚMERO do personagem que deseja carregar: ");
        int escolha = ler.nextInt();
        ler.nextLine(); // Consome o "Enter" pendente

        Personagem personagemCarregado = null;
        if (escolha >= 0 && escolha < personagensCarregados.size()) {
            personagemCarregado = personagensCarregados.get(escolha);
        } else {
            System.out.println("Escolha inválida.");
        }

        return personagemCarregado;
    }

    public static void menuAventura() {

        System.out.println("Sua próxima ação:");
        System.out.println("[1] Explorar mapa: ");
        System.out.println("[2] Salvar e sair: ");

    }
}
