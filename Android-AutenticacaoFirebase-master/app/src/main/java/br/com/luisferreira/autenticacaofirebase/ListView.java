package br.com.luisferreira.autenticacaofirebase;

import java.util.List;

public class ListView {
    private List<TarefaBean> tarefa;

    public List<TarefaBean> getTarefa() {
        return tarefa;
    }

    public void setTarefa(List<TarefaBean> tarefa) {
        this.tarefa = tarefa;
    }

    public static class TarefaBean {
        /**
         * id : 1
         * descricao : Verificar número do conjunto Coroa e Pinhão, Deverão ser iguais.
         * imagem : No_Image.png
         */

        public String id;
        private String descricao;
        String imagem;
        public char[] content;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public String getImagem() {
            return imagem;
        }

        public void setImagem(String imagem) {
            this.imagem = imagem;
        }
    }
}
