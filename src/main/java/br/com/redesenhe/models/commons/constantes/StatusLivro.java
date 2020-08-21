package br.com.redesenhe.models.commons.constantes;

public enum  StatusLivro implements Constante<String>{

    /**
     * "LIDO"
     */
    LIDO("LIDO","LIDO"),

    /**
     * "NAO_LIDO"
     */
    NAO_LIDO("NAO_LIDO","NAO_LIDO")

    ;

    private String descricao;
    private String valor;

    StatusLivro(
        final String descricao,
        final String valor
    ) {
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public String getDescricao() {
        return null;
    }

    @Override
    public String getValor() {
        return null;
    }
}
