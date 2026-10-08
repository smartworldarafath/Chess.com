package com.google.inputmethod;

import androidx.compose.ui.text.b;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\n\u001a\u00020\t*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u000f\"\u001a\u0010\u0018\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/google/android/nce;", "Landroidx/compose/ui/text/b;", "text", "Lcom/google/android/jed;", "c", "(Lcom/google/android/nce;Landroidx/compose/ui/text/b;)Lcom/google/android/jed;", "", "originalLength", "limit", "", "e", "(Lcom/google/android/jed;II)V", "originalOffset", "offset", "h", "(III)V", "transformedOffset", "transformedLength", "g", "Lcom/google/android/zn8;", "a", "Lcom/google/android/zn8;", "d", "()Lcom/google/android/zn8;", "ValidatingEmptyOffsetMappingIdentity", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class o0e {
    private static final zn8 a = new n0e(zn8.INSTANCE.a(), 0, 0);

    public static final TransformedText c(nce nceVar, b bVar) {
        TransformedText transformedTextA = nceVar.a(bVar);
        f(transformedTextA, bVar.length(), 0, 2, null);
        return new TransformedText(transformedTextA.getText(), new n0e(transformedTextA.getOffsetMapping(), bVar.length(), transformedTextA.getText().length()));
    }

    public static final zn8 d() {
        return a;
    }

    public static final void e(TransformedText transformedText, int i, int i2) {
        int length = transformedText.getText().length();
        int iMin = Math.min(i, i2);
        for (int i3 = 0; i3 < iMin; i3++) {
            g(transformedText.getOffsetMapping().b(i3), length, i3);
        }
        g(transformedText.getOffsetMapping().b(i), length, i);
        int iMin2 = Math.min(length, i2);
        for (int i4 = 0; i4 < iMin2; i4++) {
            h(transformedText.getOffsetMapping().a(i4), i, i4);
        }
        h(transformedText.getOffsetMapping().a(length), i, length);
    }

    public static /* synthetic */ void f(TransformedText transformedText, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 100;
        }
        e(transformedText, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        cx5.c("OffsetMapping.originalToTransformed returned invalid mapping: " + i3 + " -> " + i + " is not in range of transformed text [0, " + i2 + ']');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        cx5.c("OffsetMapping.transformedToOriginal returned invalid mapping: " + i3 + " -> " + i + " is not in range of original text [0, " + i2 + ']');
    }
}
