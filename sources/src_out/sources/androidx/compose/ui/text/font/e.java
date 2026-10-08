package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001B!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH ¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R$\u0010\u001f\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001a\u0010\u001e\u0082\u0001\u0001 ¨\u0006!"}, d2 = {"Landroidx/compose/ui/text/font/e;", "Landroidx/compose/ui/text/font/b;", "Landroidx/compose/ui/text/font/x;", "weight", "Landroidx/compose/ui/text/font/t;", "style", "Landroidx/compose/ui/text/font/w$d;", "variationSettings", "<init>", "(Landroidx/compose/ui/text/font/x;ILandroidx/compose/ui/text/font/w$d;)V", "Landroid/content/Context;", "context", "Landroid/graphics/Typeface;", "f", "(Landroid/content/Context;)Landroid/graphics/Typeface;", "g", "e", "Landroidx/compose/ui/text/font/x;", "b", "()Landroidx/compose/ui/text/font/x;", "I", "c", "()I", "", "Z", "didInitWithContext", "h", "Landroid/graphics/Typeface;", "getTypeface$ui_text", "()Landroid/graphics/Typeface;", "(Landroid/graphics/Typeface;)V", "typeface", "Landroidx/compose/ui/text/font/a;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class e extends b {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final FontWeight weight;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int style;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean didInitWithContext;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private Typeface typeface;

    public /* synthetic */ e(FontWeight fontWeight, int i, w.d dVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(fontWeight, i, dVar);
    }

    @Override // androidx.compose.ui.text.font.k
    /* JADX INFO: renamed from: b, reason: from getter */
    public final FontWeight getWeight() {
        return this.weight;
    }

    @Override // androidx.compose.ui.text.font.k
    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getStyle() {
        return this.style;
    }

    public abstract Typeface f(Context context);

    public final Typeface g(Context context) {
        if (!this.didInitWithContext && this.typeface == null) {
            this.typeface = f(context);
        }
        this.didInitWithContext = true;
        return this.typeface;
    }

    public final void h(Typeface typeface) {
        this.typeface = typeface;
    }

    private e(FontWeight fontWeight, int i, w.d dVar) {
        super(r.INSTANCE.b(), f.a, dVar, null);
        this.weight = fontWeight;
        this.style = i;
    }
}
