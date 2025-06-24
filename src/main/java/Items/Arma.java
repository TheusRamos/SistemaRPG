/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Items;

/**
 *
 * @author Servidor
 */
public class Arma extends Item {

    private static final long serialVersionUID = 1L;

    int ataqueAdicional;

    public Arma(String nome, String descricao, int ataqueAdicional) {
        super(nome, descricao);
        this.ataqueAdicional = ataqueAdicional;
    }

    public int getAtaqueAdicional() {
        return ataqueAdicional;
    }

}
