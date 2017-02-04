package def.angular_material.angular.material;
@jsweet.lang.Interface
public abstract class ITheme extends def.js.Object {
    public String name;
    public Boolean isDark;
    public IThemeColors colors;
    public IThemeGrayScalePalette foregroundPalette;
    public String foregroundShadow;
    native public ITheme accentPalette(String name, IThemeHues hues);
    native public ITheme primaryPalette(String name, IThemeHues hues);
    native public ITheme warnPalette(String name, IThemeHues hues);
    native public ITheme backgroundPalette(String name, IThemeHues hues);
    native public ITheme dark(Boolean isDark);
    native public ITheme accentPalette(String name);
    native public ITheme primaryPalette(String name);
    native public ITheme warnPalette(String name);
    native public ITheme backgroundPalette(String name);
    native public ITheme dark();
}

