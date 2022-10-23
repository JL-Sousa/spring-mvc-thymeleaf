package com.br.tecodev.mvc.mudi.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.br.tecodev.mvc.mudi.model.Pedido;

@Repository
public class PedidoRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	
	public List<Pedido> recuperarTodosOsPedidos() {
		Query query = entityManager.createQuery("select p from Pedido p", Pedido.class);
		return query.getResultList();
		
	}
}
