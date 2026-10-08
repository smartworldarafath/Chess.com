package androidx.compose.p002material3;

import androidx.compose.p004runtime.s0;
import com.google.android.a68;
import com.google.android.g41;
import com.google.android.oq2;
import com.google.android.q22;
import com.google.android.x58;
import com.google.inputmethod.jvb;
import com.google.inputmethod.o58;
import com.google.inputmethod.t04;
import com.google.inputmethod.xvb;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.f;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.e;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0018\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R/\u0010\u001d\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00168F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Landroidx/compose/material3/SnackbarHostState;", "", "<init>", "()V", "", "message", "actionLabel", "", "withDismissAction", "Landroidx/compose/material3/SnackbarDuration;", "duration", "Landroidx/compose/material3/SnackbarResult;", "e", "(Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/material3/SnackbarDuration;Lcom/google/android/q22;)Ljava/lang/Object;", "Lcom/google/android/xvb;", "visuals", "d", "(Lcom/google/android/xvb;Lcom/google/android/q22;)Ljava/lang/Object;", "Lcom/google/android/x58;", "a", "Lcom/google/android/x58;", "mutex", "Lcom/google/android/jvb;", "<set-?>", "b", "Lcom/google/android/o58;", "()Lcom/google/android/jvb;", "c", "(Lcom/google/android/jvb;)V", "currentSnackbarData", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SnackbarHostState {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final x58 mutex = a68.b(false, 1, (Object) null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final o58 currentSnackbarData = s0.e(null, null, 2, null);

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/material3/SnackbarHostState$a;", "Lcom/google/android/jvb;", "Lcom/google/android/xvb;", "visuals", "Lcom/google/android/g41;", "Landroidx/compose/material3/SnackbarResult;", "continuation", "<init>", "(Lcom/google/android/xvb;Lcom/google/android/g41;)V", "", "b", "()V", "dismiss", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Lcom/google/android/xvb;", "()Lcom/google/android/xvb;", "Lcom/google/android/g41;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class a implements jvb {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final xvb visuals;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final g41<SnackbarResult> continuation;

        /* JADX WARN: Multi-variable type inference failed */
        public a(xvb xvbVar, g41<? super SnackbarResult> g41Var) {
            this.visuals = xvbVar;
            this.continuation = g41Var;
        }

        @Override // com.google.inputmethod.jvb
        /* JADX INFO: renamed from: a, reason: from getter */
        public xvb getVisuals() {
            return this.visuals;
        }

        @Override // com.google.inputmethod.jvb
        public void b() {
            if (this.continuation.b()) {
                g41<SnackbarResult> g41Var = this.continuation;
                Result.a aVar = Result.a;
                g41Var.resumeWith(Result.b(SnackbarResult.ActionPerformed));
            }
        }

        @Override // com.google.inputmethod.jvb
        public void dismiss() {
            if (this.continuation.b()) {
                g41<SnackbarResult> g41Var = this.continuation;
                Result.a aVar = Result.a;
                g41Var.resumeWith(Result.b(SnackbarResult.Dismissed));
            }
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || a.class != other.getClass()) {
                return false;
            }
            a aVar = (a) other;
            return Intrinsics.e(getVisuals(), aVar.getVisuals()) && Intrinsics.e(this.continuation, aVar.continuation);
        }

        public int hashCode() {
            return (getVisuals().hashCode() * 31) + this.continuation.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Landroidx/compose/material3/SnackbarHostState$b;", "Lcom/google/android/xvb;", "", "message", "actionLabel", "", "withDismissAction", "Landroidx/compose/material3/SnackbarDuration;", "duration", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/material3/SnackbarDuration;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "b", "c", "Z", "()Z", "d", "Landroidx/compose/material3/SnackbarDuration;", "getDuration", "()Landroidx/compose/material3/SnackbarDuration;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class b implements xvb {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String message;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String actionLabel;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean withDismissAction;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final SnackbarDuration duration;

        public b(String str, String str2, boolean z, SnackbarDuration snackbarDuration) {
            this.message = str;
            this.actionLabel = str2;
            this.withDismissAction = z;
            this.duration = snackbarDuration;
        }

        @Override // com.google.inputmethod.xvb
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getActionLabel() {
            return this.actionLabel;
        }

        @Override // com.google.inputmethod.xvb
        /* JADX INFO: renamed from: b, reason: from getter */
        public boolean getWithDismissAction() {
            return this.withDismissAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || b.class != other.getClass()) {
                return false;
            }
            b bVar = (b) other;
            return Intrinsics.e(getMessage(), bVar.getMessage()) && Intrinsics.e(getActionLabel(), bVar.getActionLabel()) && getWithDismissAction() == bVar.getWithDismissAction() && getDuration() == bVar.getDuration();
        }

        @Override // com.google.inputmethod.xvb
        public SnackbarDuration getDuration() {
            return this.duration;
        }

        @Override // com.google.inputmethod.xvb
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            int iHashCode = getMessage().hashCode() * 31;
            String actionLabel = getActionLabel();
            return ((((iHashCode + (actionLabel != null ? actionLabel.hashCode() : 0)) * 31) + Boolean.hashCode(getWithDismissAction())) * 31) + getDuration().hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(jvb jvbVar) {
        this.currentSnackbarData.setValue(jvbVar);
    }

    public static /* synthetic */ Object f(SnackbarHostState snackbarHostState, String str, String str2, boolean z, SnackbarDuration snackbarDuration, q22 q22Var, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            snackbarDuration = str3 == null ? SnackbarDuration.Short : SnackbarDuration.Indefinite;
        }
        return snackbarHostState.e(str, str3, z2, snackbarDuration, q22Var);
    }

    public final jvb b() {
        return (jvb) this.currentSnackbarData.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(xvb xvbVar, q22<? super SnackbarResult> q22Var) {
        SnackbarHostState$showSnackbar$2 snackbarHostState$showSnackbar$2;
        x58 x58Var;
        Throwable th;
        x58 x58Var2;
        if (q22Var instanceof SnackbarHostState$showSnackbar$2) {
            snackbarHostState$showSnackbar$2 = (SnackbarHostState$showSnackbar$2) q22Var;
            int i = snackbarHostState$showSnackbar$2.label;
            if ((i & t04.INVALID_ID) != 0) {
                snackbarHostState$showSnackbar$2.label = i - t04.INVALID_ID;
            } else {
                snackbarHostState$showSnackbar$2 = new SnackbarHostState$showSnackbar$2(this, q22Var);
            }
        } else {
            snackbarHostState$showSnackbar$2 = new SnackbarHostState$showSnackbar$2(this, q22Var);
        }
        Object obj = snackbarHostState$showSnackbar$2.result;
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i2 = snackbarHostState$showSnackbar$2.label;
        try {
            try {
                if (i2 == 0) {
                    f.b(obj);
                    x58Var = this.mutex;
                    snackbarHostState$showSnackbar$2.L$0 = xvbVar;
                    snackbarHostState$showSnackbar$2.L$1 = x58Var;
                    snackbarHostState$showSnackbar$2.label = 1;
                    if (x58Var.g((Object) null, snackbarHostState$showSnackbar$2) != objG) {
                    }
                    return objG;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    x58Var2 = (x58) snackbarHostState$showSnackbar$2.L$1;
                    try {
                        f.b(obj);
                        c(null);
                        x58Var2.h((Object) null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        c(null);
                        throw th;
                    }
                }
                x58 x58Var3 = (x58) snackbarHostState$showSnackbar$2.L$1;
                xvb xvbVar2 = (xvb) snackbarHostState$showSnackbar$2.L$0;
                f.b(obj);
                x58Var = x58Var3;
                xvbVar = xvbVar2;
                snackbarHostState$showSnackbar$2.L$0 = xvbVar;
                snackbarHostState$showSnackbar$2.L$1 = x58Var;
                snackbarHostState$showSnackbar$2.L$2 = snackbarHostState$showSnackbar$2;
                snackbarHostState$showSnackbar$2.label = 2;
                e eVar = new e(kotlin.coroutines.intrinsics.a.d(snackbarHostState$showSnackbar$2), 1);
                eVar.G();
                c(new a(xvbVar, eVar));
                Object objY = eVar.y();
                if (objY == kotlin.coroutines.intrinsics.a.g()) {
                    oq2.c(snackbarHostState$showSnackbar$2);
                }
                if (objY != objG) {
                    x58 x58Var4 = x58Var;
                    obj = objY;
                    x58Var2 = x58Var4;
                    c(null);
                    x58Var2.h((Object) null);
                    return obj;
                }
                return objG;
            } catch (Throwable th3) {
                th = th3;
                c(null);
                throw th;
            }
        } catch (Throwable th4) {
            xvbVar.h((Object) null);
            throw th4;
        }
    }

    public final Object e(String str, String str2, boolean z, SnackbarDuration snackbarDuration, q22<? super SnackbarResult> q22Var) {
        return d(new b(str, str2, z, snackbarDuration), q22Var);
    }
}
