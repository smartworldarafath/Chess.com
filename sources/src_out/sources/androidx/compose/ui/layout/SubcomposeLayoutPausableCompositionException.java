package androidx.compose.ui.layout;

import com.google.inputmethod.x06;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\f8VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeLayoutPausableCompositionException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "Lcom/google/android/x06;", "operations", "", "slotId", "", "cause", "<init>", "(Lcom/google/android/x06;Ljava/lang/Object;Ljava/lang/Throwable;)V", "", "", "a", "()Ljava/util/List;", "Lcom/google/android/x06;", "Ljava/lang/Object;", "getMessage", "()Ljava/lang/String;", "getMessage$annotations", "()V", "message", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class SubcomposeLayoutPausableCompositionException extends IllegalStateException {
    private final x06 operations;
    private final Object slotId;

    public SubcomposeLayoutPausableCompositionException(x06 x06Var, Object obj, Throwable th) {
        super(th);
        this.operations = x06Var;
        this.slotId = obj;
    }

    private final List<String> a() {
        String str;
        List listC = kotlin.collections.m.c();
        for (int i = this.operations._size - 1; i >= 0; i += -1) {
            int iE = this.operations.e(i);
            int iS = u.s(iE);
            u.Companion companion = u.INSTANCE;
            if (u.t(iS, companion.b())) {
                str = "CancelPausedPrecomposition";
            } else if (u.t(iS, companion.h())) {
                str = "ReuseForceSyncDeactivation";
            } else if (u.t(iS, companion.i())) {
                str = "ReuseScheduleOutOfFrameDeactivation";
            } else if (u.t(iS, companion.j())) {
                str = "ReuseSyncDeactivation";
            } else if (u.t(iS, companion.g())) {
                str = "ReuseDeactivationViaHost";
            } else if (u.t(iS, companion.r())) {
                str = "TookFromPrecomposeMap";
            } else if (u.t(iS, companion.n())) {
                str = "Subcompose";
            } else if (u.t(iS, companion.p())) {
                str = "SubcomposeNew";
            } else if (u.t(iS, companion.q())) {
                str = "SubcomposePausable";
            } else if (u.t(iS, companion.o())) {
                str = "SubcomposeForceReuse";
            } else if (u.t(iS, companion.c())) {
                str = "DeactivateOutOfFrame";
            } else if (u.t(iS, companion.d())) {
                str = "DeactivateOutOfFrameCancelled";
            } else if (u.t(iS, companion.l())) {
                str = "SlotToReusedFromOnDeactivate";
            } else if (u.t(iS, companion.m())) {
                str = "SlotToReusedFromOnReuse";
            } else if (u.t(iS, companion.k())) {
                str = "Reused";
            } else if (u.t(iS, companion.f())) {
                str = "ResumePaused";
            } else if (u.t(iS, companion.e())) {
                str = "PausePaused";
            } else if (u.t(iS, companion.a())) {
                str = "ApplyPaused";
            } else {
                str = "Unexpected " + iE;
            }
            listC.add(i + ": " + str);
        }
        return kotlin.collections.m.a(listC);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return kotlin.text.h.p("\n            |slotid=" + this.slotId + ". Last operations:\n            |" + kotlin.collections.m.J0(a(), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null) + "\n            ", (String) null, 1, (Object) null);
    }
}
