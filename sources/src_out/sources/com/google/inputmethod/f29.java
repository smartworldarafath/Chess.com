package com.google.inputmethod;

import androidx.compose.ui.b;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0011\u001a\u00020\u0010*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR*\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001e¨\u0006\""}, d2 = {"Lcom/google/android/f29;", "Landroidx/compose/ui/node/c;", "Landroidx/compose/ui/b$c;", "", "fraction", "Lcom/google/android/q6c;", "", "widthState", "heightState", "<init>", "(FLcom/google/android/q6c;Lcom/google/android/q6c;)V", "Landroidx/compose/ui/layout/j;", "Lcom/google/android/dj7;", "measurable", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "b", "(Landroidx/compose/ui/layout/j;Lcom/google/android/dj7;J)Lcom/google/android/fj7;", "p", "F", "getFraction", "()F", "o3", "(F)V", "q", "Lcom/google/android/q6c;", "getWidthState", "()Lcom/google/android/q6c;", "q3", "(Lcom/google/android/q6c;)V", "r", "getHeightState", "p3", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class f29 extends b.c implements c {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private float fraction;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private q6c<Integer> widthState;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private q6c<Integer> heightState;

    public f29(float f, q6c<Integer> q6cVar, q6c<Integer> q6cVar2) {
        this.fraction = f;
        this.widthState = q6cVar;
        this.heightState = q6cVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n3(o oVar, o.a aVar) {
        o.a.z(aVar, oVar, 0, 0, 0.0f, 4, null);
        return Unit.a;
    }

    @Override // androidx.compose.ui.node.c
    public fj7 b(j jVar, dj7 dj7Var, long j) {
        q6c<Integer> q6cVar = this.widthState;
        int iRound = (q6cVar == null || q6cVar.getValue().intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(q6cVar.getValue().floatValue() * this.fraction);
        q6c<Integer> q6cVar2 = this.heightState;
        int iRound2 = (q6cVar2 == null || q6cVar2.getValue().intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(q6cVar2.getValue().floatValue() * this.fraction);
        int iN = iRound != Integer.MAX_VALUE ? iRound : kx1.n(j);
        int iM = iRound2 != Integer.MAX_VALUE ? iRound2 : kx1.m(j);
        if (iRound == Integer.MAX_VALUE) {
            iRound = kx1.l(j);
        }
        if (iRound2 == Integer.MAX_VALUE) {
            iRound2 = kx1.k(j);
        }
        final o oVarR0 = dj7Var.r0(nx1.a(iN, iRound, iM, iRound2));
        return j.Q1(jVar, oVarR0.getWidth(), oVarR0.getHeight(), null, new Function1() { // from class: com.google.android.e29
            public final Object invoke(Object obj) {
                return f29.n3(oVarR0, (o.a) obj);
            }
        }, 4, null);
    }

    public final void o3(float f) {
        this.fraction = f;
    }

    public final void p3(q6c<Integer> q6cVar) {
        this.heightState = q6cVar;
    }

    public final void q3(q6c<Integer> q6cVar) {
        this.widthState = q6cVar;
    }
}
