package br.edu.iesb.poo2024.devlab7.padroesProjeto.adaptor;

import java.sql.ResultSet;

public interface IBancoDadosUtil {

	public void conectar(String url, String usuario, String senha);
	
	public void desconectar();
	
	public ResultSet execute(String sql);
}
