package mana.ml.misionmutantes.Dto;

public class DtoMutante {

    String[] adnArray;

    public String[] getAdnArray() {
        return adnArray;
    }

    public void setAdnArray(String[] adnArray) {
        this.adnArray = adnArray;
    }

    public String getArrayStr(){
        String res = "";
        StringBuffer cadena = new StringBuffer();
        for (int x=0;x<adnArray.length;x++){
            cadena =cadena.append(adnArray[x]);
        }

        for (int i = 0; i < cadena.toString().length(); i++){
            char letra = cadena.charAt(i);
            res += letra+",";
        }
        return res;
    }

    public String getArray(){
        StringBuffer cadena = new StringBuffer();
        for (int x=0;x<adnArray.length;x++){
            cadena =cadena.append(adnArray[x]+",");
        }
        return cadena.toString();
    }

    public String strTotal(){
        StringBuffer cadena = new StringBuffer();
        for (int x=0;x<adnArray.length;x++){
            cadena =cadena.append(adnArray[x]);
        }
        return cadena.toString();

    }
}
