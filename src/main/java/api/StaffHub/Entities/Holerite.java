package api.StaffHub.Entities;
import jakarta.persistence.*;
import java.time.YearMonth;

@Entity
@Table(name = "holerites")
public class Holerite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "funcionario_id", nullable = false)
    private Funcionario funcionario;

    @Column(name = "competencia", nullable = false)
    @Convert(converter = YearMonthAttributeConverter.class)
    private YearMonth competencia;

    @Column(name = "salario_bruto", nullable = false)
    private double salarioBruto;

    @Column(name = "total_descontos", nullable = false)
    private double totalDescontos;

    @Column(name = "salario_liquido", nullable = false)
    private double salarioLiquido;

    @Column(name = "caminho_arquivo_pdf")
    private String caminhoArquivoPdf;

    // Construtores, Getters e Setters
}