package def.angular_material.angular.material;
import def.angularjs.ng.IPromise;
import def.dom.Element;
import def.jquery.JQuery;
import def.js.Function;
import jsweet.util.union.Union3;
@jsweet.lang.Interface
public abstract class IPanelConfig extends def.js.Object {
    @jsweet.lang.Optional
    public String id;
    @jsweet.lang.Optional
    public String template;
    @jsweet.lang.Optional
    public String templateUrl;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,Function> controller;
    @jsweet.lang.Optional
    public String controllerAs;
    @jsweet.lang.Optional
    public Boolean bindToController;
    @jsweet.lang.Optional
    public Locals locals;
    @jsweet.lang.Optional
    public Resolve resolve;
    @jsweet.lang.Optional
    public Union3<String,JQuery,Element> attachTo;
    @jsweet.lang.Optional
    public Boolean propagateContainerEvents;
    @jsweet.lang.Optional
    public String panelClass;
    @jsweet.lang.Optional
    public double zIndex;
    @jsweet.lang.Optional
    public IPanelPosition position;
    @jsweet.lang.Optional
    public Boolean clickOutsideToClose;
    @jsweet.lang.Optional
    public Boolean escapeToClose;
    @jsweet.lang.Optional
    public Boolean trapFocus;
    @jsweet.lang.Optional
    public Boolean focusOnOpen;
    @jsweet.lang.Optional
    public Boolean fullscreen;
    @jsweet.lang.Optional
    public IPanelAnimation animation;
    @jsweet.lang.Optional
    public Boolean hasBackdrop;
    @jsweet.lang.Optional
    public Boolean disableParentScroll;
    @jsweet.lang.Optional
    public Function onDomAdded;
    @jsweet.lang.Optional
    public Function onOpenComplete;
    @jsweet.lang.Optional
    public Function onRemoving;
    @jsweet.lang.Optional
    public Function onDomRemoved;
    @jsweet.lang.Optional
    public Union3<String,JQuery,Element> origin;
    @jsweet.lang.Optional
    public java.util.function.BiFunction<IPanelRef,String,Object> onCloseSuccess;
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
    native public java.lang.Object onDomAdded(java.lang.Object... args);
    native public java.lang.Object onOpenComplete(java.lang.Object... args);
    native public java.lang.Object onRemoving(java.lang.Object... args);
    native public java.lang.Object onDomRemoved(java.lang.Object... args);
}

