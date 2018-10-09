
import java.util.TreeMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 */
public class Cliente
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int numCliente;
    private String nomeCliente;
    private int NIFCliente;
    private int assiduidade;
    private TreeMap<Integer, Servico> listaServicos;
    
    public Cliente()
    {
        this.numCliente = 0;
        this.nomeCliente = "a";
        this.NIFCliente = 0;
        this.assiduidade = 0;
    }
    
    public Cliente(int num, String nome, int nif){
        this.numCliente = num;
        this.nomeCliente = nome;
        this.NIFCliente = nif;
        this.assiduidade = 0;
    }
    
    public Cliente(int num, String nome, int nif, int ass)
    {
        this.numCliente = num;
        this.nomeCliente = nome;
        this.NIFCliente = nif;
        this.assiduidade = ass;
        this.listaServicos = new TreeMap<Integer,Servico>();
    }

  
    public int getNumCliente(){
        return this.numCliente;
    }
    
    public String getNomeCliente(){
        return this.nomeCliente;
    }
    
    public int getNIFCliente(){
        return this.NIFCliente;
    }
    
    public int getAssiduidade(){
        return this.assiduidade;
    }
    
    public void setNumCliente(int num){
        this.numCliente = num;
    }
    
    public void setNomeCliente(String nome){
        this.nomeCliente = nome;
    }
    
    public void setNIFCliente(int nif){
        this.NIFCliente = nif;
    }
    
    public void setAssiduidade(int ass){
        this.assiduidade = ass;
    }
    
    public Cliente clone(){
        return new Cliente(this.numCliente,this.nomeCliente,this.NIFCliente,this.assiduidade);
    }
    
    public boolean equals(Cliente c){
        if(c!=null){
            return this.numCliente == c.getNumCliente();
        }else{
            return false;
        }
    }
    
    public String toString(){
        return ("Numero de cliente: "+this.numCliente+"/ Nome: "+this.nomeCliente+"/ NIF: "+this.NIFCliente+"/ Assiduidade: "+this.assiduidade);
    }
    
    
    
        
}
