public class Main {
    public static void main(String... args) {

        Carro carro = new Carro();
        carro.setPneus(4);
        carro.setParafusos(16);
        carro.setCalotas(4);
        carro.setPreco(5000);
        carro.setCor(Carro.VERMELHO);

        carro.imprimeValores();

    }
}