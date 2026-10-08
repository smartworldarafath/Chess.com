package androidx.activity.android;

import com.google.android.ai4;
import com.google.android.h81;
import com.google.android.p81;
import com.google.android.q22;
import com.google.android.rw0;
import com.google.android.ta2;
import com.google.inputmethod.BackEventCompat;
import com.google.inputmethod.uc0;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.a;
import kotlinx.coroutines.channels.h;
import kotlinx.coroutines.s;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\nJ\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014RD\u0010\u001e\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R$\u0010-\u001a\u00020%2\u0006\u0010)\u001a\u00020%8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b&\u0010,¨\u0006."}, d2 = {"Landroidx/activity/compose/ComposePredictiveBackHandler;", "Lcom/google/android/uc0;", "Lcom/google/android/ta2;", "scope", "Landroidx/activity/compose/a;", "info", "<init>", "(Lcom/google/android/ta2;Landroidx/activity/compose/a;)V", "", "k", "()V", "Lcom/google/android/tc0;", "event", "g", "(Lcom/google/android/tc0;)V", "f", "e", "d", "Lcom/google/android/ta2;", "getScope", "()Lcom/google/android/ta2;", "Lkotlin/Function2;", "Lcom/google/android/ai4;", "Lcom/google/android/q22;", "", "Lkotlin/jvm/functions/Function2;", "j", "()Lkotlin/jvm/functions/Function2;", "l", "(Lkotlin/jvm/functions/Function2;)V", "currentOnBack", "Lcom/google/android/h81;", "Lcom/google/android/h81;", "activeChannel", "Lkotlinx/coroutines/s;", "Lkotlinx/coroutines/s;", "activeJob", "", "h", "Z", "isPredictiveBack", "value", "c", "()Z", "(Z)V", "isBackEnabled", "activity-compose"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ComposePredictiveBackHandler extends uc0 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final ta2 scope;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private Function2<? super ai4<BackEventCompat>, ? super q22<? super Unit>, ? extends Object> currentOnBack;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private h81<BackEventCompat> activeChannel;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private s activeJob;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean isPredictiveBack;

    public ComposePredictiveBackHandler(ta2 ta2Var, PredictiveBackHandlerInfo predictiveBackHandlerInfo) {
        super(predictiveBackHandlerInfo);
        this.scope = ta2Var;
        this.currentOnBack = new ai4(null);
    }

    private final void k() {
        this.activeChannel = p81.b(-2, BufferOverflow.a, (Function1) null, 4, (Object) null);
        this.activeJob = rw0.d(this.scope, (CoroutineContext) null, (CoroutineStart) null, new ta2(this, null), 3, (Object) null);
    }

    @Override // com.google.inputmethod.uc0
    public boolean c() {
        return super.c();
    }

    @Override // com.google.inputmethod.uc0
    public void d() {
        h81<BackEventCompat> h81Var = this.activeChannel;
        if (h81Var != null) {
            h81Var.k(new CancellationException("onBack cancelled"));
        }
        s sVar = this.activeJob;
        if (sVar != null) {
            s.a.a(sVar, (CancellationException) null, 1, (Object) null);
        }
        this.activeChannel = null;
        this.activeJob = null;
        this.isPredictiveBack = false;
    }

    @Override // com.google.inputmethod.uc0
    public void e() {
        if (this.activeChannel != null && !this.isPredictiveBack) {
            d();
        }
        if (this.activeChannel == null) {
            this.isPredictiveBack = false;
            k();
        }
        h81<BackEventCompat> h81Var = this.activeChannel;
        if (h81Var != null) {
            h.a.a(h81Var, (Throwable) null, 1, (Object) null);
        }
        this.isPredictiveBack = false;
    }

    @Override // com.google.inputmethod.uc0
    public void f(BackEventCompat event) {
        h81<BackEventCompat> h81Var = this.activeChannel;
        if (h81Var != null) {
            a.b(h81Var.e(event));
        }
    }

    @Override // com.google.inputmethod.uc0
    public void g(BackEventCompat event) {
        d();
        if (c()) {
            this.isPredictiveBack = true;
            k();
        }
    }

    @Override // com.google.inputmethod.uc0
    public void h(boolean z) {
        s sVar;
        if (!z && super.c() && (sVar = this.activeJob) != null && !sVar.b()) {
            d();
        }
        super.h(z);
    }

    public final Function2<ai4<BackEventCompat>, q22<? super Unit>, Object> j() {
        return this.currentOnBack;
    }

    public final void l(Function2<? super ai4<BackEventCompat>, ? super q22<? super Unit>, ? extends Object> function2) {
        this.currentOnBack = function2;
    }
}
