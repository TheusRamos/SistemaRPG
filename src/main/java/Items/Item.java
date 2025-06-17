package Items;

import java.io.Serializable;


public abstract class Item implements Serializable {
    private static final long serialVersionUID = 1L;

    String nome;
    String descricao;

    public Item(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }
    
    
}