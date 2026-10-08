package androidx.compose.p001foundation.gestures;

import androidx.compose.p001foundation.gestures.g;
import com.google.android.g41;
import com.google.inputmethod.cx5;
import com.google.inputmethod.gba;
import com.google.inputmethod.r58;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\r\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/gestures/g;", "", "<init>", "()V", "Landroidx/compose/foundation/gestures/ContentInViewNode$a;", "request", "", "d", "(Landroidx/compose/foundation/gestures/ContentInViewNode$a;)Z", "", "f", "", "cause", "c", "(Ljava/lang/Throwable;)V", "Lcom/google/android/r58;", "a", "Lcom/google/android/r58;", "requests", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g {
    public static final int b = r58.d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final r58<ContentInViewNode.a> requests = new r58<>(new ContentInViewNode.a[16], 0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(g gVar, ContentInViewNode.a aVar, Throwable th) {
        gVar.requests.s(aVar);
        return Unit.a;
    }

    public final void c(Throwable cause) {
        r58<ContentInViewNode.a> r58Var = this.requests;
        int size = r58Var.getSize();
        g41[] g41VarArr = new g41[size];
        for (int i = 0; i < size; i++) {
            g41VarArr[i] = r58Var.content[i].a();
        }
        for (int i2 = 0; i2 < size; i2++) {
            g41VarArr[i2].i(cause);
        }
        if (this.requests.getSize() == 0) {
            return;
        }
        cx5.c("uncancelled requests present");
    }

    public final boolean d(final ContentInViewNode.a request) {
        gba gbaVar = (gba) request.b().invoke();
        if (gbaVar == null) {
            g41<Unit> g41VarA = request.a();
            Result.a aVar = Result.a;
            g41VarA.resumeWith(Result.b(Unit.a));
            return false;
        }
        request.a().D(new Function1() { // from class: com.google.android.bu0
            public final Object invoke(Object obj) {
                return g.e(this.a, request, (Throwable) obj);
            }
        });
        IntRange intRangeA = kotlin.ranges.g.A(0, this.requests.getSize());
        int iF = intRangeA.f();
        int i = intRangeA.i();
        if (iF <= i) {
            while (true) {
                gba gbaVar2 = (gba) this.requests.content[i].b().invoke();
                if (gbaVar2 != null) {
                    gba gbaVarQ = gbaVar.q(gbaVar2);
                    if (!Intrinsics.e(gbaVarQ, gbaVar)) {
                        if (!Intrinsics.e(gbaVarQ, gbaVar2)) {
                            CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                            int size = this.requests.getSize() - 1;
                            if (size <= i) {
                                while (true) {
                                    this.requests.content[i].a().i(cancellationException);
                                    if (size == i) {
                                        break;
                                    }
                                    size++;
                                }
                            }
                        }
                    } else {
                        this.requests.b(i + 1, request);
                        return true;
                    }
                }
                if (i != iF) {
                    i--;
                }
            }
        }
        this.requests.b(0, request);
        return true;
    }

    public final void f() {
        IntRange intRangeA = kotlin.ranges.g.A(0, this.requests.getSize());
        int iF = intRangeA.f();
        int i = intRangeA.i();
        if (iF <= i) {
            while (true) {
                this.requests.content[iF].a().resumeWith(Result.b(Unit.a));
                if (iF == i) {
                    break;
                } else {
                    iF++;
                }
            }
        }
        this.requests.j();
    }
}
