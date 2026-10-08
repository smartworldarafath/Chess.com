package androidx.compose.ui.text.font;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.a, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0014R\u001a\u0010&\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010\u0014¨\u0006'"}, d2 = {"Landroidx/compose/ui/text/font/a;", "Landroidx/compose/ui/text/font/e;", "Landroid/content/res/AssetManager;", "assetManager", "", "path", "Landroidx/compose/ui/text/font/x;", "weight", "Landroidx/compose/ui/text/font/t;", "style", "Landroidx/compose/ui/text/font/w$d;", "variationSettings", "<init>", "(Landroid/content/res/AssetManager;Ljava/lang/String;Landroidx/compose/ui/text/font/x;ILandroidx/compose/ui/text/font/w$d;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroid/content/Context;", "context", "Landroid/graphics/Typeface;", "f", "(Landroid/content/Context;)Landroid/graphics/Typeface;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "i", "Landroid/content/res/AssetManager;", "getAssetManager", "()Landroid/content/res/AssetManager;", "j", "Ljava/lang/String;", "getPath", "k", "getCacheKey", "cacheKey", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Font extends e {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final AssetManager assetManager;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final String path;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final String cacheKey;

    public /* synthetic */ Font(AssetManager assetManager, String str, FontWeight fontWeight, int i, w.d dVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(assetManager, str, fontWeight, i, dVar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Font)) {
            return false;
        }
        Font font = (Font) other;
        return Intrinsics.e(this.path, font.path) && Intrinsics.e(getVariationSettings(), font.getVariationSettings());
    }

    @Override // androidx.compose.ui.text.font.e
    public Typeface f(Context context) {
        return j0.a.a(this.assetManager, this.path, context, getVariationSettings());
    }

    public int hashCode() {
        return (this.path.hashCode() * 31) + getVariationSettings().hashCode();
    }

    public String toString() {
        return "Font(assetManager, path=" + this.path + ", weight=" + getWeight() + ", style=" + ((Object) t.h(getStyle())) + ')';
    }

    private Font(AssetManager assetManager, String str, FontWeight fontWeight, int i, w.d dVar) {
        super(fontWeight, i, dVar, null);
        this.assetManager = assetManager;
        this.path = str;
        h(f(null));
        this.cacheKey = "asset:" + str;
    }
}
