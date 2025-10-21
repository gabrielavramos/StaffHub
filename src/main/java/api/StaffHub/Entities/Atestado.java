package api.StaffHub.Entities;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "atestados")
public class Atestado {

    public enum StatusAtestado {
        ENVIADO,
        DEFERIDO,
        INDEFERIDO
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "funcionario_id", nullable = false)
    private Funcionario funcionario;

    @Column(name = "caminho_arquivo", nullable = false)
    private String caminhoArquivo;

    @Column(name = "data_envio", nullable = false)
    private LocalDate dataEnvio;

    @Column(name = "dias_afastado", nullable = false)
    private int diasAfastado;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private StatusAtestado status;

    // Construtores, Getters e Setters
}