package def.angular_material.angular.material;

import def.angularjs.ng.IPromise;

@jsweet.lang.Interface
public abstract class IDialogService extends def.js.Object {
    native public IPromise<?> show(Object dialog);
    native public IConfirmDialog confirm();
    native public IAlertDialog alert();
    native public IPromptDialog prompt();
    native public IPromise<?> hide(Object response);
    native public void cancel(Object response);
    native public IPromise<?> hide();
    native public void cancel();
}

