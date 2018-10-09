
package com.prova1.Prova1;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")

public class ClienteResource {
        
    @Autowired
    private ClienteRepositorio clientes;
    
    @PostMapping
    public Cliente salvar(@RequestBody Cliente cliente) {
        return clientes.save(cliente);
    }
    
    @GetMapping
    public List<Cliente> pesquisar() {
        return clientes.findAll();
    }
    
    @PutMapping("/{id}")
    public void altear(@PathVariable Long id) {
        clientes.findAll();
    }
}