package def.angular_material.angular.material;
import jsweet.util.union.Union3;
import def.angularjs.ng.IPromise;
import def.angularjs.ng.IScope;
import def.js.Function;
@jsweet.lang.Interface
public abstract class IBottomSheetOptions extends def.js.Object {
    @jsweet.lang.Optional
    public String templateUrl;
    @jsweet.lang.Optional
    public String template;
    @jsweet.lang.Optional
    public IScope scope;
    @jsweet.lang.Optional
    public Boolean preserveScope;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,Function> controller;
    @jsweet.lang.Optional
    public Locals locals;
    @jsweet.lang.Optional
    public Boolean clickOutsideToClose;
    @jsweet.lang.Optional
    public Boolean disableBackdrop;
    @jsweet.lang.Optional
    public Boolean escapeToClose;
    @jsweet.lang.Optional
    public Resolve resolve;
    @jsweet.lang.Optional
    public String controllerAs;
    @jsweet.lang.Optional
    public Union3<Function,String,Object> parent;
    @jsweet.lang.Optional
    public Boolean disableParentScroll;
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

