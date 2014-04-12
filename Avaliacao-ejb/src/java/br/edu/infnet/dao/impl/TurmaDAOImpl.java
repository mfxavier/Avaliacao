package br.edu.infnet.dao.impl;

import br.edu.infnet.dao.AbstractDAO;
import br.edu.infnet.dao.TurmaDAO;
import br.edu.infnet.domain.Turma;
import javax.ejb.Stateful;

/**
 *
 * @author Hudson Schumaker
 */
@Stateful
public class TurmaDAOImpl extends AbstractDAO<Turma> implements TurmaDAO {

    public TurmaDAOImpl() {
        super(Turma.class);
    }
}