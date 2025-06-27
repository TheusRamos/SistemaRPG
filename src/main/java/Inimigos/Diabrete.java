package Inimigos; // Pode criar um pacote "Inimigos" se preferir

import Heros.Personagem;
import Items.Item;
import Items.Arco;
import java.util.Random;

public class Diabrete extends Personagem {

    public Diabrete(String nome, String descricao, int vida, int ataque) {

        super("Diabrete", "Ser do submundo", 250, 40);
    }

    @Override
    public boolean estaVivo() {
        if (this.vidaAtual > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void atacar(Personagem alvo) {
        System.out.println(this.nome + " mordeu " + alvo.getNome() + "!");
        alvo.receberDano(35);
    }

    @Override
    public Item droparLoot() {

        if (new Random().nextDouble() <= 0.5) {
            return new Arco("Arco do Susurro do Vento", "Feito de madeira ancestral. Suas flechas voam sem emitir som", 35, 0.1);
        }
        if (new Random().nextDouble() <= 0.4) {
            return new Arco("Presa da Serpente", "Arco curto e recurvado, feito de osso de víbora, As flechas disparadas por ele têm chance de aplicar veneno", 40, 0.2);
        }
        if (new Random().nextDouble() <= 0.3) {
            return new Arco("Clarão Estelar", "Um arco mágico que acumula luz ambiente. Cada disparo libera um rastro luminoso que pode cegar os oponentes", 45, 0.3);
        }
        if (new Random().nextDouble() <= 0.2) {
            return new Arco("Espinho do Deserto", "Construído com a espinha dorsal de uma fera do deserto, este arco é pesado mas possuí muito dano", 55, 0.4);
        }
        if (new Random().nextDouble() <= 0.1) {
            return new Arco("Corvo Vigia", "Um arco de ébano, com penas de corvo entalhadas. Aumenta a chance de acerto crítico contra alvos distantes", 60, 0.5);
        }

        return null;
    }
}
