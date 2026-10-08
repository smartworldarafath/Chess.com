package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\b`\u0018\u0000 \u00112\u00020\u0001:\u0002\u0014\u0011J\u0017\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\u0006\u001a\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Lcom/google/android/gwc;", "", "other", "i", "(Lcom/google/android/gwc;)Lcom/google/android/gwc;", "Lkotlin/Function0;", "c", "(Lkotlin/jvm/functions/Function0;)Lcom/google/android/gwc;", "Lcom/google/android/ei1;", "d", "()J", "color", "Lcom/google/android/qu0;", "h", "()Lcom/google/android/qu0;", "brush", "", "a", "()F", "alpha", "b", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface gwc {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: com.google.android.gwc$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/google/android/gwc$a;", "", "<init>", "()V", "Lcom/google/android/ei1;", "color", "Lcom/google/android/gwc;", "b", "(J)Lcom/google/android/gwc;", "Lcom/google/android/qu0;", "brush", "", "alpha", "a", "(Lcom/google/android/qu0;F)Lcom/google/android/gwc;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final gwc a(qu0 brush, float alpha) throws NoWhenBranchMatchedException {
            if (brush == null) {
                return b.b;
            }
            if (brush instanceof SolidColor) {
                return b(hsc.c(((SolidColor) brush).getValue(), alpha));
            }
            if (brush instanceof jkb) {
                return new BrushStyle((jkb) brush, alpha);
            }
            throw new NoWhenBranchMatchedException();
        }

        public final gwc b(long color) {
            return color != 16 ? new ColorStyle(color, null) : b.b;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/google/android/gwc$b;", "Lcom/google/android/gwc;", "<init>", "()V", "Lcom/google/android/ei1;", "d", "()J", "color", "Lcom/google/android/qu0;", "h", "()Lcom/google/android/qu0;", "brush", "", "a", "()F", "alpha", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements gwc {
        public static final b b = new b();

        private b() {
        }

        @Override // com.google.inputmethod.gwc
        /* JADX INFO: renamed from: a */
        public float getAlpha() {
            return Float.NaN;
        }

        @Override // com.google.inputmethod.gwc
        /* JADX INFO: renamed from: d */
        public long getValue() {
            return ei1.INSTANCE.i();
        }

        @Override // com.google.inputmethod.gwc
        public qu0 h() {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static gwc e(gwc gwcVar) {
        return gwcVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static float f(gwc gwcVar) {
        return ((BrushStyle) gwcVar).getAlpha();
    }

    /* JADX INFO: renamed from: a */
    float getAlpha();

    default gwc c(Function0<? extends gwc> other) {
        return !Intrinsics.e(this, b.b) ? this : (gwc) other.invoke();
    }

    /* JADX INFO: renamed from: d */
    long getValue();

    qu0 h();

    default gwc i(gwc other) {
        boolean z = other instanceof BrushStyle;
        if (z && (this instanceof BrushStyle)) {
            BrushStyle su0Var = (BrushStyle) other;
            return new BrushStyle(su0Var.getValue(), hsc.d(su0Var.getAlpha(), new Function0() { // from class: com.google.android.ewc
                public final Object invoke() {
                    return Float.valueOf(gwc.f(this.a));
                }
            }));
        }
        if (!z || (this instanceof BrushStyle)) {
            return (z || !(this instanceof BrushStyle)) ? other.c(new Function0() { // from class: com.google.android.fwc
                public final Object invoke() {
                    return gwc.e(this.a);
                }
            }) : this;
        }
        return other;
    }
}
