package one.digitalinnovation.gof.service.Impl;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.service.ClienteService;
import org.springframework.stereotype.Service;

/**
 * Implementacao da <b>Strategy</b> {@link ClienteService}, a qual pode ser
 * injetada pelo Spring(via{@link Autowired}). Com isso, como essa classse e um
 * {@link Service}, ela sera tratada como um <b>Singleton</b>.
 *
 * @author angelo.ferro
 * */
@Service
public class ClienteServiceImpl implements ClienteService {
    // TODO Singleton: Injetar os componentes do Spring com @Autowired.
    // TODO Strategy: Implementar os metodos definidos na interface.
    // TODO Gacade: Abstrair integracoes com subsistemas, provendo uma interface simples.

    @Override
    public Iterable<Cliente> buscarTodos(){
        // FIXME Buscar todos os Clientes.
        return null;
    }
    @Override
    public Cliente buscarPorId(Long id){
        // FIXME Buscar todos os Clientes por ID.
        return null;
    }
    @Override
    public void inserir(Cliente cliente){
        // FIXME Verificar se o Endereco do Cliente ja existe (pelo CEP).
        // FIXME Caso nao exista, integrar com o ViaCEP e persistir o retorno.
        // FIXME Inserir Cliente, vinculando o Endereco (novo ou existente).
    }
    @Override
    public void atualizar(Long id, Cliente cliente){
        // FIXME Buscar Cliente por ID, caso exista:
        // FIXME Verificar se o Endereco do Cliente ja existe (pelo CEP).
        // FIXME Caso nao exista, integrar com o ViaCEP e persistir o retorno.
        // FIXME Alterar Cliente, vinculando o Endereco (novo ou existente).
    }
    @Override
    public void deletar(Long id){
        // FIXME Deletar Cliente por ID
    }
}
