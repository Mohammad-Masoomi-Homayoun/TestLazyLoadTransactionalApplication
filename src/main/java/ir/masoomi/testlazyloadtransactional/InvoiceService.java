package ir.masoomi.testlazyloadtransactional;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class InvoiceService {

    private final InvoiceRepository invoiceRepository;

    public Invoice get(Long id) {
        return invoiceRepository.findById(id).get();
    }

    public Invoice insert(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }
}
