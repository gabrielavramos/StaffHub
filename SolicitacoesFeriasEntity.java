package api.StaffHub.Entities;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "solicitacoes_ferias", schema = "rh_database_first", catalog = "")
public class SolicitacoesFeriasEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "solicitante_id")
    private int solicitanteId;
    @Basic
    @Column(name = "data_inicio")
    private Date dataInicio;
    @Basic
    @Column(name = "data_fim")
    private Date dataFim;
    @Basic
    @Column(name = "status")
    private String status;
    @Basic
    @Column(name = "data_solicitacao")
    private Date dataSolicitacao;

    public Object getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSolicitanteId() {
        return solicitanteId;
    }

    public void setSolicitanteId(int solicitanteId) {
        this.solicitanteId = solicitanteId;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(Date dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SolicitacoesFeriasEntity that = (SolicitacoesFeriasEntity) o;

        if (solicitanteId != that.solicitanteId) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (dataInicio != null ? !dataInicio.equals(that.dataInicio) : that.dataInicio != null) return false;
        if (dataFim != null ? !dataFim.equals(that.dataFim) : that.dataFim != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (dataSolicitacao != null ? !dataSolicitacao.equals(that.dataSolicitacao) : that.dataSolicitacao != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + solicitanteId;
        result = 31 * result + (dataInicio != null ? dataInicio.hashCode() : 0);
        result = 31 * result + (dataFim != null ? dataFim.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (dataSolicitacao != null ? dataSolicitacao.hashCode() : 0);
        return result;
    }
}
