package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.google.inputmethod.ah3;
import com.google.inputmethod.fz1;
import com.google.inputmethod.o01;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0001¢\u0006\u0004\b\n\u0010\u0006\u001a!\u0010\f\u001a\u00020\u000b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0001¢\u0006\u0004\b\f\u0010\r\u001a%\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/b;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "onDraw", "b", "(Landroidx/compose/ui/b;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/b;", "Landroidx/compose/ui/draw/CacheDrawScope;", "Lcom/google/android/ah3;", "onBuildDrawCache", "c", "Lcom/google/android/o01;", "a", "(Lkotlin/jvm/functions/Function1;)Lcom/google/android/o01;", "Lcom/google/android/fz1;", "d", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {
    public static final o01 a(Function1<? super CacheDrawScope, ah3> function1) {
        return new CacheDrawModifierNodeImpl(new CacheDrawScope(), function1);
    }

    public static final androidx.compose.ui.b b(androidx.compose.ui.b bVar, Function1<? super DrawScope, Unit> function1) {
        return bVar.then(new b(function1));
    }

    public static final androidx.compose.ui.b c(androidx.compose.ui.b bVar, Function1<? super CacheDrawScope, ah3> function1) {
        return bVar.then(new d(function1));
    }

    public static final androidx.compose.ui.b d(androidx.compose.ui.b bVar, Function1<? super fz1, Unit> function1) {
        return bVar.then(new e(function1));
    }
}
