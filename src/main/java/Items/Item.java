package Items;

import java.io.Serializable;

public abstract class Item implements Serializable {

    private static final long serialVersionUID = 1L;
    private double esquiva;
    private int defesa;
    String nome;
    String descricao;
    double critico;
    private int Inteligencia;
    private int defesaMagica;
    int inteligenciaAdicional;

    private double robustez;
    int ataqueAdicional;

    public Item(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public int getDefesa() {
        return defesa;
    }

    public double getRobustez() {
        return robustez;
    }

    public int getAtaqueAdicional() {
        return ataqueAdicional;
    }

    public double getEsquiva() {
        return esquiva;
    }

    public double getCritico() {
        return critico;
    }

    public int getInteligencia() {
        return Inteligencia;
    }

    public int getDefesaMagica() {
        return defesaMagica;
    }

    public int getInteligenciaAdicional() {
        return inteligenciaAdicional;
    }

}
