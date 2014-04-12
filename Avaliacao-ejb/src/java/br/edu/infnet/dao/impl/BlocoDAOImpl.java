package br.edu.infnet.dao.impl;

import br.edu.infnet.dao.AbstractDAO;
import br.edu.infnet.dao.BlocoDAO;
import br.edu.infnet.domain.Bloco;

/**
 *
 * @author Hudson Schumaker
 */
public class BlocoDAOImpl extends AbstractDAO<Bloco> implements BlocoDAO {

    public BlocoDAOImpl() {
        super(Bloco.class);
    }
}