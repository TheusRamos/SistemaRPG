/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Heros;

/**
 *
 * @author alunos
 */
public class Mage extends Heroi {
    private int Critico;
    private int precisao;
    
    public Mage(String nome){
        super.nome = nome;
        
        super.danoFisico = 0;
        super.danoMagico = 20;
        super.level = 1;
        super.manaAtual = 200;
        super.manaMaxima = 200;
        super.vidaAtual = 650;
        super.vidaMaxima = 650;
        this.Critico = 20;
        this.precisao = 20;
    }
    
    public void equiparCajado(){
        
    }
    public void equiparTecido(){
        
    }

    public int getCritico() {
        return Critico;
    }

    public int getPrecisao() {
        return precisao;
    }

    public String getNome() {
        return nome;
    }

    public String getGuildName() {
        return guildName;
    }

    public int getLevel() {
        return level;
    }

    public int getVidaAtual() {
        return vidaAtual;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public int getManaMaxima() {
        return manaMaxima;
    }

    public int getManaAtual() {
        return manaAtual;
    }

    public int getDanoFisico() {
        return danoFisico;
    }

    public int getDanoMagico() {
        return danoMagico;
    }

    @Override
    public String toString() {
        return super.toString() +  "Mage{" + "Critico=" + Critico + ", precisao=" + precisao + '}';
    }
    
    
}
