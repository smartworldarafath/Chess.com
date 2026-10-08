package com.google.inputmethod;

import androidx.compose.ui.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/google/android/wr8;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/kj7;", "Lkotlin/Function1;", "Lcom/google/android/q16;", "", "onSizeChanged", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "m3", "size", "f", "(J)V", "p", "Lkotlin/jvm/functions/Function1;", "", "q", "Z", "Q2", "()Z", "shouldAutoInvalidate", "r", "J", "previousSize", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class wr8 extends b.c implements kj7 {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private Function1<? super q16, Unit> onSizeChanged;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final boolean shouldAutoInvalidate = true;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private long previousSize;

    public wr8(Function1<? super q16, Unit> function1) {
        this.onSizeChanged = function1;
        long j = t04.INVALID_ID;
        this.previousSize = q16.c((j & 4294967295L) | (j << 32));
    }

    @Override // androidx.compose.ui.b.c
    /* JADX INFO: renamed from: Q2, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // com.google.inputmethod.kj7
    public void f(long size) {
        if (q16.f(this.previousSize, size)) {
            return;
        }
        this.onSizeChanged.invoke(q16.b(size));
        this.previousSize = size;
    }

    public final void m3(Function1<? super q16, Unit> onSizeChanged) {
        this.onSizeChanged = onSizeChanged;
        long j = t04.INVALID_ID;
        this.previousSize = q16.c((j & 4294967295L) | (j << 32));
    }
}
