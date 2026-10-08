package com.google.inputmethod;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class r6 {
    private final AccessibilityNodeInfo a;
    public int b = -1;
    private int c = -1;

    public static class a {
        public static final a G;
        public static final a H;
        public static final a I;
        public static final a J;
        public static final a K;
        public static final a L;
        public static final a M;
        public static final a N;
        public static final a O;
        public static final a P;
        public static final a Q;
        public static final a R;
        public static final a S;
        public static final a T;
        public static final a U;
        public static final a V;
        public static final a W;
        final Object a;
        private final int b;
        private final Class<? extends j7.a> c;
        protected final j7 d;
        public static final a e = new a(1, null);
        public static final a f = new a(2, null);
        public static final a g = new a(4, null);
        public static final a h = new a(8, null);
        public static final a i = new a(16, null);
        public static final a j = new a(32, null);
        public static final a k = new a(64, null);
        public static final a l = new a(128, null);
        public static final a m = new a(256, (CharSequence) null, (Class<? extends j7.a>) j7.b.class);
        public static final a n = new a(512, (CharSequence) null, (Class<? extends j7.a>) j7.b.class);
        public static final a o = new a(1024, (CharSequence) null, (Class<? extends j7.a>) j7.c.class);
        public static final a p = new a(2048, (CharSequence) null, (Class<? extends j7.a>) j7.c.class);
        public static final a q = new a(4096, null);
        public static final a r = new a(8192, null);
        public static final a s = new a(16384, null);
        public static final a t = new a(32768, null);
        public static final a u = new a(65536, null);
        public static final a v = new a(131072, (CharSequence) null, (Class<? extends j7.a>) j7.g.class);
        public static final a w = new a(262144, null);
        public static final a x = new a(524288, null);
        public static final a y = new a(1048576, null);
        public static final a z = new a(2097152, (CharSequence) null, (Class<? extends j7.a>) j7.h.class);
        public static final a A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        public static final a B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, j7.e.class);
        public static final a C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        public static final a D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        public static final a E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        public static final a F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);

        static {
            int i2 = Build.VERSION.SDK_INT;
            G = new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            H = new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            I = new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            J = new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            K = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            L = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, j7.f.class);
            M = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, j7.d.class);
            N = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, R.id.accessibilityActionShowTooltip, null, null, null);
            O = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, R.id.accessibilityActionHideTooltip, null, null, null);
            P = new a(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            Q = new a(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            R = new a(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            S = new a(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            T = new a(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            U = new a(i2 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            V = new a(i2 >= 34 ? d.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
            W = new a(gw0.a() ? f.a() : null, R.id.ALT, null, null, null);
        }

        public a(int i2, CharSequence charSequence) {
            this(null, i2, charSequence, null, null);
        }

        public a a(CharSequence charSequence, j7 j7Var) {
            return new a(null, this.b, charSequence, j7Var, this.c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.a).getLabel();
        }

        public boolean d(View view, Bundle bundle) {
            if (this.d == null) {
                return false;
            }
            Class<? extends j7.a> cls = this.c;
            j7.a aVar = null;
            if (cls != null) {
                try {
                    j7.a aVarNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                    try {
                        aVarNewInstance.a(bundle);
                        aVar = aVarNewInstance;
                    } catch (Exception unused) {
                        aVar = aVarNewInstance;
                        Class<? extends j7.a> cls2 = this.c;
                        if (cls2 != null) {
                            cls2.getName();
                        }
                    }
                } catch (Exception unused2) {
                }
            }
            return this.d.a(view, aVar);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.a;
            if (obj2 == null) {
                return aVar.a == null;
            }
            return obj2.equals(aVar.a);
        }

        public int hashCode() {
            Object obj = this.a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AccessibilityActionCompat: ");
            String strH = r6.h(this.b);
            if (strH.equals("ACTION_UNKNOWN") && c() != null) {
                strH = c().toString();
            }
            sb.append(strH);
            return sb.toString();
        }

        public a(int i2, CharSequence charSequence, j7 j7Var) {
            this(null, i2, charSequence, j7Var, null);
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        private a(int i2, CharSequence charSequence, Class<? extends j7.a> cls) {
            this(null, i2, charSequence, null, cls);
        }

        a(Object obj, int i2, CharSequence charSequence, j7 j7Var, Class<? extends j7.a> cls) {
            this.b = i2;
            this.d = j7Var;
            if (obj == null) {
                this.a = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
            } else {
                this.a = obj;
            }
            this.c = cls;
        }
    }

    private static class b {
        public static CharSequence a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    private static class c {
        public static String a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }
    }

    private static class d {
        public static AccessibilityNodeInfo.AccessibilityAction a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static boolean d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }

        public static void e(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setAccessibilityDataSensitive(z);
        }
    }

    private static class e {
        /* JADX INFO: Access modifiers changed from: private */
        public static int b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getChecked();
        }

        public static int c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExpandedState();
        }

        public static CharSequence d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getSupplementalDescription();
        }

        public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isFieldRequired();
        }
    }

    private static class f {
        public static AccessibilityNodeInfo.AccessibilityAction a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_EXTENDED_SELECTION;
        }
    }

    public static class g {
        final Object a;

        g(Object obj) {
            this.a = obj;
        }

        public static g a(int i, int i2, boolean z) {
            return new g(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z));
        }

        public static g b(int i, int i2, boolean z, int i3) {
            return new g(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
        }
    }

    public static class h {
        final Object a;

        h(Object obj) {
            this.a = obj;
        }

        public static h a(int i, int i2, int i3, int i4, boolean z) {
            return new h(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z));
        }

        public static h b(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return new h(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
        }
    }

    public static class i {
        final Object a;

        i(Object obj) {
            this.a = obj;
        }

        public static i d(int i, float f, float f2, float f3) {
            return new i(AccessibilityNodeInfo.RangeInfo.obtain(i, f, f2, f3));
        }

        public float a() {
            return ((AccessibilityNodeInfo.RangeInfo) this.a).getCurrent();
        }

        public float b() {
            return ((AccessibilityNodeInfo.RangeInfo) this.a).getMax();
        }

        public float c() {
            return ((AccessibilityNodeInfo.RangeInfo) this.a).getMin();
        }
    }

    private r6(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.a = accessibilityNodeInfo;
    }

    private boolean K() {
        return !f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private List<Integer> f(String str) {
        ArrayList<Integer> integerArrayList = this.a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public static r6 f0() {
        return o1(AccessibilityNodeInfo.obtain());
    }

    public static r6 g0(View view) {
        return o1(AccessibilityNodeInfo.obtain(view));
    }

    static String h(int i2) {
        if (i2 == 1) {
            return "ACTION_FOCUS";
        }
        if (i2 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i2) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i2) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i2) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i2) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        switch (i2) {
                                            case R.id.accessibilityActionScrollInDirection:
                                                return "ACTION_SCROLL_IN_DIRECTION";
                                            case R.id.ALT:
                                                return "ACTION_SET_EXTENDED_SELECTION";
                                            default:
                                                return "ACTION_UNKNOWN";
                                        }
                                }
                        }
                }
        }
    }

    public static r6 h0(r6 r6Var) {
        return o1(AccessibilityNodeInfo.obtain(r6Var.a));
    }

    private boolean j(int i2) {
        Bundle bundleY = y();
        return bundleY != null && (bundleY.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i2) == i2;
    }

    private String o() {
        int iN = n();
        if (iN == 1) {
            return "TRUE";
        }
        return iN == 2 ? "PARTIAL" : "FALSE";
    }

    private void o0(int i2, boolean z) {
        Bundle bundleY = y();
        if (bundleY != null) {
            int i3 = bundleY.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i2);
            if (!z) {
                i2 = 0;
            }
            bundleY.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i2 | i3);
        }
    }

    public static r6 o1(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new r6(accessibilityNodeInfo);
    }

    public static ClickableSpan[] r(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    static String x(int i2) {
        if (i2 == 0) {
            return "UNDEFINED";
        }
        if (i2 == 1) {
            return "COLLAPSED";
        }
        if (i2 != 2) {
            return i2 != 3 ? "UNKNOWN" : "FULL";
        }
        return "PARTIAL";
    }

    public int A() {
        return this.a.getMaxTextLength();
    }

    public void A0(int i2) {
        this.a.setDrawingOrder(i2);
    }

    public int B() {
        return this.a.getMovementGranularities();
    }

    public void B0(boolean z) {
        this.a.setEditable(z);
    }

    public CharSequence C() {
        return this.a.getPackageName();
    }

    public void C0(boolean z) {
        this.a.setEnabled(z);
    }

    public i D() {
        AccessibilityNodeInfo.RangeInfo rangeInfo = this.a.getRangeInfo();
        if (rangeInfo != null) {
            return new i(rangeInfo);
        }
        return null;
    }

    public void D0(CharSequence charSequence) {
        this.a.setError(charSequence);
    }

    public CharSequence E() {
        return Build.VERSION.SDK_INT >= 30 ? b.a(this.a) : this.a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public void E0(boolean z) {
        this.a.setFocusable(z);
    }

    public CharSequence F() {
        return Build.VERSION.SDK_INT >= 36 ? e.d(this.a) : this.a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY");
    }

    public void F0(boolean z) {
        this.a.setFocused(z);
    }

    public CharSequence G() {
        if (!K()) {
            return this.a.getText();
        }
        List<Integer> listF = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> listF2 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> listF3 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> listF4 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.a.getText(), 0, this.a.getText().length()));
        for (int i2 = 0; i2 < listF.size(); i2++) {
            spannableString.setSpan(new z5(listF4.get(i2).intValue(), this, y().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), listF.get(i2).intValue(), listF2.get(i2).intValue(), listF3.get(i2).intValue());
        }
        return spannableString;
    }

    public void G0(boolean z) {
        this.a.setHeading(z);
    }

    public CharSequence H() {
        return this.a.getTooltipText();
    }

    public void H0(CharSequence charSequence) {
        this.a.setHintText(charSequence);
    }

    public String I() {
        return Build.VERSION.SDK_INT >= 33 ? c.a(this.a) : this.a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public void I0(boolean z) {
        this.a.setImportantForAccessibility(z);
    }

    public String J() {
        return this.a.getViewIdResourceName();
    }

    public void J0(View view) {
        this.a.setLabelFor(view);
    }

    @Deprecated
    public void K0(View view) {
        this.a.setLabeledBy(view);
    }

    public boolean L() {
        return Build.VERSION.SDK_INT >= 34 ? d.d(this.a) : j(64);
    }

    public void L0(int i2) {
        this.a.setLiveRegion(i2);
    }

    public boolean M() {
        return this.a.isAccessibilityFocused();
    }

    public void M0(boolean z) {
        this.a.setLongClickable(z);
    }

    public boolean N() {
        return this.a.isCheckable();
    }

    public void N0(int i2) {
        this.a.setMaxTextLength(i2);
    }

    @Deprecated
    public boolean O() {
        return this.a.isChecked();
    }

    public void O0(int i2) {
        this.a.setMovementGranularities(i2);
    }

    public boolean P() {
        return this.a.isClickable();
    }

    public void P0(CharSequence charSequence) {
        this.a.setPackageName(charSequence);
    }

    public boolean Q() {
        return this.a.isContextClickable();
    }

    public void Q0(CharSequence charSequence) {
        this.a.setPaneTitle(charSequence);
    }

    public boolean R() {
        return this.a.isEnabled();
    }

    public void R0(View view) {
        this.b = -1;
        this.a.setParent(view);
    }

    public boolean S() {
        return Build.VERSION.SDK_INT >= 36 ? e.e(this.a) : this.a.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY");
    }

    public void S0(View view, int i2) {
        this.b = i2;
        this.a.setParent(view, i2);
    }

    public boolean T() {
        return this.a.isFocusable();
    }

    public void T0(boolean z) {
        this.a.setPassword(z);
    }

    public boolean U() {
        return this.a.isFocused();
    }

    public void U0(i iVar) {
        this.a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) iVar.a);
    }

    public boolean V() {
        return j(67108864);
    }

    public void V0(CharSequence charSequence) {
        this.a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public boolean W() {
        return this.a.isImportantForAccessibility();
    }

    public void W0(boolean z) {
        this.a.setScreenReaderFocusable(z);
    }

    public boolean X() {
        return this.a.isLongClickable();
    }

    public void X0(boolean z) {
        this.a.setScrollable(z);
    }

    public boolean Y() {
        return this.a.isPassword();
    }

    public void Y0(boolean z) {
        this.a.setSelected(z);
    }

    public boolean Z() {
        return this.a.isScreenReaderFocusable();
    }

    public void Z0(boolean z) {
        this.a.setShowingHintText(z);
    }

    public void a(int i2) {
        this.a.addAction(i2);
    }

    public boolean a0() {
        return this.a.isScrollable();
    }

    public void a1(View view) {
        this.c = -1;
        this.a.setSource(view);
    }

    public void b(a aVar) {
        this.a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.a);
    }

    public boolean b0() {
        return this.a.isSelected();
    }

    public void b1(View view, int i2) {
        this.c = i2;
        this.a.setSource(view, i2);
    }

    public void c(View view) {
        this.a.addChild(view);
    }

    public boolean c0() {
        return this.a.isShowingHintText();
    }

    public void c1(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.b(this.a, charSequence);
        } else {
            this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public void d(View view, int i2) {
        this.a.addChild(view, i2);
    }

    public boolean d0() {
        return Build.VERSION.SDK_INT >= 33 ? c.b(this.a) : j(8388608);
    }

    public void d1(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public void e(CharSequence charSequence, View view) {
    }

    public boolean e0() {
        return this.a.isVisibleToUser();
    }

    public void e1(boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.a.setTextEntryKey(z);
        } else {
            o0(8, z);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof r6)) {
            return false;
        }
        r6 r6Var = (r6) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            if (r6Var.a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(r6Var.a)) {
            return false;
        }
        return this.c == r6Var.c && this.b == r6Var.b;
    }

    public void f1(int i2, int i3) {
        this.a.setTextSelection(i2, i3);
    }

    public List<a> g() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.a.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new a(actionList.get(i2)));
        }
        return arrayList;
    }

    public void g1(CharSequence charSequence) {
        this.a.setTooltipText(charSequence);
    }

    public void h1(View view) {
        this.a.setTraversalAfter(view);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    @Deprecated
    public int i() {
        return this.a.getActions();
    }

    public boolean i0(int i2, Bundle bundle) {
        return this.a.performAction(i2, bundle);
    }

    public void i1(View view, int i2) {
        this.a.setTraversalAfter(view, i2);
    }

    @Deprecated
    public void j0() {
    }

    public void j1(View view) {
        this.a.setTraversalBefore(view);
    }

    @Deprecated
    public void k(Rect rect) {
        this.a.getBoundsInParent(rect);
    }

    public boolean k0(a aVar) {
        return this.a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.a);
    }

    public void k1(View view, int i2) {
        this.a.setTraversalBefore(view, i2);
    }

    public void l(Rect rect) {
        this.a.getBoundsInScreen(rect);
    }

    public void l0(boolean z) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.e(this.a, z);
        } else {
            o0(64, z);
        }
    }

    public void l1(String str) {
        this.a.setViewIdResourceName(str);
    }

    public void m(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.b(this.a, rect);
            return;
        }
        Rect rect2 = (Rect) this.a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public void m0(boolean z) {
        this.a.setAccessibilityFocused(z);
    }

    public void m1(boolean z) {
        this.a.setVisibleToUser(z);
    }

    public int n() {
        return Build.VERSION.SDK_INT >= 36 ? e.b(this.a) : this.a.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY", this.a.isChecked() ? 1 : 0);
    }

    public void n0(List<String> list) {
        this.a.setAvailableExtraData(list);
    }

    public AccessibilityNodeInfo n1() {
        return this.a;
    }

    public int p() {
        return this.a.getChildCount();
    }

    @Deprecated
    public void p0(Rect rect) {
        this.a.setBoundsInParent(rect);
    }

    public CharSequence q() {
        return this.a.getClassName();
    }

    public void q0(Rect rect) {
        this.a.setBoundsInScreen(rect);
    }

    public void r0(boolean z) {
        this.a.setCheckable(z);
    }

    public g s() {
        AccessibilityNodeInfo.CollectionInfo collectionInfo = this.a.getCollectionInfo();
        if (collectionInfo != null) {
            return new g(collectionInfo);
        }
        return null;
    }

    @Deprecated
    public void s0(boolean z) {
        this.a.setChecked(z);
    }

    public CharSequence t() {
        return Build.VERSION.SDK_INT >= 34 ? d.c(this.a) : this.a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public void t0(CharSequence charSequence) {
        this.a.setClassName(charSequence);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        k(rect);
        sb.append("; boundsInParent: " + rect);
        l(rect);
        sb.append("; boundsInScreen: " + rect);
        m(rect);
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(C());
        sb.append("; className: ");
        sb.append(q());
        sb.append("; text: ");
        sb.append(G());
        sb.append("; error: ");
        sb.append(v());
        sb.append("; maxTextLength: ");
        sb.append(A());
        sb.append("; stateDescription: ");
        sb.append(E());
        sb.append("; contentDescription: ");
        sb.append(u());
        sb.append("; supplementalDescription: ");
        sb.append(F());
        sb.append("; tooltipText: ");
        sb.append(H());
        sb.append("; viewIdResName: ");
        sb.append(J());
        sb.append("; uniqueId: ");
        sb.append(I());
        sb.append("; checkable: ");
        sb.append(N());
        sb.append("; checked: ");
        sb.append(o());
        sb.append("; fieldRequired: ");
        sb.append(S());
        sb.append("; focusable: ");
        sb.append(T());
        sb.append("; focused: ");
        sb.append(U());
        sb.append("; selected: ");
        sb.append(b0());
        sb.append("; clickable: ");
        sb.append(P());
        sb.append("; longClickable: ");
        sb.append(X());
        sb.append("; contextClickable: ");
        sb.append(Q());
        sb.append("; expandedState: ");
        sb.append(x(w()));
        sb.append("; enabled: ");
        sb.append(R());
        sb.append("; password: ");
        sb.append(Y());
        sb.append("; scrollable: " + a0());
        sb.append("; containerTitle: ");
        sb.append(t());
        sb.append("; granularScrollingSupported: ");
        sb.append(V());
        sb.append("; importantForAccessibility: ");
        sb.append(W());
        sb.append("; visible: ");
        sb.append(e0());
        sb.append("; isTextSelectable: ");
        sb.append(d0());
        sb.append("; accessibilityDataSensitive: ");
        sb.append(L());
        sb.append("; [");
        List<a> listG = g();
        for (int i2 = 0; i2 < listG.size(); i2++) {
            a aVar = listG.get(i2);
            String strH = h(aVar.b());
            if (strH.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                strH = aVar.c().toString();
            }
            sb.append(strH);
            if (i2 != listG.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public CharSequence u() {
        return this.a.getContentDescription();
    }

    public void u0(boolean z) {
        this.a.setClickable(z);
    }

    public CharSequence v() {
        return this.a.getError();
    }

    public void v0(Object obj) {
        this.a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((g) obj).a);
    }

    public int w() {
        return Build.VERSION.SDK_INT >= 36 ? e.c(this.a) : this.a.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY", 0);
    }

    public void w0(Object obj) {
        this.a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((h) obj).a);
    }

    public void x0(CharSequence charSequence) {
        this.a.setContentDescription(charSequence);
    }

    public Bundle y() {
        return this.a.getExtras();
    }

    public void y0(boolean z) {
        this.a.setContentInvalid(z);
    }

    public CharSequence z() {
        return this.a.getHintText();
    }

    public void z0(boolean z) {
        this.a.setDismissable(z);
    }
}
