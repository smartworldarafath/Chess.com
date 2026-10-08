package com.google.inputmethod;

import androidx.compose.p004runtime.s0;
import androidx.emoji2.text.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/google/android/ox2;", "Lcom/google/android/nq3;", "<init>", "()V", "Lcom/google/android/q6c;", "", "c", "()Lcom/google/android/q6c;", "a", "Lcom/google/android/q6c;", "loadState", "fontLoaded", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ox2 implements nq3 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private q6c<Boolean> loadState;

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/google/android/ox2$a", "Landroidx/emoji2/text/e$f;", "", "b", "()V", "", "throwable", "a", "(Ljava/lang/Throwable;)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends e.f {
        final /* synthetic */ o58<Boolean> a;
        final /* synthetic */ ox2 b;

        a(o58<Boolean> o58Var, ox2 ox2Var) {
            this.a = o58Var;
            this.b = ox2Var;
        }

        @Override // androidx.emoji2.text.e.f
        public void a(Throwable throwable) {
            this.b.loadState = oq3.a;
        }

        @Override // androidx.emoji2.text.e.f
        public void b() {
            this.a.setValue(Boolean.TRUE);
            this.b.loadState = new yp5(true);
        }
    }

    public ox2() {
        this.loadState = e.k() ? c() : null;
    }

    private final q6c<Boolean> c() {
        e eVarC = e.c();
        if (eVarC.g() == 1) {
            return new yp5(true);
        }
        o58 o58VarE = s0.e(Boolean.FALSE, null, 2, null);
        eVarC.v(new a(o58VarE, this));
        return o58VarE;
    }

    @Override // com.google.inputmethod.nq3
    public q6c<Boolean> a() {
        q6c<Boolean> q6cVar = this.loadState;
        if (q6cVar != null) {
            Intrinsics.g(q6cVar);
            return q6cVar;
        }
        if (!e.k()) {
            return oq3.a;
        }
        q6c<Boolean> q6cVarC = c();
        this.loadState = q6cVarC;
        Intrinsics.g(q6cVarC);
        return q6cVarC;
    }
}
