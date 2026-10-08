package androidx.compose.ui.text;

import androidx.compose.ui.text.h;
import com.google.inputmethod.ParagraphIntrinsicInfo;
import com.google.inputmethod.Placeholder;
import com.google.inputmethod.d19;
import com.google.inputmethod.dsc;
import com.google.inputmethod.f43;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010 \u001a\u00020\u001c8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0014\u0010\u001fR\u001b\u0010\"\u001a\u00020\u001c8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\u0018\u0010\u001fR \u0010&\u001a\b\u0012\u0004\u0012\u00020#0\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010\u0019\u001a\u0004\b%\u0010\u001bR\u0014\u0010)\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010(¨\u0006*"}, d2 = {"Landroidx/compose/ui/text/h;", "Lcom/google/android/d19;", "Landroidx/compose/ui/text/b;", "annotatedString", "Landroidx/compose/ui/text/y;", "style", "", "Landroidx/compose/ui/text/b$d;", "Lcom/google/android/v99;", "placeholders", "Lcom/google/android/f43;", "density", "Landroidx/compose/ui/text/font/l$b;", "fontFamilyResolver", "<init>", "(Landroidx/compose/ui/text/b;Landroidx/compose/ui/text/y;Ljava/util/List;Lcom/google/android/f43;Landroidx/compose/ui/text/font/l$b;)V", "Landroidx/compose/ui/text/m;", "defaultStyle", "l", "(Landroidx/compose/ui/text/m;Landroidx/compose/ui/text/m;)Landroidx/compose/ui/text/m;", "a", "Landroidx/compose/ui/text/b;", "g", "()Landroidx/compose/ui/text/b;", "b", "Ljava/util/List;", "i", "()Ljava/util/List;", "", "c", "Lkotlin/Lazy;", "()F", "minIntrinsicWidth", "d", "maxIntrinsicWidth", "Lcom/google/android/c19;", "e", "h", "infoList", "", "()Z", "hasStaleResolvedFonts", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements d19 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final b annotatedString;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<b.Range<Placeholder>> placeholders;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Lazy minIntrinsicWidth;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy maxIntrinsicWidth;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<ParagraphIntrinsicInfo> infoList;

    public h(b bVar, TextStyle textStyle, List<b.Range<Placeholder>> list, f43 f43Var, androidx.compose.ui.text.font.l.b bVar2) {
        this.annotatedString = bVar;
        this.placeholders = list;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.c;
        this.minIntrinsicWidth = kotlin.c.a(lazyThreadSafetyMode, new Function0() { // from class: com.google.android.b38
            public final Object invoke() {
                return Float.valueOf(h.k(this.a));
            }
        });
        this.maxIntrinsicWidth = kotlin.c.a(lazyThreadSafetyMode, new Function0() { // from class: com.google.android.c38
            public final Object invoke() {
                return Float.valueOf(h.j(this.a));
            }
        });
        ParagraphStyle paragraphStyle = textStyle.getParagraphStyle();
        List<b.Range<ParagraphStyle>> listK = c.k(bVar, paragraphStyle);
        ArrayList arrayList = new ArrayList(listK.size());
        int size = listK.size();
        for (int i = 0; i < size; i++) {
            b.Range<ParagraphStyle> range = listK.get(i);
            b bVarL = c.l(bVar, range.h(), range.f());
            ParagraphStyle paragraphStyleL = l(range.g(), paragraphStyle);
            String text = bVarL.getText();
            TextStyle textStyleI = textStyle.I(paragraphStyleL);
            List<b.Range<? extends b.a>> listC = bVarL.c();
            if (listC == null) {
                listC = kotlin.collections.m.p();
            }
            arrayList.add(new ParagraphIntrinsicInfo(k.a(text, textStyleI, listC, f43Var, bVar2, i.b(i(), range.h(), range.f())), range.h(), range.f()));
        }
        this.infoList = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float j(h hVar) {
        ParagraphIntrinsicInfo paragraphIntrinsicInfo;
        d19 intrinsics;
        List<ParagraphIntrinsicInfo> list = hVar.infoList;
        if (list.isEmpty()) {
            paragraphIntrinsicInfo = null;
        } else {
            ParagraphIntrinsicInfo paragraphIntrinsicInfo2 = list.get(0);
            float fB = paragraphIntrinsicInfo2.getIntrinsics().b();
            int iR = kotlin.collections.m.r(list);
            int i = 1;
            if (1 <= iR) {
                while (true) {
                    ParagraphIntrinsicInfo paragraphIntrinsicInfo3 = list.get(i);
                    float fB2 = paragraphIntrinsicInfo3.getIntrinsics().b();
                    if (Float.compare(fB, fB2) < 0) {
                        paragraphIntrinsicInfo2 = paragraphIntrinsicInfo3;
                        fB = fB2;
                    }
                    if (i == iR) {
                        break;
                    }
                    i++;
                }
            }
            paragraphIntrinsicInfo = paragraphIntrinsicInfo2;
        }
        ParagraphIntrinsicInfo paragraphIntrinsicInfo4 = paragraphIntrinsicInfo;
        if (paragraphIntrinsicInfo4 == null || (intrinsics = paragraphIntrinsicInfo4.getIntrinsics()) == null) {
            return 0.0f;
        }
        return intrinsics.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float k(h hVar) {
        ParagraphIntrinsicInfo paragraphIntrinsicInfo;
        d19 intrinsics;
        List<ParagraphIntrinsicInfo> list = hVar.infoList;
        if (list.isEmpty()) {
            paragraphIntrinsicInfo = null;
        } else {
            ParagraphIntrinsicInfo paragraphIntrinsicInfo2 = list.get(0);
            float fA = paragraphIntrinsicInfo2.getIntrinsics().a();
            int iR = kotlin.collections.m.r(list);
            int i = 1;
            if (1 <= iR) {
                while (true) {
                    ParagraphIntrinsicInfo paragraphIntrinsicInfo3 = list.get(i);
                    float fA2 = paragraphIntrinsicInfo3.getIntrinsics().a();
                    if (Float.compare(fA, fA2) < 0) {
                        paragraphIntrinsicInfo2 = paragraphIntrinsicInfo3;
                        fA = fA2;
                    }
                    if (i == iR) {
                        break;
                    }
                    i++;
                }
            }
            paragraphIntrinsicInfo = paragraphIntrinsicInfo2;
        }
        ParagraphIntrinsicInfo paragraphIntrinsicInfo4 = paragraphIntrinsicInfo;
        if (paragraphIntrinsicInfo4 == null || (intrinsics = paragraphIntrinsicInfo4.getIntrinsics()) == null) {
            return 0.0f;
        }
        return intrinsics.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ParagraphStyle l(ParagraphStyle style, ParagraphStyle defaultStyle) {
        return !dsc.j(style.getTextDirection(), dsc.INSTANCE.f()) ? style : ParagraphStyle.b(style, 0, defaultStyle.getTextDirection(), 0L, null, null, null, 0, 0, null, 509, null);
    }

    @Override // com.google.inputmethod.d19
    public float a() {
        return ((Number) this.minIntrinsicWidth.getValue()).floatValue();
    }

    @Override // com.google.inputmethod.d19
    public float b() {
        return ((Number) this.maxIntrinsicWidth.getValue()).floatValue();
    }

    @Override // com.google.inputmethod.d19
    public boolean c() {
        List<ParagraphIntrinsicInfo> list = this.infoList;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).getIntrinsics().c()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final b getAnnotatedString() {
        return this.annotatedString;
    }

    public final List<ParagraphIntrinsicInfo> h() {
        return this.infoList;
    }

    public final List<b.Range<Placeholder>> i() {
        return this.placeholders;
    }
}
