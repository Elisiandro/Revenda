
package br.com.revenda.dao;

import br.com.agenda.model.Usuario;
import java.util.List;

/**
 *
 * @author Elisiandro
 */
public interface InterfaceUsuario {
    public Usuario getUsuarios(Long id);
    public void salvar(Usuario usuario);
    public void remover(Usuario usuario);
    public void atualizar(Usuario usuario);
    public List<Usuario> list();
}
