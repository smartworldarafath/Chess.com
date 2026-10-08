package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.graphics.h;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.aa2;
import com.google.inputmethod.atb;
import com.google.inputmethod.ca4;
import com.google.inputmethod.f39;
import com.google.inputmethod.f43;
import com.google.inputmethod.g16;
import com.google.inputmethod.ml5;
import com.google.inputmethod.q16;
import com.google.inputmethod.qu0;
import com.google.inputmethod.r16;
import com.google.inputmethod.rn8;
import com.google.inputmethod.tsb;
import com.google.inputmethod.vg3;
import com.google.inputmethod.w41;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u0000 \\2\u00020\u0001:\u0001]J\u001b\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006Jg\u0010\u0017\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0017\u0010\u0018Jg\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u001b\u0010\u001cJU\u0010!\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b!\u0010\"JU\u0010#\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b#\u0010$JK\u0010'\u001a\u00020\u00162\u0006\u0010&\u001a\u00020%2\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b'\u0010(Js\u00101\u001a\u00020\u00162\u0006\u0010&\u001a\u00020%2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020)2\b\b\u0002\u0010.\u001a\u00020+2\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J_\u00105\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u00104\u001a\u0002032\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b5\u00106J_\u00107\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u00104\u001a\u0002032\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b7\u00108JU\u0010;\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u00109\u001a\u00020\u000b2\b\b\u0002\u0010:\u001a\u00020\u00032\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b;\u0010<JU\u0010=\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u00109\u001a\u00020\u000b2\b\b\u0002\u0010:\u001a\u00020\u00032\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b=\u0010>JU\u0010?\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b?\u0010$Jm\u0010D\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010@\u001a\u00020\u000b2\u0006\u0010A\u001a\u00020\u000b2\u0006\u0010C\u001a\u00020B2\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\bD\u0010EJI\u0010H\u001a\u00020\u00162\u0006\u0010G\u001a\u00020F2\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\bH\u0010IJI\u0010J\u001a\u00020\u00162\u0006\u0010G\u001a\u00020F2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\bJ\u0010KJ1\u0010O\u001a\u00020\u0016*\u00020L2\b\b\u0002\u0010\u001e\u001a\u00020+2\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00160MH\u0016¢\u0006\u0004\bO\u0010PR\u0014\u0010T\u001a\u00020Q8&X¦\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0014\u0010:\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0014\u0010\u001e\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010VR\u0014\u0010[\u001a\u00020X8&X¦\u0004¢\u0006\u0006\u001a\u0004\bY\u0010Zø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006^À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lcom/google/android/f43;", "Lcom/google/android/tsb;", "Lcom/google/android/rn8;", "offset", "t2", "(JJ)J", "Lcom/google/android/qu0;", "brush", "start", "end", "", "strokeWidth", "Lcom/google/android/wbc;", "cap", "Lcom/google/android/f39;", "pathEffect", "alpha", "Landroidx/compose/ui/graphics/h;", "colorFilter", "Landroidx/compose/ui/graphics/e;", "blendMode", "", "u1", "(Lcom/google/android/qu0;JJFILcom/google/android/f39;FLandroidx/compose/ui/graphics/h;I)V", "Lcom/google/android/ei1;", "color", "A0", "(JJJFILcom/google/android/f39;FLandroidx/compose/ui/graphics/h;I)V", "topLeft", "size", "Landroidx/compose/ui/graphics/drawscope/b;", "style", "l1", "(Lcom/google/android/qu0;JJFLandroidx/compose/ui/graphics/drawscope/b;Landroidx/compose/ui/graphics/h;I)V", "k2", "(JJJFLandroidx/compose/ui/graphics/drawscope/b;Landroidx/compose/ui/graphics/h;I)V", "Lcom/google/android/ml5;", "image", "W1", "(Lcom/google/android/ml5;JFLandroidx/compose/ui/graphics/drawscope/b;Landroidx/compose/ui/graphics/h;I)V", "Lcom/google/android/g16;", "srcOffset", "Lcom/google/android/q16;", "srcSize", "dstOffset", "dstSize", "Lcom/google/android/ca4;", "filterQuality", "L1", "(Lcom/google/android/ml5;JJJJFLandroidx/compose/ui/graphics/drawscope/b;Landroidx/compose/ui/graphics/h;II)V", "Lcom/google/android/aa2;", "cornerRadius", "j2", "(Lcom/google/android/qu0;JJJFLandroidx/compose/ui/graphics/drawscope/b;Landroidx/compose/ui/graphics/h;I)V", "S1", "(JJJJLandroidx/compose/ui/graphics/drawscope/b;FLandroidx/compose/ui/graphics/h;I)V", "radius", "center", "A1", "(Lcom/google/android/qu0;FJFLandroidx/compose/ui/graphics/drawscope/b;Landroidx/compose/ui/graphics/h;I)V", "F0", "(JFJFLandroidx/compose/ui/graphics/drawscope/b;Landroidx/compose/ui/graphics/h;I)V", "I0", "startAngle", "sweepAngle", "", "useCenter", "L0", "(JFFZJJFLandroidx/compose/ui/graphics/drawscope/b;Landroidx/compose/ui/graphics/h;I)V", "Landroidx/compose/ui/graphics/Path;", "path", "C0", "(Landroidx/compose/ui/graphics/Path;JFLandroidx/compose/ui/graphics/drawscope/b;Landroidx/compose/ui/graphics/h;I)V", "D1", "(Landroidx/compose/ui/graphics/Path;Lcom/google/android/qu0;FLandroidx/compose/ui/graphics/drawscope/b;Landroidx/compose/ui/graphics/h;I)V", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "Lkotlin/Function1;", "block", "Q0", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;JLkotlin/jvm/functions/Function1;)V", "Lcom/google/android/vg3;", "V0", "()Lcom/google/android/vg3;", "drawContext", "A", "()J", "d", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "r1", "a", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface DrawScope extends f43 {

    /* JADX INFO: renamed from: r1, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.drawscope.DrawScope$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u0005\u0010\b¨\u0006\r"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope$a;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/e;", "b", "I", "a", "()I", "DefaultBlendMode", "Lcom/google/android/ca4;", "c", "DefaultFilterQuality", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private static final int DefaultBlendMode = e.INSTANCE.B();

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private static final int DefaultFilterQuality = ca4.INSTANCE.b();

        private Companion() {
        }

        public final int a() {
            return DefaultBlendMode;
        }

        public final int b() {
            return DefaultFilterQuality;
        }
    }

    static /* synthetic */ void E0(DrawScope drawScope, Path path, qu0 qu0Var, float f, b bVar, h hVar, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
        }
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i2 & 8) != 0) {
            bVar = c.b;
        }
        b bVar2 = bVar;
        if ((i2 & 16) != 0) {
            hVar = null;
        }
        h hVar2 = hVar;
        if ((i2 & 32) != 0) {
            i = INSTANCE.a();
        }
        drawScope.D1(path, qu0Var, f2, bVar2, hVar2, i);
    }

    static /* synthetic */ void G2(DrawScope drawScope, long j, long j2, long j3, long j4, b bVar, float f, h hVar, int i, int i2, Object obj) {
        DrawScope drawScope2;
        long jT2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-u-Aw5IA");
        }
        long jC = (i2 & 2) != 0 ? rn8.INSTANCE.c() : j2;
        if ((i2 & 4) != 0) {
            drawScope2 = drawScope;
            jT2 = drawScope2.t2(drawScope.d(), jC);
        } else {
            drawScope2 = drawScope;
            jT2 = j3;
        }
        drawScope2.S1(j, jC, jT2, (i2 & 8) != 0 ? aa2.INSTANCE.a() : j4, (i2 & 16) != 0 ? c.b : bVar, (i2 & 32) != 0 ? 1.0f : f, (i2 & 64) != 0 ? null : hVar, (i2 & 128) != 0 ? INSTANCE.a() : i);
    }

    static /* synthetic */ void J1(DrawScope drawScope, qu0 qu0Var, long j, long j2, long j3, float f, b bVar, h hVar, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
        }
        long jC = (i2 & 2) != 0 ? rn8.INSTANCE.c() : j;
        drawScope.j2(qu0Var, jC, (i2 & 4) != 0 ? drawScope.t2(drawScope.d(), jC) : j2, (i2 & 8) != 0 ? aa2.INSTANCE.a() : j3, (i2 & 16) != 0 ? 1.0f : f, (i2 & 32) != 0 ? c.b : bVar, (i2 & 64) != 0 ? null : hVar, (i2 & 128) != 0 ? INSTANCE.a() : i);
    }

    static /* synthetic */ void R1(DrawScope drawScope, long j, long j2, long j3, float f, b bVar, h hVar, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-n-J9OG0");
        }
        long jC = (i2 & 2) != 0 ? rn8.INSTANCE.c() : j2;
        drawScope.I0(j, jC, (i2 & 4) != 0 ? drawScope.t2(drawScope.d(), jC) : j3, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? c.b : bVar, (i2 & 32) != 0 ? null : hVar, (i2 & 64) != 0 ? INSTANCE.a() : i);
    }

    static /* synthetic */ void T0(DrawScope drawScope, long j, long j2, long j3, float f, b bVar, h hVar, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
        }
        long jC = (i2 & 2) != 0 ? rn8.INSTANCE.c() : j2;
        drawScope.k2(j, jC, (i2 & 4) != 0 ? drawScope.t2(drawScope.d(), jC) : j3, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? c.b : bVar, (i2 & 32) != 0 ? null : hVar, (i2 & 64) != 0 ? INSTANCE.a() : i);
    }

    static /* synthetic */ void U0(DrawScope drawScope, qu0 qu0Var, long j, long j2, float f, b bVar, h hVar, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
        }
        long jC = (i2 & 2) != 0 ? rn8.INSTANCE.c() : j;
        drawScope.l1(qu0Var, jC, (i2 & 4) != 0 ? drawScope.t2(drawScope.d(), jC) : j2, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? c.b : bVar, (i2 & 32) != 0 ? null : hVar, (i2 & 64) != 0 ? INSTANCE.a() : i);
    }

    static /* synthetic */ void c1(DrawScope drawScope, GraphicsLayer graphicsLayer, long j, Function1 function1, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: record-JVtK1S4");
        }
        if ((i & 1) != 0) {
            j = r16.d(drawScope.d());
        }
        drawScope.Q0(graphicsLayer, j, function1);
    }

    static /* synthetic */ void c2(DrawScope drawScope, ml5 ml5Var, long j, float f, b bVar, h hVar, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-gbVJVH8");
        }
        drawScope.W1(ml5Var, (i2 & 2) != 0 ? rn8.INSTANCE.c() : j, (i2 & 4) != 0 ? 1.0f : f, (i2 & 8) != 0 ? c.b : bVar, (i2 & 16) != 0 ? null : hVar, (i2 & 32) != 0 ? INSTANCE.a() : i);
    }

    static /* synthetic */ void e1(DrawScope drawScope, long j, long j2, long j3, float f, int i, f39 f39Var, float f2, h hVar, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-NGM6Ib0");
        }
        drawScope.A0(j, j2, j3, (i3 & 8) != 0 ? 0.0f : f, (i3 & 16) != 0 ? Stroke.INSTANCE.a() : i, (i3 & 32) != 0 ? null : f39Var, (i3 & 64) != 0 ? 1.0f : f2, (i3 & 128) != 0 ? null : hVar, (i3 & 256) != 0 ? INSTANCE.a() : i2);
    }

    static /* synthetic */ void g0(DrawScope drawScope, Path path, long j, float f, b bVar, h hVar, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-LG529CI");
        }
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i2 & 8) != 0) {
            bVar = c.b;
        }
        b bVar2 = bVar;
        if ((i2 & 16) != 0) {
            hVar = null;
        }
        drawScope.C0(path, j, f2, bVar2, hVar, (i2 & 32) != 0 ? INSTANCE.a() : i);
    }

    static /* synthetic */ void i1(DrawScope drawScope, long j, float f, long j2, float f2, b bVar, h hVar, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
        }
        if ((i2 & 2) != 0) {
            f = tsb.k(drawScope.d()) / 2.0f;
        }
        drawScope.F0(j, f, (i2 & 4) != 0 ? drawScope.A() : j2, (i2 & 8) != 0 ? 1.0f : f2, (i2 & 16) != 0 ? c.b : bVar, (i2 & 32) != 0 ? null : hVar, (i2 & 64) != 0 ? INSTANCE.a() : i);
    }

    static /* synthetic */ void k1(DrawScope drawScope, qu0 qu0Var, float f, long j, float f2, b bVar, h hVar, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-V9BoPsw");
        }
        drawScope.A1(qu0Var, (i2 & 2) != 0 ? tsb.k(drawScope.d()) / 2.0f : f, (i2 & 4) != 0 ? drawScope.A() : j, (i2 & 8) != 0 ? 1.0f : f2, (i2 & 16) != 0 ? c.b : bVar, (i2 & 32) != 0 ? null : hVar, (i2 & 64) != 0 ? INSTANCE.a() : i);
    }

    static /* synthetic */ void n0(DrawScope drawScope, long j, float f, float f2, boolean z, long j2, long j3, float f3, b bVar, h hVar, int i, int i2, Object obj) {
        DrawScope drawScope2;
        long jT2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo");
        }
        long jC = (i2 & 16) != 0 ? rn8.INSTANCE.c() : j2;
        if ((i2 & 32) != 0) {
            drawScope2 = drawScope;
            jT2 = drawScope2.t2(drawScope.d(), jC);
        } else {
            drawScope2 = drawScope;
            jT2 = j3;
        }
        drawScope2.L0(j, f, f2, z, jC, jT2, (i2 & 64) != 0 ? 1.0f : f3, (i2 & 128) != 0 ? c.b : bVar, (i2 & 256) != 0 ? null : hVar, (i2 & 512) != 0 ? INSTANCE.a() : i);
    }

    private default long t2(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return tsb.d((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    static /* synthetic */ void u2(DrawScope drawScope, ml5 ml5Var, long j, long j2, long j3, long j4, float f, b bVar, h hVar, int i, int i2, int i3, Object obj) {
        long jC;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
        }
        long jB = (i3 & 2) != 0 ? g16.INSTANCE.b() : j;
        if ((i3 & 4) != 0) {
            jC = q16.c((((long) ml5Var.getHeight()) & 4294967295L) | (((long) ml5Var.getWidth()) << 32));
        } else {
            jC = j2;
        }
        drawScope.L1(ml5Var, jB, jC, (i3 & 8) != 0 ? g16.INSTANCE.b() : j3, (i3 & 16) != 0 ? jC : j4, (i3 & 32) != 0 ? 1.0f : f, (i3 & 64) != 0 ? c.b : bVar, (i3 & 128) != 0 ? null : hVar, (i3 & 256) != 0 ? INSTANCE.a() : i, (i3 & 512) != 0 ? INSTANCE.b() : i2);
    }

    static /* synthetic */ void y0(DrawScope drawScope, qu0 qu0Var, long j, long j2, float f, int i, f39 f39Var, float f2, h hVar, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-1RTmtNc");
        }
        drawScope.u1(qu0Var, j, j2, (i3 & 8) != 0 ? 0.0f : f, (i3 & 16) != 0 ? Stroke.INSTANCE.a() : i, (i3 & 32) != 0 ? null : f39Var, (i3 & 64) != 0 ? 1.0f : f2, (i3 & 128) != 0 ? null : hVar, (i3 & 256) != 0 ? INSTANCE.a() : i2);
    }

    default long A() {
        return atb.b(getDrawContext().d());
    }

    void A0(long color, long start, long end, float strokeWidth, int cap, f39 pathEffect, float alpha, h colorFilter, int blendMode);

    void A1(qu0 brush, float radius, long center, float alpha, b style, h colorFilter, int blendMode);

    void C0(Path path, long color, float alpha, b style, h colorFilter, int blendMode);

    void D1(Path path, qu0 brush, float alpha, b style, h colorFilter, int blendMode);

    void F0(long color, float radius, long center, float alpha, b style, h colorFilter, int blendMode);

    void I0(long color, long topLeft, long size, float alpha, b style, h colorFilter, int blendMode);

    void L0(long color, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, b style, h colorFilter, int blendMode);

    default void L1(ml5 image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, b style, h colorFilter, int blendMode, int filterQuality) {
        u2(this, image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, 0, 512, null);
    }

    default void Q0(GraphicsLayer graphicsLayer, long j, final Function1<? super DrawScope, Unit> function1) {
        graphicsLayer.F(this, getLayoutDirection(), j, new Function1<DrawScope, Unit>() { // from class: androidx.compose.ui.graphics.drawscope.DrawScope$record$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final void a(DrawScope drawScope) {
                DrawScope drawScope2 = this.this$0;
                f43 density = drawScope.getDrawContext().getDensity();
                LayoutDirection layoutDirection = drawScope.getDrawContext().getLayoutDirection();
                w41 w41VarB = drawScope.getDrawContext().b();
                long jD = drawScope.getDrawContext().d();
                GraphicsLayer graphicsLayer2 = drawScope.getDrawContext().getGraphicsLayer();
                Function1<DrawScope, Unit> function2 = function1;
                f43 density2 = drawScope2.getDrawContext().getDensity();
                LayoutDirection layoutDirection2 = drawScope2.getDrawContext().getLayoutDirection();
                w41 w41VarB2 = drawScope2.getDrawContext().b();
                long jD2 = drawScope2.getDrawContext().d();
                GraphicsLayer graphicsLayer3 = drawScope2.getDrawContext().getGraphicsLayer();
                vg3 drawContext = drawScope2.getDrawContext();
                drawContext.e(density);
                drawContext.a(layoutDirection);
                drawContext.i(w41VarB);
                drawContext.c(jD);
                drawContext.h(graphicsLayer2);
                w41VarB.v();
                try {
                    function2.invoke(drawScope2);
                } finally {
                    w41VarB.o();
                    vg3 drawContext2 = drawScope2.getDrawContext();
                    drawContext2.e(density2);
                    drawContext2.a(layoutDirection2);
                    drawContext2.i(w41VarB2);
                    drawContext2.c(jD2);
                    drawContext2.h(graphicsLayer3);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((DrawScope) obj);
                return Unit.a;
            }
        });
    }

    void S1(long color, long topLeft, long size, long cornerRadius, b style, float alpha, h colorFilter, int blendMode);

    /* JADX INFO: renamed from: V0 */
    vg3 getDrawContext();

    void W1(ml5 image, long topLeft, float alpha, b style, h colorFilter, int blendMode);

    default long d() {
        return getDrawContext().d();
    }

    LayoutDirection getLayoutDirection();

    void j2(qu0 brush, long topLeft, long size, long cornerRadius, float alpha, b style, h colorFilter, int blendMode);

    void k2(long color, long topLeft, long size, float alpha, b style, h colorFilter, int blendMode);

    void l1(qu0 brush, long topLeft, long size, float alpha, b style, h colorFilter, int blendMode);

    void u1(qu0 brush, long start, long end, float strokeWidth, int cap, f39 pathEffect, float alpha, h colorFilter, int blendMode);
}
