package api.StaffHub.controllers;

import api.StaffHub.Entities.Feedback;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/feedbacks")
public class FeedbackController {
    @GetMapping
    public ResponseEntity<?> listarTodos() {
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarPorId(@PathVariable int id) {
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<?> criar(@RequestBody Feedback feedback) {
        return ResponseEntity.ok().build();
    }
}