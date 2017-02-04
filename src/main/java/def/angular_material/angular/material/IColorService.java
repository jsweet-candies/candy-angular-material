package def.angular_material.angular.material;
import def.dom.Element;
import def.jquery.JQuery;

@jsweet.lang.Interface
public abstract class IColorService extends def.js.Object {
    native public void applyThemeColors(Element element, IColorExpression colorExpression);
    native public String getThemeColor(String expression);
    native public Boolean hasTheme();
    native public void applyThemeColors(JQuery element, IColorExpression colorExpression);
}

