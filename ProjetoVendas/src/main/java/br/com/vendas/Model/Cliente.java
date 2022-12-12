package br.com.vendas.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Entity
public class Cliente implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    
    private String Nome, CPF, Telefone;
    @Embedded
    private Endereco Endereco;
    
    @JsonIgnore
    @OneToMany(mappedBy = "cliente")
    private List<Pedido> Pedidos = new ArrayList<>();

    

    public Cliente() {
    }

    public Cliente(Long ID, String Nome, String CPF, String Telefone, Endereco Endereco) {
        this.ID = ID;
        this.Nome = Nome;
        this.CPF = CPF;
        this.Telefone = Telefone;
        this.Endereco = Endereco;
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

    public Endereco getEndereco() {
        return Endereco;
    }

    public void setEndereco(Endereco Endereco) {
        this.Endereco = Endereco;
    }
    
    public List<Pedido> getPedidos() {
        return Pedidos;
    }
    
    public void add( Pedido pedido){
        Pedidos.add(pedido);
    }
    public void remove (Pedido pedido){
        Pedidos.remove(pedido);
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
