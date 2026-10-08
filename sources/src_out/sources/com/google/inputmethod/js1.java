package com.google.inputmethod;

import androidx.compose.p004runtime.f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/google/android/js1;", "", "Lcom/google/android/is1;", "observer", "", "root", "Landroidx/compose/runtime/f;", "parent", "<init>", "(Lcom/google/android/is1;ZLandroidx/compose/runtime/f;)V", "a", "()Lcom/google/android/is1;", "Z", "getRoot", "()Z", "setRoot", "(Z)V", "b", "Landroidx/compose/runtime/f;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class js1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean root;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final f parent;

    public js1(is1 is1Var, boolean z, f fVar) {
        this.root = z;
        this.parent = fVar;
    }

    public final is1 a() {
        if (this.root) {
            return null;
        }
        this.parent.l();
        Intrinsics.e((Object) null, (Object) null);
        return null;
    }

    public /* synthetic */ js1(is1 is1Var, boolean z, f fVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : is1Var, (i & 2) != 0 ? false : z, fVar);
    }
}
