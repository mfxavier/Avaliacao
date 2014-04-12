package br.edu.infnet.business.impl;

import br.edu.infnet.business.ModuloDTO;
import br.edu.infnet.dao.impl.ModuloDAOImpl;
import br.edu.infnet.domain.Modulo;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Hudson Schumaker
 */
@Stateless
public class ModuloDTOImpl implements ModuloDTO {

    @EJB
    private ModuloDAOImpl moduloDAO;

    @Override
    public void cadastrar(Modulo modulo) {
        moduloDAO.cadastrar(modulo);
    }

    @Override
    public void alterar(Modulo modulo) {
        moduloDAO.alterar(modulo);
    }

    @Override
    public void excluir(Modulo modulo) {
        moduloDAO.excluir(modulo);
    }

    @Override
    public Modulo obter(Integer id) {
        return moduloDAO.obter(id);
    }

    @Override
    public List<Modulo> listar() {
        return moduloDAO.listar();
    }
}