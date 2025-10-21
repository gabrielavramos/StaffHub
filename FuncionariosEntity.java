package api.StaffHub.Entities;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "funcionarios", schema = "rh_database_first", catalog = "")
public class FuncionariosEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "nome_completo")
    private String nomeCompleto;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "senha")
    private String senha;
    @Basic
    @Column(name = "cargo")
    private String cargo;
    @Basic
    @Column(name = "data_admissao")
    private Date dataAdmissao;

    public Object getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FuncionariosEntity that = (FuncionariosEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (nomeCompleto != null ? !nomeCompleto.equals(that.nomeCompleto) : that.nomeCompleto != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (senha != null ? !senha.equals(that.senha) : that.senha != null) return false;
        if (cargo != null ? !cargo.equals(that.cargo) : that.cargo != null) return false;
        if (dataAdmissao != null ? !dataAdmissao.equals(that.dataAdmissao) : that.dataAdmissao != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nomeCompleto != null ? nomeCompleto.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (senha != null ? senha.hashCode() : 0);
        result = 31 * result + (cargo != null ? cargo.hashCode() : 0);
        result = 31 * result + (dataAdmissao != null ? dataAdmissao.hashCode() : 0);
        return result;
    }
}
