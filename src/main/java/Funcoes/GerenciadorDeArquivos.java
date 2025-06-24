/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcoes;

import Heros.Personagem;
import Items.Item;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 *
 * @author Servidor
 */
public class GerenciadorDeArquivos {

    public static void salvarItens(List<? extends Item> listaItens, String nomeArquivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
            oos.writeObject(listaItens);
            System.out.println("Itens salvos com sucesso em " + nomeArquivo);
        } catch (IOException e) {
            System.err.println("Erro ao salvar os itens: " + e.getMessage());
        }
    }

    public static void salvarPersonagem(List<? extends Personagem> listaPersonagens, String nomeArquivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
            oos.writeObject(listaPersonagens);
            System.out.println("Personagens salvos com sucesso em " + nomeArquivo);
        } catch (IOException e) {
            System.err.println("Erro ao salvar os itens: " + e.getMessage());
        }
    }

    public static List<? extends Personagem> carregarPersonagens(String nomeArquivo) {
        List<? extends Personagem> listaPersonagens = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomeArquivo))) {
            listaPersonagens = (List<? extends Personagem>) ois.readObject();
            System.out.println("Personagem carregado com sucesso de " + nomeArquivo);
        } catch (FileNotFoundException e) {
            System.err.println("Arquivo não encontrado: " + nomeArquivo);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erro ao carregar os itens: " + e.getMessage());
        }
        return listaPersonagens;
    }

    public static List<? extends Item> carregarItens(String nomeArquivo) {
        List<? extends Item> listaItens = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomeArquivo))) {
            listaItens = (List<? extends Item>) ois.readObject();
            System.out.println("Itens carregados com sucesso de " + nomeArquivo);
        } catch (FileNotFoundException e) {
            System.err.println("Arquivo não encontrado: " + nomeArquivo);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erro ao carregar os itens: " + e.getMessage());
        }
        return listaItens;
    }
}
