package ProjetoNotasAlunos;

public class Aluno {
    // Declaração dos atributos do aluno
    private int registroAluno;
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;
    private double media;
    private String status;

    public void setRegistroAluno(int ra) {
        this.registroAluno = ra;
    }

    public int getRegistroAluno() {
        return registroAluno;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota3() {
        return nota3;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double getMedia() {
        return media;
    }


    // Metodos de calculos

    public double calculaMedia(){
        media = (nota1 + nota2 + nota3) / 3;
        if(getMedia() >= 6.0) {
            setStatus("Aprovado");
        } else {
            setStatus("Reprovado");
        }
        return getMedia();
    }

}
