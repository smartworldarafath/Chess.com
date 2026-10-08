package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import com.google.inputmethod.zq3;
import com.google.inputmethod.zzb;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
final class h {
    private final androidx.emoji2.text.e.j a;
    private final l b;
    private androidx.emoji2.text.e.InterfaceC0083e c;
    private final boolean d;
    private final int[] e;

    private static final class a {
        static int a(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    i--;
                    if (i < 0) {
                        return z ? -1 : 0;
                    }
                    char cCharAt = charSequence.charAt(i);
                    if (z) {
                        if (!Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        i2--;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i2--;
                    } else {
                        if (Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        z = true;
                    }
                }
                return i;
            }
        }

        static int b(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    if (i >= length) {
                        if (z) {
                            return -1;
                        }
                        return length;
                    }
                    char cCharAt = charSequence.charAt(i);
                    if (z) {
                        if (!Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i2--;
                        i++;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i2--;
                        i++;
                    } else {
                        if (Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i++;
                        z = true;
                    }
                }
                return i;
            }
        }
    }

    private static class b implements c<n> {
        public n a;
        private final androidx.emoji2.text.e.j b;

        b(n nVar, androidx.emoji2.text.e.j jVar) {
            this.a = nVar;
            this.b = jVar;
        }

        @Override // androidx.emoji2.text.h.c
        public boolean a(CharSequence charSequence, int i, int i2, m mVar) {
            if (mVar.k()) {
                return true;
            }
            if (this.a == null) {
                this.a = new n(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            this.a.setSpan(this.b.a(mVar), i, i2, 33);
            return true;
        }

        @Override // androidx.emoji2.text.h.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public n getResult() {
            return this.a;
        }
    }

    private interface c<T> {
        boolean a(CharSequence charSequence, int i, int i2, m mVar);

        T getResult();
    }

    private static class d implements c<d> {
        private final int a;
        public int b = -1;
        public int c = -1;

        d(int i) {
            this.a = i;
        }

        @Override // androidx.emoji2.text.h.c
        public boolean a(CharSequence charSequence, int i, int i2, m mVar) {
            int i3 = this.a;
            if (i > i3 || i3 >= i2) {
                return i2 <= i3;
            }
            this.b = i;
            this.c = i2;
            return false;
        }

        @Override // androidx.emoji2.text.h.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d getResult() {
            return this;
        }
    }

    private static class e implements c<e> {
        private final String a;

        e(String str) {
            this.a = str;
        }

        @Override // androidx.emoji2.text.h.c
        public boolean a(CharSequence charSequence, int i, int i2, m mVar) {
            if (!TextUtils.equals(charSequence.subSequence(i, i2), this.a)) {
                return true;
            }
            mVar.l(true);
            return false;
        }

        @Override // androidx.emoji2.text.h.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e getResult() {
            return this;
        }
    }

    static final class f {
        private int a = 1;
        private final l.a b;
        private l.a c;
        private l.a d;
        private int e;
        private int f;
        private final boolean g;
        private final int[] h;

        f(l.a aVar, boolean z, int[] iArr) {
            this.b = aVar;
            this.c = aVar;
            this.g = z;
            this.h = iArr;
        }

        private static boolean d(int i) {
            return i == 65039;
        }

        private static boolean f(int i) {
            return i == 65038;
        }

        private int g() {
            this.a = 1;
            this.c = this.b;
            this.f = 0;
            return 1;
        }

        private boolean h() {
            if (this.c.b().j() || d(this.e)) {
                return true;
            }
            if (this.g) {
                if (this.h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.h, this.c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        int a(int i) {
            l.a aVarA = this.c.a(i);
            int iG = 2;
            if (this.a != 2) {
                if (aVarA == null) {
                    iG = g();
                } else {
                    this.a = 2;
                    this.c = aVarA;
                    this.f = 1;
                }
            } else if (aVarA != null) {
                this.c = aVarA;
                this.f++;
            } else if (f(i)) {
                iG = g();
            } else if (!d(i)) {
                if (this.c.b() != null) {
                    iG = 3;
                    if (this.f != 1 || h()) {
                        this.d = this.c;
                        g();
                    } else {
                        iG = g();
                    }
                } else {
                    iG = g();
                }
            }
            this.e = i;
            return iG;
        }

        m b() {
            return this.c.b();
        }

        m c() {
            return this.d.b();
        }

        boolean e() {
            if (this.a != 2 || this.c.b() == null) {
                return false;
            }
            return this.f > 1 || h();
        }
    }

    h(l lVar, androidx.emoji2.text.e.j jVar, androidx.emoji2.text.e.InterfaceC0083e interfaceC0083e, boolean z, int[] iArr, Set<int[]> set) {
        this.a = jVar;
        this.b = lVar;
        this.c = interfaceC0083e;
        this.d = z;
        this.e = iArr;
        i(set);
    }

    private static boolean a(Editable editable, KeyEvent keyEvent, boolean z) {
        zq3[] zq3VarArr;
        if (h(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!g(selectionStart, selectionEnd) && (zq3VarArr = (zq3[]) editable.getSpans(selectionStart, selectionEnd, zq3.class)) != null && zq3VarArr.length > 0) {
            for (zq3 zq3Var : zq3VarArr) {
                int spanStart = editable.getSpanStart(zq3Var);
                int spanEnd = editable.getSpanEnd(zq3Var);
                if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    static boolean d(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
        int iMax;
        int iMin;
        if (editable != null && inputConnection != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (g(selectionStart, selectionEnd)) {
                return false;
            }
            if (z) {
                iMax = a.a(editable, selectionStart, Math.max(i, 0));
                iMin = a.b(editable, selectionEnd, Math.max(i2, 0));
                if (iMax == -1 || iMin == -1) {
                    return false;
                }
            } else {
                iMax = Math.max(selectionStart - i, 0);
                iMin = Math.min(selectionEnd + i2, editable.length());
            }
            zq3[] zq3VarArr = (zq3[]) editable.getSpans(iMax, iMin, zq3.class);
            if (zq3VarArr != null && zq3VarArr.length > 0) {
                for (zq3 zq3Var : zq3VarArr) {
                    int spanStart = editable.getSpanStart(zq3Var);
                    int spanEnd = editable.getSpanEnd(zq3Var);
                    iMax = Math.min(spanStart, iMax);
                    iMin = Math.max(spanEnd, iMin);
                }
                int iMax2 = Math.max(iMax, 0);
                int iMin2 = Math.min(iMin, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(iMax2, iMin2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    static boolean e(Editable editable, int i, KeyEvent keyEvent) {
        boolean zA;
        if (i != 67) {
            zA = i != 112 ? false : a(editable, keyEvent, true);
        } else {
            zA = a(editable, keyEvent, false);
        }
        if (!zA) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    private boolean f(CharSequence charSequence, int i, int i2, m mVar) {
        if (mVar.d() == 0) {
            mVar.m(this.c.a(charSequence, i, i2, mVar.h()));
        }
        return mVar.d() == 2;
    }

    private static boolean g(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }

    private static boolean h(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    private void i(Set<int[]> set) {
        if (set.isEmpty()) {
            return;
        }
        for (int[] iArr : set) {
            String str = new String(iArr, 0, iArr.length);
            k(str, 0, str.length(), 1, true, new e(str));
        }
    }

    private <T> T k(CharSequence charSequence, int i, int i2, int i3, boolean z, c<T> cVar) {
        int iCharCount;
        f fVar = new f(this.b.f(), this.d, this.e);
        int i4 = 0;
        boolean zA = true;
        int iCodePointAt = Character.codePointAt(charSequence, i);
        loop0: while (true) {
            iCharCount = i;
            while (true) {
                if (i >= i2 || i4 >= i3 || !zA) {
                    break loop0;
                }
                int iA = fVar.a(iCodePointAt);
                if (iA == 1) {
                    iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                    if (iCharCount < i2) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                    i = iCharCount;
                } else if (iA == 2) {
                    i += Character.charCount(iCodePointAt);
                    if (i < i2) {
                        iCodePointAt = Character.codePointAt(charSequence, i);
                    }
                } else if (iA != 3) {
                }
            }
            if (z || !f(charSequence, iCharCount, i, fVar.c())) {
                zA = cVar.a(charSequence, iCharCount, i, fVar.c());
                i4++;
            }
        }
        if (fVar.e() && i4 < i3 && zA && (z || !f(charSequence, iCharCount, i, fVar.b()))) {
            cVar.a(charSequence, iCharCount, i, fVar.b());
        }
        return cVar.getResult();
    }

    int b(CharSequence charSequence, int i) {
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            zq3[] zq3VarArr = (zq3[]) spanned.getSpans(i, i + 1, zq3.class);
            if (zq3VarArr.length > 0) {
                return spanned.getSpanEnd(zq3VarArr[0]);
            }
        }
        return ((d) k(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new d(i))).c;
    }

    int c(CharSequence charSequence, int i) {
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            zq3[] zq3VarArr = (zq3[]) spanned.getSpans(i, i + 1, zq3.class);
            if (zq3VarArr.length > 0) {
                return spanned.getSpanStart(zq3VarArr[0]);
            }
        }
        return ((d) k(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new d(i))).b;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004b A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:22:0x003c, B:24:0x0044, B:26:0x0047, B:28:0x004b, B:30:0x0057, B:31:0x005a, B:41:0x0078), top: B:70:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0057 A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:22:0x003c, B:24:0x0044, B:26:0x0047, B:28:0x004b, B:30:0x0057, B:31:0x005a, B:41:0x0078), top: B:70:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:73:? A[SYNTHETIC] */
    CharSequence j(CharSequence charSequence, int i, int i2, int i3, boolean z) throws Throwable {
        n nVar;
        CharSequence charSequence2;
        Throwable th;
        int i4;
        int i5;
        zzb zzbVar;
        zq3[] zq3VarArr;
        int i6;
        int spanStart;
        boolean z2 = charSequence instanceof zzb;
        if (z2) {
            ((zzb) charSequence).a();
        }
        if (z2) {
            nVar = new n((Spannable) charSequence);
            if (nVar != null) {
                for (zq3 zq3Var : zq3VarArr) {
                    spanStart = nVar.getSpanStart(zq3Var);
                    int spanEnd = nVar.getSpanEnd(zq3Var);
                    if (spanStart != i2) {
                        nVar.removeSpan(zq3Var);
                    }
                    i = Math.min(spanStart, i);
                    i2 = Math.max(spanEnd, i2);
                }
            }
            i4 = i;
            i5 = i2;
            if (i4 == i5) {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
                zzbVar = (zzb) charSequence2;
                zzbVar.d();
            } else {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
                zzbVar = (zzb) charSequence2;
                zzbVar.d();
            }
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    nVar = new n((Spannable) charSequence);
                } catch (Throwable th2) {
                    th = th2;
                    charSequence2 = charSequence;
                    th = th;
                    if (!z2) {
                        throw th;
                    }
                    ((zzb) charSequence2).d();
                    throw th;
                }
            } else {
                nVar = (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i + (-1), i2 + 1, zq3.class) > i2) ? null : new n(charSequence);
            }
            if (nVar != null && (zq3VarArr = (zq3[]) nVar.getSpans(i, i2, zq3.class)) != null && zq3VarArr.length > 0) {
                while (i6 < r5) {
                    spanStart = nVar.getSpanStart(zq3Var);
                    int spanEnd2 = nVar.getSpanEnd(zq3Var);
                    if (spanStart != i2) {
                        nVar.removeSpan(zq3Var);
                    }
                    i = Math.min(spanStart, i);
                    i2 = Math.max(spanEnd2, i2);
                }
            }
            i4 = i;
            i5 = i2;
            if (i4 == i5 && i4 < charSequence.length()) {
                if (i3 != Integer.MAX_VALUE && nVar != null) {
                    i3 -= ((zq3[]) nVar.getSpans(0, nVar.length(), zq3.class)).length;
                }
                charSequence2 = charSequence;
                try {
                    n nVar2 = (n) k(charSequence2, i4, i5, i3, z, new b(nVar, this.a));
                    if (nVar2 == null) {
                        if (z2) {
                            zzbVar = (zzb) charSequence2;
                        }
                        return charSequence2;
                    }
                    Spannable spannableB = nVar2.b();
                    if (z2) {
                        ((zzb) charSequence2).d();
                    }
                    return spannableB;
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    if (!z2) {
                        throw th;
                    }
                    ((zzb) charSequence2).d();
                    throw th;
                }
            }
            charSequence2 = charSequence;
            if (!z2) {
                return charSequence2;
            }
            zzbVar = (zzb) charSequence2;
            zzbVar.d();
            return charSequence2;
        } catch (Throwable th4) {
            th = th4;
            charSequence2 = charSequence;
        }
        if (!z2) {
            throw th;
        }
        ((zzb) charSequence2).d();
        throw th;
    }
}
