// Adicionar formatos Utils, é uma biblioteca para mexer com números

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {

    //Formatar os números e a data

    static NumberFormat formatandoNumeros = new DecimalFormat("R$ #,##0.00");
    static SimpleDateFormat formatandoData = new SimpleDateFormat("dd/MM/yyyy");

    public static String dateToString(Date data) {
        return Utils.formatandoData.format(data);
    }

    public static String floatToString(float valor) {
        return Utils.formatandoNumeros.format(valor);
    }

}
