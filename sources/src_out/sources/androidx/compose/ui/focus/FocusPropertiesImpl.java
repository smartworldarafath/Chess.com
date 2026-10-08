package androidx.compose.ui.focus;

import com.google.inputmethod.ek4;
import com.google.inputmethod.gba;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0017\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\"\u0010\u001b\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\"\u0010\u001e\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u001c\u0010\u0010\"\u0004\b\u001d\u0010\u0012R\"\u0010 \u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u0005\u0010\u0010\"\u0004\b\u001f\u0010\u0012R\"\u0010#\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u000e\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010\u0012R\"\u0010%\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\r\u0010\u0010\"\u0004\b$\u0010\u0012R\"\u0010(\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b&\u0010\u0010\"\u0004\b'\u0010\u0012R.\u00101\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b&\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R.\u00104\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b/\u0010,\u001a\u0004\b2\u0010.\"\u0004\b3\u00100R\"\u00109\u001a\u0002058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u00106\u001a\u0004\b\u0018\u00107\"\u0004\b\u0014\u00108¨\u0006:"}, d2 = {"Landroidx/compose/ui/focus/FocusPropertiesImpl;", "Landroidx/compose/ui/focus/FocusProperties;", "<init>", "()V", "", "b", "Z", "m", "()Z", "h", "(Z)V", "canFocus", "Landroidx/compose/ui/focus/f;", "c", "Landroidx/compose/ui/focus/f;", "j", "()Landroidx/compose/ui/focus/f;", "setNext", "(Landroidx/compose/ui/focus/f;)V", "next", "d", "i", "setPrevious", "previous", "e", "f", "setUp", "up", "g", "setDown", "down", "setLeft", "left", "a", "setRight", "right", "setStart", "start", "k", "setEnd", "end", "Lkotlin/Function1;", "Lcom/google/android/ek4;", "", "Lkotlin/jvm/functions/Function1;", "n", "()Lkotlin/jvm/functions/Function1;", "l", "(Lkotlin/jvm/functions/Function1;)V", "onEnter", "o", "p", "onExit", "Lcom/google/android/gba;", "Lcom/google/android/gba;", "()Lcom/google/android/gba;", "(Lcom/google/android/gba;)V", "focusRect", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FocusPropertiesImpl implements FocusProperties {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean canFocus = true;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private f next;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private f previous;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private f up;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private f down;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private f left;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private f right;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private f start;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private f end;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private Function1<? super ek4, Unit> onEnter;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private Function1<? super ek4, Unit> onExit;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private gba focusRect;

    public FocusPropertiesImpl() {
        f.Companion companion = f.INSTANCE;
        this.next = companion.b();
        this.previous = companion.b();
        this.up = companion.b();
        this.down = companion.b();
        this.left = companion.b();
        this.right = companion.b();
        this.start = companion.b();
        this.end = companion.b();
        this.onEnter = new Function1<ek4, Unit>() { // from class: androidx.compose.ui.focus.FocusPropertiesImpl$onEnter$1
            public final void a(ek4 ek4Var) {
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((ek4) obj);
                return Unit.a;
            }
        };
        this.onExit = new Function1<ek4, Unit>() { // from class: androidx.compose.ui.focus.FocusPropertiesImpl$onExit$1
            public final void a(ek4 ek4Var) {
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((ek4) obj);
                return Unit.a;
            }
        };
        this.focusRect = FocusProperties.INSTANCE.a();
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    /* JADX INFO: renamed from: a, reason: from getter */
    public f getRight() {
        return this.right;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    /* JADX INFO: renamed from: b, reason: from getter */
    public f getLeft() {
        return this.left;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    /* JADX INFO: renamed from: c, reason: from getter */
    public f getStart() {
        return this.start;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void d(gba gbaVar) {
        this.focusRect = gbaVar;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    /* JADX INFO: renamed from: e, reason: from getter */
    public gba getFocusRect() {
        return this.focusRect;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    /* JADX INFO: renamed from: f, reason: from getter */
    public f getUp() {
        return this.up;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    /* JADX INFO: renamed from: g, reason: from getter */
    public f getDown() {
        return this.down;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void h(boolean z) {
        this.canFocus = z;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    /* JADX INFO: renamed from: i, reason: from getter */
    public f getPrevious() {
        return this.previous;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    /* JADX INFO: renamed from: j, reason: from getter */
    public f getNext() {
        return this.next;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    /* JADX INFO: renamed from: k, reason: from getter */
    public f getEnd() {
        return this.end;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void l(Function1<? super ek4, Unit> function1) {
        this.onEnter = function1;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    /* JADX INFO: renamed from: m, reason: from getter */
    public boolean getCanFocus() {
        return this.canFocus;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public Function1<ek4, Unit> n() {
        return this.onEnter;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public Function1<ek4, Unit> o() {
        return this.onExit;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void p(Function1<? super ek4, Unit> function1) {
        this.onExit = function1;
    }
}
