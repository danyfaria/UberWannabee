import java.util.*;

public class Empresa 
{
    private TreeMap<Integer,Cliente> listaClientes;
    private TreeMap<Integer,Servico> listaServicos;
    private ArrayList<Veiculo> listaVeiculos;
    private Scanner scan = new Scanner(System.in);
    
    public Empresa()
    {
        this.listaClientes = new TreeMap<Integer,Cliente>();
        this.listaServicos = new TreeMap<Integer,Servico>();
        this.listaVeiculos = new ArrayList<Veiculo>();
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
    
    public void listarServicosCliente(int nif){
        
        System.out.println("NIF do cliente: ");
        int nif2 = Integer.parseInt(scan.nextLine());
        
        
                
    }
    
    public void novoVeiculo(){
        boolean flag = false;
        
        System.out.println("Matricula do veiculo: ");
        String mat = scan.nextLine();
        
        for(Veiculo v : this.listaVeiculos){
            if(mat.equals(v.getMatricula())){
                flag = true;
            }
        }
        if(flag == true){
            System.out.println("Veiculo ja registado.");
        }else{
            Veiculo novo = new Veiculo(mat);
            this.listaVeiculos.add(novo);
        }                      
    }
    
    public void novoServico(){
        boolean flag = false;
        
        String mat;
        
        int numServico = getTotalServicos() + 1;
        
        System.out.println("NIF do Cliente: ");
        int nifCliente = Integer.parseInt(scan.nextLine());
        
        if(this.listaClientes.get(nifCliente)!=null){
            System.out.println("Localizacao do cliente: ");
            String locc = scan.nextLine();
            
            System.out.println("Localizacao do destino: ");
            String locd = scan.nextLine();
            
            for(Veiculo v : listaVeiculos){
                if(v.getDisponibilidade()==true){
                    mat = v.getMatricula();
                    Servico novo = new Servico(numServico, nifCliente, locc, locd, mat);
                    listaServicos.put(numServico,novo);
                    break;
                }else{
                    System.out.println("Nenhum veiculo disponivel!");
                }
            }
            
            
        }else{
            System.err.println("Nao existe registo de um cliente com este numero.");
        }
        
    }
    
    public int getTotalServicos(){
        return this.listaServicos.size();
    }
    
    public int getTotalClientes(){
        return this.listaClientes.size();
    }
            
            

    
}
