package api.StaffHub.Entities;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "beneficios")
public class Beneficio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nome", nullable = false, unique = true, length = 100)
    private String nome;

    @Column(name = "descricao", columnDefinition = "TEXT")
    private String descricao;

    @Column(name = "valor_mensal", nullable = false)
    private double valorMensal;

    @ManyToMany(mappedBy = "beneficios")
    private List<Funcionario> funcionarios;

    // Construtores, Getters e Setters
}
