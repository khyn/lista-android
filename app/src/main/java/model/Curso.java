package model;

/**
 * Created by alexf on 19/02/16.
 */
public class Curso {

    private String nome;
    private String descricao;
    private EstadoAtual estado;

    public Curso(String nome) {
        this.nome = nome;
    }

    public EstadoAtual getEstado() {
        return estado;
    }

    public void setEstado(EstadoAtual estado) {
        this.estado = estado;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Curso: " + nome + " Descrição: " + descricao + " Estado: " + estado;
    }
}
