package androidx.compose.ui.focus;

import com.google.inputmethod.ek4;
import com.google.inputmethod.gba;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bR\u001c\u0010\u0007\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R$\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR$\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR$\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR$\u0010\u001a\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\rR$\u0010\u001d\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u000b\"\u0004\b\u001c\u0010\rR$\u0010 \u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u000b\"\u0004\b\u001f\u0010\rR$\u0010#\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b!\u0010\u000b\"\u0004\b\"\u0010\rR<\u0010+\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R<\u0010.\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*R$\u00104\u001a\u00020/2\u0006\u0010\t\u001a\u00020/8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00065À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/focus/FocusProperties;", "", "", "m", "()Z", "h", "(Z)V", "canFocus", "Landroidx/compose/ui/focus/f;", "_", "j", "()Landroidx/compose/ui/focus/f;", "setNext", "(Landroidx/compose/ui/focus/f;)V", "next", "i", "setPrevious", "previous", "f", "setUp", "up", "g", "setDown", "down", "b", "setLeft", "left", "a", "setRight", "right", "c", "setStart", "start", "k", "setEnd", "end", "Lkotlin/Function1;", "Lcom/google/android/ek4;", "", "n", "()Lkotlin/jvm/functions/Function1;", "l", "(Lkotlin/jvm/functions/Function1;)V", "onEnter", "o", "p", "onExit", "Lcom/google/android/gba;", "e", "()Lcom/google/android/gba;", "d", "(Lcom/google/android/gba;)V", "focusRect", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface FocusProperties {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: androidx.compose.ui.focus.FocusProperties$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/ui/focus/FocusProperties$a;", "", "<init>", "()V", "Lcom/google/android/gba;", "b", "Lcom/google/android/gba;", "a", "()Lcom/google/android/gba;", "UnsetFocusRect", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private static final gba UnsetFocusRect = new gba(Float.NaN, Float.NaN, Float.NaN, Float.NaN);

        private Companion() {
        }

        public final gba a() {
            return UnsetFocusRect;
        }
    }

    default f a() {
        return f.INSTANCE.b();
    }

    default f b() {
        return f.INSTANCE.b();
    }

    default f c() {
        return f.INSTANCE.b();
    }

    default void d(gba gbaVar) {
    }

    default gba e() {
        return INSTANCE.a();
    }

    default f f() {
        return f.INSTANCE.b();
    }

    default f g() {
        return f.INSTANCE.b();
    }

    void h(boolean z);

    default f i() {
        return f.INSTANCE.b();
    }

    default f j() {
        return f.INSTANCE.b();
    }

    default f k() {
        return f.INSTANCE.b();
    }

    default void l(Function1<? super ek4, Unit> function1) {
    }

    boolean m();

    default Function1<ek4, Unit> n() {
        return new Function1<ek4, Unit>() { // from class: androidx.compose.ui.focus.FocusProperties$onEnter$1
            public final void a(ek4 ek4Var) {
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((ek4) obj);
                return Unit.a;
            }
        };
    }

    default Function1<ek4, Unit> o() {
        return new Function1<ek4, Unit>() { // from class: androidx.compose.ui.focus.FocusProperties$onExit$1
            public final void a(ek4 ek4Var) {
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((ek4) obj);
                return Unit.a;
            }
        };
    }

    default void p(Function1<? super ek4, Unit> function1) {
    }
}
