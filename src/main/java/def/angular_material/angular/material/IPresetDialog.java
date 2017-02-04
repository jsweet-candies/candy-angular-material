package def.angular_material.angular.material;
import def.angularjs.ng.IPromise;
import def.angularjs.ng.IScope;
import def.dom.Element;
import def.dom.MouseEvent;
import def.jquery.JQuery;
import def.js.Function;
@jsweet.lang.Interface
public abstract class IPresetDialog<T> extends def.js.Object {
    native public T title(String title);
    native public T textContent(String textContent);
    native public T htmlContent(String htmlContent);
    native public T ok(String ok);
    native public T theme(String theme);
    native public T templateUrl(String templateUrl);
    native public T template(String template);
    native public T targetEvent(MouseEvent targetEvent);
    native public T scope(IScope scope);
    native public T preserveScope(Boolean preserveScope);
    native public T disableParentScroll(Boolean disableParentScroll);
    native public T hasBackdrop(Boolean hasBackdrop);
    native public T clickOutsideToClose(Boolean clickOutsideToClose);
    native public T escapeToClose(Boolean escapeToClose);
    native public T focusOnOpen(Boolean focusOnOpen);
    native public T controller(String controller);
    native public T locals(Locals locals);
    native public T bindToController(Boolean bindToController);
    native public T resolve(Resolve resolve);
    native public T controllerAs(String controllerAs);
    native public T parent(String parent);
    native public T onComplete(Function onComplete);
    native public T ariaLabel(String ariaLabel);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Locals extends def.js.Object {
        native public java.lang.Object $get(String index);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Resolve extends def.js.Object {
        native public java.util.function.Supplier<IPromise<?>> $get(String index);
    }
    native public T templateUrl();
    native public T template();
    native public T targetEvent();
    native public T scope();
    native public T preserveScope();
    native public T disableParentScroll();
    native public T hasBackdrop();
    native public T clickOutsideToClose();
    native public T escapeToClose();
    native public T focusOnOpen();
    native public T controller();
    native public T locals();
    native public T bindToController();
    native public T resolve();
    native public T controllerAs();
    native public T parent();
    native public T onComplete();
    native public T controller(Function controller);
    native public T parent(JQuery parent);
    native public T parent(Element parent);
}

