/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Uber {

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
