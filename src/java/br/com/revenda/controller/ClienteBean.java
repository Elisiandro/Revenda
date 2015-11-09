package br.com.revenda.controller;

import br.com.agenda.model.Cliente;
import br.com.revenda.dao.InterfaceCrud;
import br.com.revenda.dao.ClienteDao;
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
@RequestScoped
public class ClienteBean {
    private Cliente cliente;
    private DataModel listaClientes;

    public Cliente getCliente() {
        if (this.cliente == null)
            this.cliente = new Cliente();
        
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public DataModel getListaClientes() {
        List<Cliente> lista = new ClienteDao().list();
        listaClientes = new ListDataModel(lista);
        return listaClientes;
    }

    public void prepararAdicionarCliente(ActionEvent actionEvent) {
        cliente = new Cliente();
    }
    public void prepararAlterarCliente(ActionEvent actionEvent) {
        cliente = (Cliente)(listaClientes.getRowData());
    }
    
    public void adicionar(ActionEvent actionEvent)
    {
        InterfaceCrud dao = new ClienteDao();
        dao.salvar(cliente);
        cliente = new Cliente();
    }
    public void alterar(ActionEvent actionEvent)
    {
        InterfaceCrud dao = new ClienteDao();
        dao.atualizar(cliente);
        cliente = new Cliente();
    }
    
    public String excluir()
    {
        Cliente cliente = (Cliente)(listaClientes.getRowData());
        InterfaceCrud dao = new ClienteDao();
        dao.remover(cliente);
        return "cliente";
    }

    
}
