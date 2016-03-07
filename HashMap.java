
/**
 * Write a description of class HashMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HashMap
{
    private String[] clave;
    private int[] valor;

    /**
     * Constructor for objects of class HashMap
     */
    public HashMap()
    {
        clave = new String[0];
        valor = new int[0];
    }

    public void put(String clave, int valor)
    {
        int index = 0;
        boolean found = false;
        while (index < this.clave.length && !found )
        {
            if (clave.equals(this.clave[index]))
            {
                found = true;
                this.valor[index] = valor;
            }
            index++;
        }
        if (!found)
        {
            index = -1;
            int cont = 0;
            String[] claveLocal = new String[this.clave.length + 1];
            int[] valorLocal = new int[this.valor.length + 1];
            for (cont = 0; cont < this.clave.length; cont++)
            {
                claveLocal[cont] = this.clave[cont];
                valorLocal[cont] = this.valor[cont];
            }
            claveLocal[claveLocal.length - 1] = clave;
            valorLocal[valorLocal.length - 1] = valor;
            this.clave = claveLocal;
            this.valor = valorLocal;
        }
        return index;
    }

    public int get(String clave)
    {
        int ret = -1;
        int index = 0;
        boolean found = false;
        while (indice < this.clave.length && !encontrado ) {
            if (this.clave.equals(claves[indice])) {
                found = true;
                ret = valores[indice];
            }
            index++;
        }
        return ret;
    }

    public void isEmpty()
    {

    }

    public int size()
    {
        return clave.length;
    }

    public void remove(String clave)
    {

    }

    public void clear()
    {
        clave = new String[0];
        valor = new int[0];
    }

    public void containsKey(String clave)
    {

    }

    public void containsValue(int valor)
    {

    }
}
