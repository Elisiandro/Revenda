package br.com.agenda.model;
/**
 *
 * @Elisiandro
 */

public class Enum {

    public enum OpcoesMenu {

        SALVAR(1), 
        IMPRMIR(2), 
        ABRIR(3), 
        VISUALIZAR(4), 
        FECHAR(5);
        
        private final int valor;

        OpcoesMenu(int valorOpcao) {
            valor = valorOpcao;
        }

        public int getValor() {
            return valor;
        }
    }
    
    public enum CNPJ_CPF {
        CNPJ(1), 
        CPF(2);        
        
        private final int valor;
        CNPJ_CPF(int valorOpcao) {
            valor = valorOpcao;
        }
        public int getValor() {
            return valor;
        }
    }
    
    public enum PERFIL_GRUPO {
        ADMIN(1),
        GERENTE_VENDA(2), 
        VENDEDOR(3),
        FINANCEIRO(4);
        
        
        private final int valor;
        PERFIL_GRUPO(int valorOpcao) {
            valor = valorOpcao;
        }
        public int getValor() {
            return valor;
        }
    }
    
    public enum TIPO_AUTOMOVEL {
        
        CARRO(1), 
        MOTO(2),        
        CAMINHAO(3),
        BARCO(4);
        
        private final int valor;
        TIPO_AUTOMOVEL(int valorOpcao) {
            valor = valorOpcao;
        }
        public int getValor() {
            return valor;
        }
    }

    public enum COR_AUTOMOVEL {
        
        PRETO(1), 
        BRANCO(2),        
        AZUL(3),
        VERMELHO(4),
        PRATA(5),
        CINZA(6),
        MARROM(7),
        BEGE(8),
        VERDE(9),
        AMARELO(10),
        DOURADO(11);
        
        private final int valor;
        COR_AUTOMOVEL(int valorOpcao) {
            valor = valorOpcao;
        }
        public int getValor() {
            return valor;
        }
    }

}
