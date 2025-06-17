/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Items;

/**
 *
 * @author Servidor
 */
public class Machado extends Arma {
     private static final long serialVersionUID = 1L;

    

    public Machado(String nome, String descricao, int ataqueAdicional) {
        super(nome, descricao, ataqueAdicional);
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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
