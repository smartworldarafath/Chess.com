package com.google.inputmethod;

import android.content.Context;
import androidx.compose.p001foundation.text.contextmenu.modifier.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\b\u0010\tR4\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/google/android/kb;", "Lcom/google/android/k33;", "Lcom/google/android/bs1;", "Lkotlin/Function2;", "Lcom/google/android/brc;", "Landroid/content/Context;", "", "builder", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "r", "Lkotlin/jvm/functions/Function2;", "getBuilder", "()Lkotlin/jvm/functions/Function2;", "u3", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class kb extends k33 implements bs1 {

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private Function2<? super brc, ? super Context, Unit> builder;

    public kb(Function2<? super brc, ? super Context, Unit> function2) {
        this.builder = function2;
        m3(new a(new Function1() { // from class: com.google.android.jb
            public final Object invoke(Object obj) {
                return kb.t3(this.a, (brc) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t3(kb kbVar, brc brcVar) {
        kbVar.builder.invoke(brcVar, cs1.a(kbVar, AndroidCompositionLocals_androidKt.c()));
        return Unit.a;
    }

    public final void u3(Function2<? super brc, ? super Context, Unit> function2) {
        this.builder = function2;
    }
}
