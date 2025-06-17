package Heros;

import Items.*;

import Items.Machado;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Personagem {

    protected String nome;
    protected String descricao;
    protected int ataqueAdicional;
    protected int vidaMaxima;
    protected int inteligencia;
    protected double critico;
    protected double robustez;
    protected double esquiva;
    protected int defesaMagica;
    protected int defesaFisica;

    // NOVOS ATRIBUTOS ESSENCIAIS
    protected int vidaAtual;
    protected Map<String, Item> equipamentos;
    protected List<Item> inventario;

    public Personagem(String nome, String descricao, int vidaMaxima, int inteligencia, double critico, double robustez, double esquiva, int defesaMagica, int defesaFisica, int ataqueAdicional) {
        this.nome = nome;
        this.descricao = descricao;
        this.vidaMaxima = vidaMaxima;
        this.vidaAtual = vidaMaxima;
        this.inteligencia = inteligencia;
        this.critico = critico;
        this.robustez = robustez;
        this.esquiva = esquiva;
        this.defesaMagica = defesaMagica;
        this.defesaFisica = defesaFisica;
        this.inventario = new ArrayList<>();
        this.equipamentos = new HashMap<>();
        this.ataqueAdicional = ataqueAdicional;
    }

    public Personagem(String nome, String descricao, int vida, int ataque) {
        this.nome = nome;
        this.descricao = descricao;
        this.vidaMaxima = vida;
        this.ataqueAdicional = ataque;
        this.vidaAtual = vidaMaxima;
    }

    public abstract void atacar(Personagem alvo);

    public void receberDano(int dano) {
        this.vidaAtual -= dano;
        if (this.vidaAtual < 0) {
            this.vidaAtual = 0;
        }
        System.out.println(this.nome + " recebeu " + dano + " de dano! Vida restante: " + this.vidaAtual);
    }

    public boolean estaVivo() {
        if (this.vidaAtual > 0) {
            return true;
        } else {
            return false;
        }
    }

    public int getVidaAtual() {
        return vidaAtual;
    }

    public Map<String, Item> getEquipamentos() {
        return equipamentos;
    }

    public void equiparItem(String nomeItem) {

        if (this.inventario == null) {
            System.out.println("Inventário vazio!!");
        }
        for (Item e : inventario) {
            System.out.println("Entrou.");
            if (nomeItem.equalsIgnoreCase(e.getNome())) {
                if (!this.equipamentos.isEmpty()) {
                    System.out.println("Já tem um item equipado.");
                    return;
                } else {
                    this.equipamentos.put("Arma", e);
                    System.out.println("- " + e.getNome() + " " + "equipado com sucesso.");
                    return;
                }

            } else {
                System.out.println("Item inexistente no seu inventario.");
            }
        }
        System.out.println("Inventario vazio.");
    }

    public void mostrarInventario() {
        if (this.inventario != null) {
            for (Item e : inventario) {
                System.out.println("- " + e.getNome());
                if (e instanceof Arco) {
                    Arco arco = (Arco) e;
                    System.out.println(" Atributos do item:"
                            + "Ataque adicional: " + arco.getAtaqueAdicional()
                            + "Critico: " + arco.getCritico() + "\n");
                } else if (e instanceof Machado) {
                    Machado machado = (Machado) e;
                    System.out.println(" Atributos do item:"
                            + "Ataque adicional: " + machado.getAtaqueAdicional() + "\n");
                } else if (e instanceof Cajado) {
                    Cajado cajado = (Cajado) e;
                    System.out.println(" Atributos do item:"
                            + "Inteligencia: " + cajado.getInteligenciaAdicional()
                            + "Ataque Adicional: " + cajado.getAtaqueAdicional() + "\n");
                } else if (e instanceof ArmaduraTecido) {
                    ArmaduraTecido armaduraTecido = (ArmaduraTecido) e;
                    System.out.println(" Atributos do item:"
                            + "Inteligencia: " + armaduraTecido.getInteligencia()
                            + "Defesa Magica: " + armaduraTecido.getDefesaMagica() + "\n");
                } else if (e instanceof ArmaduraTecido) {
                    ArmaduraLeve armaduraLeve = (ArmaduraLeve) e;
                    System.out.println(" Atributos do item: "
                            + "Esquiva: " + armaduraLeve.getEsquiva()
                            + "Defesa: " + armaduraLeve.getDefesa() + "\n");
                } else if (e instanceof ArmaduraPesada) {
                    ArmaduraPesada armaduraPesada = (ArmaduraPesada) e;
                    System.out.println(" Atributos do item:"
                            + "Robustez: " + armaduraPesada.getRobustez()
                            + "Defesa: " + armaduraPesada.getDefesa() + "\n");
                }

            }
        } else {
            System.out.println("Seu inventario esta vazio..");
        }

    }

    public Item droparLoot() {
        return null;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public double getCritico() {
        return critico;
    }

    public double getRobustez() {
        return robustez;
    }

    public double getEsquiva() {
        return esquiva;
    }

    public int getDefesaMagica() {
        return defesaMagica;
    }

    public int getDefesaFisica() {
        return defesaFisica;
    }

    public List<Item> getInventario() {
        return inventario;
    }
}
