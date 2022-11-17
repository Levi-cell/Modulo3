public class Carro {

    //// DECLARÇÃO COR com constantes
    public static final String VERMELHO = "vermelho";
    public static final String PRETA = "preta";

    public void setCor(String cor) {
        System.out.println(cor);
    }


    //// DECLARAÇÃO PNEUS
    private Integer Pneus;

         public Integer getPneus(){
             return Pneus;
         }
         public void setPneus( Integer qtdPneus) {
             Pneus = qtdPneus;
         }

    ////DECLARAÇÃO PRECO
    private Integer preco;

           public Integer getPreco() {
              return preco;
        }

          public void setPreco(Integer valuePrice) { //função de set não retorna valor, apenas atribui por isso "void"
        preco = valuePrice;

        }

    ////DECLARAÇÃO CALOTAS
    private Integer calotas;

           public Integer getCalotas(){
               return calotas;
           }

           public void setCalotas(Integer qtdCalotas) {
               calotas = qtdCalotas;
           }

   ////DECLARAÇÃO PARAFUSOS
   private Integer parafusos;

           public Integer getParafusos(){
               return parafusos;
           }

           public void setParafusos(Integer qtdParafusos){
               parafusos = qtdParafusos;
           }

    public void imprimeValores() {
        System.out.println("Quantidade de Pneus " + " " + getPneus());
        System.out.println("QUantidade de calotas " + " " + getCalotas());
        System.out.println("Quantidade de parafusos pneu" + " " + getParafusos());
        System.out.println("Preço do carro" + " " + getPreco());



    }
}
