package repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import entities.Pessoa;
import factories.ConnectionFactory;
import interfaces.IRepository;

public class PessoaRepository implements IRepository<Pessoa>{

	@Override
	public void save(Pessoa entity) throws Exception {
		// abrir conexão bd
		Connection connection = ConnectionFactory.getConnection();
		
		// Cadastrando pessoa na tabela do bd
		
		PreparedStatement statement = connection.prepareStatement("insert into pessoa (nome, email) values(?,?)");
		statement.setString(1, entity.getNome());
		statement.setString(2, entity.getEmail());
		statement.execute();
		
		connection.close();
		
		
		
		
	}

	@Override
	public void updte(Pessoa entity) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Pessoa entity) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Pessoa> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pessoa findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
