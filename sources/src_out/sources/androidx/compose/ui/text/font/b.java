package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import com.google.android.q22;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b'\u0018\u00002\u00020\u0001:\u0001\fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/text/font/b;", "Landroidx/compose/ui/text/font/k;", "Landroidx/compose/ui/text/font/r;", "loadingStrategy", "Landroidx/compose/ui/text/font/b$a;", "typefaceLoader", "Landroidx/compose/ui/text/font/w$d;", "variationSettings", "<init>", "(ILandroidx/compose/ui/text/font/b$a;Landroidx/compose/ui/text/font/w$d;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "b", "I", "a", "()I", "c", "Landroidx/compose/ui/text/font/b$a;", "d", "()Landroidx/compose/ui/text/font/b$a;", "Landroidx/compose/ui/text/font/w$d;", "e", "()Landroidx/compose/ui/text/font/w$d;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b implements k {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int loadingStrategy;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final a typefaceLoader;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final w.d variationSettings;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/b$a;", "", "Landroid/content/Context;", "context", "Landroidx/compose/ui/text/font/b;", "font", "Landroid/graphics/Typeface;", "b", "(Landroid/content/Context;Landroidx/compose/ui/text/font/b;)Landroid/graphics/Typeface;", "a", "(Landroid/content/Context;Landroidx/compose/ui/text/font/b;Lcom/google/android/q22;)Ljava/lang/Object;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {
        Object a(Context context, b bVar, q22<? super Typeface> q22Var);

        Typeface b(Context context, b font);
    }

    public /* synthetic */ b(int i, a aVar, w.d dVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, aVar, dVar);
    }

    @Override // androidx.compose.ui.text.font.k
    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getLoadingStrategy() {
        return this.loadingStrategy;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final a getTypefaceLoader() {
        return this.typefaceLoader;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final w.d getVariationSettings() {
        return this.variationSettings;
    }

    private b(int i, a aVar, w.d dVar) {
        this.loadingStrategy = i;
        this.typefaceLoader = aVar;
        this.variationSettings = dVar;
    }
}
