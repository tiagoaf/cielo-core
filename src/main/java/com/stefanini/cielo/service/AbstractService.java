package com.stefanini.cielo.service;

import org.apache.log4j.Logger;

public abstract class AbstractService implements IService {
	
	private static final Logger logger = Logger.getLogger(AbstractService.class);

	/**
	 * Utilizando o Design Pattern [Template Method]
	 * 
	 * Este é o método execute, que realiza algumas validações 
	 */
	final public void execute() {
		logger.info("Iniciando o processamento no service");
		
		if(this.isValidToken()) {
			
			if(this.hasPermission()) {
				
				// E se está tudo certo, então é executada a ação principal
				this.specificExecute();
			}
		}
	}
	
	public boolean hasPermission() {
		logger.debug("Aqui verifico se o token recebido no header da requisição está válido");
		return true;
	}
	
	/**
	 * Valida o token
	 * @return boolean
	 */
	public boolean isValidToken() {
		logger.debug("Aqui verifico se o token recebido no header da requisição está válido");
		return true;
	}
	
}