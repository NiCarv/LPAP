public class Pessoa extends Animal {
    // Atributos da classe
    String sobrenome;
    // Métodos da classe
    public void falar(){
        System.out.println("falei");
    }
    public void falar(String volume){
        System.out.println("falei " + volume);
    }
}
