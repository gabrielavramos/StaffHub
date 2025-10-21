package api.StaffHub.Entities;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "notificacoes", schema = "rh_database_first", catalog = "")
public class NotificacoesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "destinatario_id")
    private int destinatarioId;
    @Basic
    @Column(name = "mensagem")
    private String mensagem;
    @Basic
    @Column(name = "data_envio")
    private Timestamp dataEnvio;
    @Basic
    @Column(name = "lida")
    private byte lida;

    public Object getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getDestinatarioId() {
        return destinatarioId;
    }

    public void setDestinatarioId(int destinatarioId) {
        this.destinatarioId = destinatarioId;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Timestamp getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(Timestamp dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

    public byte getLida() {
        return lida;
    }

    public void setLida(byte lida) {
        this.lida = lida;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NotificacoesEntity that = (NotificacoesEntity) o;

        if (destinatarioId != that.destinatarioId) return false;
        if (lida != that.lida) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (mensagem != null ? !mensagem.equals(that.mensagem) : that.mensagem != null) return false;
        if (dataEnvio != null ? !dataEnvio.equals(that.dataEnvio) : that.dataEnvio != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + destinatarioId;
        result = 31 * result + (mensagem != null ? mensagem.hashCode() : 0);
        result = 31 * result + (dataEnvio != null ? dataEnvio.hashCode() : 0);
        result = 31 * result + (int) lida;
        return result;
    }
}
