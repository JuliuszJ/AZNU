package org.bp.payment;
import java.math.BigDecimal;
import java.util.Date;

import org.bp.payment.model.PaymentException;
import org.bp.payment.model.PaymentRequest;
import org.bp.payment.model.PaymentResponse;

@org.springframework.web.bind.annotation.RestController
public class PaymentService {
		@org.springframework.web.bind.annotation.PostMapping("/payment")
		public PaymentResponse payment(
				@org.springframework.web.bind.annotation.RequestBody PaymentRequest paymentRequest) {
			if (paymentRequest!=null && paymentRequest.getAmount()!=null 
					&& paymentRequest.getAmount().getValue()!=null
					&& paymentRequest.getAmount().getValue().compareTo(new BigDecimal(0))<0) {

				throw new PaymentException("Amount value can not negative");
				
			}
				
			PaymentResponse paymentResponse = new PaymentResponse();
			paymentResponse.setTransactionDate(new Date());
			paymentResponse.setTransactionId(999);
			return paymentResponse;
		}

}
