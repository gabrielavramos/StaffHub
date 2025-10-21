package api.StaffHub.Entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "solicitacoes_ferias")
public class SolicitacaoFerias {

    public enum Status {
        SOLICITADO,
        APROVADO,
        REPROVADO
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "solicitante_id", nullable = false)
    private Funcionario solicitante;

    @Column(name = "data_inicio", nullable = false)
    private LocalDate dataInicio;

    @Column(name = "data_fim", nullable = false)
    private LocalDate dataFim;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private Status status;

    @Column(name = "data_solicitacao", nullable = false)
    private LocalDate dataSolicitacao;
}