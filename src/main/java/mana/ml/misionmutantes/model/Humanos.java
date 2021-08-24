package mana.ml.misionmutantes.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mm_humanos")
public class Humanos {
    @Id
    int id;
    String estado;
    boolean isMutante;

    public Humanos(){

    }

    public Humanos(int id, String estado, boolean isMutante) {
        this.id = id;
        this.estado = estado;
        this.isMutante = isMutante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isMutante() {
        return isMutante;
    }

    public void setMutante(boolean mutante) {
        isMutante = mutante;
    }
}
