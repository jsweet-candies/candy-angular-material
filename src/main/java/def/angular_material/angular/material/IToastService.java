package def.angular_material.angular.material;

import def.angularjs.ng.IPromise;

@jsweet.lang.Interface
public abstract class IToastService extends def.js.Object {
    native public IPromise<?> show(IToastOptions optionsOrPreset);
    native public IPromise<?> showSimple(String content);
    native public ISimpleToastPreset simple();
    native public IToastPreset<?> build();
    native public void updateContent(String newContent);
    native public void updateTextContent(String newContent);
    native public void hide(Object response);
    native public void cancel(Object response);
    native public void hide();
    native public void cancel();
    native public IPromise<?> show(IToastPreset<?> optionsOrPreset);
}

