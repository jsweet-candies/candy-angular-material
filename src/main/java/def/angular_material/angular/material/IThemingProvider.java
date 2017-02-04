package def.angular_material.angular.material;
import def.js.Function;
@jsweet.lang.Interface
public abstract class IThemingProvider extends def.js.Object {
    native public void alwaysWatchTheme(Boolean alwaysWatch);
    native public IThemingProvider definePalette(String name, IPalette palette);
    native public Function enableBrowserColor(IBrowserColors browserColors);
    native public IPalette extendPalette(String name, IPalette palette);
    native public void registerStyles(String styles);
    native public void setDefaultTheme(String theme);
    native public void setNonce(String nonce);
    native public ITheme theme(String name, String inheritFrom);
    native public void generateThemesOnDemand(Boolean onDemand);
    native public void disableTheming(Boolean isDisabled);
    native public IThemeConfig configuration();
    native public ITheme theme(String name);
    native public void disableTheming();
}

