package com.google.inputmethod;

import com.google.android.l58;
import com.google.android.q22;
import com.google.android.zlb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/google/android/s48;", "Lcom/google/android/r48;", "<init>", "()V", "Lcom/google/android/i26;", "interaction", "", "a", "(Lcom/google/android/i26;Lcom/google/android/q22;)Ljava/lang/Object;", "", "b", "(Lcom/google/android/i26;)Z", "Lcom/google/android/l58;", "Lcom/google/android/l58;", "d", "()Lcom/google/android/l58;", "interactions", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class s48 implements r48 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final l58<i26> interactions = zlb.b(0, 16, BufferOverflow.b, 1, (Object) null);

    @Override // com.google.inputmethod.r48
    public Object a(i26 i26Var, q22<? super Unit> q22Var) {
        Object objEmit = c().emit(i26Var, q22Var);
        return objEmit == a.g() ? objEmit : Unit.a;
    }

    @Override // com.google.inputmethod.r48
    public boolean b(i26 interaction) {
        return c().g(interaction);
    }

    @Override // com.google.inputmethod.j26
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public l58<i26> c() {
        return this.interactions;
    }
}
