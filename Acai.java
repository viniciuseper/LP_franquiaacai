package br.com.franquiaacai;

public class Acai {
    public int tamanho;
    public double valor;
    public Boolean acrescimoSorvete;

    public Acai() {
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Boolean getAcrescimoSorvete() {
        return acrescimoSorvete;
    }

    public void setAcrescimoSorvete(Boolean acrescimoSorvete) {
        this.acrescimoSorvete = acrescimoSorvete;
    }

    public Double calculaValor(){
        if (getTamanho() == 300){
            valor = 8.00;
        }
        else if (getTamanho() == 500){
            valor = 10.00;
        }
        else if (getTamanho() == 700){
            valor = 12.00;
        }
        return getValor();
    }

    public Double calculaAcrescimo(boolean acrescimoSorvete){
        if (acrescimoSorvete){
            valor = getValor() + 2.00;
        }
        return getValor();
    }
}