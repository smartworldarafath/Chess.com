package com.google.inputmethod;

import android.os.Build;
import android.view.ViewConfiguration;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\nR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011¨\u0006\u0019"}, d2 = {"Lcom/google/android/mp;", "Lcom/google/android/p7e;", "Landroid/view/ViewConfiguration;", "viewConfiguration", "<init>", "(Landroid/view/ViewConfiguration;)V", "a", "Landroid/view/ViewConfiguration;", "", "f", "()J", "longPressTimeoutMillis", "e", "doubleTapTimeoutMillis", "doubleTapMinTimeMillis", "", "c", "()F", "touchSlop", "b", "handwritingSlop", "h", "maximumFlingVelocity", "d", "handwritingGestureLineMargin", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class mp implements p7e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ViewConfiguration viewConfiguration;

    public mp(ViewConfiguration viewConfiguration) {
        this.viewConfiguration = viewConfiguration;
    }

    @Override // com.google.inputmethod.p7e
    public long a() {
        return 40L;
    }

    @Override // com.google.inputmethod.p7e
    public float b() {
        return Build.VERSION.SDK_INT >= 34 ? pp.a.b(this.viewConfiguration) : super.b();
    }

    @Override // com.google.inputmethod.p7e
    public float c() {
        return this.viewConfiguration.getScaledTouchSlop();
    }

    @Override // com.google.inputmethod.p7e
    public float d() {
        return Build.VERSION.SDK_INT >= 34 ? pp.a.a(this.viewConfiguration) : super.d();
    }

    @Override // com.google.inputmethod.p7e
    public long e() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // com.google.inputmethod.p7e
    public long f() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // com.google.inputmethod.p7e
    public float h() {
        return this.viewConfiguration.getScaledMaximumFlingVelocity();
    }
}
