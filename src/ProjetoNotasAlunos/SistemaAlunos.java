package ProjetoNotasAlunos;

import javax.swing.*;

public class SistemaAlunos {
    public static void main(String[] args) {
        calcularNotas();
    }

    public static void calcularNotas() {

        Aluno aluno = new Aluno();
        String tmp = null; //Variavel temporaria
        do {

            tmp = JOptionPane.showInputDialog("Qual é o nome do aluno?");
            aluno.setNome(tmp);

            tmp = JOptionPane.showInputDialog("Qual é o RA do aluno?");
            aluno.setRegistroAluno(Integer.parseInt(tmp));

            tmp = JOptionPane.showInputDialog("Qual é a nota 1 do aluno?");
            aluno.setNota1(Double.parseDouble(tmp));

            tmp = JOptionPane.showInputDialog("Qual é a nota 2 do aluno?");
            aluno.setNota2(Double.parseDouble(tmp));

            tmp = JOptionPane.showInputDialog("Qual é a nota 3 do aluno?");
            aluno.setNota3(Double.parseDouble(tmp));

            aluno.calculaMedia();

            tmp = "Aluno: " + aluno.getStatus() + ", RA: " + aluno.getRegistroAluno() + "\n\n";
            tmp += "Nota 1 = " + aluno.getNota1() + "\n";
            tmp += "Nota 2 = " + aluno.getNota2() + "\n";
            tmp += "Nota 3 = " + aluno.getNota3() + "\n";
            tmp += "Média: " + aluno.getMedia() + "\n";
            System.out.println("-------------------");
            tmp = "Você está " + aluno.getStatus();

            //Exibe a tela com resultado
            JOptionPane.showMessageDialog(null, tmp);

            tmp = JOptionPane.showInputDialog("Inserir um novo aluno? (S/N)");

        } while (tmp.toLowerCase().equals("s"));


        //Limpa a memoria
        System.exit(0);
    }
}
