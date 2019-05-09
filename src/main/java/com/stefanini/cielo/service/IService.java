package com.stefanini.cielo.service;

public interface IService {

	public void execute();
	
	public void specificExecute();
	
	public boolean isValidToken();
	
	public boolean hasPermission();
}
