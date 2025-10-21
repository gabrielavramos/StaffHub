package api.StaffHub.controllers;

import api.StaffHub.Entities.SolicitacaoFerias;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ferias")
public class FeriasController {
    @GetMapping
    public ResponseEntity<?> listarTodas() {
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarPorId(@PathVariable int id) {
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<?> solicitar(@RequestBody SolicitacaoFerias solicitacao) {
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}/status")
    public ResponseEntity<?> atualizarStatus(@PathVariable int id, @RequestBody String status) {
        return ResponseEntity.ok().build();
    }
}