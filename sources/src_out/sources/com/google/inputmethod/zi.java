package com.google.inputmethod;

import android.content.ClipboardManager;
import com.google.android.q22;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0018\u0010\u0012\u001a\u00060\u000ej\u0002`\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/google/android/zi;", "Lcom/google/android/jf1;", "Lcom/google/android/aj;", "androidClipboardManager", "<init>", "(Lcom/google/android/aj;)V", "Lcom/google/android/ef1;", "c", "(Lcom/google/android/q22;)Ljava/lang/Object;", "clipEntry", "", "a", "(Lcom/google/android/ef1;Lcom/google/android/q22;)Ljava/lang/Object;", "Lcom/google/android/aj;", "Landroid/content/ClipboardManager;", "Landroidx/compose/ui/platform/NativeClipboard;", "b", "()Landroid/content/ClipboardManager;", "nativeClipboard", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class zi implements jf1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final aj androidClipboardManager;

    public zi(aj ajVar) {
        this.androidClipboardManager = ajVar;
    }

    @Override // com.google.inputmethod.jf1
    public Object a(ef1 ef1Var, q22<? super Unit> q22Var) {
        this.androidClipboardManager.f(ef1Var);
        return Unit.a;
    }

    @Override // com.google.inputmethod.jf1
    public ClipboardManager b() {
        return this.androidClipboardManager.d();
    }

    @Override // com.google.inputmethod.jf1
    public Object c(q22<? super ef1> q22Var) {
        return this.androidClipboardManager.b();
    }
}
