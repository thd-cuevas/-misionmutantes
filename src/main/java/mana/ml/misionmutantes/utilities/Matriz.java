package mana.ml.misionmutantes.utilities;

public class Matriz {

    int pos;
    String valor;
    String posStr;

    public Matriz(int pos, String valor){
        this.pos = pos;
        this.valor = valor;
    }

    public String getPosStr() {
        return posStr;
    }

    public void setPosStr(String posStr) {
        this.posStr = posStr;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString(){
        return "Matriz {"+"valor="+valor+", pos="+posStr+"}";
    }
}
