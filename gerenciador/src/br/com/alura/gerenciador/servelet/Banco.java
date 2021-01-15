package br.com.alura.gerenciador.servelet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<Empresa>();
	private static Integer chaveSequencial = 1;

	static {
		Empresa empresa = new Empresa();
		empresa.setId(chaveSequencial++);
		empresa.setNome("Alura");
		Empresa empresa2 = new Empresa();
		empresa2.setId(chaveSequencial++);
		empresa2.setNome("Caelum");
		lista.add(empresa);
		System.out.println("Cadastro Alura Realizado");
		lista.add(empresa2);
		System.out.println("Cadastro Caelum Realizado");

	}

	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		lista.add(empresa);
	}

	public static List<Empresa> getEmpresas() {
		if (lista != null) {
			return lista;
		}
		return null;
	}

	/**
	 * M�todo Iterator mais antigo, nos possibilita fazer altera��es na lista
	 * enquanto percoremos ela, neste caso precisava remover uma empresa comparando
	 * o n�mero de ID do getParametro..
	 * 
	 * @since 1.5
	 * @param id
	 */
	public static void removeEmpresa(Integer id) {
		Iterator<Empresa> it = lista.iterator();
		while (it.hasNext()) {
			Empresa emp = it.next();
			if (emp.getId() == id) {
				it.remove();
			}

			/**
			 * com o for � possivel percorrer a lista mas n�o se pode fazer altera��es nela
			 * enquanto a percorre.
			 */
			// for (Empresa empresa : lista) {
			// if(empresa.getId()== id) {
			// lista.remove(empresa);
			// }
			// }
		}
	}

	public static Empresa buscaEMpresaPelaId(Integer id) {
		for (Empresa empresa : lista) {
			if (empresa.getId() == id) {
				return empresa;
			}
		}
		return null;

	}
}
