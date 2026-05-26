package com.swayam.bphl.service;

import com.swayam.bphl.dto.BfhlRequest;
import com.swayam.bphl.dto.BfhlResponse;

public interface BfhlService {
    BfhlResponse processRequest(BfhlRequest request);
}
