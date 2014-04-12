package br.edu.infnet.dao.impl;

import br.edu.infnet.dao.AbstractDAO;
import br.edu.infnet.dao.AlunoDAO;
import br.edu.infnet.domain.Aluno;
import javax.ejb.Stateful;

/**
 *
 * @author Hudson Schumaker
 */
@Stateful
public class AlunoDAOImpl extends AbstractDAO<Aluno> implements AlunoDAO {

    public AlunoDAOImpl() {
        super(Aluno.class);
    }
}