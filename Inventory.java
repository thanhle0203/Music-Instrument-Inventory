import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List inventory;

    /* 
    public void addInstrument(String serialNumber, double price, InstrumentSpec spec)
    {
        Instrument instrument = null;
        if (spec instanceof GuitarSpec) {
            instrument = new Guitar(serialNumber, price, (GuitarSpec) spec);
        }
        else if (spec instanceof MandolinSpec) {
            instrument = new Mandolin(serialNumber, price, (MandolinSpec) spec);
        }
        inventory.add(instrument);
    }
    */

    public void addInstrument(String serialNumber, double price, InstrumentSpec spec)
    {
        Instrument instrument = new Instrument(serialNumber, price, spec); 
        inventory.add(instrument);
    }

    /* 
    public List search(GuitarSpec searchSpec)
    {
        List matchingGuitars = new LinkedList();
        for (Iterator i = inventory.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar) i.next();
            if (guitar.getSpec().matches(searchSpec)) {
                matchingGuitars.add(guitar);
            }
        }
        return matchingGuitars;
    }

    public List search(MandolinSpec searchSpec)
    {
        List matchingMandolins = new LinkedList();
        for (Iterator i = inventory.iterator(); i.hasNext(); ) {
            Mandolin mandolin = (Mandolin) i.next();
            if (mandolin.getSpec().matches(searchSpec)) {
                matchingMandolins.add(searchSpec);
            }
        }
        return matchingMandolins;
    }
    */

    public List search(InstrumentSpec searchSpec)
    {
        List matchingInstruments = new LinkedList<>();

        for (Iterator i = inventory.iterator(); i.hasNext(); ) {
            Instrument instrument = (Instrument) i.next();

            if (instrument.getSpec().matches(searchSpec)) {
                matchingInstruments.add(instrument);
            }
        }

        return matchingInstruments;
    }

}
