package com.google.inputmethod;

import androidx.compose.p004runtime.e;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\bÁ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\u0004J\u001f\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0004J!\u0010\u0013\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/google/android/v1d;", "Lcom/google/android/ez;", "", "<init>", "()V", "", "l", "k", "", "index", "count", "b", "(II)V", "from", "to", "f", "(III)V", "clear", "instance", "i", "(ILjava/lang/Object;)V", "h", "node", "j", "(Ljava/lang/Object;)V", "a", "()Ljava/lang/Object;", "current", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v1d implements ez<Object> {
    public static final v1d a = new v1d();

    private v1d() {
    }

    private final void l() {
        e.b("ChangeList cannot call the Applier when executing pending changes outside of the applier phase.");
    }

    @Override // com.google.inputmethod.ez
    public Object a() {
        l();
        return Unit.a;
    }

    @Override // com.google.inputmethod.ez
    public void b(int index, int count) {
        l();
    }

    @Override // com.google.inputmethod.ez
    public void clear() {
        l();
    }

    @Override // com.google.inputmethod.ez
    public void f(int from, int to, int count) {
        l();
    }

    @Override // com.google.inputmethod.ez
    public void h(int index, Object instance) {
        l();
    }

    @Override // com.google.inputmethod.ez
    public void i(int index, Object instance) {
        l();
    }

    @Override // com.google.inputmethod.ez
    public void j(Object node) {
        l();
    }

    @Override // com.google.inputmethod.ez
    public void k() {
        l();
    }
}
