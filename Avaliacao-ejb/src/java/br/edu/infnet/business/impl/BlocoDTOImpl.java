
package br.edu.infnet.business.impl;

import br.edu.infnet.business.BlocoDTO;
import br.edu.infnet.dao.impl.BlocoDAOImpl;
import br.edu.infnet.domain.Bloco;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Hudson Schumaker
 */
@Stateless
public class BlocoDTOImpl implements BlocoDTO{

    @EJB
    private BlocoDAOImpl blocoDAO;
    
    @Override
    public void cadastrar(Bloco bloco) {
        blocoDAO.cadastrar(bloco);
    }

    @Override
    public void alterar(Bloco bloco) {
        blocoDAO.alterar(bloco);
    }

    @Override
    public void excluir(Bloco bloco) {
        blocoDAO.excluir(bloco);
    }

    @Override
    public Bloco obter(Integer id) {
        return blocoDAO.obter(id);
    }

    @Override
    public List<Bloco> listar() {
        return blocoDAO.listar();
    }
}