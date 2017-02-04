package def.angular_material.angular.material;
import def.dom.Element;
@jsweet.lang.Interface
public abstract class IPanelAnimation extends def.js.Object {
    native public IPanelAnimation openFrom(Object from);
    native public IPanelAnimation closeTo(String to);
    native public IPanelAnimation withAnimation(String cssClass);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class From extends def.js.Object {
        public double top;
        public double left;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class To extends def.js.Object {
        public double top;
        public double left;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class CssClass extends def.js.Object {
        public String open;
        public String close;
    }
    native public IPanelAnimation closeTo(To to);
    native public IPanelAnimation closeTo(Element to);
    native public IPanelAnimation withAnimation(CssClass cssClass);
}

