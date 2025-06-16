/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

import Heros.Mago;
import Heros.Personagem;


/**
 *
 * @author Servidor
 */
public class Menu {
    
    public static void exibirMenu(){
        System.out.println("MENU\n\n");
        System.out.println("[1] NOVO JOGO\n");
        System.out.println("[2] CARREGAR JOGO\n");
        System.out.println("[3] SAIR\n");   
    }
    
    
    public static Personagem novoJogo(){
        return novoPersonagem.criarPersonagem();
    }
    public static Personagem carregarJogo(){
        return carregarPersonagem.carregar();
    }
}
