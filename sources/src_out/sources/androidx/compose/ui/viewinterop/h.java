package androidx.compose.ui.viewinterop;

import android.view.View;
import androidx.compose.ui.focus.FocusProperties;
import com.google.inputmethod.gba;
import com.google.inputmethod.tk4;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/viewinterop/h;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/tk4;", "<init>", "()V", "Landroidx/compose/ui/focus/FocusProperties;", "focusProperties", "", "m2", "(Landroidx/compose/ui/focus/FocusProperties;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class h extends androidx.compose.ui.b.c implements tk4 {
    @Override // com.google.inputmethod.tk4
    public void m2(FocusProperties focusProperties) {
        gba gbaVarA;
        View viewG = d.g(this);
        focusProperties.h(getNode().getIsAttached() && d.g(this).hasFocusable());
        View viewFindFocus = viewG.findFocus();
        if (viewFindFocus == null || (gbaVarA = androidx.compose.ui.focus.c.a(viewFindFocus, viewG)) == null) {
            return;
        }
        focusProperties.d(gbaVarA);
    }
}
