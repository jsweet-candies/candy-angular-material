package def.angular_material.angular.material;

import def.angularjs.ng.IPromise;
import def.jquery.JQuery;

@jsweet.lang.Interface
public abstract class IPanelRef extends def.js.Object {
    public String id;
    public IPanelConfig config;
    public Boolean isAttached;
    public JQuery panelContainer;
    public JQuery panelEl;
    native public IPromise<?> open();
    native public IPromise<?> close();
    native public IPromise<?> attach();
    native public IPromise<?> detach();
    native public IPromise<?> show();
    native public IPromise<?> hide();
    native public void destroy();
    native public void addClass(String newClass);
    native public void removeClass(String oldClass);
    native public void toggleClass(String toggleClass);
    native public void updatePosition(IPanelPosition position);
    native public IPanelRef registerInterceptor(String type, java.util.function.Supplier<IPromise<?>> callback);
    native public IPanelRef removeInterceptor(String type, java.util.function.Supplier<IPromise<?>> callback);
    native public IPanelRef removeAllInterceptors(String type);
    native public IPanelRef removeAllInterceptors();
}

