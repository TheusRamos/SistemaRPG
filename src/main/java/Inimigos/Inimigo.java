package Inimigos; // Pode criar um pacote "Inimigos" se preferir

import Heros.Personagem;
import Items.Item;
import Items.Machado;
import java.util.Random;

public class Inimigo extends Personagem {
    
    public Inimigo(String nome, String descricao, int vida, int ataque) {
        
        super("Goblin", "Ser da natureza", 200, 15);
    }

    
    @Override
     public boolean estaVivo() {
        if(this.vidaAtual > 0){
            return true;
        } else {
            return false;
        }
    }


    @Override
    public void atacar(Personagem alvo) {
        System.out.println(this.nome + " ataca ferozmente " + alvo.getNome() + "!");
        alvo.receberDano(this.ataqueAdicional); // Usando defesaFisica como ataque base do monstro
    }
    
    public Item droparLoot() {
        
        if (new Random().nextDouble() <= 0.4) {
            return new Machado("Machado de Lenhador", "Um machado simples e rústico", 3);
        }
        if (new Random().nextDouble() <= 0.3) {
            return new Machado("Machado de Guerra de Ferro", "Forjado para batalhas", 3);
        }
        if (new Random().nextDouble() <= 0.2) {
            return new Machado("Machado Duplo de Anão", "Poderoso, mas pesado", 3);
        }
        if (new Random().nextDouble() <= 0.1) {
            return new Machado("Machado Executer de Orgrimmar", "Arma temível dos orcs.", 3);
        }
        if (new Random().nextDouble() <= 0.02) {
            return new Machado("Lamento Sombrio (Shadowmourne)", "Lendário machado imbuído com almas", 3);
        }
        
        return null;
    }
}
