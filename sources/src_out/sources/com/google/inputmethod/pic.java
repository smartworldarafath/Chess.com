package com.google.inputmethod;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
class pic {
    private final View a;
    private final ArrayList<d> b = new ArrayList<>();
    private uy5 c;
    private uy5 d;
    private int e;

    class a extends View {
        final /* synthetic */ ViewGroup a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, ViewGroup viewGroup) {
            super(context);
            this.a = viewGroup;
        }

        @Override // android.view.View
        protected void onConfigurationChanged(Configuration configuration) {
            Drawable background = this.a.getBackground();
            int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
            if (pic.this.e != color) {
                pic.this.e = color;
                for (int size = pic.this.b.size() - 1; size >= 0; size--) {
                    ((d) pic.this.b.get(size)).d(color);
                }
            }
        }
    }

    class b extends whe.b {
        private final HashMap<whe, Integer> c;

        b(int i) {
            super(i);
            this.c = new HashMap<>();
        }

        private boolean g(whe wheVar) {
            return (wheVar.d() & kie.s.i()) != 0;
        }

        @Override // com.google.android.whe.b
        public void c(whe wheVar) {
            if (g(wheVar)) {
                this.c.remove(wheVar);
                for (int size = pic.this.b.size() - 1; size >= 0; size--) {
                    ((d) pic.this.b.get(size)).c();
                }
            }
        }

        @Override // com.google.android.whe.b
        public void d(whe wheVar) {
            if (g(wheVar)) {
                for (int size = pic.this.b.size() - 1; size >= 0; size--) {
                    ((d) pic.this.b.get(size)).b();
                }
            }
        }

        @Override // com.google.android.whe.b
        public kie e(kie kieVar, List<whe> list) {
            RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
            int i = 0;
            for (int size = list.size() - 1; size >= 0; size--) {
                whe wheVar = list.get(size);
                Integer num = this.c.get(wheVar);
                if (num != null) {
                    int iIntValue = num.intValue();
                    float fA = wheVar.a();
                    if ((iIntValue & 1) != 0) {
                        rectF.left = fA;
                    }
                    if ((iIntValue & 2) != 0) {
                        rectF.top = fA;
                    }
                    if ((iIntValue & 4) != 0) {
                        rectF.right = fA;
                    }
                    if ((iIntValue & 8) != 0) {
                        rectF.bottom = fA;
                    }
                    i |= iIntValue;
                }
            }
            uy5 uy5VarJ = pic.this.j(kieVar);
            for (int size2 = pic.this.b.size() - 1; size2 >= 0; size2--) {
                ((d) pic.this.b.get(size2)).e(i, uy5VarJ, rectF);
            }
            return kieVar;
        }

        @Override // com.google.android.whe.b
        public whe.a f(whe wheVar, whe.a aVar) {
            if (!g(wheVar)) {
                return aVar;
            }
            uy5 uy5VarB = aVar.b();
            uy5 uy5VarA = aVar.a();
            int i = uy5VarB.a != uy5VarA.a ? 1 : 0;
            if (uy5VarB.b != uy5VarA.b) {
                i |= 2;
            }
            if (uy5VarB.c != uy5VarA.c) {
                i |= 4;
            }
            if (uy5VarB.d != uy5VarA.d) {
                i |= 8;
            }
            this.c.put(wheVar, Integer.valueOf(i));
            return aVar;
        }
    }

    class c implements View.OnAttachStateChangeListener {
        final /* synthetic */ ViewGroup a;
        final /* synthetic */ View b;
        final /* synthetic */ int c;

        c(ViewGroup viewGroup, View view, int i) {
            this.a = viewGroup;
            this.b = view;
            this.c = i;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.a.addView(this.b, this.c);
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            this.a.addView(this.b, this.c);
            view.removeOnAttachStateChangeListener(this);
        }
    }

    interface d {
        void a(uy5 uy5Var, uy5 uy5Var2);

        void b();

        void c();

        void d(int i);

        void e(int i, uy5 uy5Var, RectF rectF);
    }

    pic(ViewGroup viewGroup) {
        uy5 uy5Var = uy5.e;
        this.c = uy5Var;
        this.d = uy5Var;
        Drawable background = viewGroup.getBackground();
        this.e = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        a aVar = new a(viewGroup.getContext(), viewGroup);
        this.a = aVar;
        aVar.setVisibility(8);
        aVar.setWillNotDraw(true);
        k7e.z0(aVar, new vp8() { // from class: com.google.android.nic
            @Override // com.google.inputmethod.vp8
            public final kie a(View view, kie kieVar) {
                return pic.b(this.a, view, kieVar);
            }
        });
        k7e.G0(aVar, new b(0));
        h(viewGroup, aVar, 0);
    }

    public static /* synthetic */ void a(pic picVar) {
        ViewParent parent = picVar.a.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(picVar.a);
        }
    }

    public static /* synthetic */ kie b(pic picVar, View view, kie kieVar) {
        uy5 uy5VarJ = picVar.j(kieVar);
        uy5 uy5VarK = picVar.k(kieVar);
        if (!uy5VarJ.equals(picVar.c) || !uy5VarK.equals(picVar.d)) {
            picVar.c = uy5VarJ;
            picVar.d = uy5VarK;
            for (int size = picVar.b.size() - 1; size >= 0; size--) {
                picVar.b.get(size).a(uy5VarJ, uy5VarK);
            }
        }
        return kieVar;
    }

    private static void h(ViewGroup viewGroup, View view, int i) {
        View childAt;
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                childAt = null;
                break;
            }
            childAt = viewGroup.getChildAt(childCount);
            if (childAt.isAttachedToWindow() != viewGroup.isAttachedToWindow()) {
                break;
            } else {
                childCount--;
            }
        }
        if (childAt == null) {
            viewGroup.addView(view, i);
        } else {
            childAt.addOnAttachStateChangeListener(new c(viewGroup, view, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public uy5 j(kie kieVar) {
        return uy5.c(kieVar.g(kie.s.i()), kieVar.g(kie.s.k()));
    }

    private uy5 k(kie kieVar) {
        return uy5.c(kieVar.h(kie.s.i()), kieVar.h(kie.s.k()));
    }

    void g(d dVar) {
        if (this.b.contains(dVar)) {
            return;
        }
        this.b.add(dVar);
        dVar.a(this.c, this.d);
        dVar.d(this.e);
    }

    void i() {
        this.a.post(new Runnable() { // from class: com.google.android.oic
            @Override // java.lang.Runnable
            public final void run() {
                pic.a(this.a);
            }
        });
    }

    boolean l() {
        return !this.b.isEmpty();
    }

    void m(d dVar) {
        this.b.remove(dVar);
    }
}
