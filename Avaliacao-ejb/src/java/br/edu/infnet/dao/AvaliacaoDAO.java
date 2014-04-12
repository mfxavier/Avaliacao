
package br.edu.infnet.dao;

import br.edu.infnet.domain.Avaliacao;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hudson Schumaker
 */
@Local
public interface AvaliacaoDAO {
    void cadastrar(Avaliacao avaliacao);
    void alterar(Avaliacao avaliacao);
    void excluir(Avaliacao avaliacao);
    Avaliacao obter(Integer id);
    List<Avaliacao> listar();
}