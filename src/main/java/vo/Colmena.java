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

public class Colmena
{
    private int idCol;
    private int idColMadre;
    private int idApiario;
    private int idSede;
    private int cantidad;
    private String calidad;
    private String reina;
    private int proMiel;
    private int panAlimento;
    private int panCera;
    private int panCria;
    private int panVacio;

    public int getIdCol() {
        return idCol;
    }

    public void setIdCol(int idCol) {
        this.idCol = idCol;
    }

    public int getIdColMadre() {
        return idColMadre;
    }

    public void setIdColMadre(int idColMadre) {
        this.idColMadre = idColMadre;
    }

    public int getIdApiario() {
        return idApiario;
    }

    public void setIdApiario(int idApiario) {
        this.idApiario = idApiario;
    }

    public int getIdSede() {
        return idSede;
    }

    public void setIdSede(int idSede) {
        this.idSede = idSede;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public String getReina() {
        return reina;
    }

    public void setReina(String reina) {
        this.reina = reina;
    }

    public int getProMiel() {
        return proMiel;
    }

    public void setProMiel(int proMiel) {
        this.proMiel = proMiel;
    }

    public int getPanAlimento() {
        return panAlimento;
    }

    public void setPanAlimento(int panAlimento) {
        this.panAlimento = panAlimento;
    }

    public int getPanCera() {
        return panCera;
    }

    public void setPanCera(int panCera) {
        this.panCera = panCera;
    }

    public int getPanCria() {
        return panCria;
    }

    public void setPanCria(int panCria) {
        this.panCria = panCria;
    }

    public int getPanVacio() {
        return panVacio;
    }

    public void setPanVacio(int panVacio) {
        this.panVacio = panVacio;
    }

    @Override
    public String toString() {
        return "Colmena{" + "idCol=" + idCol + ", idColMadre=" + idColMadre + ", idApiario=" + idApiario + ", idSede=" + idSede + ", cantidad=" + cantidad + ", calidad=" + calidad + ", reina=" + reina + ", proMiel=" + proMiel + ", panAlimento=" + panAlimento + ", panCera=" + panCera + ", panCria=" + panCria + ", panVacio=" + panVacio + '}';
    }
}