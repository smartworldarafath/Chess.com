package androidx.compose.p004runtime.tooling;

import com.google.inputmethod.gzb;
import com.google.inputmethod.h19;
import com.google.inputmethod.r77;
import com.google.inputmethod.uyd;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.text.h;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n*\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n*\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\r\u001a\u0019\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\n*\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\r\u001a\u0013\u0010\u0011\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"", "data", "Lcom/google/android/gzb;", "e", "(Ljava/lang/String;)Lcom/google/android/gzb;", "f", "Landroidx/compose/runtime/tooling/a;", "", "a", "(Landroidx/compose/runtime/tooling/a;)Z", "", "Lcom/google/android/h19;", "c", "(Landroidx/compose/runtime/tooling/a;)Ljava/util/List;", "d", "Lcom/google/android/r77;", "b", "g", "(Ljava/lang/String;)Ljava/lang/String;", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {
    private static final boolean a(a aVar) {
        return aVar.getI() < aVar.getData().length() - 1 && Character.isLetter(aVar.getData().charAt(aVar.getI())) && aVar.getData().charAt(aVar.getI() + 1) == '(';
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private static final List<r77> b(a aVar) throws ParseException, KotlinNothingValueException {
        boolean z;
        Integer numValueOf;
        ArrayList arrayList = new ArrayList();
        while (!aVar.c() && !aVar.h(':')) {
            if (aVar.h('*')) {
                a.b(aVar, 0, 1, null);
                z = true;
            } else {
                z = false;
            }
            Integer numValueOf2 = !aVar.h('@') ? Integer.valueOf(aVar.j("@") + 1) : null;
            a.b(aVar, 0, 1, null);
            int iJ = aVar.j("L,:");
            if (aVar.h('L')) {
                a.b(aVar, 0, 1, null);
                numValueOf = Integer.valueOf(aVar.j(",:"));
            } else {
                numValueOf = null;
            }
            arrayList.add(new r77(numValueOf2 != null ? numValueOf2.intValue() : -1, iJ, numValueOf != null ? numValueOf.intValue() : -1, z));
            if (aVar.h(',')) {
                a.b(aVar, 0, 1, null);
            }
        }
        a.b(aVar, 0, 1, null);
        return arrayList;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private static final List<h19> c(a aVar) throws ParseException, KotlinNothingValueException {
        String strG;
        aVar.a(2);
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        while (!aVar.c() && !aVar.h(')')) {
            if (aVar.h('!')) {
                a.b(aVar, 0, 1, null);
                String strK = aVar.k("!,)");
                if (strK.length() != 0) {
                    int i = Integer.parseInt(strK);
                    int i2 = 0;
                    while (i > 0) {
                        int size = arrayList.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size) {
                                arrayList.add(new h19(i2, null, null, 6, null));
                                i--;
                                break;
                            }
                            if (((h19) arrayList.get(i3)).getSortedIndex() == i2) {
                                i2++;
                                break;
                            }
                            i3++;
                        }
                    }
                } else {
                    z = true;
                }
            } else {
                int iJ = aVar.j("!:,)");
                if (aVar.h(':')) {
                    a.b(aVar, 0, 1, null);
                    strG = g(aVar.k("!,)"));
                } else {
                    strG = null;
                }
                if (z) {
                    int i4 = 0;
                    while (i4 < iJ) {
                        int size2 = arrayList.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= size2) {
                                arrayList.add(new h19(i4, null, null, 6, null));
                                break;
                            }
                            if (((h19) arrayList.get(i5)).getSortedIndex() == i4) {
                                i4++;
                                break;
                            }
                            i5++;
                        }
                    }
                    z = false;
                }
                arrayList.add(new h19(iJ, null, strG, 2, null));
            }
            if (aVar.h(',')) {
                a.b(aVar, 0, 1, null);
            }
        }
        aVar.e(')');
        a.b(aVar, 0, 1, null);
        return arrayList;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private static final List<h19> d(a aVar) throws ParseException, KotlinNothingValueException {
        String strG;
        aVar.a(2);
        ArrayList arrayList = new ArrayList();
        while (!aVar.c() && !aVar.h(')')) {
            String strK = aVar.k(":,)");
            if (aVar.h(':')) {
                a.b(aVar, 0, 1, null);
                strG = g(aVar.k(",)"));
            } else {
                strG = null;
            }
            arrayList.add(new h19(arrayList.size(), strK, strG));
            if (aVar.h(',')) {
                a.b(aVar, 0, 1, null);
            }
        }
        aVar.e(')');
        a.b(aVar, 0, 1, null);
        return arrayList;
    }

    public static final gzb e(String str) {
        if (str.length() == 0) {
            return null;
        }
        try {
            return f(str);
        } catch (ParseException e) {
            uyd.a(e.getMessage(), e);
            return null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Code duplicated, block: B:17:0x004a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0071  */
    /* JADX WARN: Code duplicated, block: B:31:0x0077  */
    /* JADX WARN: Code duplicated, block: B:32:0x007a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0080  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0052 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0082 A[SYNTHETIC] */
    public static final gzb f(String str) throws ParseException, KotlinNothingValueException {
        boolean z;
        boolean z2;
        String strK;
        List<h19> listP;
        List<r77> listP2;
        String strK2;
        char cD;
        int i;
        a aVar = new a(str);
        String strL = null;
        if (aVar.h('C')) {
            a.b(aVar, 0, 1, null);
            if (aVar.h('C')) {
                a.b(aVar, 0, 1, null);
                z = true;
            } else {
                z = false;
            }
            if (aVar.h('(')) {
                a.b(aVar, 0, 1, null);
                strK = aVar.k(")");
                aVar.e(')');
                a.b(aVar, 0, 1, null);
                z2 = true;
            } else {
                z2 = true;
            }
            listP = m.p();
            while (a(aVar)) {
                cD = aVar.d();
                if (cD != 'N') {
                    listP = d(aVar);
                } else if (cD != 'P') {
                    aVar.a(2);
                    i = 0;
                    while (true) {
                        if (i > 0 && aVar.h(')')) {
                            aVar.e(')');
                            a.b(aVar, 0, 1, null);
                            break;
                        }
                        if (!aVar.c()) {
                            aVar.m("unexpected end");
                            throw new KotlinNothingValueException();
                        }
                        if (aVar.h('(')) {
                            i++;
                        } else if (aVar.h(')')) {
                            i--;
                        }
                        a.b(aVar, 0, 1, null);
                    }
                } else {
                    listP = c(aVar);
                }
            }
            listP2 = m.p();
            if (aVar.h(':')) {
                a.b(aVar, 0, 1, null);
            } else {
                listP2 = b(aVar);
            }
            strK2 = aVar.k("#");
            if (strK2.length() <= 0) {
                strK2 = null;
            }
            if (aVar.h('#')) {
                a.b(aVar, 0, 1, null);
                strL = aVar.l();
            }
            String str2 = strK2;
            return new gzb(z2, z, strK, str2, listP, strL, listP2, str);
        }
        z = false;
        z2 = false;
        strK = null;
        listP = m.p();
        while (a(aVar)) {
            cD = aVar.d();
            if (cD != 'N') {
                listP = d(aVar);
            } else if (cD != 'P') {
                aVar.a(2);
                i = 0;
                while (true) {
                    if (i > 0) {
                    }
                    if (!aVar.c()) {
                        aVar.m("unexpected end");
                        throw new KotlinNothingValueException();
                    }
                    if (aVar.h('(')) {
                        i++;
                    } else if (aVar.h(')')) {
                        i--;
                    }
                    a.b(aVar, 0, 1, null);
                }
            } else {
                listP = c(aVar);
            }
        }
        listP2 = m.p();
        if (aVar.h(':')) {
            listP2 = b(aVar);
        } else {
            a.b(aVar, 0, 1, null);
        }
        strK2 = aVar.k("#");
        if (strK2.length() <= 0) {
            strK2 = null;
        }
        if (aVar.h('#')) {
            a.b(aVar, 0, 1, null);
            strL = aVar.l();
        }
        String str3 = strK2;
        return new gzb(z2, z, strK, str3, listP, strL, listP2, str);
    }

    private static final String g(String str) {
        return h.V(str, "c#", "androidx.compose.", false, 4, (Object) null);
    }
}
