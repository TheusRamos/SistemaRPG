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
public class Arqueiro extends Personagem {

    private static final long serialVersionUID = 1L;

    
    @Override
    public boolean estaVivo() {
        if(this.vidaAtual > 0){
            return true;
        } else {
            return false;
        }
    }
    public Arqueiro(String nome) {
        super(nome, "O Arqueiro é o predador silencioso, o olho que tudo vê e a flecha que nunca erra. "
                + "Com uma agilidade inigualável e uma conexão profunda com a natureza, eles se movem pelo "
                + "terreno como um fantasma, mantendo seus inimigos sempre à distância. Para um Arqueiro, "
                + "a sobrevivência e a vitória dependem de posicionamento preciso e de uma chuva incessante "
                + "de flechas que enfraquece o oponente antes que ele possa sequer revidar. Eles são caçadores "
                + "pacientes, mestres em preparar o terreno e desferir o golpe final com uma precisão letal.", 600, 10, 0.1, 0.1, 0.1, 5, 10, 40);
    }
    @Override
    public void atacar(Personagem alvo) {
     System.out.println(this.nome + " acerta o machado em " + alvo.getNome() + "!");
    // Lógica de dano simples baseada na inteligência
    int dano = this.ataqueAdicional; 
    alvo.receberDano(dano);   
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