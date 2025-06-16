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
    public void atacar(Personagem alvo) {
        System.out.println(this.nome + " ataca ferozmente " + alvo.getNome() + "!");
        alvo.receberDano(this.defesaFisica); // Usando defesaFisica como ataque base do monstro
    }
    
    public Item droparLoot() {
        // Exemplo: 50% de chance de dropar um machado simples
        if (new Random().nextDouble() <= 0.5) {
            return new Machado("Machado Enferrujado", "Um machado de goblin.", 3);
        }
        return null;
    }
}