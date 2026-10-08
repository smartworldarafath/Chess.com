package androidx.p008glance.p009appwidget;

import android.content.BroadcastReceiver;
import com.google.android.fc3;
import com.google.android.fec;
import com.google.android.q22;
import com.google.android.rw0;
import com.google.android.ta2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.j;
import kotlinx.coroutines.s;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aA\u0010\t\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroid/content/BroadcastReceiver;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lkotlin/Function2;", "Lcom/google/android/ta2;", "Lcom/google/android/q22;", "", "", "block", "a", "(Landroid/content/BroadcastReceiver;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)V", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CoroutineBroadcastReceiverKt {
    public static final void a(BroadcastReceiver broadcastReceiver, CoroutineContext coroutineContext, Function2<? super ta2, ? super q22<? super Unit>, ? extends Object> function2) {
        ta2 ta2VarA = j.a(fec.b((s) null, 1, (Object) null).plus(coroutineContext));
        rw0.d(ta2VarA, (CoroutineContext) null, (CoroutineStart) null, new ta2(function2, ta2VarA, broadcastReceiver.goAsync(), null), 3, (Object) null);
    }

    public static /* synthetic */ void b(BroadcastReceiver broadcastReceiver, CoroutineContext coroutineContext, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = fc3.a();
        }
        a(broadcastReceiver, coroutineContext, function2);
    }
}
