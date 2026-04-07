package com.arq.partnerrelocationlineage.service;

import com.arq.partnerrelocationlineage.repository.RefundRepository;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;

class RefundServiceTest {
    @Test
    void returnsSeedData() {
        RefundService service = new RefundService(new RefundRepository());
        assertFalse(service.summarize().isEmpty());
    }
}
