/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.sistemarpg;

import Funcoes.FabricaDeItens;
import Funcoes.GerenciadorDeArquivos;
import Heros.Personagem;
import Inimigos.Inimigo;
import Items.Arco;
import Items.ArmaduraLeve;
import Items.ArmaduraPesada;
import Items.ArmaduraTecido;
import Items.Cajado;
import Items.Machado;
import Menu.Combate;
import Menu.Menu;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author alunos
 */
public class SistemaRPG {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        ArrayList<Personagem> heros = new ArrayList<Personagem>();

        List<Machado> todosOsMachados = FabricaDeItens.criarTodosOsMachados();
        List<Cajado> todosOsCajados = FabricaDeItens.criarTodosOsCajados();
        List<ArmaduraPesada> todasAsArmadurasPesadas = FabricaDeItens.criarTodasAsArmadurasPesadas();
        List<ArmaduraTecido> todasAsArmadurasTecido = FabricaDeItens.criarTodasAsArmadurasTecido();
        List<ArmaduraLeve> todasAsArmadurasLeve = FabricaDeItens.criarTodasAsArmadurasLeves();
        List<Arco> todosOsArcos = FabricaDeItens.criarTodosOsArcos();

        String arquivoDeArcos = "arcos.dat";
        String arquivoDeArmadurasLeve = "armadurasLeve.dat";
        String arquivoDeArmadurasTecido = "armadurasTecido.dat";
        String arquivoDeArmadurasPesadas = "armadurasPesada.dat";
        String arquivoDeCajados = "cajados.dat";
        String arquivoDeMachados = "machados.dat";

        GerenciadorDeArquivos.salvarItens(todosOsArcos, arquivoDeArcos);
        GerenciadorDeArquivos.salvarItens(todasAsArmadurasLeve, arquivoDeArmadurasLeve);
        GerenciadorDeArquivos.salvarItens(todosOsCajados, arquivoDeCajados);
        GerenciadorDeArquivos.salvarItens(todosOsMachados, arquivoDeMachados);
        GerenciadorDeArquivos.salvarItens(todasAsArmadurasPesadas, arquivoDeArmadurasPesadas);
        GerenciadorDeArquivos.salvarItens(todasAsArmadurasTecido, arquivoDeArmadurasTecido);

        System.out.println("\n--- Carregando o jogo ---");
        List<Arco> arcosCarregados = (ArrayList<Arco>) GerenciadorDeArquivos.carregarItens(arquivoDeArcos);
        List<ArmaduraLeve> armadurasLevesCarregadas = (ArrayList<ArmaduraLeve>) GerenciadorDeArquivos.carregarItens(arquivoDeArmadurasLeve);
        List<Cajado> cajadosCarregados = (ArrayList<Cajado>) GerenciadorDeArquivos.carregarItens(arquivoDeCajados);
        List<Machado> machadosCarregados = (ArrayList<Machado>) GerenciadorDeArquivos.carregarItens(arquivoDeMachados);
        List<ArmaduraPesada> armadurasPesadasCarregadas = (ArrayList<ArmaduraPesada>) GerenciadorDeArquivos.carregarItens(arquivoDeArmadurasPesadas);
        List<ArmaduraTecido> armadurasTecidoCarregadas = (ArrayList<ArmaduraTecido>) GerenciadorDeArquivos.carregarItens(arquivoDeArmadurasTecido);

        if (machadosCarregados != null) {
            System.out.println("\nMachados carregados do arquivo:");
            for (Machado machado : machadosCarregados) {
                System.out.println("- " + machado.getNome() + " (Ataque: " + machado.getAtaqueAdicional() + ")");
            }
        }
        if (cajadosCarregados != null) {
            System.out.println("\nCajados carregados do arquivo:");
            for (Cajado cajado : cajadosCarregados) {
                System.out.println("- " + cajado.getNome() + " (Ataque: " + cajado.getAtaqueAdicional() + ")" + "  " + "(Inteligência Adicional: " + cajado.getInteligenciaAdicional() + ")");
            }
        }
        if (arcosCarregados != null) {
            System.out.println("\nArcos carregados do arquivo:");
            for (Arco arcos : arcosCarregados) {
                System.out.println("- " + arcos.getNome() + " (Ataque adicional: " + arcos.getAtaqueAdicional() + ")" + "  " + "(Critico adicional: " + arcos.getCritico() + ")");
            }
        }
        if (armadurasPesadasCarregadas != null) {
            System.out.println("\nArmaduras Pesadas carregadas do arquivo:");
            for (ArmaduraPesada armaduraPesada : armadurasPesadasCarregadas) {
                System.out.println("- " + armaduraPesada.getNome() + " (Defesa: " + armaduraPesada.getDefesa() + ")" + "  " + "(Robustez: " + armaduraPesada.getRobustez() + ")");
            }
        }
        if (armadurasTecidoCarregadas != null) {
            System.out.println("\nArmaduras de tecido carregadas do arquivo:");
            for (ArmaduraTecido armadurasTecido : armadurasTecidoCarregadas) {
                System.out.println("- " + armadurasTecido.getNome() + " (Defesa Mágica: " + armadurasTecido.getDefesaMagica() + ")" + "  " + "(Inteligência Adicional: " + armadurasTecido.getInteligencia() + ")");
            }
        }
        if (armadurasLevesCarregadas != null) {
            System.out.println("\nArmaduras leves carregadas do arquivo:");
            for (ArmaduraLeve armadurasLeve : armadurasLevesCarregadas) {
                System.out.println("- " + armadurasLeve.getNome() + " (Defesa Física: " + armadurasLeve.getDefesa() + ")" + "  " + "(Esquiva: " + armadurasLeve.getEsquiva() + ")");
            }
        }

        // DIVISÃO DE CARREGAMENTOS ACIMA!!!
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        Personagem personagem = null;
        boolean looping = true;
        while (looping) {

            Menu.exibirMenu();

            System.out.println("Escolha uma opção: ");
            int escolha = ler.nextInt();
            switch (escolha) {
                case 1:
                    personagem = Menu.novoJogo();
                    if(personagem != null){
                        looping = false;
                    }
                    break;
                case 2:
                    personagem = Menu.carregarJogo();
                    if(personagem != null){
                        looping = false;
                    }
                    break;
                case 3:
                    if (personagem == null) {
                        System.out.println("Personagem não criado/carregado.");
                    } else {
                        looping = false;
                    }
                    break;
            }
        }
        
      
    
        while (personagem.estaVivo()) {
            System.out.println("\n--- Você está na entrada de uma floresta. O que deseja fazer? ---");
            System.out.println("[1] Explorar a área");
            System.out.println("[2] Ver status do personagem");
            System.out.println("[3] Salvar e Sair para o Menu Principal");
            
            int escolhaAventura = ler.nextInt();
            
            switch(escolhaAventura) {
                case 1:
                    System.out.println("Você adentra a floresta...");
                    // Lógica de evento aleatório
                    Inimigo monstroEncontrado = new Inimigo("Goblin Ladino", "Pequeno e irritante", 50, 10);
                    boolean sobreviveu = Combate.iniciarCombate(personagem, monstroEncontrado);
                    if (!sobreviveu) {
                        return; 
                    }
                    break;
                    
                case 2:
                    // Aqui chamaria um PersonagemController para mostrar o status
                    System.out.println("Nome: " + personagem.getNome());
                    System.out.println("Vida: " + personagem.getVidaAtual() + "/" + personagem.getVidaMaxima());
                    break;
                case 3:
                    System.out.println("Salvando o jogo... (não implementado)");
                    // GerenciadorDeArquivos.salvarPersonagem(heroi, "save.dat");
                    return; // Volta para o loop do menu principal
            }
        }
        
        System.out.println("--- FIM DE JOGO ---");
        
        
    

    }
}
