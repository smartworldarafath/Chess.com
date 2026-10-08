package com.google.inputmethod;

import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.a;
import androidx.compose.ui.text.input.c;
import androidx.compose.ui.text.input.d;
import androidx.compose.ui.text.x;
import kotlin.Metadata;

/* JADX INFO: renamed from: com.google.android.tn3, reason: from Kotlin metadata */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a=\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroid/view/inputmethod/EditorInfo;", "", "text", "Landroidx/compose/ui/text/x;", "selection", "Landroidx/compose/ui/text/input/b;", "imeOptions", "", "", "contentMimeTypes", "", "b", "(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;JLandroidx/compose/ui/text/input/b;[Ljava/lang/String;)V", "", "bits", "flag", "", "a", "(II)Z", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class EditorInfo {
    private static final boolean a(int i, int i2) {
        return (i & i2) == i2;
    }

    public static final void b(android.view.inputmethod.EditorInfo editorInfo, CharSequence charSequence, long j, ImeOptions imeOptions, String[] strArr) {
        int imeAction = imeOptions.getImeAction();
        a.Companion companion = a.INSTANCE;
        int i = 3;
        int i2 = 6;
        if (a.m(imeAction, companion.a())) {
            if (!imeOptions.getSingleLine()) {
                i2 = 0;
            }
        } else if (a.m(imeAction, companion.e())) {
            i2 = 1;
        } else if (a.m(imeAction, companion.c())) {
            i2 = 2;
        } else if (a.m(imeAction, companion.d())) {
            i2 = 5;
        } else if (a.m(imeAction, companion.f())) {
            i2 = 7;
        } else if (a.m(imeAction, companion.g())) {
            i2 = 3;
        } else if (a.m(imeAction, companion.h())) {
            i2 = 4;
        } else if (!a.m(imeAction, companion.b())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i2;
        imeOptions.g();
        i77.a.a(editorInfo, imeOptions.getHintLocales());
        int keyboardType = imeOptions.getKeyboardType();
        d.Companion companion2 = d.INSTANCE;
        if (d.n(keyboardType, companion2.h())) {
            i = 1;
        } else if (d.n(keyboardType, companion2.a())) {
            editorInfo.imeOptions |= t04.INVALID_ID;
            i = 1;
        } else if (d.n(keyboardType, companion2.d())) {
            i = 2;
        } else if (!d.n(keyboardType, companion2.g())) {
            if (d.n(keyboardType, companion2.j())) {
                i = 17;
            } else if (d.n(keyboardType, companion2.c())) {
                i = 33;
            } else if (d.n(keyboardType, companion2.f())) {
                i = 129;
            } else if (d.n(keyboardType, companion2.e())) {
                i = 18;
            } else {
                if (!d.n(keyboardType, companion2.b())) {
                    throw new IllegalStateException("Invalid Keyboard Type");
                }
                i = 8194;
            }
        }
        editorInfo.inputType = i;
        if (!imeOptions.getSingleLine() && a(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (a.m(imeOptions.getImeAction(), companion.a())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (a(editorInfo.inputType, 1)) {
            int capitalization = imeOptions.getCapitalization();
            c.Companion companion3 = c.INSTANCE;
            if (c.i(capitalization, companion3.a())) {
                editorInfo.inputType |= 4096;
            } else if (c.i(capitalization, companion3.e())) {
                editorInfo.inputType |= 8192;
            } else if (c.i(capitalization, companion3.c())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = x.n(j);
        editorInfo.initialSelEnd = x.i(j);
        sn3.e(editorInfo, charSequence);
        if (strArr != null) {
            sn3.c(editorInfo, strArr);
        }
        editorInfo.imeOptions |= 33554432;
        if (!icc.a() || d.n(imeOptions.getKeyboardType(), companion2.f()) || d.n(imeOptions.getKeyboardType(), companion2.e())) {
            sn3.f(editorInfo, false);
        } else {
            sn3.f(editorInfo, true);
            rn3.a.a(editorInfo);
        }
    }

    public static /* synthetic */ void c(android.view.inputmethod.EditorInfo editorInfo, CharSequence charSequence, long j, ImeOptions imeOptions, String[] strArr, int i, Object obj) {
        if ((i & 8) != 0) {
            strArr = null;
        }
        b(editorInfo, charSequence, j, imeOptions, strArr);
    }
}
