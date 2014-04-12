
package br.edu.infnet.business;

import br.edu.infnet.domain.Modulo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hudson Schumaker
 */
@Local
public interface ModuloDTO {
    void cadastrar(Modulo modulo);
    void alterar(Modulo modulo);
    void excluir(Modulo modulo);
    Modulo obter(Integer id);
    List<Modulo> listar();
}
