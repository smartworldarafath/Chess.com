package com.chess.p008compengine.v2;

import com.chess.entities.Color;
import com.chess.p008compengine.CeeVersion;
import com.chess.p008compengine.UciIssueLogger;
import com.chess.p008compengine.k0;
import com.chess.p008compengine.p1;
import com.chess.p008compengine.q0;
import com.chess.p008compengine.q1;
import com.chess.p008compengine.x0;
import com.facebook.common.callercontext.ContextChain;
import com.google.android.bw0;
import com.google.android.h81;
import com.google.android.iaa;
import com.google.android.kp8;
import com.google.android.lq2;
import com.google.android.m94;
import com.google.android.ox3;
import com.google.android.p81;
import com.google.android.q22;
import com.google.android.qjd;
import com.google.android.rw0;
import com.google.android.ta2;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.b0;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.h;
import kotlinx.coroutines.u;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes6.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 :2\u00020\u0001:\u0001\u001dB?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0016J#\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00122\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00120%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R \u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R \u00109\u001a\b\u0012\u0004\u0012\u00020\u0012058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b \u00108¨\u0006;"}, d2 = {"Lcom/chess/compengine/v2/ExternalUciEngine;", "Lcom/chess/compengine/v2/z1;", "Lcom/google/android/ta2;", "scope", "Lcom/chess/compengine/k0;", "filesystem", "Lcom/chess/compengine/UciIssueLogger;", "uciIssueLogger", "Lcom/chess/compengine/q1;", "uciEngineLoggerFactory", "Lcom/chess/compengine/x0;", "coroutineContextFactory", "Lcom/chess/compengine/q0;", "engineTag", "Lcom/chess/compengine/CeeVersion;", "ceeVersion", "<init>", "(Lcom/google/android/ta2;Lcom/chess/compengine/k0;Lcom/chess/compengine/UciIssueLogger;Lcom/chess/compengine/q1;Lcom/chess/compengine/x0;Lcom/chess/compengine/q0;Lcom/chess/compengine/CeeVersion;)V", "", "uciExchange", "", "n", "(Ljava/lang/String;)V", "line", "send", "message", "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", "a", "(Ljava/lang/String;Ljava/lang/Exception;)V", "Lcom/chess/compengine/UciIssueLogger;", "b", "Lcom/chess/compengine/q0;", "c", "Ljava/lang/String;", "tag", "Lcom/google/android/h81;", "d", "Lcom/google/android/h81;", "engineLines", "Lcom/google/android/bw0;", "e", "Lcom/google/android/bw0;", "sink", "Lcom/chess/compengine/p1;", "f", "Lcom/chess/compengine/p1;", "uciEngineLogger", "", "g", "Ljava/util/Map;", "engineMetadata", "Lcom/google/android/iaa;", "h", "Lcom/google/android/iaa;", "()Lcom/google/android/iaa;", "lines", ContextChain.TAG_INFRA, "v2"}, k = 1, mv = {Color.BLACK_INT, Color.BLACK_INT, Color.NONE_INT}, xi = 48)
public final class ExternalUciEngine implements z1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final UciIssueLogger uciIssueLogger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final q0 engineTag;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String tag;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final h81<String> engineLines;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private bw0 sink;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final p1 uciEngineLogger;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Map<String, String> engineMetadata;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final iaa<String> lines;

    /* JADX INFO: renamed from: com.chess.compengine.v2.ExternalUciEngine$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {Color.BLACK_INT, Color.BLACK_INT, Color.NONE_INT})
    @lq2(c = "com.chess.compengine.v2.ExternalUciEngine$2", f = "UciEngine.kt", l = {}, m = "invokeSuspend", v = 1)
    static final class AnonymousClass2 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
        final /* synthetic */ File $errorLog;
        final /* synthetic */ Process $process;
        final /* synthetic */ AtomicBoolean $receivedAnyLine;
        int label;
        final /* synthetic */ ExternalUciEngine this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Process process, AtomicBoolean atomicBoolean, ExternalUciEngine externalUciEngine, File file, q22<? super AnonymousClass2> q22Var) {
            super(2, q22Var);
            this.$process = process;
            this.$receivedAnyLine = atomicBoolean;
            this.this$0 = externalUciEngine;
            this.$errorLog = file;
        }

        public final q22<Unit> create(Object obj, q22<?> q22Var) {
            return new AnonymousClass2(this.$process, this.$receivedAnyLine, this.this$0, this.$errorLog, q22Var);
        }

        public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
            return create(ta2Var, q22Var).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(Object obj) throws InterruptedException {
            a.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            int iWaitFor = this.$process.waitFor();
            if (!this.$receivedAnyLine.get()) {
                this.this$0.uciEngineLogger.log("Failed to start, code=" + iWaitFor);
                com.chess.logging.f.b.h("UCI_ENGINE", "Failed to start the Engine(" + this.this$0.tag + ") (error code: " + iWaitFor + ")");
            } else if (iWaitFor == 0 || iWaitFor == 137) {
                com.chess.logging.f.b.a("UCI_ENGINE", "Engine(" + this.this$0.tag + ") terminated nominally");
            } else {
                String strM = m94.m(this.$errorLog, (Charset) null, 1, (Object) null);
                this.this$0.uciEngineLogger.log("Terminated abnormally, code=" + iWaitFor + ", stderr=" + strM);
                com.chess.logging.f.b.j("UCI_ENGINE", new ChessEngineCrash(iWaitFor, this.this$0.tag, strM), "Engine(" + this.this$0.tag + ") terminated abnormally with code: " + iWaitFor);
                this.this$0.uciIssueLogger.a(UciIssueLogger.UciIssueTag.CEE_CRASH, strM, this.this$0.engineTag, b0.u(this.this$0.engineMetadata, qjd.a("exitCode", String.valueOf(iWaitFor))), this.this$0.uciEngineLogger);
            }
            h.a.a(this.this$0.engineLines, (Throwable) null, 1, (Object) null);
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: com.chess.compengine.v2.ExternalUciEngine$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {Color.BLACK_INT, Color.BLACK_INT, Color.NONE_INT})
    @lq2(c = "com.chess.compengine.v2.ExternalUciEngine$4", f = "UciEngine.kt", l = {157}, m = "invokeSuspend", v = 1)
    static final class AnonymousClass4 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
        final /* synthetic */ Process $process;
        final /* synthetic */ AtomicBoolean $receivedAnyLine;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ ExternalUciEngine this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(Process process, AtomicBoolean atomicBoolean, ExternalUciEngine externalUciEngine, q22<? super AnonymousClass4> q22Var) {
            super(2, q22Var);
            this.$process = process;
            this.$receivedAnyLine = atomicBoolean;
            this.this$0 = externalUciEngine;
        }

        public final q22<Unit> create(Object obj, q22<?> q22Var) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$process, this.$receivedAnyLine, this.this$0, q22Var);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
            return create(ta2Var, q22Var).invokeSuspend(Unit.a);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:28:0x003f
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instruction units count: 250
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.chess.p008compengine.v2.ExternalUciEngine.AnonymousClass4.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public ExternalUciEngine(ta2 ta2Var, k0 k0Var, UciIssueLogger uciIssueLogger, q1 q1Var, x0 x0Var, q0 q0Var, CeeVersion ceeVersion) {
        Object objB;
        final ExternalUciEngine externalUciEngine;
        Object objB2;
        Intrinsics.checkNotNullParameter(ta2Var, "scope");
        Intrinsics.checkNotNullParameter(k0Var, "filesystem");
        Intrinsics.checkNotNullParameter(uciIssueLogger, "uciIssueLogger");
        Intrinsics.checkNotNullParameter(q1Var, "uciEngineLoggerFactory");
        Intrinsics.checkNotNullParameter(x0Var, "coroutineContextFactory");
        Intrinsics.checkNotNullParameter(q0Var, "engineTag");
        Intrinsics.checkNotNullParameter(ceeVersion, "ceeVersion");
        this.uciIssueLogger = uciIssueLogger;
        this.engineTag = q0Var;
        String string = q0Var.toString();
        this.tag = string;
        this.engineLines = p81.b(0, (BufferOverflow) null, (Function1) null, 7, (Object) null);
        this.sink = kp8.c(kp8.b());
        this.uciEngineLogger = q1Var.b(string);
        this.engineMetadata = b0.f(qjd.a("cee_version", ceeVersion.d()));
        u.k(ta2Var.getCoroutineContext()).A(new Function1() { // from class: com.chess.compengine.v2.c0
            public final Object invoke(Object obj) {
                return ExternalUciEngine.e(this.a, (Throwable) obj);
            }
        });
        final File fileB = k0Var.b();
        ProcessBuilder processBuilder = new ProcessBuilder(k0Var.g());
        Map<String, String> mapEnvironment = processBuilder.environment();
        Intrinsics.checkNotNullExpressionValue(mapEnvironment, "environment(...)");
        mapEnvironment.put("LD_LIBRARY_PATH", k0Var.e());
        ProcessBuilder processBuilderF = k0Var.f(processBuilder, fileB);
        try {
            Result.a aVar = Result.a;
            objB = Result.b(processBuilderF.start());
        } catch (Throwable th) {
            Result.a aVar2 = Result.a;
            objB = Result.b(f.a(th));
        }
        Object obj = objB;
        Throwable thE = Result.e(obj);
        if (thE != null) {
            try {
                String strM = m94.m(fileB, (Charset) null, 1, (Object) null);
                fileB.delete();
                objB2 = Result.b(strM);
            } catch (Throwable th2) {
                Result.a aVar3 = Result.a;
                objB2 = Result.b(f.a(th2));
            }
            String str = (String) (Result.g(objB2) ? null : objB2);
            String str2 = str == null ? "" : str;
            com.chess.logging.f.b.j("UCI_ENGINE", new ChessEngineLaunchException(thE, this.tag, str2), "Engine(" + this.tag + ") UCI process crashed");
            this.uciIssueLogger.a(UciIssueLogger.UciIssueTag.CEE_LAUNCH_FAILURE, str2, this.engineTag, b0.u(this.engineMetadata, qjd.a("stacktrace", ox3.c(thE))), this.uciEngineLogger);
        }
        if (Result.h(obj)) {
            com.chess.logging.f.b.a("UCI_ENGINE", "Engine(" + this.tag + ") UCI process started: " + ((Process) obj));
        }
        Process process = (Process) (Result.g(obj) ? null : obj);
        if (process != null) {
            OutputStream outputStream = process.getOutputStream();
            Intrinsics.checkNotNullExpressionValue(outputStream, "getOutputStream(...)");
            this.sink = kp8.c(kp8.g(outputStream));
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            externalUciEngine = this;
            rw0.d(ta2Var, x0Var.a(ta2Var, "uci_engine_monitor"), (CoroutineStart) null, new AnonymousClass2(process, atomicBoolean, this, fileB, null), 2, (Object) null).A(new Function1() { // from class: com.chess.compengine.v2.d0
                public final Object invoke(Object obj2) {
                    return ExternalUciEngine.f(this.a, fileB, (Throwable) obj2);
                }
            });
            rw0.d(ta2Var, x0Var.a(ta2Var, "uci_engine_reader"), (CoroutineStart) null, new AnonymousClass4(process, atomicBoolean, externalUciEngine, null), 2, (Object) null);
        } else {
            externalUciEngine = this;
        }
        externalUciEngine.lines = externalUciEngine.engineLines;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(ExternalUciEngine externalUciEngine, Throwable th) throws IOException {
        externalUciEngine.uciEngineLogger.close();
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(ExternalUciEngine externalUciEngine, File file, Throwable th) {
        try {
            Result.a aVar = Result.a;
            Result.b(Boolean.valueOf(file.delete()));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.a;
            Result.b(f.a(th2));
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(String uciExchange) {
        com.chess.logging.f.b.m("UCI_ENGINE", "UCI(" + this.tag + ") " + uciExchange);
        p1 p1Var = this.uciEngineLogger;
        StringBuilder sb = new StringBuilder();
        sb.append("UCI ");
        sb.append(uciExchange);
        p1Var.log(sb.toString());
    }

    @Override // com.chess.p008compengine.v2.z1
    public void a(String message, Exception error) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(error, "error");
        this.uciIssueLogger.a(UciIssueLogger.UciIssueTag.CEE_ERROR, message, this.engineTag, b0.u(this.engineMetadata, qjd.a("stacktrace", ox3.c(error))), this.uciEngineLogger);
    }

    @Override // com.chess.p008compengine.v2.z1
    public iaa<String> b() {
        return this.lines;
    }

    @Override // com.chess.p008compengine.v2.z1
    public synchronized void send(String line) {
        Intrinsics.checkNotNullParameter(line, "line");
        try {
            n("<- " + line);
            this.sink.G1(line + "\n");
            this.sink.flush();
        } catch (IOException unused) {
        }
    }
}
