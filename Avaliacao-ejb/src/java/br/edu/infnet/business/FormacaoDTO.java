
package br.edu.infnet.business;

import br.edu.infnet.domain.Formacao;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hudson Schumaker
 */
@Local
public interface FormacaoDTO {
    void cadastrar(Formacao Formacao);
    void alterar(Formacao Formacao);
    void excluir(Formacao Formacao);
    Formacao obter(Integer id);
    List<Formacao> listar();
}