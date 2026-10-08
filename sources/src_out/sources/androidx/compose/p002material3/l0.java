package androidx.compose.p002material3;

import com.google.inputmethod.qaa;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR.\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0019\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/compose/material3/l0;", "T", "", "<init>", "()V", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "d", "(Ljava/lang/Object;)V", "current", "", "Landroidx/compose/material3/k0;", "b", "Ljava/util/List;", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "items", "Lcom/google/android/qaa;", "c", "Lcom/google/android/qaa;", "()Lcom/google/android/qaa;", "e", "(Lcom/google/android/qaa;)V", "scope", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class l0<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private Object current = new Object();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private List<FadeInFadeOutAnimationItem<T>> items = new ArrayList();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private qaa scope;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Object getCurrent() {
        return this.current;
    }

    public final List<FadeInFadeOutAnimationItem<T>> b() {
        return this.items;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final qaa getScope() {
        return this.scope;
    }

    public final void d(Object obj) {
        this.current = obj;
    }

    public final void e(qaa qaaVar) {
        this.scope = qaaVar;
    }
}
