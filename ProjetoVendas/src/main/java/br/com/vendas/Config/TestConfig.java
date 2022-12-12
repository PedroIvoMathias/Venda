package br.com.vendas.Config;

import br.com.vendas.Model.Cliente;
import br.com.vendas.Model.Endereco;
import br.com.vendas.Model.Pedido;
import br.com.vendas.Repository.ClienteRepository;
import br.com.vendas.Repository.PedidoRepository;
import java.time.Instant;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;



@Configuration
public class TestConfig implements CommandLineRunner {

    @Autowired
    private ClienteRepository clienteRepo;
    
    @Autowired
    private PedidoRepository pedidoRepo;
    
    

    @Override
    public void run(String... args) throws Exception {
        Endereco e = new Endereco("Cidade teste", "Bairro teste", "Cidade Teste", "19283-89", 1);
        Cliente c = new Cliente(null, "Jhon", "198.476.576-45", "(22)33322-9967",e);
        
        
        Endereco e2 = new Endereco("Cidade teste2", "Bairro teste2", "Cidade Teste2", "19283-83", 2);
        Cliente c2 = new Cliente(null, "Maria", "193.472.556-31", "(22)33322-9987",e2);       
        
        
        Pedido p1 = new Pedido(null, Instant.parse("2019-06-20T19:53:07Z"), c); 
        Pedido p2 = new Pedido(null, Instant.parse("2019-07-21T03:42:10Z"), c2); 
        Pedido p3 = new Pedido(null, Instant.parse("2019-07-22T15:21:22Z"), c); 
        
        clienteRepo.saveAll(Arrays.asList(c,c2));
        
        pedidoRepo.saveAll(Arrays.asList(p1,p2,p3));
        
        
    }
}
