package api.StaffHub.Entities;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "atestados", schema = "rh_database_first", catalog = "")
public class AtestadosEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "funcionario_id")
    private int funcionarioId;
    @Basic
    @Column(name = "caminho_arquivo")
    private String caminhoArquivo;
    @Basic
    @Column(name = "data_envio")
    private Date dataEnvio;
    @Basic
    @Column(name = "dias_afastado")
    private int diasAfastado;
    @Basic
    @Column(name = "status")
    private String status;

    public Object getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getFuncionarioId() {
        return funcionarioId;
    }

    public void setFuncionarioId(int funcionarioId) {
        this.funcionarioId = funcionarioId;
    }

    public String getCaminhoArquivo() {
        return caminhoArquivo;
    }

    public void setCaminhoArquivo(String caminhoArquivo) {
        this.caminhoArquivo = caminhoArquivo;
    }

    public Date getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(Date dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

    public int getDiasAfastado() {
        return diasAfastado;
    }

    public void setDiasAfastado(int diasAfastado) {
        this.diasAfastado = diasAfastado;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AtestadosEntity that = (AtestadosEntity) o;

        if (funcionarioId != that.funcionarioId) return false;
        if (diasAfastado != that.diasAfastado) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (caminhoArquivo != null ? !caminhoArquivo.equals(that.caminhoArquivo) : that.caminhoArquivo != null)
            return false;
        if (dataEnvio != null ? !dataEnvio.equals(that.dataEnvio) : that.dataEnvio != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + funcionarioId;
        result = 31 * result + (caminhoArquivo != null ? caminhoArquivo.hashCode() : 0);
        result = 31 * result + (dataEnvio != null ? dataEnvio.hashCode() : 0);
        result = 31 * result + diasAfastado;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
