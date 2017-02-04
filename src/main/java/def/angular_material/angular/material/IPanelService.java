package def.angular_material.angular.material;

import def.angularjs.ng.IPromise;

@jsweet.lang.Interface
public abstract class IPanelService extends def.js.Object {
    native public IPanelRef create(IPanelConfig opt_config);
    native public IPromise<IPanelRef> open(IPanelConfig opt_config);
    native public IPanelPosition newPanelPosition();
    native public IPanelAnimation newPanelAnimation();
    public XPosition xPosition;
    public YPosition yPosition;
    public Animation animation;
    public InterceptorTypes interceptorTypes;
    public CloseReasons closeReasons;
    public AbsPosition absPosition;
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class XPosition extends def.js.Object {
        public String CENTER;
        public String ALIGN_START;
        public String ALIGN_END;
        public String OFFSET_START;
        public String OFFSET_END;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class YPosition extends def.js.Object {
        public String CENTER;
        public String ALIGN_TOPS;
        public String ALIGN_BOTTOMS;
        public String ABOVE;
        public String BELOW;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Animation extends def.js.Object {
        public String SLIDE;
        public String SCALE;
        public String FADE;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class InterceptorTypes extends def.js.Object {
        public String CLOSE;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class CloseReasons extends def.js.Object {
        public String CLICK_OUTSIDE;
        public String ESCAPE;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class AbsPosition extends def.js.Object {
        public String TOP;
        public String RIGHT;
        public String BOTTOM;
        public String LEFT;
    }
}

