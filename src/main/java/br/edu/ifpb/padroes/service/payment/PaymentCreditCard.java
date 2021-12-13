package br.edu.ifpb.padroes.service.payment;

public class PaymentCreditCard implements StrategyPayment {

	@Override
	public String pay() {
		return "Do credit card payment!";
	}
}
