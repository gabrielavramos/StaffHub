package api.StaffHub.Entities;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "holerites", schema = "rh_database_first", catalog = "")
public class HoleritesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "funcionario_id")
    private int funcionarioId;
    @Basic
    @Column(name = "competencia")
    private String competencia;
    @Basic
    @Column(name = "salario_bruto")
    private BigDecimal salarioBruto;
    @Basic
    @Column(name = "total_descontos")
    private BigDecimal totalDescontos;
    @Basic
    @Column(name = "salario_liquido")
    private BigDecimal salarioLiquido;
    @Basic
    @Column(name = "caminho_arquivo_pdf")
    private String caminhoArquivoPdf;

    public Object getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = (Long) id;
    }

    public int getFuncionarioId() {
        return funcionarioId;
    }

    public void setFuncionarioId(int funcionarioId) {
        this.funcionarioId = funcionarioId;
    }

    public String getCompetencia() {
        return competencia;
    }

    public void setCompetencia(String competencia) {
        this.competencia = competencia;
    }

    public BigDecimal getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(BigDecimal salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public BigDecimal getTotalDescontos() {
        return totalDescontos;
    }

    public void setTotalDescontos(BigDecimal totalDescontos) {
        this.totalDescontos = totalDescontos;
    }

    public BigDecimal getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(BigDecimal salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public String getCaminhoArquivoPdf() {
        return caminhoArquivoPdf;
    }

    public void setCaminhoArquivoPdf(String caminhoArquivoPdf) {
        this.caminhoArquivoPdf = caminhoArquivoPdf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HoleritesEntity that = (HoleritesEntity) o;

        if (funcionarioId != that.funcionarioId) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (competencia != null ? !competencia.equals(that.competencia) : that.competencia != null) return false;
        if (salarioBruto != null ? !salarioBruto.equals(that.salarioBruto) : that.salarioBruto != null) return false;
        if (totalDescontos != null ? !totalDescontos.equals(that.totalDescontos) : that.totalDescontos != null)
            return false;
        if (salarioLiquido != null ? !salarioLiquido.equals(that.salarioLiquido) : that.salarioLiquido != null)
            return false;
        if (caminhoArquivoPdf != null ? !caminhoArquivoPdf.equals(that.caminhoArquivoPdf) : that.caminhoArquivoPdf != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + funcionarioId;
        result = 31 * result + (competencia != null ? competencia.hashCode() : 0);
        result = 31 * result + (salarioBruto != null ? salarioBruto.hashCode() : 0);
        result = 31 * result + (totalDescontos != null ? totalDescontos.hashCode() : 0);
        result = 31 * result + (salarioLiquido != null ? salarioLiquido.hashCode() : 0);
        result = 31 * result + (caminhoArquivoPdf != null ? caminhoArquivoPdf.hashCode() : 0);
        return result;
    }
}
