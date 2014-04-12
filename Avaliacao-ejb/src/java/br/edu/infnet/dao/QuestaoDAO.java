
package br.edu.infnet.dao;

import br.edu.infnet.domain.Questao;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hudson Schumaker
 */
@Local
public interface QuestaoDAO {
    void cadastrar(Questao questao);
    void alterar(Questao questao);
    void excluir(Questao questao);
    Questao obter(Integer id);
    List<Questao> listar();
}