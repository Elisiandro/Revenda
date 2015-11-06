
package br.com.agenda.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Elisiandro
 */

@Entity(name="Venda")
public class Venda implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
    private Long id;
    private String descricao;
    
    @OneToMany(cascade = CascadeType.ALL)
    private List<VendaItem> vendaItem;
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<VendaItem> getVendaItem() {
        return vendaItem;
    }

    public void setVendaItem(List<VendaItem> vendaItem) {
        this.vendaItem = vendaItem;
    }
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    
    
}
