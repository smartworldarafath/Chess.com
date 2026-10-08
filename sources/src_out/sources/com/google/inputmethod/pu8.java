package com.google.inputmethod;

import android.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/google/android/pu8;", "", "<init>", "()V", "Landroid/graphics/Outline;", "outline", "Landroidx/compose/ui/graphics/Path;", "path", "", "a", "(Landroid/graphics/Outline;Landroidx/compose/ui/graphics/Path;)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class pu8 {
    public static final pu8 a = new pu8();

    private pu8() {
    }

    public final void a(Outline outline, Path path) {
        if (!(path instanceof c)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setPath(((c) path).getInternalPath());
    }
}
