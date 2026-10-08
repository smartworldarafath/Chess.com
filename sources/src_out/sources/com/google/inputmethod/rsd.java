package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u000fB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\bJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0014\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/google/android/rsd;", "", "", "maxStoredCharacters", "<init>", "(I)V", "", "d", "()V", "Lcom/google/android/cwc;", "value", "", "now", "e", "(Lcom/google/android/cwc;J)V", "a", "b", "(Lcom/google/android/cwc;)V", "g", "()Lcom/google/android/cwc;", "c", "I", "getMaxStoredCharacters", "()I", "Lcom/google/android/rsd$a;", "Lcom/google/android/rsd$a;", "undoStack", "redoStack", "storedCharacters", "Ljava/lang/Long;", "lastSnapshot", "", "f", "Z", "forceNextSnapshot", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class rsd {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int maxStoredCharacters;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private a undoStack;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private a redoStack;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int storedCharacters;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private Long lastSnapshot;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean forceNextSnapshot;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\u0002\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/google/android/rsd$a;", "", "next", "Lcom/google/android/cwc;", "value", "<init>", "(Lcom/google/android/rsd$a;Lcom/google/android/cwc;)V", "a", "Lcom/google/android/rsd$a;", "()Lcom/google/android/rsd$a;", "c", "(Lcom/google/android/rsd$a;)V", "b", "Lcom/google/android/cwc;", "()Lcom/google/android/cwc;", "d", "(Lcom/google/android/cwc;)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private a next;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private TextFieldValue value;

        public a(a aVar, TextFieldValue textFieldValue) {
            this.next = aVar;
            this.value = textFieldValue;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final a getNext() {
            return this.next;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextFieldValue getValue() {
            return this.value;
        }

        public final void c(a aVar) {
            this.next = aVar;
        }

        public final void d(TextFieldValue textFieldValue) {
            this.value = textFieldValue;
        }
    }

    public rsd() {
        this(0, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001b  */
    private final void d() {
        a next;
        a next2 = this.undoStack;
        if ((next2 != null ? next2.getNext() : null) == null) {
            return;
        }
        while (true) {
            if (next2 == null) {
                next = null;
            } else {
                a next3 = next2.getNext();
                if (next3 != null) {
                    next = next3.getNext();
                } else {
                    next = null;
                }
            }
            if (next == null) {
                break;
            } else {
                next2 = next2.getNext();
            }
        }
        if (next2 != null) {
            next2.c(null);
        }
    }

    public static /* synthetic */ void f(rsd rsdVar, TextFieldValue textFieldValue, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = tsd.a();
        }
        rsdVar.e(textFieldValue, j);
    }

    public final void a() {
        this.forceNextSnapshot = true;
    }

    public final void b(TextFieldValue value) {
        TextFieldValue value2;
        this.forceNextSnapshot = false;
        a aVar = this.undoStack;
        if (Intrinsics.e(value, aVar != null ? aVar.getValue() : null)) {
            return;
        }
        String strM = value.m();
        a aVar2 = this.undoStack;
        if (Intrinsics.e(strM, (aVar2 == null || (value2 = aVar2.getValue()) == null) ? null : value2.m())) {
            a aVar3 = this.undoStack;
            if (aVar3 != null) {
                aVar3.d(value);
                return;
            }
            return;
        }
        this.undoStack = new a(this.undoStack, value);
        this.redoStack = null;
        int length = this.storedCharacters + value.m().length();
        this.storedCharacters = length;
        if (length > this.maxStoredCharacters) {
            d();
        }
    }

    public final TextFieldValue c() {
        a aVar = this.redoStack;
        if (aVar == null) {
            return null;
        }
        this.redoStack = aVar.getNext();
        this.undoStack = new a(this.undoStack, aVar.getValue());
        this.storedCharacters += aVar.getValue().m().length();
        return aVar.getValue();
    }

    public final void e(TextFieldValue value, long now) {
        if (!this.forceNextSnapshot) {
            Long l = this.lastSnapshot;
            if (now <= (l != null ? l.longValue() : 0L) + ((long) ssd.a())) {
                return;
            }
        }
        this.lastSnapshot = Long.valueOf(now);
        b(value);
    }

    public final TextFieldValue g() {
        a next;
        a aVar = this.undoStack;
        if (aVar == null || (next = aVar.getNext()) == null) {
            return null;
        }
        this.undoStack = next;
        this.storedCharacters -= aVar.getValue().m().length();
        this.redoStack = new a(this.redoStack, aVar.getValue());
        return next.getValue();
    }

    public rsd(int i) {
        this.maxStoredCharacters = i;
    }

    public /* synthetic */ rsd(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 100000 : i);
    }
}
