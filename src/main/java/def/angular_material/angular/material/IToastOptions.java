package def.angular_material.angular.material;
import def.angularjs.ng.IPromise;
import def.angularjs.ng.IScope;
import def.dom.Element;
import def.jquery.JQuery;
import def.js.Function;
import jsweet.util.union.Union3;
@jsweet.lang.Interface
public abstract class IToastOptions extends def.js.Object {
    @jsweet.lang.Optional
    public String templateUrl;
    @jsweet.lang.Optional
    public String template;
    @jsweet.lang.Optional
    public Boolean autoWrap;
    @jsweet.lang.Optional
    public IScope scope;
    @jsweet.lang.Optional
    public Boolean preserveScope;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double, Boolean> hideDelay;
    @jsweet.lang.Optional
    public String position;
    @jsweet.lang.Optional
    public String toastClass;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,Function> controller;
    @jsweet.lang.Optional
    public Locals locals;
    @jsweet.lang.Optional
    public Boolean bindToController;
    @jsweet.lang.Optional
    public Resolve resolve;
    @jsweet.lang.Optional
    public String controllerAs;
    @jsweet.lang.Optional
    public Union3<String,Element,JQuery> parent;
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
}

