package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.h;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u0003R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/google/android/hwb;", "", "<init>", "()V", "T", "Lkotlinx/coroutines/channels/h;", "", "channel", "Lkotlin/Function0;", "block", "c", "(Lkotlinx/coroutines/channels/h;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "b", "(Lkotlinx/coroutines/channels/h;)V", "a", "Lcom/google/android/iwb;", "Lcom/google/android/iwb;", "managerImpl", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class hwb {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private iwb managerImpl = new msb();

    public final void a() {
        iwb iwbVar = this.managerImpl;
        if (!(iwbVar != null)) {
            ei9.b("Called dispose on a manager that has been disposed of");
        }
        iwbVar.c();
        this.managerImpl = null;
    }

    public final void b(h<? super Unit> channel) {
        iwb iwbVar = this.managerImpl;
        if (iwbVar != null) {
            iwbVar.f(channel);
        }
    }

    public final <T> T c(h<? super Unit> channel, Function0<? extends T> block) {
        msb msbVar;
        h<Unit> hVarK;
        if (!(this.managerImpl != null)) {
            ei9.b("Called runAndWatch on a manager that has been disposed of");
        }
        iwb iwbVar = this.managerImpl;
        if ((iwbVar instanceof msb) && (hVarK = (msbVar = (msb) iwbVar).k()) != null && !Intrinsics.e(hVarK, channel)) {
            this.managerImpl = msbVar.l();
        }
        iwb iwbVar2 = this.managerImpl;
        Intrinsics.g(iwbVar2);
        return (T) iwbVar2.g(channel, block);
    }
}
