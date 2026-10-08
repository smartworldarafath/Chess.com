package androidx.constraintlayout.compose;

import com.google.inputmethod.n6c;
import com.google.inputmethod.ug0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR)\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/constraintlayout/compose/a;", "Lcom/google/android/ug0;", "", "id", "", "Lkotlin/Function1;", "Lcom/google/android/n6c;", "", "tasks", "<init>", "(Ljava/lang/Object;Ljava/util/List;)V", "a", "Ljava/lang/Object;", "getId", "()Ljava/lang/Object;", "b", "Ljava/util/List;", "getTasks", "()Ljava/util/List;", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
final class a implements ug0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Object id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<Function1<n6c, Unit>> tasks;

    public a(Object obj, List<Function1<n6c, Unit>> list) {
        Intrinsics.checkNotNullParameter(obj, "id");
        Intrinsics.checkNotNullParameter(list, "tasks");
        this.id = obj;
        this.tasks = list;
    }
}
