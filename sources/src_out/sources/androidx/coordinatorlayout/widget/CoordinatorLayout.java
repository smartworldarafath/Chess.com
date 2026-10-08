package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.customview.view.AbsSavedState;
import com.google.inputmethod.af8;
import com.google.inputmethod.bf8;
import com.google.inputmethod.cf8;
import com.google.inputmethod.e8e;
import com.google.inputmethod.hh3;
import com.google.inputmethod.i0a;
import com.google.inputmethod.j15;
import com.google.inputmethod.jg9;
import com.google.inputmethod.k7e;
import com.google.inputmethod.kg9;
import com.google.inputmethod.kie;
import com.google.inputmethod.mm8;
import com.google.inputmethod.s02;
import com.google.inputmethod.sw9;
import com.google.inputmethod.vp8;
import com.google.inputmethod.w0a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class CoordinatorLayout extends ViewGroup implements af8, bf8 {
    static final String t;
    static final Class<?>[] u;
    static final ThreadLocal<Map<String, Constructor<c>>> v;
    static final Comparator<View> w;
    private static final jg9<Rect> x;
    private final List<View> a;
    private final androidx.coordinatorlayout.widget.a<View> b;
    private final List<View> c;
    private Paint d;
    private final int[] e;
    private final int[] f;
    private boolean g;
    private boolean h;
    private int[] i;
    private View j;
    private View k;
    private g l;
    private boolean m;
    private kie n;
    private boolean o;
    private Drawable p;
    ViewGroup.OnHierarchyChangeListener q;
    private vp8 r;
    private final cf8 s;

    class a implements vp8 {
        a() {
        }

        @Override // com.google.inputmethod.vp8
        public kie a(View view, kie kieVar) {
            return CoordinatorLayout.this.X(kieVar);
        }
    }

    public interface b {
        c getBehavior();
    }

    public static abstract class c<V extends View> {
        public c() {
        }

        public boolean A(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        public void B(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        public Parcelable C(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean D(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }

        public boolean E(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return D(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        @Deprecated
        public void F(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public void G(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                F(coordinatorLayout, v, view);
            }
        }

        public boolean H(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, V v) {
            return h(coordinatorLayout, v) > 0.0f;
        }

        public boolean f(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        public int g(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        public float h(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        public boolean i(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public kie j(CoordinatorLayout coordinatorLayout, V v, kie kieVar) {
            return kieVar;
        }

        public void k(f fVar) {
        }

        public boolean l(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public void m(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public void n() {
        }

        public boolean o(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean p(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        public boolean q(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean r(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
            return false;
        }

        public boolean s(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        @Deprecated
        public void t(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        public void u(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                t(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        @Deprecated
        public void v(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        @Deprecated
        public void w(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                v(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        public void x(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            w(coordinatorLayout, v, view, i, i2, i3, i4, i5);
        }

        @Deprecated
        public void y(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        public void z(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                y(coordinatorLayout, v, view, view2, i);
            }
        }

        public c(Context context, AttributeSet attributeSet) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface d {
        Class<? extends c> value();
    }

    private class e implements ViewGroup.OnHierarchyChangeListener {
        e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.q;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.H(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.q;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    class g implements ViewTreeObserver.OnPreDrawListener {
        g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.H(0);
            return true;
        }
    }

    static class h implements Comparator<View> {
        h() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float fL = k7e.L(view);
            float fL2 = k7e.L(view2);
            if (fL > fL2) {
                return -1;
            }
            return fL < fL2 ? 1 : 0;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        t = r0 != null ? r0.getName() : null;
        w = new h();
        u = new Class[]{Context.class, AttributeSet.class};
        v = new ThreadLocal<>();
        x = new kg9(12);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    private void B(View view, int i) {
        f fVar = (f) view.getLayoutParams();
        Rect rectE = e();
        rectE.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        if (this.n != null && k7e.v(this) && !k7e.v(view)) {
            rectE.left += this.n.l();
            rectE.top += this.n.n();
            rectE.right -= this.n.m();
            rectE.bottom -= this.n.k();
        }
        Rect rectE2 = e();
        j15.a(T(fVar.c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectE, rectE2, i);
        view.layout(rectE2.left, rectE2.top, rectE2.right, rectE2.bottom);
        P(rectE);
        P(rectE2);
    }

    private void C(View view, View view2, int i) {
        Rect rectE = e();
        Rect rectE2 = e();
        try {
            s(view2, rectE);
            t(view, i, rectE, rectE2);
            view.layout(rectE2.left, rectE2.top, rectE2.right, rectE2.bottom);
        } finally {
            P(rectE);
            P(rectE2);
        }
    }

    private void D(View view, int i, int i2) {
        int i3;
        f fVar = (f) view.getLayoutParams();
        int iB = j15.b(U(fVar.c), i2);
        int i4 = iB & 7;
        int i5 = iB & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int iV = v(i) - measuredWidth;
        if (i4 == 1) {
            iV += measuredWidth / 2;
        } else if (i4 == 5) {
            iV += measuredWidth;
        }
        if (i5 != 16) {
            i3 = i5 != 80 ? 0 : measuredHeight;
        } else {
            i3 = measuredHeight / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(iV, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(i3, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    private MotionEvent E(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        return motionEventObtain;
    }

    private void F(View view, Rect rect, int i) {
        boolean z;
        boolean z2;
        int width;
        int i2;
        int i3;
        int i4;
        int height;
        int i5;
        int i6;
        int i7;
        if (k7e.Q(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            f fVar = (f) view.getLayoutParams();
            c cVarF = fVar.f();
            Rect rectE = e();
            Rect rectE2 = e();
            rectE2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (cVarF == null || !cVarF.f(this, view, rectE)) {
                rectE.set(rectE2);
            } else if (!rectE2.contains(rectE)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectE.toShortString() + " | Bounds:" + rectE2.toShortString());
            }
            P(rectE2);
            if (rectE.isEmpty()) {
                P(rectE);
                return;
            }
            int iB = j15.b(fVar.h, i);
            boolean z3 = true;
            if ((iB & 48) != 48 || (i6 = (rectE.top - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - fVar.j) >= (i7 = rect.top)) {
                z = false;
            } else {
                W(view, i7 - i6);
                z = true;
            }
            if ((iB & 80) == 80 && (height = ((getHeight() - rectE.bottom) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) + fVar.j) < (i5 = rect.bottom)) {
                W(view, height - i5);
                z = true;
            }
            if (!z) {
                W(view, 0);
            }
            if ((iB & 3) != 3 || (i3 = (rectE.left - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - fVar.i) >= (i4 = rect.left)) {
                z2 = false;
            } else {
                V(view, i4 - i3);
                z2 = true;
            }
            if ((iB & 5) != 5 || (width = ((getWidth() - rectE.right) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) + fVar.i) >= (i2 = rect.right)) {
                z3 = z2;
            } else {
                V(view, width - i2);
            }
            if (!z3) {
                V(view, 0);
            }
            P(rectE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static c K(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = t;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<c>>> threadLocal = v;
            Map<String, Constructor<c>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<c> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(u);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e2) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e2);
        }
    }

    private boolean L(c cVar, View view, MotionEvent motionEvent, int i) {
        if (i == 0) {
            return cVar.o(this, view, motionEvent);
        }
        if (i == 1) {
            return cVar.H(this, view, motionEvent);
        }
        throw new IllegalArgumentException();
    }

    private boolean M(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.c;
        y(list);
        int size = list.size();
        MotionEvent motionEventE = null;
        boolean zL = false;
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            View view = list.get(i2);
            f fVar = (f) view.getLayoutParams();
            c cVarF = fVar.f();
            if (!(zL || z) || actionMasked == 0) {
                if (!z && !zL && cVarF != null && (zL = L(cVarF, view, motionEvent, i))) {
                    this.j = view;
                    if (actionMasked != 3 && actionMasked != 1) {
                        for (int i3 = 0; i3 < i2; i3++) {
                            View view2 = list.get(i3);
                            c cVarF2 = ((f) view2.getLayoutParams()).f();
                            if (cVarF2 != null) {
                                if (motionEventE == null) {
                                    motionEventE = E(motionEvent);
                                }
                                L(cVarF2, view2, motionEventE, i);
                            }
                        }
                    }
                }
                boolean zC = fVar.c();
                boolean zI = fVar.i(this, view);
                z = zI && !zC;
                if (zI && !z) {
                    break;
                }
            } else if (cVarF != null) {
                if (motionEventE == null) {
                    motionEventE = E(motionEvent);
                }
                L(cVarF, view, motionEventE, i);
            }
        }
        list.clear();
        if (motionEventE != null) {
            motionEventE.recycle();
        }
        return zL;
    }

    private void N() {
        this.a.clear();
        this.b.c();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            f fVarX = x(childAt);
            fVarX.d(this, childAt);
            this.b.b(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (fVarX.b(this, childAt, childAt2)) {
                        if (!this.b.d(childAt2)) {
                            this.b.b(childAt2);
                        }
                        this.b.a(childAt2, childAt);
                    }
                }
            }
        }
        this.a.addAll(this.b.j());
        Collections.reverse(this.a);
    }

    private static void P(Rect rect) {
        rect.setEmpty();
        x.release(rect);
    }

    private void R() {
        View view = this.j;
        if (view != null) {
            c cVarF = ((f) view.getLayoutParams()).f();
            if (cVarF != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                cVarF.H(this, this.j, motionEventObtain);
                motionEventObtain.recycle();
            }
            this.j = null;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((f) getChildAt(i).getLayoutParams()).m();
        }
        this.g = false;
    }

    private static int S(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    private static int T(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    private static int U(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    private void V(View view, int i) {
        f fVar = (f) view.getLayoutParams();
        int i2 = fVar.i;
        if (i2 != i) {
            k7e.U(view, i - i2);
            fVar.i = i;
        }
    }

    private void W(View view, int i) {
        f fVar = (f) view.getLayoutParams();
        int i2 = fVar.j;
        if (i2 != i) {
            k7e.V(view, i - i2);
            fVar.j = i;
        }
    }

    private void Y() {
        if (!k7e.v(this)) {
            k7e.z0(this, null);
            return;
        }
        if (this.r == null) {
            this.r = new a();
        }
        k7e.z0(this, this.r);
        setSystemUiVisibility(1280);
    }

    private static Rect e() {
        Rect rectAcquire = x.acquire();
        return rectAcquire == null ? new Rect() : rectAcquire;
    }

    private void g() {
        int childCount = getChildCount();
        MotionEvent motionEventObtain = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            c cVarF = ((f) childAt.getLayoutParams()).f();
            if (cVarF != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                cVarF.o(this, childAt, motionEventObtain);
            }
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
    }

    private static int h(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    private void i(f fVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    private kie j(kie kieVar) {
        c cVarF;
        if (kieVar.s()) {
            return kieVar;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (k7e.v(childAt) && (cVarF = ((f) childAt.getLayoutParams()).f()) != null) {
                kieVar = cVarF.j(this, childAt, kieVar);
                if (kieVar.s()) {
                    return kieVar;
                }
            }
        }
        return kieVar;
    }

    private void u(int i, Rect rect, Rect rect2, f fVar, int i2, int i3) {
        int iWidth;
        int iHeight;
        int iB = j15.b(S(fVar.c), i);
        int iB2 = j15.b(T(fVar.d), i);
        int i4 = iB & 7;
        int i5 = iB & 112;
        int i6 = iB2 & 7;
        int i7 = iB2 & 112;
        if (i6 != 1) {
            iWidth = i6 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i7 != 16) {
            iHeight = i7 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i4 == 1) {
            iWidth -= i2 / 2;
        } else if (i4 != 5) {
            iWidth -= i2;
        }
        if (i5 == 16) {
            iHeight -= i3 / 2;
        } else if (i5 != 80) {
            iHeight -= i3;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    private int v(int i) {
        int[] iArr = this.i;
        if (iArr == null) {
            toString();
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        toString();
        return 0;
    }

    private void y(List<View> list) {
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i = childCount - 1; i >= 0; i--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
        }
        Comparator<View> comparator = w;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private boolean z(View view) {
        return this.b.k(view);
    }

    public boolean A(View view, int i, int i2) {
        Rect rectE = e();
        s(view, rectE);
        try {
            return rectE.contains(i, i2);
        } finally {
            P(rectE);
        }
    }

    void G(View view, int i) {
        c cVarF;
        f fVar = (f) view.getLayoutParams();
        if (fVar.k != null) {
            Rect rectE = e();
            Rect rectE2 = e();
            Rect rectE3 = e();
            s(fVar.k, rectE);
            p(view, false, rectE2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            u(i, rectE, rectE3, fVar, measuredWidth, measuredHeight);
            boolean z = (rectE3.left == rectE2.left && rectE3.top == rectE2.top) ? false : true;
            i(fVar, rectE3, measuredWidth, measuredHeight);
            int i2 = rectE3.left - rectE2.left;
            int i3 = rectE3.top - rectE2.top;
            if (i2 != 0) {
                k7e.U(view, i2);
            }
            if (i3 != 0) {
                k7e.V(view, i3);
            }
            if (z && (cVarF = fVar.f()) != null) {
                cVarF.l(this, view, fVar.k);
            }
            P(rectE);
            P(rectE2);
            P(rectE3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    final void H(int i) {
        int i2;
        c cVarF;
        boolean zL;
        int iY = k7e.y(this);
        int size = this.a.size();
        Rect rectE = e();
        Rect rectE2 = e();
        Rect rectE3 = e();
        for (int i3 = 0; i3 < size; i3++) {
            View view = this.a.get(i3);
            f fVar = (f) view.getLayoutParams();
            if (i != 0 || view.getVisibility() != 8) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (fVar.l == this.a.get(i4)) {
                        G(view, iY);
                    }
                }
                p(view, true, rectE2);
                if (fVar.g != 0 && !rectE2.isEmpty()) {
                    int iB = j15.b(fVar.g, iY);
                    int i5 = iB & 112;
                    if (i5 == 48) {
                        rectE.top = Math.max(rectE.top, rectE2.bottom);
                    } else if (i5 == 80) {
                        rectE.bottom = Math.max(rectE.bottom, getHeight() - rectE2.top);
                    }
                    int i6 = iB & 7;
                    if (i6 == 3) {
                        rectE.left = Math.max(rectE.left, rectE2.right);
                    } else if (i6 == 5) {
                        rectE.right = Math.max(rectE.right, getWidth() - rectE2.left);
                    }
                }
                if (fVar.h != 0 && view.getVisibility() == 0) {
                    F(view, rectE, iY);
                }
                if (i != 2) {
                    w(view, rectE3);
                    if (!rectE3.equals(rectE2)) {
                        O(view, rectE2);
                        for (i2 = i3 + 1; i2 < size; i2++) {
                            View view2 = this.a.get(i2);
                            f fVar2 = (f) view2.getLayoutParams();
                            cVarF = fVar2.f();
                            if (cVarF == null && cVarF.i(this, view2, view)) {
                                if (i == 0 && fVar2.g()) {
                                    fVar2.k();
                                } else {
                                    if (i != 2) {
                                        zL = cVarF.l(this, view2, view);
                                    } else {
                                        cVarF.m(this, view2, view);
                                        zL = true;
                                    }
                                    if (i == 1) {
                                        fVar2.p(zL);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    while (i2 < size) {
                        View view3 = this.a.get(i2);
                        f fVar3 = (f) view3.getLayoutParams();
                        cVarF = fVar3.f();
                        if (cVarF == null) {
                        }
                    }
                }
            }
        }
        P(rectE);
        P(rectE2);
        P(rectE3);
    }

    public void I(View view, int i) {
        f fVar = (f) view.getLayoutParams();
        if (fVar.a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = fVar.k;
        if (view2 != null) {
            C(view, view2, i);
            return;
        }
        int i2 = fVar.e;
        if (i2 >= 0) {
            D(view, i2, i);
        } else {
            B(view, i);
        }
    }

    public void J(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    void O(View view, Rect rect) {
        ((f) view.getLayoutParams()).q(rect);
    }

    void Q() {
        if (this.h && this.l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.l);
        }
        this.m = false;
    }

    final kie X(kie kieVar) {
        if (mm8.a(this.n, kieVar)) {
            return kieVar;
        }
        this.n = kieVar;
        boolean z = false;
        boolean z2 = kieVar != null && kieVar.n() > 0;
        this.o = z2;
        if (!z2 && getBackground() == null) {
            z = true;
        }
        setWillNotDraw(z);
        kie kieVarJ = j(kieVar);
        requestLayout();
        return kieVarJ;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x008f  */
    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        f fVar = (f) view.getLayoutParams();
        c cVar = fVar.a;
        if (cVar != null) {
            float fH = cVar.h(this, view);
            if (fH > 0.0f) {
                if (this.d == null) {
                    this.d = new Paint();
                }
                this.d.setColor(fVar.a.g(this, view));
                this.d.setAlpha(h(Math.round(fH * 255.0f), 0, 255));
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.d);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.p;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    void f() {
        if (this.h) {
            if (this.l == null) {
                this.l = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.l);
        }
        this.m = true;
    }

    final List<View> getDependencySortedChildren() {
        N();
        return Collections.unmodifiableList(this.a);
    }

    public final kie getLastWindowInsets() {
        return this.n;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.s.a();
    }

    public Drawable getStatusBarBackground() {
        return this.p;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public void k(View view) {
        ArrayList<View> arrayListH = this.b.h(view);
        if (arrayListH == null || arrayListH.isEmpty()) {
            return;
        }
        for (int i = 0; i < arrayListH.size(); i++) {
            View view2 = arrayListH.get(i);
            c cVarF = ((f) view2.getLayoutParams()).f();
            if (cVarF != null) {
                cVarF.l(this, view2, view);
            }
        }
    }

    void l() {
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            if (z(getChildAt(i))) {
                z = true;
                break;
            }
        }
        if (z != this.m) {
            if (z) {
                f();
            } else {
                Q();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public f generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        R();
        if (this.m) {
            if (this.l == null) {
                this.l = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.l);
        }
        if (this.n == null && k7e.v(this)) {
            k7e.i0(this);
        }
        this.h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        R();
        if (this.m && this.l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.l);
        }
        View view = this.k;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.h = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.o || this.p == null) {
            return;
        }
        kie kieVar = this.n;
        int iN = kieVar != null ? kieVar.n() : 0;
        if (iN > 0) {
            this.p.setBounds(0, 0, getWidth(), iN);
            this.p.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            R();
        }
        boolean zM = M(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zM;
        }
        this.j = null;
        R();
        return zM;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        c cVarF;
        int iY = k7e.y(this);
        int size = this.a.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.a.get(i5);
            if (view.getVisibility() != 8 && ((cVarF = ((f) view.getLayoutParams()).f()) == null || !cVarF.p(this, view, iY))) {
                I(view, iY);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:44:0x010b  */
    /* JADX WARN: Code duplicated, block: B:47:0x012c  */
    /* JADX WARN: Code duplicated, block: B:48:0x012f  */
    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        c cVarF;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        View view;
        int i13;
        int i14;
        boolean zQ;
        int iMax;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.N();
        coordinatorLayout.l();
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        int iY = k7e.y(coordinatorLayout);
        boolean z = iY == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i15 = paddingLeft + paddingRight;
        int i16 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z2 = coordinatorLayout.n != null && k7e.v(coordinatorLayout);
        int size3 = coordinatorLayout.a.size();
        int i17 = 0;
        int iCombineMeasuredStates = 0;
        while (i17 < size3) {
            View view2 = coordinatorLayout.a.get(i17);
            int i18 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                i8 = size3;
                i4 = i17;
                i9 = paddingLeft;
                i6 = iY;
                suggestedMinimumWidth = i18;
                i13 = paddingRight;
            } else {
                f fVar = (f) view2.getLayoutParams();
                int i19 = fVar.e;
                if (i19 < 0 || mode == 0) {
                    i3 = suggestedMinimumHeight;
                } else {
                    int iV = coordinatorLayout.v(i19);
                    int iB = j15.b(U(fVar.c), iY) & 7;
                    i3 = suggestedMinimumHeight;
                    if ((iB != 3 || z) && !(iB == 5 && z)) {
                        if ((iB == 5 && !z) || (iB == 3 && z)) {
                            iMax = Math.max(0, iV - paddingLeft);
                        }
                        if (z2 || k7e.v(view2)) {
                            iMakeMeasureSpec = i;
                            iMakeMeasureSpec2 = i2;
                        } else {
                            int iL = coordinatorLayout.n.l() + coordinatorLayout.n.m();
                            int iN = coordinatorLayout.n.n() + coordinatorLayout.n.k();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iL, mode);
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iN, mode2);
                        }
                        cVarF = fVar.f();
                        if (cVarF != null) {
                            i8 = size3;
                            int i20 = iMakeMeasureSpec;
                            view = view2;
                            int i21 = i3;
                            i6 = iY;
                            i7 = i21;
                            i9 = paddingLeft;
                            i10 = i18;
                            i13 = paddingRight;
                            i14 = iCombineMeasuredStates;
                            int i22 = iMakeMeasureSpec2;
                            zQ = cVarF.q(this, view, i20, i5, i22, 0);
                            i12 = i20;
                            i11 = i22;
                            if (zQ) {
                                coordinatorLayout = this;
                            }
                            suggestedMinimumWidth = Math.max(i10, i15 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                            int iMax2 = Math.max(i7, i16 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                            iCombineMeasuredStates = View.combineMeasuredStates(i14, view.getMeasuredState());
                            suggestedMinimumHeight = iMax2;
                        } else {
                            int i23 = i3;
                            i6 = iY;
                            i7 = i23;
                            i8 = size3;
                            i9 = paddingLeft;
                            i10 = i18;
                            i11 = iMakeMeasureSpec2;
                            i12 = iMakeMeasureSpec;
                            view = view2;
                            i13 = paddingRight;
                            i14 = iCombineMeasuredStates;
                        }
                        View view3 = view;
                        coordinatorLayout = this;
                        coordinatorLayout.J(view3, i12, i5, i11, 0);
                        view = view3;
                        suggestedMinimumWidth = Math.max(i10, i15 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                        int iMax3 = Math.max(i7, i16 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i14, view.getMeasuredState());
                        suggestedMinimumHeight = iMax3;
                    } else {
                        iMax = Math.max(0, (size - paddingRight) - iV);
                    }
                    int i24 = i17;
                    i5 = iMax;
                    i4 = i24;
                    if (z2) {
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i2;
                    } else {
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i2;
                    }
                    cVarF = fVar.f();
                    if (cVarF != null) {
                        i8 = size3;
                        int i25 = iMakeMeasureSpec;
                        view = view2;
                        int i26 = i3;
                        i6 = iY;
                        i7 = i26;
                        i9 = paddingLeft;
                        i10 = i18;
                        i13 = paddingRight;
                        i14 = iCombineMeasuredStates;
                        int i27 = iMakeMeasureSpec2;
                        zQ = cVarF.q(this, view, i25, i5, i27, 0);
                        i12 = i25;
                        i11 = i27;
                        if (zQ) {
                            coordinatorLayout = this;
                        }
                        suggestedMinimumWidth = Math.max(i10, i15 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                        int iMax4 = Math.max(i7, i16 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i14, view.getMeasuredState());
                        suggestedMinimumHeight = iMax4;
                    } else {
                        int i28 = i3;
                        i6 = iY;
                        i7 = i28;
                        i8 = size3;
                        i9 = paddingLeft;
                        i10 = i18;
                        i11 = iMakeMeasureSpec2;
                        i12 = iMakeMeasureSpec;
                        view = view2;
                        i13 = paddingRight;
                        i14 = iCombineMeasuredStates;
                    }
                    View view4 = view;
                    coordinatorLayout = this;
                    coordinatorLayout.J(view4, i12, i5, i11, 0);
                    view = view4;
                    suggestedMinimumWidth = Math.max(i10, i15 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                    int iMax5 = Math.max(i7, i16 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i14, view.getMeasuredState());
                    suggestedMinimumHeight = iMax5;
                }
                i4 = i17;
                i5 = 0;
                if (z2) {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                } else {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                }
                cVarF = fVar.f();
                if (cVarF != null) {
                    i8 = size3;
                    int i29 = iMakeMeasureSpec;
                    view = view2;
                    int i210 = i3;
                    i6 = iY;
                    i7 = i210;
                    i9 = paddingLeft;
                    i10 = i18;
                    i13 = paddingRight;
                    i14 = iCombineMeasuredStates;
                    int i211 = iMakeMeasureSpec2;
                    zQ = cVarF.q(this, view, i29, i5, i211, 0);
                    i12 = i29;
                    i11 = i211;
                    if (zQ) {
                        coordinatorLayout = this;
                    }
                    suggestedMinimumWidth = Math.max(i10, i15 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                    int iMax6 = Math.max(i7, i16 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i14, view.getMeasuredState());
                    suggestedMinimumHeight = iMax6;
                } else {
                    int i212 = i3;
                    i6 = iY;
                    i7 = i212;
                    i8 = size3;
                    i9 = paddingLeft;
                    i10 = i18;
                    i11 = iMakeMeasureSpec2;
                    i12 = iMakeMeasureSpec;
                    view = view2;
                    i13 = paddingRight;
                    i14 = iCombineMeasuredStates;
                }
                View view5 = view;
                coordinatorLayout = this;
                coordinatorLayout.J(view5, i12, i5, i11, 0);
                view = view5;
                suggestedMinimumWidth = Math.max(i10, i15 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                int iMax7 = Math.max(i7, i16 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(i14, view.getMeasuredState());
                suggestedMinimumHeight = iMax7;
            }
            i17 = i4 + 1;
            paddingLeft = i9;
            paddingRight = i13;
            iY = i6;
            size3 = i8;
        }
        int i30 = iCombineMeasuredStates;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i, (-16777216) & i30), View.resolveSizeAndState(suggestedMinimumHeight, i2, i30 << 16));
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        c cVarF;
        View view2;
        float f4;
        float f5;
        boolean z2;
        int childCount = getChildCount();
        int i = 0;
        boolean zR = false;
        while (i < childCount) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 8) {
                view2 = view;
                f4 = f2;
                f5 = f3;
                z2 = z;
            } else {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (cVarF = fVar.f()) != null) {
                    view2 = view;
                    f4 = f2;
                    f5 = f3;
                    z2 = z;
                    zR |= cVarF.r(this, childAt, view2, f4, f5, z2);
                } else {
                    view2 = view;
                    f4 = f2;
                    f5 = f3;
                    z2 = z;
                }
            }
            i++;
            view = view2;
            f2 = f4;
            f3 = f5;
            z = z2;
        }
        if (zR) {
            H(1);
        }
        return zR;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f2, float f3) {
        c cVarF;
        View view2;
        float f4;
        float f5;
        int childCount = getChildCount();
        int i = 0;
        boolean zS = false;
        while (i < childCount) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 8) {
                view2 = view;
                f4 = f2;
                f5 = f3;
            } else {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (cVarF = fVar.f()) != null) {
                    view2 = view;
                    f4 = f2;
                    f5 = f3;
                    zS |= cVarF.s(this, childAt, view2, f4, f5);
                } else {
                    view2 = view;
                    f4 = f2;
                    f5 = f3;
                }
            }
            i++;
            view = view2;
            f2 = f4;
            f3 = f5;
        }
        return zS;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        SparseArray<Parcelable> sparseArray = savedState.c;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            c cVarF = x(childAt).f();
            if (id != -1 && cVarF != null && (parcelable2 = sparseArray.get(id)) != null) {
                cVarF.B(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableC;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            c cVarF = ((f) childAt.getLayoutParams()).f();
            if (id != -1 && cVarF != null && (parcelableC = cVarF.C(this, childAt)) != null) {
                sparseArray.append(id, parcelableC);
            }
        }
        savedState.c = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.j;
        boolean z = false;
        if (view != null) {
            c cVarF = ((f) view.getLayoutParams()).f();
            zM = cVarF != null ? cVarF.H(this, this.j, motionEvent) : false;
        } else {
            zM = M(motionEvent, 1);
            if (actionMasked != 0 && zM) {
                z = true;
            }
        }
        if (this.j == null || actionMasked == 3) {
            zM |= super.onTouchEvent(motionEvent);
        } else if (z) {
            MotionEvent motionEventE = E(motionEvent);
            super.onTouchEvent(motionEventE);
            motionEventE.recycle();
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return zM;
        }
        this.j = null;
        R();
        return zM;
    }

    void p(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            s(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public List<View> q(View view) {
        List<View> listI = this.b.i(view);
        return listI == null ? Collections.EMPTY_LIST : listI;
    }

    public List<View> r(View view) {
        List<View> listG = this.b.g(view);
        return listG == null ? Collections.EMPTY_LIST : listG;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        c cVarF = ((f) view.getLayoutParams()).f();
        if (cVarF == null || !cVarF.A(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.g) {
            return;
        }
        if (this.j == null) {
            g();
        }
        R();
        this.g = true;
    }

    void s(View view, Rect rect) {
        e8e.a(this, view, rect);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        Y();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.q = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.p = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.p.setState(getDrawableState());
                }
                hh3.m(this.p, k7e.y(this));
                this.p.setVisible(getVisibility() == 0, false);
                this.p.setCallback(this);
            }
            k7e.c0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? s02.f(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.p;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.p.setVisible(z, false);
    }

    void t(View view, int i, Rect rect, Rect rect2) {
        f fVar = (f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        u(i, rect, rect2, fVar, measuredWidth, measuredHeight);
        i(fVar, rect2, measuredWidth, measuredHeight);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.p;
    }

    void w(View view, Rect rect) {
        rect.set(((f) view.getLayoutParams()).h());
    }

    /* JADX WARN: Multi-variable type inference failed */
    f x(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.b) {
            if (view instanceof b) {
                fVar.o(((b) view).getBehavior());
                fVar.b = true;
                return fVar;
            }
            d dVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                dVar = (d) superclass.getAnnotation(d.class);
                if (dVar != null) {
                    break;
                }
            }
            if (dVar != null) {
                try {
                    fVar.o(dVar.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception unused) {
                    dVar.value().getName();
                }
            }
            fVar.b = true;
        }
        return fVar;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, sw9.a);
    }

    @Override // com.google.inputmethod.af8
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        c cVarF;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i3) && (cVarF = fVar.f()) != null) {
                    int[] iArr2 = this.e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVarF.u(this, childAt, view, i, i2, iArr2, i3);
                    iMax = i > 0 ? Math.max(iMax, this.e[0]) : Math.min(iMax, this.e[0]);
                    iMax2 = i2 > 0 ? Math.max(iMax2, this.e[1]) : Math.min(iMax2, this.e[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            H(1);
        }
    }

    @Override // com.google.inputmethod.af8
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i, i2, i3, i4, 0, this.f);
    }

    @Override // com.google.inputmethod.af8
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        c cVarF;
        View view3;
        View view4;
        int i3;
        int i4;
        this.s.c(view, view2, i, i2);
        this.k = view2;
        int childCount = getChildCount();
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i2) && (cVarF = fVar.f()) != null) {
                view3 = view;
                view4 = view2;
                i3 = i;
                i4 = i2;
                cVarF.z(this, childAt, view3, view4, i3, i4);
            } else {
                view3 = view;
                view4 = view2;
                i3 = i;
                i4 = i2;
            }
            i5++;
            view = view3;
            view2 = view4;
            i = i3;
            i2 = i4;
        }
    }

    @Override // com.google.inputmethod.af8
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVarF = fVar.f();
                if (cVarF != null) {
                    boolean zE = cVarF.E(this, childAt, view, view2, i, i2);
                    z |= zE;
                    fVar.r(i2, zE);
                } else {
                    fVar.r(i2, false);
                }
            }
        }
        return z;
    }

    @Override // com.google.inputmethod.af8
    public void onStopNestedScroll(View view, int i) {
        this.s.e(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i)) {
                c cVarF = fVar.f();
                if (cVarF != null) {
                    cVarF.G(this, childAt, view, i);
                }
                fVar.l(i);
                fVar.k();
            }
        }
        this.k = null;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes;
        Context context2;
        CoordinatorLayout coordinatorLayout;
        super(context, attributeSet, i);
        this.a = new ArrayList();
        this.b = new androidx.coordinatorlayout.widget.a<>();
        this.c = new ArrayList();
        this.e = new int[2];
        this.f = new int[2];
        this.s = new cf8(this);
        if (i == 0) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w0a.a, 0, i0a.a);
        } else {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w0a.a, i, 0);
        }
        TypedArray typedArray = typedArrayObtainStyledAttributes;
        if (i == 0) {
            coordinatorLayout = this;
            context2 = context;
            k7e.j0(coordinatorLayout, context2, w0a.a, attributeSet, typedArray, 0, i0a.a);
        } else {
            context2 = context;
            coordinatorLayout = this;
            k7e.j0(coordinatorLayout, context2, w0a.a, attributeSet, typedArray, i, 0);
        }
        int resourceId = typedArray.getResourceId(w0a.b, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            coordinatorLayout.i = resources.getIntArray(resourceId);
            float f2 = resources.getDisplayMetrics().density;
            int length = coordinatorLayout.i.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = coordinatorLayout.i;
                iArr[i2] = (int) (iArr[i2] * f2);
            }
        }
        coordinatorLayout.p = typedArray.getDrawable(w0a.c);
        typedArray.recycle();
        Y();
        super.setOnHierarchyChangeListener(new e());
        if (k7e.w(this) == 0) {
            k7e.t0(this, 1);
        }
    }

    @Override // com.google.inputmethod.bf8
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        c cVarF;
        int iMin;
        int iMin2;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i5) && (cVarF = fVar.f()) != null) {
                    int[] iArr2 = this.e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVarF.x(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    if (i3 > 0) {
                        iMin = Math.max(i6, this.e[0]);
                    } else {
                        iMin = Math.min(i6, this.e[0]);
                    }
                    i6 = iMin;
                    if (i4 > 0) {
                        iMin2 = Math.max(i7, this.e[1]);
                    } else {
                        iMin2 = Math.min(i7, this.e[1]);
                    }
                    i7 = iMin2;
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z) {
            H(1);
        }
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        SparseArray<Parcelable> c;

        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i = parcel.readInt();
            int[] iArr = new int[i];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.c = new SparseArray<>(i);
            for (int i2 = 0; i2 < i; i2++) {
                this.c.append(iArr[i2], parcelableArray[i2]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.c;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.c.keyAt(i2);
                parcelableArr[i2] = this.c.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class f extends ViewGroup.MarginLayoutParams {
        c a;
        boolean b;
        public int c;
        public int d;
        public int e;
        int f;
        public int g;
        public int h;
        int i;
        int j;
        View k;
        View l;
        private boolean m;
        private boolean n;
        private boolean o;
        private boolean p;
        final Rect q;
        Object r;

        public f(int i, int i2) {
            super(i, i2);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }

        private void n(View view, CoordinatorLayout coordinatorLayout) {
            View viewFindViewById = coordinatorLayout.findViewById(this.f);
            this.k = viewFindViewById;
            if (viewFindViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.l = null;
                    this.k = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f) + " to anchor view " + view);
            }
            if (viewFindViewById == coordinatorLayout) {
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                this.l = null;
                this.k = null;
                return;
            }
            for (ViewParent parent = viewFindViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    if (!coordinatorLayout.isInEditMode()) {
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    this.l = null;
                    this.k = null;
                    return;
                }
                if (parent instanceof View) {
                    viewFindViewById = parent;
                }
            }
            this.l = viewFindViewById;
        }

        private boolean s(View view, int i) {
            int iB = j15.b(((f) view.getLayoutParams()).g, i);
            return iB != 0 && (j15.b(this.h, i) & iB) == iB;
        }

        private boolean t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.k.getId() != this.f) {
                return false;
            }
            View view2 = this.k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.l = null;
                    this.k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.l = view2;
            return true;
        }

        boolean a() {
            return this.k == null && this.f != -1;
        }

        boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 == this.l || s(view2, k7e.y(coordinatorLayout))) {
                return true;
            }
            c cVar = this.a;
            return cVar != null && cVar.i(coordinatorLayout, view, view2);
        }

        boolean c() {
            if (this.a == null) {
                this.m = false;
            }
            return this.m;
        }

        View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f == -1) {
                this.l = null;
                this.k = null;
                return null;
            }
            if (this.k == null || !t(view, coordinatorLayout)) {
                n(view, coordinatorLayout);
            }
            return this.k;
        }

        public int e() {
            return this.f;
        }

        public c f() {
            return this.a;
        }

        boolean g() {
            return this.p;
        }

        Rect h() {
            return this.q;
        }

        boolean i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.m;
            if (z) {
                return true;
            }
            c cVar = this.a;
            boolean zE = (cVar != null ? cVar.e(coordinatorLayout, view) : false) | z;
            this.m = zE;
            return zE;
        }

        boolean j(int i) {
            if (i == 0) {
                return this.n;
            }
            if (i != 1) {
                return false;
            }
            return this.o;
        }

        void k() {
            this.p = false;
        }

        void l(int i) {
            r(i, false);
        }

        void m() {
            this.m = false;
        }

        public void o(c cVar) {
            c cVar2 = this.a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.n();
                }
                this.a = cVar;
                this.r = null;
                this.b = true;
                if (cVar != null) {
                    cVar.k(this);
                }
            }
        }

        void p(boolean z) {
            this.p = z;
        }

        void q(Rect rect) {
            this.q.set(rect);
        }

        void r(int i, boolean z) {
            if (i == 0) {
                this.n = z;
            } else {
                if (i != 1) {
                    return;
                }
                this.o = z;
            }
        }

        f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w0a.d);
            this.c = typedArrayObtainStyledAttributes.getInteger(w0a.e, 0);
            this.f = typedArrayObtainStyledAttributes.getResourceId(w0a.f, -1);
            this.d = typedArrayObtainStyledAttributes.getInteger(w0a.g, 0);
            this.e = typedArrayObtainStyledAttributes.getInteger(w0a.k, -1);
            this.g = typedArrayObtainStyledAttributes.getInt(w0a.j, 0);
            this.h = typedArrayObtainStyledAttributes.getInt(w0a.i, 0);
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(w0a.h);
            this.b = zHasValue;
            if (zHasValue) {
                this.a = CoordinatorLayout.K(context, attributeSet, typedArrayObtainStyledAttributes.getString(w0a.h));
            }
            typedArrayObtainStyledAttributes.recycle();
            c cVar = this.a;
            if (cVar != null) {
                cVar.k(this);
            }
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }
    }
}
