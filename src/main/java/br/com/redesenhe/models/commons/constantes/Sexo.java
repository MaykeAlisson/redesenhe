package br.com.redesenhe.models.commons.constantes;

public enum Sexo implements Constante<String> {

    /**
     * "M"
     */
    MASCULINO("MASCULINO","M"),

    /**
     * "F"
     */
    FEMININO("FEMININO","F")
    ;

    private String descricao;
    private String valor;

    Sexo(
        final String descricao,
        final String valor
    ) {
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public String getValor() {
        return valor;
    }

}
