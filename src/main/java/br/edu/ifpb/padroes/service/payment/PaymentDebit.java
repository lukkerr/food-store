package br.edu.ifpb.padroes.service.payment;

public class PaymentDebit implements StrategyPayment {

	@Override
	public String pay() {
		return "Do debit payment!";
	}
}
