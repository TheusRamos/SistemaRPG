/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Items;

/**
 *
 * @author Servidor
 */
public class Cajado extends Arma {

    private static final long serialVersionUID = 1L;

    int inteligenciaAdicional;

    public Cajado(String nome, String descricao, int ataqueAdicional, int inteligenciaAdicional) {
        super(nome, descricao, ataqueAdicional);
        this.inteligenciaAdicional = inteligenciaAdicional;
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

    public int getInteligenciaAdicional() {
        return inteligenciaAdicional;
    }

}
