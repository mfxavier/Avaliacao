package br.edu.infnet.dao.impl;

import br.edu.infnet.dao.AbstractDAO;
import br.edu.infnet.dao.ModuloDAO;
import br.edu.infnet.domain.Modulo;
import javax.ejb.Stateful;

/**
 *
 * @author Hudson Schumaker
 */
@Stateful
public class ModuloDAOImpl extends AbstractDAO<Modulo> implements ModuloDAO {

    public ModuloDAOImpl() {
        super(Modulo.class);
    }
}