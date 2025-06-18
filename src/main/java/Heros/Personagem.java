package Heros;

import Items.*;

import Items.Machado;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Personagem {

    protected String nome;
    protected String descricao;
    protected int ataqueAdicional;
    protected int vidaMaxima;
    protected int inteligencia;
    protected double critico;
    protected double robustez;
    protected double esquiva;
    protected int defesaMagica;
    protected int defesaFisica;

    // NOVOS ATRIBUTOS ESSENCIAIS
    protected int vidaAtual;
    protected Map<String, Item> equipamentos;
    protected List<Item> inventario;

    public Personagem(String nome, String descricao, int vidaMaxima, int inteligencia, double critico, double robustez, double esquiva, int defesaMagica, int defesaFisica, int ataqueAdicional) {
        this.nome = nome;
        this.descricao = descricao;
        this.vidaMaxima = vidaMaxima;
        this.vidaAtual = vidaMaxima;
        this.inteligencia = inteligencia;
        this.critico = critico;
        this.robustez = robustez;
        this.esquiva = esquiva;
        this.defesaMagica = defesaMagica;
        this.defesaFisica = defesaFisica;
        this.inventario = new ArrayList<>();
        this.equipamentos = new HashMap<>();
        this.ataqueAdicional = ataqueAdicional;
    }

    public Personagem(String nome, String descricao, int vida, int ataque) {
        this.nome = nome;
        this.descricao = descricao;
        this.vidaMaxima = vida;
        this.ataqueAdicional = ataque;
        this.vidaAtual = vidaMaxima;
    }

    public abstract void atacar(Personagem alvo);

    public void receberDano(int dano) {
        this.vidaAtual -= dano;
        if (this.vidaAtual < 0) {
            this.vidaAtual = 0;
        }
        System.out.println(this.nome + " recebeu " + dano + " de dano! Vida restante: " + this.vidaAtual);
    }

    public boolean estaVivo() {
        if (this.vidaAtual > 0) {
            return true;
        } else {
            return false;
        }
    }

    public int getVidaAtual() {
        return vidaAtual;
    }

    public Map<String, Item> getEquipamentos() {
        return equipamentos;
    }

    public void equiparItem(String nomeItem) {

        Item itemParaEquipar = null;
        for (Item item : this.inventario) {
            if (item.getNome().equalsIgnoreCase(nomeItem)) {
                itemParaEquipar = item;
                break;
            }
        }
        if (itemParaEquipar == null) {
            System.out.println("Item '" + nomeItem + "' não encontrado no seu inventário.");
            return;
        }
        if (itemParaEquipar instanceof Arma) {
            if (this.equipamentos.containsKey("Arma")) {
                System.out.println("Você já tem uma arma equipada. Desequipe-a primeiro.");
                return;
            }

            if (itemParaEquipar instanceof Machado && this instanceof DancarinoDasLaminas) {
                Machado machado = (Machado) itemParaEquipar;
                this.ataqueAdicional += machado.getAtaqueAdicional();
                this.equipamentos.put("Arma", machado);
                System.out.println(machado.getNome() + " equipado com sucesso.");
            } else if (itemParaEquipar instanceof Arco && this instanceof Arqueiro) {
                Arco arco = (Arco) itemParaEquipar;
                this.critico += arco.getCritico();
                this.ataqueAdicional += arco.getAtaqueAdicional();
                this.equipamentos.put("Arma", arco);
                System.out.println(arco.getNome() + " equipado com sucesso.");
            } else if (itemParaEquipar instanceof Cajado && this instanceof Mago) {
                Cajado cajado = (Cajado) itemParaEquipar;
                this.inteligencia += cajado.getInteligenciaAdicional();

                this.equipamentos.put("Arma", cajado);
                System.out.println(cajado.getNome() + " equipado com sucesso.");
            } else {
                System.out.println("Sua classe não pode equipar " + itemParaEquipar.getNome() + ".");
            }
        } else if (itemParaEquipar instanceof Armadura) {
            if (this.equipamentos.containsKey("Armadura")) {
                System.out.println("Você já tem uma armadura equipada. Desequipe-a primeiro.");
                return;
            }

            if (itemParaEquipar instanceof ArmaduraPesada && this instanceof DancarinoDasLaminas) {
                ArmaduraPesada armadura = (ArmaduraPesada) itemParaEquipar;
                this.defesaFisica += armadura.getDefesa();
                this.robustez += armadura.getRobustez();
                this.equipamentos.put("Armadura", armadura);
                System.out.println(armadura.getNome() + " equipado com sucesso.");
            } else if (itemParaEquipar instanceof ArmaduraLeve && this instanceof Arqueiro) {
                ArmaduraLeve armaduraLeve = (ArmaduraLeve) itemParaEquipar;
                this.defesaFisica += armaduraLeve.getDefesa();
                this.esquiva += armaduraLeve.getEsquiva();
                System.out.println(armaduraLeve.getNome() + " equipado com sucesso.");
            } else if (itemParaEquipar instanceof ArmaduraTecido && this instanceof Mago) {
                ArmaduraTecido armaduraTecido = (ArmaduraTecido) itemParaEquipar;
                this.defesaMagica += armaduraTecido.getDefesaMagica();
                this.inteligencia += armaduraTecido.getInteligencia();
                System.out.println(armaduraTecido.getNome() + " equipado com sucesso.");
            } else {
                System.out.println("Sua classe não pode equipar " + itemParaEquipar.getNome() + ".");
            }
        }
    }

    public void mostrarInventario() {
        if (this.inventario != null) {
            for (Item e : inventario) {
                System.out.println("- " + e.getNome());
                if (e instanceof Arco) {
                    Arco arco = (Arco) e;
                    System.out.println(" Atributos do item:"
                            + "\nAtaque adicional: " + arco.getAtaqueAdicional()
                            + "\nCritico: " + arco.getCritico() + "\n");
                } else if (e instanceof Machado) {
                    Machado machado = (Machado) e;
                    System.out.println(" Atributos do item:"
                            + "\nAtaque adicional: " + machado.getAtaqueAdicional() + "\n");
                } else if (e instanceof Cajado) {
                    Cajado cajado = (Cajado) e;
                    System.out.println(" Atributos do item:"
                            + "\nInteligencia: " + cajado.getInteligenciaAdicional()
                            + "\nAtaque Adicional: " + cajado.getAtaqueAdicional() + "\n");
                } else if (e instanceof ArmaduraTecido) {
                    ArmaduraTecido armaduraTecido = (ArmaduraTecido) e;
                    System.out.println(" Atributos do item:"
                            + "\nInteligencia: " + armaduraTecido.getInteligencia()
                            + "\nDefesa Magica: " + armaduraTecido.getDefesaMagica() + "\n");
                } else if (e instanceof ArmaduraTecido) {
                    ArmaduraLeve armaduraLeve = (ArmaduraLeve) e;
                    System.out.println(" Atributos do item: "
                            + "\nEsquiva: " + armaduraLeve.getEsquiva()
                            + "\nDefesa: " + armaduraLeve.getDefesa() + "\n");
                } else if (e instanceof ArmaduraPesada) {
                    ArmaduraPesada armaduraPesada = (ArmaduraPesada) e;
                    System.out.println(" Atributos do item:"
                            + "\nRobustez: " + armaduraPesada.getRobustez()
                            + "\nDefesa: " + armaduraPesada.getDefesa() + "\n");
                }

            }
        } else {
            System.out.println("Seu inventario esta vazio..");
        }

    }

    

    public Item droparLoot() {
        return null;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public double getCritico() {
        return critico;
    }

    public double getRobustez() {
        return robustez;
    }

    public double getEsquiva() {
        return esquiva;
    }

    public int getDefesaMagica() {
        return defesaMagica;
    }

    public int getDefesaFisica() {
        return defesaFisica;
    }

    public List<Item> getInventario() {
        return inventario;
    }

    @Override
    public String toString() {
        return "Personagem:" 
                + "\nnome =" + nome 
                
                + "\nataqueAdicional = " + ataqueAdicional 
                + "\nvidaMaxima = " + vidaMaxima 
                + "\ninteligencia = " + inteligencia 
                + "\ncritico = " + critico 
                + "\nrobustez = " + robustez 
                + "\nesquiva = " + esquiva 
                + "\ndefesaMagica = " + defesaMagica 
                + "\ndefesaFisica = " + defesaFisica 
                + "\nvidaAtual = " + vidaAtual 
                + "\nequipamentos = " + equipamentos.toString();
                
    }
    
}
