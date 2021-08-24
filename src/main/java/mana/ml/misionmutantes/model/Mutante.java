package mana.ml.misionmutantes.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "mm_mutante")
public class Mutante {

    @Id
    String adnStr;
    boolean isMutante;

    public String getAdnStr() {
        return adnStr;
    }

    public void setAdnStr(String adnStr) {
        this.adnStr = adnStr;
    }

    public boolean isMutante() {
        return isMutante;
    }

    public void setMutante(boolean mutante) {
        isMutante = mutante;
    }

}
