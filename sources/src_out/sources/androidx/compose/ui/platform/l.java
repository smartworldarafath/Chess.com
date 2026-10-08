package androidx.compose.ui.platform;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.inputmethodservice.InputMethodService;
import android.view.View;
import com.google.android.lke;
import com.google.android.nke;
import com.google.inputmethod.ff3;
import com.google.inputmethod.hf3;
import com.google.inputmethod.ok;
import com.google.inputmethod.q16;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroid/view/View;", "view", "Landroidx/compose/ui/platform/t;", "a", "(Landroid/view/View;)Landroidx/compose/ui/platform/t;", "Landroid/content/Context;", "context", "b", "(Landroid/content/Context;)Landroid/content/Context;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l {
    public static final t a(View view) {
        Context context = view.getContext();
        Context contextB = b(context);
        if (contextB == null) {
            Configuration configuration = context.getResources().getConfiguration();
            return t.INSTANCE.a(hf3.a(ff3.i(configuration.screenWidthDp), ff3.i(configuration.screenHeightDp)), ok.a(context));
        }
        lke lkeVarA = nke.a.c().a(contextB);
        return t.INSTANCE.b(q16.c((((long) lkeVarA.a().width()) << 32) | (((long) lkeVarA.a().height()) & 4294967295L)), ok.a(contextB));
    }

    private static final Context b(Context context) {
        while (context instanceof ContextWrapper) {
            if ((context instanceof Activity) || (context instanceof InputMethodService) || (context instanceof Application)) {
                return context;
            }
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if (contextWrapper.getBaseContext() == null) {
                return null;
            }
            context = contextWrapper.getBaseContext();
        }
        return null;
    }
}
