/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.sistemarpg;

import Funcoes.FabricaDeItens;
import Funcoes.GerenciadorDeArquivos;
import Heros.Personagem;
import Items.Arco;
import Items.ArmaduraLeve;
import Items.ArmaduraPesada;
import Items.ArmaduraTecido;
import Items.Cajado;
import Items.Machado;
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

        boolean looping = true;
        while(looping){
            //TODO
            Menu.exibirMenu();
            
            System.out.println("Escolha uma opção: ");
            int escolha = ler.nextInt();
            switch(escolha){
                case 1:
                    Menu.novoJogo();
                    break;
                case 2:
                    Menu.carregarJogo();
                    break;
                case 3:
                    looping = false;
                    break;
            }
        }
      
    }
}
