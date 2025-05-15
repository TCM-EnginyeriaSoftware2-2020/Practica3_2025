package capaPersistencia;

import java.util.ArrayList;
import java.util.List;

public final class FontDadesExternes {
    /*
        No es pot modificar aquesta classe,
        cal aplicar el patró adaptador on l'objectiu és la interfície IFontDades
     */

    private static  FontDadesExternes instanciaUnica = new FontDadesExternes();
    private FontDadesExternes(){}
    public static FontDadesExternes getInstanciaUnica() {
        return instanciaUnica;
    }

    public List<String[]> obtenirProductes() {
        List<String[]> dades = new ArrayList<>();
        dades.add(new String[]{"901", "Teclat Bluetooth", "39.99"});
        dades.add(new String[]{"902", "Connector HDMI a USB", "19.99"});
        return dades;
    }

}
