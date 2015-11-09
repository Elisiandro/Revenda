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

@Table(name="t_emp")
@Entity
public class Empresa implements Serializable {
    
    ///
    /// Atributos
    ///
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
    private Long id;
    
    @Column(length = 100)
    private String nome;
    @Column(length = 100)
    private String razaoSocial;
    
    @Column(length = 1, name = "t_cnpj_cpf")
    private int tipoCnpjCpf;
    
    @Column(length = 14, name = "cnpj_cpf")
    private String cnpjCpf;
    
    ///
    /// Construtor
    ///
    public Empresa()
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public int getTipoCnpjCpf() {
        return tipoCnpjCpf;
    }

    public void setTipoCnpjCpf(int tipoCnpjCpf) {
        this.tipoCnpjCpf = tipoCnpjCpf;
    }

    public String getCnpjCpf() {
        return cnpjCpf;
    }

    public void setCnpjCpf(String cnpjCpf) {
        this.cnpjCpf = cnpjCpf;
    }

   
        
}
