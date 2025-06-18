package Inimigos; // Pode criar um pacote "Inimigos" se preferir

import Heros.Personagem;
import Items.Item;
import Items.Machado;
import java.util.Random;

public class Goblin extends Personagem {
    
    public Goblin(String nome, String descricao, int vida, int ataque) {
        
        super("Goblin", "Ser da natureza", 350, 20);
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
        alvo.receberDano(0); // Usando defesaFisica como ataque base do monstro
    }
    
    @Override
    public Item droparLoot() {
        
        if (new Random().nextDouble() <= 0.5) {
            return new Machado("Machado de Lenhador", "Um machado simples e rústico", 10);
        }
        if (new Random().nextDouble() <= 0.4) {
            return new Machado("Machado de Guerra de Ferro", "Forjado para batalhas", 17);
        }
        if (new Random().nextDouble() <= 0.3) {
            return new Machado("Machado Duplo de Anão", "Poderoso, mas pesado", 23);
        }
        if (new Random().nextDouble() <= 0.2) {
            return new Machado("Machado Executer de Orgrimmar", "Arma temível dos orcs.", 30);
        }
        if (new Random().nextDouble() <= 0.1) {
            return new Machado("Lamento Sombrio (Shadowmourne)", "Lendário machado imbuído com almas", 55);
        }
        
        return null;
    }
}