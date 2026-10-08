package com.google.inputmethod;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\"&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0004\u0010\u0005\" \u0010\u000e\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\r\u0010\u0007\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/google/android/ks9;", "Lcom/google/android/fu0;", "a", "Lcom/google/android/ks9;", "c", "()Lcom/google/android/ks9;", "getLocalBringIntoViewSpec$annotations", "()V", "LocalBringIntoViewSpec", "b", "Lcom/google/android/fu0;", "getPivotBringIntoViewSpec", "()Lcom/google/android/fu0;", "getPivotBringIntoViewSpec$annotations", "PivotBringIntoViewSpec", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class hu0 {
    private static final ks9<fu0> a = fs1.i(new Function1() { // from class: com.google.android.gu0
        public final Object invoke(Object obj) {
            return hu0.b((as1) obj);
        }
    });
    private static final fu0 b = new a();

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\r*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0006\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\n¨\u0006\u000f"}, d2 = {"com/google/android/hu0$a", "Lcom/google/android/fu0;", "", "offset", "size", "containerSize", "b", "(FFF)F", "F", "getParentFraction", "()F", "parentFraction", "c", "getChildFraction", "childFraction", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements fu0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final float parentFraction = 0.3f;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final float childFraction;

        a() {
        }

        @Override // com.google.inputmethod.fu0
        public float b(float offset, float size, float containerSize) {
            float fAbs = Math.abs((size + offset) - offset);
            boolean z = fAbs <= containerSize;
            float f = (this.parentFraction * containerSize) - (this.childFraction * fAbs);
            float f2 = containerSize - f;
            if (z && f2 < fAbs) {
                f = containerSize - fAbs;
            }
            return offset - f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fu0 b(as1 as1Var) {
        return !((Context) as1Var.L(AndroidCompositionLocals_androidKt.c())).getPackageManager().hasSystemFeature("android.software.leanback") ? fu0.INSTANCE.b() : b;
    }

    public static final ks9<fu0> c() {
        return a;
    }
}
