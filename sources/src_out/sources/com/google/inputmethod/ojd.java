package com.google.inputmethod;

import android.text.style.TtsSpan;
import androidx.compose.ui.text.VerbatimTtsAnnotation;
import androidx.compose.ui.text.z;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/z;", "Landroid/text/style/TtsSpan;", "a", "(Landroidx/compose/ui/text/z;)Landroid/text/style/TtsSpan;", "Landroidx/compose/ui/text/b0;", "b", "(Landroidx/compose/ui/text/b0;)Landroid/text/style/TtsSpan;", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ojd {
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final TtsSpan a(z zVar) throws NoWhenBranchMatchedException {
        if (zVar instanceof VerbatimTtsAnnotation) {
            return b((VerbatimTtsAnnotation) zVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final TtsSpan b(VerbatimTtsAnnotation verbatimTtsAnnotation) {
        return new TtsSpan.VerbatimBuilder(verbatimTtsAnnotation.getVerbatim()).build();
    }
}
