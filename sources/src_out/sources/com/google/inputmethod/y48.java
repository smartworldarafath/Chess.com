package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\n\bg\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00038W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\f\u001a\u00020\u00038&@&X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/google/android/y48;", "Lcom/google/android/ja7;", "Lcom/google/android/o58;", "", "value", "getValue", "()Ljava/lang/Long;", "i", "(J)V", "getLongValue", "()J", "C", "longValue", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface y48 extends ja7, o58<Long> {
    void C(long j);

    @Override // com.google.inputmethod.ja7
    long getLongValue();

    default void i(long j) {
        C(j);
    }

    @Override // com.google.inputmethod.o58
    /* bridge */ /* synthetic */ default void setValue(Long l) {
        i(l.longValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.inputmethod.q6c
    default Long getValue() {
        return Long.valueOf(getLongValue());
    }
}
