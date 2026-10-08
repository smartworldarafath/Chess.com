package com.google.inputmethod;

import androidx.compose.p004runtime.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\rJ5\u0010\u001f\u001a\u00020\t2\u001a\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020\t0\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\rR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010$R\u0016\u0010&\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010$R\u0014\u0010(\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010'¨\u0006)"}, d2 = {"Lcom/google/android/sn8;", "N", "Lcom/google/android/ez;", "applier", "", "offset", "<init>", "(Lcom/google/android/ez;I)V", "node", "", "j", "(Ljava/lang/Object;)V", "k", "()V", "index", "instance", "h", "(ILjava/lang/Object;)V", "i", "count", "b", "(II)V", "from", "to", "f", "(III)V", "clear", "Lkotlin/Function2;", "", "block", "value", "g", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;)V", "d", "a", "Lcom/google/android/ez;", "I", "c", "nesting", "()Ljava/lang/Object;", "current", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class sn8<N> implements ez<N> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ez<N> applier;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int offset;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int nesting;

    public sn8(ez<N> ezVar, int i) {
        this.applier = ezVar;
        this.offset = i;
    }

    @Override // com.google.inputmethod.ez
    public N a() {
        return this.applier.a();
    }

    @Override // com.google.inputmethod.ez
    public void b(int index, int count) {
        this.applier.b(index + (this.nesting == 0 ? this.offset : 0), count);
    }

    @Override // com.google.inputmethod.ez
    public void clear() {
        e.b("Clear is not valid on OffsetApplier");
    }

    @Override // com.google.inputmethod.ez
    public void d() {
        this.applier.d();
    }

    @Override // com.google.inputmethod.ez
    public void f(int from, int to, int count) {
        int i = this.nesting == 0 ? this.offset : 0;
        this.applier.f(from + i, to + i, count);
    }

    @Override // com.google.inputmethod.ez
    public void g(Function2<? super N, Object, Unit> block, Object value) {
        this.applier.g(block, value);
    }

    @Override // com.google.inputmethod.ez
    public void h(int index, N instance) {
        this.applier.h(index + (this.nesting == 0 ? this.offset : 0), instance);
    }

    @Override // com.google.inputmethod.ez
    public void i(int index, N instance) {
        this.applier.i(index + (this.nesting == 0 ? this.offset : 0), instance);
    }

    @Override // com.google.inputmethod.ez
    public void j(N node) {
        this.nesting++;
        this.applier.j(node);
    }

    @Override // com.google.inputmethod.ez
    public void k() {
        if (!(this.nesting > 0)) {
            e.b("OffsetApplier up called with no corresponding down");
        }
        this.nesting--;
        this.applier.k();
    }
}
