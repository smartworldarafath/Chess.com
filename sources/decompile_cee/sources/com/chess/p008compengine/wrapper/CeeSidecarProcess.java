package com.chess.p008compengine.wrapper;

import com.chess.entities.Color;
import com.chess.logging.f;
import com.chess.p008compengine.CeeException;
import com.chess.p008compengine.b0;
import com.chess.p008compengine.k0;
import com.chess.p008compengine.x0;
import com.google.android.oda;
import com.google.android.qjd;
import com.google.android.rw0;
import com.google.android.ta2;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001cB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010#R\u0014\u0010&\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010#¨\u0006'"}, d2 = {"Lcom/chess/compengine/wrapper/CeeSidecarProcess;", "", "Lcom/chess/compengine/x0;", "coroutineContextFactory", "Lcom/chess/compengine/b0;", "logger", "Lcom/google/android/ta2;", "scope", "Lcom/chess/compengine/k0;", "filesystem", "", "sessionId", "<init>", "(Lcom/chess/compengine/x0;Lcom/chess/compengine/b0;Lcom/google/android/ta2;Lcom/chess/compengine/k0;I)V", "", "tag", "Lkotlin/Function0;", "Ljava/io/InputStream;", "stream", "", "f", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "Ljava/lang/Process;", "proc", "e", "(Ljava/lang/Process;)V", "g", "()V", "a", "Lcom/chess/compengine/x0;", "b", "Lcom/chess/compengine/b0;", "c", "Lcom/google/android/ta2;", "d", "Ljava/lang/String;", "driverPath", "nativeLibDir", "socketPath", "impl_release"}, k = 1, mv = {Color.BLACK_INT, Color.BLACK_INT, Color.NONE_INT}, xi = 48)
public final class CeeSidecarProcess {
    private static final String h;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final x0 coroutineContextFactory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final b0 logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final ta2 scope;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String driverPath;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String nativeLibDir;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String socketPath;

    /* JADX WARN: Code duplicated, block: B:6:0x0027  */
    static {
        String str;
        String strT = oda.b(CeeSidecarProcess.class).t();
        if (strT != null) {
            str = "" + strT;
            if (str == null) {
                str = "anonymous";
            }
        } else {
            str = "anonymous";
        }
        h = str;
    }

    public CeeSidecarProcess(x0 x0Var, b0 b0Var, ta2 ta2Var, k0 k0Var, int i) {
        Intrinsics.checkNotNullParameter(x0Var, "coroutineContextFactory");
        Intrinsics.checkNotNullParameter(b0Var, "logger");
        Intrinsics.checkNotNullParameter(ta2Var, "scope");
        Intrinsics.checkNotNullParameter(k0Var, "filesystem");
        this.coroutineContextFactory = x0Var;
        this.logger = b0Var;
        this.scope = ta2Var;
        this.driverPath = k0Var.d();
        this.nativeLibDir = k0Var.e();
        this.socketPath = k0Var.c(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(Process proc) {
        ta2 ta2Var = this.scope;
        rw0.d(ta2Var, this.coroutineContextFactory.a(ta2Var, "binary_engine_crash_monitor"), (CoroutineStart) null, new CeeSidecarProcess$monitorProcessForCrashes$1(this, proc, null), 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(String tag, Function0<? extends InputStream> stream) {
        ta2 ta2Var = this.scope;
        rw0.d(ta2Var, this.coroutineContextFactory.a(ta2Var, "binary_engine_" + tag), (CoroutineStart) null, new CeeSidecarProcess$pipeStream$1(stream, this, tag, null), 2, (Object) null);
    }

    public final void g() throws CeeException, IOException {
        String str = null;
        if (!new File(this.driverPath).exists()) {
            throw new CeeException("cee-driver binary not found at " + this.driverPath, str, 2, str);
        }
        f.b.a(h, "Starting cee-driver: " + this.driverPath + " --socket " + this.socketPath);
        Map<? extends String, ? extends String> mapF = kotlin.collections.b0.f(qjd.a("LD_LIBRARY_PATH", this.nativeLibDir));
        ProcessBuilder processBuilder = new ProcessBuilder(this.driverPath, "--socket", this.socketPath, "--liveness-timeout-seconds", "0");
        processBuilder.environment().putAll(mapF);
        rw0.d(this.scope, (CoroutineContext) null, (CoroutineStart) null, new CeeSidecarProcess$start$1(this, processBuilder.start(), null), 3, (Object) null);
    }
}
