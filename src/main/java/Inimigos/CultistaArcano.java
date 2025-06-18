package Inimigos; // Pode criar um pacote "Inimigos" se preferir

import Heros.Personagem;
import Items.Item;
import Items.Cajado;
import java.util.Random;

public class CultistaArcano extends Personagem {
    
    public CultistaArcano(String nome, String descricao, int vida, int ataque) {
        
        super("Cultista Arcano", "Um fanático devoto de magias esquecidas", 200, 55);
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
        System.out.println(this.nome + " ataca com magia arcana " + alvo.getNome() + "!");
        alvo.receberDano(0);
    }
    
    @Override
    public Item droparLoot() {
        
        if (new Random().nextDouble() <= 0.5) {
            return new Cajado("Cajado de Aprendiz", "Um galho de árvore com um cristal na ponta", 5, 15);
        }
        if (new Random().nextDouble() <= 0.4) {
            return new Cajado("Cajado do Conjurador", "Focado em canalizar mana", 10, 30);
        }
        if (new Random().nextDouble() <= 0.3) {
            return new Cajado("Cajado do Arquimago", "Pulsa com poder arcano", 15, 50);
        }
        if (new Random().nextDouble() <= 0.2) {
            return new Cajado("Cajado das Raízes Telúricas", "Especializado em magias de natureza", 15, 65);
        }
        if (new Random().nextDouble() <= 0.1) {
            return new Cajado("Cetro da Tempestade Uivante", "Amplifica feitiços de tempestade uivante", 25, 73);
        }
        
       
        
        return null;
    }
}