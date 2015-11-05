package br.com.agenda.App;

import br.com.agenda.model.Usuario;
import br.com.revenda.dao.InterfaceUsuario;
import br.com.revenda.dao.UsuarioDao;
import br.com.revenda.util.HibernateUtil;
import java.util.List;
//import br.com.revenda.util.JpaUtil;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Elisiandro
 */
public class Teste {
    public static void main(String[] args) {
        
        
        //insert2();        
        //lista();
        //insert3();        
        lista2();
        
        
        
    }
    
    public static void lista2()
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        
        List<Usuario> lista = new UsuarioDao().list();
        String rec = "";
        for(Usuario user: lista) {
            rec = rec + "\n Nome: " + user.getNome() + "Sobrenome: " + user.getSobrenome();
        }
        
        JOptionPane.showMessageDialog(null, rec);
    }
    
    public static void insert3()
    {
        Usuario user = new Usuario();
        user.setNome("e");
        user.setSobrenome("e");
        user.setEmail("e");
        user.setUsuario("e");
        user.setSenha("e");
        
        InterfaceUsuario dao = new UsuarioDao();
        dao.salvar(user);
        
    }
    public static void insert2()
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        
        Usuario usu = new Usuario();
        usu.setNome(JOptionPane.showInputDialog("Digite seu Nome: "));
        usu.setSobrenome(JOptionPane.showInputDialog("Digite seu Sobrenome: "));
        usu.setEmail(JOptionPane.showInputDialog("Digite seu E-mail: "));
        usu.setUsuario(JOptionPane.showInputDialog("Digite seu Usuário: "));
        usu.setSenha(JOptionPane.showInputDialog("Digite sua Senha: "));
        session.save(usu);
        t.commit();
        session.close();
        
    }
    public static void lista()
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        
        List<Usuario> lista =(List<Usuario>)session.createQuery("From Usuario").list();
        for(Usuario user: lista) {
            JOptionPane.showMessageDialog(null, user.getNome());
        }
        
        t.commit();
        session.close();
    
    }
    public static void insert()
    {
        /*
        Usuario usu = new Usuario();
        usu.setNome("Elisiandro");
        usu.setSobrenome("Duarte Rodrigues");
        usu.setEmail("elisiandro@gmail.com");
        usu.setUsuario("elisiandro");
        
        EntityManager em = JpaUtil.getEntityManager();
        em.getTransaction().begin();        
        em.persist(usu);        
        em.getTransaction().commit();
        em.close();
                */
        
    }
}
