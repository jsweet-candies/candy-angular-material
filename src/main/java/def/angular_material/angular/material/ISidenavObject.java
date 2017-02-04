package def.angular_material.angular.material;
import def.angularjs.ng.IPromise;
import def.js.Function;
@jsweet.lang.Interface
public abstract class ISidenavObject extends def.js.Object {
    native public IPromise<Void> toggle();
    native public IPromise<Void> open();
    native public IPromise<Void> close();
    native public Boolean isOpen();
    native public Boolean isLockedOpen();
    native public void onClose(Function onClose);
}

