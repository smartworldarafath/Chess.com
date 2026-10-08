package com.google.inputmethod;

import android.graphics.Paint;
import android.graphics.Shader;
import androidx.compose.ui.graphics.h;
import com.google.android.r43;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0017¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u000b\u001a\u00020\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\r\u001a\u00020\f8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0016\u001a\u00020\u00118&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u001c\u001a\u00020\u00178&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010 \u001a\u00020\u001d8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u001c\u0010#\u001a\u00020\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\b!\u0010\b\"\u0004\b\"\u0010\nR\u001c\u0010'\u001a\u00020$8&@&X¦\u000e¢\u0006\f\u001a\u0004\b%\u0010\u0019\"\u0004\b&\u0010\u001bR\u001c\u0010+\u001a\u00020(8&@&X¦\u000e¢\u0006\f\u001a\u0004\b)\u0010\u0019\"\u0004\b*\u0010\u001bR\u001c\u0010.\u001a\u00020\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\b,\u0010\b\"\u0004\b-\u0010\nR\u001c\u00102\u001a\u00020/8&@&X¦\u000e¢\u0006\f\u001a\u0004\b0\u0010\u0019\"\u0004\b1\u0010\u001bR$\u00109\u001a\n\u0018\u000103j\u0004\u0018\u0001`48&@&X¦\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001e\u0010?\u001a\u0004\u0018\u00010:8&@&X¦\u000e¢\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001e\u0010E\u001a\u0004\u0018\u00010@8&@&X¦\u000e¢\u0006\f\u001a\u0004\bA\u0010B\"\u0004\bC\u0010Dø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006FÀ\u0006\u0001"}, d2 = {"Lcom/google/android/q09;", "", "Landroid/graphics/Paint;", "Landroidx/compose/ui/graphics/NativePaint;", "v", "()Landroid/graphics/Paint;", "", "a", "()F", "c", "(F)V", "alpha", "", "isAntiAlias", "()Z", "o", "(Z)V", "Lcom/google/android/ei1;", "d", "()J", "n", "(J)V", "color", "Landroidx/compose/ui/graphics/e;", "f", "()I", "e", "(I)V", "blendMode", "Lcom/google/android/w09;", "getStyle-TiuSbCo", "y", "style", "A", "z", "strokeWidth", "Lcom/google/android/wbc;", "r", "p", "strokeCap", "Lcom/google/android/ybc;", "t", "s", "strokeJoin", "u", "x", "strokeMiterLimit", "Lcom/google/android/ca4;", "E", "q", "filterQuality", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "w", "()Landroid/graphics/Shader;", "D", "(Landroid/graphics/Shader;)V", "shader", "Landroidx/compose/ui/graphics/h;", "b", "()Landroidx/compose/ui/graphics/h;", "h", "(Landroidx/compose/ui/graphics/h;)V", "colorFilter", "Lcom/google/android/f39;", "C", "()Lcom/google/android/f39;", "B", "(Lcom/google/android/f39;)V", "pathEffect", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface q09 {
    float A();

    void B(f39 f39Var);

    f39 C();

    void D(Shader shader);

    int E();

    float a();

    h b();

    void c(float f);

    long d();

    void e(int i);

    int f();

    void h(h hVar);

    void n(long j);

    void o(boolean z);

    void p(int i);

    void q(int i);

    int r();

    void s(int i);

    int t();

    float u();

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NotImplementedError */
    @r43
    default Paint v() throws NotImplementedError {
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    Shader w();

    void x(float f);

    void y(int i);

    void z(float f);
}
