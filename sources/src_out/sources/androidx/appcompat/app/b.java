package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.inputmethod.ax9;
import com.google.inputmethod.rv;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class b extends rv implements DialogInterface {
    final AlertController g;

    public static class a {
        private final AlertController.b P;
        private final int mTheme;

        public a(Context context) {
            this(context, b.p(context, 0));
        }

        public b create() {
            b bVar = new b(this.P.a, this.mTheme);
            this.P.a(bVar.g);
            bVar.setCancelable(this.P.r);
            if (this.P.r) {
                bVar.setCanceledOnTouchOutside(true);
            }
            bVar.setOnCancelListener(this.P.s);
            bVar.setOnDismissListener(this.P.t);
            DialogInterface.OnKeyListener onKeyListener = this.P.u;
            if (onKeyListener != null) {
                bVar.setOnKeyListener(onKeyListener);
            }
            return bVar;
        }

        public Context getContext() {
            return this.P.a;
        }

        public a setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.w = listAdapter;
            bVar.x = onClickListener;
            return this;
        }

        public a setCancelable(boolean z) {
            this.P.r = z;
            return this;
        }

        public a setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            AlertController.b bVar = this.P;
            bVar.K = cursor;
            bVar.L = str;
            bVar.x = onClickListener;
            return this;
        }

        public a setCustomTitle(View view) {
            this.P.g = view;
            return this;
        }

        public a setIcon(int i) {
            this.P.c = i;
            return this;
        }

        public a setIconAttribute(int i) {
            TypedValue typedValue = new TypedValue();
            this.P.a.getTheme().resolveAttribute(i, typedValue, true);
            this.P.c = typedValue.resourceId;
            return this;
        }

        @Deprecated
        public a setInverseBackgroundForced(boolean z) {
            this.P.N = z;
            return this;
        }

        public a setItems(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.v = bVar.a.getResources().getTextArray(i);
            this.P.x = onClickListener;
            return this;
        }

        public a setMessage(int i) {
            AlertController.b bVar = this.P;
            bVar.h = bVar.a.getText(i);
            return this;
        }

        public a setMultiChoiceItems(int i, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.b bVar = this.P;
            bVar.v = bVar.a.getResources().getTextArray(i);
            AlertController.b bVar2 = this.P;
            bVar2.J = onMultiChoiceClickListener;
            bVar2.F = zArr;
            bVar2.G = true;
            return this;
        }

        public a setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.l = bVar.a.getText(i);
            this.P.n = onClickListener;
            return this;
        }

        public a setNegativeButtonIcon(Drawable drawable) {
            this.P.m = drawable;
            return this;
        }

        public a setNeutralButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.o = bVar.a.getText(i);
            this.P.q = onClickListener;
            return this;
        }

        public a setNeutralButtonIcon(Drawable drawable) {
            this.P.p = drawable;
            return this;
        }

        public a setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
            this.P.s = onCancelListener;
            return this;
        }

        public a setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            this.P.t = onDismissListener;
            return this;
        }

        public a setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.P.O = onItemSelectedListener;
            return this;
        }

        public a setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
            this.P.u = onKeyListener;
            return this;
        }

        public a setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.i = bVar.a.getText(i);
            this.P.k = onClickListener;
            return this;
        }

        public a setPositiveButtonIcon(Drawable drawable) {
            this.P.j = drawable;
            return this;
        }

        public a setRecycleOnMeasureEnabled(boolean z) {
            this.P.P = z;
            return this;
        }

        public a setSingleChoiceItems(int i, int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.v = bVar.a.getResources().getTextArray(i);
            AlertController.b bVar2 = this.P;
            bVar2.x = onClickListener;
            bVar2.I = i2;
            bVar2.H = true;
            return this;
        }

        public a setTitle(int i) {
            AlertController.b bVar = this.P;
            bVar.f = bVar.a.getText(i);
            return this;
        }

        public a setView(int i) {
            AlertController.b bVar = this.P;
            bVar.z = null;
            bVar.y = i;
            bVar.E = false;
            return this;
        }

        public b show() {
            b bVarCreate = create();
            bVarCreate.show();
            return bVarCreate;
        }

        public a(Context context, int i) {
            this.P = new AlertController.b(new ContextThemeWrapper(context, b.p(context, i)));
            this.mTheme = i;
        }

        public a setIcon(Drawable drawable) {
            this.P.d = drawable;
            return this;
        }

        public a setMessage(CharSequence charSequence) {
            this.P.h = charSequence;
            return this;
        }

        public a setTitle(CharSequence charSequence) {
            this.P.f = charSequence;
            return this;
        }

        public a setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.v = charSequenceArr;
            bVar.x = onClickListener;
            return this;
        }

        public a setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.l = charSequence;
            bVar.n = onClickListener;
            return this;
        }

        public a setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.o = charSequence;
            bVar.q = onClickListener;
            return this;
        }

        public a setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.i = charSequence;
            bVar.k = onClickListener;
            return this;
        }

        public a setView(View view) {
            AlertController.b bVar = this.P;
            bVar.z = view;
            bVar.y = 0;
            bVar.E = false;
            return this;
        }

        public a setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.b bVar = this.P;
            bVar.v = charSequenceArr;
            bVar.J = onMultiChoiceClickListener;
            bVar.F = zArr;
            bVar.G = true;
            return this;
        }

        public a setSingleChoiceItems(Cursor cursor, int i, String str, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.K = cursor;
            bVar.x = onClickListener;
            bVar.I = i;
            bVar.L = str;
            bVar.H = true;
            return this;
        }

        @Deprecated
        public a setView(View view, int i, int i2, int i3, int i4) {
            AlertController.b bVar = this.P;
            bVar.z = view;
            bVar.y = 0;
            bVar.E = true;
            bVar.A = i;
            bVar.B = i2;
            bVar.C = i3;
            bVar.D = i4;
            return this;
        }

        public a setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.b bVar = this.P;
            bVar.K = cursor;
            bVar.J = onMultiChoiceClickListener;
            bVar.M = str;
            bVar.L = str2;
            bVar.G = true;
            return this;
        }

        public a setSingleChoiceItems(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.v = charSequenceArr;
            bVar.x = onClickListener;
            bVar.I = i;
            bVar.H = true;
            return this;
        }

        public a setSingleChoiceItems(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.w = listAdapter;
            bVar.x = onClickListener;
            bVar.I = i;
            bVar.H = true;
            return this;
        }
    }

    protected b(Context context, int i) {
        super(context, p(context, i));
        this.g = new AlertController(getContext(), this, getWindow());
    }

    static int p(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(ax9.o, typedValue, true);
        return typedValue.resourceId;
    }

    public Button n(int i) {
        return this.g.c(i);
    }

    public ListView o() {
        return this.g.e();
    }

    @Override // com.google.inputmethod.rv, com.google.inputmethod.hn1, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.g.f();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.g.g(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.g.h(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // com.google.inputmethod.rv, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.g.q(charSequence);
    }
}
