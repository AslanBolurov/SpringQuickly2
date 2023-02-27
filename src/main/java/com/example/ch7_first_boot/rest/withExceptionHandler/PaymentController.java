package com.example.ch7_first_boot.rest.withExceptionHandler;


import com.example.ch7_first_boot.rest.withExceptionHandler.exceptions.NotEnoughMoneyException;
import com.example.ch7_first_boot.rest.withExceptionHandler.model.ErrorDetails;
import com.example.ch7_first_boot.rest.withExceptionHandler.model.PaymentDetails;
import com.example.ch7_first_boot.rest.withExceptionHandler.service.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class PaymentController {

//    private final PaymentService paymentService;
//
//    public PaymentController(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

    private static Logger logger=
            Logger.getLogger(PaymentController.class.getName());

    @PostMapping("/payment")
    public ResponseEntity<PaymentDetails> makePayment(
            @RequestBody PaymentDetails paymentDetails//from PostMan
    ) {
        logger.info("Received payment "+ paymentDetails.getAmount());
//    public ResponseEntity<?> makePayment() {
//        PaymentDetails paymentDetails = paymentService.processPayment();
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(paymentDetails);
    }
}
