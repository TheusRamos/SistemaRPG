/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Items;

/**
 *
 * @author Servidor
 */
public class ArmaduraTecido extends Armadura {

    private static final long serialVersionUID = 1L;

    private int Inteligencia;
    private int defesaMagica;

    public ArmaduraTecido(String nome, String descricao, int inteligencia, int defesaMagica) {
        super(nome, descricao);
        this.Inteligencia = inteligencia;
        this.defesaMagica = defesaMagica;
    }

    public int getInteligencia() {
        return Inteligencia;
    }

    public int getDefesaMagica() {
        return defesaMagica;
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
