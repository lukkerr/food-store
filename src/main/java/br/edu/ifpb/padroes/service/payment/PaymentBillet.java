package br.edu.ifpb.padroes.service.payment;

public class PaymentBillet implements StrategyPayment {

	@Override
	public String pay() {
		return "Do billet payment!";
	}
}
