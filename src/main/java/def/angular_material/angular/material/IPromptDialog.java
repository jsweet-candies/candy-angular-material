package def.angular_material.angular.material;
@jsweet.lang.Interface
public abstract class IPromptDialog extends IPresetDialog<IPromptDialog> {
    native public IPromptDialog cancel(String cancel);
    native public IPromptDialog placeholder(String placeholder);
    native public IPromptDialog initialValue(String initialValue);
}

