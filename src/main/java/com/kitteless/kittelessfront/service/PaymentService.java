package com.kitteless.kittelessfront.service;

import com.kitteless.kittelessfront.data.PaymentDataResponse;
import com.kitteless.kittelessfront.data.Stamp;
import com.kitteless.kittelessfront.repository.PaymentRepository;
import com.kitteless.kittelessfront.repository.PaypayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

    public Stamp getStampWithPayment(String userId, int price) {
        PaymentDataResponse result = paymentRepository.post(userId, price);

        if (result.getPaymentResult().equals("success")) {
            Stamp stamp = new Stamp();
            stamp.setCode(result.getStampCode());
            return stamp;
        }

        return null;
    }

    @Autowired
    PaypayRepository paypayRepository;

    public Stamp paypay(String userId, int price) {

        paypayRepository.call(userId, price);

        Stamp stamp = new Stamp();
        stamp.setCode("998877665");
        return stamp;
    }
}
