package com.google.inputmethod;

import androidx.compose.ui.node.LayoutNode;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\b\u0001\u0018\u00002\u00020\u0001:\u0001:B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u000e\u001a\u00020\r2\n\u0010\u0005\u001a\u00060\u0004R\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJE\u0010\u0011\u001a\u00020\u000b2\n\u0010\u0005\u001a\u00060\u0004R\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\u00020\u00132\n\u0010\u0005\u001a\u00060\u0004R\u00020\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J5\u0010\u001a\u001a\u00060\u0004R\u00020\u0000*\f\u0012\b\u0012\u00060\u0004R\u00020\u00000\u00162\u0006\u0010\u0018\u001a\u00020\u00172\n\u0010\u0019\u001a\u00060\u0004R\u00020\u0000H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ1\u0010\u001c\u001a\u00020\u0013*\f\u0012\b\u0012\u00060\u0004R\u00020\u00000\u00162\u0006\u0010\u0018\u001a\u00020\u00172\n\u0010\u0019\u001a\u00060\u0004R\u00020\u0000H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ7\u0010#\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\t2\u0006\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u0017¢\u0006\u0004\b#\u0010$JA\u0010.\u001a\u00020-2\u0006\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020(2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\r0*¢\u0006\u0004\b.\u0010/J-\u00102\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u00172\u0006\u00100\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b2\u00103J\u0015\u00104\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b4\u00105J\u0015\u00106\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b6\u00105J\u0015\u00107\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b7\u00105J3\u00108\u001a\u00020\r2\n\u0010\u0005\u001a\u00060\u0004R\u00020\u00002\u0006\u00100\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b8\u00109R!\u0010>\u001a\f\u0012\b\u0012\u00060\u0004R\u00020\u00000\u00168\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R(\u0010E\u001a\b\u0018\u00010\u0004R\u00020\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010J\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u00105R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010F\u001a\u0004\bK\u0010H\"\u0004\bL\u00105R\"\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010F\u001a\u0004\bM\u0010H\"\u0004\bN\u00105R\"\u0010Q\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010F\u001a\u0004\bO\u0010H\"\u0004\bP\u00105R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010V¨\u0006W"}, d2 = {"Lcom/google/android/r1d;", "", "<init>", "()V", "Lcom/google/android/r1d$a;", "entry", "Lcom/google/android/g16;", "windowOffset", "screenOffset", "Lcom/google/android/zh7;", "viewToWindowMatrix", "", "currentMillis", "", "d", "(Lcom/google/android/r1d$a;JJ[FJ)V", "minDeadline", "c", "(Lcom/google/android/r1d$a;JJ[FJJ)J", "", "o", "(Lcom/google/android/r1d$a;)Z", "Lcom/google/android/o48;", "", "key", "value", "l", "(Lcom/google/android/o48;ILcom/google/android/r1d$a;)Lcom/google/android/r1d$a;", "m", "(Lcom/google/android/o48;ILcom/google/android/r1d$a;)Z", "screen", "window", "matrix", "windowWidth", "windowHeight", "q", "(JJ[FII)Z", "id", "throttleMillis", "debounceMillis", "Lcom/google/android/x23;", "node", "Lkotlin/Function1;", "Lcom/google/android/nea;", "callback", "Lcom/google/android/x23$a;", "n", "(IJJLcom/google/android/x23;Lkotlin/jvm/functions/Function1;)Lcom/google/android/x23$a;", "topLeft", "bottomRight", "g", "(IJJJ)V", "f", "(J)V", "e", "p", "h", "(Lcom/google/android/r1d$a;JJJ)V", "a", "Lcom/google/android/o48;", "j", "()Lcom/google/android/o48;", "rectChangedMap", "b", "Lcom/google/android/r1d$a;", "getGlobalChangeEntries", "()Lcom/google/android/r1d$a;", "setGlobalChangeEntries", "(Lcom/google/android/r1d$a;)V", "globalChangeEntries", "J", "i", "()J", "setMinDebounceDeadline", "minDebounceDeadline", "getWindowOffset-nOcc-ac", "setWindowOffset--gyyYBs", "getScreenOffset-nOcc-ac", "setScreenOffset--gyyYBs", "k", "setWindowSize", "windowSize", "[F", "getViewToWindowMatrix-3i98HWw", "()[F", "setViewToWindowMatrix-Q8lPUPs", "([F)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r1d {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private a globalChangeEntries;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private long windowOffset;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private long screenOffset;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private long windowSize;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private float[] viewToWindowMatrix;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final o48<a> rectChangedMap = f16.c();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private long minDebounceDeadline = -1;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0004\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R(\u00100\u001a\b\u0018\u00010\u0000R\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u001d\u001a\u0004\b1\u0010\u001f\"\u0004\b2\u00103R\"\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001d\u001a\u0004\b \u0010\u001f\"\u0004\b4\u00103R\"\u00106\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b%\u0010\u001f\"\u0004\b5\u00103R\"\u00108\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\u001d\u001a\u0004\b*\u0010\u001f\"\u0004\b7\u00103¨\u00069"}, d2 = {"Lcom/google/android/r1d$a;", "Lcom/google/android/x23$a;", "", "id", "", "throttleMillis", "debounceMillis", "Lcom/google/android/x23;", "node", "Lkotlin/Function1;", "Lcom/google/android/nea;", "", "callback", "<init>", "(Lcom/google/android/r1d;IJJLcom/google/android/x23;Lkotlin/jvm/functions/Function1;)V", "a", "()V", "topLeft", "bottomRight", "Lcom/google/android/g16;", "windowOffset", "screenOffset", "Lcom/google/android/zh7;", "viewToWindowMatrix", "b", "(JJJJ[F)V", "I", "getId", "()I", "J", "i", "()J", "c", "d", "Lcom/google/android/x23;", "h", "()Lcom/google/android/x23;", "e", "Lkotlin/jvm/functions/Function1;", "getCallback", "()Lkotlin/jvm/functions/Function1;", "Lcom/google/android/r1d;", "f", "Lcom/google/android/r1d$a;", "g", "()Lcom/google/android/r1d$a;", "n", "(Lcom/google/android/r1d$a;)V", "next", "j", "o", "(J)V", "k", "l", "lastInvokeMillis", "m", "lastUninvokedFireMillis", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a implements x23.a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final long throttleMillis;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final long debounceMillis;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final x23 node;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final Function1<nea, Unit> callback;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private a next;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private long topLeft;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private long bottomRight;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private long lastInvokeMillis = Long.MIN_VALUE;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private long lastUninvokedFireMillis = -1;

        /* JADX WARN: Multi-variable type inference failed */
        public a(int i, long j, long j2, x23 x23Var, Function1<? super nea, Unit> function1) {
            this.id = i;
            this.throttleMillis = j;
            this.debounceMillis = j2;
            this.node = x23Var;
            this.callback = function1;
        }

        @Override // com.google.android.x23.a
        public void a() {
            r1d r1dVar = r1d.this;
            if (r1dVar.m(r1dVar.j(), this.id, this)) {
                return;
            }
            r1d.this.o(this);
        }

        public final void b(long topLeft, long bottomRight, long windowOffset, long screenOffset, float[] viewToWindowMatrix) {
            nea neaVarA = s1d.a(this.node, topLeft, bottomRight, windowOffset, screenOffset, r1d.this.getWindowSize(), viewToWindowMatrix);
            if (neaVarA == null) {
                return;
            }
            this.callback.invoke(neaVarA);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getBottomRight() {
            return this.bottomRight;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final long getDebounceMillis() {
            return this.debounceMillis;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final long getLastInvokeMillis() {
            return this.lastInvokeMillis;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final long getLastUninvokedFireMillis() {
            return this.lastUninvokedFireMillis;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final a getNext() {
            return this.next;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final x23 getNode() {
            return this.node;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final long getThrottleMillis() {
            return this.throttleMillis;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final long getTopLeft() {
            return this.topLeft;
        }

        public final void k(long j) {
            this.bottomRight = j;
        }

        public final void l(long j) {
            this.lastInvokeMillis = j;
        }

        public final void m(long j) {
            this.lastUninvokedFireMillis = j;
        }

        public final void n(a aVar) {
            this.next = aVar;
        }

        public final void o(long j) {
            this.topLeft = j;
        }
    }

    public r1d() {
        g16.Companion companion = g16.INSTANCE;
        this.windowOffset = companion.b();
        this.screenOffset = companion.b();
    }

    private final long c(a entry, long windowOffset, long screenOffset, float[] viewToWindowMatrix, long currentMillis, long minDeadline) {
        if (entry.getDebounceMillis() <= 0 || entry.getLastUninvokedFireMillis() <= 0) {
            return minDeadline;
        }
        if (currentMillis - entry.getLastUninvokedFireMillis() < entry.getDebounceMillis()) {
            return Math.min(minDeadline, entry.getLastUninvokedFireMillis() + entry.getDebounceMillis());
        }
        entry.l(currentMillis);
        entry.m(-1L);
        entry.b(entry.getTopLeft(), entry.getBottomRight(), windowOffset, screenOffset, viewToWindowMatrix);
        return minDeadline;
    }

    private final void d(a entry, long windowOffset, long screenOffset, float[] viewToWindowMatrix, long currentMillis) {
        long lastInvokeMillis = entry.getLastInvokeMillis();
        boolean z = currentMillis - lastInvokeMillis > entry.getThrottleMillis() || lastInvokeMillis == Long.MIN_VALUE;
        boolean z2 = entry.getDebounceMillis() == 0;
        entry.m(currentMillis);
        if (z && z2) {
            entry.l(currentMillis);
            entry.b(entry.getTopLeft(), entry.getBottomRight(), windowOffset, screenOffset, viewToWindowMatrix);
        }
        if (z2) {
            return;
        }
        long j = this.minDebounceDeadline;
        long debounceMillis = entry.getDebounceMillis() + currentMillis;
        if (j <= 0 || debounceMillis >= j) {
            return;
        }
        this.minDebounceDeadline = j;
    }

    private final a l(o48<a> o48Var, int i, a aVar) {
        a aVarB = o48Var.b(i);
        if (aVarB == null) {
            o48Var.r(i, aVar);
            aVarB = aVar;
        }
        a next = aVarB;
        if (next != aVar) {
            while (next.getNext() != null) {
                next = next.getNext();
                Intrinsics.g(next);
            }
            next.n(aVar);
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final boolean m(o48<a> o48Var, int i, a aVar) throws KotlinNothingValueException {
        a aVarO = o48Var.o(i);
        if (aVarO == null) {
            return false;
        }
        if (Intrinsics.e(aVarO, aVar)) {
            a next = aVar.getNext();
            aVar.n(null);
            if (next != null) {
                o48Var.n(i, next);
            } else {
                LayoutNode layoutNodeQ = y23.q(aVar.getNode().getNode());
                if (layoutNodeQ.getAddedToRectList()) {
                    fo6.b(layoutNodeQ).getRectManager().s(layoutNodeQ);
                }
            }
            return true;
        }
        o48Var.n(i, aVarO);
        while (aVarO != null) {
            a next2 = aVarO.getNext();
            if (next2 == null) {
                return false;
            }
            if (next2 == aVar) {
                aVarO.n(aVar.getNext());
                aVar.n(null);
                break;
            }
            aVarO = aVarO.getNext();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean o(a entry) {
        a aVar = this.globalChangeEntries;
        if (aVar == entry) {
            this.globalChangeEntries = aVar.getNext();
            entry.n(null);
            return true;
        }
        a next = aVar != null ? aVar.getNext() : null;
        while (true) {
            a aVar2 = next;
            a aVar3 = aVar;
            aVar = aVar2;
            if (aVar == null) {
                return false;
            }
            if (aVar == entry) {
                if (aVar3 != null) {
                    aVar3.n(aVar.getNext());
                }
                entry.n(null);
                return true;
            }
            next = aVar.getNext();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void e(long currentMillis) throws KotlinNothingValueException {
        long j = this.windowOffset;
        long j2 = this.screenOffset;
        float[] fArr = this.viewToWindowMatrix;
        a next = this.globalChangeEntries;
        if (next != null) {
            while (next != null) {
                LayoutNode layoutNodeQ = y23.q(next.getNode());
                long jD = fo6.b(layoutNodeQ).getRectManager().d(layoutNodeQ);
                next.o(jD);
                int iK = g16.k(jD) + layoutNodeQ.I0();
                next.k((((long) (g16.l(jD) + layoutNodeQ.a0())) & 4294967295L) | (((long) iK) << 32));
                d(next, j, j2, fArr, currentMillis);
                next = next.getNext();
            }
        }
    }

    public final void f(long currentMillis) {
        r1d r1dVar = this;
        long j = r1dVar.windowOffset;
        long j2 = r1dVar.screenOffset;
        float[] fArr = r1dVar.viewToWindowMatrix;
        o48<a> o48Var = r1dVar.rectChangedMap;
        Object[] objArr = o48Var.values;
        long[] jArr = o48Var.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j3 = jArr[i];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                long j4 = j3;
                int i3 = 0;
                while (i3 < i2) {
                    if ((j4 & 255) < 128) {
                        a next = (a) objArr[(i << 3) + i3];
                        while (next != null) {
                            int i4 = i3;
                            a aVar = next;
                            r1dVar.d(aVar, j, j2, fArr, currentMillis);
                            next = aVar.getNext();
                            r1dVar = this;
                            i3 = i4;
                        }
                    }
                    j4 >>= 8;
                    i3++;
                    r1dVar = this;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            }
            i++;
            r1dVar = this;
        }
    }

    public final void g(int id, long topLeft, long bottomRight, long currentMillis) {
        a aVarB = this.rectChangedMap.b(id);
        while (true) {
            a aVar = aVarB;
            if (aVar == null) {
                return;
            }
            aVarB = aVar.getNext();
            h(aVar, topLeft, bottomRight, currentMillis);
        }
    }

    public final void h(a entry, long topLeft, long bottomRight, long currentMillis) {
        long lastInvokeMillis = entry.getLastInvokeMillis();
        long throttleMillis = entry.getThrottleMillis();
        long debounceMillis = entry.getDebounceMillis();
        boolean z = currentMillis - lastInvokeMillis >= throttleMillis || lastInvokeMillis == Long.MIN_VALUE;
        boolean z2 = debounceMillis == 0;
        boolean z3 = throttleMillis == 0;
        entry.o(topLeft);
        entry.k(bottomRight);
        boolean z4 = !(z2 || z3) || z2;
        if (z && z4) {
            entry.m(-1L);
            entry.l(currentMillis);
            entry.b(topLeft, bottomRight, this.windowOffset, this.screenOffset, this.viewToWindowMatrix);
        } else {
            if (z2) {
                return;
            }
            entry.m(currentMillis);
            long j = this.minDebounceDeadline;
            long j2 = currentMillis + debounceMillis;
            if (j <= 0 || j2 >= j) {
                return;
            }
            this.minDebounceDeadline = j;
        }
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getMinDebounceDeadline() {
        return this.minDebounceDeadline;
    }

    public final o48<a> j() {
        return this.rectChangedMap;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getWindowSize() {
        return this.windowSize;
    }

    public final x23.a n(int id, long throttleMillis, long debounceMillis, x23 node, Function1<? super nea, Unit> callback) {
        return l(this.rectChangedMap, id, new a(id, throttleMillis, debounceMillis == 0 ? throttleMillis : debounceMillis, node, callback));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008c A[LOOP:0: B:8:0x0023->B:25:0x008c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0096 A[EDGE_INSN: B:39:0x0096->B:27:0x0096 BREAK  A[LOOP:0: B:8:0x0023->B:25:0x008c], SYNTHETIC] */
    public final void p(long currentMillis) {
        long j;
        long jC;
        int i;
        if (this.minDebounceDeadline > currentMillis) {
            return;
        }
        long j2 = this.windowOffset;
        long j3 = this.screenOffset;
        float[] fArr = this.viewToWindowMatrix;
        o48<a> o48Var = this.rectChangedMap;
        Object[] objArr = o48Var.values;
        long[] jArr = o48Var.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            jC = Long.MAX_VALUE;
            while (true) {
                long j4 = jArr[i2];
                j = Long.MAX_VALUE;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    long j5 = j4;
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((j5 & 255) < 128) {
                            a next = (a) objArr[(i2 << 3) + i4];
                            while (next != null) {
                                int i5 = i2;
                                a aVar = next;
                                jC = c(aVar, j2, j3, fArr, currentMillis, jC);
                                i4 = i4;
                                next = aVar.getNext();
                                i2 = i5;
                            }
                            i = i4;
                        } else {
                            i = i4;
                        }
                        j5 >>= 8;
                        i4 = i + 1;
                        i2 = i2;
                    }
                    int i6 = i2;
                    if (i3 != 8) {
                        break;
                    }
                    i2 = i6;
                    if (i2 != length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        } else {
            j = Long.MAX_VALUE;
            jC = Long.MAX_VALUE;
        }
        a next2 = this.globalChangeEntries;
        if (next2 != null) {
            long jC2 = jC;
            while (next2 != null) {
                jC2 = c(next2, j2, j3, fArr, currentMillis, jC2);
                next2 = next2.getNext();
            }
            jC = jC2;
        }
        if (jC == j) {
            jC = -1;
        }
        this.minDebounceDeadline = jC;
    }

    public final boolean q(long screen, long window, float[] matrix, int windowWidth, int windowHeight) {
        boolean z;
        if (g16.j(window, this.windowOffset)) {
            z = false;
        } else {
            this.windowOffset = window;
            z = true;
        }
        if (!g16.j(screen, this.screenOffset)) {
            this.screenOffset = screen;
            z = true;
        }
        if (matrix != null) {
            this.viewToWindowMatrix = matrix;
            z = true;
        }
        long j = (((long) windowWidth) << 32) | (((long) windowHeight) & 4294967295L);
        if (j == this.windowSize) {
            return z;
        }
        this.windowSize = j;
        return true;
    }
}
