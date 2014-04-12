package br.edu.infnet.business;

import br.edu.infnet.domain.Turma;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hudson Schumaker
 */
@Local
public interface TurmaDTO {
    void cadastrar(Turma turma);
    void alterar(Turma turma);
    void excluir(Turma turma);
    Turma obter(Integer id);
    List<Turma> listar();
}