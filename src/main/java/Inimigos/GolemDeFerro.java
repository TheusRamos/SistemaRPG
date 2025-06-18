package Inimigos; // Pode criar um pacote "Inimigos" se preferir

import Heros.Personagem;

import Items.*;
import java.util.Random;

public class GolemDeFerro extends Personagem {
    
    public GolemDeFerro(String nome, String descricao, int vida, int ataque) {
        
        super("Golem de Ferro", "Uma estátua de metal trazida à vida por magia elemental", 550, 15);
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
        System.out.println(this.nome + " tacou uma pedra em " + alvo.getNome() + "!");
        alvo.receberDano(0);
    }
    
    @Override
    public Item droparLoot() {
        
        if (new Random().nextDouble() <= 0.5) {
            return new ArmaduraPesada("Peitoral do Bastião de Aço", "Forjado para ser a última linha de defesa, esta armadura é quase impenetrável, mas exige grande força para ser utilizada", 0.1, 22);
        }
        if (new Random().nextDouble() <= 0.4) {
            return new ArmaduraPesada("Armadura de Placas Dracônicas", "Feitas a partir de escamas de dragão, oferece uma resistência incrível a fogo e ataques físicos", 0.2, 25);
        }
        if (new Random().nextDouble() <= 0.3) {
            return new ArmaduraPesada("Indumentária do Colosso", "Uma armadura tão massiva que dizem ter sido usada por gigantes. Aumenta a defesa proporcionalmente à vida perdida em combate", 0.3, 29);
        }
        if (new Random().nextDouble() <= 0.2) {
            return new ArmaduraPesada("A Égide da Aurora", "Placas de metal branco abençoadas pela luz do sol. Cega os inimigos que ousam atacar o seu portador", 0.4, 35);
        }
        if (new Random().nextDouble() <= 0.1) {
            return new ArmaduraPesada("Muralha de Obisidiana", "Polida a partir de rocha vulcânica, esta armadura absorve uma parte do dano recebido e o converte em um contra-ataque de fogo", 0.5, 55);
        }
        
       
        
        return null;
    }
}