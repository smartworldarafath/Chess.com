package com.google.inputmethod;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.compose.p001foundation.interaction.a;
import com.google.android.sh7;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 02\u00020\u0001:\u00014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"JK\u0010\u0016\u001a\u00020\b2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\r2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\b0,¢\u0006\u0004\b\u0016\u0010.J\r\u0010/\u001a\u00020\b¢\u0006\u0004\b/\u0010\u001eJ-\u00100\u001a\u00020\b2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\r2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020\b¢\u0006\u0004\b2\u0010\u001eR\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00107R\u0018\u0010:\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u00109R\u0018\u0010=\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010<R\u001e\u0010-\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010>¨\u0006?"}, d2 = {"Lcom/google/android/toa;", "Landroid/view/View;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "bounded", "", "c", "(Z)V", "pressed", "setRippleState", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "refreshDrawableState", "()V", "Landroid/graphics/drawable/Drawable;", "who", "invalidateDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Landroidx/compose/foundation/interaction/a$b;", "interaction", "Lcom/google/android/tsb;", "size", "radius", "Lcom/google/android/ei1;", "color", "", "alpha", "Lkotlin/Function0;", "onInvalidateRipple", "(Landroidx/compose/foundation/interaction/a$b;ZJIJFLkotlin/jvm/functions/Function0;)V", "e", "f", "(JIJF)V", "d", "Lcom/google/android/mtd;", "a", "Lcom/google/android/mtd;", "ripple", "Ljava/lang/Boolean;", "", "Ljava/lang/Long;", "lastRippleStateChangeTimeMillis", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "resetRippleRunnable", "Lkotlin/jvm/functions/Function0;", "material-ripple"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class toa extends View {
    public static final int g = 8;
    private static final int[] h = {R.attr.state_pressed, R.attr.state_enabled};
    private static final int[] i = new int[0];

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private mtd ripple;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private Boolean bounded;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Long lastRippleStateChangeTimeMillis;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Runnable resetRippleRunnable;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private Function0<Unit> onInvalidateRipple;

    public toa(Context context) {
        super(context);
    }

    private final void c(boolean bounded) {
        mtd mtdVar = new mtd(bounded);
        setBackground(mtdVar);
        this.ripple = mtdVar;
    }

    private final void setRippleState(boolean pressed) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.resetRippleRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.lastRippleStateChangeTimeMillis;
        long jLongValue = jCurrentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (pressed || jLongValue >= 5) {
            int[] iArr = pressed ? h : i;
            mtd mtdVar = this.ripple;
            if (mtdVar != null) {
                mtdVar.setState(iArr);
            }
        } else {
            Runnable runnable2 = new Runnable() { // from class: com.google.android.soa
                @Override // java.lang.Runnable
                public final void run() {
                    toa.setRippleState$lambda$1(this.a);
                }
            };
            this.resetRippleRunnable = runnable2;
            postDelayed(runnable2, 50L);
        }
        this.lastRippleStateChangeTimeMillis = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$1(toa toaVar) {
        mtd mtdVar = toaVar.ripple;
        if (mtdVar != null) {
            mtdVar.setState(i);
        }
        toaVar.resetRippleRunnable = null;
    }

    public final void b(a.b interaction, boolean bounded, long size, int radius, long color, float alpha, Function0<Unit> onInvalidateRipple) {
        if (this.ripple == null || !Intrinsics.e(Boolean.valueOf(bounded), this.bounded)) {
            c(bounded);
            this.bounded = Boolean.valueOf(bounded);
        }
        mtd mtdVar = this.ripple;
        Intrinsics.g(mtdVar);
        this.onInvalidateRipple = onInvalidateRipple;
        f(size, radius, color, alpha);
        if (bounded) {
            mtdVar.setHotspot(rn8.m(interaction.getPressPosition()), rn8.n(interaction.getPressPosition()));
        } else {
            mtdVar.setHotspot(mtdVar.getBounds().centerX(), mtdVar.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void d() {
        this.onInvalidateRipple = null;
        Runnable runnable = this.resetRippleRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.resetRippleRunnable;
            Intrinsics.g(runnable2);
            runnable2.run();
        } else {
            mtd mtdVar = this.ripple;
            if (mtdVar != null) {
                mtdVar.setState(i);
            }
        }
        mtd mtdVar2 = this.ripple;
        if (mtdVar2 == null) {
            return;
        }
        mtdVar2.setVisible(false, false);
        unscheduleDrawable(mtdVar2);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            d();
        }
    }

    public final void e() {
        setRippleState(false);
    }

    public final void f(long size, int radius, long color, float alpha) {
        mtd mtdVar = this.ripple;
        if (mtdVar == null) {
            return;
        }
        if (mtdVar.getRadius() != radius) {
            mtdVar.setRadius(radius);
        }
        mtdVar.b(color, alpha);
        Rect rect = new Rect(0, 0, sh7.d(tsb.l(size)), sh7.d(tsb.i(size)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        mtdVar.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable who) {
        Function0<Unit> function0 = this.onInvalidateRipple;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void refreshDrawableState() {
    }
}
