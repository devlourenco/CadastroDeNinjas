package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
// Lombok Anotations
@Data // Cria os Getters e Setters
@NoArgsConstructor // Cria um construtor vazio
@AllArgsConstructor // Cria um construtor com todos os argumentos da classe
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO.IDENTITY)
    private Long id;

    private String nome;

    @Column(unique = true) // Indica que o campo da tabela é único.
    private String email;

    private int idade;

    @ManyToOne // Many == Ninja || One == Missoes
    @JoinColumn(name = "missoes_id") // Cria a chave estrangeira entre as tabelas
    private MissoesModel missoes;


}

