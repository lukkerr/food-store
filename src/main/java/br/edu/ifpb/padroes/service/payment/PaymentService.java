package br.edu.ifpb.padroes.service.payment;

public class PaymentService {

	public void doPayment(StrategyPayment payment) throws Exception {
		System.out.println( payment.pay() );
	}
}
