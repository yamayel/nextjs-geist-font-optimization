package com.example.mcpbridge.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/teams")
public class TeamsController {

    @GetMapping("/meetings/today")
    public ResponseEntity<String> getTodaysMeetings() {
        // TODO: Implement logic to get today's meetings from MCP Teams Server
        return ResponseEntity.ok("List of today's meetings");
    }

    @GetMapping("/springboot/explain")
    public ResponseEntity<String> explainSpringBoot() {
        // TODO: Implement logic to explain Spring Boot and list components
        return ResponseEntity.ok("Spring Boot is ... Components are ...");
    }

    @PostMapping("/message/send")
    public ResponseEntity<String> sendMessage(@RequestParam String toUser, @RequestParam String message) {
        // TODO: Implement logic to send message to Teams user via MCP Teams Server
        return ResponseEntity.ok("Message sent to " + toUser);
    }
}
