package br.com.franquiaacai;
import javax.swing.JOptionPane;
public class PontoAcai {

    public static void main(String[] args) {

        int opcao, tamanho;
        double acrescimoSorvete;

        do {

            opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do Açaí desejado:\n<1> 300ml\n<2> 500ml\n<3> 700ml"));

            switch (opcao) {
                case 1:
                    tamanho = 300;
                    Acai acai1 = new Acai();
                    acai1.setTamanho(tamanho);
                    acai1.setValor(acai1.calculaValor());
                    acrescimoSorvete = Double.parseDouble(JOptionPane.showInputDialog("Acréscimo de sorvete:\n<1> Sim.\n<2> Não."));
                    if (acrescimoSorvete == 1) {
                        acai1.calculaAcrescimo(true);
                    } else {
                        acai1.calculaAcrescimo(false);
                    }
                    JOptionPane.showMessageDialog(null, "O seu açaí ficou no valor de: " + acai1.getValor(), "Valor Total", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 2:
                    tamanho = 500;
                    Acai acai2 = new Acai();
                    acai2.setTamanho(tamanho);
                    acai2.setValor(acai2.calculaValor());
                    acrescimoSorvete = Double.parseDouble(JOptionPane.showInputDialog("Acréscimo de sorvete:\n<1> Sim.\n<2> Não."));
                    if (acrescimoSorvete == 1) {
                        acai2.calculaAcrescimo(true);
                    } else {
                        acai2.calculaAcrescimo(false);
                    }
                    JOptionPane.showMessageDialog(null, "O seu açaí ficou no valor de: " + acai2.getValor(), "Valor Total", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 3:
                    tamanho = 700;
                    Acai acai3 = new Acai();
                    acai3.setTamanho(tamanho);
                    acai3.setValor(acai3.calculaValor());
                    acrescimoSorvete = Double.parseDouble(JOptionPane.showInputDialog("Acréscimo de sorvete:\n<1> Sim.\n<2> Não."));
                    if (acrescimoSorvete == 1) {
                        acai3.calculaAcrescimo(true);
                    } else {
                        acai3.calculaAcrescimo(false);
                    }
                    JOptionPane.showMessageDialog(null, "O seu açaí ficou no valor de: " + acai3.getValor(), "Valor Total", JOptionPane.INFORMATION_MESSAGE);
                    break;
            }
        } while (opcao != 4);
    }
}