package com.google.inputmethod;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.b0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0002\r\bB\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H¦\u0002¢\u0006\u0004\b\b\u0010\tJ&\u0010\n\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H¦\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00010\fH&¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/google/android/uk9;", "", "<init>", "()V", "T", "Lcom/google/android/uk9$a;", "key", "", "b", "(Lcom/google/android/uk9$a;)Z", "c", "(Lcom/google/android/uk9$a;)Ljava/lang/Object;", "", "a", "()Ljava/util/Map;", "Lcom/google/android/h58;", "d", "()Lcom/google/android/h58;", "e", "()Lcom/google/android/uk9;", "datastore-preferences-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class uk9 {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/google/android/uk9$a;", "T", "", "", "name", "<init>", "(Ljava/lang/String;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "datastore-preferences-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String name;

        public a(String str) {
            Intrinsics.checkNotNullParameter(str, "name");
            this.name = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public boolean equals(Object other) {
            if (other instanceof a) {
                return Intrinsics.e(this.name, ((a) other).name);
            }
            return false;
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        public String toString() {
            return this.name;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R\u001a\u0010\u000b\u001a\u00028\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\f"}, d2 = {"Lcom/google/android/uk9$b;", "T", "", "Lcom/google/android/uk9$a;", "a", "Lcom/google/android/uk9$a;", "()Lcom/google/android/uk9$a;", "key", "b", "Ljava/lang/Object;", "()Ljava/lang/Object;", "value", "datastore-preferences-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b<T> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final a<T> key;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final T value;

        public final a<T> a() {
            return this.key;
        }

        public final T b() {
            return this.value;
        }
    }

    public abstract Map<a<?>, Object> a();

    public abstract <T> boolean b(a<T> key);

    public abstract <T> T c(a<T> key);

    public final h58 d() {
        return new h58(b0.C(a()), false);
    }

    public final uk9 e() {
        return new h58(b0.C(a()), true);
    }
}
