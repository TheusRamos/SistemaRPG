/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.sistemarpg;

import Funcoes.FabricaDeItens;
import Funcoes.GerenciadorDeArquivos;
import Heros.Personagem;
import Inimigos.BatedorKobold;
import Inimigos.CultistaArcano;
import Inimigos.Diabrete;
import Inimigos.EspectroAtormentado;
import Inimigos.Goblin;
import Inimigos.GolemDeFerro;
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
import java.util.Random;
import java.util.Scanner;

import java.time.Duration;
import java.time.Instant;

/**
 *
 * @author alunos
 */
public class SistemaRPG {

    private static Instant ultimoAcampamento = null;

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        /*List<Machado> todosOsMachados = FabricaDeItens.criarTodosOsMachados();
        List<Cajado> todosOsCajados = FabricaDeItens.criarTodosOsCajados();
        List<ArmaduraPesada> todasAsArmadurasPesadas = FabricaDeItens.criarTodasAsArmadurasPesadas();
        List<ArmaduraTecido> todasAsArmadurasTecido = FabricaDeItens.criarTodasAsArmadurasTecido();
        List<ArmaduraLeve> todasAsArmadurasLeve = FabricaDeItens.criarTodasAsArmadurasLeves();
        List<Arco> todosOsArcos = FabricaDeItens.criarTodosOsArcos();*/
        String arquivoDeArcos = "arcos.dat";
        String arquivoDeArmadurasLeve = "armadurasLeve.dat";
        String arquivoDeArmadurasTecido = "armadurasTecido.dat";
        String arquivoDeArmadurasPesadas = "armadurasPesada.dat";
        String arquivoDeCajados = "cajados.dat";
        String arquivoDeMachados = "machados.dat";

        /*GerenciadorDeArquivos.salvarItens(todosOsArcos, arquivoDeArcos);
        GerenciadorDeArquivos.salvarItens(todasAsArmadurasLeve, arquivoDeArmadurasLeve);
        GerenciadorDeArquivos.salvarItens(todosOsCajados, arquivoDeCajados);
        GerenciadorDeArquivos.salvarItens(todosOsMachados, arquivoDeMachados);
        GerenciadorDeArquivos.salvarItens(todasAsArmadurasPesadas, arquivoDeArmadurasPesadas);
        GerenciadorDeArquivos.salvarItens(todasAsArmadurasTecido, arquivoDeArmadurasTecido);*/
        System.out.println("\n--- Carregando o jogo ---");
        List<Arco> arcosCarregados = (ArrayList<Arco>) GerenciadorDeArquivos.carregarItens(arquivoDeArcos);
        List<ArmaduraLeve> armadurasLevesCarregadas = (ArrayList<ArmaduraLeve>) GerenciadorDeArquivos.carregarItens(arquivoDeArmadurasLeve);
        List<Cajado> cajadosCarregados = (ArrayList<Cajado>) GerenciadorDeArquivos.carregarItens(arquivoDeCajados);
        List<Machado> machadosCarregados = (ArrayList<Machado>) GerenciadorDeArquivos.carregarItens(arquivoDeMachados);
        List<ArmaduraPesada> armadurasPesadasCarregadas = (ArrayList<ArmaduraPesada>) GerenciadorDeArquivos.carregarItens(arquivoDeArmadurasPesadas);
        List<ArmaduraTecido> armadurasTecidoCarregadas = (ArrayList<ArmaduraTecido>) GerenciadorDeArquivos.carregarItens(arquivoDeArmadurasTecido);
        
        /* //AQUI EU APENAS UTILIZEI PARA VERIFICAR SE ESTAVA CARREGANDO OS ITENS CERTINHO
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
         */
        

        Personagem personagem = null;
        boolean looping = true;

        while (looping) {

            Menu.exibirMenu();

            System.out.println("Escolha uma opção: ");
            int escolha = ler.nextInt();
            switch (escolha) {
                case 1:
                    personagem = Menu.novoJogo();
                    if (personagem != null) {
                        looping = false;
                    }
                    break;
                case 2:
                    personagem = Menu.carregarJogo();
                    if (personagem != null) {
                        System.out.println("Jogo carregado com sucesso para: " + personagem.getNome());
                        looping = false;
                    } else {
                        System.out.println("Nenhum personagem foi carregado. Retornando ao menu.");

                    }
                    break;
                case 3:
                    looping = false;
                    System.out.println("Encerrando jogo.");
                    System.exit(0);
                    break;
            }
        }

        while (personagem.estaVivo()) {
            System.out.println("\n--- Você está na entrada de uma floresta. O que deseja fazer? ---");
            System.out.println("[1] Explorar a área");
            System.out.println("[2] Ver inventário e equipar item");
            System.out.println("[3] Ver status do personagem");
            System.out.println("[4] Acampar");
            System.out.println("[5] Salvar e Sair");

            int escolhaAventura = ler.nextInt();

            switch (escolhaAventura) {
                case 1:
                    System.out.println("Enquanto adentra mais fundo a floresta, quando acontece o evento: ");
                    Random random = new Random();
                    int aleatorio = random.nextInt(6) + 1;
                    Personagem monstroEncontrado = null;
                    switch (aleatorio) {
                        case 1:
                            monstroEncontrado = new Goblin("Goblin", "Ser da natureza", 350, 20);
                            break;
                        case 2:
                            monstroEncontrado = new BatedorKobold("Batedor Kobold", "Uma criatura reptiliana pequena e ágil que vive em bandos", 150, 66);
                            break;
                        case 3:
                            monstroEncontrado = new CultistaArcano("Cultista Arcano", "Um fanático devoto de magias esquecidas", 200, 55);
                            break;
                        case 4:
                            monstroEncontrado = new Diabrete("Diabrete", "Ser do submundo", 250, 55);
                            break;
                        case 5:
                            monstroEncontrado = new EspectroAtormentado("Espectro Atormentado", "O fantasma de um antigo mago que não consegue descansar", 250, 40);
                            break;
                        case 6:
                            monstroEncontrado = new GolemDeFerro("Golem de Ferro", "Uma estátua de metal trazida à vida por magia elemental", 550, 15);
                            break;
                    }

                    boolean sobreviveu = Combate.iniciarCombate(personagem, monstroEncontrado);
                    if (!sobreviveu) {
                        return;
                    }
                    break;

                case 2:

                    System.out.println("Nome: " + personagem.getNome());
                    System.out.println("Vida: " + personagem.getVidaAtual() + "/" + personagem.getVidaMaxima());
                    System.out.println("Itens no seu inventario: ");

                    personagem.mostrarInventario();
                    ler.nextLine();
                    System.out.println("Deseja equipar algum item? [1]Sim [2]Não\n");
                    int opc = ler.nextInt();
                    if (opc == 1) {
                        if (personagem.getInventario().isEmpty()) {
                            System.out.println("Não tem itens para equipar.");
                        } else {
                            ler.nextLine();
                            System.out.println("Digite o nome do item que deseja equipar: ");
                            String nomeItem = ler.nextLine();
                            personagem.equiparItem(nomeItem);

                        }
                        break;
                    } else {
                        break;
                    }

                case 3:

                    System.out.println(personagem.toString());
                    break;

                case 4:
                    final long tempo = 200;
                    Instant agora = Instant.now();

                    boolean acampar = false;
                    long tempoRestante = 0;

                    if (ultimoAcampamento == null) {
                        acampar = true;
                    } else {
                        Duration tempoDesdeUltimoUso = Duration.between(ultimoAcampamento, agora);
                        if (tempoDesdeUltimoUso.toSeconds() >= tempo) {
                            acampar = true;
                        } else {
                            tempoRestante = tempo - tempoDesdeUltimoUso.toSeconds();
                        }
                    }
                    if (acampar) {
                        if (personagem.getVidaAtual() == personagem.getVidaMaxima()) {
                            System.out.println("Sua vida já está cheia. Você não precisa acampar.");
                            break;
                        }
                        System.out.println("Você monta um acampamento e começa a descansar...");
                        ultimoAcampamento = Instant.now();
                        try {
                            while (personagem.getVidaAtual() < personagem.getVidaMaxima()) {
                                personagem.receberCura(10);
                                System.out.println("Curando... " + personagem.getVidaAtual() + "/" + personagem.getVidaMaxima());
                                Thread.sleep(1000);
                            }
                        } catch (InterruptedException e) {

                            System.out.println("Seu descanso foi interrompido!");
                        }
                        System.out.println("Descanso completo. Você encheu a sua vida!");
                    } else {
                        System.out.println("Você precisa descansar mais antes de poder acampar novamente. Tente em " + tempoRestante + " segundos.");
                    }
                    break;

                case 5:
                    System.out.println("Salvando personagem...");
                    List<Personagem> heroisSalvos = (List<Personagem>) GerenciadorDeArquivos.carregarPersonagens("personagens.dat");
                    if (heroisSalvos == null) {
                        heroisSalvos = new ArrayList<>();
                    }
                    heroisSalvos.add(personagem);
                    GerenciadorDeArquivos.salvarPersonagem(heroisSalvos, "personagens.dat");
                    System.out.println("Personagem salvo com sucesso!");
                    return;
            }
        }
    }
}
