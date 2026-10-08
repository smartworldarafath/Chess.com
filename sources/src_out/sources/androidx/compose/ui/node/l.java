package androidx.compose.ui.node;

import com.google.inputmethod.on8;
import com.google.inputmethod.y23;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a-\u0010\u0006\u001a\u00020\u0004\"\f\b\u0000\u0010\u0002*\u00020\u0000*\u00020\u0001*\u00028\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/b$c;", "Lcom/google/android/on8;", "T", "Lkotlin/Function0;", "", "block", "a", "(Landroidx/compose/ui/b$c;Lkotlin/jvm/functions/Function0;)V", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l {
    public static final <T extends androidx.compose.ui.b.c & on8> void a(T t, Function0<Unit> function0) {
        ObserverNodeOwnerScope ownerScope = t.getOwnerScope();
        if (ownerScope == null) {
            ownerScope = new ObserverNodeOwnerScope(t);
            t.h3(ownerScope);
        }
        OwnerSnapshotObserver snapshotObserver = y23.r(t).getSnapshotObserver();
        snapshotObserver.observer.k(ownerScope, ObserverNodeOwnerScope.INSTANCE.a(), function0);
    }
}
