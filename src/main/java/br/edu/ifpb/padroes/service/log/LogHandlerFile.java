package br.edu.ifpb.padroes.service.log;

public class LogHandlerFile implements LogHandler {

	@Override
	public void log(String message) {
		System.out.println("save data to a file");
	}

}
