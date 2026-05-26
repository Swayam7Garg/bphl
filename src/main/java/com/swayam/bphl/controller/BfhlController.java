package com.swayam.bphl.controller;

import com.swayam.bphl.dto.BfhlRequest;
import com.swayam.bphl.dto.BfhlResponse;
import com.swayam.bphl.service.BfhlService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
public class BfhlController {

    private static final Logger log = LoggerFactory.getLogger(BfhlController.class);
    private final BfhlService bfhlService;

    public BfhlController(BfhlService bfhlService) {
        this.bfhlService = bfhlService;
    }

    @PostMapping("/bfhl")
    public ResponseEntity<BfhlResponse> handlePost(@RequestBody(required = false) BfhlRequest request) {
        log.info("Received POST request. Raw request object is null: {}", (request == null));
        if (request != null) {
            log.info("Request data: {}", request.getData());
        }
        BfhlResponse response = bfhlService.processRequest(request);
        log.info("Sending response is_success: {}", response.isSuccess());
        return ResponseEntity.ok(response);
    }

    @GetMapping("/bfhl")
    public ResponseEntity<Map<String, Integer>> handleGet() {
        return ResponseEntity.ok(Map.of("operation_code", 1));
    }

    @GetMapping("/health")
    public ResponseEntity<Map<String, String>> handleHealth() {
        return ResponseEntity.ok(Map.of("status", "UP"));
    }
}
