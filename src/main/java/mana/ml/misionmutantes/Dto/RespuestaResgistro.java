package mana.ml.misionmutantes.Dto;

public class RespuestaResgistro {

    int totalResgistro;
    String descripcion;

    public RespuestaResgistro() {
    }

    public RespuestaResgistro(int totalResgistro, String descripcion) {
        this.totalResgistro = totalResgistro;
        this.descripcion = descripcion;
    }

    public int getTotalResgistro() {
        return totalResgistro;
    }

    public void setTotalResgistro(int totalResgistro) {
        this.totalResgistro = totalResgistro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
