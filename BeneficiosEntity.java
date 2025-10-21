package api.StaffHub.Entities;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "beneficios", schema = "rh_database_first", catalog = "")
public class BeneficiosEntity {
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
    @Column(name = "valor_mensal")
    private BigDecimal valorMensal;

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

    public BigDecimal getValorMensal() {
        return valorMensal;
    }

    public void setValorMensal(BigDecimal valorMensal) {
        this.valorMensal = valorMensal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BeneficiosEntity that = (BeneficiosEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (nome != null ? !nome.equals(that.nome) : that.nome != null) return false;
        if (descricao != null ? !descricao.equals(that.descricao) : that.descricao != null) return false;
        if (valorMensal != null ? !valorMensal.equals(that.valorMensal) : that.valorMensal != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (descricao != null ? descricao.hashCode() : 0);
        result = 31 * result + (valorMensal != null ? valorMensal.hashCode() : 0);
        return result;
    }
}
