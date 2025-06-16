/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.sistemarpg;

import Heros.BladeDancer;
import Heros.Heroi;
import Heros.Mage;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alunos
 */
public class SistemaRPG {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Heroi> heros = new ArrayList<Heroi>();

        try {
            boolean looping = true;
            while (looping) {
                System.out.println("--------- MENU DO RPG ---------");
                System.out.println("[1] HEROI ");
                System.out.println("[2] VER HEROIS EXITENTES E SEUS STATUS");
                int option = Integer.parseInt(ler.nextLine());
                switch (option) {
                    case 1:
                        System.out.println("Selecione uma acao: \n[1] Criar novo heroi\n [2] Equipar meu heroi \n[3] Deletar meu heroi");
                        int option2 = Integer.parseInt(ler.nextLine());
                        switch (option2) {
                            case 1:
                                System.out.println("Selecione a classe do seu novo heroi: [1]BladeDancer \n[2]Mage\n");
                                int option3 = Integer.parseInt(ler.nextLine());
                                switch (option3) {
                                    case 1:
                                        System.out.println("Digite o nome do seu personagem: ");
                                        String nomeBlade = ler.nextLine();
                                        BladeDancer NewBlade = new BladeDancer(nomeBlade);
                                        heros.add(NewBlade);
                                        break;

                                    case 2:
                                        System.out.println("Digite o nome do seu personagem: ");
                                        String nomeMage = ler.nextLine();
                                        Mage NewMage = new Mage(nomeMage);
                                        heros.add(NewMage);
                                        break;

                                    default:
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }

        } catch (Exception e) {

        }

    }
}


/*BladeDancer NovoHeroi = new BladeDancer("Skyzacky", "MarvelSlot");
        Mage NewMage = new Mage("Syberman", "MarvelSlot");
        heros.add(NovoHeroi);
        heros.add(NewMage);
        
        
        for(Heroi e : heros){
            System.out.println(e.toString());
        }
 */
