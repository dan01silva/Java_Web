package br.com.alura.gerenciador.servelet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<Empresa>();
	
	static {	
		Empresa empresa = new Empresa();
		empresa.setNome("Alura");
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Caelum");
		lista.add(empresa);
		lista.add(empresa2);
		
			
	}
	
	public void adiciona(Empresa empresa) {
		lista.add(empresa);
	}
	public static List<Empresa> getEmpresas() {
		return lista;
	} 
	
	

}
