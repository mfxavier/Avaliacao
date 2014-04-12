package br.edu.infnet.dao;

import br.edu.infnet.domain.Professor;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hudson Schumaker
 */
@Local
public interface ProfessorDAO {
    void cadastrar(Professor professor);
    void alterar(Professor professor);
    void excluir(Professor professor);
    Professor obter(Integer id);
    List<Professor> listar();
}