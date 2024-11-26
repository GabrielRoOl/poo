package br.edu.iesb.poo2024.devlab7;

import java.sql.ResultSet;

import br.edu.iesb.poo2024.devlab7.padroesProjeto.adaptor.BancoDadosAdapter;
import br.edu.iesb.poo2024.devlab7.padroesProjeto.adaptor.IBancoDadosUtil;
import br.edu.iesb.poo2024.devlab7.padroesProjeto.adaptor.libfornecedor.LabFornecedorDB;
import br.edu.iesb.poo2024.devlab7.padroesProjeto.singleton.RecursoCompartilhadoSingleton;

public class DevLabMain {

	public static void main(String[] args) {


		RecursoCompartilhadoSingleton singleton;
		
		// Exemplo 1: Implementação do padrão recurso compartilhado singleton
//		for (int i = 0; i < 20; i++) {
//			singleton = RecursoCompartilhadoSingleton.getInstance();
//			System.out.println(">> Singleton: " + singleton + " -- Hash: " + singleton.hashCode());
//		}

		// Exemplo 2: Implementação do padrão Adapter
		LabFornecedorDB labFornecedor = new LabFornecedorDB();
		
		IBancoDadosUtil bancoDadosUtil = new BancoDadosAdapter(labFornecedor);
		
		bancoDadosUtil.conectar("jdbc:mongodb://127.0.0.1:3300/iesb_db", "aluno_poo", "poo2024");
		
		String query = "select * from Alunos";
		
		ResultSet resultSet = bancoDadosUtil.execute(query);
		
		bancoDadosUtil.desconectar();
		
		
		
	}

}
