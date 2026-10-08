package androidx.compose.p001foundation.layout;

import androidx.compose.ui.b;
import androidx.compose.ui.platform.InspectableValueKt;
import com.google.inputmethod.ff3;
import com.google.inputmethod.jf3;
import com.google.inputmethod.jz5;
import com.google.inputmethod.tc;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u001b\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\b\u0010\u0004\u001a#\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0010\u0010\n\u001a'\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0011\u0010\n\u001a;\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001b\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0018\u0010\u0004\u001a\u001b\u0010\u0019\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0019\u0010\u0004\u001a\u001b\u0010\u001a\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001a\u0010\u0004\u001a#\u0010\u001b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001b\u0010\n\u001a'\u0010\u001c\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001c\u0010\n\u001a;\u0010\u001d\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001d\u0010\u0017\u001a\u001d\u0010 \u001a\u00020\u0000*\u00020\u00002\b\b\u0003\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b \u0010\u0004\u001a\u001d\u0010!\u001a\u00020\u0000*\u00020\u00002\b\b\u0003\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b!\u0010\u0004\u001a\u001d\u0010\"\u001a\u00020\u0000*\u00020\u00002\b\b\u0003\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b\"\u0010\u0004\u001a'\u0010'\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b'\u0010(\u001a'\u0010*\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010$\u001a\u00020)2\b\b\u0002\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b*\u0010+\u001a'\u0010-\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010$\u001a\u00020,2\b\b\u0002\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b-\u0010.\u001a'\u0010/\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0001H\u0007¢\u0006\u0004\b/\u0010\n\"\u0014\u00102\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00101\"\u0014\u00104\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00101\"\u0014\u00105\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00101\"\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108\"\u0014\u0010:\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00108\"\u0014\u0010<\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00108\"\u0014\u0010=\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00108\"\u0014\u0010?\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00108\"\u0014\u0010@\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00108¨\u0006A"}, d2 = {"Landroidx/compose/ui/b;", "Lcom/google/android/ff3;", "width", "y", "(Landroidx/compose/ui/b;F)Landroidx/compose/ui/b;", "height", "i", "size", "t", "v", "(Landroidx/compose/ui/b;FF)Landroidx/compose/ui/b;", "Lcom/google/android/jf3;", "u", "(Landroidx/compose/ui/b;J)Landroidx/compose/ui/b;", "min", "max", "z", "j", "minWidth", "minHeight", "maxWidth", "maxHeight", "w", "(Landroidx/compose/ui/b;FFFF)Landroidx/compose/ui/b;", "q", "l", "m", "n", "r", "o", "", "fraction", "g", "c", "e", "Lcom/google/android/tc$b;", "align", "", "unbounded", "F", "(Landroidx/compose/ui/b;Lcom/google/android/tc$b;Z)Landroidx/compose/ui/b;", "Lcom/google/android/tc$c;", "B", "(Landroidx/compose/ui/b;Lcom/google/android/tc$c;Z)Landroidx/compose/ui/b;", "Lcom/google/android/tc;", "D", "(Landroidx/compose/ui/b;Lcom/google/android/tc;Z)Landroidx/compose/ui/b;", "a", "Landroidx/compose/foundation/layout/x;", "Landroidx/compose/foundation/layout/x;", "FillWholeMaxWidth", "b", "FillWholeMaxHeight", "FillWholeMaxSize", "Landroidx/compose/foundation/layout/j1;", "d", "Landroidx/compose/foundation/layout/j1;", "WrapContentWidthCenter", "WrapContentWidthStart", "f", "WrapContentHeightCenter", "WrapContentHeightTop", "h", "WrapContentSizeCenter", "WrapContentSizeTopStart", "foundation-layout"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class SizeKt {
    private static final x a;
    private static final x b;
    private static final x c;
    private static final j1 d;
    private static final j1 e;
    private static final j1 f;
    private static final j1 g;
    private static final j1 h;
    private static final j1 i;

    static {
        x.Companion aVar = x.INSTANCE;
        a = aVar.c(1.0f);
        b = aVar.a(1.0f);
        c = aVar.b(1.0f);
        j1.Companion aVar2 = j1.INSTANCE;
        tc.Companion companion = tc.INSTANCE;
        d = aVar2.h(companion.g(), false);
        e = aVar2.h(companion.k(), false);
        f = aVar2.d(companion.i(), false);
        g = aVar2.d(companion.l(), false);
        h = aVar2.f(companion.e(), false);
        i = aVar2.f(companion.o(), false);
    }

    public static /* synthetic */ b A(b bVar, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = ff3.INSTANCE.c();
        }
        if ((i2 & 2) != 0) {
            f3 = ff3.INSTANCE.c();
        }
        return z(bVar, f2, f3);
    }

    public static final b B(b bVar, tc.c cVar, boolean z) {
        j1 j1VarD;
        tc.Companion companion = tc.INSTANCE;
        if (!Intrinsics.e(cVar, companion.i()) || z) {
            j1VarD = (!Intrinsics.e(cVar, companion.l()) || z) ? j1.INSTANCE.d(cVar, z) : g;
        } else {
            j1VarD = f;
        }
        return bVar.then(j1VarD);
    }

    public static /* synthetic */ b C(b bVar, tc.c cVar, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cVar = tc.INSTANCE.i();
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        return B(bVar, cVar, z);
    }

    public static final b D(b bVar, tc tcVar, boolean z) {
        j1 j1VarF;
        tc.Companion companion = tc.INSTANCE;
        if (!Intrinsics.e(tcVar, companion.e()) || z) {
            j1VarF = (!Intrinsics.e(tcVar, companion.o()) || z) ? j1.INSTANCE.f(tcVar, z) : i;
        } else {
            j1VarF = h;
        }
        return bVar.then(j1VarF);
    }

    public static /* synthetic */ b E(b bVar, tc tcVar, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            tcVar = tc.INSTANCE.e();
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        return D(bVar, tcVar, z);
    }

    public static final b F(b bVar, tc.b bVar2, boolean z) {
        j1 j1VarH;
        tc.Companion companion = tc.INSTANCE;
        if (!Intrinsics.e(bVar2, companion.g()) || z) {
            j1VarH = (!Intrinsics.e(bVar2, companion.k()) || z) ? j1.INSTANCE.h(bVar2, z) : e;
        } else {
            j1VarH = d;
        }
        return bVar.then(j1VarH);
    }

    public static /* synthetic */ b G(b bVar, tc.b bVar2, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bVar2 = tc.INSTANCE.g();
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        return F(bVar, bVar2, z);
    }

    public static final b a(b bVar, float f2, float f3) {
        return bVar.then(new c1(f2, f3, null));
    }

    public static /* synthetic */ b b(b bVar, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = ff3.INSTANCE.c();
        }
        if ((i2 & 2) != 0) {
            f3 = ff3.INSTANCE.c();
        }
        return a(bVar, f2, f3);
    }

    public static final b c(b bVar, float f2) {
        return bVar.then(f2 == 1.0f ? b : x.INSTANCE.a(f2));
    }

    public static /* synthetic */ b d(b bVar, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        return c(bVar, f2);
    }

    public static final b e(b bVar, float f2) {
        return bVar.then(f2 == 1.0f ? c : x.INSTANCE.b(f2));
    }

    public static /* synthetic */ b f(b bVar, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        return e(bVar, f2);
    }

    public static final b g(b bVar, float f2) {
        return bVar.then(f2 == 1.0f ? a : x.INSTANCE.c(f2));
    }

    public static /* synthetic */ b h(b bVar, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        return g(bVar, f2);
    }

    public static final b i(b bVar, final float f2) {
        return bVar.then(new v0(0.0f, f2, 0.0f, f2, true, InspectableValueKt.b() ? new Function1<jz5, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$height-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(jz5 jz5Var) {
                jz5Var.b("height");
                jz5Var.c(ff3.e(f2));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((jz5) obj);
                return Unit.a;
            }
        } : InspectableValueKt.a(), 5, null));
    }

    public static final b j(b bVar, final float f2, final float f3) {
        return bVar.then(new v0(0.0f, f2, 0.0f, f3, true, InspectableValueKt.b() ? new Function1<jz5, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$heightIn-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(jz5 jz5Var) {
                jz5Var.b("heightIn");
                jz5Var.getProperties().c("min", ff3.e(f2));
                jz5Var.getProperties().c("max", ff3.e(f3));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((jz5) obj);
                return Unit.a;
            }
        } : InspectableValueKt.a(), 5, null));
    }

    public static /* synthetic */ b k(b bVar, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = ff3.INSTANCE.c();
        }
        if ((i2 & 2) != 0) {
            f3 = ff3.INSTANCE.c();
        }
        return j(bVar, f2, f3);
    }

    public static final b l(b bVar, final float f2) {
        return bVar.then(new v0(0.0f, f2, 0.0f, f2, false, InspectableValueKt.b() ? new Function1<jz5, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredHeight-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(jz5 jz5Var) {
                jz5Var.b("requiredHeight");
                jz5Var.c(ff3.e(f2));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((jz5) obj);
                return Unit.a;
            }
        } : InspectableValueKt.a(), 5, null));
    }

    public static final b m(b bVar, final float f2) {
        return bVar.then(new v0(f2, f2, f2, f2, false, InspectableValueKt.b() ? new Function1<jz5, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSize-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(jz5 jz5Var) {
                jz5Var.b("requiredSize");
                jz5Var.c(ff3.e(f2));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((jz5) obj);
                return Unit.a;
            }
        } : InspectableValueKt.a(), null));
    }

    public static final b n(b bVar, final float f2, final float f3) {
        return bVar.then(new v0(f2, f3, f2, f3, false, InspectableValueKt.b() ? new Function1<jz5, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSize-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(jz5 jz5Var) {
                jz5Var.b("requiredSize");
                jz5Var.getProperties().c("width", ff3.e(f2));
                jz5Var.getProperties().c("height", ff3.e(f3));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((jz5) obj);
                return Unit.a;
            }
        } : InspectableValueKt.a(), null));
    }

    public static final b o(b bVar, final float f2, final float f3, final float f4, final float f5) {
        return bVar.then(new v0(f2, f3, f4, f5, false, InspectableValueKt.b() ? new Function1<jz5, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSizeIn-qDBjuR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(jz5 jz5Var) {
                jz5Var.b("requiredSizeIn");
                jz5Var.getProperties().c("minWidth", ff3.e(f2));
                jz5Var.getProperties().c("minHeight", ff3.e(f3));
                jz5Var.getProperties().c("maxWidth", ff3.e(f4));
                jz5Var.getProperties().c("maxHeight", ff3.e(f5));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((jz5) obj);
                return Unit.a;
            }
        } : InspectableValueKt.a(), null));
    }

    public static /* synthetic */ b p(b bVar, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = ff3.INSTANCE.c();
        }
        if ((i2 & 2) != 0) {
            f3 = ff3.INSTANCE.c();
        }
        if ((i2 & 4) != 0) {
            f4 = ff3.INSTANCE.c();
        }
        if ((i2 & 8) != 0) {
            f5 = ff3.INSTANCE.c();
        }
        return o(bVar, f2, f3, f4, f5);
    }

    public static final b q(b bVar, final float f2) {
        return bVar.then(new v0(f2, 0.0f, f2, 0.0f, false, InspectableValueKt.b() ? new Function1<jz5, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredWidth-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(jz5 jz5Var) {
                jz5Var.b("requiredWidth");
                jz5Var.c(ff3.e(f2));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((jz5) obj);
                return Unit.a;
            }
        } : InspectableValueKt.a(), 10, null));
    }

    public static final b r(b bVar, final float f2, final float f3) {
        return bVar.then(new v0(f2, 0.0f, f3, 0.0f, false, InspectableValueKt.b() ? new Function1<jz5, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredWidthIn-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(jz5 jz5Var) {
                jz5Var.b("requiredWidthIn");
                jz5Var.getProperties().c("min", ff3.e(f2));
                jz5Var.getProperties().c("max", ff3.e(f3));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((jz5) obj);
                return Unit.a;
            }
        } : InspectableValueKt.a(), 10, null));
    }

    public static /* synthetic */ b s(b bVar, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = ff3.INSTANCE.c();
        }
        if ((i2 & 2) != 0) {
            f3 = ff3.INSTANCE.c();
        }
        return r(bVar, f2, f3);
    }

    public static final b t(b bVar, final float f2) {
        return bVar.then(new v0(f2, f2, f2, f2, true, InspectableValueKt.b() ? new Function1<jz5, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$size-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(jz5 jz5Var) {
                jz5Var.b("size");
                jz5Var.c(ff3.e(f2));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((jz5) obj);
                return Unit.a;
            }
        } : InspectableValueKt.a(), null));
    }

    public static final b u(b bVar, long j) {
        return v(bVar, jf3.h(j), jf3.g(j));
    }

    public static final b v(b bVar, final float f2, final float f3) {
        return bVar.then(new v0(f2, f3, f2, f3, true, InspectableValueKt.b() ? new Function1<jz5, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$size-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(jz5 jz5Var) {
                jz5Var.b("size");
                jz5Var.getProperties().c("width", ff3.e(f2));
                jz5Var.getProperties().c("height", ff3.e(f3));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((jz5) obj);
                return Unit.a;
            }
        } : InspectableValueKt.a(), null));
    }

    public static final b w(b bVar, final float f2, final float f3, final float f4, final float f5) {
        return bVar.then(new v0(f2, f3, f4, f5, true, InspectableValueKt.b() ? new Function1<jz5, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$sizeIn-qDBjuR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(jz5 jz5Var) {
                jz5Var.b("sizeIn");
                jz5Var.getProperties().c("minWidth", ff3.e(f2));
                jz5Var.getProperties().c("minHeight", ff3.e(f3));
                jz5Var.getProperties().c("maxWidth", ff3.e(f4));
                jz5Var.getProperties().c("maxHeight", ff3.e(f5));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((jz5) obj);
                return Unit.a;
            }
        } : InspectableValueKt.a(), null));
    }

    public static /* synthetic */ b x(b bVar, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = ff3.INSTANCE.c();
        }
        if ((i2 & 2) != 0) {
            f3 = ff3.INSTANCE.c();
        }
        if ((i2 & 4) != 0) {
            f4 = ff3.INSTANCE.c();
        }
        if ((i2 & 8) != 0) {
            f5 = ff3.INSTANCE.c();
        }
        return w(bVar, f2, f3, f4, f5);
    }

    public static final b y(b bVar, final float f2) {
        return bVar.then(new v0(f2, 0.0f, f2, 0.0f, true, InspectableValueKt.b() ? new Function1<jz5, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$width-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(jz5 jz5Var) {
                jz5Var.b("width");
                jz5Var.c(ff3.e(f2));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((jz5) obj);
                return Unit.a;
            }
        } : InspectableValueKt.a(), 10, null));
    }

    public static final b z(b bVar, final float f2, final float f3) {
        return bVar.then(new v0(f2, 0.0f, f3, 0.0f, true, InspectableValueKt.b() ? new Function1<jz5, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$widthIn-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(jz5 jz5Var) {
                jz5Var.b("widthIn");
                jz5Var.getProperties().c("min", ff3.e(f2));
                jz5Var.getProperties().c("max", ff3.e(f3));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((jz5) obj);
                return Unit.a;
            }
        } : InspectableValueKt.a(), 10, null));
    }
}
