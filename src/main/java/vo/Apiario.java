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

public class Apiario
{
    private int idApiario;
    private int idSede;

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

    @Override
    public String toString() {
        return "Apiario{" + "idApiario=" + idApiario + ", idSede=" + idSede + '}';
    }
}