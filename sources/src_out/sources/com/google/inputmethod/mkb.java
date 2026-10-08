package com.google.inputmethod;

import android.graphics.Shader;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aK\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\r\u001aK\u0010\u0010\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a9\u0010\u0012\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000e\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a-\u0010\u0018\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019\u001a1\u0010\u001e\u001a\u00060\nj\u0002`\u000b2\n\u0010\u001a\u001a\u00060\nj\u0002`\u000b2\n\u0010\u001b\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/google/android/rn8;", "from", "to", "", "Lcom/google/android/ei1;", "colors", "", "colorStops", "Lcom/google/android/i5d;", "tileMode", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "d", "(JJLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "center", "radius", "e", "(JFLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "f", "(JLjava/util/List;Ljava/util/List;)Landroid/graphics/Shader;", "Lcom/google/android/ml5;", "image", "tileModeX", "tileModeY", "b", "(Lcom/google/android/ml5;II)Landroid/graphics/Shader;", "dst", "src", "Landroidx/compose/ui/graphics/e;", "blendMode", "a", "(Landroid/graphics/Shader;Landroid/graphics/Shader;I)Landroid/graphics/Shader;", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class mkb {
    public static final Shader a(Shader shader, Shader shader2, int i) {
        return sn.a(shader, shader2, i);
    }

    public static final Shader b(ml5 ml5Var, int i, int i2) {
        return sn.b(ml5Var, i, i2);
    }

    public static /* synthetic */ Shader c(ml5 ml5Var, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = i5d.INSTANCE.a();
        }
        if ((i3 & 4) != 0) {
            i2 = i5d.INSTANCE.a();
        }
        return b(ml5Var, i, i2);
    }

    public static final Shader d(long j, long j2, List<ei1> list, List<Float> list2, int i) {
        return sn.c(j, j2, list, list2, i);
    }

    public static final Shader e(long j, float f, List<ei1> list, List<Float> list2, int i) {
        return sn.d(j, f, list, list2, i);
    }

    public static final Shader f(long j, List<ei1> list, List<Float> list2) {
        return sn.e(j, list, list2);
    }
}
