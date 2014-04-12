package br.edu.infnet.dao;

import br.edu.infnet.domain.Turma;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hudson Schumaker
 */
@Local
public interface TurmaDAO {
    void cadastrar(Turma turma);
    void alterar(Turma turma);
    void excluir(Turma turma);
    Turma obter(Integer id);
    List<Turma> listar();
}