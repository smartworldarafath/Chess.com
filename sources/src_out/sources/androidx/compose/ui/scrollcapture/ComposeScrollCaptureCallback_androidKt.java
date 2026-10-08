package androidx.compose.ui.scrollcapture;

import android.os.CancellationSignal;
import androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback_androidKt;
import com.google.android.q22;
import com.google.android.rw0;
import com.google.android.ta2;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.s;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/google/android/ta2;", "Landroid/os/CancellationSignal;", "signal", "Lkotlin/Function2;", "Lcom/google/android/q22;", "", "", "block", "Lkotlinx/coroutines/s;", "c", "(Lcom/google/android/ta2;Landroid/os/CancellationSignal;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/s;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ComposeScrollCaptureCallback_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final s c(ta2 ta2Var, final CancellationSignal cancellationSignal, Function2<? super ta2, ? super q22<? super Unit>, ? extends Object> function2) {
        final s sVarD = rw0.d(ta2Var, (CoroutineContext) null, (CoroutineStart) null, function2, 3, (Object) null);
        sVarD.A(new Function1<Throwable, Unit>() { // from class: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback_androidKt$launchWithCancellationSignal$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.a;
            }

            public final void invoke(Throwable th) {
                if (th != null) {
                    cancellationSignal.cancel();
                }
            }
        });
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: com.google.android.eq1
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                ComposeScrollCaptureCallback_androidKt.d(sVarD);
            }
        });
        return sVarD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(s sVar) {
        s.a.a(sVar, (CancellationException) null, 1, (Object) null);
    }
}
