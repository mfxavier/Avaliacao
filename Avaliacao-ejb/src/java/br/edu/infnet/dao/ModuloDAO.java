
package br.edu.infnet.dao;

import br.edu.infnet.domain.Modulo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hudson Schumaker
 */
@Local
public interface ModuloDAO {
    void cadastrar(Modulo modulo);
    void alterar(Modulo modulo);
    void excluir(Modulo modulo);
    Modulo obter(Integer id);
    List<Modulo> listar();
}