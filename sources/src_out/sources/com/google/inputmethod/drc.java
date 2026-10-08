package com.google.inputmethod;

import android.view.textclassifier.TextClassification;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a?\u0010\u000b\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a+\u0010\u0010\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/google/android/brc;", "", "key", "", "label", "", "leadingIcon", "Lkotlin/Function1;", "Lcom/google/android/rrc;", "", "onClick", "a", "(Lcom/google/android/brc;Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/functions/Function1;)V", "Landroid/view/textclassifier/TextClassification;", "textClassification", "index", "c", "(Lcom/google/android/brc;Ljava/lang/Object;Landroid/view/textclassifier/TextClassification;I)V", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class drc {
    public static final void a(brc brcVar, Object obj, String str, int i, Function1<? super rrc, Unit> function1) {
        brcVar.a(new TextContextMenuItem(obj, str, i, function1));
    }

    public static /* synthetic */ void b(brc brcVar, Object obj, String str, int i, Function1 function1, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        a(brcVar, obj, str, i, function1);
    }

    public static final void c(brc brcVar, Object obj, TextClassification textClassification, int i) {
        brcVar.a(new TextContextMenuRemoteActionItem(obj, textClassification, i));
    }
}
