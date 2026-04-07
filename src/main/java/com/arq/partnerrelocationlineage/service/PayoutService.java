package com.arq.partnerrelocationlineage.service;

import com.arq.partnerrelocationlineage.dto.PayoutResponse;
import com.arq.partnerrelocationlineage.repository.PayoutRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PayoutService {
    private final PayoutRepository repository;

    public PayoutService(PayoutRepository repository) {
        this.repository = repository;
    }

    public List<PayoutResponse> summarize() {
        return repository.findAll().stream().map(record -> new PayoutResponse(record.getId(), "ACTIVE", record.getOwner())).toList();
    }
}
