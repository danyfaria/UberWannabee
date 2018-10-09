/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 */
public class Veiculo
{
    private String matricula;
    private boolean disponibilidade;
    
    Veiculo(String mat){
        this.matricula = mat;
        this.disponibilidade = true;
    }
    
    Veiculo(String mat,boolean disp){
        this.matricula = mat;
        this.disponibilidade = disp;
    }
    
    public String getMatricula(){
        return this.matricula;
    }
    
    public boolean getDisponibilidade(){
        return this.disponibilidade;
    }
    
    public void setDisponibilidade(boolean disp){
        this.disponibilidade = disp;
    }
    
    public boolean equals(Veiculo v){
        if(v!=null){
            return(this.matricula.equals(v.getMatricula()));
        }else{
                return false;
        }
    }
    
    public Veiculo clone(){
        return new Veiculo(this.matricula,this.disponibilidade);
    }
    
    
    
}