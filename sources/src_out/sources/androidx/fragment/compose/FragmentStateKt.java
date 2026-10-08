package androidx.fragment.compose;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.fragment.app.Fragment;
import com.google.inputmethod.dfa;
import com.google.inputmethod.k0b;
import com.google.inputmethod.n0b;
import com.google.inputmethod.o0b;
import com.google.inputmethod.o58;
import com.google.inputmethod.vp4;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0019\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u0000\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/google/android/vp4;", "b", "(Landroidx/compose/runtime/d;I)Lcom/google/android/vp4;", "Lcom/google/android/k0b;", "a", "()Lcom/google/android/k0b;", "fragment-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FragmentStateKt {
    private static final k0b<vp4, ?> a() {
        return n0b.e(new Function2<o0b, vp4, o58<Fragment.SavedState>>() { // from class: androidx.fragment.compose.FragmentStateKt$fragmentStateSaver$1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final o58<Fragment.SavedState> invoke(o0b o0bVar, vp4 vp4Var) {
                return vp4Var.a();
            }
        }, new Function1<o58<Fragment.SavedState>, vp4>() { // from class: androidx.fragment.compose.FragmentStateKt$fragmentStateSaver$2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final vp4 invoke(o58<Fragment.SavedState> o58Var) {
                return new vp4(o58Var);
            }
        });
    }

    public static final vp4 b(d dVar, int i) {
        dVar.Q(-496803845);
        if (e.k()) {
            e.o(-496803845, i, -1, "androidx.fragment.compose.rememberFragmentState (FragmentState.kt:31)");
        }
        vp4 vp4Var = (vp4) dfa.j(new Object[0], a(), null, new Function0<vp4>() { // from class: androidx.fragment.compose.FragmentStateKt$rememberFragmentState$1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final vp4 invoke() {
                return new vp4(null, 1, null);
            }
        }, dVar, 3072, 4);
        if (e.k()) {
            e.n();
        }
        dVar.a0();
        return vp4Var;
    }
}
