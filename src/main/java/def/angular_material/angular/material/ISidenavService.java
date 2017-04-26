package def.angular_material.angular.material;

import def.angularjs.ng.IPromise;

@jsweet.lang.Interface
public abstract class ISidenavService extends def.js.Object {
    native public IPromise<ISidenavObject> $apply(String component, Boolean enableWait);
    native public ISidenavObject $apply(String component);
}

