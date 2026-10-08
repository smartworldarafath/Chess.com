package com.google.inputmethod;

import androidx.constraintlayout.core.state.State;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\tB!\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001e\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\t\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/google/android/t71;", "", "Landroidx/constraintlayout/core/state/State$Chain;", "Landroidx/constraintlayout/compose/SolverChain;", "style", "", "bias", "<init>", "(Landroidx/constraintlayout/core/state/State$Chain;Ljava/lang/Float;)V", "a", "Landroidx/constraintlayout/core/state/State$Chain;", "b", "()Landroidx/constraintlayout/core/state/State$Chain;", "Ljava/lang/Float;", "()Ljava/lang/Float;", "c", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class t71 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final t71 d;
    private static final t71 e;
    private static final t71 f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final State.Chain style;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Float bias;

    /* JADX INFO: renamed from: com.google.android.t71$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/google/android/t71$a;", "", "<init>", "()V", "", "bias", "Lcom/google/android/t71;", "a", "(F)Lcom/google/android/t71;", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final t71 a(float bias) {
            return new t71(State.Chain.PACKED, Float.valueOf(bias));
        }

        private Companion() {
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion companion = new Companion(defaultConstructorMarker);
        INSTANCE = companion;
        int i = 2;
        d = new t71(State.Chain.SPREAD, defaultConstructorMarker, i, defaultConstructorMarker);
        e = new t71(State.Chain.SPREAD_INSIDE, defaultConstructorMarker, i, defaultConstructorMarker);
        f = companion.a(0.5f);
    }

    public t71(State.Chain chain, Float f2) {
        Intrinsics.checkNotNullParameter(chain, "style");
        this.style = chain;
        this.bias = f2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Float getBias() {
        return this.bias;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final State.Chain getStyle() {
        return this.style;
    }

    public /* synthetic */ t71(State.Chain chain, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(chain, (i & 2) != 0 ? null : f2);
    }
}
