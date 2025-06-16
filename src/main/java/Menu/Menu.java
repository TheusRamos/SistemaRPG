/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

import Heros.Mago;
import Heros.Personagem;
import java.util.Scanner;


/**
 *
 * @author Servidor
 */
public class Menu {
    Scanner ler = new Scanner(System.in);
    public static void exibirMenu(){
        System.out.println("MENU\n\n");
        System.out.println("[1] NOVO JOGO");
        System.out.println("[2] CARREGAR JOGO");
        System.out.println("[3] SAIR");   
    }
    
    
    public static Personagem novoJogo(){
        return novoPersonagem.criarPersonagem();
    }
    public static Personagem carregarJogo(){
        return carregarPersonagem.carregar();
    }
    
    public static void menuAventura(){
        
        System.out.println("Sua próxima ação:");
        System.out.println("[1] Explorar mapa: ");
        System.out.println("[2] Salvar e sair: ");
        
        
        
        
    }
}
