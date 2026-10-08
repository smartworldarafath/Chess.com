package com.google.inputmethod;

import androidx.compose.ui.b;
import com.google.android.hl1;
import com.google.android.jl1;
import com.google.android.q22;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.s;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00060\u0002R\u00020\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u00020\u00052\n\u0010\n\u001a\u00060\u0002R\u00020\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0017\u001a\b\u0018\u00010\u0002R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/google/android/bc0;", "Lcom/google/android/uy7;", "Lcom/google/android/bc0$a;", "<init>", "()V", "", "A", "(Lcom/google/android/q22;)Ljava/lang/Object;", "o", "()Lcom/google/android/bc0$a;", "node", "y", "(Lcom/google/android/bc0$a;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Lcom/google/android/bc0$a;", "attachedNode", "Lcom/google/android/hl1;", "e", "Lcom/google/android/hl1;", "lock", "a", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class bc0 extends uy7<a> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private a attachedNode;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private hl1<Unit> lock;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0006R\u0018\u0010\f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/google/android/bc0$a;", "Landroidx/compose/ui/b$c;", "<init>", "(Lcom/google/android/bc0;)V", "", "V2", "()V", "n3", "W2", "Lcom/google/android/x23$a;", "p", "Lcom/google/android/x23$a;", "handle", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends b.c {

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        private x23.a handle;

        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o3(a aVar, bc0 bc0Var, nea neaVar) {
            x23.a aVar2 = aVar.handle;
            if (aVar2 != null) {
                aVar2.a();
            }
            aVar.handle = null;
            hl1 hl1Var = bc0Var.lock;
            if (hl1Var != null) {
                hl1Var.L(Unit.a);
            }
            bc0Var.lock = null;
            return Unit.a;
        }

        @Override // androidx.compose.ui.b.c
        public void V2() {
            bc0.this.attachedNode = this;
            if (bc0.this.lock != null) {
                n3();
            }
        }

        @Override // androidx.compose.ui.b.c
        public void W2() {
            if (bc0.this.attachedNode == this) {
                bc0.this.attachedNode = null;
            }
            x23.a aVar = this.handle;
            if (aVar != null) {
                aVar.a();
            }
            this.handle = null;
        }

        public final void n3() {
            final bc0 bc0Var = bc0.this;
            this.handle = ar8.a(this, 0L, 0L, new Function1() { // from class: com.google.android.ac0
                public final Object invoke(Object obj) {
                    return bc0.a.o3(this.a, bc0Var, (nea) obj);
                }
            });
        }
    }

    public final Object A(q22<? super Unit> q22Var) {
        hl1<Unit> hl1VarC = this.lock;
        if (hl1VarC == null) {
            hl1VarC = jl1.c((s) null, 1, (Object) null);
            this.lock = hl1VarC;
            a aVar = this.attachedNode;
            if (aVar != null && aVar.getIsAttached()) {
                aVar.n3();
            }
        }
        Object objK0 = hl1VarC.k0(q22Var);
        return objK0 == kotlin.coroutines.intrinsics.a.g() ? objK0 : Unit.a;
    }

    public boolean equals(Object other) {
        return other == this;
    }

    public int hashCode() {
        return 234;
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public a a() {
        return new a();
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void c(a node) {
    }
}
