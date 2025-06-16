/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Heros;

import Items.Item;
import java.util.List;

/**
 *
 * @author Servidor
 */
public class Mago extends Personagem {
    private static final long serialVersionUID = 1L;
    
    public Mago(String nome ){
        super(nome, "Mestres do arcano, os Magos manipulam as forças da realidade como um artista manipula suas tintas. "
                + "Para eles, o campo de batalha é uma tela em branco onde pintam com fogo, gelo e relâmpagos. "
                + "Sua força não reside em músculos ou armaduras, mas em anos de estudo e uma mente disciplinada, "
                + "capaz de decorar palavras de poder que podem dizimar exércitos ou proteger aliados. Embora seu corpo "
                + "seja frágil," + "sua mente é uma arma de destruição em massa, fazendo deles os mais temidos causadores de "
                + "dano à distância. Escolher o caminho do Mago é escolher o poder em sua forma mais pura e volátil.", 550, 10, 0, 0, 2, 10, 2);
    }
    
   
    
    /*
    protected String nome;
    protected String descricao;
    protected int vidaMaxima;
    protected int inteligencia;
    protected int critico;
    protected int robustez;
    protected int esquiva;
    protected int defesaMagica;
    protected int defesaFisica;
    */

}
