package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
// Lombok Anotations
@Data // Cria os Getters e Setters
@NoArgsConstructor // Cria um construtor vazio
@AllArgsConstructor // Cria um construtor com todos os argumentos da classe
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String dificuldade;

    @OneToMany(mappedBy = "missoes") // One == Missoes || Many == Ninjas
    // MapppedBy indica a tabela para criar a chave estrangeira e o relacionamento
    private List<NinjaModel> ninjas;


}
