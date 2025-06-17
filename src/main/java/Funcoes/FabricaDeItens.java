package Funcoes;

import Items.Arco;
import Items.ArmaduraLeve;
import Items.ArmaduraPesada;
import Items.ArmaduraTecido;
import Items.Cajado;
import Items.Machado;
import java.util.ArrayList;
import java.util.List;

public class FabricaDeItens {

    public static List<Machado> criarTodosOsMachados() {
        List<Machado> machados = new ArrayList<>();

        machados.add(new Machado("Machado de Lenhador", "Um machado simples e rústico.", 10));
        machados.add(new Machado("Machado de Guerra de Ferro", "Forjado para batalhas.", 17));
        machados.add(new Machado("Machado Duplo de Anão", "Poderoso, mas pesado.", 23));
        machados.add(new Machado("Machado Executer de Orgrimmar", "Arma temível dos orcs.", 30));
        machados.add(new Machado("Lamento Sombrio (Shadowmourne)", "Lendário machado imbuído com almas.", 55));

        return machados;
    }

    public static List<Cajado> criarTodosOsCajados() {
        List<Cajado> cajados = new ArrayList<>();

        cajados.add(new Cajado("Cajado de Aprendiz", "Um galho de árvore com um cristal na ponta.", 5, 15));
        cajados.add(new Cajado("Cajado do Conjurador", "Focado em canalizar mana.", 10, 30));
        cajados.add(new Cajado("Cajado do Arquimago", "Pulsa com poder arcano.", 15, 50));
        cajados.add(new Cajado("Cajado das Raízes Telúricas", "Especializado em magias de natureza.", 15, 65));
        cajados.add(new Cajado("Cetro da Tempestade Uivante", "Amplifica feitiços de tempestade uivante.", 25, 73));

        return cajados;
    }

    public static List<ArmaduraPesada> criarTodasAsArmadurasPesadas() {
        List<ArmaduraPesada> armadurasPesadas = new ArrayList<>();

        armadurasPesadas.add(new ArmaduraPesada("Peitoral do Bastião de Aço", "Forjado para ser a última linha de defesa, esta armadura é quase impenetrável, mas exige grande força para ser utilizada.", 0.1, 22));
        armadurasPesadas.add(new ArmaduraPesada("Armadura de Placas Dracônicas", "Feitas a partir de escamas de dragão, oferece uma resistência incrível a fogo e ataques físicos.", 0.2, 25));
        armadurasPesadas.add(new ArmaduraPesada("Indumentária do Colosso", "Uma armadura tão massiva que dizem ter sido usada por gigantes. Aumenta a defesa proporcionalmente à vida perdida em combate.", 0.3, 29));
        armadurasPesadas.add(new ArmaduraPesada("A Égide da Aurora", "Placas de metal branco abençoadas pela luz do sol. Cega os inimigos que ousam atacar o seu portador.", 0.4, 35));
        armadurasPesadas.add(new ArmaduraPesada("Muralha de Obisidiana", "Polida a partir de rocha vulcânica, esta armadura absorve uma parte do dano recebido e o converte em um contra-ataque de fogo.", 0.5, 55));

        return armadurasPesadas;
    }

    public static List<ArmaduraTecido> criarTodasAsArmadurasTecido() {
        List<ArmaduraTecido> armadurasTecido = new ArrayList<>();

        armadurasTecido.add(new ArmaduraTecido("Manto do Arquimago Estrelado", "Um tecido intergalático, aumenta drasticamente o poder de magias arcanas.", 10, 10));
        armadurasTecido.add(new ArmaduraTecido("Vestimentas de Seda Encantada", "Leve como uma pluma, foi tecida com fios de mana, garantindo uma alta inteligência.", 35, 10));
        armadurasTecido.add(new ArmaduraTecido("Trajes do Acólito Sombrio", "Roupas escuras que se mesclam às sombras. Aumentam a eficácia de maldições e dificultam que o usuário seja detectado", 20, 15));
        armadurasTecido.add(new ArmaduraTecido("Manto do Tecelão de Mana", "Este manto converte uma pequena porcentagem do dano mágico sofrido ao agressor.", 5, 25));
        armadurasTecido.add(new ArmaduraTecido("Togas do Profeta Silencioso", "Usadas por oráculos que renunciam a fala, inteligência extrema.", 75, 30));

        return armadurasTecido;
    }

    public static List<Arco> criarTodosOsArcos() {
        List<Arco> arcos = new ArrayList<>();
        
        arcos.add(new Arco("Arco do Susurro do Vento", "Feito de madeira ancestral. Suas flechas voam sem emitir som.", 35, 0.1));
        arcos.add(new Arco("Presa da Serpente", "Arco curto e recurvado, feito de osso de víbora, As flechas disparadas por ele têm chance de aplicar veneno.", 40, 0.2));
        arcos.add(new Arco("Clarão Estelar", "Um arco mágico que acumula luz ambiente. Cada disparo libera um rastro luminoso que pode cegar os oponentes.", 45, 0.3));
        arcos.add(new Arco("Espinho do Deserto", "Construído com a espinha dorsal de uma fera do deserto, este arco é pesado mas possuí muito dano.", 55, 0.4));
        arcos.add(new Arco("Corvo Vigia", "Um arco de ébano, com penas de corvo entalhadas. Aumenta a chance de acerto crítico contra alvos distantes.", 60, 0.5));
        
        return arcos;
    }
    
    public static List<ArmaduraLeve> criarTodasAsArmadurasLeves(){
        List<ArmaduraLeve> armadurasLeves = new ArrayList<>();
        
        armadurasLeves.add(new ArmaduraLeve("Corselete de Couro Sombrio","Couro tingido com extrato de cogumelos.",0.1, 15));
        armadurasLeves.add(new ArmaduraLeve("Traje do Dançarino das lâminas","Uma armadura de couro flexível com placas de metal estratégicamente posicionadas para maior mobilidade",0.2,18));
        armadurasLeves.add(new ArmaduraLeve("Gibão do Patrulheiro Veloz","Leve e resistente.",0.3,20));
        armadurasLeves.add(new ArmaduraLeve("Proteção do Vento Cortante","Couro encantado com espiritos do ar. Esta armadura concede ao usuario a habilidade de se esquivar com mais facilidade",0.4,23));
        armadurasLeves.add(new ArmaduraLeve("Manto do Andarilho Silencioso","Uma capa e túnica de couro macio, torna a furtividade sua maior virtude",0.5,29));
        
        return armadurasLeves;
    }

}
