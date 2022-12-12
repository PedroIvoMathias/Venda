package br.com.vendas.Service;

import br.com.vendas.Model.Pedido;
import br.com.vendas.Repository.PedidoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {
    
    @Autowired
    private PedidoRepository repository;
    
    public List<Pedido> findAll(){
        return repository.findAll();
    }
    
    public Pedido findById(Long ID){
        Optional<Pedido> obj = repository.findById(ID);
        return obj.get();
    }
}
