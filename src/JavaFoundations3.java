import javax.swing.JOptionPane;
public class JavaFoundations3 {
    public static void main (String [] args){
        String nome = JOptionPane.showInputDialog("Digite um nome");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite uma idade"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite uma altura"));
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor monetário"));
        String profissao = JOptionPane.showInputDialog("Digite uma profissão");
        String esporte = JOptionPane.showInputDialog("Digite um esporte");
        String arma = JOptionPane.showInputDialog("Digite uma arma");
        String cor = JOptionPane.showInputDialog("Digite uma cor");
        String cabelo = JOptionPane.showInputDialog("Digite uma cor de cabelo");
        int hora = Integer.parseInt(JOptionPane.showInputDialog("Digite um horário"));

        JOptionPane.showMessageDialog(null, "ALERTA PARA TODOS OS MARCIANOS!");
        JOptionPane.showMessageDialog(null, "Identificamos um terráqueo invasor, denominado "+nome);
        JOptionPane.showMessageDialog(null, "O terráqueo eliminou 6 de nossos soldados armado com "+arma);
        JOptionPane.showMessageDialog(null, "O invasor possui "+idade+" anos, aproximadamente "+altura+" de altura, camista de cor "+cor+" e cabelo cor "+cabelo);
        JOptionPane.showMessageDialog(null,"Anteriormente o invasor era escravo do império marciano, atuava como "+profissao+" e possui habilidades desenvolvidas com "+esporte);
        JOptionPane.showMessageDialog(null,"O invasor entrou na cidade de Kivitzka às "+hora+" horas e está tentando comprar agentes do estado com o valor de "+valor+" mardoll");
        JOptionPane.showMessageDialog(null,"Salve marte!");
    }
}
