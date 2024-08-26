
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fatec-dsm2
 */
public class Passagem {
    private String nomePassageiro;
    private String rg;
    private String telefone;
    private String localViagem;
    private String data;
    private String horario;
    private int numPoltrona;
    
    Scanner sc = new Scanner(System.in);

    public Passagem() {
        this("", "", "", "", "", "", 0);
    }

    public Passagem(String nomePassageiro, String rg, String telefone, String localViagem, String data, String horario, int numPoltrona) {
        this.nomePassageiro = nomePassageiro;
        this.rg = rg;
        this.telefone = telefone;
        this.localViagem = localViagem;
        this.data = data;
        this.horario = horario;
        this.numPoltrona = numPoltrona;
    }

    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public void setNomePassageiro(String nomePassageiro) {
        this.nomePassageiro = nomePassageiro;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getLocalViagem() {
        return localViagem;
    }

    public void setLocalViagem(String localViagem) {
        this.localViagem = localViagem;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getNumPoltrona() {
        return numPoltrona;
    }

    public void setNumPoltrona(int numPoltrona) {
        this.numPoltrona = numPoltrona;
    }
    public void cadastrarDadosPassageiro(){
        System.out.println("Digite o nome do passageiro:");
        setNomePassageiro(sc.next());
        System.out.println("Digite o rg do passageiro:");
        setRg(sc.next());
        System.out.println("Digite o telefone do passageiro:");
        setTelefone(sc.next());
    }
    public void cadastrarDadosPassagem(){
        System.out.println("Digite o local da viagem:");
        setLocalViagem(sc.next());
        System.out.println("Digite a data da viagem:");
        setData(sc.next());
        System.out.println("Digite o horário da viagem:");
        setHorario(sc.next());
        System.out.println("Digite o número da poltrona:");
        setNumPoltrona(sc.nextInt());
    }
    public void mostrarDadosPassageiro(){
        System.out.println("*** Dados passageiro *** \n Nome: " + getNomePassageiro() + "\n RG: " + getRg() + "\n Telefone: " + getTelefone());
    }
    public void mostrarDadosPassagem(){
        System.out.println("*** Dados passagem *** \n Local da viagem: " + getLocalViagem() + "\n Data: " + getData() + "\n Horário: " + getHorario() + "\n Número da poltrona: " + getNumPoltrona());
    }
}
