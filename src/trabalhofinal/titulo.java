/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhofinal;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;

import org.jrimum.bopepo.BancosSuportados;
import org.jrimum.bopepo.Boleto;
import org.jrimum.bopepo.view.BoletoViewer;
import org.jrimum.domkee.comum.pessoa.endereco.CEP;
import org.jrimum.domkee.comum.pessoa.endereco.Endereco;
import org.jrimum.domkee.comum.pessoa.endereco.UnidadeFederativa;
import org.jrimum.domkee.financeiro.banco.febraban.Agencia;
import org.jrimum.domkee.financeiro.banco.febraban.Carteira;
import org.jrimum.domkee.financeiro.banco.febraban.Cedente;
import org.jrimum.domkee.financeiro.banco.febraban.ContaBancaria;
import org.jrimum.domkee.financeiro.banco.febraban.NumeroDaConta;
import org.jrimum.domkee.financeiro.banco.febraban.Sacado;
import org.jrimum.domkee.financeiro.banco.febraban.SacadorAvalista;
import org.jrimum.domkee.financeiro.banco.febraban.TipoDeTitulo;
import org.jrimum.domkee.financeiro.banco.febraban.Titulo;
/**
 *
 * @author Lauro Lobo
 */
public class titulo {
    private int NumeroDocumento;
    private int NossoNumero;
    private int DigitoNossonumero;
    private double Valor;
    private int diaVencimento;
    private int mesVencimento;
    private int anoVencimento;
    private double desconto;
    private double dedução;
    private double mora;
    private double acrescimo;
    private double valorCobrado;

    public titulo(int NumeroDocumento, int NossoNumero, int DigitoNossonumero, double Valor, int diaVencimento, int mesVencimento, int anoVencimento, double desconto, double dedução, double mora, double acrescimo, double valorCobrado) {
        this.NumeroDocumento = NumeroDocumento;
        this.NossoNumero = NossoNumero;
        this.DigitoNossonumero = DigitoNossonumero;
        this.Valor = Valor;
        this.diaVencimento = diaVencimento;
        this.mesVencimento = mesVencimento;
        this.anoVencimento = anoVencimento;
        this.desconto = desconto;
        this.dedução = dedução;
        this.mora = mora;
        this.acrescimo = acrescimo;
        this.valorCobrado = valorCobrado;
    }
    

    public int getNumeroDocumento() {
        return NumeroDocumento;
    }

    public void setNumeroDocumento(int NumeroDocumento) {
        this.NumeroDocumento = NumeroDocumento;
    }

    public int getNossoNumero() {
        return NossoNumero;
    }

    public void setNossoNumero(int NossoNumero) {
        this.NossoNumero = NossoNumero;
    }

    public int getDigitoNossonumero() {
        return DigitoNossonumero;
    }

    public void setDigitoNossonumero(int DigitoNossonumero) {
        this.DigitoNossonumero = DigitoNossonumero;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public int getDiaVencimento() {
        return diaVencimento;
    }

    public void setDiaVencimento(int diaVencimento) {
        this.diaVencimento = diaVencimento;
    }

    public int getMesVencimento() {
        return mesVencimento;
    }

    public void setMesVencimento(int mesVencimento) {
        this.mesVencimento = mesVencimento;
    }

    public int getAnoVencimento() {
        return anoVencimento;
    }

    public void setAnoVencimento(int anoVencimento) {
        this.anoVencimento = anoVencimento;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getDedução() {
        return dedução;
    }

    public void setDedução(double dedução) {
        this.dedução = dedução;
    }

    public double getMora() {
        return mora;
    }

    public void setMora(double mora) {
        this.mora = mora;
    }

    public double getAcrescimo() {
        return acrescimo;
    }

    public void setAcrescimo(double acrescimo) {
        this.acrescimo = acrescimo;
    }

    public double getValorCobrado() {
        return valorCobrado;
    }

    public void setValorCobrado(double valorCobrado) {
        this.valorCobrado = valorCobrado;
    }
    
    
}
