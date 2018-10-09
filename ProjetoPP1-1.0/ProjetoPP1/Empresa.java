import java.util.*;
/**
 * Escreva a descrição da classe Empresa aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Empresa 
{
    private TreeMap<Integer,Cliente> listaClientes;
    private Scanner scan = new Scanner(System.in);
    
    public Empresa()
    {
        this.listaClientes = new TreeMap<Integer,Cliente>();     
    }
    
    public void novoCliente(){
        
        System.out.println("NIF do cliente: ");
        int nif = Integer.parseInt(scan.nextLine());
        
        if(!listaClientes.containsKey(nif)){
            System.out.println("Nome do cliente: ");
            String nome = scan.nextLine();
            int numCliente = getTotalClientes() + 1;
            
            Cliente novo = new Cliente(numCliente,nome,nif,0);
            listaClientes.put(nif,novo);
            
        }else{
            System.out.println("NIF ja existe");
        }
    }
    
    public int getTotalClientes(){
        return this.listaClientes.size();
    }
            
            

    
}
