package br.edu.infnet.business.impl;

import br.edu.infnet.business.AvaliacaoDTO;
import br.edu.infnet.dao.impl.AvaliacaoDAOImpl;
import br.edu.infnet.domain.Avaliacao;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateful;

/**
 *
 * @author Hudson Schumaker
 */
@Stateful
public class AvalicaoDTOImpl implements AvaliacaoDTO {

    @EJB
    private AvaliacaoDAOImpl avaliacaoDAO;

    @Override
    public void cadastrar(Avaliacao avaliacao) {
        avaliacaoDAO.cadastrar(avaliacao);
    }

    @Override
    public void alterar(Avaliacao avaliacao) {
        avaliacaoDAO.alterar(avaliacao);
    }

    @Override
    public void excluir(Avaliacao avaliacao) {
        avaliacaoDAO.excluir(avaliacao);
    }

    @Override
    public Avaliacao obter(Integer id) {
        return avaliacaoDAO.obter(id);
    }

    @Override
    public List<Avaliacao> listar() {
        return avaliacaoDAO.listar();
    }
}