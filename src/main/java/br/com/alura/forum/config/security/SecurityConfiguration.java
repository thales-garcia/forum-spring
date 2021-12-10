package br.com.alura.forum.config.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class SecurityConfiguration  extends WebSecurityConfigurerAdapter {


    //Configuracoes de Autenticacao(exemplo:login)
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

    }

    //Configuracoes de Autorizacao(exemplo:url, quem pode acessar cada url)
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // http.authorizeRequests().antMatchers("/topicos").permitAll();   -> Autoriza o acesso a todos os metodos do /topicos

        http.authorizeRequests().
                antMatchers(HttpMethod.GET,"/topicos").permitAll().      
                antMatchers(HttpMethod.GET, "/topicos/*").permitAll()                   // * significa "alguma coisa", no caso seria o "{id}"
                .anyRequest().authenticated()
                .and().formLogin();
    }

    //Configuracoes de Recursos Estáticos(exemplo: requisicoes para arquivos css, javascript, imagens, etc.)
    @Override
    public void configure(WebSecurity web) throws Exception {
        super.configure(web);
    }
}
