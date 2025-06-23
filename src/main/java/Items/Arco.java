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

    double critico;

    public Arco(String nome, String descricao, int ataqueAdicional, double critico) {
        super(nome, descricao, ataqueAdicional);
        this.critico = critico;
    }

    @Override
    public double getCritico() {
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
