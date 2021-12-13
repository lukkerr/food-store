package br.edu.ifpb.padroes.service.payment;

public interface StrategyPayment {
	
	default String pay() {
		return "unknown payment method";
	};
}
