package com.google.inputmethod;

import androidx.compose.ui.b;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0013\u001a\u00020\u0012*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010&\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!¨\u0006'"}, d2 = {"Lcom/google/android/bo8;", "Landroidx/compose/ui/node/c;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/ff3;", "x", "y", "", "rtlAware", "<init>", "(FFZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "o3", "(FFZ)V", "Landroidx/compose/ui/layout/j;", "Lcom/google/android/dj7;", "measurable", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "b", "(Landroidx/compose/ui/layout/j;Lcom/google/android/dj7;J)Lcom/google/android/fj7;", "p", "F", "getX-D9Ej5fM", "()F", "setX-0680j_4", "(F)V", "q", "getY-D9Ej5fM", "setY-0680j_4", "r", "Z", "getRtlAware", "()Z", "setRtlAware", "(Z)V", "s", "Q2", "shouldAutoInvalidate", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class bo8 extends b.c implements c {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private float x;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private float y;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private boolean rtlAware;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    public /* synthetic */ bo8(float f, float f2, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n3(bo8 bo8Var, o oVar, o.a aVar) {
        if (bo8Var.rtlAware) {
            o.a.L(aVar, oVar, aVar.O1(bo8Var.x), aVar.O1(bo8Var.y), 0.0f, 4, null);
        } else {
            o.a.z(aVar, oVar, aVar.O1(bo8Var.x), aVar.O1(bo8Var.y), 0.0f, 4, null);
        }
        return Unit.a;
    }

    @Override // androidx.compose.ui.b.c
    /* JADX INFO: renamed from: Q2, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.node.c
    public fj7 b(j jVar, dj7 dj7Var, long j) {
        final o oVarR0 = dj7Var.r0(j);
        return j.Q1(jVar, oVarR0.getWidth(), oVarR0.getHeight(), null, new Function1() { // from class: com.google.android.ao8
            public final Object invoke(Object obj) {
                return bo8.n3(this.a, oVarR0, (o.a) obj);
            }
        }, 4, null);
    }

    public final void o3(float x, float y, boolean rtlAware) {
        if (!ff3.k(this.x, x) || !ff3.k(this.y, y) || this.rtlAware != rtlAware) {
            bo6.c(this);
        }
        this.x = x;
        this.y = y;
        this.rtlAware = rtlAware;
    }

    private bo8(float f, float f2, boolean z) {
        this.x = f;
        this.y = f2;
        this.rtlAware = z;
    }
}
