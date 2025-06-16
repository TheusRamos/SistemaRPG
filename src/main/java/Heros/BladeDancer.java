/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Heros;

/**
 *
 * @author alunos
 */
public class BladeDancer extends Heroi {
    private int atqSpeed;
    private int penetracao;
    
    public BladeDancer(String nome){
        super.nome = nome;
       
        super.danoFisico = 20;
        super.danoMagico = 0;
        super.level = 1;
        super.manaAtual = 100;
        super.manaMaxima = 100;
        super.vidaAtual = 1000;
        super.vidaMaxima = 1000;
        this.atqSpeed = 20;
        this.penetracao = 10;
    }
    
    public void equiparMachados(){
        
    }
    public void equiparArmadura(){
        
    }

    public int getAtqSpeed() {
        return atqSpeed;
    }

    public int getPenetracao() {
        return penetracao;
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
        return super.toString() + "BladeDancer{" + "atqSpeed=" + atqSpeed + ", penetracao=" + penetracao + '}';
    }
     
    
    
    
}
