package br.com.agenda.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Elisiandro
 */

@Entity(name="Usu")
public class Usu implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
    private Long id;
    private String nome;
    @OneToOne(cascade = CascadeType.ALL)
    private Vei veiculo;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Vei getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Vei veiculo) {
        this.veiculo = veiculo;
    }

   
    
    
}
