package ProjetoLutador;

public class Lutador {
    //Declaração de atributos

    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitoria, derrotas, empates;


    //Metodos

     public void apresentar(){
         System.out.println("-----------------------------------");
         System.out.println("Chegou a hora, Apresentamos o lutador: " + this.getNome());
         System.out.println("Diretamente de " + this.getNacionalidade());
         System.out.println("com " + this.getIdade() + " anos e " + this.altura);
         System.out.println("pesando " + this.getPeso() + "kg");
         System.out.println(this.getVitoria() + " vitórias");
         System.out.println(this.getDerrotas() + " derrotas");
         System.out.println(this.getEmpates() + " empates!");
     }

     public void status(){
         System.out.println("-------------------------------");
         System.out.println(this.getNome() + " é um peso " + getCategoria());
         System.out.println("Ganhou " + this.getVitoria() + " vezes");
         System.out.println("Perde " + this.getDerrotas() + " vezes");
         System.out.println("Empatou " + this.getEmpates() + " vezes");

     }

     public void ganharLuta(){
        this.setVitoria(this.getVitoria() + 1);
     }

     public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
     }

     public void empatarLuta(){
        this.setEmpates(this.getDerrotas() + 1);
     }

    //Metodos especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
       if (this.peso < 52.2) {
           this.categoria = "Inválido";
       } else if (this.peso <= 70.3){
           this.categoria = "Leve";
       } else if (this.peso <= 83.9) {
           this.categoria = "Médio";
       } else if (this.peso <= 120.2) {
           this.categoria = "Pesado";
       } else {
           this.categoria = "inválido";
       }
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitoria = vi;
        this.derrotas = de;
        this.empates = em;
    }


}
