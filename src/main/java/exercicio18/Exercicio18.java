package exercicio18;

import javax.swing.JOptionPane;
public class Exercicio18 {

    public static void main(String[] args) {
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto: "));
        double a = 0.1;
        double b = 0.15;
        double c = 0.2;
        double d = 0.25;
        double e = 0.5;
        String nome = JOptionPane.showInputDialog("Digite seu nome");
        int desconto;
        double precofinal;
        
        desconto = Integer.parseInt(JOptionPane.showInputDialog("Escolha a categoria do seu produto: " + "\n 1 - A" + "\n 2 - B" +
        "\n 3 - C" + "\n 4 - D" + "\n 5 - E"));
        
        switch(desconto) {
        case 1:
	        precofinal = preco - (preco* a);
	        JOptionPane.showMessageDialog(null, nome + ", o valor final é: R$" + precofinal);
	        break;
	        
	       case 2:
	        precofinal = preco - (preco* b);
	        JOptionPane.showMessageDialog(null, nome + ", o valor final é: R$" + precofinal);
	        break;
	        
	        case 3:
	        precofinal = preco - (preco* c);
	        JOptionPane.showMessageDialog(null, nome + ", o valor final é: R$" + precofinal);
	        break;
	        
	        case 4:
	        precofinal = preco - (preco* d);
	        JOptionPane.showMessageDialog(null, nome + ", o valor final é: R$" + precofinal);
	        break;
	        
	        case 5:
	        precofinal = preco - (preco* e);
	        JOptionPane.showMessageDialog(null, nome + ", o valor final é: R$" + precofinal);
	        break;
                
                default:
                    JOptionPane.showMessageDialog(null, "INVALIDO");
                break;
    }
}
}