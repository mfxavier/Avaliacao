package br.edu.infnet.dao.impl;

import br.edu.infnet.dao.AbstractDAO;
import br.edu.infnet.dao.AvaliacaoDAO;
import br.edu.infnet.domain.Avaliacao;
import javax.ejb.Stateful;

/**
 *
 * @author Hudson Schumaker
 */
@Stateful
public class AvaliacaoDAOImpl extends AbstractDAO<Avaliacao> implements AvaliacaoDAO {

    public AvaliacaoDAOImpl() {
        super(Avaliacao.class);
    }
}
