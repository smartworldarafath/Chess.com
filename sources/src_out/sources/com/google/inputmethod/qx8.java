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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0012\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\"\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\"\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0015\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/google/android/qx8;", "Landroidx/compose/ui/node/c;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/ff3;", "start", "top", "end", "bottom", "", "rtlAware", "<init>", "(FFFFZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/layout/j;", "Lcom/google/android/dj7;", "measurable", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "b", "(Landroidx/compose/ui/layout/j;Lcom/google/android/dj7;J)Lcom/google/android/fj7;", "p", "F", "getStart-D9Ej5fM", "()F", "r3", "(F)V", "q", "getTop-D9Ej5fM", "s3", "r", "getEnd-D9Ej5fM", "p3", "s", "getBottom-D9Ej5fM", "o3", "t", "Z", "getRtlAware", "()Z", "q3", "(Z)V", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class qx8 extends b.c implements c {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private float start;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private float top;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private float end;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private float bottom;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private boolean rtlAware;

    public /* synthetic */ qx8(float f, float f2, float f3, float f4, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n3(qx8 qx8Var, o oVar, o.a aVar) {
        if (qx8Var.rtlAware) {
            o.a.L(aVar, oVar, aVar.O1(qx8Var.start), aVar.O1(qx8Var.top), 0.0f, 4, null);
        } else {
            o.a.z(aVar, oVar, aVar.O1(qx8Var.start), aVar.O1(qx8Var.top), 0.0f, 4, null);
        }
        return Unit.a;
    }

    @Override // androidx.compose.ui.node.c
    public fj7 b(j jVar, dj7 dj7Var, long j) {
        int iO1 = jVar.O1(this.start) + jVar.O1(this.end);
        int iO2 = jVar.O1(this.top) + jVar.O1(this.bottom);
        final o oVarR0 = dj7Var.r0(nx1.i(j, -iO1, -iO2));
        return j.Q1(jVar, nx1.g(j, oVarR0.getWidth() + iO1), nx1.f(j, oVarR0.getHeight() + iO2), null, new Function1() { // from class: com.google.android.px8
            public final Object invoke(Object obj) {
                return qx8.n3(this.a, oVarR0, (o.a) obj);
            }
        }, 4, null);
    }

    public final void o3(float f) {
        this.bottom = f;
    }

    public final void p3(float f) {
        this.end = f;
    }

    public final void q3(boolean z) {
        this.rtlAware = z;
    }

    public final void r3(float f) {
        this.start = f;
    }

    public final void s3(float f) {
        this.top = f;
    }

    private qx8(float f, float f2, float f3, float f4, boolean z) {
        this.start = f;
        this.top = f2;
        this.end = f3;
        this.bottom = f4;
        this.rtlAware = z;
    }
}
