package com.google.inputmethod;

import androidx.compose.p001foundation.lazy.layout.m;
import com.google.android.ct6.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0012B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0011\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/google/android/ct6;", "Lcom/google/android/ct6$a;", "Interval", "", "<init>", "()V", "", "index", "q", "(I)Ljava/lang/Object;", "n", "Lcom/google/android/d66;", "o", "()Lcom/google/android/d66;", "intervals", "p", "()I", "itemCount", "a", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ct6<Interval extends a> {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001R\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\"\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/google/android/ct6$a;", "", "Lkotlin/Function1;", "", "getKey", "()Lkotlin/jvm/functions/Function1;", "key", "getType", "type", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: com.google.android.ct6$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class C0104a implements Function1 {
            public static final C0104a a = new C0104a();

            C0104a() {
            }

            public final Void a(int i) {
                return null;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((Number) obj).intValue());
            }
        }

        default Function1<Integer, Object> getKey() {
            return null;
        }

        default Function1<Integer, Object> getType() {
            return C0104a.a;
        }
    }

    public final Object n(int index) {
        d66.a<Interval> aVar = o().get(index);
        return aVar.c().getType().invoke(Integer.valueOf(index - aVar.getStartIndex()));
    }

    public abstract d66<Interval> o();

    public final int p() {
        return o().getSize();
    }

    public final Object q(int index) {
        Object objInvoke;
        d66.a<Interval> aVar = o().get(index);
        int startIndex = index - aVar.getStartIndex();
        Function1<Integer, Object> key = aVar.c().getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(startIndex))) == null) ? m.a(index) : objInvoke;
    }
}
