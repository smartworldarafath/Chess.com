package androidx.compose.p001foundation.text;

import androidx.compose.p001foundation.ClickableKt;
import androidx.compose.p001foundation.layout.j;
import androidx.compose.p001foundation.o;
import androidx.compose.p001foundation.text.TextLinkScope;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.p0;
import androidx.compose.p004runtime.s0;
import androidx.compose.p004runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.l;
import androidx.compose.ui.graphics.m;
import androidx.compose.ui.graphics.n;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.b;
import androidx.compose.ui.text.f;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.r2c;
import com.google.inputmethod.TextLayoutResult;
import com.google.inputmethod.afb;
import com.google.inputmethod.azc;
import com.google.inputmethod.bzc;
import com.google.inputmethod.cvd;
import com.google.inputmethod.czc;
import com.google.inputmethod.dzc;
import com.google.inputmethod.e37;
import com.google.inputmethod.f43;
import com.google.inputmethod.g16;
import com.google.inputmethod.gba;
import com.google.inputmethod.h37;
import com.google.inputmethod.jd3;
import com.google.inputmethod.k16;
import com.google.inputmethod.k26;
import com.google.inputmethod.kd3;
import com.google.inputmethod.l16;
import com.google.inputmethod.lyc;
import com.google.inputmethod.myc;
import com.google.inputmethod.ne9;
import com.google.inputmethod.nfb;
import com.google.inputmethod.o58;
import com.google.inputmethod.pe9;
import com.google.inputmethod.r48;
import com.google.inputmethod.rn8;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import com.google.inputmethod.vn3;
import com.google.inputmethod.xkb;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\u000b\u001a\u00020\u0006*\u00020\u00062\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\r\u001a\u00020\u0006*\u00020\u00062\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\tH\u0002¢\u0006\u0004\b\r\u0010\fJ#\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\t2\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001a\u001a\u0004\u0018\u00010\u0018*\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J;\u0010&\u001a\u00020\u001e2\u0016\u0010\"\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010!\"\u0004\u0018\u00010\u00012\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001e0#H\u0003¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u001eH\u0007¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0002H\u0000¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010+R/\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010/\u001a\u0004\u0018\u00010\u00148F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u00109\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u0010-\u001a\u0004\b7\u0010+\"\u0004\b8\u0010\u0005R&\u0010=\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001e0#0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00020?0>8F¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006C"}, d2 = {"Landroidx/compose/foundation/text/TextLinkScope;", "", "Landroidx/compose/ui/text/b;", "initialText", "<init>", "(Landroidx/compose/ui/text/b;)V", "Landroidx/compose/ui/b;", "Landroidx/compose/ui/text/b$d;", "Landroidx/compose/ui/text/f;", "Landroidx/compose/foundation/text/LinkRange;", "link", "J", "(Landroidx/compose/ui/b;Landroidx/compose/ui/text/b$d;)Landroidx/compose/ui/b;", "A", "Lcom/google/android/xkb;", "I", "(Landroidx/compose/ui/text/b$d;)Lcom/google/android/xkb;", "Landroidx/compose/ui/graphics/Path;", "G", "(Landroidx/compose/ui/text/b$d;)Landroidx/compose/ui/graphics/Path;", "Lcom/google/android/vxc;", "textLayoutResult", "z", "(Landroidx/compose/ui/text/b$d;Lcom/google/android/vxc;)Landroidx/compose/ui/text/b$d;", "Landroidx/compose/ui/text/r;", "other", "F", "(Landroidx/compose/ui/text/r;Landroidx/compose/ui/text/r;)Landroidx/compose/ui/text/r;", "Lcom/google/android/cvd;", "uriHandler", "", "E", "(Landroidx/compose/ui/text/f;Lcom/google/android/cvd;)V", "", "keys", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/q;", "block", "s", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/d;I)V", "n", "(Landroidx/compose/runtime/d;I)V", "y", "()Landroidx/compose/ui/text/b;", "a", "Landroidx/compose/ui/text/b;", "getInitialText$foundation", "<set-?>", "b", "Lcom/google/android/o58;", "D", "()Lcom/google/android/vxc;", "H", "(Lcom/google/android/vxc;)V", "c", "getText$foundation", "setText$foundation", "text", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "d", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "annotators", "Lkotlin/Function0;", "", "C", "()Lkotlin/jvm/functions/Function0;", "shouldMeasureLinks", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TextLinkScope {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final androidx.compose.ui.text.b initialText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private androidx.compose.ui.text.b text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final o58 textLayoutResult = s0.e(null, null, 2, null);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final SnapshotStateList<Function1<q, Unit>> annotators = p0.f();

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/foundation/text/TextLinkScope$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements jd3 {
        final /* synthetic */ Function1 b;

        public a(Function1 function1) {
            this.b = function1;
        }

        @Override // com.google.inputmethod.jd3
        public void dispose() {
            TextLinkScope.this.annotators.remove(this.b);
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"androidx/compose/foundation/text/TextLinkScope$b", "Lcom/google/android/xkb;", "Lcom/google/android/tsb;", "size", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lcom/google/android/f43;", "density", "Landroidx/compose/ui/graphics/n;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Lcom/google/android/f43;)Landroidx/compose/ui/graphics/n;", "createOutline", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements xkb {
        final /* synthetic */ Path a;

        b(Path path) {
            this.a = path;
        }

        @Override // com.google.inputmethod.xkb
        /* JADX INFO: renamed from: createOutline-Pq9zytI, reason: not valid java name */
        public n mo5createOutlinePq9zytI(long size, LayoutDirection layoutDirection, f43 density) {
            return new n.a(this.a);
        }
    }

    public TextLinkScope(androidx.compose.ui.text.b bVar) {
        this.initialText = bVar;
        this.text = bVar.a(new Function1() { // from class: com.google.android.zxc
            public final Object invoke(Object obj) {
                return TextLinkScope.w((b.Range) obj);
            }
        });
    }

    private final androidx.compose.ui.b A(androidx.compose.ui.b bVar, final androidx.compose.ui.text.b.Range<f> range) {
        return l.c(bVar, new Function1() { // from class: com.google.android.hyc
            public final Object invoke(Object obj) {
                return TextLinkScope.B(this.a, range, (m) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(TextLinkScope textLinkScope, androidx.compose.ui.text.b.Range range, m mVar) {
        xkb xkbVarI = textLinkScope.I(range);
        if (xkbVarI != null) {
            mVar.R0(xkbVarI);
            mVar.l(true);
        }
        return Unit.a;
    }

    private final void E(f link, cvd uriHandler) {
        e37 linkInteractionListener;
        if (!(link instanceof f.b)) {
            if (!(link instanceof f.a) || (linkInteractionListener = ((f.a) link).getLinkInteractionListener()) == null) {
                return;
            }
            linkInteractionListener.a(link);
            return;
        }
        e37 linkInteractionListener2 = ((f.b) link).getLinkInteractionListener();
        if (linkInteractionListener2 != null) {
            linkInteractionListener2.a(link);
        } else {
            try {
                uriHandler.a(((f.b) link).getUrl());
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    private final SpanStyle F(SpanStyle spanStyle, SpanStyle spanStyle2) {
        SpanStyle spanStyleY;
        return (spanStyle == null || (spanStyleY = spanStyle.y(spanStyle2)) == null) ? spanStyle2 : spanStyleY;
    }

    private final Path G(androidx.compose.ui.text.b.Range<f> link) {
        Path pathZ = null;
        if (!((Boolean) C().invoke()).booleanValue()) {
            return null;
        }
        TextLayoutResult textLayoutResultD = D();
        if (textLayoutResultD != null) {
            androidx.compose.ui.text.b.Range<f> rangeZ = z(link, textLayoutResultD);
            if (rangeZ == null) {
                return null;
            }
            pathZ = textLayoutResultD.z(rangeZ.h(), rangeZ.f());
            gba gbaVarD = textLayoutResultD.d(rangeZ.h());
            pathZ.i(rn8.e(rn8.e((((long) Float.floatToRawIntBits(textLayoutResultD.q(rangeZ.h()) == textLayoutResultD.q(rangeZ.f() + (-1)) ? Math.min(textLayoutResultD.d(rangeZ.f() - 1).getLeft(), gbaVarD.getLeft()) : 0.0f)) << 32) | (((long) Float.floatToRawIntBits(gbaVarD.getTop())) & 4294967295L)) ^ (-9223372034707292160L)));
        }
        return pathZ;
    }

    private final xkb I(androidx.compose.ui.text.b.Range<f> link) {
        Path pathG = G(link);
        if (pathG != null) {
            return new b(pathG);
        }
        return null;
    }

    private final androidx.compose.ui.b J(androidx.compose.ui.b bVar, final androidx.compose.ui.text.b.Range<f> range) {
        return bVar.then(new czc(new dzc() { // from class: com.google.android.kyc
            @Override // com.google.inputmethod.dzc
            public final azc a(bzc bzcVar) {
                return TextLinkScope.K(this.a, range, bzcVar);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final azc K(TextLinkScope textLinkScope, androidx.compose.ui.text.b.Range range, bzc bzcVar) {
        TextLayoutResult textLayoutResultD = textLinkScope.D();
        if (textLayoutResultD == null) {
            return bzcVar.a(0, 0, new Function0() { // from class: com.google.android.ayc
                public final Object invoke() {
                    return TextLinkScope.L();
                }
            });
        }
        androidx.compose.ui.text.b.Range<f> rangeZ = textLinkScope.z(range, textLayoutResultD);
        if (rangeZ == null) {
            return bzcVar.a(0, 0, new Function0() { // from class: com.google.android.byc
                public final Object invoke() {
                    return TextLinkScope.M();
                }
            });
        }
        final k16 k16VarC = l16.c(textLayoutResultD.z(rangeZ.h(), rangeZ.f()).getBounds());
        return bzcVar.a(k16VarC.r(), k16VarC.j(), new Function0() { // from class: com.google.android.cyc
            public final Object invoke() {
                return TextLinkScope.N(k16VarC);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g16 L() {
        return g16.c(g16.INSTANCE.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g16 M() {
        return g16.c(g16.INSTANCE.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g16 N(k16 k16Var) {
        return g16.c(k16Var.p());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(nfb nfbVar) {
        SemanticsPropertyKey<Unit> semanticsPropertyKeyZ = SemanticsProperties.a.z();
        Unit unit = Unit.a;
        nfbVar.b(semanticsPropertyKeyZ, unit);
        return unit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(TextLinkScope textLinkScope, androidx.compose.ui.text.b.Range range, cvd cvdVar) {
        textLinkScope.E((f) range.g(), cvdVar);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(TextLinkScope textLinkScope, androidx.compose.ui.text.b.Range range, h37 h37Var, q qVar) {
        myc styles;
        myc styles2;
        myc styles3;
        myc styles4 = ((f) range.g()).getStyles();
        SpanStyle pressedStyle = null;
        SpanStyle spanStyleF = textLinkScope.F(textLinkScope.F(styles4 != null ? styles4.getStyle() : null, (!h37Var.f() || (styles3 = ((f) range.g()).getStyles()) == null) ? null : styles3.getFocusedStyle()), (!h37Var.g() || (styles2 = ((f) range.g()).getStyles()) == null) ? null : styles2.getHoveredStyle());
        if (h37Var.h() && (styles = ((f) range.g()).getStyles()) != null) {
            pressedStyle = styles.getPressedStyle();
        }
        qVar.c(range, textLinkScope.F(spanStyleF, pressedStyle));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(TextLinkScope textLinkScope, int i, d dVar, int i2) {
        textLinkScope.n(dVar, saa.a(i | 1));
        return Unit.a;
    }

    private final void s(final Object[] objArr, final Function1<? super q, Unit> function1, d dVar, final int i) {
        d dVarF = dVar.F(-2083052099);
        int i2 = (i & 48) == 0 ? (dVarF.T(function1) ? 32 : 16) | i : i;
        if ((i & 384) == 0) {
            i2 |= dVarF.T(this) ? 256 : 128;
        }
        dVarF.V(-358306546, Integer.valueOf(objArr.length));
        int i3 = i2 | (dVarF.C(objArr.length) ? 4 : 0);
        for (Object obj : objArr) {
            i3 |= dVarF.T(obj) ? 4 : 0;
        }
        dVarF.Z();
        if ((i3 & 14) == 0) {
            i3 |= 2;
        }
        if (dVarF.g((i3 & 147) != 146, i3 & 1)) {
            if (e.k()) {
                e.o(-2083052099, i3, -1, "androidx.compose.foundation.text.TextLinkScope.StyleAnnotation (TextLinkScope.kt:315)");
            }
            r2c r2cVar = new r2c(2);
            r2cVar.a(function1);
            r2cVar.b(objArr);
            Object[] objArrD = r2cVar.d(new Object[r2cVar.c()]);
            boolean zT = dVarF.T(this) | ((i3 & 112) == 32);
            Object objR = dVarF.R();
            if (zT || objR == d.INSTANCE.a()) {
                objR = new Function1() { // from class: com.google.android.iyc
                    public final Object invoke(Object obj2) {
                        return TextLinkScope.t(this.a, function1, (kd3) obj2);
                    }
                };
                dVarF.L(objR);
            }
            vn3.d(objArrD, (Function1) objR, dVarF, 0);
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.jyc
                public final Object invoke(Object obj2, Object obj3) {
                    return TextLinkScope.u(this.a, objArr, function1, i, (d) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jd3 t(TextLinkScope textLinkScope, Function1 function1, kd3 kd3Var) {
        textLinkScope.annotators.add(function1);
        return textLinkScope.new a(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(TextLinkScope textLinkScope, Object[] objArr, Function1 function1, int i, d dVar, int i2) {
        textLinkScope.s(objArr, function1, dVar, saa.a(i | 1));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean v(TextLinkScope textLinkScope) {
        TextLayoutInput layoutInput;
        androidx.compose.ui.text.b bVar = textLinkScope.text;
        TextLayoutResult textLayoutResultD = textLinkScope.D();
        return Intrinsics.e(bVar, (textLayoutResultD == null || (layoutInput = textLayoutResultD.getLayoutInput()) == null) ? null : layoutInput.getText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List w(androidx.compose.ui.text.b.Range range) {
        SpanStyle spanStyle;
        if (range.g() instanceof f) {
            Object objG = range.g();
            Intrinsics.h(objG, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation");
            if (!lyc.b(((f) objG).getStyles())) {
                Object objG2 = range.g();
                Intrinsics.h(objG2, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation");
                myc styles = ((f) objG2).getStyles();
                if (styles == null || (spanStyle = styles.getStyle()) == null) {
                    spanStyle = new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65535, null);
                }
                return kotlin.collections.m.i(new androidx.compose.ui.text.b.Range[]{range, new androidx.compose.ui.text.b.Range(spanStyle, range.h(), range.f())});
            }
        }
        return kotlin.collections.m.i(new androidx.compose.ui.text.b.Range[]{range});
    }

    private final androidx.compose.ui.text.b.Range<f> z(androidx.compose.ui.text.b.Range<f> link, TextLayoutResult textLayoutResult) {
        int iP = TextLayoutResult.p(textLayoutResult, textLayoutResult.n() - 1, false, 2, null);
        if (link.h() < iP) {
            return androidx.compose.ui.text.b.Range.e(link, null, 0, Math.min(link.f(), iP), null, 11, null);
        }
        return null;
    }

    public final Function0<Boolean> C() {
        return new Function0() { // from class: com.google.android.gyc
            public final Object invoke() {
                return Boolean.valueOf(TextLinkScope.v(this.a));
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TextLayoutResult D() {
        return (TextLayoutResult) this.textLayoutResult.getValue();
    }

    public final void H(TextLayoutResult textLayoutResult) {
        this.textLayoutResult.setValue(textLayoutResult);
    }

    public final void n(d dVar, final int i) {
        int i2;
        d dVarF = dVar.F(1154651354);
        if ((i & 6) == 0) {
            i2 = (dVarF.T(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 1;
        if (dVarF.g((i2 & 3) != 2, i2 & 1)) {
            if (e.k()) {
                e.o(1154651354, i2, -1, "androidx.compose.foundation.text.TextLinkScope.LinksComposables (TextLinkScope.kt:214)");
            }
            final cvd cvdVar = (cvd) dVarF.v(CompositionLocalsKt.t());
            androidx.compose.ui.text.b bVar = this.text;
            List<androidx.compose.ui.text.b.Range<f>> listE = bVar.e(0, bVar.length());
            int size = listE.size();
            int i4 = 0;
            while (i4 < size) {
                final androidx.compose.ui.text.b.Range<f> range = listE.get(i4);
                if (range.h() != range.f()) {
                    dVarF.y(725478935);
                    Object objR = dVarF.R();
                    d.Companion companion = d.INSTANCE;
                    if (objR == companion.a()) {
                        objR = k26.a();
                        dVarF.L(objR);
                    }
                    r48 r48Var = (r48) objR;
                    androidx.compose.ui.b bVarA = A(androidx.compose.ui.b.INSTANCE, range);
                    Object objR2 = dVarF.R();
                    if (objR2 == companion.a()) {
                        objR2 = new Function1() { // from class: com.google.android.dyc
                            public final Object invoke(Object obj) {
                                return TextLinkScope.o((nfb) obj);
                            }
                        };
                        dVarF.L(objR2);
                    }
                    androidx.compose.ui.b bVarB = pe9.b(o.b(J(afb.d(bVarA, false, (Function1) objR2, i3, null), range), r48Var, false, 2, null), ne9.INSTANCE.b(), false, 2, null);
                    boolean zT = dVarF.T(this) | dVarF.x(range) | dVarF.T(cvdVar);
                    Object objR3 = dVarF.R();
                    if (zT || objR3 == companion.a()) {
                        objR3 = new Function0() { // from class: com.google.android.eyc
                            public final Object invoke() {
                                return TextLinkScope.p(this.a, range, cvdVar);
                            }
                        };
                        dVarF.L(objR3);
                    }
                    j.b(ClickableKt.t(bVarB, r48Var, null, false, null, null, null, null, null, false, (Function0) objR3, 508, null), dVarF, 0);
                    if (lyc.b(range.g().getStyles())) {
                        dVarF.y(728331710);
                        dVarF.u();
                    } else {
                        dVarF.y(726303039);
                        Object objR4 = dVarF.R();
                        if (objR4 == companion.a()) {
                            objR4 = new h37(r48Var);
                            dVarF.L(objR4);
                        }
                        final h37 h37Var = (h37) objR4;
                        Unit unit = Unit.a;
                        Object objR5 = dVarF.R();
                        if (objR5 == companion.a()) {
                            objR5 = new TextLinkScope$LinksComposables$1$3$1(h37Var, null);
                            dVarF.L(objR5);
                        }
                        vn3.g(unit, (Function2) objR5, dVarF, 6);
                        Boolean boolValueOf = Boolean.valueOf(h37Var.g());
                        Boolean boolValueOf2 = Boolean.valueOf(h37Var.f());
                        Boolean boolValueOf3 = Boolean.valueOf(h37Var.h());
                        myc styles = range.g().getStyles();
                        SpanStyle style = styles != null ? styles.getStyle() : null;
                        myc styles2 = range.g().getStyles();
                        SpanStyle focusedStyle = styles2 != null ? styles2.getFocusedStyle() : null;
                        myc styles3 = range.g().getStyles();
                        SpanStyle hoveredStyle = styles3 != null ? styles3.getHoveredStyle() : null;
                        myc styles4 = range.g().getStyles();
                        Object[] objArr = {boolValueOf, boolValueOf2, boolValueOf3, style, focusedStyle, hoveredStyle, styles4 != null ? styles4.getPressedStyle() : null};
                        boolean zT2 = dVarF.T(this) | dVarF.x(range);
                        Object objR6 = dVarF.R();
                        if (zT2 || objR6 == companion.a()) {
                            objR6 = new Function1() { // from class: androidx.compose.foundation.text.v
                                public final Object invoke(Object obj) {
                                    return TextLinkScope.q(this.a, range, h37Var, (q) obj);
                                }
                            };
                            dVarF.L(objR6);
                        }
                        s(objArr, (Function1) objR6, dVarF, (i2 << 6) & 896);
                        dVarF.u();
                    }
                    dVarF.u();
                } else {
                    dVarF.y(728345598);
                    dVarF.u();
                }
                i4++;
                i3 = 1;
            }
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.fyc
                public final Object invoke(Object obj, Object obj2) {
                    return TextLinkScope.r(this.a, i, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final androidx.compose.ui.text.b y() {
        androidx.compose.ui.text.b styledText;
        if (this.annotators.isEmpty()) {
            styledText = this.text;
        } else {
            q qVar = new q(this.text);
            SnapshotStateList<Function1<q, Unit>> snapshotStateList = this.annotators;
            int size = snapshotStateList.size();
            for (int i = 0; i < size; i++) {
                snapshotStateList.get(i).invoke(qVar);
            }
            styledText = qVar.getStyledText();
        }
        this.text = styledText;
        return styledText;
    }
}
