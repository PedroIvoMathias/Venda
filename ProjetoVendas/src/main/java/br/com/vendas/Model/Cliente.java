package br.com.vendas.Model;

import java.io.Serializable;
import java.util.Objects;



public class Cliente implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private Long ID;
    private String Nome, CPF, Telefone;
    //private Endereco Endereco;

    public Cliente() {
    }

    public Cliente(Long ID, String Nome, String CPF, String Telefone) {
        this.ID = ID;
        this.Nome = Nome;
        this.CPF = CPF;
        this.Telefone = Telefone;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.ID);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        return Objects.equals(this.ID, other.ID);
    }
    
    
}
