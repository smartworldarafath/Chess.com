package com.google.inputmethod;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import androidx.compose.ui.text.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u00060\u0015j\u0002`\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/google/android/aj;", "Lcom/google/android/kf1;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/compose/ui/text/b;", "annotatedString", "", "a", "(Landroidx/compose/ui/text/b;)V", "", "e", "()Z", "Lcom/google/android/ef1;", "b", "()Lcom/google/android/ef1;", "clipEntry", "f", "(Lcom/google/android/ef1;)V", "Landroid/content/Context;", "Landroid/content/ClipboardManager;", "Landroid/content/ClipboardManager;", "_clipboardManager", "c", "()Landroid/content/ClipboardManager;", "clipboardManager", "Landroidx/compose/ui/platform/NativeClipboard;", "d", "nativeClipboard", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class aj implements kf1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private ClipboardManager _clipboardManager;

    public aj(Context context) {
        this.context = context;
    }

    private final ClipboardManager c() {
        ClipboardManager clipboardManager = this._clipboardManager;
        if (clipboardManager != null) {
            return clipboardManager;
        }
        Object systemService = this.context.getSystemService("clipboard");
        Intrinsics.h(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ClipboardManager clipboardManager2 = (ClipboardManager) systemService;
        this._clipboardManager = clipboardManager2;
        return clipboardManager2;
    }

    @Override // com.google.inputmethod.kf1
    public void a(b annotatedString) {
        c().setPrimaryClip(ClipData.newPlainText("plain text", bj.a(annotatedString)));
    }

    public ef1 b() {
        ClipData primaryClip = c().getPrimaryClip();
        if (primaryClip != null) {
            return new ef1(primaryClip);
        }
        return null;
    }

    public ClipboardManager d() {
        return c();
    }

    public boolean e() {
        ClipDescription primaryClipDescription = c().getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    public void f(ef1 clipEntry) {
        if (clipEntry == null) {
            nt.a(c());
        } else {
            c().setPrimaryClip(clipEntry.getClipData());
        }
    }
}
