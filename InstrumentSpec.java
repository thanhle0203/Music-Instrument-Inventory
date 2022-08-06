import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public abstract class InstrumentSpec {
    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;

    private Map properties;

   public InstrumentSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) 
   {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
   }
   /* 
   public boolean matches(InstrumentSpec otherSpec)
   {
        if (builder != otherSpec.builder)
            return false;
        if((model != null) && (!model.equals("")) && (!model.equals(otherSpec.model)))
            return false;
        if (type != otherSpec.type)
            return false;
        if (backWood != otherSpec.backWood)
            return false;
        if (topWood != otherSpec.topWood)
            return false;
        
        return true;
   }
   */

   public InstrumentSpec(Map properties) 
   {
        if (properties == null) {
            this.properties = new HashMap();
        }
        else {
            this.properties = new HashMap(properties);
        }
   }

   /*
    * A generic matching algorithm that works 
    * with any instrument type's properties
    */
   public boolean matches(InstrumentSpec otherSpec)
   {
        // Loop over the proverty keys in the hashmap.
        for (Iterator i = otherSpec.getProperties().keySet().iterator(); i.hasNext();) {
            // Do all the properties match?
            String propertyName = (String) i.next();
            if (!properties.get(propertyName).equals(otherSpec.getProperty(propertyName))) {
                return false;
            }
        }

        return true;
   }
}
