package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.f;
import androidx.constraintlayout.core.widgets.g;
import androidx.constraintlayout.core.widgets.i;
import com.google.inputmethod.cce;
import com.google.inputmethod.ev7;
import com.google.inputmethod.imb;
import com.google.inputmethod.lo6;
import com.google.inputmethod.mx1;
import com.google.inputmethod.t04;
import com.google.inputmethod.v0a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class ConstraintLayout extends ViewGroup {
    private static imb y;
    SparseArray<View> a;
    private ArrayList<androidx.constraintlayout.widget.a> b;
    protected androidx.constraintlayout.core.widgets.d c;
    private int d;
    private int e;
    private int f;
    private int g;
    protected boolean h;
    private int i;
    private androidx.constraintlayout.widget.c j;
    protected androidx.constraintlayout.widget.b k;
    private int l;
    private HashMap<String, Integer> m;
    private int n;
    private int o;
    int p;
    int q;
    int r;
    int s;
    private SparseArray<ConstraintWidget> t;
    c u;
    private int v;
    private int w;
    private ArrayList<d> x;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ConstraintWidget.DimensionBehaviour.values().length];
            a = iArr;
            try {
                iArr[ConstraintWidget.DimensionBehaviour.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ConstraintWidget.DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ConstraintWidget.DimensionBehaviour.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    class c implements androidx.constraintlayout.core.widgets.analyzer.b.InterfaceC0068b {
        ConstraintLayout a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;

        c(ConstraintLayout constraintLayout) {
            this.a = constraintLayout;
        }

        private boolean d(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
            }
            return false;
        }

        @Override // androidx.constraintlayout.core.widgets.analyzer.b.InterfaceC0068b
        public final void a() {
            int childCount = this.a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.a.getChildAt(i);
                if (childAt instanceof e) {
                    ((e) childAt).a(this.a);
                }
            }
            int size = this.a.b.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((androidx.constraintlayout.widget.a) this.a.b.get(i2)).s(this.a);
                }
            }
        }

        @Override // androidx.constraintlayout.core.widgets.analyzer.b.InterfaceC0068b
        public final void b(ConstraintWidget constraintWidget, androidx.constraintlayout.core.widgets.analyzer.b.a aVar) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            int baseline;
            int iMax;
            int iMax2;
            int i;
            if (constraintWidget == null) {
                return;
            }
            if (constraintWidget.Z() == 8 && !constraintWidget.n0()) {
                aVar.e = 0;
                aVar.f = 0;
                aVar.g = 0;
                return;
            }
            if (constraintWidget.N() == null) {
                return;
            }
            ConstraintLayout.d(ConstraintLayout.this);
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = aVar.a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = aVar.b;
            int i2 = aVar.c;
            int i3 = aVar.d;
            int i4 = this.b + this.c;
            int i5 = this.d;
            View view = (View) constraintWidget.u();
            int[] iArr = a.a;
            int i6 = iArr[dimensionBehaviour.ordinal()];
            if (i6 == 1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
            } else if (i6 == 2) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i5, -2);
            } else if (i6 == 3) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i5 + constraintWidget.D(), -1);
            } else if (i6 != 4) {
                iMakeMeasureSpec = 0;
            } else {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i5, -2);
                boolean z = constraintWidget.w == 1;
                int i7 = aVar.j;
                if (i7 == androidx.constraintlayout.core.widgets.analyzer.b.a.l || i7 == androidx.constraintlayout.core.widgets.analyzer.b.a.m) {
                    boolean z2 = view.getMeasuredHeight() == constraintWidget.z();
                    if (aVar.j == androidx.constraintlayout.core.widgets.analyzer.b.a.m || !z || ((z && z2) || (view instanceof e) || constraintWidget.r0())) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(constraintWidget.a0(), 1073741824);
                    }
                }
            }
            int i8 = iArr[dimensionBehaviour2.ordinal()];
            if (i8 == 1) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            } else if (i8 == 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i4, -2);
            } else if (i8 == 3) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i4 + constraintWidget.Y(), -1);
            } else if (i8 != 4) {
                iMakeMeasureSpec2 = 0;
            } else {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i4, -2);
                boolean z3 = constraintWidget.x == 1;
                int i9 = aVar.j;
                if (i9 == androidx.constraintlayout.core.widgets.analyzer.b.a.l || i9 == androidx.constraintlayout.core.widgets.analyzer.b.a.m) {
                    boolean z4 = view.getMeasuredWidth() == constraintWidget.a0();
                    if (aVar.j == androidx.constraintlayout.core.widgets.analyzer.b.a.m || !z3 || ((z3 && z4) || (view instanceof e) || constraintWidget.s0())) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(constraintWidget.z(), 1073741824);
                    }
                }
            }
            androidx.constraintlayout.core.widgets.d dVar = (androidx.constraintlayout.core.widgets.d) constraintWidget.N();
            if (dVar != null && g.b(ConstraintLayout.this.i, 256) && view.getMeasuredWidth() == constraintWidget.a0() && view.getMeasuredWidth() < dVar.a0() && view.getMeasuredHeight() == constraintWidget.z() && view.getMeasuredHeight() < dVar.z() && view.getBaseline() == constraintWidget.r() && !constraintWidget.q0() && d(constraintWidget.E(), iMakeMeasureSpec, constraintWidget.a0()) && d(constraintWidget.F(), iMakeMeasureSpec2, constraintWidget.z())) {
                aVar.e = constraintWidget.a0();
                aVar.f = constraintWidget.z();
                aVar.g = constraintWidget.r();
                return;
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            boolean z5 = dimensionBehaviour == dimensionBehaviour3;
            boolean z6 = dimensionBehaviour2 == dimensionBehaviour3;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
            boolean z7 = dimensionBehaviour2 == dimensionBehaviour4 || dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.FIXED;
            boolean z8 = dimensionBehaviour == dimensionBehaviour4 || dimensionBehaviour == ConstraintWidget.DimensionBehaviour.FIXED;
            boolean z9 = z5 && constraintWidget.f0 > 0.0f;
            boolean z10 = z6 && constraintWidget.f0 > 0.0f;
            if (view == null) {
                return;
            }
            b bVar = (b) view.getLayoutParams();
            int i10 = aVar.j;
            if (i10 != androidx.constraintlayout.core.widgets.analyzer.b.a.l && i10 != androidx.constraintlayout.core.widgets.analyzer.b.a.m && z5 && constraintWidget.w == 0 && z6 && constraintWidget.x == 0) {
                i = -1;
                iMax2 = 0;
                baseline = 0;
                iMax = 0;
            } else {
                if ((view instanceof cce) && (constraintWidget instanceof i)) {
                    ((cce) view).x((i) constraintWidget, iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                constraintWidget.c1(iMakeMeasureSpec, iMakeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                int i11 = constraintWidget.z;
                iMax = i11 > 0 ? Math.max(i11, measuredWidth) : measuredWidth;
                int i12 = constraintWidget.A;
                if (i12 > 0) {
                    iMax = Math.min(i12, iMax);
                }
                int i13 = constraintWidget.C;
                iMax2 = i13 > 0 ? Math.max(i13, measuredHeight) : measuredHeight;
                boolean z11 = z8;
                int i14 = constraintWidget.D;
                if (i14 > 0) {
                    iMax2 = Math.min(i14, iMax2);
                }
                boolean z12 = z7;
                if (!g.b(ConstraintLayout.this.i, 1)) {
                    if (z9 && z12) {
                        iMax = (int) ((iMax2 * constraintWidget.f0) + 0.5f);
                    } else if (z10 && z11) {
                        iMax2 = (int) ((iMax / constraintWidget.f0) + 0.5f);
                    }
                }
                if (measuredWidth != iMax || measuredHeight != iMax2) {
                    if (measuredWidth != iMax) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    }
                    if (measuredHeight != iMax2) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    constraintWidget.c1(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = view.getMeasuredWidth();
                    iMax2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i = -1;
            }
            boolean z13 = baseline != i;
            aVar.i = (iMax == aVar.c && iMax2 == aVar.d) ? false : true;
            if (bVar.g0) {
                z13 = true;
            }
            if (z13 && baseline != -1 && constraintWidget.r() != baseline) {
                aVar.i = true;
            }
            aVar.e = iMax;
            aVar.f = iMax2;
            aVar.h = z13;
            aVar.g = baseline;
            ConstraintLayout.d(ConstraintLayout.this);
        }

        public void c(int i, int i2, int i3, int i4, int i5, int i6) {
            this.b = i3;
            this.c = i4;
            this.d = i5;
            this.e = i6;
            this.f = i;
            this.g = i2;
        }
    }

    public interface d {
        boolean a(int i, int i2, int i3, View view, b bVar);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new SparseArray<>();
        this.b = new ArrayList<>(4);
        this.c = new androidx.constraintlayout.core.widgets.d();
        this.d = 0;
        this.e = 0;
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.j = null;
        this.k = null;
        this.l = -1;
        this.m = new HashMap<>();
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = -1;
        this.r = 0;
        this.s = 0;
        this.t = new SparseArray<>();
        this.u = new c(this);
        this.v = 0;
        this.w = 0;
        o(attributeSet, 0, 0);
    }

    static /* synthetic */ ev7 d(ConstraintLayout constraintLayout) {
        constraintLayout.getClass();
        return null;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int iMax2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static imb getSharedValues() {
        if (y == null) {
            y = new imb();
        }
        return y;
    }

    private ConstraintWidget l(int i) {
        if (i == 0) {
            return this.c;
        }
        View viewFindViewById = this.a.get(i);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.c;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((b) viewFindViewById.getLayoutParams()).v0;
    }

    private void o(AttributeSet attributeSet, int i, int i2) {
        this.c.I0(this);
        this.c.e2(this.u);
        this.a.put(getId(), this);
        this.j = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, v0a.V0, i, i2);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == v0a.f1) {
                    this.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.d);
                } else if (index == v0a.g1) {
                    this.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                } else if (index == v0a.d1) {
                    this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                } else if (index == v0a.e1) {
                    this.g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.g);
                } else if (index == v0a.O2) {
                    this.i = typedArrayObtainStyledAttributes.getInt(index, this.i);
                } else if (index == v0a.J1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            r(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.k = null;
                        }
                    }
                } else if (index == v0a.n1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                        this.j = cVar;
                        cVar.E(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.j = null;
                    }
                    this.l = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.c.f2(this.i);
    }

    private void q() {
        this.h = true;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = -1;
        this.r = 0;
        this.s = 0;
    }

    private void u() {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ConstraintWidget constraintWidgetN = n(getChildAt(i));
            if (constraintWidgetN != null) {
                constraintWidgetN.x0();
            }
        }
        if (zIsInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    v(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    l(childAt.getId()).J0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.l != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getId() == this.l && (childAt2 instanceof androidx.constraintlayout.widget.d)) {
                    this.j = ((androidx.constraintlayout.widget.d) childAt2).getConstraintSet();
                }
            }
        }
        androidx.constraintlayout.widget.c cVar = this.j;
        if (cVar != null) {
            cVar.k(this, true);
        }
        this.c.C1();
        int size = this.b.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                this.b.get(i4).v(this);
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt3 = getChildAt(i5);
            if (childAt3 instanceof e) {
                ((e) childAt3).b(this);
            }
        }
        this.t.clear();
        this.t.put(0, this.c);
        this.t.put(getId(), this.c);
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt4 = getChildAt(i6);
            this.t.put(childAt4.getId(), n(childAt4));
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt5 = getChildAt(i7);
            ConstraintWidget constraintWidgetN2 = n(childAt5);
            if (constraintWidgetN2 != null) {
                b bVar = (b) childAt5.getLayoutParams();
                this.c.a(constraintWidgetN2);
                g(zIsInEditMode, childAt5, constraintWidgetN2, bVar, this.t);
            }
        }
    }

    private void x(ConstraintWidget constraintWidget, b bVar, SparseArray<ConstraintWidget> sparseArray, int i, ConstraintAnchor.Type type) {
        View view = this.a.get(i);
        ConstraintWidget constraintWidget2 = sparseArray.get(i);
        if (constraintWidget2 == null || view == null || !(view.getLayoutParams() instanceof b)) {
            return;
        }
        bVar.g0 = true;
        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.BASELINE;
        if (type == type2) {
            b bVar2 = (b) view.getLayoutParams();
            bVar2.g0 = true;
            bVar2.v0.R0(true);
        }
        constraintWidget.q(type2).b(constraintWidget2.q(type), bVar.D, bVar.C, true);
        constraintWidget.R0(true);
        constraintWidget.q(ConstraintAnchor.Type.TOP).q();
        constraintWidget.q(ConstraintAnchor.Type.BOTTOM).q();
    }

    private boolean y() {
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            }
        }
        if (z) {
            u();
        }
        return z;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.a> arrayList = this.b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.b.get(i).t(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        int i8 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + i8;
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void forceLayout() {
        q();
        super.forceLayout();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:75:0x0174  */
    /* JADX WARN: Code duplicated, block: B:78:0x017d  */
    public void g(boolean z, View view, ConstraintWidget constraintWidget, b bVar, SparseArray<ConstraintWidget> sparseArray) {
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        ConstraintWidget constraintWidget5;
        b bVar2;
        ConstraintWidget constraintWidget6;
        float f;
        int i;
        bVar.b();
        bVar.w0 = false;
        constraintWidget.q1(view.getVisibility());
        if (bVar.j0) {
            constraintWidget.a1(true);
            constraintWidget.q1(8);
        }
        constraintWidget.I0(view);
        if (view instanceof androidx.constraintlayout.widget.a) {
            ((androidx.constraintlayout.widget.a) view).q(constraintWidget, this.c.Y1());
        }
        if (bVar.h0) {
            f fVar = (f) constraintWidget;
            int i2 = bVar.s0;
            int i3 = bVar.t0;
            float f2 = bVar.u0;
            if (f2 != -1.0f) {
                fVar.G1(f2);
                return;
            } else if (i2 != -1) {
                fVar.E1(i2);
                return;
            } else {
                if (i3 != -1) {
                    fVar.F1(i3);
                    return;
                }
                return;
            }
        }
        int i4 = bVar.l0;
        int i5 = bVar.m0;
        int i6 = bVar.n0;
        int i7 = bVar.o0;
        int i8 = bVar.p0;
        int i9 = bVar.q0;
        float f3 = bVar.r0;
        int i10 = bVar.p;
        if (i10 != -1) {
            ConstraintWidget constraintWidget7 = sparseArray.get(i10);
            if (constraintWidget7 != null) {
                constraintWidget.m(constraintWidget7, bVar.r, bVar.q);
            }
            constraintWidget6 = constraintWidget;
            bVar2 = bVar;
        } else {
            if (i4 != -1) {
                ConstraintWidget constraintWidget8 = sparseArray.get(i4);
                if (constraintWidget8 != null) {
                    ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
                    constraintWidget.i0(type, constraintWidget8, type, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i8);
                }
            } else if (i5 != -1 && (constraintWidget2 = sparseArray.get(i5)) != null) {
                constraintWidget.i0(ConstraintAnchor.Type.LEFT, constraintWidget2, ConstraintAnchor.Type.RIGHT, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i8);
            }
            if (i6 != -1) {
                ConstraintWidget constraintWidget9 = sparseArray.get(i6);
                if (constraintWidget9 != null) {
                    constraintWidget.i0(ConstraintAnchor.Type.RIGHT, constraintWidget9, ConstraintAnchor.Type.LEFT, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i9);
                }
            } else if (i7 != -1 && (constraintWidget3 = sparseArray.get(i7)) != null) {
                ConstraintAnchor.Type type2 = ConstraintAnchor.Type.RIGHT;
                constraintWidget.i0(type2, constraintWidget3, type2, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i9);
            }
            int i11 = bVar.i;
            if (i11 != -1) {
                ConstraintWidget constraintWidget10 = sparseArray.get(i11);
                if (constraintWidget10 != null) {
                    ConstraintAnchor.Type type3 = ConstraintAnchor.Type.TOP;
                    constraintWidget.i0(type3, constraintWidget10, type3, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.x);
                }
            } else {
                int i12 = bVar.j;
                if (i12 != -1 && (constraintWidget4 = sparseArray.get(i12)) != null) {
                    constraintWidget.i0(ConstraintAnchor.Type.TOP, constraintWidget4, ConstraintAnchor.Type.BOTTOM, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.x);
                }
            }
            int i13 = bVar.k;
            if (i13 != -1) {
                ConstraintWidget constraintWidget11 = sparseArray.get(i13);
                if (constraintWidget11 != null) {
                    constraintWidget.i0(ConstraintAnchor.Type.BOTTOM, constraintWidget11, ConstraintAnchor.Type.TOP, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.z);
                }
            } else {
                int i14 = bVar.l;
                if (i14 != -1 && (constraintWidget5 = sparseArray.get(i14)) != null) {
                    ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
                    constraintWidget.i0(type4, constraintWidget5, type4, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.z);
                }
            }
            int i15 = bVar.m;
            if (i15 != -1) {
                bVar2 = bVar;
                x(constraintWidget, bVar2, sparseArray, i15, ConstraintAnchor.Type.BASELINE);
            } else {
                bVar2 = bVar;
                int i16 = bVar2.n;
                if (i16 != -1) {
                    x(constraintWidget, bVar2, sparseArray, i16, ConstraintAnchor.Type.TOP);
                } else {
                    int i17 = bVar2.o;
                    if (i17 != -1) {
                        x(constraintWidget, bVar2, sparseArray, i17, ConstraintAnchor.Type.BOTTOM);
                        constraintWidget6 = constraintWidget;
                    }
                    if (f3 >= 0.0f) {
                        constraintWidget6.T0(f3);
                    }
                    f = bVar2.H;
                    if (f >= 0.0f) {
                        constraintWidget6.k1(f);
                    }
                }
            }
            constraintWidget6 = constraintWidget;
            if (f3 >= 0.0f) {
                constraintWidget6.T0(f3);
            }
            f = bVar2.H;
            if (f >= 0.0f) {
                constraintWidget6.k1(f);
            }
        }
        if (z && ((i = bVar2.X) != -1 || bVar2.Y != -1)) {
            constraintWidget6.i1(i, bVar2.Y);
        }
        if (bVar2.e0) {
            constraintWidget6.W0(ConstraintWidget.DimensionBehaviour.FIXED);
            constraintWidget6.r1(((ViewGroup.MarginLayoutParams) bVar2).width);
            if (((ViewGroup.MarginLayoutParams) bVar2).width == -2) {
                constraintWidget6.W0(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar2).width == -1) {
            if (bVar2.a0) {
                constraintWidget6.W0(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            } else {
                constraintWidget6.W0(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
            }
            constraintWidget6.q(ConstraintAnchor.Type.LEFT).g = ((ViewGroup.MarginLayoutParams) bVar2).leftMargin;
            constraintWidget6.q(ConstraintAnchor.Type.RIGHT).g = ((ViewGroup.MarginLayoutParams) bVar2).rightMargin;
        } else {
            constraintWidget6.W0(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            constraintWidget6.r1(0);
        }
        if (bVar2.f0) {
            constraintWidget6.n1(ConstraintWidget.DimensionBehaviour.FIXED);
            constraintWidget6.S0(((ViewGroup.MarginLayoutParams) bVar2).height);
            if (((ViewGroup.MarginLayoutParams) bVar2).height == -2) {
                constraintWidget6.n1(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar2).height == -1) {
            if (bVar2.b0) {
                constraintWidget6.n1(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            } else {
                constraintWidget6.n1(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
            }
            constraintWidget6.q(ConstraintAnchor.Type.TOP).g = ((ViewGroup.MarginLayoutParams) bVar2).topMargin;
            constraintWidget6.q(ConstraintAnchor.Type.BOTTOM).g = ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin;
        } else {
            constraintWidget6.n1(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            constraintWidget6.S0(0);
        }
        constraintWidget6.K0(bVar2.I);
        constraintWidget6.Y0(bVar2.L);
        constraintWidget6.p1(bVar2.M);
        constraintWidget6.U0(bVar2.N);
        constraintWidget6.l1(bVar2.O);
        constraintWidget6.s1(bVar2.d0);
        constraintWidget6.X0(bVar2.P, bVar2.R, bVar2.T, bVar2.V);
        constraintWidget6.o1(bVar2.Q, bVar2.S, bVar2.U, bVar2.W);
    }

    public int getMaxHeight() {
        return this.g;
    }

    public int getMaxWidth() {
        return this.f;
    }

    public int getMinHeight() {
        return this.e;
    }

    public int getMinWidth() {
        return this.d;
    }

    public int getOptimizationLevel() {
        return this.c.S1();
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        if (this.c.o == null) {
            int id2 = getId();
            if (id2 != -1) {
                this.c.o = getContext().getResources().getResourceEntryName(id2);
            } else {
                this.c.o = "parent";
            }
        }
        if (this.c.v() == null) {
            androidx.constraintlayout.core.widgets.d dVar = this.c;
            dVar.J0(dVar.o);
            this.c.v();
        }
        for (ConstraintWidget constraintWidget : this.c.z1()) {
            View view = (View) constraintWidget.u();
            if (view != null) {
                if (constraintWidget.o == null && (id = view.getId()) != -1) {
                    constraintWidget.o = getContext().getResources().getResourceEntryName(id);
                }
                if (constraintWidget.v() == null) {
                    constraintWidget.J0(constraintWidget.o);
                    constraintWidget.v();
                }
            }
        }
        this.c.R(sb);
        return sb.toString();
    }

    protected boolean h(int i, int i2) {
        boolean zA = false;
        if (this.x == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        for (d dVar : this.x) {
            Iterator<ConstraintWidget> it = this.c.z1().iterator();
            while (it.hasNext()) {
                View view = (View) it.next().u();
                zA |= dVar.a(size, size2, view.getId(), view, (b) view.getLayoutParams());
            }
        }
        return zA;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public Object k(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> map = this.m;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.m.get(str);
    }

    public View m(int i) {
        return this.a.get(i);
    }

    public final ConstraintWidget n(View view) {
        if (view == this) {
            return this.c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).v0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).v0;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            b bVar = (b) childAt.getLayoutParams();
            ConstraintWidget constraintWidget = bVar.v0;
            if ((childAt.getVisibility() != 8 || bVar.h0 || bVar.i0 || bVar.k0 || zIsInEditMode) && !bVar.j0) {
                int iB0 = constraintWidget.b0();
                int iC0 = constraintWidget.c0();
                int iA0 = constraintWidget.a0() + iB0;
                int iZ = constraintWidget.z() + iC0;
                childAt.layout(iB0, iC0, iA0, iZ);
                if ((childAt instanceof e) && (content = ((e) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iB0, iC0, iA0, iZ);
                }
            }
        }
        int size = this.b.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.b.get(i6).r(this);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        boolean zH = this.h | h(i, i2);
        this.h = zH;
        if (!zH) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                if (getChildAt(i3).isLayoutRequested()) {
                    this.h = true;
                    break;
                }
            }
        }
        this.v = i;
        this.w = i2;
        this.c.h2(p());
        if (this.h) {
            this.h = false;
            if (y()) {
                this.c.j2();
            }
        }
        this.c.Q1(null);
        t(this.c, this.i, i, i2);
        s(i, i2, this.c.a0(), this.c.z(), this.c.Z1(), this.c.X1());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        ConstraintWidget constraintWidgetN = n(view);
        if ((view instanceof Guideline) && !(constraintWidgetN instanceof f)) {
            b bVar = (b) view.getLayoutParams();
            f fVar = new f();
            bVar.v0 = fVar;
            bVar.h0 = true;
            fVar.H1(bVar.Z);
        }
        if (view instanceof androidx.constraintlayout.widget.a) {
            androidx.constraintlayout.widget.a aVar = (androidx.constraintlayout.widget.a) view;
            aVar.w();
            ((b) view.getLayoutParams()).i0 = true;
            if (!this.b.contains(aVar)) {
                this.b.add(aVar);
            }
        }
        this.a.put(view.getId(), view);
        this.h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        this.c.B1(n(view));
        this.b.remove(view);
        this.h = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean p() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    protected void r(int i) {
        this.k = new androidx.constraintlayout.widget.b(getContext(), this, i);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        q();
        super.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void s(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        c cVar = this.u;
        int i5 = cVar.e;
        int iResolveSizeAndState = View.resolveSizeAndState(i3 + cVar.d, i, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i4 + i5, i2, 0) & 16777215;
        int iMin = Math.min(this.f, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.g, iResolveSizeAndState2);
        if (z) {
            iMin |= 16777216;
        }
        if (z2) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.n = iMin;
        this.o = iMin2;
    }

    public void setConstraintSet(androidx.constraintlayout.widget.c cVar) {
        this.j = cVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        this.a.remove(getId());
        super.setId(i);
        this.a.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.g) {
            return;
        }
        this.g = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f) {
            return;
        }
        this.f = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.e) {
            return;
        }
        this.e = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.d) {
            return;
        }
        this.d = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(mx1 mx1Var) {
        androidx.constraintlayout.widget.b bVar = this.k;
        if (bVar != null) {
            bVar.c(mx1Var);
        }
    }

    public void setOptimizationLevel(int i) {
        this.i = i;
        this.c.f2(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void t(androidx.constraintlayout.core.widgets.d dVar, int i, int i2, int i3) {
        int i4;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i5 = iMax + iMax2;
        int paddingWidth = getPaddingWidth();
        this.u.c(i2, i3, iMax, iMax2, paddingWidth, i5);
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        if (iMax3 > 0 || iMax4 > 0) {
            if (p()) {
                i4 = iMax4;
            }
            int i6 = size - paddingWidth;
            int i7 = size2 - i5;
            w(dVar, mode, i6, mode2, i7);
            dVar.a2(i, mode, i6, mode2, i7, this.n, this.o, i4, iMax);
        }
        iMax3 = Math.max(0, getPaddingLeft());
        i4 = iMax3;
        int i8 = size - paddingWidth;
        int i9 = size2 - i5;
        w(dVar, mode, i8, mode2, i9);
        dVar.a2(i, mode, i8, mode2, i9, this.n, this.o, i4, iMax);
    }

    public void v(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.m == null) {
                this.m = new HashMap<>();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            this.m.put(strSubstring, (Integer) obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003e A[PHI: r2
  0x003e: PHI (r2v4 androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour) = 
  (r2v3 androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour)
  (r2v0 androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour)
 binds: [B:21:0x004a, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    protected void w(androidx.constraintlayout.core.widgets.d dVar, int i, int i2, int i3, int i4) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        c cVar = this.u;
        int i5 = cVar.e;
        int i6 = cVar.d;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
        int childCount = getChildCount();
        if (i == Integer.MIN_VALUE) {
            dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                i2 = Math.max(0, this.d);
            }
        } else if (i == 0) {
            dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            i2 = childCount == 0 ? Math.max(0, this.d) : 0;
        } else if (i != 1073741824) {
            dimensionBehaviour = dimensionBehaviour2;
        } else {
            i2 = Math.min(this.f - i6, i2);
            dimensionBehaviour = dimensionBehaviour2;
        }
        if (i3 == Integer.MIN_VALUE) {
            dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.e);
            }
        } else if (i3 == 0) {
            dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.e);
            } else {
                i4 = 0;
            }
        } else if (i3 != 1073741824) {
            i4 = 0;
        } else {
            i4 = Math.min(this.g - i5, i4);
        }
        if (i2 != dVar.a0() || i4 != dVar.z()) {
            dVar.W1();
        }
        dVar.t1(0);
        dVar.u1(0);
        dVar.e1(this.f - i6);
        dVar.d1(this.g - i5);
        dVar.h1(0);
        dVar.g1(0);
        dVar.W0(dimensionBehaviour);
        dVar.r1(i2);
        dVar.n1(dimensionBehaviour2);
        dVar.S0(i4);
        dVar.h1(this.d - i6);
        dVar.g1(this.e - i5);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new SparseArray<>();
        this.b = new ArrayList<>(4);
        this.c = new androidx.constraintlayout.core.widgets.d();
        this.d = 0;
        this.e = 0;
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.j = null;
        this.k = null;
        this.l = -1;
        this.m = new HashMap<>();
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = -1;
        this.r = 0;
        this.s = 0;
        this.t = new SparseArray<>();
        this.u = new c(this);
        this.v = 0;
        this.w = 0;
        o(attributeSet, i, 0);
    }

    public static class b extends ViewGroup.MarginLayoutParams {
        public int A;
        public int B;
        public int C;
        public int D;
        boolean E;
        boolean F;
        public float G;
        public float H;
        public String I;
        float J;
        int K;
        public float L;
        public float M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public int R;
        public int S;
        public int T;
        public int U;
        public float V;
        public float W;
        public int X;
        public int Y;
        public int Z;
        public int a;
        public boolean a0;
        public int b;
        public boolean b0;
        public float c;
        public String c0;
        public boolean d;
        public int d0;
        public int e;
        boolean e0;
        public int f;
        boolean f0;
        public int g;
        boolean g0;
        public int h;
        boolean h0;
        public int i;
        boolean i0;
        public int j;
        boolean j0;
        public int k;
        boolean k0;
        public int l;
        int l0;
        public int m;
        int m0;
        public int n;
        int n0;
        public int o;
        int o0;
        public int p;
        int p0;
        public int q;
        int q0;
        public float r;
        float r0;
        public int s;
        int s0;
        public int t;
        int t0;
        public int u;
        float u0;
        public int v;
        ConstraintWidget v0;
        public int w;
        public boolean w0;
        public int x;
        public int y;
        public int z;

        private static class a {
            public static final SparseIntArray a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                a = sparseIntArray;
                sparseIntArray.append(v0a.z2, 64);
                sparseIntArray.append(v0a.c2, 65);
                sparseIntArray.append(v0a.l2, 8);
                sparseIntArray.append(v0a.m2, 9);
                sparseIntArray.append(v0a.o2, 10);
                sparseIntArray.append(v0a.p2, 11);
                sparseIntArray.append(v0a.v2, 12);
                sparseIntArray.append(v0a.u2, 13);
                sparseIntArray.append(v0a.S1, 14);
                sparseIntArray.append(v0a.R1, 15);
                sparseIntArray.append(v0a.N1, 16);
                sparseIntArray.append(v0a.P1, 52);
                sparseIntArray.append(v0a.O1, 53);
                sparseIntArray.append(v0a.T1, 2);
                sparseIntArray.append(v0a.V1, 3);
                sparseIntArray.append(v0a.U1, 4);
                sparseIntArray.append(v0a.E2, 49);
                sparseIntArray.append(v0a.F2, 50);
                sparseIntArray.append(v0a.Z1, 5);
                sparseIntArray.append(v0a.a2, 6);
                sparseIntArray.append(v0a.b2, 7);
                sparseIntArray.append(v0a.I1, 67);
                sparseIntArray.append(v0a.W0, 1);
                sparseIntArray.append(v0a.q2, 17);
                sparseIntArray.append(v0a.r2, 18);
                sparseIntArray.append(v0a.Y1, 19);
                sparseIntArray.append(v0a.X1, 20);
                sparseIntArray.append(v0a.J2, 21);
                sparseIntArray.append(v0a.M2, 22);
                sparseIntArray.append(v0a.K2, 23);
                sparseIntArray.append(v0a.H2, 24);
                sparseIntArray.append(v0a.L2, 25);
                sparseIntArray.append(v0a.I2, 26);
                sparseIntArray.append(v0a.G2, 55);
                sparseIntArray.append(v0a.N2, 54);
                sparseIntArray.append(v0a.h2, 29);
                sparseIntArray.append(v0a.w2, 30);
                sparseIntArray.append(v0a.W1, 44);
                sparseIntArray.append(v0a.j2, 45);
                sparseIntArray.append(v0a.y2, 46);
                sparseIntArray.append(v0a.i2, 47);
                sparseIntArray.append(v0a.x2, 48);
                sparseIntArray.append(v0a.L1, 27);
                sparseIntArray.append(v0a.K1, 28);
                sparseIntArray.append(v0a.A2, 31);
                sparseIntArray.append(v0a.d2, 32);
                sparseIntArray.append(v0a.C2, 33);
                sparseIntArray.append(v0a.B2, 34);
                sparseIntArray.append(v0a.D2, 35);
                sparseIntArray.append(v0a.f2, 36);
                sparseIntArray.append(v0a.e2, 37);
                sparseIntArray.append(v0a.g2, 38);
                sparseIntArray.append(v0a.k2, 39);
                sparseIntArray.append(v0a.t2, 40);
                sparseIntArray.append(v0a.n2, 41);
                sparseIntArray.append(v0a.Q1, 42);
                sparseIntArray.append(v0a.M1, 43);
                sparseIntArray.append(v0a.s2, 51);
                sparseIntArray.append(v0a.P2, 66);
            }
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = true;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = 0.0f;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = t04.INVALID_ID;
            this.x = t04.INVALID_ID;
            this.y = t04.INVALID_ID;
            this.z = t04.INVALID_ID;
            this.A = t04.INVALID_ID;
            this.B = t04.INVALID_ID;
            this.C = t04.INVALID_ID;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.a0 = false;
            this.b0 = false;
            this.c0 = null;
            this.d0 = 0;
            this.e0 = true;
            this.f0 = true;
            this.g0 = false;
            this.h0 = false;
            this.i0 = false;
            this.j0 = false;
            this.k0 = false;
            this.l0 = -1;
            this.m0 = -1;
            this.n0 = -1;
            this.o0 = -1;
            this.p0 = t04.INVALID_ID;
            this.q0 = t04.INVALID_ID;
            this.r0 = 0.5f;
            this.v0 = new ConstraintWidget();
            this.w0 = false;
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
                ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
                ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
                ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
                setMarginStart(marginLayoutParams.getMarginStart());
                setMarginEnd(marginLayoutParams.getMarginEnd());
            }
            if (layoutParams instanceof b) {
                b bVar = (b) layoutParams;
                this.a = bVar.a;
                this.b = bVar.b;
                this.c = bVar.c;
                this.d = bVar.d;
                this.e = bVar.e;
                this.f = bVar.f;
                this.g = bVar.g;
                this.h = bVar.h;
                this.i = bVar.i;
                this.j = bVar.j;
                this.k = bVar.k;
                this.l = bVar.l;
                this.m = bVar.m;
                this.n = bVar.n;
                this.o = bVar.o;
                this.p = bVar.p;
                this.q = bVar.q;
                this.r = bVar.r;
                this.s = bVar.s;
                this.t = bVar.t;
                this.u = bVar.u;
                this.v = bVar.v;
                this.w = bVar.w;
                this.x = bVar.x;
                this.y = bVar.y;
                this.z = bVar.z;
                this.A = bVar.A;
                this.B = bVar.B;
                this.C = bVar.C;
                this.D = bVar.D;
                this.G = bVar.G;
                this.H = bVar.H;
                this.I = bVar.I;
                this.J = bVar.J;
                this.K = bVar.K;
                this.L = bVar.L;
                this.M = bVar.M;
                this.N = bVar.N;
                this.O = bVar.O;
                this.a0 = bVar.a0;
                this.b0 = bVar.b0;
                this.P = bVar.P;
                this.Q = bVar.Q;
                this.R = bVar.R;
                this.T = bVar.T;
                this.S = bVar.S;
                this.U = bVar.U;
                this.V = bVar.V;
                this.W = bVar.W;
                this.X = bVar.X;
                this.Y = bVar.Y;
                this.Z = bVar.Z;
                this.e0 = bVar.e0;
                this.f0 = bVar.f0;
                this.g0 = bVar.g0;
                this.h0 = bVar.h0;
                this.l0 = bVar.l0;
                this.m0 = bVar.m0;
                this.n0 = bVar.n0;
                this.o0 = bVar.o0;
                this.p0 = bVar.p0;
                this.q0 = bVar.q0;
                this.r0 = bVar.r0;
                this.c0 = bVar.c0;
                this.d0 = bVar.d0;
                this.v0 = bVar.v0;
                this.E = bVar.E;
                this.F = bVar.F;
            }
        }

        public String a() {
            return this.c0;
        }

        public void b() {
            this.h0 = false;
            this.e0 = true;
            this.f0 = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.a0) {
                this.e0 = false;
                if (this.P == 0) {
                    this.P = 1;
                }
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == -2 && this.b0) {
                this.f0 = false;
                if (this.Q == 0) {
                    this.Q = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.e0 = false;
                if (i == 0 && this.P == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.a0 = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.f0 = false;
                if (i2 == 0 && this.Q == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.b0 = true;
                }
            }
            if (this.c == -1.0f && this.a == -1 && this.b == -1) {
                return;
            }
            this.h0 = true;
            this.e0 = true;
            this.f0 = true;
            if (!(this.v0 instanceof f)) {
                this.v0 = new f();
            }
            ((f) this.v0).H1(this.Z);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x004a  */
        /* JADX WARN: Code duplicated, block: B:20:0x0051  */
        /* JADX WARN: Code duplicated, block: B:23:0x0058  */
        /* JADX WARN: Code duplicated, block: B:26:0x005e  */
        /* JADX WARN: Code duplicated, block: B:29:0x0064  */
        /* JADX WARN: Code duplicated, block: B:38:0x007a  */
        /* JADX WARN: Code duplicated, block: B:39:0x0082 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:40:0x0084  */
        /* JADX WARN: Code duplicated, block: B:41:0x008b A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:42:0x008d  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        public void resolveLayoutDirection(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i7 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i);
            boolean z = false;
            boolean z2 = 1 == getLayoutDirection();
            this.n0 = -1;
            this.o0 = -1;
            this.l0 = -1;
            this.m0 = -1;
            this.p0 = this.w;
            this.q0 = this.y;
            float f = this.G;
            this.r0 = f;
            int i8 = this.a;
            this.s0 = i8;
            int i9 = this.b;
            this.t0 = i9;
            float f2 = this.c;
            this.u0 = f2;
            if (z2) {
                int i10 = this.s;
                if (i10 != -1) {
                    this.n0 = i10;
                } else {
                    int i11 = this.t;
                    if (i11 != -1) {
                        this.o0 = i11;
                    } else {
                        i2 = this.u;
                        if (i2 != -1) {
                            this.m0 = i2;
                            z = true;
                        }
                        i3 = this.v;
                        if (i3 != -1) {
                            this.l0 = i3;
                            z = true;
                        }
                        i4 = this.A;
                        if (i4 != Integer.MIN_VALUE) {
                            this.q0 = i4;
                        }
                        i5 = this.B;
                        if (i5 != Integer.MIN_VALUE) {
                            this.p0 = i5;
                        }
                        if (z) {
                            this.r0 = 1.0f - f;
                        }
                        if (this.h0 && this.Z == 1 && this.d) {
                            if (f2 != -1.0f) {
                                this.u0 = 1.0f - f2;
                                this.s0 = -1;
                                this.t0 = -1;
                            } else if (i8 != -1) {
                                this.t0 = i8;
                                this.s0 = -1;
                                this.u0 = -1.0f;
                            } else if (i9 != -1) {
                                this.s0 = i9;
                                this.t0 = -1;
                                this.u0 = -1.0f;
                            }
                        }
                    }
                }
                z = true;
                i2 = this.u;
                if (i2 != -1) {
                    this.m0 = i2;
                    z = true;
                }
                i3 = this.v;
                if (i3 != -1) {
                    this.l0 = i3;
                    z = true;
                }
                i4 = this.A;
                if (i4 != Integer.MIN_VALUE) {
                    this.q0 = i4;
                }
                i5 = this.B;
                if (i5 != Integer.MIN_VALUE) {
                    this.p0 = i5;
                }
                if (z) {
                    this.r0 = 1.0f - f;
                }
                if (this.h0) {
                    if (f2 != -1.0f) {
                        this.u0 = 1.0f - f2;
                        this.s0 = -1;
                        this.t0 = -1;
                    } else if (i8 != -1) {
                        this.t0 = i8;
                        this.s0 = -1;
                        this.u0 = -1.0f;
                    } else if (i9 != -1) {
                        this.s0 = i9;
                        this.t0 = -1;
                        this.u0 = -1.0f;
                    }
                }
            } else {
                int i12 = this.s;
                if (i12 != -1) {
                    this.m0 = i12;
                }
                int i13 = this.t;
                if (i13 != -1) {
                    this.l0 = i13;
                }
                int i14 = this.u;
                if (i14 != -1) {
                    this.n0 = i14;
                }
                int i15 = this.v;
                if (i15 != -1) {
                    this.o0 = i15;
                }
                int i16 = this.A;
                if (i16 != Integer.MIN_VALUE) {
                    this.p0 = i16;
                }
                int i17 = this.B;
                if (i17 != Integer.MIN_VALUE) {
                    this.q0 = i17;
                }
            }
            if (this.u == -1 && this.v == -1 && this.t == -1 && this.s == -1) {
                int i18 = this.g;
                if (i18 != -1) {
                    this.n0 = i18;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                } else {
                    int i19 = this.h;
                    if (i19 != -1) {
                        this.o0 = i19;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                        }
                    }
                }
                int i20 = this.e;
                if (i20 != -1) {
                    this.l0 = i20;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                    return;
                }
                int i21 = this.f;
                if (i21 != -1) {
                    this.m0 = i21;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                }
            }
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = true;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = 0.0f;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = t04.INVALID_ID;
            this.x = t04.INVALID_ID;
            this.y = t04.INVALID_ID;
            this.z = t04.INVALID_ID;
            this.A = t04.INVALID_ID;
            this.B = t04.INVALID_ID;
            this.C = t04.INVALID_ID;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.a0 = false;
            this.b0 = false;
            this.c0 = null;
            this.d0 = 0;
            this.e0 = true;
            this.f0 = true;
            this.g0 = false;
            this.h0 = false;
            this.i0 = false;
            this.j0 = false;
            this.k0 = false;
            this.l0 = -1;
            this.m0 = -1;
            this.n0 = -1;
            this.o0 = -1;
            this.p0 = t04.INVALID_ID;
            this.q0 = t04.INVALID_ID;
            this.r0 = 0.5f;
            this.v0 = new ConstraintWidget();
            this.w0 = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v0a.V0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                int i2 = a.a.get(index);
                switch (i2) {
                    case 1:
                        this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.p);
                        this.p = resourceId;
                        if (resourceId == -1) {
                            this.p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.q);
                        break;
                    case 4:
                        float f = typedArrayObtainStyledAttributes.getFloat(index, this.r) % 360.0f;
                        this.r = f;
                        if (f < 0.0f) {
                            this.r = (360.0f - f) % 360.0f;
                        }
                        break;
                    case 5:
                        this.a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.a);
                        break;
                    case 6:
                        this.b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.b);
                        break;
                    case 7:
                        this.c = typedArrayObtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.e);
                        this.e = resourceId2;
                        if (resourceId2 == -1) {
                            this.e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case lo6.HASACTION_FIELD_NUMBER /* 9 */:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f);
                        this.f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case lo6.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.g);
                        this.g = resourceId4;
                        if (resourceId4 == -1) {
                            this.g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case lo6.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.h);
                        this.h = resourceId5;
                        if (resourceId5 == -1) {
                            this.h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.i);
                        this.i = resourceId6;
                        if (resourceId6 == -1) {
                            this.i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.j);
                        this.j = resourceId7;
                        if (resourceId7 == -1) {
                            this.j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.k);
                        this.k = resourceId8;
                        if (resourceId8 == -1) {
                            this.k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.l);
                        this.l = resourceId9;
                        if (resourceId9 == -1) {
                            this.l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.m);
                        this.m = resourceId10;
                        if (resourceId10 == -1) {
                            this.m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.s);
                        this.s = resourceId11;
                        if (resourceId11 == -1) {
                            this.s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.t);
                        this.t = resourceId12;
                        if (resourceId12 == -1) {
                            this.t = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.u);
                        this.u = resourceId13;
                        if (resourceId13 == -1) {
                            this.u = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.v);
                        this.v = resourceId14;
                        if (resourceId14 == -1) {
                            this.v = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 21:
                        this.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.w);
                        break;
                    case 22:
                        this.x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.x);
                        break;
                    case 23:
                        this.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.y);
                        break;
                    case 24:
                        this.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.z);
                        break;
                    case 25:
                        this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case 26:
                        this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        break;
                    case 27:
                        this.a0 = typedArrayObtainStyledAttributes.getBoolean(index, this.a0);
                        break;
                    case 28:
                        this.b0 = typedArrayObtainStyledAttributes.getBoolean(index, this.b0);
                        break;
                    case 29:
                        this.G = typedArrayObtainStyledAttributes.getFloat(index, this.G);
                        break;
                    case 30:
                        this.H = typedArrayObtainStyledAttributes.getFloat(index, this.H);
                        break;
                    case 31:
                        this.P = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 32:
                        this.Q = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 33:
                        try {
                            this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.R) == -2) {
                                this.R = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.T);
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.T) == -2) {
                                this.T = -2;
                            }
                        }
                        break;
                    case 35:
                        this.V = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.V));
                        this.P = 2;
                        break;
                    case 36:
                        try {
                            this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.S) == -2) {
                                this.S = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.U);
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.U) == -2) {
                                this.U = -2;
                            }
                        }
                        break;
                    case 38:
                        this.W = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.W));
                        this.Q = 2;
                        break;
                    default:
                        switch (i2) {
                            case 44:
                                androidx.constraintlayout.widget.c.J(this, typedArrayObtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.L = typedArrayObtainStyledAttributes.getFloat(index, this.L);
                                break;
                            case 46:
                                this.M = typedArrayObtainStyledAttributes.getFloat(index, this.M);
                                break;
                            case 47:
                                this.N = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.O = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.X = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.X);
                                break;
                            case 50:
                                this.Y = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.Y);
                                break;
                            case 51:
                                this.c0 = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.n);
                                this.n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 53:
                                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.o);
                                this.o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.o = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 54:
                                this.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                break;
                            case 55:
                                this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            default:
                                switch (i2) {
                                    case 64:
                                        androidx.constraintlayout.widget.c.H(this, typedArrayObtainStyledAttributes, index, 0);
                                        this.E = true;
                                        break;
                                    case 65:
                                        androidx.constraintlayout.widget.c.H(this, typedArrayObtainStyledAttributes, index, 1);
                                        this.F = true;
                                        break;
                                    case 66:
                                        this.d0 = typedArrayObtainStyledAttributes.getInt(index, this.d0);
                                        break;
                                    case 67:
                                        this.d = typedArrayObtainStyledAttributes.getBoolean(index, this.d);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            b();
        }

        public b(int i, int i2) {
            super(i, i2);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = true;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = 0.0f;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = t04.INVALID_ID;
            this.x = t04.INVALID_ID;
            this.y = t04.INVALID_ID;
            this.z = t04.INVALID_ID;
            this.A = t04.INVALID_ID;
            this.B = t04.INVALID_ID;
            this.C = t04.INVALID_ID;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.a0 = false;
            this.b0 = false;
            this.c0 = null;
            this.d0 = 0;
            this.e0 = true;
            this.f0 = true;
            this.g0 = false;
            this.h0 = false;
            this.i0 = false;
            this.j0 = false;
            this.k0 = false;
            this.l0 = -1;
            this.m0 = -1;
            this.n0 = -1;
            this.o0 = -1;
            this.p0 = t04.INVALID_ID;
            this.q0 = t04.INVALID_ID;
            this.r0 = 0.5f;
            this.v0 = new ConstraintWidget();
            this.w0 = false;
        }
    }
}
