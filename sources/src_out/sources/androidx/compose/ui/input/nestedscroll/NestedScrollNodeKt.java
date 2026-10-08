package androidx.compose.ui.input.nestedscroll;

import com.google.inputmethod.fhd;
import com.google.inputmethod.ghd;
import com.google.inputmethod.re8;
import com.google.inputmethod.x23;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\t\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\b*\u00020\u0007*\u00028\u0000H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/google/android/re8;", "connection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "dispatcher", "Lcom/google/android/x23;", "c", "(Lcom/google/android/re8;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;)Lcom/google/android/x23;", "Lcom/google/android/fhd;", "T", "b", "(Lcom/google/android/fhd;)Lcom/google/android/fhd;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class NestedScrollNodeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends fhd> T b(T t) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ghd.d(t, new Function1<T, Boolean>() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt$findNearestAttachedAncestor$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Boolean; */
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(fhd fhdVar) {
                boolean z;
                if (fhdVar.getNode().getIsAttached()) {
                    objectRef.element = fhdVar;
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        });
        return (T) objectRef.element;
    }

    public static final x23 c(re8 re8Var, NestedScrollDispatcher nestedScrollDispatcher) {
        return new NestedScrollNode(re8Var, nestedScrollDispatcher);
    }
}
