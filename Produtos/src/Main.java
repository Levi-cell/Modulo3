import models.Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Produto prod1= new Produto();
        prod1.setDescricao("Celular");
        prod1.setId(1);
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual descrição você deseja dar ao novo produto:");
        String descricao = scanner.nextLine();

        System.out.println("Qual o ID você deseja dar ao novo produto:");
        int id = scanner.nextInt();

        Produto novoProduto = new Produto(id, descricao);
        /*
        novoProduto.setId(id);
        novoProduto.setDescricao(descricao);
         */

        System.out.println("Produto criado com suceso");
        System.out.println("----ID:" + " " + novoProduto.getId());
        System.out.println("----Descricao:" + " " + novoProduto.getDescricao());


    }


}

