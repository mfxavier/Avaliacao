package br.edu.infnet.dao.impl;

import br.edu.infnet.dao.AbstractDAO;
import br.edu.infnet.dao.FormacaoDAO;
import br.edu.infnet.domain.Formacao;
import javax.ejb.Stateful;

/**
 *
 * @author Hudson Schumaker
 */
@Stateful
public class FormacaoDAOImpl extends AbstractDAO<Formacao> implements FormacaoDAO {

    public FormacaoDAOImpl() {
        super(Formacao.class);
    }
}