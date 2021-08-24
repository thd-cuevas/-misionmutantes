package mana.ml.misionmutantes.Dto;

import mana.ml.misionmutantes.model.Humanos;
import mana.ml.misionmutantes.utilities.Matriz;

import java.util.List;


public class DtoADN {

    int id;
    Humanos humano;
    List<Matriz> adn;
    String estado;

    public DtoADN() {
    }

    public DtoADN(int id, Humanos humano, List<Matriz> adn, String estado) {
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

    public List<Matriz> getAdn() {
        return adn;
    }

    public void setAdn(List<Matriz> adn) {
        this.adn = adn;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
