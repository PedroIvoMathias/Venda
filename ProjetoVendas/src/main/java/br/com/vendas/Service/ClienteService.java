package br.com.vendas.Service;

import br.com.vendas.Model.Cliente;
import br.com.vendas.Repository.ClienteRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    
    @Autowired
    private ClienteRepository repository;
    
    public List<Cliente> findAll(){
       return  repository.findAll();
    }
    
    
    public Cliente findById(Long id){
        Optional <Cliente> obj = repository.findById(id);
        return obj.get();
    }
    
}
