package com.google.inputmethod;

import android.graphics.Matrix;
import android.graphics.Shader;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR:\u0010\u0016\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00102\u000e\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\f\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/google/android/ydd;", "", "<init>", "()V", "Landroid/graphics/Matrix;", "b", "()Landroid/graphics/Matrix;", "Lcom/google/android/zh7;", "matrix", "", "d", "([F)V", "a", "Landroid/graphics/Matrix;", "aMatrix", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "value", "Landroid/graphics/Shader;", "()Landroid/graphics/Shader;", "c", "(Landroid/graphics/Shader;)V", "shader", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ydd {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private Matrix aMatrix;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private Shader shader;

    private final Matrix b() {
        Matrix matrix = this.aMatrix;
        if (matrix != null) {
            return matrix;
        }
        Matrix matrix2 = new Matrix();
        this.aMatrix = matrix2;
        return matrix2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Shader getShader() {
        return this.shader;
    }

    public final void c(Shader shader) {
        Matrix matrix = this.aMatrix;
        if (matrix != null && shader != null) {
            shader.setLocalMatrix(matrix);
        }
        this.shader = shader;
    }

    public final void d(float[] matrix) {
        Matrix matrix2;
        if (matrix == null) {
            matrix2 = null;
            this.aMatrix = null;
        } else {
            Matrix matrixB = b();
            wl.a(matrixB, matrix);
            matrix2 = matrixB;
        }
        Shader shader = this.shader;
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }
}
