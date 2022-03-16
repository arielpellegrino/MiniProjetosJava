package ProjetoLutador;

public class UltraEmojiCombat {
    public static void main(String[] args) {
        //Instancia com os paramentros declarados no metodos construtor
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Ariel", "França", 29, 1.75f, 70f, 11, 2, 1);
        l[1] = new Lutador("DANYELLE", "Angola", 26, 1.65f, 57, 1, 50, 0 );

        l[1].apresentar();
        l[1].status();
    }
}







