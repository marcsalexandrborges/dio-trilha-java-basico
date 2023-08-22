

public class ContaTerminal {
    
        
        //TODO: Conhecer e importar a classe Scanner

        //Exibir as mensagens para  o nosso usuário

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada

        private Integer conta;
        private String  agencia;
        private String  cliente;
        private Double  saldo;

        
        public Integer getConta() {
            return conta;
        }
        public void setConta(Integer conta) {
            this.conta = conta;
        }
        public String getAgencia() {
            return agencia;
        }
        public void setAgencia(String agencia) {
            this.agencia = agencia;
        }
        public String getCliente() {
            return cliente;
        }
        public void setCliente(String cliente) {
            this.cliente = cliente;
        }
        public Double getSaldo() {
            return saldo;
        }
        public void setSaldo(Double saldo) {
            this.saldo = saldo;
        }
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((conta == null) ? 0 : conta.hashCode());
            result = prime * result + ((agencia == null) ? 0 : agencia.hashCode());
            result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
            result = prime * result + ((saldo == null) ? 0 : saldo.hashCode());
            return result;
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            ContaTerminal other = (ContaTerminal) obj;
            if (conta == null) {
                if (other.conta != null)
                    return false;
            } else if (!conta.equals(other.conta))
                return false;
            if (agencia == null) {
                if (other.agencia != null)
                    return false;
            } else if (!agencia.equals(other.agencia))
                return false;
            if (cliente == null) {
                if (other.cliente != null)
                    return false;
            } else if (!cliente.equals(other.cliente))
                return false;
            if (saldo == null) {
                if (other.saldo != null)
                    return false;
            } else if (!saldo.equals(other.saldo))
                return false;
            return true;
        }
        
    }


