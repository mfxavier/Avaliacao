
package br.edu.infnet.business.impl;

import br.edu.infnet.business.TurmaDTO;
import br.edu.infnet.dao.impl.TurmaDAOImpl;
import br.edu.infnet.domain.Turma;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Hudson Schumaker
 */
@Stateless
public class TurmaDTOImpl implements TurmaDTO{

    @EJB
    private TurmaDAOImpl turmaDAO;
    
    @Override
    public void cadastrar(Turma turma) {
        turmaDAO.cadastrar(turma);
    }

    @Override
    public void alterar(Turma turma) {
        turmaDAO.alterar(turma);
    }

    @Override
    public void excluir(Turma turma) {
        turmaDAO.excluir(turma);
    }

    @Override
    public Turma obter(Integer id) {
        return turmaDAO.obter(id);
    }

    @Override
    public List<Turma> listar() {
        return turmaDAO.listar();
    }
}