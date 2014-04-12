package br.edu.infnet.business.impl;

import br.edu.infnet.business.FormacaoDTO;
import br.edu.infnet.dao.impl.FormacaoDAOImpl;
import br.edu.infnet.domain.Formacao;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Hudson Schumaker
 */
@Stateless
public class FormacaoDTOImpl implements FormacaoDTO {

    @EJB
    private FormacaoDAOImpl formacaoDAO;

    @Override
    public void cadastrar(Formacao Formacao) {
        formacaoDAO.cadastrar(Formacao);
    }

    @Override
    public void alterar(Formacao Formacao) {
        formacaoDAO.alterar(Formacao);
    }

    @Override
    public void excluir(Formacao Formacao) {
        formacaoDAO.excluir(Formacao);
    }

    @Override
    public Formacao obter(Integer id) {
        return formacaoDAO.obter(id);
    }

    @Override
    public List<Formacao> listar() {
        return formacaoDAO.listar();
    }
}