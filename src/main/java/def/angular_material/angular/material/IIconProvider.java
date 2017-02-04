package def.angular_material.angular.material;
@jsweet.lang.Interface
public abstract class IIconProvider extends def.js.Object {
    native public IIconProvider icon(String id, String url, double viewBoxSize);
    native public IIconProvider iconSet(String id, String url, double viewBoxSize);
    native public IIconProvider defaultIconSet(String url, double viewBoxSize);
    native public IIconProvider defaultViewBoxSize(double viewBoxSize);
    native public IIconProvider defaultFontSet(String name);
    native public IIconProvider icon(String id, String url);
    native public IIconProvider iconSet(String id, String url);
    native public IIconProvider defaultIconSet(String url);
}

