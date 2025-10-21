package api.StaffHub.Entities;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "feedbacks", schema = "rh_database_first", catalog = "")
public class FeedbacksEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "autor_id")
    private int autorId;
    @Basic
    @Column(name = "destinatario_id")
    private int destinatarioId;
    @Basic
    @Column(name = "texto")
    private String texto;
    @Basic
    @Column(name = "data_hora")
    private Timestamp dataHora;

    public Object getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAutorId() {
        return autorId;
    }

    public void setAutorId(int autorId) {
        this.autorId = autorId;
    }

    public int getDestinatarioId() {
        return destinatarioId;
    }

    public void setDestinatarioId(int destinatarioId) {
        this.destinatarioId = destinatarioId;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Timestamp getDataHora() {
        return dataHora;
    }

    public void setDataHora(Timestamp dataHora) {
        this.dataHora = dataHora;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FeedbacksEntity that = (FeedbacksEntity) o;

        if (autorId != that.autorId) return false;
        if (destinatarioId != that.destinatarioId) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (texto != null ? !texto.equals(that.texto) : that.texto != null) return false;
        if (dataHora != null ? !dataHora.equals(that.dataHora) : that.dataHora != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + autorId;
        result = 31 * result + destinatarioId;
        result = 31 * result + (texto != null ? texto.hashCode() : 0);
        result = 31 * result + (dataHora != null ? dataHora.hashCode() : 0);
        return result;
    }
}
