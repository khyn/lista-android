package model;

/**
 * Created by alexf on 19/02/16.
 */
public enum EstadoAtual {

    FAZENDO{
        @Override
        public String toString() {
            return "Fazendo";
        }
    }, FINALIZADO{
        @Override
        public String toString() {
            return "finalizado";
        }
    };
}
