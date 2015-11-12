package br.com.agenda.App;

import br.com.agenda.model.Enum.PERFIL_GRUPO;
import br.com.agenda.model.TipoPagamento;
import br.com.agenda.model.Usuario;
//import br.com.agenda.model.Vei;
//import br.com.agenda.model.Usu;
//import br.com.agenda.model.Venda;
//import br.com.agenda.model.VendaItem;
import br.com.revenda.dao.InterfaceCrud;
import br.com.revenda.dao.UsuarioDao;
import br.com.revenda.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
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
   
        TipoPagamento tp = new TipoPagamento();
        tp.setDescricao("teste");
        
        Session ss = HibernateUtil.getSessionFactory().openSession();  
        Transaction t = ss.beginTransaction();  
        ss.save(tp);  
        t.commit();  
        ss.close();
        
        Usuario usu = new Usuario();
        usu.setNome("admin");
        usu.setSenha("admin");
        usu.setUsuario("admin");
        usu.setPerfil(PERFIL_GRUPO.ADMIN);
        
        ss = HibernateUtil.getSessionFactory().openSession();  
        t = ss.beginTransaction();  
        ss.save(usu);  
        t.commit();  
        ss.close();
        
        
   
        
        
        //insert2();        
        //lista();
//        insert3();        
        //lista2();
        
        //insertVenda();
        /*
        Vei veiculo = new Vei("Fusca");
        Usu usuario = new Usu();        
        usuario.setNome("Elisiandro");
        usuario.setVeiculo(veiculo);
        
        Session ss = HibernateUtil.getSessionFactory().openSession();  
        Transaction t = ss.beginTransaction();  
        ss.save(usuario);  
        t.commit();  
        ss.close();
        */
        
    }
    
    public static void insertVenda()
    {        
  
//        VendaItem itensVenda = new VendaItem();        
//        itensVenda.setProduto("PEDRA");                
//        List<VendaItem> listaItens = new ArrayList<>();
//        listaItens.add(itensVenda);
//        itensVenda = new VendaItem();        
//        itensVenda.setProduto("PAPEL");
//        listaItens.add(itensVenda);
//        itensVenda = new VendaItem();        
//        itensVenda.setProduto("TESOURA");
//        listaItens.add(itensVenda);
//        
//        Venda venda = new Venda();
//        venda.setDescricao("AUGUSTO");
//        //venda.getVendaItem().add(itensVenda);
//        
//        venda.setVendaItem(listaItens);
//        
//        
//        
//        Session ss = HibernateUtil.getSessionFactory().openSession();  
//        Transaction t = ss.beginTransaction();  
//        ss.save(venda);  
//        t.commit();  
//        ss.close();
        
    }
    
    public static void lista2()
    {
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Transaction t = session.beginTransaction();
//        
//        List<Usuario> lista = new UsuarioDao().list();
//        String rec = "";
//        for(Usuario user: lista) {
//            rec = rec + "\n Nome: " + user.getNome() + "Sobrenome: " + user.getSobrenome();
//        }
//        
//        JOptionPane.showMessageDialog(null, rec);
    }
    
    public static void insert3()
    {
//        Usuario user = new Usuario();
//        user.setNome("e");
//        user.setSobrenome("e");
//        user.setEmail("e");
//        user.setUsuario("e");
//        user.setSenha("e");
//        
//        InterfaceUsuario dao = new UsuarioDao();
//        dao.salvar(user);
        
    }
    public static void insert2()
    {
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Transaction t = session.beginTransaction();
//        
//        Usuario usu = new Usuario();
//        usu.setNome(JOptionPane.showInputDialog("Digite seu Nome: "));
//        usu.setSobrenome(JOptionPane.showInputDialog("Digite seu Sobrenome: "));
//        usu.setEmail(JOptionPane.showInputDialog("Digite seu E-mail: "));
//        usu.setUsuario(JOptionPane.showInputDialog("Digite seu Usuário: "));
//        usu.setSenha(JOptionPane.showInputDialog("Digite sua Senha: "));
//        session.save(usu);
//        t.commit();
//        session.close();
        
    }
    public static void lista()
    {
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Transaction t = session.beginTransaction();
//        
//        List<Usuario> lista =(List<Usuario>)session.createQuery("From Usuario").list();
//        for(Usuario user: lista) {
//            JOptionPane.showMessageDialog(null, user.getNome());
//        }
//        
//        t.commit();
//        session.close();
    
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
