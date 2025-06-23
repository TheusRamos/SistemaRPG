/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Items;

/**
 *
 * @author Servidor
 */
public class ArmaduraLeve extends Armadura {

    private static final long serialVersionUID = 1L;

    private double esquiva;
    private int defesa;

    public ArmaduraLeve(String nome, String descricao, double esquiva, int defesa) {
        super(nome, descricao);
        this.esquiva = esquiva;
        this.defesa = defesa;
    }

    public double getEsquiva() {
        return esquiva;
    }

    public int getDefesa() {
        return defesa;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

}
