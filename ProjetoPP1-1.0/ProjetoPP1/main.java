import java.util.*;
/**
 * Escreva a descrição da classe main aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class main
{
    public static void main(String[] args){
        Empresa empresa = new Empresa();
        Scanner decision = new Scanner(System.in);
        int op;
        
        do{
            System.out.println("1 - Novo Cliente");
            System.out.println("0 - Sair");
            
            op = decision.nextInt();
            
            switch(op){
                case 1: empresa.novoCliente();
            }
        }while(op!=0);
    }
}
