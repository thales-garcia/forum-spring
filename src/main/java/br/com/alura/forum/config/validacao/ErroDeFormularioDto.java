package br.com.alura.forum.config.validacao;

public class ErroDeFormularioDto {

    private String campo;
    private String erro;

    public ErroDeFormularioDto(String campo, String erroMensagem) {
        this.campo = campo;
        this.erro = erroMensagem;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public String getErroMensagem() {
        return erro;
    }

    public void setErroMensagem(String erroMensagem) {
        this.erro = erroMensagem;
    }
}
