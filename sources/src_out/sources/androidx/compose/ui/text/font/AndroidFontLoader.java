package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import com.google.inputmethod.uk;
import com.google.inputmethod.wa9;
import kotlin.Metadata;
import kotlin.Result;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\n \r*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/text/font/AndroidFontLoader;", "Lcom/google/android/wa9;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/compose/ui/text/font/k;", "font", "Landroid/graphics/Typeface;", "c", "(Landroidx/compose/ui/text/font/k;)Landroid/graphics/Typeface;", "b", "(Landroidx/compose/ui/text/font/k;Lcom/google/android/q22;)Ljava/lang/Object;", "kotlin.jvm.PlatformType", "a", "Landroid/content/Context;", "", "Ljava/lang/Object;", "getCacheKey", "()Ljava/lang/Object;", "cacheKey", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidFontLoader implements wa9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Object cacheKey;

    public AndroidFontLoader(Context context) {
        this.context = context.getApplicationContext();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if (r7 == r1) goto L27;
     */
    @Override // com.google.inputmethod.wa9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(androidx.compose.ui.text.font.k r6, com.google.android.q22<? super android.graphics.Typeface> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1 r0 = (androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1 r0 = new androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.g()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.L$0
            androidx.compose.ui.text.font.k r6 = (androidx.compose.ui.text.font.k) r6
            kotlin.f.b(r7)
            goto L69
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            kotlin.f.b(r7)
            return r7
        L3c:
            kotlin.f.b(r7)
            boolean r7 = r6 instanceof androidx.compose.ui.text.font.b
            if (r7 == 0) goto L55
            androidx.compose.ui.text.font.b r6 = (androidx.compose.ui.text.font.b) r6
            androidx.compose.ui.text.font.b$a r7 = r6.getTypefaceLoader()
            android.content.Context r2 = r5.context
            r0.label = r4
            java.lang.Object r6 = r7.a(r2, r6, r0)
            if (r6 != r1) goto L54
            goto L68
        L54:
            return r6
        L55:
            boolean r7 = r6 instanceof androidx.compose.ui.text.font.ResourceFont
            if (r7 == 0) goto L78
            r7 = r6
            androidx.compose.ui.text.font.h0 r7 = (androidx.compose.ui.text.font.ResourceFont) r7
            android.content.Context r2 = r5.context
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r7 = com.google.inputmethod.uk.b(r7, r2, r0)
            if (r7 != r1) goto L69
        L68:
            return r1
        L69:
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7
            androidx.compose.ui.text.font.h0 r6 = (androidx.compose.ui.text.font.ResourceFont) r6
            androidx.compose.ui.text.font.w$d r6 = r6.getVariationSettings()
            android.content.Context r0 = r5.context
            android.graphics.Typeface r6 = androidx.compose.ui.text.font.g0.b(r7, r6, r0)
            return r6
        L78:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown font type: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AndroidFontLoader.b(androidx.compose.ui.text.font.k, com.google.android.q22):java.lang.Object");
    }

    @Override // com.google.inputmethod.wa9
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Typeface a(k font) {
        Object objB;
        Typeface typefaceC;
        if (font instanceof b) {
            b bVar = (b) font;
            return bVar.getTypefaceLoader().b(this.context, bVar);
        }
        if (!(font instanceof ResourceFont)) {
            return null;
        }
        ResourceFont resourceFont = (ResourceFont) font;
        int loadingStrategy = resourceFont.getLoadingStrategy();
        r.Companion companion = r.INSTANCE;
        if (r.e(loadingStrategy, companion.b())) {
            typefaceC = uk.c(resourceFont, this.context);
        } else {
            if (!r.e(loadingStrategy, companion.c())) {
                if (r.e(loadingStrategy, companion.a())) {
                    throw new UnsupportedOperationException("Unsupported Async font load path");
                }
                throw new IllegalArgumentException("Unknown loading type " + ((Object) r.g(resourceFont.getLoadingStrategy())));
            }
            try {
                Result.a aVar = Result.a;
                objB = Result.b(uk.c((ResourceFont) font, this.context));
            } catch (Throwable th) {
                Result.a aVar2 = Result.a;
                objB = Result.b(kotlin.f.a(th));
            }
            typefaceC = (Typeface) (Result.g(objB) ? null : objB);
        }
        return g0.b(typefaceC, resourceFont.getVariationSettings(), this.context);
    }

    @Override // com.google.inputmethod.wa9
    public Object getCacheKey() {
        return this.cacheKey;
    }
}
