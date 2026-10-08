package androidx.compose.p001foundation;

import android.view.KeyEvent;
import androidx.compose.p001foundation.ClickableKt;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.b;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.platform.InspectableValueKt;
import com.google.android.ps4;
import com.google.android.r43;
import com.google.inputmethod.IndirectPointerInputChange;
import com.google.inputmethod.aab;
import com.google.inputmethod.av5;
import com.google.inputmethod.cw4;
import com.google.inputmethod.fhd;
import com.google.inputmethod.ghd;
import com.google.inputmethod.hpa;
import com.google.inputmethod.ii6;
import com.google.inputmethod.jz5;
import com.google.inputmethod.k26;
import com.google.inputmethod.k33;
import com.google.inputmethod.r48;
import com.google.inputmethod.ri6;
import com.google.inputmethod.si6;
import com.google.inputmethod.wu5;
import com.google.inputmethod.zv4;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u001aC\u0010\n\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001aM\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001aU\u0010\u0012\u001a\u00020\u0000*\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0087\u0001\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u008f\u0001\u0010\u001a\u001a\u00020\u0000*\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001b\u0010\u001f\u001a\u00020\u0001*\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u001b\u0010\"\u001a\u00020\u0001*\u00020\u001c2\u0006\u0010\u001e\u001a\u00020!H\u0000¢\u0006\u0004\b\"\u0010#\u001a\u0013\u0010%\u001a\u00020\u0001*\u00020$H\u0000¢\u0006\u0004\b%\u0010&\u001a\u0017\u0010'\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b'\u0010(\u001a\u0013\u0010)\u001a\u00020\u0001*\u00020\u001dH\u0002¢\u0006\u0004\b)\u0010*\u001a\u0013\u0010+\u001a\u00020\u0001*\u00020\u001dH\u0002¢\u0006\u0004\b+\u0010*\"\u0018\u0010/\u001a\u00020\u0001*\u00020,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.\"\u0018\u00101\u001a\u00020\u0001*\u00020,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u0010.\"\u0018\u00103\u001a\u00020\u0001*\u00020,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u0010.¨\u00064"}, d2 = {"Landroidx/compose/ui/b;", "", "enabled", "", "onClickLabel", "Lcom/google/android/hpa;", "role", "Lkotlin/Function0;", "", "onClick", "n", "(Landroidx/compose/ui/b;ZLjava/lang/String;Lcom/google/android/hpa;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/b;", "Lcom/google/android/r48;", "interactionSource", "p", "(Landroidx/compose/ui/b;ZLjava/lang/String;Lcom/google/android/hpa;Lcom/google/android/r48;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/b;", "Lcom/google/android/wu5;", "indication", "l", "(Landroidx/compose/ui/b;Lcom/google/android/r48;Lcom/google/android/wu5;ZLjava/lang/String;Lcom/google/android/hpa;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/b;", "onLongClickLabel", "onLongClick", "onDoubleClick", "hapticFeedbackEnabled", "u", "(Landroidx/compose/ui/b;ZLjava/lang/String;Lcom/google/android/hpa;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLcom/google/android/r48;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/b;", "s", "(Landroidx/compose/ui/b;Lcom/google/android/r48;Lcom/google/android/wu5;ZLjava/lang/String;Lcom/google/android/hpa;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/b;", "Lcom/google/android/k33;", "Lcom/google/android/hv5;", "event", "x", "(Lcom/google/android/k33;Lcom/google/android/hv5;)Z", "Landroidx/compose/ui/input/pointer/i;", "w", "(Lcom/google/android/k33;Landroidx/compose/ui/input/pointer/i;)Z", "Lcom/google/android/fhd;", "A", "(Lcom/google/android/fhd;)Z", "F", "(Lcom/google/android/wu5;)Ljava/lang/String;", "j", "(Lcom/google/android/hv5;)Z", "k", "Lcom/google/android/oi6;", "E", "(Landroid/view/KeyEvent;)Z", "isPress", "C", "isClick", "D", "isEnter", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ClickableKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements ps4<androidx.compose.ui.b, d, Integer, androidx.compose.ui.b> {
        final /* synthetic */ wu5 a;
        final /* synthetic */ boolean b;
        final /* synthetic */ String c;
        final /* synthetic */ hpa d;
        final /* synthetic */ Function0 e;

        public a(wu5 wu5Var, boolean z, String str, hpa hpaVar, Function0 function0) {
            this.a = wu5Var;
            this.b = z;
            this.c = str;
            this.d = hpaVar;
            this.e = function0;
        }

        public final androidx.compose.ui.b a(androidx.compose.ui.b bVar, d dVar, int i) {
            dVar.y(-1525724089);
            if (e.k()) {
                e.o(-1525724089, i, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:637)");
            }
            Object objR = dVar.R();
            if (objR == d.INSTANCE.a()) {
                objR = k26.a();
                dVar.L(objR);
            }
            r48 r48Var = (r48) objR;
            androidx.compose.ui.b bVarThen = IndicationKt.e(androidx.compose.ui.b.INSTANCE, r48Var, this.a).then(new d(r48Var, null, false, this.b, this.c, this.d, this.e, null));
            if (e.k()) {
                e.n();
            }
            dVar.u();
            return bVarThen;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.b) obj, (d) obj2, ((Number) obj3).intValue());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements ps4<androidx.compose.ui.b, d, Integer, androidx.compose.ui.b> {
        final /* synthetic */ wu5 a;
        final /* synthetic */ boolean b;
        final /* synthetic */ String c;
        final /* synthetic */ hpa d;
        final /* synthetic */ Function0 e;
        final /* synthetic */ String f;
        final /* synthetic */ Function0 g;
        final /* synthetic */ Function0 h;
        final /* synthetic */ boolean i;

        public b(wu5 wu5Var, boolean z, String str, hpa hpaVar, Function0 function0, String str2, Function0 function1, Function0 function2, boolean z2) {
            this.a = wu5Var;
            this.b = z;
            this.c = str;
            this.d = hpaVar;
            this.e = function0;
            this.f = str2;
            this.g = function1;
            this.h = function2;
            this.i = z2;
        }

        public final androidx.compose.ui.b a(androidx.compose.ui.b bVar, d dVar, int i) {
            dVar.y(-1525724089);
            if (e.k()) {
                e.o(-1525724089, i, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:637)");
            }
            Object objR = dVar.R();
            if (objR == d.INSTANCE.a()) {
                objR = k26.a();
                dVar.L(objR);
            }
            r48 r48Var = (r48) objR;
            androidx.compose.ui.b bVarThen = IndicationKt.e(androidx.compose.ui.b.INSTANCE, r48Var, this.a).then(new f(r48Var, null, false, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, null));
            if (e.k()) {
                e.n();
            }
            dVar.u();
            return bVarThen;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.b) obj, (d) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final boolean A(fhd fhdVar) throws KotlinNothingValueException {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        ghd.c(fhdVar, aab.INSTANCE, new Function1() { // from class: com.google.android.be1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ClickableKt.B(booleanRef, (fhd) obj));
            }
        });
        return booleanRef.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    public static final boolean B(Ref.BooleanRef booleanRef, fhd fhdVar) {
        boolean z;
        if (booleanRef.element) {
            z = true;
        } else {
            Intrinsics.h(fhdVar, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableContainerNode");
            if (((aab) fhdVar).getEnabled()) {
                z = true;
            } else {
                z = false;
            }
        }
        booleanRef.element = z;
        return !z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean C(KeyEvent keyEvent) {
        return ri6.e(si6.b(keyEvent), ri6.INSTANCE.b()) && D(keyEvent);
    }

    private static final boolean D(KeyEvent keyEvent) {
        long jA = si6.a(keyEvent);
        ii6.Companion companion = ii6.INSTANCE;
        return ii6.T(jA, companion.i()) || ii6.T(jA, companion.n()) || ii6.T(jA, companion.B()) || ii6.T(jA, companion.K());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean E(KeyEvent keyEvent) {
        return ri6.e(si6.b(keyEvent), ri6.INSTANCE.a()) && D(keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String F(wu5 wu5Var) {
        return "clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + wu5Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(IndirectPointerInputChange indirectPointerInputChange) {
        return (indirectPointerInputChange.getIsConsumed() || !indirectPointerInputChange.getPreviousPressed() || indirectPointerInputChange.getPressed()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(IndirectPointerInputChange indirectPointerInputChange) {
        return indirectPointerInputChange.getPreviousPressed() && !indirectPointerInputChange.getPressed();
    }

    public static final androidx.compose.ui.b l(androidx.compose.ui.b bVar, r48 r48Var, wu5 wu5Var, boolean z, String str, hpa hpaVar, Function0<Unit> function0) {
        androidx.compose.ui.b bVarC;
        if (wu5Var instanceof av5) {
            bVarC = new d(r48Var, (av5) wu5Var, false, z, str, hpaVar, function0, null);
        } else if (wu5Var == null) {
            bVarC = new d(r48Var, null, false, z, str, hpaVar, function0, null);
        } else if (r48Var != null) {
            bVarC = IndicationKt.e(androidx.compose.ui.b.INSTANCE, r48Var, wu5Var).then(new d(r48Var, null, false, z, str, hpaVar, function0, null));
        } else {
            bVarC = ComposedModifierKt.c(androidx.compose.ui.b.INSTANCE, null, new a(wu5Var, z, str, hpaVar, function0), 1, null);
        }
        return bVar.then(bVarC);
    }

    public static /* synthetic */ androidx.compose.ui.b m(androidx.compose.ui.b bVar, r48 r48Var, wu5 wu5Var, boolean z, String str, hpa hpaVar, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return l(bVar, r48Var, wu5Var, z, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : hpaVar, function0);
    }

    @r43
    public static final /* synthetic */ androidx.compose.ui.b n(androidx.compose.ui.b bVar, final boolean z, final String str, final hpa hpaVar, final Function0 function0) {
        return ComposedModifierKt.b(bVar, InspectableValueKt.b() ? new Function1<jz5, Unit>() { // from class: androidx.compose.foundation.ClickableKt$clickable-XHw0xAI$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(jz5 jz5Var) {
                jz5Var.b("clickable");
                jz5Var.getProperties().c("enabled", Boolean.valueOf(z));
                jz5Var.getProperties().c("onClickLabel", str);
                jz5Var.getProperties().c("role", hpaVar);
                jz5Var.getProperties().c("onClick", function0);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((jz5) obj);
                return Unit.a;
            }
        } : InspectableValueKt.a(), new ps4() { // from class: com.google.android.ce1
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return ClickableKt.r(z, str, hpaVar, function0, (b) obj, (d) obj2, ((Integer) obj3).intValue());
            }
        });
    }

    public static /* synthetic */ androidx.compose.ui.b o(androidx.compose.ui.b bVar, boolean z, String str, hpa hpaVar, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            hpaVar = null;
        }
        return n(bVar, z, str, hpaVar, function0);
    }

    public static final androidx.compose.ui.b p(androidx.compose.ui.b bVar, boolean z, String str, hpa hpaVar, r48 r48Var, Function0<Unit> function0) {
        return bVar.then(new d(r48Var, null, true, z, str, hpaVar, function0, null));
    }

    public static /* synthetic */ androidx.compose.ui.b q(androidx.compose.ui.b bVar, boolean z, String str, hpa hpaVar, r48 r48Var, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            hpaVar = null;
        }
        return p(bVar, z, str, hpaVar, (i & 8) != 0 ? null : r48Var, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.b r(boolean z, String str, hpa hpaVar, Function0 function0, androidx.compose.ui.b bVar, d dVar, int i) {
        r48 r48Var;
        dVar.y(-756081143);
        if (e.k()) {
            e.o(-756081143, i, -1, "androidx.compose.foundation.clickable.<anonymous> (Clickable.kt:144)");
        }
        wu5 wu5Var = (wu5) dVar.v(IndicationKt.d());
        if (wu5Var instanceof av5) {
            dVar.y(-1604682242);
            dVar.u();
            r48Var = null;
        } else {
            dVar.y(-1604549624);
            Object objR = dVar.R();
            if (objR == d.INSTANCE.a()) {
                objR = k26.a();
                dVar.L(objR);
            }
            r48Var = (r48) objR;
            dVar.u();
        }
        androidx.compose.ui.b bVarL = l(androidx.compose.ui.b.INSTANCE, r48Var, wu5Var, z, str, hpaVar, function0);
        if (e.k()) {
            e.n();
        }
        dVar.u();
        return bVarL;
    }

    public static final androidx.compose.ui.b s(androidx.compose.ui.b bVar, r48 r48Var, wu5 wu5Var, boolean z, String str, hpa hpaVar, String str2, Function0<Unit> function0, Function0<Unit> function1, boolean z2, Function0<Unit> function2) {
        androidx.compose.ui.b bVarC;
        if (wu5Var instanceof av5) {
            bVarC = new f(r48Var, (av5) wu5Var, false, z, str, hpaVar, function2, str2, function0, function1, z2, null);
        } else if (wu5Var == null) {
            bVarC = new f(r48Var, null, false, z, str, hpaVar, function2, str2, function0, function1, z2, null);
        } else if (r48Var != null) {
            bVarC = IndicationKt.e(androidx.compose.ui.b.INSTANCE, r48Var, wu5Var).then(new f(r48Var, null, false, z, str, hpaVar, function2, str2, function0, function1, z2, null));
        } else {
            bVarC = ComposedModifierKt.c(androidx.compose.ui.b.INSTANCE, null, new b(wu5Var, z, str, hpaVar, function2, str2, function0, function1, z2), 1, null);
        }
        return bVar.then(bVarC);
    }

    public static /* synthetic */ androidx.compose.ui.b t(androidx.compose.ui.b bVar, r48 r48Var, wu5 wu5Var, boolean z, String str, hpa hpaVar, String str2, Function0 function0, Function0 function1, boolean z2, Function0 function2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            str = null;
        }
        if ((i & 16) != 0) {
            hpaVar = null;
        }
        if ((i & 32) != 0) {
            str2 = null;
        }
        if ((i & 64) != 0) {
            function0 = null;
        }
        if ((i & 128) != 0) {
            function1 = null;
        }
        if ((i & 256) != 0) {
            z2 = true;
        }
        return s(bVar, r48Var, wu5Var, z, str, hpaVar, str2, function0, function1, z2, function2);
    }

    public static final androidx.compose.ui.b u(androidx.compose.ui.b bVar, boolean z, String str, hpa hpaVar, String str2, Function0<Unit> function0, Function0<Unit> function1, boolean z2, r48 r48Var, Function0<Unit> function2) {
        return bVar.then(new f(r48Var, null, true, z, str, hpaVar, function2, str2, function0, function1, z2, null));
    }

    public static /* synthetic */ androidx.compose.ui.b v(androidx.compose.ui.b bVar, boolean z, String str, hpa hpaVar, String str2, Function0 function0, Function0 function1, boolean z2, r48 r48Var, Function0 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            hpaVar = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            function0 = null;
        }
        if ((i & 32) != 0) {
            function1 = null;
        }
        if ((i & 64) != 0) {
            z2 = true;
        }
        if ((i & 128) != 0) {
            r48Var = null;
        }
        return u(bVar, z, str, hpaVar, str2, function0, function1, z2, r48Var, function2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final boolean w(k33 k33Var, final PointerInputChange pointerInputChange) throws KotlinNothingValueException {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        cw4.d(k33Var, new Function1() { // from class: com.google.android.ae1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ClickableKt.z(pointerInputChange, booleanRef, (zv4) obj));
            }
        });
        return booleanRef.element;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final boolean x(k33 k33Var, final IndirectPointerInputChange indirectPointerInputChange) throws KotlinNothingValueException {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        cw4.d(k33Var, new Function1() { // from class: com.google.android.zd1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ClickableKt.y(indirectPointerInputChange, booleanRef, (zv4) obj));
            }
        });
        return booleanRef.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean y(IndirectPointerInputChange indirectPointerInputChange, Ref.BooleanRef booleanRef, zv4 zv4Var) {
        boolean z = booleanRef.element || zv4Var.D2(indirectPointerInputChange);
        booleanRef.element = z;
        return !z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean z(PointerInputChange pointerInputChange, Ref.BooleanRef booleanRef, zv4 zv4Var) {
        boolean z = booleanRef.element || zv4Var.B1(pointerInputChange);
        booleanRef.element = z;
        return !z;
    }
}
