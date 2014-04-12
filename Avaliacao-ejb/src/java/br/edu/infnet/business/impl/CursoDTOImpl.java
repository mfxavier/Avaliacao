package br.edu.infnet.business.impl;

import br.edu.infnet.business.CursoDTO;
import br.edu.infnet.dao.impl.CursoDAOImpl;
import br.edu.infnet.domain.Curso;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Hudson Schumaker
 */
@Stateless
public class CursoDTOImpl implements CursoDTO {

    @EJB
    private CursoDAOImpl cursoDAO;

    @Override
    public void cadastrar(Curso curso) {
        cursoDAO.cadastrar(curso);
    }

    @Override
    public void alterar(Curso curso) {
        cursoDAO.alterar(curso);
    }

    @Override
    public void excluir(Curso curso) {
        cursoDAO.excluir(curso);
    }

    @Override
    public Curso obter(Integer id) {
        return cursoDAO.obter(id);
    }

    @Override
    public List<Curso> listar() {
        return cursoDAO.listar();
    }
}