package br.edu.infnet.dao.impl;

import br.edu.infnet.dao.AbstractDAO;
import br.edu.infnet.dao.QuestaoDAO;
import br.edu.infnet.domain.Questao;
import javax.ejb.Stateful;

/**
 *
 * @author Hudson Schumaker
 */
@Stateful
public class QuestaoDAOImpl extends AbstractDAO<Questao> implements QuestaoDAO {

    public QuestaoDAOImpl() {
        super(Questao.class);
    }
}
