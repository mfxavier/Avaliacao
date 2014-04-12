package br.edu.infnet.dao.impl;

import br.edu.infnet.dao.AbstractDAO;
import br.edu.infnet.dao.CursoDAO;
import br.edu.infnet.domain.Curso;
import javax.ejb.Stateful;

/**
 *
 * @author Hudson Schumaker
 */
@Stateful
public class CursoDAOImpl extends AbstractDAO<Curso> implements CursoDAO {

    public CursoDAOImpl() {
        super(Curso.class);
    }
}