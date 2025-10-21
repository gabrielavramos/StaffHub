package api.StaffHub.Entities;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "treinamentos", schema = "rh_database_first", catalog = "")
public class TreinamentosEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "nome")
    private String nome;
    @Basic
    @Column(name = "descricao")
    private String descricao;
    @Basic
    @Column(name = "data_hora_inicio")
    private Timestamp dataHoraInicio;
    @Basic
    @Column(name = "duracao_horas")
    private int duracaoHoras;

    public Object getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Timestamp getDataHoraInicio() {
        return dataHoraInicio;
    }

    public void setDataHoraInicio(Timestamp dataHoraInicio) {
        this.dataHoraInicio = dataHoraInicio;
    }

    public int getDuracaoHoras() {
        return duracaoHoras;
    }

    public void setDuracaoHoras(int duracaoHoras) {
        this.duracaoHoras = duracaoHoras;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TreinamentosEntity that = (TreinamentosEntity) o;

        if (duracaoHoras != that.duracaoHoras) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (nome != null ? !nome.equals(that.nome) : that.nome != null) return false;
        if (descricao != null ? !descricao.equals(that.descricao) : that.descricao != null) return false;
        if (dataHoraInicio != null ? !dataHoraInicio.equals(that.dataHoraInicio) : that.dataHoraInicio != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (descricao != null ? descricao.hashCode() : 0);
        result = 31 * result + (dataHoraInicio != null ? dataHoraInicio.hashCode() : 0);
        result = 31 * result + duracaoHoras;
        return result;
    }
}
