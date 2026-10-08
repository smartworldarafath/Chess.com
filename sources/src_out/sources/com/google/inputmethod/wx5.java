package com.google.inputmethod;

import android.content.ClipData;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public final class wx5 {

    class a extends InputConnectionWrapper {
        final /* synthetic */ b a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InputConnection inputConnection, boolean z, b bVar) {
            super(inputConnection, z);
            this.a = bVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
            if (this.a.a(xx5.f(inputContentInfo), i, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i, bundle);
        }
    }

    public interface b {
        boolean a(xx5 xx5Var, int i, Bundle bundle);
    }

    public static /* synthetic */ boolean a(View view, xx5 xx5Var, int i, Bundle bundle) {
        if ((i & 1) != 0) {
            try {
                xx5Var.d();
                Parcelable parcelable = (Parcelable) xx5Var.e();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception unused) {
                return false;
            }
        }
        return k7e.b0(view, new jz1.a(new ClipData(xx5Var.b(), new ClipData.Item(xx5Var.a())), 2).d(xx5Var.c()).b(bundle).a()) == null;
    }

    private static b b(final View view) {
        di9.g(view);
        return new b() { // from class: com.google.android.vx5
            @Override // com.google.android.wx5.b
            public final boolean a(xx5 xx5Var, int i, Bundle bundle) {
                return wx5.a(view, xx5Var, i, bundle);
            }
        };
    }

    public static InputConnection c(View view, InputConnection inputConnection, EditorInfo editorInfo) {
        return d(inputConnection, editorInfo, b(view));
    }

    @Deprecated
    public static InputConnection d(InputConnection inputConnection, EditorInfo editorInfo, b bVar) {
        mm8.d(inputConnection, "inputConnection must be non-null");
        mm8.d(editorInfo, "editorInfo must be non-null");
        mm8.d(bVar, "onCommitContentListener must be non-null");
        return new a(inputConnection, false, bVar);
    }
}
