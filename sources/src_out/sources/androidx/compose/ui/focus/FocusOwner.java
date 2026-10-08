package androidx.compose.ui.focus;

import android.view.KeyEvent;
import com.google.inputmethod.RotaryScrollEvent;
import com.google.inputmethod.dl4;
import com.google.inputmethod.e58;
import com.google.inputmethod.ev5;
import com.google.inputmethod.gba;
import com.google.inputmethod.ik4;
import com.google.inputmethod.nk4;
import com.google.inputmethod.ok4;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b`\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0006H&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0012H&¢\u0006\u0004\b\u001c\u0010\u0014J\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0006H&¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0006H&¢\u0006\u0004\b!\u0010 J'\u0010&\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060$H&¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"H&¢\u0006\u0004\b(\u0010)J'\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060$H&¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u00062\u0006\u0010+\u001a\u00020.H&¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0012H&¢\u0006\u0004\b1\u0010\u0014J\u000f\u00102\u001a\u00020\u0012H&¢\u0006\u0004\b2\u0010\u0014J\u0017\u00104\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u000bH&¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\u00122\u0006\u00103\u001a\u000206H&¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0012H&¢\u0006\u0004\b9\u0010\u0014R\u0014\u0010=\u001a\u00020:8&X¦\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020?0>8&X¦\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8&X¦\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u001e\u0010J\u001a\u0004\u0018\u00010\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\bG\u0010H\"\u0004\bI\u00105R\u001c\u0010N\u001a\u00020\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\bK\u0010 \"\u0004\bL\u0010Mø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006OÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/focus/FocusOwner;", "Lcom/google/android/ok4;", "Landroidx/compose/ui/focus/b;", "focusDirection", "Lcom/google/android/gba;", "previouslyFocusedRect", "", "b", "(Landroidx/compose/ui/focus/b;Lcom/google/android/gba;)Z", "focusedRect", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusTargetNode;", "onFound", "w", "(ILcom/google/android/gba;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "wrapAroundForOneDimensionalFocus", "s", "(IZ)Z", "", "B", "()V", "force", "refreshFocusEvents", "clearOwnerFocus", "n", "(ZZZI)Z", "p", "(I)Z", "d", "e", "()Lcom/google/android/gba;", "o", "()Z", "z", "Lcom/google/android/oi6;", "keyEvent", "Lkotlin/Function0;", "onFocusedItem", "y", "(Landroid/view/KeyEvent;Lkotlin/jvm/functions/Function0;)Z", "h", "(Landroid/view/KeyEvent;)Z", "Lcom/google/android/bqa;", "event", "u", "(Lcom/google/android/bqa;Lkotlin/jvm/functions/Function0;)Z", "Lcom/google/android/ev5;", "r", "(Lcom/google/android/ev5;)Z", "l", "c", "node", "x", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "Lcom/google/android/ik4;", "k", "(Lcom/google/android/ik4;)V", "j", "Landroidx/compose/ui/b;", "a", "()Landroidx/compose/ui/b;", "modifier", "Lcom/google/android/e58;", "Lcom/google/android/nk4;", "getListeners", "()Lcom/google/android/e58;", "listeners", "Lcom/google/android/dl4;", "A", "()Lcom/google/android/dl4;", "rootState", "i", "()Landroidx/compose/ui/focus/FocusTargetNode;", "q", "activeFocusTargetNode", "m", "f", "(Z)V", "isFocusCaptured", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface FocusOwner extends ok4 {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ boolean g(FocusOwner focusOwner, KeyEvent keyEvent, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchKeyEvent-YhN2O0w");
        }
        if ((i & 2) != 0) {
            function0 = new Function0<Boolean>() { // from class: androidx.compose.ui.focus.FocusOwner$dispatchKeyEvent$1
                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final Boolean m9invoke() {
                    return Boolean.FALSE;
                }
            };
        }
        return focusOwner.y(keyEvent, function0);
    }

    dl4 A();

    void B();

    androidx.compose.ui.b a();

    boolean b(b focusDirection, gba previouslyFocusedRect);

    void c();

    void d();

    gba e();

    void f(boolean z);

    e58<nk4> getListeners();

    boolean h(KeyEvent keyEvent);

    FocusTargetNode i();

    void j();

    void k(ik4 node);

    void l();

    boolean m();

    boolean n(boolean force, boolean refreshFocusEvents, boolean clearOwnerFocus, int focusDirection);

    boolean o();

    boolean p(int focusDirection);

    void q(FocusTargetNode focusTargetNode);

    boolean r(ev5 event);

    boolean s(int focusDirection, boolean wrapAroundForOneDimensionalFocus);

    boolean u(RotaryScrollEvent event, Function0<Boolean> onFocusedItem);

    Boolean w(int focusDirection, gba focusedRect, Function1<? super FocusTargetNode, Boolean> onFound);

    void x(FocusTargetNode node);

    boolean y(KeyEvent keyEvent, Function0<Boolean> onFocusedItem);

    boolean z();
}
