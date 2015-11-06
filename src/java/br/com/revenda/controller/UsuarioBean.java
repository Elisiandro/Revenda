package br.com.revenda.controller;

import br.com.agenda.model.Usuario;
import br.com.revenda.dao.InterfaceUsuario;
import br.com.revenda.dao.UsuarioDao;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author Elisiandro
 */
@ManagedBean
@SessionScoped
public class UsuarioBean {
    private Usuario usuario;
    private DataModel listaUsuarios;

    public Usuario getUsuario() {
        if (this.usuario == null)
            this.usuario = new Usuario();
        
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public DataModel getListaUsuarios() {
        List<Usuario> lista = new UsuarioDao().list();
        listaUsuarios = new ListDataModel(lista);
        return listaUsuarios;
    }

    public void prepararAdicionarUsuario(ActionEvent actionEvent) {
        usuario = new Usuario();
    }
    public void prepararAlterarUsuario(ActionEvent actionEvent) {
        usuario = (Usuario)(listaUsuarios.getRowData());
    }
    
    public void adicionar(ActionEvent actionEvent)
    {
        InterfaceUsuario dao = new UsuarioDao();
        dao.salvar(usuario);
        usuario = new Usuario();
    }
    public void alterar(ActionEvent actionEvent)
    {
        InterfaceUsuario dao = new UsuarioDao();
        dao.atualizar(usuario);
        usuario = new Usuario();
    }
    
    public String excluir()
    {
        Usuario usu = (Usuario)(listaUsuarios.getRowData());
        InterfaceUsuario dao = new UsuarioDao();
        dao.remover(usu);
        return "index";
    }

    
}
