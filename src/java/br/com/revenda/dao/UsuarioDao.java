package br.com.revenda.dao;

import br.com.agenda.model.Usuario;
import br.com.revenda.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Elisiandro
 */
public class UsuarioDao implements InterfaceUsuario{

    @Override
    public Usuario getUsuarios(Long id) {
        
        Session ss = HibernateUtil.getSessionFactory().openSession();
        return (Usuario) ss.load(Usuario.class, id);        
    }

    @Override
    public void salvar(Usuario usuario) {        
        Session ss = HibernateUtil.getSessionFactory().openSession();  
        Transaction t = ss.beginTransaction();  
        ss.save(usuario);  
        t.commit();  
        ss.close();
    }

    @Override
    public void remover(Usuario usuario) {
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Transaction t = ss.beginTransaction();  
        ss.delete(usuario);
        t.commit();
        ss.close();

    }

    @Override
    public void atualizar(Usuario usuario) {
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Transaction t = ss.beginTransaction();  
        ss.update(usuario);
        t.commit();
        ss.close();

    }

    @Override
    public List<Usuario> list() {
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Transaction t = ss.beginTransaction();  
        List lista;
        lista = ss.createQuery("from Usuario").list();
        t.commit();
        
        return lista;
    }
    
}
