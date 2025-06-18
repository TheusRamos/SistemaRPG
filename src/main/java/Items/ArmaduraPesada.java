/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Items;

/**
 *
 * @author Servidor
 */
public class ArmaduraPesada extends Armadura {
    private static final long serialVersionUID = 1L;
    
    private double robustez;
    private int defesa;
    
    public ArmaduraPesada(String nome, String descricao, double robustez, int defesa) {
        super(nome,descricao);
        this.robustez = robustez;
        this.defesa = defesa;
    }

    public double getRobustez() {
        return robustez;
    }

    @Override
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
