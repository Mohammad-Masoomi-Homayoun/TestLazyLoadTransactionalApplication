package ir.masoomi.testlazyloadtransactional;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/invoice")
public class InvoiceController {

    private final InvoiceService invoiceService;

    @GetMapping("/{id}")
    public Invoice get(@PathVariable Long id) {
        return invoiceService.get(id);
    }

    @PostMapping
    public Invoice insert(@RequestBody Invoice invoice) {
        return invoiceService.insert(invoice);
    }
}
