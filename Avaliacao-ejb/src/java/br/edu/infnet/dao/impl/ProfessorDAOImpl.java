package br.edu.infnet.dao.impl;

import br.edu.infnet.dao.AbstractDAO;
import br.edu.infnet.dao.ProfessorDAO;
import br.edu.infnet.domain.Professor;
import javax.ejb.Stateful;

/**
 *
 * @author Hudson Schumaker
 */
@Stateful
public class ProfessorDAOImpl extends AbstractDAO<Professor> implements ProfessorDAO {

    public ProfessorDAOImpl() {
        super(Professor.class);
    }
}