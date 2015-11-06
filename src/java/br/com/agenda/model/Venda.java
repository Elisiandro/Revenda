
package br.com.agenda.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
    private String sobrenome;
    private String usuario;
    private String senha;
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    
    
}
