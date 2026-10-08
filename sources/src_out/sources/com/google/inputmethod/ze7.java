package com.google.inputmethod;

import com.google.android.r43;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B1\b\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00028\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R&\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/google/android/ze7;", "I", "O", "Lcom/google/android/l9;", "Lcom/google/android/m9;", "launcher", "Lcom/google/android/q6c;", "Lcom/google/android/z8;", "currentContract", "<init>", "(Lcom/google/android/m9;Lcom/google/android/q6c;)V", "", "c", "()V", "input", "Lcom/google/android/w8;", "options", "b", "(Ljava/lang/Object;Lcom/google/android/w8;)V", "a", "Lcom/google/android/m9;", "Lcom/google/android/q6c;", "activity-compose"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ze7<I, O> extends l9<I> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final m9<I> launcher;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final q6c<z8<I, O>> currentContract;

    /* JADX WARN: Multi-variable type inference failed */
    public ze7(m9<I> m9Var, q6c<? extends z8<I, O>> q6cVar) {
        this.launcher = m9Var;
        this.currentContract = q6cVar;
    }

    @Override // com.google.inputmethod.l9
    public void b(I input, w8 options) {
        this.launcher.a(input, options);
    }

    @Override // com.google.inputmethod.l9
    @r43
    public void c() {
        throw new UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
    }
}
