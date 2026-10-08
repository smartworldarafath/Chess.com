package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import com.google.inputmethod.af9;
import com.google.inputmethod.wia;
import com.google.inputmethod.ze9;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R.\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR.\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001b\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u0007\u0010\u001aR \u0010\"\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\u0003\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInteropFilter;", "Lcom/google/android/af9;", "<init>", "()V", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", "d", "Lkotlin/jvm/functions/Function1;", "c", "()Lkotlin/jvm/functions/Function1;", "e", "(Lkotlin/jvm/functions/Function1;)V", "onTouchEvent", "Lcom/google/android/wia;", "value", "Lcom/google/android/wia;", "getRequestDisallowInterceptTouchEvent", "()Lcom/google/android/wia;", "k", "(Lcom/google/android/wia;)V", "requestDisallowInterceptTouchEvent", "f", "Z", "a", "()Z", "(Z)V", "disallowIntercept", "Lcom/google/android/ze9;", "g", "Lcom/google/android/ze9;", "getPointerInputFilter", "()Lcom/google/android/ze9;", "getPointerInputFilter$annotations", "pointerInputFilter", "DispatchToViewState", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PointerInteropFilter implements af9 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public Function1<? super MotionEvent, Boolean> onTouchEvent;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private wia requestDisallowInterceptTouchEvent;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean disallowIntercept;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final ze9 pointerInputFilter = new PointerInteropFilter$pointerInputFilter$1(this);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInteropFilter$DispatchToViewState;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    enum DispatchToViewState {
        Unknown,
        Dispatching,
        NotDispatching;

        private static final /* synthetic */ EnumEntries e = kotlin.enums.a.a(a());
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getDisallowIntercept() {
        return this.disallowIntercept;
    }

    public final Function1<MotionEvent, Boolean> c() {
        Function1 function1 = this.onTouchEvent;
        if (function1 != null) {
            return function1;
        }
        Intrinsics.x("onTouchEvent");
        return null;
    }

    public final void d(boolean z) {
        this.disallowIntercept = z;
    }

    public final void e(Function1<? super MotionEvent, Boolean> function1) {
        this.onTouchEvent = function1;
    }

    @Override // com.google.inputmethod.af9
    public ze9 getPointerInputFilter() {
        return this.pointerInputFilter;
    }

    public final void k(wia wiaVar) {
        wia wiaVar2 = this.requestDisallowInterceptTouchEvent;
        if (wiaVar2 != null) {
            wiaVar2.b(null);
        }
        this.requestDisallowInterceptTouchEvent = wiaVar;
        if (wiaVar != null) {
            wiaVar.b(this);
        }
    }
}
