package androidx.compose.ui.text;

import com.google.android.r43;
import com.google.android.zk1;
import com.google.inputmethod.ax5;
import com.google.inputmethod.b0d;
import com.google.inputmethod.k0b;
import com.google.inputmethod.n48;
import com.google.inputmethod.t04;
import com.google.inputmethod.y06;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 .2\u00020\u0001:\u0004F\u0013>@B)\b\u0000\u0012\u0016\u0010\u0005\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB=\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\u0002\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00030\u0002¢\u0006\u0004\b\b\u0010\u000eB)\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\u0002¢\u0006\u0004\b\b\u0010\u000fJ\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ1\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u00022\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b#\u0010$J%\u0010&\u001a\u00020%2\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b&\u0010'J)\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00030\u00022\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b)\u0010*J+\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u00030\u00022\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0010H\u0007¢\u0006\u0004\b,\u0010*J)\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u00030\u00022\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b.\u0010*J\u001d\u0010/\u001a\u00020%2\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b/\u00100J\u001a\u00102\u001a\u00020%2\b\u0010\u001d\u001a\u0004\u0018\u000101H\u0096\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0010H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0006H\u0016¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020%2\u0006\u0010\u001d\u001a\u00020\u0000¢\u0006\u0004\b8\u00109J1\u0010<\u001a\u00020\u00002\"\u0010;\u001a\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030:¢\u0006\u0004\b<\u0010=J7\u0010>\u001a\u00020\u00002(\u0010;\u001a$\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\u00020:¢\u0006\u0004\b>\u0010=R*\u0010\u0005\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010B\u001a\u0004\bC\u00107R(\u0010E\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0003\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b@\u0010?\u001a\u0004\bD\u0010AR(\u0010H\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0003\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\bF\u0010?\u001a\u0004\bG\u0010AR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\u00028F¢\u0006\u0006\u001a\u0004\bI\u0010AR\u0014\u0010J\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u00105¨\u0006K"}, d2 = {"Landroidx/compose/ui/text/b;", "", "", "Landroidx/compose/ui/text/b$d;", "Landroidx/compose/ui/text/b$a;", "annotations", "", "text", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "Landroidx/compose/ui/text/r;", "spanStyles", "Landroidx/compose/ui/text/m;", "paragraphStyles", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "(Ljava/lang/String;Ljava/util/List;)V", "", "index", "", "b", "(I)C", "startIndex", "endIndex", "r", "(II)Landroidx/compose/ui/text/b;", "Landroidx/compose/ui/text/x;", "range", "s", "(J)Landroidx/compose/ui/text/b;", "other", "q", "(Landroidx/compose/ui/text/b;)Landroidx/compose/ui/text/b;", "tag", "start", "end", "i", "(Ljava/lang/String;II)Ljava/util/List;", "", "o", "(Ljava/lang/String;II)Z", "Landroidx/compose/ui/text/z;", "k", "(II)Ljava/util/List;", "Landroidx/compose/ui/text/a0;", "l", "Landroidx/compose/ui/text/f;", "e", "n", "(II)Z", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "m", "(Landroidx/compose/ui/text/b;)Z", "Lkotlin/Function1;", "transform", "p", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/text/b;", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "Ljava/lang/String;", "j", "h", "spanStylesOrNull", "d", "f", "paragraphStylesOrNull", "g", "length", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements CharSequence {
    private static final k0b<b, ?> f = p.v1();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<Range<? extends a>> annotations;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String text;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<Range<SpanStyle>> spanStylesOrNull;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<Range<ParagraphStyle>> paragraphStylesOrNull;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0007\u0002\u0003\u0004\u0005\u0006\u0007\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/b$a;", "", "Landroidx/compose/ui/text/d;", "Landroidx/compose/ui/text/f;", "Landroidx/compose/ui/text/m;", "Landroidx/compose/ui/text/r;", "Landroidx/compose/ui/text/s;", "Landroidx/compose/ui/text/z;", "Landroidx/compose/ui/text/a0;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class e<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return zk1.e(Integer.valueOf(((Range) t).h()), Integer.valueOf(((Range) t2).h()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(List<? extends Range<? extends a>> list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.annotations = list;
        this.text = str;
        if (list != 0) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                Range<SpanStyle> range = (Range) list.get(i);
                if (range.g() instanceof SpanStyle) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    Intrinsics.h(range, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>");
                    arrayList.add(range);
                } else if (range.g() instanceof ParagraphStyle) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    Intrinsics.h(range, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.ParagraphStyle>");
                    arrayList2.add(range);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.spanStylesOrNull = arrayList;
        this.paragraphStylesOrNull = arrayList2;
        List listM1 = arrayList2 != null ? kotlin.collections.m.m1(arrayList2, new e()) : null;
        if (listM1 == null || listM1.isEmpty()) {
            return;
        }
        n48 n48VarE = y06.e(((Range) kotlin.collections.m.z0(listM1)).f());
        int size2 = listM1.size();
        for (int i2 = 1; i2 < size2; i2++) {
            Range range2 = (Range) listM1.get(i2);
            while (n48VarE._size != 0) {
                int i3 = n48VarE.i();
                if (range2.h() < i3) {
                    if (!(range2.f() <= i3)) {
                        ax5.a("Paragraph overlap not allowed, end " + range2.f() + " should be less than or equal to " + i3);
                        break;
                    }
                    break;
                }
                n48VarE.p(n48VarE._size - 1);
            }
            n48VarE.k(range2.f());
        }
    }

    public final b a(Function1<? super Range<? extends a>, ? extends List<? extends Range<? extends a>>> transform) {
        C0062b c0062b = new C0062b(this);
        c0062b.k(transform);
        return c0062b.t();
    }

    public char b(int index) {
        return this.text.charAt(index);
    }

    public final List<Range<? extends a>> c() {
        return this.annotations;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return b(i);
    }

    public int d() {
        return this.text.length();
    }

    public final List<Range<f>> e(int start, int end) {
        List listP;
        List<Range<? extends a>> list = this.annotations;
        if (list != null) {
            listP = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Range<? extends a> range = list.get(i);
                Range<? extends a> range2 = range;
                if ((range2.g() instanceof f) && c.j(start, end, range2.h(), range2.f())) {
                    listP.add(range);
                }
            }
        } else {
            listP = kotlin.collections.m.p();
        }
        Intrinsics.h(listP, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation>>");
        return listP;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof b)) {
            return false;
        }
        b bVar = (b) other;
        return Intrinsics.e(this.text, bVar.text) && Intrinsics.e(this.annotations, bVar.annotations);
    }

    public final List<Range<ParagraphStyle>> f() {
        return this.paragraphStylesOrNull;
    }

    public final List<Range<SpanStyle>> g() {
        List<Range<SpanStyle>> list = this.spanStylesOrNull;
        return list == null ? kotlin.collections.m.p() : list;
    }

    public final List<Range<SpanStyle>> h() {
        return this.spanStylesOrNull;
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        List<Range<? extends a>> list = this.annotations;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final List<Range<String>> i(String tag, int start, int end) {
        List<Range<? extends a>> list = this.annotations;
        if (list == null) {
            return kotlin.collections.m.p();
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Range<? extends a> range = list.get(i);
            if ((range.g() instanceof s) && Intrinsics.e(tag, range.getTag()) && c.j(start, end, range.h(), range.f())) {
                arrayList.add(t.a(range));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final List<Range<z>> k(int start, int end) {
        List listP;
        List<Range<? extends a>> list = this.annotations;
        if (list != null) {
            listP = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Range<? extends a> range = list.get(i);
                Range<? extends a> range2 = range;
                if ((range2.g() instanceof z) && c.j(start, end, range2.h(), range2.f())) {
                    listP.add(range);
                }
            }
        } else {
            listP = kotlin.collections.m.p();
        }
        Intrinsics.h(listP, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
        return listP;
    }

    @r43
    public final List<Range<UrlAnnotation>> l(int start, int end) {
        List listP;
        List<Range<? extends a>> list = this.annotations;
        if (list != null) {
            listP = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Range<? extends a> range = list.get(i);
                Range<? extends a> range2 = range;
                if ((range2.g() instanceof UrlAnnotation) && c.j(start, end, range2.h(), range2.f())) {
                    listP.add(range);
                }
            }
        } else {
            listP = kotlin.collections.m.p();
        }
        Intrinsics.h(listP, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
        return listP;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return d();
    }

    public final boolean m(b other) {
        return Intrinsics.e(this.annotations, other.annotations);
    }

    public final boolean n(int start, int end) {
        List<Range<? extends a>> list = this.annotations;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Range<? extends a> range = list.get(i);
                if ((range.g() instanceof f) && c.j(start, end, range.h(), range.f())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean o(String tag, int start, int end) {
        List<Range<? extends a>> list = this.annotations;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Range<? extends a> range = list.get(i);
                if ((range.g() instanceof s) && Intrinsics.e(tag, range.getTag()) && c.j(start, end, range.h(), range.f())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final b p(Function1<? super Range<? extends a>, ? extends Range<? extends a>> transform) {
        C0062b c0062b = new C0062b(this);
        c0062b.m(transform);
        return c0062b.t();
    }

    public final b q(b other) {
        C0062b c0062b = new C0062b(this);
        c0062b.h(other);
        return c0062b.t();
    }

    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public b subSequence(int startIndex, int endIndex) {
        if (!(startIndex <= endIndex)) {
            ax5.a("start (" + startIndex + ") should be less or equal to end (" + endIndex + ')');
        }
        if (startIndex == 0 && endIndex == this.text.length()) {
            return this;
        }
        String strSubstring = this.text.substring(startIndex, endIndex);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return new b((List<? extends Range<? extends a>>) c.g(this.annotations, startIndex, endIndex), strSubstring);
    }

    public final b s(long range) {
        return subSequence(x.l(range), x.k(range));
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.text;
    }

    /* JADX INFO: renamed from: androidx.compose.ui.text.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002&*B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\tJ%\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010\"\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\"\u0010#J%\u0010&\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b&\u0010'J%\u0010*\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020(2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b,\u0010-J\u0015\u0010/\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020.¢\u0006\u0004\b/\u00100J\u001d\u00101\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\n¢\u0006\u0004\b1\u00102J\u0015\u00105\u001a\u00020\u00032\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u000b¢\u0006\u0004\b7\u00108J\u0015\u0010:\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\u0003¢\u0006\u0004\b:\u0010\u0006J\r\u0010;\u001a\u00020\u0007¢\u0006\u0004\b;\u0010<J3\u0010A\u001a\u00020\u000b2\"\u0010@\u001a\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020?0>\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020?0>0=H\u0000¢\u0006\u0004\bA\u0010BJ9\u0010D\u001a\u00020\u000b2(\u0010@\u001a$\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020?0>\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020?0>0C0=H\u0000¢\u0006\u0004\bD\u0010BR\u0018\u0010\b\u001a\u00060Ej\u0002`F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010GR\"\u0010L\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020J0I0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010KR\"\u0010M\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020?0I0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010KR\u0014\u0010P\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010OR\u0011\u0010S\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bQ\u0010R¨\u0006T"}, d2 = {"Landroidx/compose/ui/text/b$b;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "", "capacity", "<init>", "(I)V", "Landroidx/compose/ui/text/b;", "text", "(Landroidx/compose/ui/text/b;)V", "", "", "j", "(Ljava/lang/String;)V", "", "f", "(Ljava/lang/CharSequence;)Landroidx/compose/ui/text/b$b;", "start", "end", "g", "(Ljava/lang/CharSequence;II)Landroidx/compose/ui/text/b$b;", "", "char", "e", "(C)Landroidx/compose/ui/text/b$b;", "h", "i", "(Landroidx/compose/ui/text/b;II)V", "Landroidx/compose/ui/text/r;", "style", "d", "(Landroidx/compose/ui/text/r;II)V", "tag", "annotation", "c", "(Ljava/lang/String;Ljava/lang/String;II)V", "Landroidx/compose/ui/text/f$b;", "url", "b", "(Landroidx/compose/ui/text/f$b;II)V", "Landroidx/compose/ui/text/f$a;", "clickable", "a", "(Landroidx/compose/ui/text/f$a;II)V", "s", "(Landroidx/compose/ui/text/r;)I", "Landroidx/compose/ui/text/m;", "r", "(Landroidx/compose/ui/text/m;)I", "q", "(Ljava/lang/String;Ljava/lang/String;)I", "Landroidx/compose/ui/text/f;", "link", "p", "(Landroidx/compose/ui/text/f;)I", "n", "()V", "index", "o", "t", "()Landroidx/compose/ui/text/b;", "Lkotlin/Function1;", "Landroidx/compose/ui/text/b$d;", "Landroidx/compose/ui/text/b$a;", "transform", "m", "(Lkotlin/jvm/functions/Function1;)V", "", "k", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Ljava/lang/StringBuilder;", "", "Landroidx/compose/ui/text/b$b$b;", "", "Ljava/util/List;", "styleStack", "annotations", "Landroidx/compose/ui/text/b$b$a;", "Landroidx/compose/ui/text/b$b$a;", "bulletScope", "l", "()I", "length", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C0062b implements Appendable {
        public static final int e = 8;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final StringBuilder text;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<MutableRange<? extends Object>> styleStack;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final List<MutableRange<? extends a>> annotations;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final a bulletScope;

        /* JADX INFO: renamed from: androidx.compose.ui.text.b$b$a */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR,\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/b$b$a;", "", "Landroidx/compose/ui/text/b$b;", "builder", "<init>", "(Landroidx/compose/ui/text/b$b;)V", "a", "Landroidx/compose/ui/text/b$b;", "getBuilder$ui_text", "()Landroidx/compose/ui/text/b$b;", "", "Lkotlin/Pair;", "Lcom/google/android/b0d;", "Landroidx/compose/ui/text/d;", "b", "Ljava/util/List;", "getBulletListSettingStack$ui_text", "()Ljava/util/List;", "bulletListSettingStack", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final C0062b builder;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final List<Pair<b0d, d>> bulletListSettingStack = new ArrayList();

            public a(C0062b c0062b) {
                this.builder = c0062b;
            }
        }

        public C0062b(int i) {
            this.text = new StringBuilder(i);
            this.styleStack = new ArrayList();
            this.annotations = new ArrayList();
            this.bulletScope = new a(this);
        }

        public final void a(f.a clickable, int start, int end) {
            this.annotations.add(new MutableRange<>(clickable, start, end, null, 8, null));
        }

        public final void b(f.b url, int start, int end) {
            this.annotations.add(new MutableRange<>(url, start, end, null, 8, null));
        }

        public final void c(String tag, String annotation, int start, int end) {
            this.annotations.add(new MutableRange<>(s.a(s.b(annotation)), start, end, tag));
        }

        public final void d(SpanStyle style, int start, int end) {
            this.annotations.add(new MutableRange<>(style, start, end, null, 8, null));
        }

        @Override // java.lang.Appendable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public C0062b append(char c) {
            this.text.append(c);
            return this;
        }

        @Override // java.lang.Appendable
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public C0062b append(CharSequence text) {
            if (text instanceof b) {
                h((b) text);
                return this;
            }
            this.text.append(text);
            return this;
        }

        @Override // java.lang.Appendable
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public C0062b append(CharSequence text, int start, int end) {
            if (text instanceof b) {
                i((b) text, start, end);
                return this;
            }
            this.text.append(text, start, end);
            return this;
        }

        public final void h(b text) {
            int length = this.text.length();
            this.text.append(text.getText());
            List<Range<? extends a>> listC = text.c();
            if (listC != null) {
                int size = listC.size();
                for (int i = 0; i < size; i++) {
                    Range<? extends a> range = listC.get(i);
                    this.annotations.add(new MutableRange<>(range.g(), range.h() + length, range.f() + length, range.getTag()));
                }
            }
        }

        public final void i(b text, int start, int end) {
            int length = this.text.length();
            this.text.append((CharSequence) text.getText(), start, end);
            List listI = c.i(text, start, end, null, 4, null);
            if (listI != null) {
                int size = listI.size();
                for (int i = 0; i < size; i++) {
                    Range range = (Range) listI.get(i);
                    this.annotations.add(new MutableRange<>(range.g(), range.h() + length, range.f() + length, range.getTag()));
                }
            }
        }

        public final void j(String text) {
            this.text.append(text);
        }

        public final void k(Function1<? super Range<? extends a>, ? extends List<? extends Range<? extends a>>> transform) {
            List<MutableRange<? extends a>> list = this.annotations;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                List list2 = (List) transform.invoke(MutableRange.c(list.get(i), 0, 1, null));
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    arrayList2.add(MutableRange.INSTANCE.a((Range) list2.get(i2)));
                }
                kotlin.collections.m.G(arrayList, arrayList2);
            }
            this.annotations.clear();
            this.annotations.addAll(arrayList);
        }

        public final int l() {
            return this.text.length();
        }

        public final void m(Function1<? super Range<? extends a>, ? extends Range<? extends a>> transform) {
            int size = this.annotations.size();
            for (int i = 0; i < size; i++) {
                this.annotations.set(i, MutableRange.INSTANCE.a((Range) transform.invoke(MutableRange.c(this.annotations.get(i), 0, 1, null))));
            }
        }

        public final void n() {
            if (this.styleStack.isEmpty()) {
                ax5.c("Nothing to pop.");
            }
            List<MutableRange<? extends Object>> list = this.styleStack;
            list.remove(list.size() - 1).a(this.text.length());
        }

        public final void o(int index) {
            if (!(index < this.styleStack.size())) {
                ax5.c(index + " should be less than " + this.styleStack.size());
            }
            while (this.styleStack.size() - 1 >= index) {
                n();
            }
        }

        public final int p(f link) {
            MutableRange<? extends a> mutableRange = new MutableRange<>(link, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int q(String tag, String annotation) {
            MutableRange<? extends a> mutableRange = new MutableRange<>(s.a(s.b(annotation)), this.text.length(), 0, tag, 4, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int r(ParagraphStyle style) {
            MutableRange<? extends a> mutableRange = new MutableRange<>(style, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int s(SpanStyle style) {
            MutableRange<? extends a> mutableRange = new MutableRange<>(style, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final b t() {
            String string = this.text.toString();
            List<MutableRange<? extends a>> list = this.annotations;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(list.get(i).b(this.text.length()));
            }
            return new b(string, arrayList);
        }

        /* JADX INFO: renamed from: androidx.compose.ui.text.b$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0082\b\u0018\u0000 #*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0017B+\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\b\b\u0002\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u0012R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0012\"\u0004\b\u0017\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0010¨\u0006$"}, d2 = {"Landroidx/compose/ui/text/b$b$b;", "T", "", "item", "", "start", "end", "", "tag", "<init>", "(Ljava/lang/Object;IILjava/lang/String;)V", "defaultEnd", "Landroidx/compose/ui/text/b$d;", "b", "(I)Landroidx/compose/ui/text/b$d;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getItem", "()Ljava/lang/Object;", "I", "getStart", "c", "getEnd", "(I)V", "d", "Ljava/lang/String;", "getTag", "e", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final /* data */ class MutableRange<T> {

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
            private final T item;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
            private final int start;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
            private int end;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
            private final String tag;

            /* JADX INFO: renamed from: androidx.compose.ui.text.b$b$b$a, reason: from kotlin metadata */
            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\"\u0004\b\u0001\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/b$b$b$a;", "", "<init>", "()V", "T", "Landroidx/compose/ui/text/b$d;", "range", "Landroidx/compose/ui/text/b$b$b;", "a", "(Landroidx/compose/ui/text/b$d;)Landroidx/compose/ui/text/b$b$b;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final <T> MutableRange<T> a(Range<T> range) {
                    return new MutableRange<>(range.g(), range.h(), range.f(), range.getTag());
                }

                private Companion() {
                }
            }

            public MutableRange(T t, int i, int i2, String str) {
                this.item = t;
                this.start = i;
                this.end = i2;
                this.tag = str;
            }

            public static /* synthetic */ Range c(MutableRange mutableRange, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = t04.INVALID_ID;
                }
                return mutableRange.b(i);
            }

            public final void a(int i) {
                this.end = i;
            }

            public final Range<T> b(int defaultEnd) {
                int i = this.end;
                if (i != Integer.MIN_VALUE) {
                    defaultEnd = i;
                }
                if (!(defaultEnd != Integer.MIN_VALUE)) {
                    ax5.c("Item.end should be set first");
                }
                return new Range<>(this.item, this.start, defaultEnd, this.tag);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MutableRange)) {
                    return false;
                }
                MutableRange mutableRange = (MutableRange) other;
                return Intrinsics.e(this.item, mutableRange.item) && this.start == mutableRange.start && this.end == mutableRange.end && Intrinsics.e(this.tag, mutableRange.tag);
            }

            public int hashCode() {
                T t = this.item;
                return ((((((t == null ? 0 : t.hashCode()) * 31) + Integer.hashCode(this.start)) * 31) + Integer.hashCode(this.end)) * 31) + this.tag.hashCode();
            }

            public String toString() {
                return "MutableRange(item=" + this.item + ", start=" + this.start + ", end=" + this.end + ", tag=" + this.tag + ')';
            }

            public /* synthetic */ MutableRange(Object obj, int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                this(obj, i, (i3 & 4) != 0 ? t04.INVALID_ID : i2, (i3 & 8) != 0 ? "" : str);
            }
        }

        public /* synthetic */ C0062b(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 16 : i);
        }

        public C0062b(b bVar) {
            this(0, 1, null);
            h(bVar);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.text.b$d, reason: from toString */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B'\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ>\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b \u0010\u0014¨\u0006!"}, d2 = {"Landroidx/compose/ui/text/b$d;", "T", "", "item", "", "start", "end", "", "tag", "<init>", "(Ljava/lang/Object;IILjava/lang/String;)V", "(Ljava/lang/Object;II)V", "a", "()Ljava/lang/Object;", "b", "()I", "c", "d", "(Ljava/lang/Object;IILjava/lang/String;)Landroidx/compose/ui/text/b$d;", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "g", "I", "h", "f", "Ljava/lang/String;", "i", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Range<T> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final T item;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private final int start;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        private final int end;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        private final String tag;

        public Range(T t, int i, int i2, String str) {
            this.item = t;
            this.start = i;
            this.end = i2;
            this.tag = str;
            if (i <= i2) {
                return;
            }
            ax5.a("Reversed range is not supported");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Range e(Range range, Object obj, int i, int i2, String str, int i3, Object obj2) {
            if ((i3 & 1) != 0) {
                obj = range.item;
            }
            if ((i3 & 2) != 0) {
                i = range.start;
            }
            if ((i3 & 4) != 0) {
                i2 = range.end;
            }
            if ((i3 & 8) != 0) {
                str = range.tag;
            }
            return range.d(obj, i, i2, str);
        }

        public final T a() {
            return this.item;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getStart() {
            return this.start;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getEnd() {
            return this.end;
        }

        public final Range<T> d(T item, int start, int end, String tag) {
            return new Range<>(item, start, end, tag);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Range)) {
                return false;
            }
            Range range = (Range) other;
            return Intrinsics.e(this.item, range.item) && this.start == range.start && this.end == range.end && Intrinsics.e(this.tag, range.tag);
        }

        public final int f() {
            return this.end;
        }

        public final T g() {
            return this.item;
        }

        public final int h() {
            return this.start;
        }

        public int hashCode() {
            T t = this.item;
            return ((((((t == null ? 0 : t.hashCode()) * 31) + Integer.hashCode(this.start)) * 31) + Integer.hashCode(this.end)) * 31) + this.tag.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        public String toString() {
            return "Range(item=" + this.item + ", start=" + this.start + ", end=" + this.end + ", tag=" + this.tag + ')';
        }

        public Range(T t, int i, int i2) {
            this(t, i, i2, "");
        }
    }

    public /* synthetic */ b(String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? kotlin.collections.m.p() : list, (i & 4) != 0 ? kotlin.collections.m.p() : list2);
    }

    public b(String str, List<Range<SpanStyle>> list, List<Range<ParagraphStyle>> list2) {
        this((List<? extends Range<? extends a>>) c.e(list, list2), str);
    }

    public /* synthetic */ b(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (List<? extends Range<? extends a>>) ((i & 2) != 0 ? kotlin.collections.m.p() : list));
    }

    public b(String str, List<? extends Range<? extends a>> list) {
        this(list.isEmpty() ? null : list, str);
    }
}
