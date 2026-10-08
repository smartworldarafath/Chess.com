package androidx.p008glance.p010session;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0001\u001a\u00020\u0000H\u0087@¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "a", "(Lcom/google/android/q22;)Ljava/lang/Object;", "glance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class GlobalSnapshotManagerKt {
    /* JADX WARN: Code duplicated, block: B:22:0x0072 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x007b A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #2 {all -> 0x003b, blocks: (B:12:0x0037, B:23:0x0073, B:25:0x007b, B:20:0x0062, B:19:0x005d), top: B:38:0x0023, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0070 -> B:23:0x0073). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(com.google.android.q22<? super kotlin.Unit> r9) {
        /*
            boolean r0 = r9 instanceof androidx.p008glance.p010session.GlobalSnapshotManagerKt$globalSnapshotMonitor$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.glance.session.GlobalSnapshotManagerKt$globalSnapshotMonitor$1 r0 = (androidx.p008glance.p010session.GlobalSnapshotManagerKt$globalSnapshotMonitor$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.glance.session.GlobalSnapshotManagerKt$globalSnapshotMonitor$1 r0 = new androidx.glance.session.GlobalSnapshotManagerKt$globalSnapshotMonitor$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.g()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L45
            if (r2 != r4) goto L3d
            java.lang.Object r2 = r0.L$3
            com.google.android.o81 r2 = (com.google.android.o81) r2
            java.lang.Object r6 = r0.L$2
            com.google.android.iaa r6 = (com.google.android.iaa) r6
            java.lang.Object r7 = r0.L$1
            com.google.android.nn8 r7 = (com.google.inputmethod.nn8) r7
            java.lang.Object r8 = r0.L$0
            java.util.concurrent.atomic.AtomicBoolean r8 = (java.util.concurrent.atomic.AtomicBoolean) r8
            kotlin.f.b(r9)     // Catch: java.lang.Throwable -> L3b
            goto L73
        L3b:
            r9 = move-exception
            goto L95
        L3d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L45:
            kotlin.f.b(r9)
            r9 = 6
            com.google.android.h81 r6 = com.google.android.p81.b(r4, r5, r5, r9, r5)
            java.util.concurrent.atomic.AtomicBoolean r9 = new java.util.concurrent.atomic.AtomicBoolean
            r9.<init>(r3)
            androidx.compose.runtime.snapshots.g$a r2 = androidx.compose.p004runtime.snapshots.g.INSTANCE
            androidx.glance.session.GlobalSnapshotManagerKt$globalSnapshotMonitor$observerHandle$1 r7 = new androidx.glance.session.GlobalSnapshotManagerKt$globalSnapshotMonitor$observerHandle$1
            r7.<init>()
            com.google.android.nn8 r7 = r2.j(r7)
            com.google.android.o81 r2 = r6.iterator()     // Catch: java.lang.Throwable -> L3b
            r8 = r9
        L62:
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L3b
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L3b
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L3b
            r0.L$3 = r2     // Catch: java.lang.Throwable -> L3b
            r0.label = r4     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r9 = r2.a(r0)     // Catch: java.lang.Throwable -> L3b
            if (r9 != r1) goto L73
            return r1
        L73:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L3b
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L3b
            if (r9 == 0) goto L8a
            java.lang.Object r9 = r2.next()     // Catch: java.lang.Throwable -> L3b
            kotlin.Unit r9 = (kotlin.Unit) r9     // Catch: java.lang.Throwable -> L3b
            r8.set(r3)     // Catch: java.lang.Throwable -> L3b
            androidx.compose.runtime.snapshots.g$a r9 = androidx.compose.p004runtime.snapshots.g.INSTANCE     // Catch: java.lang.Throwable -> L3b
            r9.m()     // Catch: java.lang.Throwable -> L3b
            goto L62
        L8a:
            kotlinx.coroutines.channels.c.a(r6, r5)     // Catch: java.lang.Throwable -> L93
            r7.dispose()
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        L93:
            r9 = move-exception
            goto L9b
        L95:
            throw r9     // Catch: java.lang.Throwable -> L96
        L96:
            r0 = move-exception
            kotlinx.coroutines.channels.c.a(r6, r9)     // Catch: java.lang.Throwable -> L93
            throw r0     // Catch: java.lang.Throwable -> L93
        L9b:
            r7.dispose()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p008glance.p010session.GlobalSnapshotManagerKt.a(com.google.android.q22):java.lang.Object");
    }
}
