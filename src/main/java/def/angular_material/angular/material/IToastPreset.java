package def.angular_material.angular.material;
import def.dom.Element;
import def.jquery.JQuery;
import jsweet.util.union.Union;
@jsweet.lang.Interface
public abstract class IToastPreset<T> extends def.js.Object {
    native public T textContent(String content);
    native public T action(String action);
    native public T highlightAction(Boolean highlightAction);
    native public T highlightClass(String highlightClass);
    native public T capsule(Boolean capsule);
    native public T theme(String theme);
    native public T hideDelay(double delay);
    native public T position(String position);
    native public T parent(String parent);
    native public T toastClass(String toastClass);
    native public T parent();
    native public T hideDelay(Union<Boolean, Double> delay);
    native public T parent(Element parent);
    native public T parent(JQuery parent);
}

