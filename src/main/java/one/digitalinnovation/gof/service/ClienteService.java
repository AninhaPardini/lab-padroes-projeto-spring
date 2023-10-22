package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Cliente;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio de Cliente. Com isso
 * se necessário, podemos ter multiplas implementações dessa mesma interface.
 * 
 * @Author AninhaPardini
 */

public interface ClienteService {
	Iterable<Cliente> getAll();

	Cliente getClienteById(Long id);

	void updateCliente(Long id, Cliente cliente);

	void setClient(Cliente cliente);

	void deleteClienteById(Long id);
}