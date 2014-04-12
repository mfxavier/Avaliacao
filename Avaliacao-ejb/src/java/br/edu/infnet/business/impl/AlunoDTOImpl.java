
package br.edu.infnet.business.impl;

import br.edu.infnet.business.AlunoDTO;
import br.edu.infnet.dao.AlunoDAO;
import br.edu.infnet.domain.Aluno;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Hudson Schumaker
 */
@Stateless
public class AlunoDTOImpl implements AlunoDTO {

    @EJB
    private AlunoDAO alunoDAO;

    @Override
    public void cadastrar(Aluno aluno) {
        alunoDAO.cadastrar(aluno);
    }

    @Override
    public void alterar(Aluno aluno) {
        alunoDAO.alterar(aluno);
    }

    @Override
    public void excluir(Aluno aluno) {
        alunoDAO.excluir(aluno);
    }

    @Override
    public Aluno obter(Integer id) {
        return alunoDAO.obter(id);
    }

    @Override
    public List<Aluno> listar() {
        return alunoDAO.listar();
    }
}