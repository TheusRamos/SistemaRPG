/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

import java.util.Scanner;

/**
 *
 * @author Servidor
 */
public class Aventura {

    public static void aventura() {
        Scanner ler = new Scanner(System.in);

        boolean looping = true;
        int escolhaAventura;
        while (looping) {
            System.out.println("Sua próxima ação:");
            System.out.println("[1] Explorar mapa: ");
            System.out.println("[2] Salvar e sair: ");

            escolhaAventura = ler.nextInt();

        }

    }

}
