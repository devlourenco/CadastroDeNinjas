package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.data.jpa.repository.JpaRepository;

//MissoesRepository extende JpaRepository que tem como parametro MissoesModel, pois inidica que o JPA irá escanear
//MissoesModel em busca de atualizações, também passei o Long como parametro pois é o tipo de dado do Meu ID

public interface MissoesRepository extends JpaRepository<MissoesModel, Long> {

}
