package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.google.inputmethod.d1a;
import com.google.inputmethod.j15;
import com.google.inputmethod.k7e;
import com.google.inputmethod.t04;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class a0 extends ViewGroup {
    private boolean a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private float g;
    private boolean h;
    private int[] i;
    private int[] j;
    private Drawable k;
    private int l;
    private int m;
    private int n;
    private int o;

    public static class a extends LinearLayout.LayoutParams {
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(int i, int i2) {
            super(i, i2);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public a0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    private void i(int i, int i2) {
        int i3;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        int i4 = 0;
        while (i4 < i) {
            View viewQ = q(i4);
            if (viewQ.getVisibility() != 8) {
                a aVar = (a) viewQ.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).height == -1) {
                    int i5 = ((LinearLayout.LayoutParams) aVar).width;
                    ((LinearLayout.LayoutParams) aVar).width = viewQ.getMeasuredWidth();
                    i3 = i2;
                    measureChildWithMargins(viewQ, i3, 0, iMakeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) aVar).width = i5;
                } else {
                    i3 = i2;
                }
            } else {
                i3 = i2;
            }
            i4++;
            i2 = i3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    private void j(int i, int i2) {
        int i3;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int i4 = 0;
        while (i4 < i) {
            View viewQ = q(i4);
            if (viewQ.getVisibility() != 8) {
                a aVar = (a) viewQ.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).width == -1) {
                    int i5 = ((LinearLayout.LayoutParams) aVar).height;
                    ((LinearLayout.LayoutParams) aVar).height = viewQ.getMeasuredHeight();
                    i3 = i2;
                    measureChildWithMargins(viewQ, iMakeMeasureSpec, 0, i3, 0);
                    ((LinearLayout.LayoutParams) aVar).height = i5;
                } else {
                    i3 = i2;
                }
            } else {
                i3 = i2;
            }
            i4++;
            i2 = i3;
        }
    }

    private void y(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    void e(Canvas canvas) {
        int right;
        int left;
        int i;
        int virtualChildCount = getVirtualChildCount();
        boolean zB = n0.b(this);
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View viewQ = q(i2);
            if (viewQ != null && viewQ.getVisibility() != 8 && r(i2)) {
                a aVar = (a) viewQ.getLayoutParams();
                h(canvas, zB ? viewQ.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (viewQ.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.l);
            }
        }
        if (r(virtualChildCount)) {
            View viewQ2 = q(virtualChildCount - 1);
            if (viewQ2 != null) {
                a aVar2 = (a) viewQ2.getLayoutParams();
                if (zB) {
                    left = viewQ2.getLeft() - ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    i = this.l;
                    right = left - i;
                } else {
                    right = viewQ2.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            } else if (zB) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.l;
                right = left - i;
            }
            h(canvas, right);
        }
    }

    void f(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i = 0; i < virtualChildCount; i++) {
            View viewQ = q(i);
            if (viewQ != null && viewQ.getVisibility() != 8 && r(i)) {
                g(canvas, (viewQ.getTop() - ((LinearLayout.LayoutParams) ((a) viewQ.getLayoutParams())).topMargin) - this.m);
            }
        }
        if (r(virtualChildCount)) {
            View viewQ2 = q(virtualChildCount - 1);
            g(canvas, viewQ2 == null ? (getHeight() - getPaddingBottom()) - this.m : viewQ2.getBottom() + ((LinearLayout.LayoutParams) ((a) viewQ2.getLayoutParams())).bottomMargin);
        }
    }

    void g(Canvas canvas, int i) {
        this.k.setBounds(getPaddingLeft() + this.o, i, (getWidth() - getPaddingRight()) - this.o, this.m + i);
        this.k.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.b;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.c;
        if (this.d == 1 && (i = this.e & 112) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.b;
    }

    public Drawable getDividerDrawable() {
        return this.k;
    }

    public int getDividerPadding() {
        return this.o;
    }

    public int getDividerWidth() {
        return this.l;
    }

    public int getGravity() {
        return this.e;
    }

    public int getOrientation() {
        return this.d;
    }

    public int getShowDividers() {
        return this.n;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.g;
    }

    void h(Canvas canvas, int i) {
        this.k.setBounds(i, getPaddingTop() + this.o, this.l + i, (getHeight() - getPaddingBottom()) - this.o);
        this.k.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i = this.d;
        if (i == 0) {
            return new a(-2, -2);
        }
        if (i == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof a) {
            return new a((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new a((ViewGroup.MarginLayoutParams) layoutParams) : new a(layoutParams);
    }

    int n(View view, int i) {
        return 0;
    }

    int o(View view) {
        return 0;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.k == null) {
            return;
        }
        if (this.d == 1) {
            f(canvas);
        } else {
            e(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.d == 1) {
            t(i, i2, i3, i4);
        } else {
            s(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.d == 1) {
            x(i, i2);
        } else {
            v(i, i2);
        }
    }

    int p(View view) {
        return 0;
    }

    View q(int i) {
        return getChildAt(i);
    }

    protected boolean r(int i) {
        if (i == 0) {
            return (this.n & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.n & 4) != 0;
        }
        if ((this.n & 2) != 0) {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00df  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:47:0x0100  */
    /* JADX WARN: Code duplicated, block: B:48:0x0105  */
    void s(int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int i6;
        char c;
        char c2;
        int i7;
        int iN;
        int i8;
        int baseline;
        int i9;
        int i10;
        int i11;
        int measuredHeight;
        int i12;
        boolean zB = n0.b(this);
        int paddingTop = getPaddingTop();
        int i13 = i4 - i2;
        int paddingBottom = i13 - getPaddingBottom();
        int paddingBottom2 = (i13 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i14 = this.e;
        int i15 = i14 & 112;
        boolean z = this.a;
        int[] iArr = this.i;
        int[] iArr2 = this.j;
        int iB = j15.b(8388615 & i14, getLayoutDirection());
        char c3 = 2;
        char c4 = 1;
        if (iB != 1) {
            paddingLeft = iB != 5 ? getPaddingLeft() : ((getPaddingLeft() + i3) - i) - this.f;
        } else {
            paddingLeft = getPaddingLeft() + (((i3 - i) - this.f) / 2);
        }
        if (zB) {
            i5 = virtualChildCount - 1;
            i6 = -1;
        } else {
            i5 = 0;
            i6 = 1;
        }
        int i16 = 0;
        while (i16 < virtualChildCount) {
            int i17 = i5 + (i6 * i16);
            int i18 = i16;
            View viewQ = q(i17);
            if (viewQ == null) {
                paddingLeft += w(i17);
                iN = i18;
                i7 = paddingTop;
                c = c3;
                c2 = c4;
            } else {
                c = c3;
                c2 = c4;
                if (viewQ.getVisibility() != 8) {
                    int measuredWidth = viewQ.getMeasuredWidth();
                    int measuredHeight2 = viewQ.getMeasuredHeight();
                    a aVar = (a) viewQ.getLayoutParams();
                    int i19 = paddingLeft;
                    if (z) {
                        i8 = measuredHeight2;
                        baseline = ((LinearLayout.LayoutParams) aVar).height != -1 ? viewQ.getBaseline() : -1;
                        i9 = ((LinearLayout.LayoutParams) aVar).gravity;
                        if (i9 < 0) {
                            i9 = i15;
                        }
                        i10 = i9 & 112;
                        i7 = paddingTop;
                        if (i10 != 16) {
                            if (i10 != 48) {
                                i11 = i7 + ((LinearLayout.LayoutParams) aVar).topMargin;
                                if (baseline != -1) {
                                    i11 += iArr[c2] - baseline;
                                }
                            } else if (i10 != 80) {
                                i11 = i7;
                            } else {
                                i11 = (paddingBottom - i8) - ((LinearLayout.LayoutParams) aVar).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight = iArr2[c] - (viewQ.getMeasuredHeight() - baseline);
                                }
                            }
                            if (r(i17)) {
                                i12 = i19 + this.l;
                            } else {
                                i12 = i19;
                            }
                            int i20 = ((LinearLayout.LayoutParams) aVar).leftMargin + i12;
                            y(viewQ, o(viewQ) + i20, i11, measuredWidth, i8);
                            int iP = i20 + ((LinearLayout.LayoutParams) aVar).rightMargin + measuredWidth + p(viewQ);
                            iN = n(viewQ, i17) + i18;
                            paddingLeft = iP;
                        } else {
                            i11 = i7 + ((paddingBottom2 - i8) / 2) + ((LinearLayout.LayoutParams) aVar).topMargin;
                            measuredHeight = ((LinearLayout.LayoutParams) aVar).bottomMargin;
                        }
                        i11 -= measuredHeight;
                        if (r(i17)) {
                            i12 = i19 + this.l;
                        } else {
                            i12 = i19;
                        }
                        int i21 = ((LinearLayout.LayoutParams) aVar).leftMargin + i12;
                        y(viewQ, o(viewQ) + i21, i11, measuredWidth, i8);
                        int iP2 = i21 + ((LinearLayout.LayoutParams) aVar).rightMargin + measuredWidth + p(viewQ);
                        iN = n(viewQ, i17) + i18;
                        paddingLeft = iP2;
                    } else {
                        i8 = measuredHeight2;
                    }
                    i9 = ((LinearLayout.LayoutParams) aVar).gravity;
                    if (i9 < 0) {
                        i9 = i15;
                    }
                    i10 = i9 & 112;
                    i7 = paddingTop;
                    if (i10 != 16) {
                        if (i10 != 48) {
                            i11 = i7 + ((LinearLayout.LayoutParams) aVar).topMargin;
                            if (baseline != -1) {
                                i11 += iArr[c2] - baseline;
                            }
                        } else if (i10 != 80) {
                            i11 = i7;
                        } else {
                            i11 = (paddingBottom - i8) - ((LinearLayout.LayoutParams) aVar).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight = iArr2[c] - (viewQ.getMeasuredHeight() - baseline);
                            }
                        }
                        if (r(i17)) {
                            i12 = i19 + this.l;
                        } else {
                            i12 = i19;
                        }
                        int i22 = ((LinearLayout.LayoutParams) aVar).leftMargin + i12;
                        y(viewQ, o(viewQ) + i22, i11, measuredWidth, i8);
                        int iP3 = i22 + ((LinearLayout.LayoutParams) aVar).rightMargin + measuredWidth + p(viewQ);
                        iN = n(viewQ, i17) + i18;
                        paddingLeft = iP3;
                    } else {
                        i11 = i7 + ((paddingBottom2 - i8) / 2) + ((LinearLayout.LayoutParams) aVar).topMargin;
                        measuredHeight = ((LinearLayout.LayoutParams) aVar).bottomMargin;
                    }
                    i11 -= measuredHeight;
                    if (r(i17)) {
                        i12 = i19 + this.l;
                    } else {
                        i12 = i19;
                    }
                    int i23 = ((LinearLayout.LayoutParams) aVar).leftMargin + i12;
                    y(viewQ, o(viewQ) + i23, i11, measuredWidth, i8);
                    int iP4 = i23 + ((LinearLayout.LayoutParams) aVar).rightMargin + measuredWidth + p(viewQ);
                    iN = n(viewQ, i17) + i18;
                    paddingLeft = iP4;
                } else {
                    i7 = paddingTop;
                    iN = i18;
                }
            }
            i16 = iN + 1;
            c3 = c;
            c4 = c2;
            paddingTop = i7;
        }
    }

    public void setBaselineAligned(boolean z) {
        this.a = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.b = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.k) {
            return;
        }
        this.k = drawable;
        if (drawable != null) {
            this.l = drawable.getIntrinsicWidth();
            this.m = drawable.getIntrinsicHeight();
        } else {
            this.l = 0;
            this.m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.o = i;
    }

    public void setGravity(int i) {
        if (this.e != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.e = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.e;
        if ((8388615 & i3) != i2) {
            this.e = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.h = z;
    }

    public void setOrientation(int i) {
        if (this.d != i) {
            this.d = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.n) {
            requestLayout();
        }
        this.n = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.e;
        if ((i3 & 112) != i2) {
            this.e = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.g = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0099  */
    void t(int i, int i2, int i3, int i4) {
        int paddingTop;
        int i5;
        int i6;
        int i7;
        int paddingLeft = getPaddingLeft();
        int i8 = i3 - i;
        int paddingRight = i8 - getPaddingRight();
        int paddingRight2 = (i8 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i9 = this.e;
        int i10 = i9 & 112;
        int i11 = i9 & 8388615;
        if (i10 != 16) {
            paddingTop = i10 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.f;
        } else {
            paddingTop = getPaddingTop() + (((i4 - i2) - this.f) / 2);
        }
        int iN = 0;
        while (iN < virtualChildCount) {
            View viewQ = q(iN);
            if (viewQ == null) {
                paddingTop += w(iN);
            } else {
                if (viewQ.getVisibility() != 8) {
                    int measuredWidth = viewQ.getMeasuredWidth();
                    int measuredHeight = viewQ.getMeasuredHeight();
                    a aVar = (a) viewQ.getLayoutParams();
                    int i12 = ((LinearLayout.LayoutParams) aVar).gravity;
                    if (i12 < 0) {
                        i12 = i11;
                    }
                    int iB = j15.b(i12, getLayoutDirection()) & 7;
                    if (iB != 1) {
                        if (iB != 5) {
                            i7 = ((LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft;
                        } else {
                            i5 = paddingRight - measuredWidth;
                            i6 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                        }
                        int i13 = i7;
                        if (r(iN)) {
                            paddingTop += this.m;
                        }
                        int i14 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                        y(viewQ, i13, i14 + o(viewQ), measuredWidth, measuredHeight);
                        paddingTop = i14 + measuredHeight + ((LinearLayout.LayoutParams) aVar).bottomMargin + p(viewQ);
                        iN += n(viewQ, iN);
                    } else {
                        i5 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) aVar).leftMargin;
                        i6 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                    }
                    i7 = i5 - i6;
                    int i15 = i7;
                    if (r(iN)) {
                        paddingTop += this.m;
                    }
                    int i16 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                    y(viewQ, i15, i16 + o(viewQ), measuredWidth, measuredHeight);
                    paddingTop = i16 + measuredHeight + ((LinearLayout.LayoutParams) aVar).bottomMargin + p(viewQ);
                    iN += n(viewQ, iN);
                }
                iN++;
            }
            iN++;
        }
    }

    void u(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* JADX WARN: Code duplicated, block: B:203:0x0461  */
    void v(int i, int i2) {
        int i3;
        int i4;
        float f;
        int i5;
        int i6;
        int i7;
        int i8;
        int iMax;
        int i9;
        int baseline;
        int i10;
        int i11;
        byte b;
        int i12;
        int i13;
        int i14;
        boolean z;
        View view;
        boolean z2;
        int baseline2;
        this.f = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (this.i == null || this.j == null) {
            this.i = new int[4];
            this.j = new int[4];
        }
        int[] iArr = this.i;
        int[] iArr2 = this.j;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z3 = this.a;
        boolean z4 = this.h;
        int i15 = 1073741824;
        boolean z5 = mode == 1073741824;
        boolean z6 = z4;
        int iN = 0;
        int i16 = 0;
        int iMax2 = 0;
        boolean z7 = false;
        int iCombineMeasuredStates = 0;
        boolean z8 = false;
        boolean z9 = true;
        float f2 = 0.0f;
        int iMax3 = 0;
        int iMax4 = 0;
        while (true) {
            i3 = i16;
            if (iN >= virtualChildCount) {
                break;
            }
            boolean z10 = z3;
            View viewQ = q(iN);
            if (viewQ == null) {
                this.f += w(iN);
            } else {
                if (viewQ.getVisibility() == 8) {
                    iN += n(viewQ, iN);
                } else {
                    if (r(iN)) {
                        this.f += this.l;
                    }
                    a aVar = (a) viewQ.getLayoutParams();
                    float f3 = ((LinearLayout.LayoutParams) aVar).weight;
                    float f4 = f2 + f3;
                    if (mode == i15 && ((LinearLayout.LayoutParams) aVar).width == 0 && f3 > 0.0f) {
                        if (z5) {
                            this.f += ((LinearLayout.LayoutParams) aVar).leftMargin + ((LinearLayout.LayoutParams) aVar).rightMargin;
                        } else {
                            int i17 = this.f;
                            this.f = Math.max(i17, ((LinearLayout.LayoutParams) aVar).leftMargin + i17 + ((LinearLayout.LayoutParams) aVar).rightMargin);
                        }
                        if (z10) {
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                            viewQ.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        } else {
                            z7 = true;
                        }
                        i13 = i3;
                        i14 = 1073741824;
                        z = z6;
                        view = viewQ;
                    } else {
                        if (((LinearLayout.LayoutParams) aVar).width != 0 || f3 <= 0.0f) {
                            b = -2;
                            i12 = t04.INVALID_ID;
                        } else {
                            b = -2;
                            ((LinearLayout.LayoutParams) aVar).width = -2;
                            i12 = 0;
                        }
                        virtualChildCount = virtualChildCount;
                        mode = mode;
                        iArr = iArr;
                        i13 = i3;
                        i14 = 1073741824;
                        z = z6;
                        iArr2 = iArr2;
                        int i18 = i12;
                        u(viewQ, iN, i, f4 == 0.0f ? this.f : 0, i2, 0);
                        view = viewQ;
                        if (i18 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) aVar).width = i18;
                        }
                        int measuredWidth = view.getMeasuredWidth();
                        if (z5) {
                            this.f += ((LinearLayout.LayoutParams) aVar).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) aVar).rightMargin + p(view);
                        } else {
                            int i19 = this.f;
                            this.f = Math.max(i19, i19 + measuredWidth + ((LinearLayout.LayoutParams) aVar).leftMargin + ((LinearLayout.LayoutParams) aVar).rightMargin + p(view));
                        }
                        if (z) {
                            iMax2 = Math.max(measuredWidth, iMax2);
                        }
                    }
                    if (mode2 == i14 || ((LinearLayout.LayoutParams) aVar).height != -1) {
                        z2 = false;
                    } else {
                        z2 = true;
                        z8 = true;
                    }
                    int i20 = ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin;
                    int measuredHeight = view.getMeasuredHeight() + i20;
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    if (z10 && (baseline2 = view.getBaseline()) != -1) {
                        int i21 = ((LinearLayout.LayoutParams) aVar).gravity;
                        if (i21 < 0) {
                            i21 = this.e;
                        }
                        int i22 = (((i21 & 112) >> 4) & (-2)) >> 1;
                        iArr[i22] = Math.max(iArr[i22], baseline2);
                        iArr2[i22] = Math.max(iArr2[i22], measuredHeight - baseline2);
                    }
                    int iMax5 = Math.max(i13, measuredHeight);
                    z9 = z9 && ((LinearLayout.LayoutParams) aVar).height == -1;
                    if (((LinearLayout.LayoutParams) aVar).weight > 0.0f) {
                        if (!z2) {
                            i20 = measuredHeight;
                        }
                        iMax4 = Math.max(iMax4, i20);
                    } else {
                        if (z2 == 0) {
                            i20 = measuredHeight;
                        }
                        iMax3 = Math.max(iMax3, i20);
                    }
                    iN += n(view, iN);
                    i16 = iMax5;
                    f2 = f4;
                }
                iN++;
                z6 = z;
                iArr2 = iArr2;
                z3 = z10;
                mode = mode;
                iArr = iArr;
                virtualChildCount = virtualChildCount;
                i15 = 1073741824;
            }
            virtualChildCount = virtualChildCount;
            mode = mode;
            iArr = iArr;
            iArr2 = iArr2;
            i16 = i3;
            z = z6;
            iN++;
            z6 = z;
            iArr2 = iArr2;
            z3 = z10;
            mode = mode;
            iArr = iArr;
            virtualChildCount = virtualChildCount;
            i15 = 1073741824;
        }
        boolean z11 = z3;
        int i23 = virtualChildCount;
        int i24 = mode;
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        int i25 = iCombineMeasuredStates;
        boolean z12 = z6;
        if (this.f > 0) {
            i4 = i23;
            if (r(i4)) {
                this.f += this.l;
            }
        } else {
            i4 = i23;
        }
        int i26 = iArr3[1];
        int iMax6 = (i26 == -1 && iArr3[0] == -1 && iArr3[2] == -1 && iArr3[3] == -1) ? i3 : Math.max(i3, Math.max(iArr3[3], Math.max(iArr3[0], Math.max(i26, iArr3[2]))) + Math.max(iArr4[3], Math.max(iArr4[0], Math.max(iArr4[1], iArr4[2]))));
        if (z12) {
            i5 = i24;
            if (i5 == Integer.MIN_VALUE || i5 == 0) {
                this.f = 0;
                int iN2 = 0;
                while (iN2 < i4) {
                    View viewQ2 = q(iN2);
                    if (viewQ2 == null) {
                        this.f += w(iN2);
                    } else {
                        if (viewQ2.getVisibility() == 8) {
                            iN2 += n(viewQ2, iN2);
                        } else {
                            a aVar2 = (a) viewQ2.getLayoutParams();
                            if (z5) {
                                this.f += ((LinearLayout.LayoutParams) aVar2).leftMargin + iMax2 + ((LinearLayout.LayoutParams) aVar2).rightMargin + p(viewQ2);
                            } else {
                                f2 = f2;
                                int i27 = this.f;
                                this.f = Math.max(i27, i27 + iMax2 + ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin + p(viewQ2));
                            }
                        }
                        iN2++;
                        f2 = f2;
                        iMax6 = iMax6;
                    }
                    iN2++;
                    f2 = f2;
                    iMax6 = iMax6;
                }
            }
            f = f2;
        } else {
            f = f2;
            i5 = i24;
        }
        int iMax7 = iMax6;
        int paddingLeft = this.f + getPaddingLeft() + getPaddingRight();
        this.f = paddingLeft;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, 0);
        int i28 = (16777215 & iResolveSizeAndState) - this.f;
        if (z7 || (i28 != 0 && f > 0.0f)) {
            float f5 = this.g;
            if (f5 > 0.0f) {
                f = f5;
            }
            iArr3[3] = -1;
            iArr3[2] = -1;
            iArr3[1] = -1;
            iArr3[0] = -1;
            iArr4[3] = -1;
            iArr4[2] = -1;
            iArr4[1] = -1;
            iArr4[0] = -1;
            this.f = 0;
            int iCombineMeasuredStates2 = i25;
            int iMax8 = -1;
            int i29 = 0;
            while (i29 < i4) {
                View viewQ3 = q(i29);
                if (viewQ3 == null || viewQ3.getVisibility() == 8) {
                    iResolveSizeAndState = iResolveSizeAndState;
                } else {
                    a aVar3 = (a) viewQ3.getLayoutParams();
                    float f6 = ((LinearLayout.LayoutParams) aVar3).weight;
                    if (f6 > 0.0f) {
                        int i30 = (int) ((i28 * f6) / f);
                        f -= f6;
                        i28 -= i30;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom() + ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin, ((LinearLayout.LayoutParams) aVar3).height);
                        if (((LinearLayout.LayoutParams) aVar3).width == 0) {
                            i11 = 1073741824;
                            if (i5 == 1073741824) {
                                if (i30 <= 0) {
                                    i30 = 0;
                                }
                                viewQ3.measure(View.MeasureSpec.makeMeasureSpec(i30, 1073741824), childMeasureSpec);
                            }
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, viewQ3.getMeasuredState() & (-16777216));
                        } else {
                            i11 = 1073741824;
                        }
                        int measuredWidth2 = viewQ3.getMeasuredWidth() + i30;
                        if (measuredWidth2 < 0) {
                            measuredWidth2 = 0;
                        }
                        viewQ3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i11), childMeasureSpec);
                        iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, viewQ3.getMeasuredState() & (-16777216));
                    }
                    if (z5) {
                        this.f += viewQ3.getMeasuredWidth() + ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin + p(viewQ3);
                    } else {
                        int i31 = this.f;
                        this.f = Math.max(i31, viewQ3.getMeasuredWidth() + i31 + ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin + p(viewQ3));
                    }
                    boolean z13 = mode2 != 1073741824 && ((LinearLayout.LayoutParams) aVar3).height == -1;
                    int i32 = ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin;
                    int measuredHeight2 = viewQ3.getMeasuredHeight() + i32;
                    iMax8 = Math.max(iMax8, measuredHeight2);
                    if (!z13) {
                        i32 = measuredHeight2;
                    }
                    int iMax9 = Math.max(iMax3, i32);
                    if (z9) {
                        i9 = -1;
                        boolean z14 = ((LinearLayout.LayoutParams) aVar3).height == -1;
                        if (z11 && (baseline = viewQ3.getBaseline()) != i9) {
                            i10 = ((LinearLayout.LayoutParams) aVar3).gravity;
                            if (i10 < 0) {
                                i10 = this.e;
                            }
                            int i33 = (((i10 & 112) >> 4) & (-2)) >> 1;
                            iArr3[i33] = Math.max(iArr3[i33], baseline);
                            iArr4[i33] = Math.max(iArr4[i33], measuredHeight2 - baseline);
                        }
                        iMax3 = iMax9;
                        z9 = z14;
                    } else {
                        i9 = -1;
                    }
                    if (z11) {
                        i10 = ((LinearLayout.LayoutParams) aVar3).gravity;
                        if (i10 < 0) {
                            i10 = this.e;
                        }
                        int i34 = (((i10 & 112) >> 4) & (-2)) >> 1;
                        iArr3[i34] = Math.max(iArr3[i34], baseline);
                        iArr4[i34] = Math.max(iArr4[i34], measuredHeight2 - baseline);
                    }
                    iMax3 = iMax9;
                    z9 = z14;
                }
                i29++;
                iResolveSizeAndState = iResolveSizeAndState;
            }
            i6 = iResolveSizeAndState;
            i7 = -16777216;
            this.f += getPaddingLeft() + getPaddingRight();
            int i35 = iArr3[1];
            iMax7 = (i35 == -1 && iArr3[0] == -1 && iArr3[2] == -1 && iArr3[3] == -1) ? iMax8 : Math.max(iMax8, Math.max(iArr3[3], Math.max(iArr3[0], Math.max(i35, iArr3[2]))) + Math.max(iArr4[3], Math.max(iArr4[0], Math.max(iArr4[1], iArr4[2]))));
            i8 = iCombineMeasuredStates2;
            iMax = iMax3;
        } else {
            iMax = Math.max(iMax3, iMax4);
            if (z12 && i5 != 1073741824) {
                for (int i36 = 0; i36 < i4; i36++) {
                    View viewQ4 = q(i36);
                    if (viewQ4 != null && viewQ4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) viewQ4.getLayoutParams())).weight > 0.0f) {
                        viewQ4.measure(View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824), View.MeasureSpec.makeMeasureSpec(viewQ4.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i6 = iResolveSizeAndState;
            i8 = i25;
            i7 = -16777216;
        }
        if (z9 || mode2 == 1073741824) {
            iMax = iMax7;
        }
        setMeasuredDimension(i6 | (i8 & i7), View.resolveSizeAndState(Math.max(iMax + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, i8 << 16));
        if (z8) {
            i(i4, i);
        }
    }

    int w(int i) {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0156 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0159  */
    /* JADX WARN: Code duplicated, block: B:68:0x0160 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0163  */
    void x(int i, int i2) {
        int i3;
        int iMax;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        View view;
        boolean z;
        int iMax2;
        boolean z2;
        int iMax3;
        int i13;
        this.f = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i14 = this.b;
        boolean z3 = this.h;
        int iN = 0;
        int i15 = 0;
        int iMax4 = 0;
        int i16 = 0;
        int i17 = 0;
        int iMax5 = 0;
        boolean z4 = false;
        boolean z5 = false;
        float f = 0.0f;
        boolean z6 = true;
        while (true) {
            int i18 = 8;
            if (iN >= virtualChildCount) {
                float f2 = f;
                int i19 = i15;
                int i20 = virtualChildCount;
                int i21 = mode2;
                boolean z7 = z3;
                int i22 = iMax4;
                int iMax6 = i16;
                int iCombineMeasuredStates = i17;
                if (this.f > 0) {
                    i3 = i20;
                    if (r(i3)) {
                        this.f += this.m;
                    }
                } else {
                    i3 = i20;
                }
                int i23 = i21;
                if (z7 && (i23 == Integer.MIN_VALUE || i23 == 0)) {
                    this.f = 0;
                    int iN2 = 0;
                    while (iN2 < i3) {
                        View viewQ = q(iN2);
                        if (viewQ == null) {
                            this.f += w(iN2);
                        } else if (viewQ.getVisibility() == i18) {
                            iN2 += n(viewQ, iN2);
                        } else {
                            a aVar = (a) viewQ.getLayoutParams();
                            int i24 = this.f;
                            this.f = Math.max(i24, i24 + i22 + ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin + p(viewQ));
                        }
                        iN2++;
                        i18 = 8;
                    }
                }
                int paddingTop = this.f + getPaddingTop() + getPaddingBottom();
                this.f = paddingTop;
                int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, 0);
                int i25 = (16777215 & iResolveSizeAndState) - this.f;
                if (z4 || (i25 != 0 && f2 > 0.0f)) {
                    float f3 = this.g;
                    if (f3 <= 0.0f) {
                        f3 = f2;
                    }
                    this.f = 0;
                    float f4 = f3;
                    int i26 = i25;
                    int i27 = 0;
                    while (i27 < i3) {
                        View viewQ2 = q(i27);
                        if (viewQ2.getVisibility() == 8) {
                            i23 = i23;
                            i27 = i27;
                        } else {
                            a aVar2 = (a) viewQ2.getLayoutParams();
                            float f5 = ((LinearLayout.LayoutParams) aVar2).weight;
                            if (f5 > 0.0f) {
                                int i28 = (int) ((i26 * f5) / f4);
                                f4 -= f5;
                                i26 -= i28;
                                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin, ((LinearLayout.LayoutParams) aVar2).width);
                                if (((LinearLayout.LayoutParams) aVar2).height == 0) {
                                    i5 = 1073741824;
                                    if (i23 == 1073741824) {
                                        viewQ2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i28 > 0 ? i28 : 0, 1073741824));
                                    }
                                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewQ2.getMeasuredState() & (-256));
                                } else {
                                    i5 = 1073741824;
                                }
                                int measuredHeight = viewQ2.getMeasuredHeight() + i28;
                                if (measuredHeight < 0) {
                                    measuredHeight = 0;
                                }
                                viewQ2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, i5));
                                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewQ2.getMeasuredState() & (-256));
                            } else {
                                i23 = i23;
                            }
                            int i29 = ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                            int measuredWidth = viewQ2.getMeasuredWidth() + i29;
                            iMax6 = Math.max(iMax6, measuredWidth);
                            if (mode != 1073741824) {
                                i4 = -1;
                                if (((LinearLayout.LayoutParams) aVar2).width == -1) {
                                    measuredWidth = i29;
                                }
                            } else {
                                i4 = -1;
                            }
                            int iMax7 = Math.max(iMax5, measuredWidth);
                            boolean z8 = z6 && ((LinearLayout.LayoutParams) aVar2).width == i4;
                            int i30 = this.f;
                            this.f = Math.max(i30, i30 + viewQ2.getMeasuredHeight() + ((LinearLayout.LayoutParams) aVar2).topMargin + ((LinearLayout.LayoutParams) aVar2).bottomMargin + p(viewQ2));
                            iMax5 = iMax7;
                            z6 = z8;
                        }
                        i27++;
                        i23 = i23;
                    }
                    this.f += getPaddingTop() + getPaddingBottom();
                    iMax = iMax5;
                } else {
                    iMax = Math.max(iMax5, i19);
                    if (z7 && i23 != 1073741824) {
                        for (int i31 = 0; i31 < i3; i31++) {
                            View viewQ3 = q(i31);
                            if (viewQ3 != null && viewQ3.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) viewQ3.getLayoutParams())).weight > 0.0f) {
                                viewQ3.measure(View.MeasureSpec.makeMeasureSpec(viewQ3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i22, 1073741824));
                            }
                        }
                    }
                }
                if (!z6 && mode != 1073741824) {
                    iMax6 = iMax;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax6 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, iCombineMeasuredStates), iResolveSizeAndState);
                if (z5) {
                    j(i3, i2);
                    return;
                }
                return;
            }
            float f6 = f;
            View viewQ4 = q(iN);
            if (viewQ4 == null) {
                this.f += w(iN);
            } else {
                if (viewQ4.getVisibility() == 8) {
                    iN += n(viewQ4, iN);
                } else {
                    if (r(iN)) {
                        this.f += this.m;
                    }
                    a aVar3 = (a) viewQ4.getLayoutParams();
                    float f7 = ((LinearLayout.LayoutParams) aVar3).weight;
                    float f8 = f6 + f7;
                    if (mode2 == 1073741824 && ((LinearLayout.LayoutParams) aVar3).height == 0 && f7 > 0.0f) {
                        int i32 = this.f;
                        this.f = Math.max(i32, ((LinearLayout.LayoutParams) aVar3).topMargin + i32 + ((LinearLayout.LayoutParams) aVar3).bottomMargin);
                        iMax2 = i15;
                        i9 = virtualChildCount;
                        i10 = mode2;
                        z4 = true;
                        i12 = i16;
                        i11 = i17;
                        z = z3;
                    } else {
                        if (((LinearLayout.LayoutParams) aVar3).height != 0 || f7 <= 0.0f) {
                            i6 = t04.INVALID_ID;
                        } else {
                            ((LinearLayout.LayoutParams) aVar3).height = -2;
                            i6 = 0;
                        }
                        if (f8 == 0.0f) {
                            int i33 = i17;
                            i8 = this.f;
                            i7 = i33;
                        } else {
                            i7 = i17;
                            i8 = 0;
                        }
                        int i34 = iMax4;
                        i9 = virtualChildCount;
                        i10 = mode2;
                        i11 = i7;
                        i12 = i16;
                        view = viewQ4;
                        z = z3;
                        iMax2 = i15;
                        u(view, iN, i, 0, i2, i8);
                        if (i6 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) aVar3).height = i6;
                        }
                        int measuredHeight2 = view.getMeasuredHeight();
                        int i35 = this.f;
                        this.f = Math.max(i35, i35 + measuredHeight2 + ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin + p(view));
                        iMax4 = z ? Math.max(measuredHeight2, i34) : i34;
                    }
                    if (i14 >= 0 && i14 == iN + 1) {
                        view = viewQ4;
                        this.c = this.f;
                    }
                    if (iN < i14 && ((LinearLayout.LayoutParams) aVar3).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (mode == 1073741824 || ((LinearLayout.LayoutParams) aVar3).width != -1) {
                        z2 = false;
                    } else {
                        z2 = true;
                        z5 = true;
                    }
                    int i36 = ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin;
                    int measuredWidth2 = view.getMeasuredWidth() + i36;
                    iMax3 = Math.max(i12, measuredWidth2);
                    int i37 = iMax4;
                    int iCombineMeasuredStates2 = View.combineMeasuredStates(i11, view.getMeasuredState());
                    if (z6) {
                        i13 = iCombineMeasuredStates2;
                        z6 = ((LinearLayout.LayoutParams) aVar3).width == -1;
                        if (((LinearLayout.LayoutParams) aVar3).weight > 0.0f) {
                            if (!z2) {
                                i36 = measuredWidth2;
                            }
                            iMax2 = Math.max(iMax2, i36);
                        } else {
                            if (!z2) {
                                i36 = measuredWidth2;
                            }
                            iMax5 = Math.max(iMax5, i36);
                        }
                        iN += n(view, iN);
                        f = f8;
                        iMax4 = i37;
                        i17 = i13;
                    } else {
                        i13 = iCombineMeasuredStates2;
                    }
                    if (((LinearLayout.LayoutParams) aVar3).weight > 0.0f) {
                        if (!z2) {
                            i36 = measuredWidth2;
                        }
                        iMax2 = Math.max(iMax2, i36);
                    } else {
                        if (!z2) {
                            i36 = measuredWidth2;
                        }
                        iMax5 = Math.max(iMax5, i36);
                    }
                    iN += n(view, iN);
                    f = f8;
                    iMax4 = i37;
                    i17 = i13;
                }
                iN++;
                i16 = iMax3;
                i15 = iMax2;
                z3 = z;
                mode2 = i10;
                virtualChildCount = i9;
            }
            iMax2 = i15;
            i9 = virtualChildCount;
            i10 = mode2;
            z = z3;
            f = f6;
            iMax3 = i16;
            iN++;
            i16 = iMax3;
            i15 = iMax2;
            z3 = z;
            mode2 = i10;
            virtualChildCount = i9;
        }
    }

    public a0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = true;
        this.b = -1;
        this.c = 0;
        this.e = 8388659;
        k0 k0VarV = k0.v(context, attributeSet, d1a.a1, i, 0);
        k7e.j0(this, context, d1a.a1, attributeSet, k0VarV.r(), i, 0);
        int iK = k0VarV.k(d1a.c1, -1);
        if (iK >= 0) {
            setOrientation(iK);
        }
        int iK2 = k0VarV.k(d1a.b1, -1);
        if (iK2 >= 0) {
            setGravity(iK2);
        }
        boolean zA = k0VarV.a(d1a.d1, true);
        if (!zA) {
            setBaselineAligned(zA);
        }
        this.g = k0VarV.i(d1a.f1, -1.0f);
        this.b = k0VarV.k(d1a.e1, -1);
        this.h = k0VarV.a(d1a.i1, false);
        setDividerDrawable(k0VarV.g(d1a.g1));
        this.n = k0VarV.k(d1a.j1, 0);
        this.o = k0VarV.f(d1a.h1, 0);
        k0VarV.x();
    }
}
