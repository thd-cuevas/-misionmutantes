package mana.ml.misionmutantes.model;

import javax.persistence.*;

@Entity
@Table(name = "mm_humanos_adn")
public class HumanosADN {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @ManyToOne
    @JoinColumn(name = "id_humano")
    Humanos humano;

    String adn;
    String estado;

    public HumanosADN() {
    }

    public HumanosADN(int id, Humanos humano, String adn, String estado) {
        this.id = id;
        this.humano = humano;
        this.adn = adn;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Humanos getHumano() {
        return humano;
    }

    public void setHumano(Humanos humano) {
        this.humano = humano;
    }

    public String getAdn() {
        return adn;
    }

    public void setAdn(String adn) {
        this.adn = adn;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
