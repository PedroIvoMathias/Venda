package br.com.vendas.Controller;

import br.com.vendas.Model.Cliente;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {
    
    @GetMapping
    public ResponseEntity<Cliente> findAll(){
        Cliente c = new Cliente(1L, "Jhon", "198.476.576-45", "(22)33322-9967");
        return ResponseEntity.ok().body(c);
    }
}
