package com.google.inputmethod;

import androidx.compose.ui.focus.FocusProperties;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\u0003R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR$\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/google/android/z31;", "Landroidx/compose/ui/focus/FocusProperties;", "<init>", "()V", "", "q", "()Z", "", "r", "c", "Ljava/lang/Boolean;", "canFocusValue", "value", "m", "h", "(Z)V", "canFocus", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class z31 implements FocusProperties {
    public static final z31 b = new z31();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static Boolean canFocusValue;

    private z31() {
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void h(boolean z) {
        canFocusValue = Boolean.valueOf(z);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.ui.focus.FocusProperties
    public boolean m() throws KotlinNothingValueException {
        Boolean bool = canFocusValue;
        if (bool != null) {
            return bool.booleanValue();
        }
        zw5.d("canFocus is read before it is written");
        throw new KotlinNothingValueException();
    }

    public final boolean q() {
        return canFocusValue != null;
    }

    public final void r() {
        canFocusValue = null;
    }
}
