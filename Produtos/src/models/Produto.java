package models;

public class Produto {
    private int id;
    private String descricao;

    public Produto(int id, String descricao){
        this.id = id;
        this.descricao = descricao;
    }
/*
    public void setId(int id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

 */

    public int getId(){
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

}
