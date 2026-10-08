package androidx.compose.p001foundation.text.contextmenu.modifier;

import androidx.compose.p001foundation.text.contextmenu.gestures.RightClickGesturesKt;
import androidx.compose.p004runtime.p0;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.q22;
import com.google.android.rw0;
import com.google.inputmethod.TextContextMenuData;
import com.google.inputmethod.bs1;
import com.google.inputmethod.cs1;
import com.google.inputmethod.cx5;
import com.google.inputmethod.df9;
import com.google.inputmethod.dz4;
import com.google.inputmethod.gba;
import com.google.inputmethod.grc;
import com.google.inputmethod.k33;
import com.google.inputmethod.kba;
import com.google.inputmethod.kn6;
import com.google.inputmethod.mrc;
import com.google.inputmethod.o58;
import com.google.inputmethod.prc;
import com.google.inputmethod.rn8;
import com.google.inputmethod.tsb;
import com.google.inputmethod.ugc;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u0000 \u001d2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u001e\u001fB-\u0012$\u0010\t\u001a \b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u000f\u001a\u00020\u00072$\u0010\t\u001a \b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u000bJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R4\u0010\t\u001a \b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R/\u0010\u001c\u001a\u0004\u0018\u00010\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u00108B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u0013¨\u0006 "}, d2 = {"Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuGestureNode;", "Lcom/google/android/k33;", "Lcom/google/android/bs1;", "Lcom/google/android/dz4;", "Lkotlin/Function2;", "Lcom/google/android/rn8;", "Lcom/google/android/q22;", "", "", "onPreShowContextMenu", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "localClickOffset", "x3", "(J)V", "y3", "Lcom/google/android/kn6;", "coordinates", "D", "(Lcom/google/android/kn6;)V", "r", "Lkotlin/jvm/functions/Function2;", "<set-?>", "s", "Lcom/google/android/o58;", "v3", "()Lcom/google/android/kn6;", "w3", "localCoordinates", "t", "b", "a", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class TextContextMenuGestureNode extends k33 implements bs1, dz4 {
    private static final b t = new b(null);

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private Function2<? super rn8, ? super q22<? super Unit>, ? extends Object> onPreShowContextMenu;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final o58 localCoordinates = p0.i(null, p0.k());

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuGestureNode$a;", "Lcom/google/android/grc;", "Lcom/google/android/rn8;", "localClickOffset", "<init>", "(Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuGestureNode;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lcom/google/android/kn6;", "destinationCoordinates", "l2", "(Lcom/google/android/kn6;)J", "Lcom/google/android/gba;", "P1", "(Lcom/google/android/kn6;)Lcom/google/android/gba;", "Lcom/google/android/frc;", "a0", "()Lcom/google/android/frc;", "a", "J", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    final class a implements grc {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final long localClickOffset;

        public /* synthetic */ a(TextContextMenuGestureNode textContextMenuGestureNode, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(j);
        }

        @Override // com.google.inputmethod.grc
        public gba P1(kn6 destinationCoordinates) {
            return kba.c(l2(destinationCoordinates), tsb.INSTANCE.b());
        }

        @Override // com.google.inputmethod.grc
        public TextContextMenuData a0() {
            return TextContextMenuModifierKt.c(TextContextMenuGestureNode.this);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        @Override // com.google.inputmethod.grc
        public long l2(kn6 destinationCoordinates) throws KotlinNothingValueException {
            kn6 kn6VarV3 = TextContextMenuGestureNode.this.v3();
            if (kn6VarV3 != null) {
                return destinationCoordinates.Q(kn6VarV3, this.localClickOffset);
            }
            cx5.d("Tried to open context menu before the anchor was placed.");
            throw new KotlinNothingValueException();
        }

        private a(long j) {
            this.localClickOffset = j;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuGestureNode$b;", "", "<init>", "()V", "", "MESSAGE", "Ljava/lang/String;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public TextContextMenuGestureNode(Function2<? super rn8, ? super q22<? super Unit>, ? extends Object> function2) {
        this.onPreShowContextMenu = function2;
        m3(ugc.a(new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode.1

            /* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final /* synthetic */ class C00271 extends FunctionReferenceImpl implements Function1<rn8, Unit> {
                C00271(Object obj) {
                    super(1, obj, TextContextMenuGestureNode.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m(((rn8) obj).getPackedValue());
                    return Unit.a;
                }

                public final void m(long j) {
                    ((TextContextMenuGestureNode) ((CallableReference) this).receiver).x3(j);
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(df9 df9Var, q22<? super Unit> q22Var) {
                Object objC = RightClickGesturesKt.c(df9Var, new C00271(TextContextMenuGestureNode.this), q22Var);
                return objC == kotlin.coroutines.intrinsics.a.g() ? objC : Unit.a;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kn6 v3() {
        return (kn6) this.localCoordinates.getValue();
    }

    private final void w3(kn6 kn6Var) {
        this.localCoordinates.setValue(kn6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x3(long localClickOffset) {
        mrc mrcVar = (mrc) cs1.a(this, prc.e());
        if (mrcVar == null) {
            return;
        }
        rw0.d(L2(), (CoroutineContext) null, (CoroutineStart) null, new TextContextMenuGestureNode$tryShowContextMenu$1(this, localClickOffset, mrcVar, new a(this, localClickOffset, null), null), 3, (Object) null);
    }

    @Override // com.google.inputmethod.dz4
    public void D(kn6 coordinates) {
        w3(coordinates);
    }

    public final void y3(Function2<? super rn8, ? super q22<? super Unit>, ? extends Object> onPreShowContextMenu) {
        this.onPreShowContextMenu = onPreShowContextMenu;
    }
}
