package com.google.inputmethod;

import com.google.android.fh6;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002By\b\u0000\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0013H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010&\u001a\u0004\b)\u0010(R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010(R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b#\u0010&\u001a\u0004\b,\u0010(R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b-\u0010(R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b.\u0010&\u001a\u0004\b/\u0010(R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b0\u0010&\u001a\u0004\b1\u0010(R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b+\u00102\u001a\u0004\b*\u00103R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00102R\u0011\u00105\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b4\u0010 ¨\u00066"}, d2 = {"Lcom/google/android/z2e;", "Lcom/google/android/b3e;", "", "", "name", "", "rotation", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "", "Lcom/google/android/u39;", "clipPathData", "children", "<init>", "(Ljava/lang/String;FFFFFFFLjava/util/List;Ljava/util/List;)V", "", "index", "c", "(I)Lcom/google/android/b3e;", "", "iterator", "()Ljava/util/Iterator;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "b", "F", "j", "()F", "f", "d", "i", "n", "o", "g", "r", "h", "s", "Ljava/util/List;", "()Ljava/util/List;", "q", "size", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z2e extends b3e implements Iterable<b3e>, fh6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float rotation;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float pivotX;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float pivotY;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float scaleX;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final float scaleY;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final float translationX;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final float translationY;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final List<u39> clipPathData;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final List<b3e> children;

    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0006\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"com/google/android/z2e$a", "", "Lcom/google/android/b3e;", "", "hasNext", "()Z", "a", "()Lcom/google/android/b3e;", "Ljava/util/Iterator;", "getIt", "()Ljava/util/Iterator;", "it", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Iterator<b3e>, fh6 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Iterator<b3e> it;

        a(z2e z2eVar) {
            this.it = z2eVar.children.iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b3e next() {
            return this.it.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.it.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public z2e() {
        this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
    }

    public final b3e c(int index) {
        return this.children.get(index);
    }

    public final List<u39> d() {
        return this.clipPathData;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && (other instanceof z2e)) {
            z2e z2eVar = (z2e) other;
            return Intrinsics.e(this.name, z2eVar.name) && this.rotation == z2eVar.rotation && this.pivotX == z2eVar.pivotX && this.pivotY == z2eVar.pivotY && this.scaleX == z2eVar.scaleX && this.scaleY == z2eVar.scaleY && this.translationX == z2eVar.translationX && this.translationY == z2eVar.translationY && Intrinsics.e(this.clipPathData, z2eVar.clipPathData) && Intrinsics.e(this.children, z2eVar.children);
        }
        return false;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getPivotX() {
        return this.pivotX;
    }

    public int hashCode() {
        return (((((((((((((((((this.name.hashCode() * 31) + Float.hashCode(this.rotation)) * 31) + Float.hashCode(this.pivotX)) * 31) + Float.hashCode(this.pivotY)) * 31) + Float.hashCode(this.scaleX)) * 31) + Float.hashCode(this.scaleY)) * 31) + Float.hashCode(this.translationX)) * 31) + Float.hashCode(this.translationY)) * 31) + this.clipPathData.hashCode()) * 31) + this.children.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final float getPivotY() {
        return this.pivotY;
    }

    @Override // java.lang.Iterable
    public Iterator<b3e> iterator() {
        return new a(this);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final float getRotation() {
        return this.rotation;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final float getScaleX() {
        return this.scaleX;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final float getScaleY() {
        return this.scaleY;
    }

    public final int q() {
        return this.children.size();
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final float getTranslationX() {
        return this.translationX;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final float getTranslationY() {
        return this.translationY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z2e(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List<? extends u39> list, List<? extends b3e> list2) {
        super(null);
        this.name = str;
        this.rotation = f;
        this.pivotX = f2;
        this.pivotY = f3;
        this.scaleX = f4;
        this.scaleY = f5;
        this.translationX = f6;
        this.translationY = f7;
        this.clipPathData = list;
        this.children = list2;
    }

    public /* synthetic */ z2e(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? 0.0f : f2, (i & 8) != 0 ? 0.0f : f3, (i & 16) != 0 ? 1.0f : f4, (i & 32) != 0 ? 1.0f : f5, (i & 64) != 0 ? 0.0f : f6, (i & 128) != 0 ? 0.0f : f7, (i & 256) != 0 ? a3e.e() : list, (i & 512) != 0 ? m.p() : list2);
    }
}
