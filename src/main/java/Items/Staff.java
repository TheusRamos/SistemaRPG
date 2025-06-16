/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Items;

/**
 *
 * @author alunos
 */
public class Staff extends DamageItem {
    
    
    
    Staff(int danoFisico, int danoMagico, int penetracao, int precisao, int atqSpeed, int critico){
        super.danoFisico = 0;
        super.danoMagico = 155;
        super.critico = 10;
        super.penetracao = 0;
        super.precisao = 20;
        super.atqSpeed = 0;
    }

    public int getDanoFisico() {
        return danoFisico;
    }

    public int getDanoMagico() {
        return danoMagico;
    }

    public int getPenetracao() {
        return penetracao;
    }

    public int getPrecisao() {
        return precisao;
    }

    public int getAtqSpeed() {
        return atqSpeed;
    }

    public int getCritico() {
        return critico;
    }
    
    
    
}
