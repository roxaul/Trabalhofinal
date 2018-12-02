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
    private int CPF;
    
    private String UF;
    private int CEP;
    private String Bairro;
    private String Logradouro;
    private int Numero;

    public sacado(String Nome, int CPF, String UF, int CEP, String Bairro, String Logradouro, int Numero) {
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

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public int getCEP() {
        return CEP;
    }

    public void setCEP(int CEP) {
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

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }
    
    
    
}
