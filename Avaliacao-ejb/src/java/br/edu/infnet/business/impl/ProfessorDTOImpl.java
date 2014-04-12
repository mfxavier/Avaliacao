package br.edu.infnet.business.impl;

import br.edu.infnet.business.ProfessorDTO;
import br.edu.infnet.dao.ProfessorDAO;
import br.edu.infnet.domain.Professor;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Hudson Schumaker
 */
@Stateless
public class ProfessorDTOImpl implements ProfessorDTO {

    @EJB
    private ProfessorDAO professorDAO;

    @Override
    public void cadastrar(Professor professor) {
        professorDAO.cadastrar(professor);
    }

    @Override
    public void alterar(Professor professor) {
        professorDAO.alterar(professor);
    }

    @Override
    public void excluir(Professor professor) {
        professorDAO.excluir(professor);
    }

    @Override
    public Professor obter(Integer id) {
        return professorDAO.obter(id);
    }

    @Override
    public List<Professor> listar() {
        return professorDAO.listar();
    }
}