package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.m;
import com.google.inputmethod.TypefaceRequest;
import com.google.inputmethod.mod;
import com.google.inputmethod.q6c;
import com.google.inputmethod.ul4;
import com.google.inputmethod.wa9;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010*¨\u0006,"}, d2 = {"Landroidx/compose/ui/text/font/m;", "Landroidx/compose/ui/text/font/l$b;", "Lcom/google/android/wa9;", "platformFontLoader", "Landroidx/compose/ui/text/font/d0;", "platformResolveInterceptor", "Lcom/google/android/mod;", "typefaceRequestCache", "Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter;", "fontListFontFamilyTypefaceAdapter", "Landroidx/compose/ui/text/font/b0;", "platformFamilyTypefaceAdapter", "<init>", "(Lcom/google/android/wa9;Landroidx/compose/ui/text/font/d0;Lcom/google/android/mod;Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter;Landroidx/compose/ui/text/font/b0;)V", "Lcom/google/android/kod;", "typefaceRequest", "Lcom/google/android/q6c;", "", "f", "(Lcom/google/android/kod;)Lcom/google/android/q6c;", "Landroidx/compose/ui/text/font/l;", "fontFamily", "Landroidx/compose/ui/text/font/x;", "fontWeight", "Landroidx/compose/ui/text/font/t;", "fontStyle", "Landroidx/compose/ui/text/font/u;", "fontSynthesis", "a", "(Landroidx/compose/ui/text/font/l;Landroidx/compose/ui/text/font/x;II)Lcom/google/android/q6c;", "Lcom/google/android/wa9;", "getPlatformFontLoader$ui_text", "()Lcom/google/android/wa9;", "b", "Landroidx/compose/ui/text/font/d0;", "c", "Lcom/google/android/mod;", "d", "Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter;", "e", "Landroidx/compose/ui/text/font/b0;", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "createDefaultTypeface", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m implements l.b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final wa9 platformFontLoader;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final d0 platformResolveInterceptor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final mod typefaceRequestCache;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final b0 platformFamilyTypefaceAdapter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Function1<TypefaceRequest, Object> createDefaultTypeface;

    public m(wa9 wa9Var, d0 d0Var, mod modVar, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, b0 b0Var) {
        this.platformFontLoader = wa9Var;
        this.platformResolveInterceptor = d0Var;
        this.typefaceRequestCache = modVar;
        this.fontListFontFamilyTypefaceAdapter = fontListFontFamilyTypefaceAdapter;
        this.platformFamilyTypefaceAdapter = b0Var;
        this.createDefaultTypeface = new Function1() { // from class: com.google.android.sl4
            public final Object invoke(Object obj) {
                return m.e(this.a, (TypefaceRequest) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object e(m mVar, TypefaceRequest typefaceRequest) {
        return mVar.f(TypefaceRequest.b(typefaceRequest, null, null, 0, 0, null, 30, null)).getValue();
    }

    private final q6c<Object> f(final TypefaceRequest typefaceRequest) {
        return this.typefaceRequestCache.b(typefaceRequest, new Function1() { // from class: com.google.android.tl4
            public final Object invoke(Object obj) {
                return m.g(this.a, typefaceRequest, (Function1) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l0 g(m mVar, TypefaceRequest typefaceRequest, Function1 function1) {
        l0 l0VarA = mVar.fontListFontFamilyTypefaceAdapter.a(typefaceRequest, mVar.platformFontLoader, function1, mVar.createDefaultTypeface);
        if (l0VarA != null) {
            return l0VarA;
        }
        l0 l0VarA2 = mVar.platformFamilyTypefaceAdapter.a(typefaceRequest, mVar.platformFontLoader, function1, mVar.createDefaultTypeface);
        if (l0VarA2 != null) {
            return l0VarA2;
        }
        throw new IllegalStateException("Could not load font");
    }

    @Override // androidx.compose.ui.text.font.l.b
    public q6c<Object> a(l fontFamily, FontWeight fontWeight, int fontStyle, int fontSynthesis) {
        return f(new TypefaceRequest(this.platformResolveInterceptor.a(fontFamily), this.platformResolveInterceptor.b(fontWeight), this.platformResolveInterceptor.c(fontStyle), this.platformResolveInterceptor.d(fontSynthesis), this.platformFontLoader.getCacheKey(), null));
    }

    public /* synthetic */ m(wa9 wa9Var, d0 d0Var, mod modVar, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, b0 b0Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wa9Var, (i & 2) != 0 ? d0.INSTANCE.a() : d0Var, (i & 4) != 0 ? ul4.b() : modVar, (i & 8) != 0 ? new FontListFontFamilyTypefaceAdapter(ul4.a(), null, 2, null) : fontListFontFamilyTypefaceAdapter, (i & 16) != 0 ? new b0() : b0Var);
    }
}
