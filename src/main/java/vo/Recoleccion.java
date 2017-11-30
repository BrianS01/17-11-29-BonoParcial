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

public class Recoleccion
{
    private int idRecoleccion;
    private int idRecolector;
    private int idCol;
    private String fecha;

    public int getIdRecoleccion() {
        return idRecoleccion;
    }

    public void setIdRecoleccion(int idRecoleccion) {
        this.idRecoleccion = idRecoleccion;
    }

    public int getIdRecolector() {
        return idRecolector;
    }

    public void setIdRecolector(int idRecolector) {
        this.idRecolector = idRecolector;
    }

    public int getIdCol() {
        return idCol;
    }

    public void setIdCol(int idCol) {
        this.idCol = idCol;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString()
    {
        return "Recoleccion{" + "idRecoleccion=" + idRecoleccion + ", idRecolector=" + idRecolector + ", idCol=" + idCol + ", fecha=" + fecha + '}';
    } 
}