import java.util.*;
public class main
{
    public static void main(String[] args){
        Empresa empresa = new Empresa();
        Scanner decision = new Scanner(System.in);
        int op;
        
        do{
            System.out.println("1 - Novo Cliente");
            System.out.println("2 - Novo Veiculo");
            System.out.println("3 - Novo Servico");
            System.out.println("0 - Sair");
            
            op = decision.nextInt();
            
            switch(op){
                case 1: empresa.novoCliente();
                        break;
                case 2: empresa.novoVeiculo();
                        break;
                case 3: empresa.novoServico();
                        break;
            }
        }while(op!=0);
    }
}

