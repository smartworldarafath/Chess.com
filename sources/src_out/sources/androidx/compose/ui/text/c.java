package androidx.compose.ui.text;

import androidx.compose.ui.text.b;
import androidx.compose.ui.text.c;
import com.google.android.zk1;
import com.google.inputmethod.ax5;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\u001aG\u0010\u0007\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0001\u0018\u00010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00010\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00010\u0000*\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aK\u0010\u0013\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0001\u0018\u00010\u0000*\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a#\u0010\u0015\u001a\u00020\t*\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001aK\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0018\u00010\u0000\"\u0004\b\u0000\u0010\u00172\u0016\u0010\u0018\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\u0018\u00010\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a/\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u000f\u0010!\u001a\u00020\tH\u0000¢\u0006\u0004\b!\u0010\"\"\u0014\u0010%\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"", "Landroidx/compose/ui/text/b$d;", "Landroidx/compose/ui/text/r;", "spanStyles", "Landroidx/compose/ui/text/m;", "paragraphStyles", "Landroidx/compose/ui/text/b$a;", "e", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "Landroidx/compose/ui/text/b;", "defaultParagraphStyle", "k", "(Landroidx/compose/ui/text/b;Landroidx/compose/ui/text/m;)Ljava/util/List;", "", "start", "end", "Lkotlin/Function1;", "", "predicate", "h", "(Landroidx/compose/ui/text/b;IILkotlin/jvm/functions/Function1;)Ljava/util/List;", "l", "(Landroidx/compose/ui/text/b;II)Landroidx/compose/ui/text/b;", "T", "ranges", "g", "(Ljava/util/List;II)Ljava/util/List;", "lStart", "lEnd", "rStart", "rEnd", "j", "(IIII)Z", "f", "()Landroidx/compose/ui/text/b;", "a", "Landroidx/compose/ui/text/b;", "EmptyAnnotatedString", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {
    private static final b a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return zk1.e(Integer.valueOf(((b.Range) t).h()), Integer.valueOf(((b.Range) t2).h()));
        }
    }

    static {
        List list = null;
        a = new b("", list, 2, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<b.Range<? extends b.a>> e(List<b.Range<SpanStyle>> list, List<b.Range<ParagraphStyle>> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        if (list2.isEmpty()) {
            return list;
        }
        if (list.isEmpty()) {
            return list2;
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(list.get(i));
        }
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList.add(list2.get(i2));
        }
        return arrayList;
    }

    public static final b f() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> List<b.Range<T>> g(List<? extends b.Range<? extends T>> list, int i, int i2) {
        if (!(i <= i2)) {
            ax5.a("start (" + i + ") should be less than or equal to end (" + i2 + ')');
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            b.Range<? extends T> range = list.get(i3);
            if (j(i, i2, range.h(), range.f())) {
                arrayList.add(new b.Range(range.g(), Math.max(i, range.h()) - i, Math.min(i2, range.f()) - i, range.getTag()));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    private static final List<b.Range<? extends b.a>> h(b bVar, int i, int i2, Function1<? super b.a, Boolean> function1) {
        List<b.Range<? extends b.a>> listC;
        if (i == i2 || (listC = bVar.c()) == null) {
            return null;
        }
        if (i != 0 || i2 < bVar.getText().length()) {
            ArrayList arrayList = new ArrayList(listC.size());
            int size = listC.size();
            for (int i3 = 0; i3 < size; i3++) {
                b.Range<? extends b.a> range = listC.get(i3);
                if ((function1 != null ? ((Boolean) function1.invoke(range.g())).booleanValue() : true) && j(i, i2, range.h(), range.f())) {
                    arrayList.add(new b.Range(range.g(), kotlin.ranges.g.o(range.h(), i, i2) - i, kotlin.ranges.g.o(range.f(), i, i2) - i, range.getTag()));
                }
            }
            return arrayList;
        }
        if (function1 == null) {
            return listC;
        }
        ArrayList arrayList2 = new ArrayList(listC.size());
        int size2 = listC.size();
        for (int i4 = 0; i4 < size2; i4++) {
            b.Range<? extends b.a> range2 = listC.get(i4);
            if (((Boolean) function1.invoke(range2.g())).booleanValue()) {
                arrayList2.add(range2);
            }
        }
        return arrayList2;
    }

    static /* synthetic */ List i(b bVar, int i, int i2, Function1 function1, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            function1 = null;
        }
        return h(bVar, i, i2, function1);
    }

    public static final boolean j(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }

    public static final List<b.Range<ParagraphStyle>> k(b bVar, ParagraphStyle mVar) {
        List listP;
        List<b.Range<ParagraphStyle>> listF = bVar.f();
        if (listF == null || (listP = kotlin.collections.m.m1(listF, new a())) == null) {
            listP = kotlin.collections.m.p();
        }
        ArrayList arrayList = new ArrayList();
        kotlin.collections.e eVar = new kotlin.collections.e();
        int size = listP.size();
        int iF = 0;
        for (int i = 0; i < size; i++) {
            b.Range range = (b.Range) listP.get(i);
            b.Range rangeE = b.Range.e(range, mVar.l((ParagraphStyle) range.g()), 0, 0, null, 14, null);
            while (iF < rangeE.h() && !eVar.isEmpty()) {
                b.Range range2 = (b.Range) eVar.last();
                if (rangeE.h() < range2.f()) {
                    arrayList.add(new b.Range(range2.g(), iF, rangeE.h()));
                    iF = rangeE.h();
                } else {
                    arrayList.add(new b.Range(range2.g(), iF, range2.f()));
                    iF = range2.f();
                    while (!eVar.isEmpty() && iF == ((b.Range) eVar.last()).f()) {
                        eVar.removeLast();
                    }
                }
            }
            if (iF < rangeE.h()) {
                arrayList.add(new b.Range(mVar, iF, rangeE.h()));
                iF = rangeE.h();
            }
            b.Range range3 = (b.Range) eVar.j();
            if (range3 == null) {
                eVar.add(new b.Range(rangeE.g(), rangeE.h(), rangeE.f()));
            } else if (range3.h() == rangeE.h() && range3.f() == rangeE.f()) {
                eVar.removeLast();
                eVar.add(new b.Range(((ParagraphStyle) range3.g()).l((ParagraphStyle) rangeE.g()), rangeE.h(), rangeE.f()));
            } else if (range3.h() == range3.f()) {
                arrayList.add(new b.Range(range3.g(), range3.h(), range3.f()));
                eVar.removeLast();
                eVar.add(new b.Range(rangeE.g(), rangeE.h(), rangeE.f()));
            } else {
                if (range3.f() < rangeE.f()) {
                    throw new IllegalArgumentException();
                }
                eVar.add(new b.Range(((ParagraphStyle) range3.g()).l((ParagraphStyle) rangeE.g()), rangeE.h(), rangeE.f()));
            }
        }
        while (iF <= bVar.getText().length() && !eVar.isEmpty()) {
            b.Range range4 = (b.Range) eVar.last();
            arrayList.add(new b.Range(range4.g(), iF, range4.f()));
            iF = range4.f();
            while (!eVar.isEmpty() && iF == ((b.Range) eVar.last()).f()) {
                eVar.removeLast();
            }
        }
        if (iF < bVar.getText().length()) {
            arrayList.add(new b.Range(mVar, iF, bVar.getText().length()));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new b.Range(mVar, 0, 0));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b l(b bVar, int i, int i2) {
        String strSubstring;
        if (i != i2) {
            strSubstring = bVar.getText().substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        } else {
            strSubstring = "";
        }
        List<b.Range<? extends b.a>> listH = h(bVar, i, i2, new Function1() { // from class: com.google.android.bs
            public final Object invoke(Object obj) {
                return Boolean.valueOf(c.m((b.a) obj));
            }
        });
        if (listH == null) {
            listH = kotlin.collections.m.p();
        }
        return new b(strSubstring, listH);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(b.a aVar) {
        return !(aVar instanceof ParagraphStyle);
    }
}
