
package br.edu.infnet.dao;

import br.edu.infnet.domain.Aluno;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hudson Schumaker
 */
@Local
public interface AlunoDAO {
    void cadastrar(Aluno aluno);
    void alterar(Aluno aluno);
    void excluir(Aluno aluno);
    Aluno obter(Integer id);
    List<Aluno> listar();
}