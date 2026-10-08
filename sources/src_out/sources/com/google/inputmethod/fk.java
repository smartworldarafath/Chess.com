package com.google.inputmethod;

import androidx.compose.ui.autofill.d;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.l0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"Lcom/google/android/fk;", "Landroidx/compose/ui/autofill/d;", "", "", "androidAutofillHints", "<init>", "(Ljava/util/Set;)V", "other", "a", "(Landroidx/compose/ui/autofill/d;)Landroidx/compose/ui/autofill/d;", "b", "Ljava/util/Set;", "()Ljava/util/Set;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class fk implements d {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Set<String> androidAutofillHints;

    public fk(Set<String> set) {
        this.androidAutofillHints = set;
    }

    @Override // androidx.compose.ui.autofill.d
    public d a(d other) {
        Intrinsics.h(other, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentType");
        return new fk(l0.o(this.androidAutofillHints, ((fk) other).androidAutofillHints));
    }

    public final Set<String> b() {
        return this.androidAutofillHints;
    }
}
