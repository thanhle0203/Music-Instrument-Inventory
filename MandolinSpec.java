
public class MandolinSpec extends InstrumentSpec {
    private Style style;

    // Overide the superclass matches()
    public boolean matches(InstrumentSpec otherSpec)
    {
        if (!super.matches(otherSpec))
            return false;
            
        if (!(otherSpec instanceof MandolinSpec))
            return false;
        
        MandolinSpec spec = (MandolinSpec) otherSpec;
        if (!style.equals(spec.style)) 
            return false;

        return true;
    }
}
