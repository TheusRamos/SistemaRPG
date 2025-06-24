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
public class DancarinoDasLaminas extends Personagem implements Serializable {

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
        double chanceRobustez = new Random().nextDouble();
        if (chanceRobustez <= robustez && chanceRobustez > 0) {
            this.vidaAtual -= dano / 2;
            if (this.vidaAtual < 0) {
                this.vidaAtual = 0;

            }
            System.out.println(this.nome + "recebeu menos dano por sua robustez, recebendo " + dano + " de dano!\nVida restante: " + this.vidaAtual);
        } else {
            this.vidaAtual -= dano;
            if (this.vidaAtual < 0) {
                this.vidaAtual = 0;
            }
            System.out.println(this.nome + " recebeu " + dano + " de dano!\nVida restante: " + this.vidaAtual);
        }
    }

    public DancarinoDasLaminas(String nome) {
        super(nome, "Enquanto guerreiros brutos confiam na força e em armaduras pesadas, o Dançarino das "
                + "Lâminas transforma o combate em uma arte mortal. Para eles, a batalha é uma dança, e "
                + "cada passo, esquiva e corte é um movimento coreografado para a aniquilação. Armados "
                + "com lâminas ágeis, eles mergulham no coração da luta, tornando-se um turbilhão de aço "
                + "que fatia os inimigos com uma velocidade e graça estonteantes. Sua defesa é seu ataque "
                + "avassalador e sua mobilidade constante, tornando-os um alvo quase impossível de se atingir. "
                + "Escolher esta classe é abraçar o risco pelo prêmio de um poder ofensivo sem igual no combate "
                + "corpo a corpo.", 850, 0, 0, 0.2, 0.1, 15, 26, 25);
    }

    @Override
    public void atacar(Personagem alvo) {
        System.out.println(this.nome + " acerta o machado em " + alvo.getNome() + "!");
        // Lógica de dano simples baseada na inteligência
        int dano = this.ataqueAdicional;
        alvo.receberDano(dano);
    }

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
