package br.com.redesenhe.models.domains.usuario;

import br.com.redesenhe.models.commons.constantes.Sexo;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "bigint", nullable = false)
    private Long id;

    @Column(name = "nome", columnDefinition = "varchar(70)", length = 70, nullable = false)
    private String nome;

    @Column(name = "nascimento", columnDefinition = "DATE", nullable = false)
    private LocalDate nascimento;

    @Enumerated(EnumType.STRING)
    @Column(name = "sexo", columnDefinition = "enum('F', 'M')", nullable = false)
    private Sexo sexo;

    @Column(name = "email", columnDefinition = "varchar(150)", length = 150, nullable = false)
    private String email;

    @Column(name = "senha", columnDefinition = "varchar(70)", length = 70, nullable = false)
    private String senha;

    @Column(name = "criacao", columnDefinition = "DATE", nullable = false)
    private LocalDate criacao;

    @Column(name = "atualizacao", columnDefinition = "DATE", nullable = false)
    private LocalDate atualizacao;
}
