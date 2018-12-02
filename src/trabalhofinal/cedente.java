/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhofinal;

/**
 *
 * @author Lauro Lobo
 */
public class cedente2 {
    private String nomeDaEmpresa;
    private long CNPJ;

    public cedente2(String nomeDaEmpresa, long CNPJ) {
        this.nomeDaEmpresa = nomeDaEmpresa;
        this.CNPJ = CNPJ;
    }
    
    

    public String getNomeDaEmpresa() {
        return nomeDaEmpresa;
    }

    public void setNomeDaEmpresa(String nomeDaEmpresa) {
        this.nomeDaEmpresa = nomeDaEmpresa;
    }

    public long getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(long CNPJ) {
        this.CNPJ = CNPJ;
    }
    
        
}
