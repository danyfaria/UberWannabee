
/**
 * Escreva a descrição da classe Veiculo aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Veiculo
{
    private String matricula;
    private boolean disponibilidade;
    
    Veiculo(String mat){
        this.matricula = mat;
        this.disponibilidade = false;
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
