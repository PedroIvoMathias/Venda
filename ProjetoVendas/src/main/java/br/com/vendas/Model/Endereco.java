package br.com.vendas.Model;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class Endereco implements Serializable{
    private static  final long serialVersionUID = 1L;
    
    
    private String Rua, Bairro, Cidade, Cep;
    private int  Numero;

    public Endereco() {
    }

    public Endereco(String Rua, String Bairro, String Cidade, String Cep, int Numero) {
        this.Rua = Rua;
        this.Bairro = Bairro;
        this.Cidade = Cidade;
        this.Cep = Cep;
        this.Numero = Numero;
    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String Rua) {
        this.Rua = Rua;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getCep() {
        return Cep;
    }

    public void setCep(String Cep) {
        this.Cep = Cep;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.Rua);
        hash = 73 * hash + Objects.hashCode(this.Bairro);
        hash = 73 * hash + Objects.hashCode(this.Cidade);
        hash = 73 * hash + Objects.hashCode(this.Cep);
        hash = 73 * hash + this.Numero;
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
        final Endereco other = (Endereco) obj;
        if (this.Numero != other.Numero) {
            return false;
        }
        if (!Objects.equals(this.Rua, other.Rua)) {
            return false;
        }
        if (!Objects.equals(this.Bairro, other.Bairro)) {
            return false;
        }
        if (!Objects.equals(this.Cidade, other.Cidade)) {
            return false;
        }
        return Objects.equals(this.Cep, other.Cep);
    }
    
    
}
