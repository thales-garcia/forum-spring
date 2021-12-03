package br.com.alura.forum.repository;

import br.com.alura.forum.modelo.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TopicoRepository extends JpaRepository<Topico, Long>{

    List<Topico> findByCursoNome(String nomeCurso);    //CursoNome precisa ser na ordem do relacionamento
}
