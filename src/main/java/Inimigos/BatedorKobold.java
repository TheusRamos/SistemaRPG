package Inimigos; // Pode criar um pacote "Inimigos" se preferir

import Heros.Personagem;
import Items.ArmaduraLeve;
import Items.ArmaduraTecido;
import Items.Item;
import java.util.Random;

public class BatedorKobold extends Personagem {

    public BatedorKobold(String nome, String descricao, int vida, int ataque) {

        super("Batedor Kobold", "Uma criatura reptiliana pequena e ágil que vive em bandos", 150, 36);
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
        System.out.println(this.nome + " acerta sua maça em " + alvo.getNome() + "!");
        alvo.receberDano(16);
    }

    @Override
    public Item droparLoot() {

        if (new Random().nextDouble() <= 0.5) {
            return new ArmaduraLeve("Corselete de Couro Sombrio", "Couro tingido com extrato de cogumelos", 0.1, 15);
        }
        if (new Random().nextDouble() <= 0.4) {
            return new ArmaduraLeve("Traje do Dançarino das lâminas", "Uma armadura de couro flexível com placas de metal estratégicamente posicionadas para maior mobilidade", 0.2, 18);
        }
        if (new Random().nextDouble() <= 0.3) {
            return new ArmaduraLeve("Gibão do Patrulheiro Veloz", "Leve e resistente", 0.3, 20);
        }
        if (new Random().nextDouble() <= 0.2) {
            return new ArmaduraLeve("Proteção do Vento Cortante", "Couro encantado com espiritos do ar. Esta armadura concede ao usuario a habilidade de se esquivar com mais facilidade", 0.4, 23);
        }
        if (new Random().nextDouble() <= 0.1) {
            return new ArmaduraLeve("Manto do Andarilho Silencioso", "Uma capa e túnica de couro macio, torna a furtividade sua maior virtude", 0.5, 29);
        }

        return null;
    }
}
