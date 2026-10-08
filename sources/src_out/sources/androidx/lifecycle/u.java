package androidx.lifecycle;

import com.google.inputmethod.n17;
import com.google.inputmethod.sza;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/u;", "Landroidx/lifecycle/i;", "Lcom/google/android/sza;", "provider", "<init>", "(Lcom/google/android/sza;)V", "Lcom/google/android/n17;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "", "d6", "(Lcom/google/android/n17;Landroidx/lifecycle/Lifecycle$Event;)V", "a", "Lcom/google/android/sza;", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class u implements i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final sza provider;

    public u(sza szaVar) {
        Intrinsics.checkNotNullParameter(szaVar, "provider");
        this.provider = szaVar;
    }

    @Override // androidx.lifecycle.i
    public void d6(n17 source, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == Lifecycle.Event.ON_CREATE) {
            source.getLifecycleRegistry().g(this);
            this.provider.e();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
    }
}
