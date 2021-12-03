package br.com.alura.forum;

import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.StatusTopico;
import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.modelo.Usuario;
import br.com.alura.forum.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.LocalDateTime;
import java.util.Arrays;

import static br.com.alura.forum.modelo.StatusTopico.SOLUCIONADO;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private TopicoRepository topicoRepository;

    @Override
    public void run(String... args) throws Exception {

        Topico topico1 = new Topico (null, "Duvida com Spring", "Estou com uma duvida em Spring", LocalDateTime.now(), SOLUCIONADO, new Usuario(), new Curso(null, "Spring Boot", "Programação") );
        Topico topico2 = new Topico (null, "Duvida com HTML", "Estou com uma duvida em HTML", LocalDateTime.now(), SOLUCIONADO, new Usuario(), new Curso(null, "HTML 5", "Front-end"));


        topicoRepository.saveAll(Arrays.asList(topico1, topico2));

    }
}
