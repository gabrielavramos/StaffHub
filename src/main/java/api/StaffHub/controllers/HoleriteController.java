package api.StaffHub.controllers;

import api.StaffHub.Entities.Holerite;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/holerites")
public class HoleriteController {
    @GetMapping
    public ResponseEntity<?> listarTodos() {
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarPorId(@PathVariable int id) {
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<?> gerar(@RequestBody Holerite holerite) {
        return ResponseEntity.ok().build();
    }
}