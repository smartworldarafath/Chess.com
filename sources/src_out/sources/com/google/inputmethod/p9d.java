package com.google.inputmethod;

import androidx.compose.p001foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode;
import androidx.compose.p001foundation.text.contextmenu.modifier.ToolbarHandlerState;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b!\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\u0003R$\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\u0006\"\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/google/android/p9d;", "", "<init>", "()V", "Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerNode;", "c", "()Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerNode;", "", "f", "b", "a", "Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerNode;", "d", "(Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerNode;)V", "toolbarHandlerNode", "Landroidx/compose/foundation/text/contextmenu/modifier/ToolbarHandlerState;", "Landroidx/compose/foundation/text/contextmenu/modifier/ToolbarHandlerState;", "getToolbarHandlerState$foundation", "()Landroidx/compose/foundation/text/contextmenu/modifier/ToolbarHandlerState;", "e", "(Landroidx/compose/foundation/text/contextmenu/modifier/ToolbarHandlerState;)V", "toolbarHandlerState", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class p9d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private TextContextMenuToolbarHandlerNode toolbarHandlerNode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private ToolbarHandlerState toolbarHandlerState = ToolbarHandlerState.Uninitialized;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextContextMenuToolbarHandlerNode getToolbarHandlerNode() {
        return this.toolbarHandlerNode;
    }

    public abstract void b();

    public final TextContextMenuToolbarHandlerNode c() {
        if (!(this.toolbarHandlerState != ToolbarHandlerState.Uninitialized)) {
            cx5.c("ToolbarRequester is not initialized.");
        }
        return this.toolbarHandlerNode;
    }

    public final void d(TextContextMenuToolbarHandlerNode textContextMenuToolbarHandlerNode) {
        this.toolbarHandlerNode = textContextMenuToolbarHandlerNode;
    }

    public final void e(ToolbarHandlerState toolbarHandlerState) {
        this.toolbarHandlerState = toolbarHandlerState;
    }

    public abstract void f();
}
