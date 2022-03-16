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
         System.out.println("Chegou a hora, Apresentamos o litador" + this.getNome());
         System.out.println("Diretamente de " + this.getNacionalidade());
         System.out.println("com" + this.getIdade() + " anos e " + this.altura);
         System.out.println("pesando " + this.getPeso() + "kg");
         System.out.println(this.getVitoria() + " vitórias");
         System.out.println(this.getDerrotas() + " derrotas é");
         System.out.println(this.getEmpates() + " empates!");
     }

     public void status(){

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
        this.peso = pe;
        this.vitoria = vi;
        this.derrotas = de;
        this.empates = em;
    }


}
