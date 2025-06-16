package Heros;

import Items.Item;
import Items.Item;
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
    protected int critico;
    protected int robustez;
    protected int esquiva;
    protected int defesaMagica;
    protected int defesaFisica;

    // NOVOS ATRIBUTOS ESSENCIAIS
    protected int vidaAtual;
    protected Map<String, Item> equipamentos;
    protected List<Item> inventario;

    public Personagem(String nome, String descricao, int vidaMaxima, int inteligencia, int critico, int robustez, int esquiva, int defesaMagica, int defesaFisica, int ataqueAdicional) {
        this.nome = nome;
        this.descricao = descricao;
        this.vidaMaxima = vidaMaxima;
        this.vidaAtual = vidaMaxima; // Começa com a vida cheia
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
    
    public Personagem(String nome, String descricao, int vida, int ataque){
        this.nome = nome;
        this.descricao = descricao;
        this.vidaMaxima = vida;
        this.ataqueAdicional = ataque;
    }
    
    // NOVO MÉTODO ABSTRATO: força as subclasses a implementarem seu próprio ataque
    public abstract void atacar(Personagem alvo);

    // NOVO MÉTODO: para receber dano
    public void receberDano(int dano) {
        this.vidaAtual -= dano;
        if (this.vidaAtual < 0) {
            this.vidaAtual = 0;
        }
        System.out.println(this.nome + " recebeu " + dano + " de dano! Vida restante: " + this.vidaAtual);
    }

    // NOVO MÉTODO: para checar se está vivo
    public boolean estaVivo() {
        return this.vidaAtual > 0;
    }

    // Getters... (incluir getter para vidaAtual e equipamentos)
    public int getVidaAtual() {
        return vidaAtual;
    }

    public Map<String, Item> getEquipamentos() {
        return equipamentos;
    }
    
    // (Restante dos seus getters...)
    public String getNome() { return nome; }
    public String getDescricao() { return descricao; }
    public int getVidaMaxima() { return vidaMaxima; }
    public int getInteligencia() { return inteligencia; }
    public int getCritico() { return critico; }
    public int getRobustez() { return robustez; }
    public int getEsquiva() { return esquiva; }
    public int getDefesaMagica() { return defesaMagica; }
    public int getDefesaFisica() { return defesaFisica; }
    public List<Item> getInventario() { return inventario; }
}