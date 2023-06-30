package Aula03;

import javax.swing.JOptionPane;

public class JavaLibsStory {

    public static void main(String[] args) {
        // Solicitar entradas do usuário
        String name = JOptionPane.showInputDialog("Digite seu nome:");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
        String city = JOptionPane.showInputDialog("Digite o nome da sua cidade:");
        double temperature = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura atual:"));
        String food = JOptionPane.showInputDialog("Digite seu alimento favorito:");
        int yearsInFuture = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de anos no futuro:"));
        double money = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de dinheiro que você tem:"));
        String job = JOptionPane.showInputDialog("Digite o nome de uma profissão:");
        int hoursWorked = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de horas trabalhadas por semana:"));
        String adjective = JOptionPane.showInputDialog("Digite um adjetivo:");

        // Gerar a história com base nas entradas do usuário
        String story = "Havia uma pessoa chamada " + name + ", que tinha " + age + " anos de idade.\n";
        story += "Essa pessoa vivia na cidade de " + city + ", onde a temperatura atual era de " + temperature + " graus.\n";
        story += "Um dia, " + name + " estava com muita fome e decidiu comer " + food + ".\n";
        story += "Após " + yearsInFuture + " anos, " + name + " tinha acumulado um total de $" + (money * yearsInFuture) + ".\n";
        story += "Com todo esse dinheiro, " + name + " decidiu mudar de profissão e se tornar um(a) " + job + ".\n";
        story += "No novo emprego, " + name + " trabalhava " + hoursWorked + " horas por semana e estava muito " + adjective + ".\n";
        story += "A história de " + name + " é realmente inspiradora!\n";

        // Exibir a história resultante
        JOptionPane.showMessageDialog(null, story);
    }
}