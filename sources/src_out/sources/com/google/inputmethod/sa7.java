package com.google.inputmethod;

import androidx.compose.p000animation.core.Animatable;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.d;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.v;
import androidx.compose.ui.text.w;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\u0014\u001a\u00020\u0006*\u00020\r2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J_\u0010\u001d\u001a\u00020\u0006*\u00020\r2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ7\u0010$\u001a\u00020\u00062\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001a0\u001f2\u0006\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u001a2\b\b\u0002\u0010#\u001a\u00020\u001aH\u0000¢\u0006\u0004\b$\u0010%R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020'0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010(R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020'0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\"\u00100\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00104\u001a\u0002018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010+\u001a\u0004\b2\u0010-\"\u0004\b3\u0010/R\"\u00107\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010+\u001a\u0004\b5\u0010-\"\u0004\b6\u0010/R\u0017\u0010=\u001a\u0002088\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010@\u001a\u0002088\u0006¢\u0006\f\n\u0004\b>\u0010:\u001a\u0004\b?\u0010<R#\u0010G\u001a\b\u0012\u0004\u0012\u00020\n0A8\u0006¢\u0006\u0012\n\u0004\bB\u0010C\u0012\u0004\bF\u0010\u0003\u001a\u0004\bD\u0010E¨\u0006H"}, d2 = {"Lcom/google/android/sa7;", "", "<init>", "()V", "", "diamondWidth", "", "b", "(F)V", "key", "Lcom/google/android/ei1;", "c", "(Ljava/lang/Object;)J", "Lcom/google/android/fz1;", "animationColor", "", "isShowKeyLabelEnabled", "strokeWidth", "Landroidx/compose/ui/text/v;", "textMeasurer", "d", "(Lcom/google/android/fz1;JZFLjava/lang/Object;Landroidx/compose/ui/text/v;)V", "Lcom/google/android/rn8;", "targetOffset", "Lcom/google/android/tsb;", "targetSize", "Lcom/google/android/gba;", "currentRect", "center", "e", "(Lcom/google/android/fz1;JJJLcom/google/android/gba;JZFLjava/lang/Object;Landroidx/compose/ui/text/v;)V", "Lcom/google/android/xa4;", "spec", "current", "target", "initialVelocity", "a", "(Lcom/google/android/xa4;Lcom/google/android/gba;Lcom/google/android/gba;Lcom/google/android/gba;)V", "Landroidx/compose/animation/core/Animatable;", "Lcom/google/android/qr;", "Landroidx/compose/animation/core/Animatable;", "reverseProgress", "restartProgress", "J", "getSharedTransitionScopeOffset-F1C5BW0", "()J", "setSharedTransitionScopeOffset-k-4lQ0M", "(J)V", "sharedTransitionScopeOffset", "Lcom/google/android/q16;", "getSharedTransitionScopeSize-YbymL2g", "setSharedTransitionScopeSize-ozmzZPI", "sharedTransitionScopeSize", "getDebugOffset-F1C5BW0", "setDebugOffset-k-4lQ0M", "debugOffset", "Landroidx/compose/ui/graphics/Path;", "f", "Landroidx/compose/ui/graphics/Path;", "getDebugPath", "()Landroidx/compose/ui/graphics/Path;", "debugPath", "g", "getCenterPath", "centerPath", "", "h", "Ljava/util/List;", "getColors", "()Ljava/util/List;", "getColors$annotations", "colors", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class sa7 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Animatable<Float, qr> reverseProgress = aq.b(0.0f, 0.0f, 2, null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Animatable<Float, qr> restartProgress = aq.b(0.0f, 0.0f, 2, null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private long sharedTransitionScopeOffset;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private long sharedTransitionScopeSize;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private long debugOffset;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Path debugPath;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Path centerPath;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final List<ei1> colors;

    public sa7() {
        rn8.Companion companion = rn8.INSTANCE;
        this.sharedTransitionScopeOffset = companion.c();
        this.sharedTransitionScopeSize = q16.INSTANCE.a();
        this.debugOffset = companion.c();
        this.debugPath = d.a();
        this.centerPath = d.a();
        this.colors = m.s(new ei1[]{ei1.l(ki1.d(4293542709L)), ei1.l(ki1.d(4294086695L)), ei1.l(ki1.d(4291905755L)), ei1.l(ki1.d(4282549748L)), ei1.l(ki1.d(4282038458L))});
    }

    private final void b(float diamondWidth) {
        this.centerPath.rewind();
        Path path = this.centerPath;
        float f = -diamondWidth;
        path.b(0.0f, f);
        path.c(diamondWidth, 0.0f);
        path.c(0.0f, diamondWidth);
        path.c(f, 0.0f);
        path.close();
    }

    public final void a(xa4<gba> spec, gba current, gba target, gba initialVelocity) {
        long j;
        long j2;
        this.debugPath.rewind();
        long j3 = 4294967295L;
        if ((spec instanceof rjd) || (spec instanceof dwb) || ((spec instanceof c00) && e00.c(((c00) spec).getMode(), e00.INSTANCE.a()))) {
            this.debugPath.b(Float.intBitsToFloat((int) (current.h() >> 32)), Float.intBitsToFloat((int) (current.h() & 4294967295L)));
            this.debugPath.c(Float.intBitsToFloat((int) (target.h() >> 32)), Float.intBitsToFloat((int) (target.h() & 4294967295L)));
            this.debugPath.i(rn8.e(current.h() ^ (-9223372034707292160L)));
            this.debugOffset = rn8.p(target.h(), current.h());
            return;
        }
        lmc lmcVarA = hr.a(spec, w2e.S(gba.INSTANCE), current, target, initialVelocity);
        long durationNanos = lmcVarA.getDurationNanos();
        gba gbaVar = (gba) lmcVarA.e(0L);
        int i = 0;
        while (true) {
            long jH = ((gba) lmcVarA.e(durationNanos - ((long) (durationNanos * (i / 399))))).h();
            if (i == 0) {
                j = -9223372034707292160L;
                this.debugPath.b(Float.intBitsToFloat((int) (jH >> 32)), Float.intBitsToFloat((int) (jH & j3)));
                j2 = j3;
            } else {
                j = -9223372034707292160L;
                j2 = j3;
                this.debugPath.c(Float.intBitsToFloat((int) (jH >> 32)), Float.intBitsToFloat((int) (jH & j2)));
            }
            if (i == 400) {
                this.debugPath.i(rn8.e(gbaVar.h() ^ j));
                this.debugOffset = rn8.p(target.h(), gbaVar.h());
                return;
            } else {
                i++;
                j3 = j2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long c(Object key) {
        if (ta7.b.b(key)) {
            V vE = ta7.b.e(key);
            Intrinsics.g(vE);
            return ((ei1) vE).getValue();
        }
        if (ta7.a >= this.colors.size()) {
            ta7.a = 0;
        }
        long value = this.colors.get(ta7.a).getValue();
        ta7.a++;
        ta7.b.x(key, ei1.l(value));
        return value;
    }

    public final void d(fz1 fz1Var, long j, boolean z, float f, Object obj, v vVar) {
        long jD;
        float f2 = f * 2.0f;
        ei1.Companion companion = ei1.INSTANCE;
        if (ei1.r(j, companion.i())) {
            DrawScope.T0(fz1Var, companion.j(), 0L, 0L, 0.0f, new Stroke(f2, 0.0f, 0, 0, null, 30, null), null, 0, 110, null);
            jD = ki1.d(4288323750L);
        } else {
            jD = j;
        }
        DrawScope.T0(fz1Var, jD, 0L, 0L, 0.0f, new Stroke(f, 0.0f, 0, 0, null, 30, null), null, 0, 110, null);
        if (!z || vVar == null) {
            return;
        }
        w.d(fz1Var, v.b(vVar, obj.toString(), new TextStyle(jD, c0d.i(18), null, null, null, null, null, 0L, null, null, null, ei1.p(companion.j(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16775164, null), 0, false, 0, 0L, null, null, null, false, 1020, null), (250 & 2) != 0 ? ei1.INSTANCE.i() : 0L, (250 & 4) != 0 ? rn8.INSTANCE.c() : rn8.e((((long) Float.floatToRawIntBits(10.0f)) << 32) | (((long) Float.floatToRawIntBits(10.0f)) & 4294967295L)), (250 & 8) != 0 ? Float.NaN : 0.0f, (250 & 16) != 0 ? null : null, (250 & 32) != 0 ? null : null, (250 & 64) == 0 ? null : null, (250 & 128) != 0 ? DrawScope.INSTANCE.a() : 0);
    }

    public final void e(fz1 fz1Var, long j, long j2, long j3, gba gbaVar, long j4, boolean z, float f, Object obj, v vVar) throws Throwable {
        float f2;
        Object obj2;
        long jC;
        ei1.Companion companion = ei1.INSTANCE;
        if (ei1.r(j, companion.h())) {
            return;
        }
        float f3 = f * 2.0f;
        if (ei1.r(j, companion.i())) {
            DrawScope.T0(fz1Var, companion.j(), 0L, 0L, 0.0f, new Stroke(f3, 0.0f, 0, 0, null, 30, null), null, 0, 110, null);
            int i = (int) (j2 >> 32);
            float fIntBitsToFloat = Float.intBitsToFloat(i) - Float.intBitsToFloat((int) (gbaVar.m() >> 32));
            int i2 = (int) (j2 & 4294967295L);
            float fIntBitsToFloat2 = Float.intBitsToFloat(i2) - Float.intBitsToFloat((int) (gbaVar.m() & 4294967295L));
            fz1Var.getDrawContext().getTransform().c(fIntBitsToFloat, fIntBitsToFloat2);
            try {
                f2 = fIntBitsToFloat2;
                try {
                    DrawScope.T0(fz1Var, companion.j(), 0L, j3, 0.0f, new Stroke(f3, 0.0f, 0, 0, null, 30, null), null, 0, 106, null);
                    fz1Var.getDrawContext().getTransform().c(-fIntBitsToFloat, -f2);
                    float fIntBitsToFloat3 = (Float.intBitsToFloat(i) - Float.intBitsToFloat((int) (gbaVar.m() >> 32))) - Float.intBitsToFloat((int) (this.debugOffset >> 32));
                    float fIntBitsToFloat4 = (Float.intBitsToFloat(i2) - Float.intBitsToFloat((int) (gbaVar.m() & 4294967295L))) - Float.intBitsToFloat((int) (this.debugOffset & 4294967295L));
                    fz1Var.getDrawContext().getTransform().c(fIntBitsToFloat3, fIntBitsToFloat4);
                    try {
                        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (j3 >> 32)) * 0.5f;
                        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (j3 & 4294967295L)) * 0.5f;
                        fz1Var.getDrawContext().getTransform().c(fIntBitsToFloat5, fIntBitsToFloat6);
                        try {
                            DrawScope.g0(fz1Var, this.debugPath, companion.j(), 0.0f, new Stroke(f3, 0.0f, 0, 0, f39.Companion.c(f39.INSTANCE, new float[]{20.0f, 10.0f}, 0.0f, 2, null), 14, null), null, 0, 52, null);
                            fz1Var.getDrawContext().getTransform().c(-fIntBitsToFloat5, -fIntBitsToFloat6);
                            fz1Var.getDrawContext().getTransform().c(-fIntBitsToFloat3, -fIntBitsToFloat4);
                            b(3.5f * f);
                            float fIntBitsToFloat7 = Float.intBitsToFloat((int) (j4 >> 32));
                            float fIntBitsToFloat8 = Float.intBitsToFloat((int) (j4 & 4294967295L));
                            fz1Var.getDrawContext().getTransform().c(fIntBitsToFloat7, fIntBitsToFloat8);
                            try {
                                DrawScope.g0(fz1Var, this.centerPath, companion.j(), 0.0f, null, null, 0, 60, null);
                                fz1Var.getDrawContext().getTransform().c(-fIntBitsToFloat7, -fIntBitsToFloat8);
                                obj2 = obj;
                                jC = c(obj2);
                            } catch (Throwable th) {
                                fz1Var.getDrawContext().getTransform().c(-fIntBitsToFloat7, -fIntBitsToFloat8);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            fz1Var.getDrawContext().getTransform().c(-fIntBitsToFloat5, -fIntBitsToFloat6);
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        fz1Var.getDrawContext().getTransform().c(-fIntBitsToFloat3, -fIntBitsToFloat4);
                        throw th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    fz1Var.getDrawContext().getTransform().c(-fIntBitsToFloat, -f2);
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                f2 = fIntBitsToFloat2;
            }
        } else {
            jC = j;
            obj2 = obj;
        }
        DrawScope.T0(fz1Var, jC, 0L, 0L, 0.0f, new Stroke(f, 0.0f, 0, 0, null, 30, null), null, 0, 110, null);
        int i3 = (int) (j2 >> 32);
        float fIntBitsToFloat9 = Float.intBitsToFloat(i3) - Float.intBitsToFloat((int) (gbaVar.m() >> 32));
        int i4 = (int) (j2 & 4294967295L);
        float fIntBitsToFloat10 = Float.intBitsToFloat(i4) - Float.intBitsToFloat((int) (gbaVar.m() & 4294967295L));
        fz1Var.getDrawContext().getTransform().c(fIntBitsToFloat9, fIntBitsToFloat10);
        try {
            DrawScope.T0(fz1Var, jC, 0L, j3, 0.0f, new Stroke(f, 0.0f, 0, 0, null, 30, null), null, 0, 106, null);
            fz1Var.getDrawContext().getTransform().c(-fIntBitsToFloat9, -fIntBitsToFloat10);
            float fIntBitsToFloat11 = (Float.intBitsToFloat(i3) - Float.intBitsToFloat((int) (gbaVar.m() >> 32))) - Float.intBitsToFloat((int) (this.debugOffset >> 32));
            float fIntBitsToFloat12 = (Float.intBitsToFloat(i4) - Float.intBitsToFloat((int) (gbaVar.m() & 4294967295L))) - Float.intBitsToFloat((int) (this.debugOffset & 4294967295L));
            fz1Var.getDrawContext().getTransform().c(fIntBitsToFloat11, fIntBitsToFloat12);
            try {
                float fIntBitsToFloat13 = Float.intBitsToFloat((int) (j3 >> 32)) * 0.5f;
                float fIntBitsToFloat14 = Float.intBitsToFloat((int) (j3 & 4294967295L)) * 0.5f;
                fz1Var.getDrawContext().getTransform().c(fIntBitsToFloat13, fIntBitsToFloat14);
                try {
                    long j5 = jC;
                    DrawScope.g0(fz1Var, this.debugPath, j5, 0.0f, new Stroke(f, 0.0f, 0, 0, f39.Companion.c(f39.INSTANCE, new float[]{20.0f, 10.0f}, 0.0f, 2, null), 14, null), null, 0, 52, null);
                    fz1Var.getDrawContext().getTransform().c(-fIntBitsToFloat13, -fIntBitsToFloat14);
                    fz1Var.getDrawContext().getTransform().c(-fIntBitsToFloat11, -fIntBitsToFloat12);
                    b(3 * f);
                    float fIntBitsToFloat15 = Float.intBitsToFloat((int) (j4 >> 32));
                    float fIntBitsToFloat16 = Float.intBitsToFloat((int) (j4 & 4294967295L));
                    fz1Var.getDrawContext().getTransform().c(fIntBitsToFloat15, fIntBitsToFloat16);
                    try {
                        DrawScope.g0(fz1Var, this.centerPath, j5, 0.0f, null, null, 0, 60, null);
                        fz1Var.getDrawContext().getTransform().c(-fIntBitsToFloat15, -fIntBitsToFloat16);
                        if (!z || vVar == null) {
                            return;
                        }
                        TextLayoutResult textLayoutResultB = v.b(vVar, obj2.toString(), new TextStyle(j5, c0d.i(18), null, null, null, null, null, 0L, null, null, null, ei1.p(companion.j(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16775164, null), 0, false, 0, 0L, null, null, null, false, 1020, null);
                        w.d(fz1Var, textLayoutResultB, (250 & 2) != 0 ? ei1.INSTANCE.i() : 0L, (250 & 4) != 0 ? rn8.INSTANCE.c() : rn8.e((((long) Float.floatToRawIntBits(10.0f)) << 32) | (((long) Float.floatToRawIntBits(10.0f)) & 4294967295L)), (250 & 8) != 0 ? Float.NaN : 0.0f, (250 & 16) != 0 ? null : null, (250 & 32) != 0 ? null : null, (250 & 64) == 0 ? null : null, (250 & 128) != 0 ? DrawScope.INSTANCE.a() : 0);
                        float fIntBitsToFloat17 = Float.intBitsToFloat(i3) - Float.intBitsToFloat((int) (gbaVar.m() >> 32));
                        float fIntBitsToFloat18 = Float.intBitsToFloat(i4) - Float.intBitsToFloat((int) (gbaVar.m() & 4294967295L));
                        fz1Var.getDrawContext().getTransform().c(fIntBitsToFloat17, fIntBitsToFloat18);
                        try {
                            w.d(fz1Var, textLayoutResultB, (250 & 2) != 0 ? ei1.INSTANCE.i() : 0L, (250 & 4) != 0 ? rn8.INSTANCE.c() : rn8.e((((long) Float.floatToRawIntBits(10.0f)) << 32) | (((long) Float.floatToRawIntBits(10.0f)) & 4294967295L)), (250 & 8) != 0 ? Float.NaN : 0.0f, (250 & 16) != 0 ? null : null, (250 & 32) != 0 ? null : null, (250 & 64) == 0 ? null : null, (250 & 128) != 0 ? DrawScope.INSTANCE.a() : 0);
                        } finally {
                            fz1Var.getDrawContext().getTransform().c(-fIntBitsToFloat17, -fIntBitsToFloat18);
                        }
                    } catch (Throwable th6) {
                        fz1Var.getDrawContext().getTransform().c(-fIntBitsToFloat15, -fIntBitsToFloat16);
                        throw th6;
                    }
                } catch (Throwable th7) {
                    fz1Var.getDrawContext().getTransform().c(-fIntBitsToFloat13, -fIntBitsToFloat14);
                    throw th7;
                }
            } catch (Throwable th8) {
                fz1Var.getDrawContext().getTransform().c(-fIntBitsToFloat11, -fIntBitsToFloat12);
                throw th8;
            }
        } catch (Throwable th9) {
            fz1Var.getDrawContext().getTransform().c(-fIntBitsToFloat9, -fIntBitsToFloat10);
            throw th9;
        }
    }
}
