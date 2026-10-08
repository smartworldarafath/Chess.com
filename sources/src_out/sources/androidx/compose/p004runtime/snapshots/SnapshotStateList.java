package androidx.compose.p004runtime.snapshots;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.p004runtime.snapshots.SnapshotStateList;
import com.google.android.jh6;
import com.google.android.zh1;
import com.google.inputmethod.a7c;
import com.google.inputmethod.c7c;
import com.google.inputmethod.ei9;
import com.google.inputmethod.i79;
import com.google.inputmethod.ixb;
import com.google.inputmethod.j24;
import com.google.inputmethod.kcc;
import com.google.inputmethod.t6c;
import com.google.inputmethod.v6c;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0010+\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 R*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00060\u0005j\u0002`\u0006:\u0001RB\u0017\b\u0000\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nB\t\b\u0016¢\u0006\u0004\b\t\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\"\u0010#J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b'\u0010!J\u0015\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0016¢\u0006\u0004\b)\u0010*J\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b)\u0010+J%\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u001cH\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b3\u0010\u0017J\u001f\u00103\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b3\u00104J%\u00105\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b5\u00106J\u001d\u00105\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b5\u0010\u001bJ\u000f\u00107\u001a\u00020\u000eH\u0016¢\u0006\u0004\b7\u0010\u000bJ\u0017\u00108\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b8\u0010\u0017J\u001d\u00109\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b9\u0010\u001bJ\u0017\u0010:\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b:\u0010\u001fJ\u001d\u0010;\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b;\u0010\u001bJ \u0010<\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b<\u0010=J\u001d\u0010>\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u001c¢\u0006\u0004\b>\u0010?J-\u0010B\u001a\u00020\u001c2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010@\u001a\u00020\u001c2\u0006\u0010A\u001a\u00020\u001cH\u0000¢\u0006\u0004\bB\u0010CJ\u001f\u0010G\u001a\u00020\u000e2\u0006\u0010E\u001a\u00020D2\u0006\u0010F\u001a\u00020\u001cH\u0016¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u001cH\u0016¢\u0006\u0004\bI\u0010JR$\u0010O\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0014\u0010Q\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010J¨\u0006S"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList;", "T", "Landroid/os/Parcelable;", "Lcom/google/android/a7c;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lcom/google/android/i79;", "persistentList", "<init>", "(Lcom/google/android/i79;)V", "()V", "Lcom/google/android/c7c;", "value", "", "x", "(Lcom/google/android/c7c;)V", "", "r", "()Ljava/util/List;", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "add", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "remove", "removeAll", "i", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "j", "(II)V", "start", "end", "o", "(Ljava/util/Collection;II)I", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "Lcom/google/android/c7c;", "t", "()Lcom/google/android/c7c;", "firstStateRecord", "f", "size", "b", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SnapshotStateList<T> implements Parcelable, a7c, List<T>, RandomAccess, jh6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private c7c firstStateRecord;
    public static final Parcelable.Creator<SnapshotStateList<Object>> CREATOR = new a();

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001J)\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000f\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"androidx/compose/runtime/snapshots/SnapshotStateList$a", "Landroid/os/Parcelable$ClassLoaderCreator;", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "", "Landroid/os/Parcel;", "parcel", "Ljava/lang/ClassLoader;", "loader", "c", "(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/compose/runtime/snapshots/SnapshotStateList;", "b", "(Landroid/os/Parcel;)Landroidx/compose/runtime/snapshots/SnapshotStateList;", "", "size", "", "e", "(I)[Landroidx/compose/runtime/snapshots/SnapshotStateList;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.ClassLoaderCreator<SnapshotStateList<Object>> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object d(Parcel parcel, ClassLoader classLoader, int i) {
            return parcel.readValue(classLoader);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SnapshotStateList<Object> createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public SnapshotStateList<Object> createFromParcel(final Parcel parcel, final ClassLoader loader) {
            if (loader == null) {
                loader = a.class.getClassLoader();
            }
            return ixb.a(parcel.readInt(), new Function1() { // from class: com.google.android.hxb
                public final Object invoke(Object obj) {
                    return SnapshotStateList.a.d(parcel, loader, ((Integer) obj).intValue());
                }
            });
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public SnapshotStateList<Object>[] newArray(int size) {
            return new SnapshotStateList[size];
        }
    }

    public SnapshotStateList(i79<? extends T> i79Var) {
        this.firstStateRecord = ixb.l(this, i79Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(int i, Collection collection, List list) {
        return list.addAll(i, collection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(Collection collection, List list) {
        return list.retainAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T element) {
        int iK;
        i79<T> i79VarJ;
        g gVarC;
        boolean zF;
        do {
            synchronized (ixb.a) {
                c7c firstStateRecord = getFirstStateRecord();
                Intrinsics.h(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                v6c v6cVar = (v6c) i.I((v6c) firstStateRecord);
                iK = v6cVar.getModification();
                i79VarJ = v6cVar.j();
                Unit unit = Unit.a;
            }
            Intrinsics.g(i79VarJ);
            i79<T> i79VarAdd = i79VarJ.add(element);
            if (Intrinsics.e(i79VarAdd, i79VarJ)) {
                return false;
            }
            c7c firstStateRecord2 = getFirstStateRecord();
            Intrinsics.h(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            v6c v6cVar2 = (v6c) firstStateRecord2;
            synchronized (i.M()) {
                gVarC = g.INSTANCE.c();
                zF = ixb.f((v6c) i.n0(v6cVar2, this, gVarC), iK, i79VarAdd, true);
            }
            i.V(gVarC, this);
        } while (!zF);
        return true;
    }

    @Override // java.util.List
    public boolean addAll(final int index, final Collection<? extends T> elements) {
        return ixb.k(this, new Function1() { // from class: com.google.android.gxb
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SnapshotStateList.e(index, elements, (List) obj));
            }
        });
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        g gVarC;
        c7c firstStateRecord = getFirstStateRecord();
        Intrinsics.h(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
        v6c v6cVar = (v6c) firstStateRecord;
        synchronized (i.M()) {
            gVarC = g.INSTANCE.c();
            v6c v6cVar2 = (v6c) i.n0(v6cVar, this, gVarC);
            synchronized (ixb.a) {
                v6cVar2.m(j24.b());
                v6cVar2.n(v6cVar2.getModification() + 1);
                v6cVar2.o(v6cVar2.getStructuralChange() + 1);
            }
        }
        i.V(gVarC, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object element) {
        return ixb.g(this).j().contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> elements) {
        return ixb.g(this).j().containsAll(elements);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int f() {
        return ixb.g(this).j().size();
    }

    @Override // java.util.List
    public T get(int index) {
        return ixb.g(this).j().get(index);
    }

    public T i(int index) {
        int iK;
        i79<T> i79VarJ;
        g gVarC;
        boolean zF;
        T t = get(index);
        do {
            synchronized (ixb.a) {
                c7c firstStateRecord = getFirstStateRecord();
                Intrinsics.h(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                v6c v6cVar = (v6c) i.I((v6c) firstStateRecord);
                iK = v6cVar.getModification();
                i79VarJ = v6cVar.j();
                Unit unit = Unit.a;
            }
            Intrinsics.g(i79VarJ);
            i79<T> i79VarB1 = i79VarJ.B1(index);
            if (Intrinsics.e(i79VarB1, i79VarJ)) {
                return t;
            }
            c7c firstStateRecord2 = getFirstStateRecord();
            Intrinsics.h(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            v6c v6cVar2 = (v6c) firstStateRecord2;
            synchronized (i.M()) {
                gVarC = g.INSTANCE.c();
                zF = ixb.f((v6c) i.n0(v6cVar2, this, gVarC), iK, i79VarB1, true);
            }
            i.V(gVarC, this);
        } while (!zF);
        return t;
    }

    @Override // java.util.List
    public int indexOf(Object element) {
        return ixb.g(this).j().indexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return ixb.g(this).j().isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return listIterator();
    }

    public final void j(int fromIndex, int toIndex) {
        int iK;
        i79<T> i79VarJ;
        g gVarC;
        boolean zF;
        do {
            synchronized (ixb.a) {
                c7c firstStateRecord = getFirstStateRecord();
                Intrinsics.h(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                v6c v6cVar = (v6c) i.I((v6c) firstStateRecord);
                iK = v6cVar.getModification();
                i79VarJ = v6cVar.j();
                Unit unit = Unit.a;
            }
            Intrinsics.g(i79VarJ);
            i79.a<T> aVarBuilder = i79VarJ.builder();
            aVarBuilder.subList(fromIndex, toIndex).clear();
            i79<T> i79VarBuild = aVarBuilder.build();
            if (Intrinsics.e(i79VarBuild, i79VarJ)) {
                return;
            }
            c7c firstStateRecord2 = getFirstStateRecord();
            Intrinsics.h(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            v6c v6cVar2 = (v6c) firstStateRecord2;
            synchronized (i.M()) {
                gVarC = g.INSTANCE.c();
                zF = ixb.f((v6c) i.n0(v6cVar2, this, gVarC), iK, i79VarBuild, true);
            }
            i.V(gVarC, this);
        } while (!zF);
    }

    @Override // java.util.List
    public int lastIndexOf(Object element) {
        return ixb.g(this).j().lastIndexOf(element);
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return new t6c(this, 0);
    }

    public final int o(Collection<? extends T> elements, int start, int end) {
        int iK;
        i79<T> i79VarJ;
        g gVarC;
        boolean zF;
        int size = size();
        do {
            synchronized (ixb.a) {
                c7c firstStateRecord = getFirstStateRecord();
                Intrinsics.h(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                v6c v6cVar = (v6c) i.I((v6c) firstStateRecord);
                iK = v6cVar.getModification();
                i79VarJ = v6cVar.j();
                Unit unit = Unit.a;
            }
            Intrinsics.g(i79VarJ);
            i79.a<T> aVarBuilder = i79VarJ.builder();
            aVarBuilder.subList(start, end).retainAll(elements);
            i79<T> i79VarBuild = aVarBuilder.build();
            if (Intrinsics.e(i79VarBuild, i79VarJ)) {
                break;
            }
            c7c firstStateRecord2 = getFirstStateRecord();
            Intrinsics.h(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            v6c v6cVar2 = (v6c) firstStateRecord2;
            synchronized (i.M()) {
                gVarC = g.INSTANCE.c();
                zF = ixb.f((v6c) i.n0(v6cVar2, this, gVarC), iK, i79VarBuild, true);
            }
            i.V(gVarC, this);
        } while (!zF);
        return size - size();
    }

    public final List<T> r() {
        return ixb.g(this).j();
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i) {
        return i(i);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> elements) {
        int iK;
        i79<T> i79VarJ;
        g gVarC;
        boolean zF;
        do {
            synchronized (ixb.a) {
                c7c firstStateRecord = getFirstStateRecord();
                Intrinsics.h(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                v6c v6cVar = (v6c) i.I((v6c) firstStateRecord);
                iK = v6cVar.getModification();
                i79VarJ = v6cVar.j();
                Unit unit = Unit.a;
            }
            Intrinsics.g(i79VarJ);
            i79<T> i79VarRemoveAll = i79VarJ.removeAll((Collection<? extends T>) elements);
            if (Intrinsics.e(i79VarRemoveAll, i79VarJ)) {
                return false;
            }
            c7c firstStateRecord2 = getFirstStateRecord();
            Intrinsics.h(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            v6c v6cVar2 = (v6c) firstStateRecord2;
            synchronized (i.M()) {
                gVarC = g.INSTANCE.c();
                zF = ixb.f((v6c) i.n0(v6cVar2, this, gVarC), iK, i79VarRemoveAll, true);
            }
            i.V(gVarC, this);
        } while (!zF);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(final Collection<?> elements) {
        return ixb.k(this, new Function1() { // from class: com.google.android.fxb
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SnapshotStateList.n(elements, (List) obj));
            }
        });
    }

    @Override // java.util.List
    public T set(int index, T element) {
        int iK;
        i79<T> i79VarJ;
        g gVarC;
        boolean zF;
        T t = get(index);
        do {
            synchronized (ixb.a) {
                c7c firstStateRecord = getFirstStateRecord();
                Intrinsics.h(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                v6c v6cVar = (v6c) i.I((v6c) firstStateRecord);
                iK = v6cVar.getModification();
                i79VarJ = v6cVar.j();
                Unit unit = Unit.a;
            }
            Intrinsics.g(i79VarJ);
            i79<T> i79Var = i79VarJ.set(index, element);
            if (Intrinsics.e(i79Var, i79VarJ)) {
                return t;
            }
            c7c firstStateRecord2 = getFirstStateRecord();
            Intrinsics.h(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            v6c v6cVar2 = (v6c) firstStateRecord2;
            synchronized (i.M()) {
                gVarC = g.INSTANCE.c();
                zF = ixb.f((v6c) i.n0(v6cVar2, this, gVarC), iK, i79Var, false);
            }
            i.V(gVarC, this);
        } while (!zF);
        return t;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return f();
    }

    @Override // java.util.List
    public List<T> subList(int fromIndex, int toIndex) {
        if (!(fromIndex >= 0 && fromIndex <= toIndex && toIndex <= size())) {
            ei9.a("fromIndex or toIndex are out of bounds");
        }
        return new kcc(this, fromIndex, toIndex);
    }

    @Override // com.google.inputmethod.a7c
    /* JADX INFO: renamed from: t, reason: from getter */
    public c7c getFirstStateRecord() {
        return this.firstStateRecord;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return zh1.a(this);
    }

    public String toString() {
        c7c firstStateRecord = getFirstStateRecord();
        Intrinsics.h(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((v6c) i.I((v6c) firstStateRecord)).j() + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        List<T> listR = r();
        int size = listR.size();
        parcel.writeInt(size);
        for (int i = 0; i < size; i++) {
            parcel.writeValue(listR.get(i));
        }
    }

    @Override // com.google.inputmethod.a7c
    public void x(c7c value) {
        value.h(getFirstStateRecord());
        Intrinsics.h(value, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        this.firstStateRecord = (v6c) value;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> elements) {
        int iK;
        i79<T> i79VarJ;
        g gVarC;
        boolean zF;
        do {
            synchronized (ixb.a) {
                c7c firstStateRecord = getFirstStateRecord();
                Intrinsics.h(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                v6c v6cVar = (v6c) i.I((v6c) firstStateRecord);
                iK = v6cVar.getModification();
                i79VarJ = v6cVar.j();
                Unit unit = Unit.a;
            }
            Intrinsics.g(i79VarJ);
            i79<T> i79VarAddAll = i79VarJ.addAll(elements);
            if (Intrinsics.e(i79VarAddAll, i79VarJ)) {
                return false;
            }
            c7c firstStateRecord2 = getFirstStateRecord();
            Intrinsics.h(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            v6c v6cVar2 = (v6c) firstStateRecord2;
            synchronized (i.M()) {
                gVarC = g.INSTANCE.c();
                zF = ixb.f((v6c) i.n0(v6cVar2, this, gVarC), iK, i79VarAddAll, true);
            }
            i.V(gVarC, this);
        } while (!zF);
        return true;
    }

    @Override // java.util.List
    public ListIterator<T> listIterator(int index) {
        return new t6c(this, index);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object element) {
        int iK;
        i79<T> i79VarJ;
        g gVarC;
        boolean zF;
        do {
            synchronized (ixb.a) {
                c7c firstStateRecord = getFirstStateRecord();
                Intrinsics.h(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                v6c v6cVar = (v6c) i.I((v6c) firstStateRecord);
                iK = v6cVar.getModification();
                i79VarJ = v6cVar.j();
                Unit unit = Unit.a;
            }
            Intrinsics.g(i79VarJ);
            i79<T> i79VarRemove = i79VarJ.remove(element);
            if (Intrinsics.e(i79VarRemove, i79VarJ)) {
                return false;
            }
            c7c firstStateRecord2 = getFirstStateRecord();
            Intrinsics.h(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            v6c v6cVar2 = (v6c) firstStateRecord2;
            synchronized (i.M()) {
                gVarC = g.INSTANCE.c();
                zF = ixb.f((v6c) i.n0(v6cVar2, this, gVarC), iK, i79VarRemove, true);
            }
            i.V(gVarC, this);
        } while (!zF);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) zh1.b(this, tArr);
    }

    public SnapshotStateList() {
        this(j24.b());
    }

    @Override // java.util.List
    public void add(int index, T element) {
        int iK;
        i79<T> i79VarJ;
        g gVarC;
        boolean zF;
        do {
            synchronized (ixb.a) {
                c7c firstStateRecord = getFirstStateRecord();
                Intrinsics.h(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                v6c v6cVar = (v6c) i.I((v6c) firstStateRecord);
                iK = v6cVar.getModification();
                i79VarJ = v6cVar.j();
                Unit unit = Unit.a;
            }
            Intrinsics.g(i79VarJ);
            i79<T> i79VarAdd = i79VarJ.add(index, element);
            if (Intrinsics.e(i79VarAdd, i79VarJ)) {
                return;
            }
            c7c firstStateRecord2 = getFirstStateRecord();
            Intrinsics.h(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            v6c v6cVar2 = (v6c) firstStateRecord2;
            synchronized (i.M()) {
                gVarC = g.INSTANCE.c();
                zF = ixb.f((v6c) i.n0(v6cVar2, this, gVarC), iK, i79VarAdd, true);
            }
            i.V(gVarC, this);
        } while (!zF);
    }
}
