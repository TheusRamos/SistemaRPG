package Heros;

import Items.Item;
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author alunos
 */
public abstract class Personagem {

    protected String nome;
    protected String descricao;
    protected int vidaMaxima = 0;
    protected int inteligencia = 0;
    protected int critico = 0;
    protected int robustez = 0;
    protected int esquiva = 0;
    protected int defesaMagica = 0;
    protected int defesaFisica = 0;

    protected List<Item> inventario = new ArrayList<>();

    public Personagem(String nome, String descricao, int vidaMaxima, int inteligencia, int critico, int robustez, int esquiva, int defesaMagica, int defesaFisica) {
        this.nome = nome;
        this.descricao = descricao;
        this.vidaMaxima = vidaMaxima;
        this.inteligencia = inteligencia;
        this.critico = critico;
        this.robustez = robustez;
        this.esquiva = esquiva;
        this.defesaMagica = defesaMagica;
        this.defesaFisica = defesaFisica;
        this.inventario = new ArrayList<>();
    }

    public Personagem() {

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

    public int getCritico() {
        return critico;
    }

    public int getRobustez() {
        return robustez;
    }

    public int getEsquiva() {
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


/*
- nome: String
- desc: String
- vidaMaxima: int
- inteligencia : int
- critico : int
- robustez: int
- esquiva: int
- defesaMagica: int
- defesaFisica: int
 */
