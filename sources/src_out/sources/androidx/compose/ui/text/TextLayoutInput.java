package androidx.compose.ui.text;

import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.Placeholder;
import com.google.inputmethod.f43;
import com.google.inputmethod.kx1;
import com.google.inputmethod.uyc;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.compose.ui.text.u, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b!\b\u0007\u0018\u00002\u00020\u0001Bo\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bBe\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010!R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b7\u00102\u001a\u0004\b7\u0010!R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b/\u00108\u001a\u0004\b)\u00109R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b5\u0010:\u001a\u0004\b1\u0010;R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b+\u0010<\u001a\u0004\b-\u0010=R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b'\u0010>\u001a\u0004\b%\u0010?R\u0018\u0010B\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006C"}, d2 = {"Landroidx/compose/ui/text/u;", "", "Landroidx/compose/ui/text/b;", "text", "Landroidx/compose/ui/text/y;", "style", "", "Landroidx/compose/ui/text/b$d;", "Lcom/google/android/v99;", "placeholders", "", "maxLines", "", "softWrap", "Lcom/google/android/uyc;", "overflow", "Lcom/google/android/f43;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/text/font/k$b;", "resourceLoader", "Landroidx/compose/ui/text/font/l$b;", "fontFamilyResolver", "Lcom/google/android/kx1;", "constraints", "<init>", "(Landroidx/compose/ui/text/b;Landroidx/compose/ui/text/y;Ljava/util/List;IZILcom/google/android/f43;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/k$b;Landroidx/compose/ui/text/font/l$b;J)V", "(Landroidx/compose/ui/text/b;Landroidx/compose/ui/text/y;Ljava/util/List;IZILcom/google/android/f43;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/l$b;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Landroidx/compose/ui/text/b;", "j", "()Landroidx/compose/ui/text/b;", "b", "Landroidx/compose/ui/text/y;", "i", "()Landroidx/compose/ui/text/y;", "c", "Ljava/util/List;", "g", "()Ljava/util/List;", "d", "I", "e", "Z", "h", "()Z", "f", "Lcom/google/android/f43;", "()Lcom/google/android/f43;", "Landroidx/compose/ui/unit/LayoutDirection;", "()Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/text/font/l$b;", "()Landroidx/compose/ui/text/font/l$b;", "J", "()J", "k", "Landroidx/compose/ui/text/font/k$b;", "_developerSuppliedResourceLoader", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TextLayoutInput {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final b text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final TextStyle style;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final List<b.Range<Placeholder>> placeholders;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int maxLines;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final boolean softWrap;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final int overflow;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final f43 density;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private final LayoutDirection layoutDirection;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    private final androidx.compose.ui.text.font.l.b fontFamilyResolver;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    private final long constraints;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private androidx.compose.ui.text.font.k.b _developerSuppliedResourceLoader;

    public /* synthetic */ TextLayoutInput(b bVar, TextStyle yVar, List list, int i, boolean z, int i2, f43 f43Var, LayoutDirection layoutDirection, androidx.compose.ui.text.font.l.b bVar2, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, yVar, list, i, z, i2, f43Var, layoutDirection, bVar2, j);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getConstraints() {
        return this.constraints;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final f43 getDensity() {
        return this.density;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final androidx.compose.ui.text.font.l.b getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextLayoutInput)) {
            return false;
        }
        TextLayoutInput textLayoutInput = (TextLayoutInput) other;
        return Intrinsics.e(this.text, textLayoutInput.text) && Intrinsics.e(this.style, textLayoutInput.style) && Intrinsics.e(this.placeholders, textLayoutInput.placeholders) && this.maxLines == textLayoutInput.maxLines && this.softWrap == textLayoutInput.softWrap && uyc.g(this.overflow, textLayoutInput.overflow) && Intrinsics.e(this.density, textLayoutInput.density) && this.layoutDirection == textLayoutInput.layoutDirection && Intrinsics.e(this.fontFamilyResolver, textLayoutInput.fontFamilyResolver) && kx1.f(this.constraints, textLayoutInput.constraints);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getOverflow() {
        return this.overflow;
    }

    public final List<b.Range<Placeholder>> g() {
        return this.placeholders;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getSoftWrap() {
        return this.softWrap;
    }

    public int hashCode() {
        return (((((((((((((((((this.text.hashCode() * 31) + this.style.hashCode()) * 31) + this.placeholders.hashCode()) * 31) + this.maxLines) * 31) + Boolean.hashCode(this.softWrap)) * 31) + uyc.h(this.overflow)) * 31) + this.density.hashCode()) * 31) + this.layoutDirection.hashCode()) * 31) + this.fontFamilyResolver.hashCode()) * 31) + kx1.o(this.constraints);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final b getText() {
        return this.text;
    }

    public String toString() {
        return "TextLayoutInput(text=" + ((Object) this.text) + ", style=" + this.style + ", placeholders=" + this.placeholders + ", maxLines=" + this.maxLines + ", softWrap=" + this.softWrap + ", overflow=" + ((Object) uyc.i(this.overflow)) + ", density=" + this.density + ", layoutDirection=" + this.layoutDirection + ", fontFamilyResolver=" + this.fontFamilyResolver + ", constraints=" + ((Object) kx1.q(this.constraints)) + ')';
    }

    private TextLayoutInput(b bVar, TextStyle yVar, List<b.Range<Placeholder>> list, int i, boolean z, int i2, f43 f43Var, LayoutDirection layoutDirection, androidx.compose.ui.text.font.k.b bVar2, androidx.compose.ui.text.font.l.b bVar3, long j) {
        this.text = bVar;
        this.style = yVar;
        this.placeholders = list;
        this.maxLines = i;
        this.softWrap = z;
        this.overflow = i2;
        this.density = f43Var;
        this.layoutDirection = layoutDirection;
        this.fontFamilyResolver = bVar3;
        this.constraints = j;
        this._developerSuppliedResourceLoader = bVar2;
    }

    private TextLayoutInput(b bVar, TextStyle yVar, List<b.Range<Placeholder>> list, int i, boolean z, int i2, f43 f43Var, LayoutDirection layoutDirection, androidx.compose.ui.text.font.l.b bVar2, long j) {
        this(bVar, yVar, list, i, z, i2, f43Var, layoutDirection, (androidx.compose.ui.text.font.k.b) null, bVar2, j);
    }
}
