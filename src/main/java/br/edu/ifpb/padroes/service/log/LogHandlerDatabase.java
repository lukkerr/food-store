package br.edu.ifpb.padroes.service.log;

public class LogHandlerDatabase implements LogHandler {
	
	@Override
	public void log(String message) {
		System.out.println("save data to database");
	}
	
}
