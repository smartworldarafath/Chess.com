package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.o;
import com.google.inputmethod.d02;
import com.google.inputmethod.dj7;
import com.google.inputmethod.f4b;
import com.google.inputmethod.f66;
import com.google.inputmethod.fj7;
import com.google.inputmethod.fz1;
import com.google.inputmethod.g16;
import com.google.inputmethod.h66;
import com.google.inputmethod.kx1;
import com.google.inputmethod.nx1;
import com.google.inputmethod.q16;
import com.google.inputmethod.tc;
import com.google.inputmethod.tsb;
import com.google.inputmethod.yg3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: androidx.compose.ui.draw.PainterNode, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b*\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BA\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0015J\u0013\u0010\u0019\u001a\u00020\u0006*\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u0006*\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ#\u0010 \u001a\u00020\u001f*\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b \u0010!J#\u0010&\u001a\u00020$*\u00020\"2\u0006\u0010\u001e\u001a\u00020#2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J#\u0010(\u001a\u00020$*\u00020\"2\u0006\u0010\u001e\u001a\u00020#2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b(\u0010'J#\u0010*\u001a\u00020$*\u00020\"2\u0006\u0010\u001e\u001a\u00020#2\u0006\u0010)\u001a\u00020$H\u0016¢\u0006\u0004\b*\u0010'J#\u0010+\u001a\u00020$*\u00020\"2\u0006\u0010\u001e\u001a\u00020#2\u0006\u0010)\u001a\u00020$H\u0016¢\u0006\u0004\b+\u0010'J\u0013\u0010.\u001a\u00020-*\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010<R\u0014\u0010Y\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010<¨\u0006Z"}, d2 = {"Landroidx/compose/ui/draw/PainterNode;", "Landroidx/compose/ui/node/c;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/yg3;", "Landroidx/compose/ui/graphics/painter/Painter;", "painter", "", "sizeToIntrinsics", "Lcom/google/android/tc;", "alignment", "Lcom/google/android/d02;", "contentScale", "", "alpha", "Landroidx/compose/ui/graphics/h;", "colorFilter", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;ZLcom/google/android/tc;Lcom/google/android/d02;FLandroidx/compose/ui/graphics/h;)V", "Lcom/google/android/tsb;", "dstSize", "m3", "(J)J", "Lcom/google/android/kx1;", "constraints", "s3", "r3", "(J)Z", "q3", "Landroidx/compose/ui/layout/j;", "Lcom/google/android/dj7;", "measurable", "Lcom/google/android/fj7;", "b", "(Landroidx/compose/ui/layout/j;Lcom/google/android/dj7;J)Lcom/google/android/fj7;", "Lcom/google/android/h66;", "Lcom/google/android/f66;", "", "height", "z", "(Lcom/google/android/h66;Lcom/google/android/f66;I)I", "t", "width", "m", "i", "Lcom/google/android/fz1;", "", "j", "(Lcom/google/android/fz1;)V", "", "toString", "()Ljava/lang/String;", "p", "Landroidx/compose/ui/graphics/painter/Painter;", "n3", "()Landroidx/compose/ui/graphics/painter/Painter;", "v3", "(Landroidx/compose/ui/graphics/painter/Painter;)V", "q", "Z", "o3", "()Z", "w3", "(Z)V", "r", "Lcom/google/android/tc;", "getAlignment", "()Lcom/google/android/tc;", "t3", "(Lcom/google/android/tc;)V", "s", "Lcom/google/android/d02;", "getContentScale", "()Lcom/google/android/d02;", "u3", "(Lcom/google/android/d02;)V", "F", "getAlpha", "()F", "c", "(F)V", "u", "Landroidx/compose/ui/graphics/h;", "getColorFilter", "()Landroidx/compose/ui/graphics/h;", "h", "(Landroidx/compose/ui/graphics/h;)V", "p3", "useIntrinsicSize", "Q2", "shouldAutoInvalidate", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class PainterModifier extends androidx.compose.ui.b.c implements androidx.compose.ui.node.c, yg3 {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata and from toString */
    private Painter painter;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata and from toString */
    private boolean sizeToIntrinsics;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata and from toString */
    private tc alignment;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private d02 contentScale;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata and from toString */
    private float alpha;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata and from toString */
    private androidx.compose.ui.graphics.h colorFilter;

    public PainterModifier(Painter painter, boolean z, tc tcVar, d02 d02Var, float f, androidx.compose.ui.graphics.h hVar) {
        this.painter = painter;
        this.sizeToIntrinsics = z;
        this.alignment = tcVar;
        this.contentScale = d02Var;
        this.alpha = f;
        this.colorFilter = hVar;
    }

    private final long m3(long dstSize) {
        if (!p3()) {
            return dstSize;
        }
        long jD = tsb.d((((long) Float.floatToRawIntBits(!r3(this.painter.getIntrinsicSize()) ? Float.intBitsToFloat((int) (dstSize >> 32)) : Float.intBitsToFloat((int) (this.painter.getIntrinsicSize() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!q3(this.painter.getIntrinsicSize()) ? Float.intBitsToFloat((int) (dstSize & 4294967295L)) : Float.intBitsToFloat((int) (this.painter.getIntrinsicSize() & 4294967295L)))) & 4294967295L));
        return (Float.intBitsToFloat((int) (dstSize >> 32)) == 0.0f || Float.intBitsToFloat((int) (dstSize & 4294967295L)) == 0.0f) ? tsb.INSTANCE.b() : f4b.a(jD, this.contentScale.a(jD, dstSize));
    }

    private final boolean p3() {
        return this.sizeToIntrinsics && this.painter.getIntrinsicSize() != 9205357640488583168L;
    }

    private final boolean q3(long j) {
        return !tsb.h(j, tsb.INSTANCE.a()) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    private final boolean r3(long j) {
        return !tsb.h(j, tsb.INSTANCE.a()) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    private final long s3(long constraints) {
        boolean z = false;
        boolean z2 = kx1.h(constraints) && kx1.g(constraints);
        if (kx1.j(constraints) && kx1.i(constraints)) {
            z = true;
        }
        if ((!p3() && z2) || z) {
            return kx1.d(constraints, kx1.l(constraints), 0, kx1.k(constraints), 0, 10, null);
        }
        long jL = this.painter.getIntrinsicSize();
        int iRound = r3(jL) ? Math.round(Float.intBitsToFloat((int) (jL >> 32))) : kx1.n(constraints);
        int iRound2 = q3(jL) ? Math.round(Float.intBitsToFloat((int) (jL & 4294967295L))) : kx1.m(constraints);
        long jM3 = m3(tsb.d((((long) Float.floatToRawIntBits(nx1.f(constraints, iRound2))) & 4294967295L) | (((long) Float.floatToRawIntBits(nx1.g(constraints, iRound))) << 32)));
        return kx1.d(constraints, nx1.g(constraints, Math.round(Float.intBitsToFloat((int) (jM3 >> 32)))), 0, nx1.f(constraints, Math.round(Float.intBitsToFloat((int) (jM3 & 4294967295L)))), 0, 10, null);
    }

    @Override // androidx.compose.ui.b.c
    /* JADX INFO: renamed from: Q2 */
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.c
    public fj7 b(androidx.compose.ui.layout.j jVar, dj7 dj7Var, long j) {
        final o oVarR0 = dj7Var.r0(s3(j));
        return androidx.compose.ui.layout.j.Q1(jVar, oVarR0.getWidth(), oVarR0.getHeight(), null, new Function1<o.a, Unit>() { // from class: androidx.compose.ui.draw.PainterNode$measure$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((o.a) obj);
                return Unit.a;
            }

            public final void invoke(o.a aVar) {
                o.a.L(aVar, oVarR0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    public final void c(float f) {
        this.alpha = f;
    }

    public final void h(androidx.compose.ui.graphics.h hVar) {
        this.colorFilter = hVar;
    }

    @Override // androidx.compose.ui.node.c
    public int i(h66 h66Var, f66 f66Var, int i) {
        if (!p3()) {
            return f66Var.W(i);
        }
        long jS3 = s3(nx1.b(0, i, 0, 0, 13, null));
        return Math.max(kx1.m(jS3), f66Var.W(i));
    }

    @Override // com.google.inputmethod.yg3
    public void j(fz1 fz1Var) {
        long jL = this.painter.getIntrinsicSize();
        float fIntBitsToFloat = r3(jL) ? Float.intBitsToFloat((int) (jL >> 32)) : Float.intBitsToFloat((int) (fz1Var.d() >> 32));
        long jD = tsb.d((((long) Float.floatToRawIntBits(q3(jL) ? Float.intBitsToFloat((int) (jL & 4294967295L)) : Float.intBitsToFloat((int) (fz1Var.d() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32));
        long jB = (Float.intBitsToFloat((int) (fz1Var.d() >> 32)) == 0.0f || Float.intBitsToFloat((int) (fz1Var.d() & 4294967295L)) == 0.0f) ? tsb.INSTANCE.b() : f4b.a(jD, this.contentScale.a(jD, fz1Var.d()));
        long jA = this.alignment.a(q16.c((((long) Math.round(Float.intBitsToFloat((int) (jB & 4294967295L)))) & 4294967295L) | (((long) Math.round(Float.intBitsToFloat((int) (jB >> 32)))) << 32)), q16.c((((long) Math.round(Float.intBitsToFloat((int) (fz1Var.d() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (fz1Var.d() & 4294967295L)))) & 4294967295L)), fz1Var.getLayoutDirection());
        float fK = g16.k(jA);
        float fL = g16.l(jA);
        fz1Var.getDrawContext().getTransform().c(fK, fL);
        try {
            this.painter.j(fz1Var, jB, this.alpha, this.colorFilter);
            fz1Var.getDrawContext().getTransform().c(-fK, -fL);
            fz1Var.j1();
        } catch (Throwable th) {
            fz1Var.getDrawContext().getTransform().c(-fK, -fL);
            throw th;
        }
    }

    @Override // androidx.compose.ui.node.c
    public int m(h66 h66Var, f66 f66Var, int i) {
        if (!p3()) {
            return f66Var.d0(i);
        }
        long jS3 = s3(nx1.b(0, i, 0, 0, 13, null));
        return Math.max(kx1.m(jS3), f66Var.d0(i));
    }

    /* JADX INFO: renamed from: n3, reason: from getter */
    public final Painter getPainter() {
        return this.painter;
    }

    /* JADX INFO: renamed from: o3, reason: from getter */
    public final boolean getSizeToIntrinsics() {
        return this.sizeToIntrinsics;
    }

    @Override // androidx.compose.ui.node.c
    public int t(h66 h66Var, f66 f66Var, int i) {
        if (!p3()) {
            return f66Var.q0(i);
        }
        long jS3 = s3(nx1.b(0, 0, 0, i, 7, null));
        return Math.max(kx1.n(jS3), f66Var.q0(i));
    }

    public final void t3(tc tcVar) {
        this.alignment = tcVar;
    }

    public String toString() {
        return "PainterModifier(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }

    public final void u3(d02 d02Var) {
        this.contentScale = d02Var;
    }

    public final void v3(Painter painter) {
        this.painter = painter;
    }

    public final void w3(boolean z) {
        this.sizeToIntrinsics = z;
    }

    @Override // androidx.compose.ui.node.c
    public int z(h66 h66Var, f66 f66Var, int i) {
        if (!p3()) {
            return f66Var.o0(i);
        }
        long jS3 = s3(nx1.b(0, 0, 0, i, 7, null));
        return Math.max(kx1.n(jS3), f66Var.o0(i));
    }
}
