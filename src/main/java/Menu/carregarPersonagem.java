/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

import Funcoes.GerenciadorDeArquivos;
import Heros.Arqueiro;
import Heros.DancarinoDasLaminas;
import Heros.Mago;
import Heros.Personagem;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Servidor
 */
public class carregarPersonagem {

    public static List<Personagem> carregar() {
        Scanner ler = new Scanner(System.in);
        List<Personagem> listaPersonagens = new ArrayList<>();
        listaPersonagens = (List<Personagem>) GerenciadorDeArquivos.carregarPersonagens("personagens.dat");

        return listaPersonagens;
    }
}
