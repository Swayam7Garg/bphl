package com.swayam.bphl.controller;

import com.swayam.bphl.dto.BfhlRequest;
import com.swayam.bphl.dto.BfhlResponse;
import com.swayam.bphl.service.BfhlService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/bfhl")
@CrossOrigin(origins = "*")
public class BfhlController {

    private final BfhlService bfhlService;

    public BfhlController(BfhlService bfhlService) {
        this.bfhlService = bfhlService;
    }

    @PostMapping
    public ResponseEntity<BfhlResponse> handlePost(@RequestBody BfhlRequest request) {
        BfhlResponse response = bfhlService.processRequest(request);
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<Map<String, Integer>> handleGet() {
        return ResponseEntity.ok(Map.of("operation_code", 1));
    }
}
