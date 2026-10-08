package com.google.inputmethod;

import android.view.inputmethod.EditorInfo;
import kotlin.Metadata;
import kotlin.collections.l0;
import kotlin.collections.m;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/google/android/rn3;", "", "<init>", "()V", "Landroid/view/inputmethod/EditorInfo;", "editorInfo", "", "a", "(Landroid/view/inputmethod/EditorInfo;)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class rn3 {
    public static final rn3 a = new rn3();

    private rn3() {
    }

    public final void a(EditorInfo editorInfo) {
        editorInfo.setSupportedHandwritingGestures(m.s(new Class[]{in3.a(), mn3.a(), jn3.a(), kn3.a(), nn3.a(), on3.a(), pn3.a()}));
        editorInfo.setSupportedHandwritingGesturePreviews(l0.j(new Class[]{in3.a(), mn3.a(), jn3.a(), kn3.a()}));
    }
}
