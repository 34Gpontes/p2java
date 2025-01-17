package application.model;


import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "questao")
public class Questao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String enunciado;

    // private Quiz quiz;

    // @OneToMany(mappedBy = "questao")
    // private Set<Alternativa> alternativas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    // public Set<Alternativa> getAlternativas() {
    //     return alternativas;
    // }

    // public void setAlternativas(Set<Alternativa> alternativas) {
    //     this.alternativas = alternativas;
    // }
    
}
