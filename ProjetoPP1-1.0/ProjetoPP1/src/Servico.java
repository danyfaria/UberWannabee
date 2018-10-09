/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 */
public class Servico
{
    private int numServico;
    private int nifCliente;
    private String locCliente;
    private String locDestino;
    private Veiculo servVeiculo;
    
    Servico(int nums,int nifc, String locc, String locd, String mat){
        this.numServico = nums;
        this.nifCliente = nifc;
        this.locCliente = locc;
        this.locDestino = locd;
        this.servVeiculo = new Veiculo(mat);
    }
}