package com.google.inputmethod;

import androidx.compose.ui.node.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/google/android/u33;", "Lcom/google/android/k33;", "Lcom/google/android/bs1;", "Lcom/google/android/on8;", "Lcom/google/android/j26;", "interactionSource", "", "bounded", "Lcom/google/android/ff3;", "radius", "Lcom/google/android/ri1;", "color", "<init>", "(Lcom/google/android/j26;ZFLcom/google/android/ri1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "y3", "()V", "v3", "x3", "V2", "M1", "r", "Lcom/google/android/j26;", "s", "Z", "t", "F", "u", "Lcom/google/android/ri1;", "Lcom/google/android/x23;", "v", "Lcom/google/android/x23;", "rippleNode", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class u33 extends k33 implements bs1, on8 {

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final j26 interactionSource;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final boolean bounded;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final float radius;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final ri1 color;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private x23 rippleNode;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements ri1 {
        a() {
        }

        @Override // com.google.inputmethod.ri1
        public final long a() {
            long jA = u33.this.color.a();
            if (jA != 16) {
                return jA;
            }
            RippleConfiguration rippleConfiguration = (RippleConfiguration) cs1.a(u33.this, xoa.c());
            return (rippleConfiguration == null || rippleConfiguration.getColor() == 16) ? ((ei1) cs1.a(u33.this, cz1.a())).getValue() : rippleConfiguration.getColor();
        }
    }

    public /* synthetic */ u33(j26 j26Var, boolean z, float f, ri1 ri1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(j26Var, z, f, ri1Var);
    }

    private final void v3() {
        this.rippleNode = m3(woa.c(this.interactionSource, this.bounded, this.radius, new a(), new Function0() { // from class: com.google.android.s33
            public final Object invoke() {
                return u33.w3(this.a);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RippleAlpha w3(u33 u33Var) {
        RippleAlpha rippleAlpha;
        RippleConfiguration rippleConfiguration = (RippleConfiguration) cs1.a(u33Var, xoa.c());
        return (rippleConfiguration == null || (rippleAlpha = rippleConfiguration.getRippleAlpha()) == null) ? ooa.a.a() : rippleAlpha;
    }

    private final void x3() {
        x23 x23Var = this.rippleNode;
        if (x23Var != null) {
            p3(x23Var);
        }
        this.rippleNode = null;
    }

    private final void y3() {
        l.a(this, new Function0() { // from class: com.google.android.q33
            public final Object invoke() {
                return u33.z3(this.a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z3(u33 u33Var) {
        if (((RippleConfiguration) cs1.a(u33Var, xoa.c())) == null) {
            u33Var.x3();
        } else if (u33Var.rippleNode == null) {
            u33Var.v3();
        }
        return Unit.a;
    }

    @Override // com.google.inputmethod.on8
    public void M1() {
        y3();
    }

    @Override // androidx.compose.ui.b.c
    public void V2() {
        y3();
    }

    private u33(j26 j26Var, boolean z, float f, ri1 ri1Var) {
        this.interactionSource = j26Var;
        this.bounded = z;
        this.radius = f;
        this.color = ri1Var;
    }
}
