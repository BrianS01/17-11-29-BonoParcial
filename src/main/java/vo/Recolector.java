/*
 *  PARCIAL TERCER CORTE
 *      Author ::: Brian Sterling
 *     Program ::: Bases de Datos
 *  Credential ::: SIST0008-G01:SIV
 */

package vo;

/**
 *
 * @author BRIAN
 */

public class Recolector
{
    private int idRecolector;
    private String nombre;
    private String fabrica;

    public int getIdRecolector() {
        return idRecolector;
    }

    public void setIdRecolector(int idRecolector) {
        this.idRecolector = idRecolector;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFabrica() {
        return fabrica;
    }

    public void setFabrica(String fabrica) {
        this.fabrica = fabrica;
    }

    @Override
    public String toString()
    {
        return "Recolector{" + "idRecolector=" + idRecolector + ", nombre=" + nombre + ", fabrica=" + fabrica + '}';
    }
}