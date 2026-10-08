package com.google.inputmethod;

import androidx.compose.ui.b;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.c;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.font.t;
import androidx.compose.ui.text.font.u;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001d\u001a\u00020\u001c*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001f\u0010\u0016J\u000f\u0010 \u001a\u00020\u0012H\u0016¢\u0006\u0004\b \u0010\u0016J\u000f\u0010!\u001a\u00020\u0012H\u0016¢\u0006\u0004\b!\u0010\u0016J\u0015\u0010\"\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u00100\u001a\u00020+8\u0016X\u0096D¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lcom/google/android/zvc;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/bs1;", "Landroidx/compose/ui/node/c;", "Landroidx/compose/ui/text/y;", "style", "<init>", "(Landroidx/compose/ui/text/y;)V", "Lcom/google/android/q6c;", "", "o3", "()Lcom/google/android/q6c;", "Lcom/google/android/svc;", "p3", "()Lcom/google/android/svc;", "resolvedStyle", "Landroidx/compose/ui/text/font/l$b;", "fontFamilyResolver", "", "r3", "(Landroidx/compose/ui/text/y;Landroidx/compose/ui/text/font/l$b;)V", "V2", "()V", "Landroidx/compose/ui/layout/j;", "Lcom/google/android/dj7;", "measurable", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "b", "(Landroidx/compose/ui/layout/j;Lcom/google/android/dj7;J)Lcom/google/android/fj7;", "C1", "N", "W2", "q3", "p", "Landroidx/compose/ui/text/y;", "q", "Lcom/google/android/q6c;", "fontResolutionState", "r", "Lcom/google/android/svc;", "minSizeState", "", "s", "Z", "Q2", "()Z", "shouldAutoInvalidate", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class zvc extends b.c implements bs1, c {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final TextStyle style;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private q6c<? extends Object> fontResolutionState;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private svc minSizeState;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    public zvc(TextStyle textStyle) {
        this.style = textStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n3(o oVar, o.a aVar) {
        o.a.L(aVar, oVar, 0, 0, 0.0f, 4, null);
        return Unit.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final q6c<Object> o3() throws KotlinNothingValueException {
        q6c<? extends Object> q6cVar = this.fontResolutionState;
        if (q6cVar != null) {
            return q6cVar;
        }
        cx5.b("Font resolution state is not set.");
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final svc p3() throws KotlinNothingValueException {
        svc svcVar = this.minSizeState;
        if (svcVar != null) {
            return svcVar;
        }
        cx5.b("Min size state is not set.");
        throw new KotlinNothingValueException();
    }

    private final void r3(TextStyle resolvedStyle, l.b fontFamilyResolver) {
        l lVarJ = resolvedStyle.j();
        FontWeight fontWeightO = resolvedStyle.o();
        if (fontWeightO == null) {
            fontWeightO = FontWeight.INSTANCE.f();
        }
        t tVarM = resolvedStyle.m();
        int value = tVarM != null ? tVarM.getValue() : t.INSTANCE.b();
        u uVarN = resolvedStyle.n();
        this.fontResolutionState = fontFamilyResolver.a(lVarJ, fontWeightO, value, uVarN != null ? uVarN.getValue() : u.INSTANCE.a());
        bo6.b(this);
    }

    @Override // com.google.inputmethod.x23
    public void C1() {
        svc svcVar = this.minSizeState;
        if (svcVar != null) {
            svc.f(svcVar, y23.p(this), null, null, null, null, 30, null);
        }
        bo6.b(this);
    }

    @Override // com.google.inputmethod.x23, com.google.inputmethod.bf9
    public void N() {
        svc svcVar = this.minSizeState;
        if (svcVar != null) {
            svc.f(svcVar, null, y23.m(this), null, null, null, 29, null);
        }
        bo6.b(this);
    }

    @Override // androidx.compose.ui.b.c
    /* JADX INFO: renamed from: Q2, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.b.c
    public void V2() {
        TextStyle textStyleD = vzc.d(this.style, y23.p(this));
        l.b bVar = (l.b) cs1.a(this, CompositionLocalsKt.i());
        r3(textStyleD, bVar);
        this.minSizeState = new svc(y23.p(this), y23.m(this), bVar, textStyleD, o3().getValue());
    }

    @Override // androidx.compose.ui.b.c
    public void W2() {
        this.fontResolutionState = null;
        this.minSizeState = null;
    }

    @Override // androidx.compose.ui.node.c
    public fj7 b(j jVar, dj7 dj7Var, long j) {
        long jA = p3().a(o3().getValue());
        final o oVarR0 = dj7Var.r0(nx1.e(j, nx1.b((int) (jA >> 32), 0, (int) (jA & 4294967295L), 0, 10, null)));
        return j.Q1(jVar, oVarR0.getWidth(), oVarR0.getHeight(), null, new Function1() { // from class: com.google.android.yvc
            public final Object invoke(Object obj) {
                return zvc.n3(oVarR0, (o.a) obj);
            }
        }, 4, null);
    }

    public final void q3(TextStyle style) {
        TextStyle textStyleD = vzc.d(style, y23.p(this));
        r3(textStyleD, (l.b) cs1.a(this, CompositionLocalsKt.i()));
        svc.f(p3(), null, null, null, textStyleD, null, 23, null);
        bo6.b(this);
    }
}
