package com.example.mcpbridge.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class ChatController {

    @PostMapping("/chat")
    public ResponseEntity<Map<String, String>> chat(@RequestBody Map<String, String> payload) {
        String userMessage = payload.get("message");
        // TODO: Integrate with Spring AI and MCP Teams Server to generate reply
        String reply = "This is a placeholder reply to: " + userMessage;
        return ResponseEntity.ok(Map.of("reply", reply));
    }
}
