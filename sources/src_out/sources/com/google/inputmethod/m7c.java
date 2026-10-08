package com.google.inputmethod;

import android.os.Build;
import android.text.StaticLayout;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/google/android/m7c;", "Lcom/google/android/z7c;", "<init>", "()V", "Lcom/google/android/a8c;", "params", "Landroid/text/StaticLayout;", "b", "(Lcom/google/android/a8c;)Landroid/text/StaticLayout;", "layout", "", "useFallbackLineSpacing", "a", "(Landroid/text/StaticLayout;Z)Z", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class m7c implements z7c {
    @Override // com.google.inputmethod.z7c
    public boolean a(StaticLayout layout, boolean useFallbackLineSpacing) {
        return Build.VERSION.SDK_INT >= 33 ? v7c.a(layout) : useFallbackLineSpacing;
    }

    @Override // com.google.inputmethod.z7c
    public StaticLayout b(a8c params) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(params.getText(), params.getStart(), params.getEnd(), params.getPaint(), params.getWidth());
        builderObtain.setTextDirection(params.getTextDir());
        builderObtain.setAlignment(params.getAlignment());
        builderObtain.setMaxLines(params.getMaxLines());
        builderObtain.setEllipsize(params.getEllipsize());
        builderObtain.setEllipsizedWidth(params.getEllipsizedWidth());
        builderObtain.setLineSpacing(params.getLineSpacingExtra(), params.getLineSpacingMultiplier());
        builderObtain.setIncludePad(params.getIncludePadding());
        builderObtain.setBreakStrategy(params.getBreakStrategy());
        builderObtain.setHyphenationFrequency(params.getHyphenationFrequency());
        builderObtain.setIndents(params.getLeftIndents(), params.getRightIndents());
        int i = Build.VERSION.SDK_INT;
        n7c.a(builderObtain, params.getJustificationMode());
        o7c.a(builderObtain, params.getUseFallbackLineSpacing());
        if (i >= 33) {
            v7c.b(builderObtain, params.getLineBreakStyle(), params.getLineBreakWordStyle());
        }
        if (i >= 35) {
            x7c.a(builderObtain);
        }
        return builderObtain.build();
    }
}
