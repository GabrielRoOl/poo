package br.edu.iesb.poo2024.devlab7.padroesProjeto.adaptor;

import java.sql.ResultSet;

import br.edu.iesb.poo2024.devlab7.padroesProjeto.adaptor.libfornecedor.IQueryResultLibFornecedorDB;
import br.edu.iesb.poo2024.devlab7.padroesProjeto.adaptor.libfornecedor.LabFornecedorDB;

public class BancoDadosAdapter implements IBancoDadosUtil {

	private LabFornecedorDB labFornecedorDB;

	public BancoDadosAdapter(LabFornecedorDB dbBiblioteca) {
		this.labFornecedorDB = dbBiblioteca;
	}

	@Override
	public void conectar(String url, String usuario, String senha) {
		// tradução entre as interfaces
		this.labFornecedorDB.connect(url, usuario, senha);

	}

	@Override
	public void desconectar() {
		// tradução entre as interfaces
		this.labFornecedorDB.disconnect();

	}

	@Override
	public ResultSet execute(String sql) {
		// TODO Auto-generated method stub

		IQueryResultLibFornecedorDB resultLibFornecedorDB = this.labFornecedorDB.execute(sql);

		ResultSet resultSet = null;
		resultSet = converterQueryResultToResultSet(resultLibFornecedorDB);

		return resultSet;
	}

	// metodo responsável por implementar o Adapter
	private ResultSet converterQueryResultToResultSet(IQueryResultLibFornecedorDB iQueryResult) {

		// Omitir a regra de negocio para a conversão
		// java.sql.ResultSet
		ResultSet novoResultSet = null;

		return novoResultSet;
	}

}
