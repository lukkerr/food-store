package br.edu.ifpb.padroes.service.payment;

public class PaymentPaypal implements StrategyPayment {

	@Override
	public String pay() {
		return "Do paypal payment!";
	}
}
