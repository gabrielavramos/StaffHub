package api.StaffHub.controllers;

import api.StaffHub.Entities.Funcionario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/funcionarios")
public class FuncionarioController {
    @GetMapping
    public ResponseEntity<?> listarTodos() {
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarPorId(@PathVariable int id) {
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<?> criar(@RequestBody Funcionario funcionario) {
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> atualizar(@PathVariable int id, @RequestBody Funcionario funcionario) {
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable int id) {
        return ResponseEntity.ok().build();
    }
}