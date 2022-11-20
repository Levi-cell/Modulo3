public class Main {
    public static void main(String... args) {

        Carro carro = new Carro("C20-0451","vermelho", 4 );
        System.out.println(carro.getPlaca());
        System.out.println(carro.getCor());
        System.out.println(carro.getPortas());
        carro.setPneus(4);
        carro.setParafusos(16);
        carro.setCalotas(4);
        carro.setPreco(5000);


        carro.imprimeValores();

    }
}