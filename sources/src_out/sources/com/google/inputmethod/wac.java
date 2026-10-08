package com.google.inputmethod;

import androidx.emoji2.text.e;
import java.text.BreakIterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a#\u0010\b\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\t\u001a#\u0010\n\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"", "", "index", "d", "(Ljava/lang/String;I)I", "c", "", "ifNotFound", "a", "(Ljava/lang/CharSequence;II)I", "b", "(Ljava/lang/String;II)I", "Landroidx/emoji2/text/e;", "e", "()Landroidx/emoji2/text/e;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class wac {
    private static final int a(CharSequence charSequence, int i, int i2) {
        return i <= 0 ? i2 : Character.offsetByCodePoints(charSequence, i, -1);
    }

    public static final int b(String str, int i, int i2) {
        int iF;
        if (i <= 0) {
            return i2;
        }
        e eVarE = e();
        return (eVarE != null && (iF = eVarE.f(str, i + (-1))) >= 0) ? iF : a(str, i, i2);
    }

    public static final int c(String str, int i) {
        e eVarE = e();
        Integer num = null;
        if (eVarE != null) {
            Integer numValueOf = Integer.valueOf(eVarE.d(str, i));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i);
    }

    public static final int d(String str, int i) {
        e eVarE = e();
        Integer num = null;
        if (eVarE != null) {
            Integer numValueOf = Integer.valueOf(eVarE.f(str, Math.max(0, i - 1)));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    private static final e e() {
        if (e.k()) {
            e eVarC = e.c();
            if (eVarC.g() == 1) {
                return eVarC;
            }
        }
        return null;
    }
}
