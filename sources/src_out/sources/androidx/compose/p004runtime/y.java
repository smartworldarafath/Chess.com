package androidx.compose.p004runtime;

import androidx.collection.ObjectList;
import com.google.inputmethod.e58;
import com.google.inputmethod.k58;
import com.google.inputmethod.n08;
import com.google.inputmethod.q38;
import com.google.inputmethod.r08;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u0003J\u001f\u0010\r\u001a\u0004\u0018\u00010\u00062\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0010\u001a\u00020\u000f2\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R(\u0010\u0019\u001a\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004\u0012\u0004\u0012\u00020\u00060\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R(\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018¨\u0006\u001b"}, d2 = {"Landroidx/compose/runtime/y;", "", "<init>", "()V", "Lcom/google/android/n08;", "content", "Landroidx/compose/runtime/z;", "nestedContent", "", "b", "(Lcom/google/android/n08;Landroidx/compose/runtime/z;)V", "c", "key", "e", "(Lcom/google/android/n08;)Landroidx/compose/runtime/z;", "", "d", "(Lcom/google/android/n08;)Z", "Lcom/google/android/r08;", "reference", "f", "(Lcom/google/android/r08;)V", "Lcom/google/android/q38;", "a", "Lcom/google/android/k58;", "contentMap", "containerMap", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class y {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final k58<Object, Object> contentMap = q38.e(null, 1, null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final k58<Object, Object> containerMap = q38.e(null, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(r08 r08Var, z zVar) {
        return Intrinsics.e(zVar.getContainer(), r08Var);
    }

    public final void b(n08<Object> content, z nestedContent) {
        q38.a(this.contentMap, content, nestedContent);
        q38.a(this.containerMap, nestedContent.getContainer(), content);
    }

    public final void c() {
        q38.c(this.contentMap);
        q38.c(this.containerMap);
    }

    public final boolean d(n08<Object> key) {
        return q38.f(this.contentMap, key);
    }

    public final z e(n08<Object> key) {
        z zVar = (z) q38.m(this.contentMap, key);
        if (q38.j(this.contentMap)) {
            q38.c(this.containerMap);
        }
        return zVar;
    }

    public final void f(final r08 reference) {
        Object objE = this.containerMap.e(reference);
        if (objE != null) {
            if (!(objE instanceof e58)) {
                Intrinsics.h(objE, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                q38.n(this.contentMap, (n08) objE, new Function1() { // from class: androidx.compose.runtime.x
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(y.g(reference, (z) obj));
                    }
                });
                return;
            }
            ObjectList objectList = (ObjectList) objE;
            Object[] objArr = objectList.content;
            int i = objectList._size;
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = objArr[i2];
                Intrinsics.h(obj, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                q38.n(this.contentMap, (n08) obj, new Function1() { // from class: androidx.compose.runtime.x
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(y.g(reference, (z) obj2));
                    }
                });
            }
        }
    }
}
