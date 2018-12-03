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
public class sacado {
    private String Nome;
    private String CPF;
    
    private String UF;
    private String CEP;
    private String Bairro;
    private String Logradouro;
    private String Numero;

    public sacado(String Nome, String CPF, String UF, String CEP, String Bairro, String Logradouro, String Numero) {
        this.Nome = Nome;
        this.CPF = CPF;
        this.UF = UF;
        this.CEP = CEP;
        this.Bairro = Bairro;
        this.Logradouro = Logradouro;
        this.Numero = Numero;
    }
    
    

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
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

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }
    
    
    
}
