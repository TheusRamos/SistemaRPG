/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Items;

/**
 *
 * @author alunos
 */
public class Axes extends DamageItem {
    Axes(int danoFisico, int danoMagico, int penetracao, int precisao, int atqSpeed, int critico){
        super.danoFisico = 250;
        super.danoMagico = 0;
        super.critico = 20;
        super.penetracao = 40;
        super.precisao = 0;
        super.atqSpeed = 20;
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
