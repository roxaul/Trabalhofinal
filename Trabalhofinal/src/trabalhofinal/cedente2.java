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
    private String Localidade;
    private String Bairro;
    private String Logradouro;
    private String CEP;
    private String numero;

    public String getLocalidade() {
        return Localidade;
    }

    public void setLocalidade(String Localidade) {
        this.Localidade = Localidade;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getLogradouro() {
        return Logradouro;
    }

    public void setLogradouro(String Logradouro) {
        this.Logradouro = Logradouro;
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

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public cedente2(String nomeDaEmpresa, long CNPJ, String Localidade, String Bairro, String Logradouro, String CEP, String numero) {
        this.nomeDaEmpresa = nomeDaEmpresa;
        this.CNPJ = CNPJ;
        this.Localidade = Localidade;
        this.Bairro = Bairro;
        this.Logradouro = Logradouro;
        this.CEP = CEP;
        this.numero = numero;
    }


}
