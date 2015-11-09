package br.com.agenda.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Elisiandro
 */

@Table(name="t_auto")
@Entity
public class Automovel implements Serializable {
    
    ///
    /// Atributos
    ///
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
    private Long id;
    
    @Column(length = 10)
    private String placa;
    
    private Enum.COR_AUTOMOVEL cor;
    
    ///
    /// Construtor
    ///
    public Automovel()
    {
    }
    
    ///
    /// get e set
    ///
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Enum.COR_AUTOMOVEL getCor() {
        return cor;
    }

    public void setCor(Enum.COR_AUTOMOVEL cor) {
        this.cor = cor;
    }

            
}
