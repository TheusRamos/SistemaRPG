/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Heros;

import Items.Item;
import java.io.Serializable;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Servidor
 */
public class Arqueiro extends Personagem implements Serializable {

    private static final long serialVersionUID = 1L;

    @Override
    public boolean estaVivo() {
        if (this.vidaAtual > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void receberDano(int dano) {
        double chanceEsquiva = new Random().nextDouble();
        if (chanceEsquiva <= esquiva && chanceEsquiva > 0) {
            this.vidaAtual -= 0;
            System.out.println(this.nome + " se esquivou do ataque!" + "\nVida restatnte: " + this.vidaAtual);
        } else {
            this.vidaAtual -= dano;
            if (this.vidaAtual < 0) {
                this.vidaAtual = 0;
            }
            System.out.println(this.nome + " recebeu " + dano + " de dano! Vida restante: " + this.vidaAtual);
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
        double chance = new Random().nextDouble();
        if (chance <= critico && chance > 0) {
            System.out.println(this.nome + "causou um acerto crítico em " + alvo.getNome() + "!");
            int dano = (this.ataqueAdicional * 2) + this.inteligencia;
            alvo.receberDano(dano);
            return;
        }
        System.out.println(this.nome + " atira uma flecha " + alvo.getNome() + "!");

        int dano = this.ataqueAdicional + this.inteligencia;
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
