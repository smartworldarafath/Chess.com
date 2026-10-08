package androidx.compose.p001foundation.text;

import androidx.compose.ui.b;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.c;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.font.t;
import androidx.compose.ui.text.font.u;
import com.google.inputmethod.bo6;
import com.google.inputmethod.bs1;
import com.google.inputmethod.cs1;
import com.google.inputmethod.cx5;
import com.google.inputmethod.dj7;
import com.google.inputmethod.f43;
import com.google.inputmethod.fj7;
import com.google.inputmethod.kx1;
import com.google.inputmethod.on8;
import com.google.inputmethod.q6c;
import com.google.inputmethod.vzc;
import com.google.inputmethod.y23;
import com.google.inputmethod.ysc;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u0014J#\u0010#\u001a\u00020\"*\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0012H\u0016¢\u0006\u0004\b%\u0010\u0014J\u000f\u0010&\u001a\u00020\u0012H\u0016¢\u0006\u0004\b&\u0010\u0014J\u000f\u0010'\u001a\u00020\u0012H\u0016¢\u0006\u0004\b'\u0010\u0014J\u000f\u0010(\u001a\u00020\u0012H\u0016¢\u0006\u0004\b(\u0010\u0014J%\u0010)\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b)\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010\t\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00104\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010-R\u0016\u00106\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010-R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010+R\u001e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010>\u001a\u00020/8\u0016X\u0096D¢\u0006\f\n\u0004\b;\u00101\u001a\u0004\b<\u0010=¨\u0006?"}, d2 = {"Landroidx/compose/foundation/text/j;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/bs1;", "Landroidx/compose/ui/node/c;", "Lcom/google/android/on8;", "Landroidx/compose/ui/text/y;", "textStyle", "", "minLines", "maxLines", "<init>", "(Landroidx/compose/ui/text/y;II)V", "v3", "()Landroidx/compose/ui/text/y;", "Lcom/google/android/q6c;", "", "u3", "()Lcom/google/android/q6c;", "", "s3", "()V", "Lcom/google/android/f43;", "density", "resolvedStyle", "Landroidx/compose/ui/text/font/l$b;", "fontFamilyResolver", "p3", "(Lcom/google/android/f43;Landroidx/compose/ui/text/y;Landroidx/compose/ui/text/font/l$b;)V", "V2", "Landroidx/compose/ui/layout/j;", "Lcom/google/android/dj7;", "measurable", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "b", "(Landroidx/compose/ui/layout/j;Lcom/google/android/dj7;J)Lcom/google/android/fj7;", "M1", "C1", "N", "W2", "w3", "p", "Landroidx/compose/ui/text/y;", "q", "I", "r", "", "s", "Z", "dirty", "t", "precomputedMinLinesHeight", "u", "precomputedMaxLinesHeight", "v", "w", "Lcom/google/android/q6c;", "fontResolutionState", "x", "Q2", "()Z", "shouldAutoInvalidate", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class j extends b.c implements bs1, c, on8 {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private TextStyle textStyle;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private int minLines;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private int maxLines;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private boolean dirty;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private int precomputedMinLinesHeight = -1;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private int precomputedMaxLinesHeight = -1;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private TextStyle resolvedStyle;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private q6c<? extends Object> fontResolutionState;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    public j(TextStyle textStyle, int i, int i2) {
        this.textStyle = textStyle;
        this.minLines = i;
        this.maxLines = i2;
    }

    private final void p3(f43 density, TextStyle resolvedStyle, l.b fontFamilyResolver) {
        int iA = (int) (ysc.a(resolvedStyle, density, fontFamilyResolver, ysc.d(), 1) & 4294967295L);
        int iA2 = ((int) (ysc.a(resolvedStyle, density, fontFamilyResolver, ysc.d() + '\n' + ysc.d(), 2) & 4294967295L)) - iA;
        int i = this.minLines;
        this.precomputedMinLinesHeight = i == 1 ? -1 : ((i - 1) * iA2) + iA;
        int i2 = this.maxLines;
        this.precomputedMaxLinesHeight = i2 != Integer.MAX_VALUE ? iA + (iA2 * (i2 - 1)) : -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q3(o oVar, o.a aVar) {
        o.a.L(aVar, oVar, 0, 0, 0.0f, 4, null);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r3(j jVar) {
        jVar.u3().getValue();
        return Unit.a;
    }

    private final void s3() {
        if (this.fontResolutionState != null) {
            androidx.compose.ui.node.l.a(this, new Function0() { // from class: androidx.compose.foundation.text.h
                public final Object invoke() {
                    return j.t3(this.a);
                }
            });
        }
        this.dirty = true;
        bo6.b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t3(j jVar) {
        jVar.u3().getValue();
        return Unit.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final q6c<Object> u3() throws KotlinNothingValueException {
        q6c<? extends Object> q6cVar = this.fontResolutionState;
        if (q6cVar != null) {
            return q6cVar;
        }
        cx5.b("Font resolution state is not set.");
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final TextStyle v3() throws KotlinNothingValueException {
        TextStyle textStyle = this.resolvedStyle;
        if (textStyle != null) {
            return textStyle;
        }
        cx5.b("Resolved style is not set.");
        throw new KotlinNothingValueException();
    }

    @Override // com.google.inputmethod.x23
    public void C1() {
        this.resolvedStyle = vzc.d(this.textStyle, y23.p(this));
        this.dirty = true;
        bo6.b(this);
    }

    @Override // com.google.inputmethod.on8
    public void M1() {
        s3();
    }

    @Override // com.google.inputmethod.x23, com.google.inputmethod.bf9
    public void N() {
        this.dirty = true;
        bo6.b(this);
    }

    @Override // androidx.compose.ui.b.c
    /* JADX INFO: renamed from: Q2, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.b.c
    public void V2() {
        super.V2();
        l.b bVar = (l.b) cs1.a(this, CompositionLocalsKt.i());
        this.resolvedStyle = vzc.d(this.textStyle, y23.p(this));
        l lVarJ = v3().j();
        FontWeight fontWeightO = v3().o();
        if (fontWeightO == null) {
            fontWeightO = FontWeight.INSTANCE.f();
        }
        t tVarM = v3().m();
        int value = tVarM != null ? tVarM.getValue() : t.INSTANCE.b();
        u uVarN = v3().n();
        this.fontResolutionState = bVar.a(lVarJ, fontWeightO, value, uVarN != null ? uVarN.getValue() : u.INSTANCE.a());
        androidx.compose.ui.node.l.a(this, new Function0() { // from class: androidx.compose.foundation.text.g
            public final Object invoke() {
                return j.r3(this.a);
            }
        });
        this.dirty = true;
    }

    @Override // androidx.compose.ui.b.c
    public void W2() {
        this.resolvedStyle = null;
        this.fontResolutionState = null;
        this.dirty = false;
    }

    @Override // androidx.compose.ui.node.c
    public fj7 b(androidx.compose.ui.layout.j jVar, dj7 dj7Var, long j) {
        if (this.dirty) {
            p3(jVar, v3(), (l.b) cs1.a(this, CompositionLocalsKt.i()));
            this.dirty = false;
        }
        int i = this.precomputedMinLinesHeight;
        int iO = i != -1 ? g.o(i, kx1.m(j), kx1.k(j)) : kx1.m(j);
        int i2 = this.precomputedMaxLinesHeight;
        final o oVarR0 = dj7Var.r0(kx1.d(j, 0, 0, iO, i2 != -1 ? g.o(i2, kx1.m(j), kx1.k(j)) : kx1.k(j), 3, null));
        return androidx.compose.ui.layout.j.Q1(jVar, oVarR0.getWidth(), oVarR0.getHeight(), null, new Function1() { // from class: androidx.compose.foundation.text.i
            public final Object invoke(Object obj) {
                return j.q3(oVarR0, (o.a) obj);
            }
        }, 4, null);
    }

    public final void w3(TextStyle textStyle, int minLines, int maxLines) {
        if (Intrinsics.e(this.textStyle, textStyle) && this.minLines == minLines && this.maxLines == maxLines) {
            return;
        }
        this.textStyle = textStyle;
        this.minLines = minLines;
        this.maxLines = maxLines;
        this.resolvedStyle = vzc.d(textStyle, y23.p(this));
        this.dirty = true;
        bo6.b(this);
    }
}
