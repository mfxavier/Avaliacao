package br.edu.infnet.dao;

import br.edu.infnet.domain.Curso;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hudson Schumaker
 */
@Local
public interface CursoDAO {
    void cadastrar(Curso curso);
    void alterar(Curso curso);
    void excluir(Curso curso);
    Curso obter(Integer id);
    List<Curso> listar();
}