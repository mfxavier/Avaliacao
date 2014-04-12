
package br.edu.infnet.business;

import br.edu.infnet.domain.Aluno;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hudson Schumaker
 */
@Local
public interface AlunoDTO {
    void cadastrar(Aluno aluno);
    void alterar(Aluno aluno);
    void excluir(Aluno aluno);
    Aluno obter(Integer id);
    List<Aluno> listar();
}