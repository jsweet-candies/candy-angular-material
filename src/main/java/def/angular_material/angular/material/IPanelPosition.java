package def.angular_material.angular.material;
import def.dom.Element;
import def.jquery.JQuery;
@jsweet.lang.Interface
public abstract class IPanelPosition extends def.js.Object {
    native public IPanelPosition absolute();
    native public IPanelPosition relativeTo(String someElement);
    native public IPanelPosition top(String top);
    native public IPanelPosition bottom(String bottom);
    native public IPanelPosition start(String start);
    native public IPanelPosition end(String end);
    native public IPanelPosition left(String left);
    native public IPanelPosition right(String right);
    native public IPanelPosition centerHorizontally();
    native public IPanelPosition centerVertically();
    native public IPanelPosition center();
    native public IPanelPosition addPanelPosition(String xPosition, String yPosition);
    native public IPanelPosition withOffsetX(String offsetX);
    native public IPanelPosition withOffsetY(String offsetY);
    native public IPanelPosition top();
    native public IPanelPosition bottom();
    native public IPanelPosition start();
    native public IPanelPosition end();
    native public IPanelPosition left();
    native public IPanelPosition right();
    native public IPanelPosition relativeTo(JQuery someElement);
    native public IPanelPosition relativeTo(Element someElement);
    native public IPanelPosition withOffsetX(java.util.function.Function<IPanelPosition,String> offsetX);
    native public IPanelPosition withOffsetY(java.util.function.Function<IPanelPosition,String> offsetY);
}

