package com.stefanini.cielo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.stefanini.cielo.service.AbstractService;

public abstract class AbstractController<S extends AbstractService> implements IController {
	
	@Autowired
	protected S service;
	
}