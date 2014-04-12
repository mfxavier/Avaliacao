package br.edu.infnet.business;

import br.edu.infnet.domain.Bloco;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hudson Schumaker
 */
@Local
public interface BlocoDTO {
    void cadastrar(Bloco bloco);
    void alterar(Bloco bloco);
    void excluir(Bloco bloco);
    Bloco obter(Integer id);
    List<Bloco> listar();
}
