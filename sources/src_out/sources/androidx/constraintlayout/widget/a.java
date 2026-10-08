package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.google.inputmethod.az9;
import com.google.inputmethod.fc5;
import com.google.inputmethod.gc5;
import com.google.inputmethod.v0a;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public abstract class a extends View {
    protected int[] a;
    protected int b;
    protected Context c;
    protected fc5 d;
    protected boolean e;
    protected String f;
    protected String g;
    private View[] h;
    protected HashMap<Integer, String> i;

    public a(Context context) {
        super(context);
        this.a = new int[32];
        this.e = false;
        this.h = null;
        this.i = new HashMap<>();
        this.c = context;
        o(null);
    }

    private void e(String str) {
        String strTrim;
        int iM;
        if (str == null || str.length() == 0 || this.c == null || (iM = m((strTrim = str.trim()))) == 0) {
            return;
        }
        this.i.put(Integer.valueOf(iM), strTrim);
        f(iM);
    }

    private void f(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.b + 1;
        int[] iArr = this.a;
        if (i2 > iArr.length) {
            this.a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.a;
        int i3 = this.b;
        iArr2[i3] = i;
        this.b = i3 + 1;
    }

    private void g(String str) {
        if (str == null || str.length() == 0 || this.c == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.b) && strTrim.equals(((ConstraintLayout.b) layoutParams).c0) && childAt.getId() != -1) {
                f(childAt.getId());
            }
        }
    }

    private int[] k(String str) {
        String[] strArrSplit = str.split(",");
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        for (String str2 : strArrSplit) {
            int iM = m(str2.trim());
            if (iM != 0) {
                iArr[i] = iM;
                i++;
            }
        }
        return i != strArrSplit.length ? Arrays.copyOf(iArr, i) : iArr;
    }

    private int l(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str == null || constraintLayout == null || (resources = this.c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    resourceEntryName = null;
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private int m(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int iL = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object objK = constraintLayout.k(0, str);
            if (objK instanceof Integer) {
                iL = ((Integer) objK).intValue();
            }
        }
        if (iL == 0 && constraintLayout != null) {
            iL = l(constraintLayout, str);
        }
        if (iL == 0) {
            try {
                iL = az9.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return iL == 0 ? this.c.getResources().getIdentifier(str, "id", this.c.getPackageName()) : iL;
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.a, this.b);
    }

    protected void h() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        i((ConstraintLayout) parent);
    }

    protected void i(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.b; i++) {
            View viewM = constraintLayout.m(this.a[i]);
            if (viewM != null) {
                viewM.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewM.setTranslationZ(viewM.getTranslationZ() + elevation);
                }
            }
        }
    }

    protected void j(ConstraintLayout constraintLayout) {
    }

    protected View[] n(ConstraintLayout constraintLayout) {
        View[] viewArr = this.h;
        if (viewArr == null || viewArr.length != this.b) {
            this.h = new View[this.b];
        }
        for (int i = 0; i < this.b; i++) {
            this.h[i] = constraintLayout.m(this.a[i]);
        }
        return this.h;
    }

    protected void o(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, v0a.V0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == v0a.o1) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f = string;
                    setIds(string);
                } else if (index == v0a.p1) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.g = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.g;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.e) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void p(c.a aVar, gc5 gc5Var, ConstraintLayout.b bVar, SparseArray<ConstraintWidget> sparseArray) {
        c.b bVar2 = aVar.e;
        int[] iArr = bVar2.k0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = bVar2.l0;
            if (str != null) {
                if (str.length() > 0) {
                    c.b bVar3 = aVar.e;
                    bVar3.k0 = k(bVar3.l0);
                } else {
                    aVar.e.k0 = null;
                }
            }
        }
        if (gc5Var == null) {
            return;
        }
        gc5Var.b();
        if (aVar.e.k0 == null) {
            return;
        }
        int i = 0;
        while (true) {
            int[] iArr2 = aVar.e.k0;
            if (i >= iArr2.length) {
                return;
            }
            ConstraintWidget constraintWidget = sparseArray.get(iArr2[i]);
            if (constraintWidget != null) {
                gc5Var.a(constraintWidget);
            }
            i++;
        }
    }

    public void q(ConstraintWidget constraintWidget, boolean z) {
    }

    public void r(ConstraintLayout constraintLayout) {
    }

    public void s(ConstraintLayout constraintLayout) {
    }

    protected void setIds(String str) {
        this.f = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                e(str.substring(i));
                return;
            } else {
                e(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    protected void setReferenceTags(String str) {
        this.g = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                g(str.substring(i));
                return;
            } else {
                g(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f = null;
        this.b = 0;
        for (int i : iArr) {
            f(i);
        }
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f == null) {
            f(i);
        }
    }

    public void t(ConstraintLayout constraintLayout) {
    }

    public void u(androidx.constraintlayout.core.widgets.d dVar, fc5 fc5Var, SparseArray<ConstraintWidget> sparseArray) {
        fc5Var.b();
        for (int i = 0; i < this.b; i++) {
            fc5Var.a(sparseArray.get(this.a[i]));
        }
    }

    public void v(ConstraintLayout constraintLayout) {
        String str;
        int iL;
        if (isInEditMode()) {
            setIds(this.f);
        }
        fc5 fc5Var = this.d;
        if (fc5Var == null) {
            return;
        }
        fc5Var.b();
        for (int i = 0; i < this.b; i++) {
            int i2 = this.a[i];
            View viewM = constraintLayout.m(i2);
            if (viewM == null && (iL = l(constraintLayout, (str = this.i.get(Integer.valueOf(i2))))) != 0) {
                this.a[i] = iL;
                this.i.put(Integer.valueOf(iL), str);
                viewM = constraintLayout.m(iL);
            }
            if (viewM != null) {
                this.d.a(constraintLayout.n(viewM));
            }
        }
        this.d.c(constraintLayout.c);
    }

    public void w() {
        if (this.d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).v0 = (ConstraintWidget) this.d;
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new int[32];
        this.e = false;
        this.h = null;
        this.i = new HashMap<>();
        this.c = context;
        o(attributeSet);
    }
}
