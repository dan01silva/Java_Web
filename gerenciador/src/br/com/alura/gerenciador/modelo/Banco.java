package br.com.alura.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<>();
	private static List<Usuario> listaUsuarios = new ArrayList<>();
	private static Integer chaveSequencial = 1;

	static {
		Empresa empresa = new Empresa();
		empresa.setId(chaveSequencial++);
		empresa.setNome("Alura");
		Empresa empresa2 = new Empresa();
		empresa2.setId(chaveSequencial++);
		empresa2.setNome("Caelum");
		lista.add(empresa);
		lista.add(empresa2);

		System.out.println("Cadastro Alura e Caelum Realizado");

		Usuario u1 = new Usuario();
		Usuario u2 = new Usuario();
		u1.setLogin("Nico");
		u2.setLogin("Ana");
		u1.setSenha("1234");
		u2.setSenha("1234");

		listaUsuarios.add(u1);
		listaUsuarios.add(u2);

		System.out.println("Cadastro usuários Realizados");

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
	 * Método Iterator mais antigo, nos possibilita fazer alterações na lista
	 * enquanto percoremos ela, neste caso precisava remover uma empresa comparando
	 * o número de ID do getParametro..
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
			 * com o for é possivel percorrer a lista mas não se pode fazer alterações nela
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

	public Usuario existeUsuario(String login, String senha) {
		for (Usuario usuario : listaUsuarios) {
			if (usuario.ehIgual(login, senha)) {
				return usuario;
			}
		}
		return null;
	}
}
