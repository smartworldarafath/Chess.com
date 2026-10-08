package androidx.compose.p004runtime;

import com.google.inputmethod.JoinedKey;
import com.google.inputmethod.ei9;
import com.google.inputmethod.k58;
import com.google.inputmethod.o48;
import com.google.inputmethod.q38;
import com.google.inputmethod.rn0;
import com.google.inputmethod.ti6;
import com.google.inputmethod.v15;
import com.google.inputmethod.w15;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010!\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0005¢\u0006\u0004\b!\u0010\"J!\u0010&\u001a\u00020\u000e2\n\u0010$\u001a\u00060\u0005j\u0002`#2\u0006\u0010%\u001a\u00020\u0005¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b*\u0010)J\u0015\u0010+\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b+\u0010)R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b.\u00100\u001a\u0004\b1\u00102R\"\u00105\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00100\u001a\u0004\b,\u00102\"\u0004\b4\u0010\u0018R\u0014\u00108\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00107R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010-R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020;0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R'\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030?8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010@\u001a\u0004\b3\u0010AR\u0017\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00030C8F¢\u0006\u0006\u001a\u0004\b<\u0010/¨\u0006E"}, d2 = {"Landroidx/compose/runtime/u;", "", "", "Lcom/google/android/ti6;", "keyInfos", "", "startIndex", "<init>", "(Ljava/util/List;I)V", "key", "dataKey", "d", "(ILjava/lang/Object;)Lcom/google/android/ti6;", "keyInfo", "", "j", "(Lcom/google/android/ti6;)Z", "", "Landroidx/compose/runtime/composer/linkbuffer/GroupHandle;", "g", "()J", "index", "", "h", "(I)V", "from", "to", "m", "(II)V", "count", "l", "(III)V", "insertIndex", "k", "(Lcom/google/android/ti6;I)V", "Landroidx/compose/runtime/composer/linkbuffer/GroupAddress;", "group", "newCount", "p", "(II)Z", "o", "(Lcom/google/android/ti6;)I", "i", "q", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "I", "e", "()I", "c", "n", "groupIndex", "Lcom/google/android/rn0;", "Lcom/google/android/rn0;", "placedGroups", "usedKeys", "Lcom/google/android/o48;", "Lcom/google/android/w15;", "f", "Lcom/google/android/o48;", "groupInfos", "Lcom/google/android/q38;", "Lkotlin/Lazy;", "()Lcom/google/android/k58;", "keyMap", "", "used", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<ti6> keyInfos;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int startIndex;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int groupIndex;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final rn0 placedGroups = new rn0();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<ti6> usedKeys;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final o48<w15> groupInfos;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy keyMap;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function0<q38<Object, ti6>> {
        a() {
        }

        public final k58<Object, Object> a() {
            k58<Object, Object> k58VarU = t.u(u.this.b().size());
            u uVar = u.this;
            int size = uVar.b().size();
            for (int i = 0; i < size; i++) {
                ti6 ti6Var = uVar.b().get(i);
                q38.a(k58VarU, ti6Var.c(), ti6Var);
            }
            return k58VarU;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return q38.b(a());
        }
    }

    public u(List<ti6> list, int i) {
        this.keyInfos = list;
        this.startIndex = i;
        if (!(i >= 0)) {
            ei9.a("Invalid start index");
        }
        this.usedKeys = new ArrayList();
        o48<w15> o48Var = new o48<>(0, 1, null);
        int size = list.size();
        int nodes = 0;
        for (int i2 = 0; i2 < size; i2++) {
            ti6 ti6Var = this.keyInfos.get(i2);
            o48Var.r(v15.b(ti6Var.getHandle()), new w15(i2, nodes, ti6Var.getNodes()));
            nodes += ti6Var.getNodes();
        }
        this.groupInfos = o48Var;
        this.keyMap = c.b(new a());
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getGroupIndex() {
        return this.groupIndex;
    }

    public final List<ti6> b() {
        return this.keyInfos;
    }

    public final k58<Object, Object> c() {
        return ((q38) this.keyMap.getValue()).getMap();
    }

    public final ti6 d(int key, Object dataKey) {
        return (ti6) q38.l(c(), dataKey != null ? new JoinedKey(Integer.valueOf(key), dataKey) : Integer.valueOf(key));
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getStartIndex() {
        return this.startIndex;
    }

    public final List<ti6> f() {
        return this.usedKeys;
    }

    public final long g() {
        return this.keyInfos.get(this.placedGroups.c(0)).getHandle();
    }

    public final void h(int index) {
        this.placedGroups.d(index, true);
    }

    public final int i(ti6 keyInfo) {
        w15 w15VarB = this.groupInfos.b(v15.b(keyInfo.getHandle()));
        if (w15VarB != null) {
            return w15VarB.getNodeIndex();
        }
        return -1;
    }

    public final boolean j(ti6 keyInfo) {
        return this.usedKeys.add(keyInfo);
    }

    public final void k(ti6 keyInfo, int insertIndex) {
        this.groupInfos.r(v15.b(keyInfo.getHandle()), new w15(-1, insertIndex, 0));
    }

    public final void l(int from, int to, int count) {
        char c;
        long j;
        char c2;
        long j2;
        char c3 = 7;
        long j3 = -9187201950435737472L;
        if (from > to) {
            o48<w15> o48Var = this.groupInfos;
            Object[] objArr = o48Var.values;
            long[] jArr = o48Var.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i = 0;
            while (true) {
                long j4 = jArr[i];
                if ((((~j4) << c3) & j4 & j3) != j3) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    int i3 = 0;
                    while (i3 < i2) {
                        if ((j4 & 255) < 128) {
                            c2 = c3;
                            w15 w15Var = (w15) objArr[(i << 3) + i3];
                            j2 = j3;
                            int nodeIndex = w15Var.getNodeIndex();
                            if (from <= nodeIndex && nodeIndex < from + count) {
                                w15Var.e((nodeIndex - from) + to);
                            } else if (to <= nodeIndex && nodeIndex < from) {
                                w15Var.e(nodeIndex + count);
                            }
                        } else {
                            c2 = c3;
                            j2 = j3;
                        }
                        j4 >>= 8;
                        i3++;
                        c3 = c2;
                        j3 = j2;
                    }
                    c = c3;
                    j = j3;
                    if (i2 != 8) {
                        return;
                    }
                } else {
                    c = c3;
                    j = j3;
                }
                if (i == length) {
                    return;
                }
                i++;
                c3 = c;
                j3 = j;
            }
        } else {
            if (to <= from) {
                return;
            }
            o48<w15> o48Var2 = this.groupInfos;
            Object[] objArr2 = o48Var2.values;
            long[] jArr2 = o48Var2.metadata;
            int length2 = jArr2.length - 2;
            if (length2 < 0) {
                return;
            }
            int i4 = 0;
            while (true) {
                long j5 = jArr2[i4];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j5 & 255) < 128) {
                            w15 w15Var2 = (w15) objArr2[(i4 << 3) + i6];
                            int nodeIndex2 = w15Var2.getNodeIndex();
                            if (from <= nodeIndex2 && nodeIndex2 < from + count) {
                                w15Var2.e((nodeIndex2 - from) + to);
                            } else if (from + 1 <= nodeIndex2 && nodeIndex2 < to) {
                                w15Var2.e(nodeIndex2 - count);
                            }
                        }
                        j5 >>= 8;
                    }
                    if (i5 != 8) {
                        return;
                    }
                }
                if (i4 == length2) {
                    return;
                } else {
                    i4++;
                }
            }
        }
    }

    public final void m(int from, int to) {
        char c;
        long j;
        char c2;
        long j2;
        char c3 = 7;
        long j3 = -9187201950435737472L;
        if (from > to) {
            o48<w15> o48Var = this.groupInfos;
            Object[] objArr = o48Var.values;
            long[] jArr = o48Var.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i = 0;
            while (true) {
                long j4 = jArr[i];
                if ((((~j4) << c3) & j4 & j3) != j3) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    int i3 = 0;
                    while (i3 < i2) {
                        if ((j4 & 255) < 128) {
                            c2 = c3;
                            w15 w15Var = (w15) objArr[(i << 3) + i3];
                            j2 = j3;
                            int slotIndex = w15Var.getSlotIndex();
                            if (slotIndex == from) {
                                w15Var.f(to);
                            } else if (to <= slotIndex && slotIndex < from) {
                                w15Var.f(slotIndex + 1);
                            }
                        } else {
                            c2 = c3;
                            j2 = j3;
                        }
                        j4 >>= 8;
                        i3++;
                        c3 = c2;
                        j3 = j2;
                    }
                    c = c3;
                    j = j3;
                    if (i2 != 8) {
                        return;
                    }
                } else {
                    c = c3;
                    j = j3;
                }
                if (i == length) {
                    return;
                }
                i++;
                c3 = c;
                j3 = j;
            }
        } else {
            if (to <= from) {
                return;
            }
            o48<w15> o48Var2 = this.groupInfos;
            Object[] objArr2 = o48Var2.values;
            long[] jArr2 = o48Var2.metadata;
            int length2 = jArr2.length - 2;
            if (length2 < 0) {
                return;
            }
            int i4 = 0;
            while (true) {
                long j5 = jArr2[i4];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j5 & 255) < 128) {
                            w15 w15Var2 = (w15) objArr2[(i4 << 3) + i6];
                            int slotIndex2 = w15Var2.getSlotIndex();
                            if (slotIndex2 == from) {
                                w15Var2.f(to);
                            } else if (from + 1 <= slotIndex2 && slotIndex2 < to) {
                                w15Var2.f(slotIndex2 - 1);
                            }
                        }
                        j5 >>= 8;
                    }
                    if (i5 != 8) {
                        return;
                    }
                }
                if (i4 == length2) {
                    return;
                } else {
                    i4++;
                }
            }
        }
    }

    public final void n(int i) {
        this.groupIndex = i;
    }

    public final int o(ti6 keyInfo) {
        w15 w15VarB = this.groupInfos.b(v15.b(keyInfo.getHandle()));
        if (w15VarB != null) {
            return w15VarB.getSlotIndex();
        }
        return -1;
    }

    public final boolean p(int group, int newCount) {
        int nodeIndex;
        w15 w15VarB = this.groupInfos.b(group);
        if (w15VarB == null) {
            return false;
        }
        int nodeIndex2 = w15VarB.getNodeIndex();
        int nodeCount = newCount - w15VarB.getNodeCount();
        w15VarB.d(newCount);
        if (nodeCount == 0) {
            return true;
        }
        o48<w15> o48Var = this.groupInfos;
        Object[] objArr = o48Var.values;
        long[] jArr = o48Var.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        w15 w15Var = (w15) objArr[(i << 3) + i3];
                        if (w15Var.getNodeIndex() >= nodeIndex2 && !Intrinsics.e(w15Var, w15VarB) && (nodeIndex = w15Var.getNodeIndex() + nodeCount) >= 0) {
                            w15Var.e(nodeIndex);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final int q(ti6 keyInfo) {
        w15 w15VarB = this.groupInfos.b(v15.b(keyInfo.getHandle()));
        return w15VarB != null ? w15VarB.getNodeCount() : keyInfo.getNodes();
    }
}
