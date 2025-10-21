package api.StaffHub.controllers;

import api.StaffHub.Entities.Beneficio;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/beneficios")
public class BeneficioController {
    @GetMapping
    public ResponseEntity<?> listarTodos() {
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarPorId(@PathVariable int id) {
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<?> criar(@RequestBody Beneficio beneficio) {
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> atualizar(@PathVariable int id, @RequestBody Beneficio beneficio) {
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable int id) {
        return ResponseEntity.ok().build();
    }
}