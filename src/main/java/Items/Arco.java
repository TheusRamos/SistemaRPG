/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Items;

/**
 *
 * @author Servidor
 */
public class Arco extends Arma {
    
    int critico;
    
   public Arco(String nome, String descricao, int ataqueAdicional, int critico) {
        super(nome, descricao, ataqueAdicional);
        this.critico = critico;
    }

    public int getCritico() {
        return critico;
    }

    @Override
    public int getAtaqueAdicional() {
        return ataqueAdicional;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }
   
   
}
