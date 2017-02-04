package def.angular_material.angular.material;

import def.angularjs.ng.IPromise;

@jsweet.lang.Interface
public abstract class IBottomSheetService extends def.js.Object {
    native public IPromise<?> show(IBottomSheetOptions options);
    native public void hide(Object response);
    native public void cancel(Object response);
    native public void hide();
    native public void cancel();
}

