package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.b;
import com.google.android.ps4;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\u001aa\u0010\r\u001a:\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t0\u0006\u0012 \u0012\u001e\u0012\u001a\u0012\u0018\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n0\u0007j\u0002`\f0\u00060\u0005*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u0000H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a;\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00002\"\u0010\u0013\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n0\u0007j\u0002`\f0\u0006H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\"L\u0010\u0018\u001a:\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t0\u0006\u0012 \u0012\u001e\u0012\u001a\u0012\u0018\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n0\u0007j\u0002`\f0\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017*\u0018\b\u0000\u0010\u0019\"\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0012\u0004\u0012\u00020\b0\u0007*0\b\u0000\u0010\u001a\"\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n0\u00072\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n0\u0007¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/text/b;", "", "", "Lcom/google/android/nx5;", "inlineContent", "Lkotlin/Pair;", "", "Landroidx/compose/ui/text/b$d;", "Lcom/google/android/v99;", "Landroidx/compose/foundation/text/PlaceholderRange;", "Lkotlin/Function1;", "", "Landroidx/compose/foundation/text/InlineContentRange;", "e", "(Landroidx/compose/ui/text/b;Ljava/util/Map;)Lkotlin/Pair;", "", "d", "(Landroidx/compose/ui/text/b;)Z", "text", "inlineContents", "b", "(Landroidx/compose/ui/text/b;Ljava/util/List;Landroidx/compose/runtime/d;I)V", "a", "Lkotlin/Pair;", "EmptyInlineContent", "PlaceholderRange", "InlineContentRange", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class es {
    private static final Pair<List<b.Range<Placeholder>>, List<b.Range<ps4<String, d, Integer, Unit>>>> a = new Pair<>(m.p(), m.p());

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements ej7 {
        public static final a a = new a();

        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit b(List list, o.a aVar) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                o.a.L(aVar, (o) list.get(i), 0, 0, 0.0f, 4, null);
            }
            return Unit.a;
        }

        @Override // com.google.inputmethod.ej7
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final fj7 mo0measure3p2s80s(j jVar, List<? extends dj7> list, long j) {
            final ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(list.get(i).r0(j));
            }
            return j.Q1(jVar, kx1.l(j), kx1.k(j), null, new Function1() { // from class: com.google.android.ds
                public final Object invoke(Object obj) {
                    return es.a.b(arrayList, (o.a) obj);
                }
            }, 4, null);
        }
    }

    public static final void b(final b bVar, final List<b.Range<ps4<String, d, Integer, Unit>>> list, d dVar, final int i) {
        int i2;
        d dVarF = dVar.F(-1794596951);
        if ((i & 6) == 0) {
            i2 = (dVarF.x(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dVarF.T(list) ? 32 : 16;
        }
        int i3 = 0;
        if (dVarF.g((i2 & 19) != 18, i2 & 1)) {
            if (e.k()) {
                e.o(-1794596951, i2, -1, "androidx.compose.foundation.text.InlineChildren (AnnotatedStringResolveInlineContent.kt:67)");
            }
            int size = list.size();
            int i4 = 0;
            while (i4 < size) {
                b.Range<ps4<String, d, Integer, Unit>> range = list.get(i4);
                ps4<String, d, Integer, Unit> ps4VarA = range.a();
                int start = range.getStart();
                int end = range.getEnd();
                Object objR = dVarF.R();
                if (objR == d.INSTANCE.a()) {
                    objR = a.a;
                    dVarF.L(objR);
                }
                ej7 ej7Var = (ej7) objR;
                androidx.compose.ui.b.Companion companion = androidx.compose.ui.b.INSTANCE;
                int iHashCode = Long.hashCode(pp1.b(dVarF, i3));
                gs1 gs1VarJ = dVarF.j();
                androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVarF, companion);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> function0B = companion2.b();
                if (dVarF.G() == null) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.getInserting()) {
                    dVarF.W(function0B);
                } else {
                    dVarF.k();
                }
                d dVarC = dud.c(dVarF);
                int i5 = i3;
                dud.i(dVarC, ej7Var, companion2.d());
                dud.i(dVarC, gs1VarJ, companion2.f());
                dud.i(dVarC, Integer.valueOf(iHashCode), companion2.c());
                dud.g(dVarC, companion2.a());
                dud.i(dVarC, bVarE, companion2.e());
                ps4VarA.invoke(bVar.subSequence(start, end).getText(), dVarF, Integer.valueOf(i5));
                dVarF.m();
                i4++;
                i3 = i5;
            }
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.cs
                public final Object invoke(Object obj, Object obj2) {
                    return es.c(bVar, list, i, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(b bVar, List list, int i, d dVar, int i2) {
        b(bVar, list, dVar, saa.a(i | 1));
        return Unit.a;
    }

    public static final boolean d(b bVar) {
        return bVar.o("androidx.compose.foundation.text.inlineContent", 0, bVar.getText().length());
    }

    public static final Pair<List<b.Range<Placeholder>>, List<b.Range<ps4<String, d, Integer, Unit>>>> e(b bVar, Map<String, nx5> map) {
        if (map == null || map.isEmpty()) {
            return a;
        }
        List<b.Range<String>> listI = bVar.i("androidx.compose.foundation.text.inlineContent", 0, bVar.getText().length());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = listI.size();
        for (int i = 0; i < size; i++) {
            b.Range<String> range = listI.get(i);
            nx5 nx5Var = map.get(range.g());
            if (nx5Var != null) {
                arrayList.add(new b.Range(nx5Var.getPlaceholder(), range.h(), range.f()));
                arrayList2.add(new b.Range(nx5Var.a(), range.h(), range.f()));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }
}
