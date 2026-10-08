package com.google.inputmethod;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import androidx.compose.ui.text.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a3\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/google/android/brc;", "Landroid/content/Context;", "context", "", "editable", "", "text", "Landroidx/compose/ui/text/x;", "selection", "", "b", "(Lcom/google/android/brc;Landroid/content/Context;ZLjava/lang/CharSequence;J)V", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ao9 {
    public static final void b(brc brcVar, Context context, final boolean z, final CharSequence charSequence, final long j) {
        if (!up1.isSmartSelectionEnabled || x.h(j) || charSequence.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        final Context context2 = context;
        List<ResolveInfo> listJ = xn9.a.j(context2);
        if (listJ.isEmpty()) {
            return;
        }
        brcVar.d();
        int size = listJ.size();
        int i = 0;
        while (i < size) {
            final ResolveInfo resolveInfo = listJ.get(i);
            drc.b(brcVar, new yn9(i), resolveInfo.loadLabel(packageManager).toString(), 0, new Function1() { // from class: com.google.android.zn9
                public final Object invoke(Object obj) {
                    return ao9.c(context2, resolveInfo, z, charSequence, j, (rrc) obj);
                }
            }, 4, null);
            i++;
            context2 = context;
        }
        brcVar.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(Context context, ResolveInfo resolveInfo, boolean z, CharSequence charSequence, long j, rrc rrcVar) {
        xn9.a.e().invoke(context, resolveInfo, Boolean.valueOf(z), charSequence, x.b(j));
        rrcVar.close();
        return Unit.a;
    }
}
