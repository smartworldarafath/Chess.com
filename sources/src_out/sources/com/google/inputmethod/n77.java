package com.google.inputmethod;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004*8\b\u0007\u0010\r\"\u00020\u00022\u00020\u0002B*\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u001c\b\b\u0012\u0018\b\u000bB\u0014\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0006\b\f\u0012\u0002\b\f¨\u0006\u000e"}, d2 = {"", "languageTag", "Ljava/util/Locale;", "b", "(Ljava/lang/String;)Ljava/util/Locale;", "Lcom/google/android/r43;", "message", "Use java.util.Locale directly instead", "replaceWith", "Lcom/google/android/kia;", "expression", "java.util.Locale", "imports", "PlatformLocale", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class n77 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Locale b(String str) {
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        if (Intrinsics.e(localeForLanguageTag.toLanguageTag(), "und")) {
            System.err.println("The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
        }
        return localeForLanguageTag;
    }
}
