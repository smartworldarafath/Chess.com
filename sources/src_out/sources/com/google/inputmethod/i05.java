package com.google.inputmethod;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lcom/google/android/i05;", "", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "b", "()Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "", "c", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Lcom/google/android/pkb;", "a", "()Lcom/google/android/pkb;", "shadowContext", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface i05 {

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/google/android/i05$a", "", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements pkb {
        a() {
        }
    }

    default pkb a() {
        return new a();
    }

    GraphicsLayer b();

    void c(GraphicsLayer layer);
}
