package capaPersistencia;

import java.util.ArrayList;
import java.util.List;

public class FontDadesVenudes implements IFontDades {
    // TODO cal aplicar el patró singleton
    // TODO implementa un constructor que es connecti amb un fitxer de la carpeta Files
    @Override
    public List<String[]> obtenirProductes() {
        // TODO carrega el mateix fitxer per obtenir les dades
        return null;
    }

    @Override
    public void actualitzarProductesVenuts(List<String[]> dadesModificades){
        // TODO connectat al mateix fitxer de la carpeta Files per modificar les dades
    }
}
