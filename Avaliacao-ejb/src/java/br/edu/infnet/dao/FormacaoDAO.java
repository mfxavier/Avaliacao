
package br.edu.infnet.dao;

import br.edu.infnet.domain.Formacao;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hudson Schumaker
 */
@Local
public interface FormacaoDAO {
    void cadastrar(Formacao pformacao);
    void alterar(Formacao pformacao);
    void excluir(Formacao pformacao);
    Formacao obter(Integer id);
    List<Formacao> listar();
}