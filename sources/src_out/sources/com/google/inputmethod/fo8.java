package com.google.inputmethod;

import androidx.compose.ui.b;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ)\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\nJ#\u0010\u0013\u001a\u00020\u0012*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010#\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001e¨\u0006$"}, d2 = {"Lcom/google/android/fo8;", "Landroidx/compose/ui/node/c;", "Landroidx/compose/ui/b$c;", "Lkotlin/Function1;", "Lcom/google/android/f43;", "Lcom/google/android/g16;", "offset", "", "rtlAware", "<init>", "(Lkotlin/jvm/functions/Function1;Z)V", "", "o3", "Landroidx/compose/ui/layout/j;", "Lcom/google/android/dj7;", "measurable", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "b", "(Landroidx/compose/ui/layout/j;Lcom/google/android/dj7;J)Lcom/google/android/fj7;", "p", "Lkotlin/jvm/functions/Function1;", "getOffset", "()Lkotlin/jvm/functions/Function1;", "setOffset", "(Lkotlin/jvm/functions/Function1;)V", "q", "Z", "getRtlAware", "()Z", "setRtlAware", "(Z)V", "r", "Q2", "shouldAutoInvalidate", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class fo8 extends b.c implements c {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private Function1<? super f43, g16> offset;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private boolean rtlAware;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    public fo8(Function1<? super f43, g16> function1, boolean z) {
        this.offset = function1;
        this.rtlAware = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n3(fo8 fo8Var, o oVar, o.a aVar) {
        long packedValue = ((g16) fo8Var.offset.invoke(aVar)).getPackedValue();
        if (fo8Var.rtlAware) {
            o.a.T(aVar, oVar, g16.k(packedValue), g16.l(packedValue), 0.0f, null, 12, null);
        } else {
            o.a.d0(aVar, oVar, g16.k(packedValue), g16.l(packedValue), 0.0f, null, 12, null);
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
        return j.Q1(jVar, oVarR0.getWidth(), oVarR0.getHeight(), null, new Function1() { // from class: com.google.android.eo8
            public final Object invoke(Object obj) {
                return fo8.n3(this.a, oVarR0, (o.a) obj);
            }
        }, 4, null);
    }

    public final void o3(Function1<? super f43, g16> offset, boolean rtlAware) {
        if (this.offset != offset || this.rtlAware != rtlAware) {
            bo6.c(this);
        }
        this.offset = offset;
        this.rtlAware = rtlAware;
    }
}
