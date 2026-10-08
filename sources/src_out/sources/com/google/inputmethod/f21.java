package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.h;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "localeFormat", "Lcom/google/android/on2;", "a", "(Ljava/lang/String;)Lcom/google/android/on2;", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class f21 {
    public static final DateInputFormat a(String str) {
        String strW0 = h.W0(h.T(new Regex("y{1,4}").replace(new Regex("M{1,2}").replace(new Regex("d{1,2}").replace(new Regex("[^dMy/\\-.]").replace(str, ""), "dd"), "MM"), "yyyy"), "My", "M/y", false, 4, (Object) null), ".");
        MatchResult matchResultD = Regex.d(new Regex("[/\\-.]"), strW0, 0, 2, (Object) null);
        Intrinsics.g(matchResultD);
        MatchGroup matchGroup = matchResultD.a().get(0);
        Intrinsics.g(matchGroup);
        return new DateInputFormat(strW0, matchGroup.a().charAt(0));
    }
}
