package Inimigos; // Pode criar um pacote "Inimigos" se preferir

import Heros.Personagem;
import Items.ArmaduraTecido;
import Items.Item;
import java.util.Random;

public class EspectroAtormentado extends Personagem {

    public EspectroAtormentado(String nome, String descricao, int vida, int ataque) {

        super("Espectro Atormentado", "O fantasma de um antigo mago que não consegue descansar", 250, 45);
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
        System.out.println(this.nome + " Dementou " + alvo.getNome() + "!");
        alvo.receberDano(35);
    }

    @Override
    public Item droparLoot() {

        if (new Random().nextDouble() <= 0.5) {
            return new ArmaduraTecido("Manto do Arquimago Estrelado", "Um tecido intergalático, aumenta drasticamente o poder de magias arcanas", 10, 10);
        }
        if (new Random().nextDouble() <= 0.4) {
            return new ArmaduraTecido("Vestimentas de Seda Encantada", "Leve como uma pluma, foi tecida com fios de mana, garantindo uma alta inteligência", 35, 10);
        }
        if (new Random().nextDouble() <= 0.3) {
            return new ArmaduraTecido("Trajes do Acólito Sombrio", "Roupas escuras que se mesclam às sombras. Aumentam a eficácia de maldições e dificultam que o usuário seja detectado", 20, 15);
        }
        if (new Random().nextDouble() <= 0.2) {
            return new ArmaduraTecido("Manto do Tecelão de Mana", "Este manto converte uma pequena porcentagem do dano mágico sofrido ao agressor", 5, 25);
        }
        if (new Random().nextDouble() <= 0.1) {
            return new ArmaduraTecido("Togas do Profeta Silencioso", "Usadas por oráculos que renunciam a fala, inteligência extrema", 75, 30);
        }

        return null;
    }
}
