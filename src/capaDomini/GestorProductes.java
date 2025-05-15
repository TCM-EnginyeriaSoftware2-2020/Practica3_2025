package capaDomini;

import java.util.List;

public class GestorProductes {
    // TODO cal aplicar el patró singleton
    private final List<AbstractProduct> abstractProducts;

    public GestorProductes() {
        // TODO utilitza el patró factoria per carregar les dades de FontDadesVenudes
        abstractProducts = null;
    }

    public void importarProductesExterns(){
        // TODO utilitza el patró factoria per AFEGIR les dades de FontDadesExternes
    }

    public List<AbstractProduct> getProductes() {
        return abstractProducts;
    }

    public void afegirProducte(AbstractProduct p) {
        abstractProducts.add(p);
    }

    public void eliminarTots() {
        abstractProducts.clear();
    }
}
