package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\bg\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00038W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\f\u001a\u00020\u00038&@&X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/google/android/q48;", "Lcom/google/android/u16;", "Lcom/google/android/o58;", "", "value", "getValue", "()Ljava/lang/Integer;", "j", "(I)V", "getIntValue", "()I", "f", "intValue", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface q48 extends u16, o58<Integer> {
    void f(int i);

    @Override // com.google.inputmethod.u16
    int getIntValue();

    default void j(int i) {
        f(i);
    }

    @Override // com.google.inputmethod.o58
    /* bridge */ /* synthetic */ default void setValue(Integer num) {
        j(num.intValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.inputmethod.q6c
    default Integer getValue() {
        return Integer.valueOf(getIntValue());
    }
}
