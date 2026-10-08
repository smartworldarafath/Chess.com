package com.google.inputmethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.b0;
import kotlin.collections.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B9\u0012\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0018\u00010\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00032\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00040\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019R*\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR2\u0010\u001d\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00120\u001c\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/google/android/rya;", "Lcom/google/android/qya;", "", "", "", "", "restored", "Lkotlin/Function1;", "", "canBeSaved", "<init>", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V", "value", "a", "(Ljava/lang/Object;)Z", "key", "f", "(Ljava/lang/String;)Ljava/lang/Object;", "Lkotlin/Function0;", "valueProvider", "Lcom/google/android/qya$a;", "b", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Lcom/google/android/qya$a;", "c", "()Ljava/util/Map;", "Lkotlin/jvm/functions/Function1;", "Lcom/google/android/k58;", "Lcom/google/android/k58;", "", "valueProviders", "runtime-saveable"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class rya implements qya {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Function1<Object, Boolean> canBeSaved;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final k58<String, List<Object>> restored;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private k58<String, List<Function0<Object>>> valueProviders;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/google/android/rya$a", "Lcom/google/android/qya$a;", "", "a", "()V", "runtime-saveable"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements qya.a {
        final /* synthetic */ k58<String, List<Function0<Object>>> a;
        final /* synthetic */ String b;
        final /* synthetic */ Function0<Object> c;

        a(k58<String, List<Function0<Object>>> k58Var, String str, Function0<? extends Object> function0) {
            this.a = k58Var;
            this.b = str;
            this.c = function0;
        }

        @Override // com.google.android.qya.a
        public void a() {
            List<Function0<Object>> listU = this.a.u(this.b);
            if (listU != null) {
                listU.remove(this.c);
            }
            if (listU == null || listU.isEmpty()) {
                return;
            }
            this.a.x(this.b, listU);
        }
    }

    public rya(Map<String, ? extends List<? extends Object>> map, Function1<Object, Boolean> function1) {
        this.canBeSaved = function1;
        this.restored = (map == null || map.isEmpty()) ? null : tya.h(map);
    }

    @Override // com.google.inputmethod.qya
    public boolean a(Object value) {
        return ((Boolean) this.canBeSaved.invoke(value)).booleanValue();
    }

    @Override // com.google.inputmethod.qya
    public qya.a b(String key, Function0<? extends Object> valueProvider) {
        if (tya.f(key)) {
            throw new IllegalArgumentException("Registered key is empty or blank");
        }
        k58<String, List<Function0<Object>>> k58VarC = this.valueProviders;
        if (k58VarC == null) {
            k58VarC = k4b.c();
            this.valueProviders = k58VarC;
        }
        List<Function0<Object>> listE = k58VarC.e(key);
        if (listE == null) {
            listE = new ArrayList<>();
            k58VarC.x(key, listE);
        }
        listE.add(valueProvider);
        return new a(k58VarC, key, valueProvider);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0096  */
    @Override // com.google.inputmethod.qya
    public Map<String, List<Object>> c() {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        k58<String, List<Object>> k58Var = this.restored;
        if (k58Var == null && this.valueProviders == null) {
            return b0.j();
        }
        int i3 = 0;
        int i4 = k58Var != null ? k58Var.get_size() : 0;
        k58<String, List<Function0<Object>>> k58Var2 = this.valueProviders;
        HashMap map = new HashMap(i4 + (k58Var2 != null ? k58Var2.get_size() : 0));
        k58<String, List<Object>> k58Var3 = this.restored;
        char c2 = 7;
        long j4 = -9187201950435737472L;
        int i5 = 8;
        if (k58Var3 != null) {
            Object[] objArr = k58Var3.keys;
            Object[] objArr2 = k58Var3.values;
            long[] jArr3 = k58Var3.metadata;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                j2 = 128;
                while (true) {
                    long j5 = jArr3[i6];
                    j3 = 255;
                    if ((((~j5) << c2) & j5 & j4) != j4) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j5 & 255) < 128) {
                                int i9 = (i6 << 3) + i8;
                                map.put((String) objArr[i9], (List) objArr2[i9]);
                            }
                            j5 >>= 8;
                            i8++;
                            c2 = c2;
                            j4 = j4;
                        }
                        c = c2;
                        j = j4;
                        if (i7 != 8) {
                            break;
                        }
                    } else {
                        c = c2;
                        j = j4;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c2 = c;
                    j4 = j;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 128;
                j3 = 255;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 128;
            j3 = 255;
        }
        k58<String, List<Function0<Object>>> k58Var4 = this.valueProviders;
        if (k58Var4 != null) {
            Object[] objArr3 = k58Var4.keys;
            Object[] objArr4 = k58Var4.values;
            long[] jArr4 = k58Var4.metadata;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i10 = 0;
                while (true) {
                    long j6 = jArr4[i10];
                    if ((((~j6) << c) & j6 & j) != j) {
                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                        int i12 = i3;
                        while (i12 < i11) {
                            if ((j6 & j3) < j2) {
                                int i13 = (i10 << 3) + i12;
                                Object obj = objArr3[i13];
                                List list = (List) objArr4[i13];
                                String str = (String) obj;
                                i2 = i5;
                                if (list.size() == 1) {
                                    Object objInvoke = ((Function0) list.get(i3)).invoke();
                                    if (objInvoke != null) {
                                        if (!a(objInvoke)) {
                                            throw new IllegalStateException(dfa.e(objInvoke).toString());
                                        }
                                        map.put(str, m.i(new Object[]{objInvoke}));
                                    }
                                    jArr2 = jArr4;
                                } else {
                                    int size = list.size();
                                    ArrayList arrayList = new ArrayList(size);
                                    while (i3 < size) {
                                        long[] jArr5 = jArr4;
                                        Object objInvoke2 = ((Function0) list.get(i3)).invoke();
                                        if (objInvoke2 != null && !a(objInvoke2)) {
                                            throw new IllegalStateException(dfa.e(objInvoke2).toString());
                                        }
                                        arrayList.add(objInvoke2);
                                        i3++;
                                        jArr4 = jArr5;
                                    }
                                    jArr2 = jArr4;
                                    map.put(str, arrayList);
                                }
                            } else {
                                jArr2 = jArr4;
                                i2 = i5;
                            }
                            j6 >>= i2;
                            i12++;
                            i5 = i2;
                            jArr4 = jArr2;
                            i3 = 0;
                        }
                        jArr = jArr4;
                        i = i5;
                        if (i11 != i) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i = i5;
                    }
                    if (i10 == length2) {
                        break;
                    }
                    i10++;
                    i5 = i;
                    jArr4 = jArr;
                    i3 = 0;
                }
            }
        }
        return map;
    }

    @Override // com.google.inputmethod.qya
    public Object f(String key) {
        k58<String, List<Object>> k58Var;
        k58<String, List<Object>> k58Var2 = this.restored;
        List<Object> listU = k58Var2 != null ? k58Var2.u(key) : null;
        if (listU == null || listU.isEmpty()) {
            return null;
        }
        if (listU.size() > 1 && (k58Var = this.restored) != null) {
            k58Var.r(key, listU.subList(1, listU.size()));
        }
        return listU.get(0);
    }
}
