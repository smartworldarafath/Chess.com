package com.google.inputmethod;

import android.graphics.Shader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R.\u0010!\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/google/android/jkb;", "Lcom/google/android/qu0;", "<init>", "()V", "Lcom/google/android/ydd;", "c", "()Lcom/google/android/ydd;", "Lcom/google/android/tsb;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "b", "(J)Landroid/graphics/Shader;", "Lcom/google/android/q09;", "p", "", "alpha", "", "a", "(JLcom/google/android/q09;F)V", "Lcom/google/android/ydd;", "internalTransformShader", "d", "J", "createdSize", "Lcom/google/android/zh7;", "value", "e", "[F", "getTransform-3i98HWw", "()[F", "setTransform-Q8lPUPs", "([F)V", "transform", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class jkb extends qu0 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private ydd internalTransformShader;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private long createdSize;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private float[] transform;

    public jkb() {
        super(null);
        this.createdSize = tsb.INSTANCE.a();
    }

    private final ydd c() {
        ydd yddVar = this.internalTransformShader;
        if (yddVar != null) {
            return yddVar;
        }
        ydd yddVar2 = new ydd();
        this.internalTransformShader = yddVar2;
        return yddVar2;
    }

    @Override // com.google.inputmethod.qu0
    public final void a(long size, q09 p, float alpha) {
        ydd yddVarC = this.internalTransformShader;
        if (yddVarC == null || !tsb.h(this.createdSize, size)) {
            if (tsb.n(size)) {
                this.internalTransformShader = null;
                this.createdSize = tsb.INSTANCE.a();
                yddVarC = null;
            } else {
                yddVarC = c();
                float[] fArr = this.transform;
                if (fArr != null) {
                    yddVarC.d(fArr);
                }
                yddVarC.c(b(size));
                this.internalTransformShader = yddVarC;
                this.createdSize = size;
            }
        }
        long jD = p.d();
        ei1.Companion companion = ei1.INSTANCE;
        if (!ei1.r(jD, companion.a())) {
            p.n(companion.a());
        }
        if (!Intrinsics.e(p.w(), yddVarC != null ? yddVarC.getShader() : null)) {
            p.D(yddVarC != null ? yddVarC.getShader() : null);
        }
        if (p.a() == alpha) {
            return;
        }
        p.c(alpha);
    }

    public abstract Shader b(long size);
}
