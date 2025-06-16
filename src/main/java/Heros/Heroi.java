package Heros;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alunos
 */
public abstract class Heroi {
    protected String nome;
    protected String guildName;
    protected int level;
    protected int vidaAtual;
    protected int vidaMaxima;
    protected int manaMaxima;
    protected int manaAtual;
    protected int danoFisico;
    protected int danoMagico;

    @Override
    public String toString() {
        return "Heroi{" + "nome=" + nome + ", guildName=" + guildName + ", level=" + level + ", vidaAtual=" + vidaAtual + ", vidaMaxima=" + vidaMaxima + ", manaMaxima=" + manaMaxima + ", manaAtual=" + manaAtual + ", danoFisico=" + danoFisico + ", danoMagico=" + danoMagico + '}';
    }
    
    
    
}


/*
- nome: String
- nivel: int
- vidaAtual: int
- vidaMaxima: int
- manaAtual: int
- manaMaxima: int
- danoFisico: int
- danoMagico: int

*/