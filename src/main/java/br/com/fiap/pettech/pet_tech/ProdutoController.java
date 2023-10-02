package br.com.fiap.pettech.pet_tech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    public ProdutoService service;

    @GetMapping
    public ResponseEntity<Collection<Produto>> findAll() {
        var produtos = service.findAll();
        return ResponseEntity.ok(produtos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> findByI(@PathVariable UUID id) {
        var produto = service.findById(id);
        return ResponseEntity.ok(produto);
    }

   @PostMapping
    public ResponseEntity<Produto> save(@RequestBody Produto produto) {
        produto = service.save(produto);
        return ResponseEntity.status(201).body(produto);
   }

   // @Put http://localhost:8080/poduto/iProduto
   @PutMapping("/{id}")
    public ResponseEntity<Produto> update(@RequestBody Produto produto, @PathVariable UUID id) {
        produto = service.update(id, produto);
        return ResponseEntity.ok().body(produto);
   }

   @DeleteMapping("/{id}")
   public ResponseEntity<Void> delete(@PathVariable UUID id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
   }



}
