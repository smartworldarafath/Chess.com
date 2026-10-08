package com.google.inputmethod;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.k0;
import androidx.appcompat.widget.z;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class kec extends MenuInflater {
    static final Class<?>[] e;
    static final Class<?>[] f;
    final Object[] a;
    final Object[] b;
    Context c;
    private Object d;

    private static class a implements MenuItem.OnMenuItemClickListener {
        private static final Class<?>[] c = {MenuItem.class};
        private Object a;
        private Method b;

        public a(Object obj, String str) {
            this.a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.b = cls.getMethod(str, c);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.b.invoke(this.a, menuItem)).booleanValue();
                }
                this.b.invoke(this.a, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    private class b {
        x7 A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private PorterDuff.Mode E = null;
        private Menu a;
        private int b;
        private int c;
        private int d;
        private int e;
        private boolean f;
        private boolean g;
        private boolean h;
        private int i;
        private int j;
        private CharSequence k;
        private CharSequence l;
        private int m;
        private char n;
        private int o;
        private char p;
        private int q;
        private int r;
        private boolean s;
        private boolean t;
        private boolean u;
        private int v;
        private int w;
        private String x;
        private String y;
        private String z;

        public b(Menu menu) {
            this.a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private <T> T e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, kec.this.c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception unused) {
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
            int i = this.v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.z != null) {
                if (kec.this.c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(kec.this.b(), this.z));
            }
            if (this.r >= 2) {
                if (menuItem instanceof g) {
                    ((g) menuItem).t(true);
                } else if (menuItem instanceof mq7) {
                    ((mq7) menuItem).h(true);
                }
            }
            String str = this.x;
            if (str != null) {
                menuItem.setActionView((View) e(str, kec.e, kec.this.a));
                z = true;
            }
            int i2 = this.w;
            if (i2 > 0 && !z) {
                menuItem.setActionView(i2);
            }
            x7 x7Var = this.A;
            if (x7Var != null) {
                kq7.a(menuItem, x7Var);
            }
            kq7.c(menuItem, this.B);
            kq7.g(menuItem, this.C);
            kq7.b(menuItem, this.n, this.o);
            kq7.f(menuItem, this.p, this.q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                kq7.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                kq7.d(menuItem, colorStateList);
            }
        }

        public void a() {
            this.h = true;
            i(this.a.add(this.b, this.i, this.j, this.k));
        }

        public SubMenu b() {
            this.h = true;
            SubMenu subMenuAddSubMenu = this.a.addSubMenu(this.b, this.i, this.j, this.k);
            i(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public boolean d() {
            return this.h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = kec.this.c.obtainStyledAttributes(attributeSet, d1a.o1);
            this.b = typedArrayObtainStyledAttributes.getResourceId(d1a.q1, 0);
            this.c = typedArrayObtainStyledAttributes.getInt(d1a.s1, 0);
            this.d = typedArrayObtainStyledAttributes.getInt(d1a.t1, 0);
            this.e = typedArrayObtainStyledAttributes.getInt(d1a.u1, 0);
            this.f = typedArrayObtainStyledAttributes.getBoolean(d1a.r1, true);
            this.g = typedArrayObtainStyledAttributes.getBoolean(d1a.p1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            k0 k0VarU = k0.u(kec.this.c, attributeSet, d1a.v1);
            this.i = k0VarU.n(d1a.y1, 0);
            this.j = (k0VarU.k(d1a.B1, this.c) & (-65536)) | (k0VarU.k(d1a.C1, this.d) & 65535);
            this.k = k0VarU.p(d1a.D1);
            this.l = k0VarU.p(d1a.E1);
            this.m = k0VarU.n(d1a.w1, 0);
            this.n = c(k0VarU.o(d1a.F1));
            this.o = k0VarU.k(d1a.M1, 4096);
            this.p = c(k0VarU.o(d1a.G1));
            this.q = k0VarU.k(d1a.Q1, 4096);
            if (k0VarU.s(d1a.H1)) {
                this.r = k0VarU.a(d1a.H1, false) ? 1 : 0;
            } else {
                this.r = this.e;
            }
            this.s = k0VarU.a(d1a.z1, false);
            this.t = k0VarU.a(d1a.A1, this.f);
            this.u = k0VarU.a(d1a.x1, this.g);
            this.v = k0VarU.k(d1a.R1, -1);
            this.z = k0VarU.o(d1a.I1);
            this.w = k0VarU.n(d1a.J1, 0);
            this.x = k0VarU.o(d1a.L1);
            String strO = k0VarU.o(d1a.K1);
            this.y = strO;
            if (strO != null && this.w == 0 && this.x == null) {
                this.A = (x7) e(strO, kec.f, kec.this.b);
            } else {
                this.A = null;
            }
            this.B = k0VarU.p(d1a.N1);
            this.C = k0VarU.p(d1a.S1);
            if (k0VarU.s(d1a.P1)) {
                this.E = z.e(k0VarU.k(d1a.P1, -1), this.E);
            } else {
                this.E = null;
            }
            if (k0VarU.s(d1a.O1)) {
                this.D = k0VarU.c(d1a.O1);
            } else {
                this.D = null;
            }
            k0VarU.x();
            this.h = false;
        }

        public void h() {
            this.b = 0;
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = true;
            this.g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public kec(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                    break;
                }
                throw new RuntimeException("Expecting menu, got " + name);
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        z2 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        bVar.h();
                    } else if (name2.equals("item")) {
                        if (!bVar.d()) {
                            x7 x7Var = bVar.A;
                            if (x7Var == null || !x7Var.a()) {
                                bVar.a();
                            } else {
                                bVar.b();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z = true;
                    }
                }
            } else if (!z2) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    bVar.f(attributeSet);
                } else if (name3.equals("item")) {
                    bVar.g(attributeSet);
                } else if (name3.equals("menu")) {
                    c(xmlPullParser, attributeSet, bVar.b());
                } else {
                    str = name3;
                    z2 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    Object b() {
        if (this.d == null) {
            this.d = a(this.c);
        }
        return this.d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i, Menu menu) {
        if (!(menu instanceof jec)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.c.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof e) {
                    e eVar = (e) menu;
                    if (eVar.H()) {
                        eVar.i0();
                        z = true;
                    }
                }
                c(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((e) menu).h0();
                }
                if (layout != null) {
                    layout.close();
                }
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z) {
                ((e) menu).h0();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
