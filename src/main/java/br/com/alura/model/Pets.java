package br.com.alura.model;

public class Pets {

    private Long id;
    private String tipo;
    private String nomePet;
    private String raca;
    private Integer idade;
    private String cor;
    private Float peso;

    public Pets() {
    }

    public Pets(String tipo, String nomePet, String raca, Integer idade, String cor, Float peso) {
        this.tipo = tipo;
        this.nomePet = nomePet;
        this.raca = raca;
        this.idade = idade;
        this.cor = cor;
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNomePet() {
        return nomePet;
    }

    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Long getId() {
        return id;
    }
}
