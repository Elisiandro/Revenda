/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.revenda.dao;

import br.com.agenda.model.Cliente;
import br.com.revenda.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Elisiandro
 */
public class ClienteDao implements InterfaceCrud<Cliente>{

    
    @Override
    public Cliente getItem(Long id) {
        
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Cliente cliente = (Cliente) ss.load(Cliente.class, id);        
        ss.close();
        return cliente;
    }

    @Override
    public void salvar(Cliente cliente) {        
        Session ss = HibernateUtil.getSessionFactory().openSession();  
        Transaction t = ss.beginTransaction();  
        ss.save(cliente);  
        t.commit();  
        ss.close();
    }

    @Override
    public void remover(Cliente cliente) {
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Transaction t = ss.beginTransaction();  
        ss.delete(cliente);
        t.commit();
        ss.close();

    }

    @Override
    public void atualizar(Cliente cliente) {
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Transaction t = ss.beginTransaction();  
        ss.update(cliente);
        t.commit();
        ss.close();

    }

    @Override
    public List<Cliente> list() {
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Transaction t = ss.beginTransaction();  
        List lista;
        lista = ss.createQuery("from Cliente").list();
        t.commit();
        ss.close();
        
        return lista;
    }
}
