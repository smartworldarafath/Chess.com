package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.google.inputmethod.az9;
import com.google.inputmethod.gc5;
import com.google.inputmethod.hq2;
import com.google.inputmethod.lo6;
import com.google.inputmethod.t04;
import com.google.inputmethod.ul3;
import com.google.inputmethod.v0a;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class c {
    private static final int[] i = {0, 4, 8};
    private static SparseIntArray j = new SparseIntArray();
    private static SparseIntArray k = new SparseIntArray();
    private boolean a;
    public String b;
    public String c = "";
    private String[] d = new String[0];
    public int e = 0;
    private HashMap<String, ConstraintAttribute> f = new HashMap<>();
    private boolean g = true;
    private HashMap<Integer, a> h = new HashMap<>();

    public static class a {
        int a;
        String b;
        public final d c = new d();
        public final C0071c d = new C0071c();
        public final b e = new b();
        public final e f = new e();
        public HashMap<String, ConstraintAttribute> g = new HashMap<>();
        C0070a h;

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.c$a$a, reason: collision with other inner class name */
        static class C0070a {
            int[] a = new int[10];
            int[] b = new int[10];
            int c = 0;
            int[] d = new int[10];
            float[] e = new float[10];
            int f = 0;
            int[] g = new int[5];
            String[] h = new String[5];
            int i = 0;
            int[] j = new int[4];
            boolean[] k = new boolean[4];
            int l = 0;

            C0070a() {
            }

            void a(int i, float f) {
                int i2 = this.f;
                int[] iArr = this.d;
                if (i2 >= iArr.length) {
                    this.d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.e;
                    this.e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.d;
                int i3 = this.f;
                iArr2[i3] = i;
                float[] fArr2 = this.e;
                this.f = i3 + 1;
                fArr2[i3] = f;
            }

            void b(int i, int i2) {
                int i3 = this.c;
                int[] iArr = this.a;
                if (i3 >= iArr.length) {
                    this.a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.b;
                    this.b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.a;
                int i4 = this.c;
                iArr3[i4] = i;
                int[] iArr4 = this.b;
                this.c = i4 + 1;
                iArr4[i4] = i2;
            }

            void c(int i, String str) {
                int i2 = this.i;
                int[] iArr = this.g;
                if (i2 >= iArr.length) {
                    this.g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.h;
                    this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.g;
                int i3 = this.i;
                iArr2[i3] = i;
                String[] strArr2 = this.h;
                this.i = i3 + 1;
                strArr2[i3] = str;
            }

            void d(int i, boolean z) {
                int i2 = this.l;
                int[] iArr = this.j;
                if (i2 >= iArr.length) {
                    this.j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.k;
                    this.k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.j;
                int i3 = this.l;
                iArr2[i3] = i;
                boolean[] zArr2 = this.k;
                this.l = i3 + 1;
                zArr2[i3] = z;
            }

            void e(a aVar) {
                for (int i = 0; i < this.c; i++) {
                    c.P(aVar, this.a[i], this.b[i]);
                }
                for (int i2 = 0; i2 < this.f; i2++) {
                    c.O(aVar, this.d[i2], this.e[i2]);
                }
                for (int i3 = 0; i3 < this.i; i3++) {
                    c.Q(aVar, this.g[i3], this.h[i3]);
                }
                for (int i4 = 0; i4 < this.l; i4++) {
                    c.R(aVar, this.j[i4], this.k[i4]);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(int i, ConstraintLayout.b bVar) {
            this.a = i;
            b bVar2 = this.e;
            bVar2.j = bVar.e;
            bVar2.k = bVar.f;
            bVar2.l = bVar.g;
            bVar2.m = bVar.h;
            bVar2.n = bVar.i;
            bVar2.o = bVar.j;
            bVar2.p = bVar.k;
            bVar2.q = bVar.l;
            bVar2.r = bVar.m;
            bVar2.s = bVar.n;
            bVar2.t = bVar.o;
            bVar2.u = bVar.s;
            bVar2.v = bVar.t;
            bVar2.w = bVar.u;
            bVar2.x = bVar.v;
            bVar2.y = bVar.G;
            bVar2.z = bVar.H;
            bVar2.A = bVar.I;
            bVar2.B = bVar.p;
            bVar2.C = bVar.q;
            bVar2.D = bVar.r;
            bVar2.E = bVar.X;
            bVar2.F = bVar.Y;
            bVar2.G = bVar.Z;
            bVar2.h = bVar.c;
            bVar2.f = bVar.a;
            bVar2.g = bVar.b;
            bVar2.d = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.e = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.H = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.I = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.J = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.K = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.N = bVar.D;
            bVar2.V = bVar.M;
            bVar2.W = bVar.L;
            bVar2.Y = bVar.O;
            bVar2.X = bVar.N;
            bVar2.n0 = bVar.a0;
            bVar2.o0 = bVar.b0;
            bVar2.Z = bVar.P;
            bVar2.a0 = bVar.Q;
            bVar2.b0 = bVar.T;
            bVar2.c0 = bVar.U;
            bVar2.d0 = bVar.R;
            bVar2.e0 = bVar.S;
            bVar2.f0 = bVar.V;
            bVar2.g0 = bVar.W;
            bVar2.m0 = bVar.c0;
            bVar2.P = bVar.x;
            bVar2.R = bVar.z;
            bVar2.O = bVar.w;
            bVar2.Q = bVar.y;
            bVar2.T = bVar.A;
            bVar2.S = bVar.B;
            bVar2.U = bVar.C;
            bVar2.q0 = bVar.d0;
            bVar2.L = bVar.getMarginEnd();
            this.e.M = bVar.getMarginStart();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h(int i, androidx.constraintlayout.widget.d.a aVar) {
            g(i, aVar);
            this.c.d = aVar.x0;
            e eVar = this.f;
            eVar.b = aVar.A0;
            eVar.c = aVar.B0;
            eVar.d = aVar.C0;
            eVar.e = aVar.D0;
            eVar.f = aVar.E0;
            eVar.g = aVar.F0;
            eVar.h = aVar.G0;
            eVar.j = aVar.H0;
            eVar.k = aVar.I0;
            eVar.l = aVar.J0;
            eVar.n = aVar.z0;
            eVar.m = aVar.y0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i(androidx.constraintlayout.widget.a aVar, int i, androidx.constraintlayout.widget.d.a aVar2) {
            h(i, aVar2);
            if (aVar instanceof Barrier) {
                b bVar = this.e;
                bVar.j0 = 1;
                Barrier barrier = (Barrier) aVar;
                bVar.h0 = barrier.getType();
                this.e.k0 = barrier.getReferencedIds();
                this.e.i0 = barrier.getMargin();
            }
        }

        public void d(a aVar) {
            C0070a c0070a = this.h;
            if (c0070a != null) {
                c0070a.e(aVar);
            }
        }

        public void e(ConstraintLayout.b bVar) {
            b bVar2 = this.e;
            bVar.e = bVar2.j;
            bVar.f = bVar2.k;
            bVar.g = bVar2.l;
            bVar.h = bVar2.m;
            bVar.i = bVar2.n;
            bVar.j = bVar2.o;
            bVar.k = bVar2.p;
            bVar.l = bVar2.q;
            bVar.m = bVar2.r;
            bVar.n = bVar2.s;
            bVar.o = bVar2.t;
            bVar.s = bVar2.u;
            bVar.t = bVar2.v;
            bVar.u = bVar2.w;
            bVar.v = bVar2.x;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.H;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.I;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.J;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.K;
            bVar.A = bVar2.T;
            bVar.B = bVar2.S;
            bVar.x = bVar2.P;
            bVar.z = bVar2.R;
            bVar.G = bVar2.y;
            bVar.H = bVar2.z;
            bVar.p = bVar2.B;
            bVar.q = bVar2.C;
            bVar.r = bVar2.D;
            bVar.I = bVar2.A;
            bVar.X = bVar2.E;
            bVar.Y = bVar2.F;
            bVar.M = bVar2.V;
            bVar.L = bVar2.W;
            bVar.O = bVar2.Y;
            bVar.N = bVar2.X;
            bVar.a0 = bVar2.n0;
            bVar.b0 = bVar2.o0;
            bVar.P = bVar2.Z;
            bVar.Q = bVar2.a0;
            bVar.T = bVar2.b0;
            bVar.U = bVar2.c0;
            bVar.R = bVar2.d0;
            bVar.S = bVar2.e0;
            bVar.V = bVar2.f0;
            bVar.W = bVar2.g0;
            bVar.Z = bVar2.G;
            bVar.c = bVar2.h;
            bVar.a = bVar2.f;
            bVar.b = bVar2.g;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.d;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.e;
            String str = bVar2.m0;
            if (str != null) {
                bVar.c0 = str;
            }
            bVar.d0 = bVar2.q0;
            bVar.setMarginStart(bVar2.M);
            bVar.setMarginEnd(this.e.L);
            bVar.b();
        }

        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.e.a(this.e);
            aVar.d.a(this.d);
            aVar.c.a(this.c);
            aVar.f.a(this.f);
            aVar.a = this.a;
            aVar.h = this.h;
            return aVar;
        }
    }

    public static class b {
        private static SparseIntArray r0;
        public int d;
        public int e;
        public int[] k0;
        public String l0;
        public String m0;
        public boolean a = false;
        public boolean b = false;
        public boolean c = false;
        public int f = -1;
        public int g = -1;
        public float h = -1.0f;
        public boolean i = true;
        public int j = -1;
        public int k = -1;
        public int l = -1;
        public int m = -1;
        public int n = -1;
        public int o = -1;
        public int p = -1;
        public int q = -1;
        public int r = -1;
        public int s = -1;
        public int t = -1;
        public int u = -1;
        public int v = -1;
        public int w = -1;
        public int x = -1;
        public float y = 0.5f;
        public float z = 0.5f;
        public String A = null;
        public int B = -1;
        public int C = 0;
        public float D = 0.0f;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = 0;
        public int O = t04.INVALID_ID;
        public int P = t04.INVALID_ID;
        public int Q = t04.INVALID_ID;
        public int R = t04.INVALID_ID;
        public int S = t04.INVALID_ID;
        public int T = t04.INVALID_ID;
        public int U = t04.INVALID_ID;
        public float V = -1.0f;
        public float W = -1.0f;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;
        public int a0 = 0;
        public int b0 = 0;
        public int c0 = 0;
        public int d0 = 0;
        public int e0 = 0;
        public float f0 = 1.0f;
        public float g0 = 1.0f;
        public int h0 = -1;
        public int i0 = 0;
        public int j0 = -1;
        public boolean n0 = false;
        public boolean o0 = false;
        public boolean p0 = true;
        public int q0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            r0 = sparseIntArray;
            sparseIntArray.append(v0a.t7, 24);
            r0.append(v0a.u7, 25);
            r0.append(v0a.w7, 28);
            r0.append(v0a.x7, 29);
            r0.append(v0a.C7, 35);
            r0.append(v0a.B7, 34);
            r0.append(v0a.c7, 4);
            r0.append(v0a.b7, 3);
            r0.append(v0a.Z6, 1);
            r0.append(v0a.K7, 6);
            r0.append(v0a.L7, 7);
            r0.append(v0a.j7, 17);
            r0.append(v0a.k7, 18);
            r0.append(v0a.l7, 19);
            r0.append(v0a.V6, 90);
            r0.append(v0a.H6, 26);
            r0.append(v0a.y7, 31);
            r0.append(v0a.z7, 32);
            r0.append(v0a.i7, 10);
            r0.append(v0a.h7, 9);
            r0.append(v0a.O7, 13);
            r0.append(v0a.R7, 16);
            r0.append(v0a.P7, 14);
            r0.append(v0a.M7, 11);
            r0.append(v0a.Q7, 15);
            r0.append(v0a.N7, 12);
            r0.append(v0a.F7, 38);
            r0.append(v0a.r7, 37);
            r0.append(v0a.q7, 39);
            r0.append(v0a.E7, 40);
            r0.append(v0a.p7, 20);
            r0.append(v0a.D7, 36);
            r0.append(v0a.g7, 5);
            r0.append(v0a.s7, 91);
            r0.append(v0a.A7, 91);
            r0.append(v0a.v7, 91);
            r0.append(v0a.a7, 91);
            r0.append(v0a.Y6, 91);
            r0.append(v0a.K6, 23);
            r0.append(v0a.M6, 27);
            r0.append(v0a.O6, 30);
            r0.append(v0a.P6, 8);
            r0.append(v0a.L6, 33);
            r0.append(v0a.N6, 2);
            r0.append(v0a.I6, 22);
            r0.append(v0a.J6, 21);
            r0.append(v0a.G7, 41);
            r0.append(v0a.m7, 42);
            r0.append(v0a.X6, 87);
            r0.append(v0a.W6, 88);
            r0.append(v0a.S7, 76);
            r0.append(v0a.d7, 61);
            r0.append(v0a.f7, 62);
            r0.append(v0a.e7, 63);
            r0.append(v0a.J7, 69);
            r0.append(v0a.o7, 70);
            r0.append(v0a.T6, 71);
            r0.append(v0a.R6, 72);
            r0.append(v0a.S6, 73);
            r0.append(v0a.U6, 74);
            r0.append(v0a.Q6, 75);
            r0.append(v0a.H7, 84);
            r0.append(v0a.I7, 86);
            r0.append(v0a.H7, 83);
            r0.append(v0a.n7, 85);
            r0.append(v0a.G7, 87);
            r0.append(v0a.m7, 88);
            r0.append(v0a.s2, 89);
            r0.append(v0a.V6, 90);
        }

        public void a(b bVar) {
            this.a = bVar.a;
            this.d = bVar.d;
            this.b = bVar.b;
            this.e = bVar.e;
            this.f = bVar.f;
            this.g = bVar.g;
            this.h = bVar.h;
            this.i = bVar.i;
            this.j = bVar.j;
            this.k = bVar.k;
            this.l = bVar.l;
            this.m = bVar.m;
            this.n = bVar.n;
            this.o = bVar.o;
            this.p = bVar.p;
            this.q = bVar.q;
            this.r = bVar.r;
            this.s = bVar.s;
            this.t = bVar.t;
            this.u = bVar.u;
            this.v = bVar.v;
            this.w = bVar.w;
            this.x = bVar.x;
            this.y = bVar.y;
            this.z = bVar.z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.a0 = bVar.a0;
            this.b0 = bVar.b0;
            this.c0 = bVar.c0;
            this.d0 = bVar.d0;
            this.e0 = bVar.e0;
            this.f0 = bVar.f0;
            this.g0 = bVar.g0;
            this.h0 = bVar.h0;
            this.i0 = bVar.i0;
            this.j0 = bVar.j0;
            this.m0 = bVar.m0;
            int[] iArr = bVar.k0;
            if (iArr == null || bVar.l0 != null) {
                this.k0 = null;
            } else {
                this.k0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.l0 = bVar.l0;
            this.n0 = bVar.n0;
            this.o0 = bVar.o0;
            this.p0 = bVar.p0;
            this.q0 = bVar.q0;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v0a.G6);
            this.b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                int i2 = r0.get(index);
                switch (i2) {
                    case 1:
                        this.r = c.G(typedArrayObtainStyledAttributes, index, this.r);
                        break;
                    case 2:
                        this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 3:
                        this.q = c.G(typedArrayObtainStyledAttributes, index, this.q);
                        break;
                    case 4:
                        this.p = c.G(typedArrayObtainStyledAttributes, index, this.p);
                        break;
                    case 5:
                        this.A = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                        break;
                    case 7:
                        this.F = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.F);
                        break;
                    case 8:
                        this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    case lo6.HASACTION_FIELD_NUMBER /* 9 */:
                        this.x = c.G(typedArrayObtainStyledAttributes, index, this.x);
                        break;
                    case lo6.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                        this.w = c.G(typedArrayObtainStyledAttributes, index, this.w);
                        break;
                    case lo6.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                        this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 12:
                        this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        break;
                    case 13:
                        this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 14:
                        this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 15:
                        this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.T);
                        break;
                    case 16:
                        this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 17:
                        this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                        break;
                    case 18:
                        this.g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.g);
                        break;
                    case 19:
                        this.h = typedArrayObtainStyledAttributes.getFloat(index, this.h);
                        break;
                    case 20:
                        this.y = typedArrayObtainStyledAttributes.getFloat(index, this.y);
                        break;
                    case 21:
                        this.e = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.e);
                        break;
                    case 22:
                        this.d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.d);
                        break;
                    case 23:
                        this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 24:
                        this.j = c.G(typedArrayObtainStyledAttributes, index, this.j);
                        break;
                    case 25:
                        this.k = c.G(typedArrayObtainStyledAttributes, index, this.k);
                        break;
                    case 26:
                        this.G = typedArrayObtainStyledAttributes.getInt(index, this.G);
                        break;
                    case 27:
                        this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 28:
                        this.l = c.G(typedArrayObtainStyledAttributes, index, this.l);
                        break;
                    case 29:
                        this.m = c.G(typedArrayObtainStyledAttributes, index, this.m);
                        break;
                    case 30:
                        this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        break;
                    case 31:
                        this.u = c.G(typedArrayObtainStyledAttributes, index, this.u);
                        break;
                    case 32:
                        this.v = c.G(typedArrayObtainStyledAttributes, index, this.v);
                        break;
                    case 33:
                        this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 34:
                        this.o = c.G(typedArrayObtainStyledAttributes, index, this.o);
                        break;
                    case 35:
                        this.n = c.G(typedArrayObtainStyledAttributes, index, this.n);
                        break;
                    case 36:
                        this.z = typedArrayObtainStyledAttributes.getFloat(index, this.z);
                        break;
                    case 37:
                        this.W = typedArrayObtainStyledAttributes.getFloat(index, this.W);
                        break;
                    case 38:
                        this.V = typedArrayObtainStyledAttributes.getFloat(index, this.V);
                        break;
                    case 39:
                        this.X = typedArrayObtainStyledAttributes.getInt(index, this.X);
                        break;
                    case 40:
                        this.Y = typedArrayObtainStyledAttributes.getInt(index, this.Y);
                        break;
                    case 41:
                        c.H(this, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        c.H(this, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i2) {
                            case 61:
                                this.B = c.G(typedArrayObtainStyledAttributes, index, this.B);
                                break;
                            case 62:
                                this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            case 63:
                                this.D = typedArrayObtainStyledAttributes.getFloat(index, this.D);
                                break;
                            default:
                                switch (i2) {
                                    case 69:
                                        this.f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.g0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        break;
                                    case 72:
                                        this.h0 = typedArrayObtainStyledAttributes.getInt(index, this.h0);
                                        break;
                                    case 73:
                                        this.i0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.i0);
                                        break;
                                    case 74:
                                        this.l0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.p0 = typedArrayObtainStyledAttributes.getBoolean(index, this.p0);
                                        break;
                                    case 76:
                                        this.q0 = typedArrayObtainStyledAttributes.getInt(index, this.q0);
                                        break;
                                    case 77:
                                        this.s = c.G(typedArrayObtainStyledAttributes, index, this.s);
                                        break;
                                    case 78:
                                        this.t = c.G(typedArrayObtainStyledAttributes, index, this.t);
                                        break;
                                    case 79:
                                        this.U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.U);
                                        break;
                                    case 80:
                                        this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                                        break;
                                    case 81:
                                        this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                                        break;
                                    case 82:
                                        this.a0 = typedArrayObtainStyledAttributes.getInt(index, this.a0);
                                        break;
                                    case 83:
                                        this.c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.c0);
                                        break;
                                    case 84:
                                        this.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.b0);
                                        break;
                                    case 85:
                                        this.e0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.e0);
                                        break;
                                    case 86:
                                        this.d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.d0);
                                        break;
                                    case 87:
                                        this.n0 = typedArrayObtainStyledAttributes.getBoolean(index, this.n0);
                                        break;
                                    case 88:
                                        this.o0 = typedArrayObtainStyledAttributes.getBoolean(index, this.o0);
                                        break;
                                    case 89:
                                        this.m0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.i = typedArrayObtainStyledAttributes.getBoolean(index, this.i);
                                        break;
                                    case 91:
                                        Integer.toHexString(index);
                                        r0.get(index);
                                        break;
                                    default:
                                        Integer.toHexString(index);
                                        r0.get(index);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.c$c, reason: collision with other inner class name */
    public static class C0071c {
        private static SparseIntArray o;
        public boolean a = false;
        public int b = -1;
        public int c = 0;
        public String d = null;
        public int e = -1;
        public int f = 0;
        public float g = Float.NaN;
        public int h = -1;
        public float i = Float.NaN;
        public float j = Float.NaN;
        public int k = -1;
        public String l = null;
        public int m = -3;
        public int n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            o = sparseIntArray;
            sparseIntArray.append(v0a.Y7, 1);
            o.append(v0a.a8, 2);
            o.append(v0a.e8, 3);
            o.append(v0a.X7, 4);
            o.append(v0a.W7, 5);
            o.append(v0a.V7, 6);
            o.append(v0a.Z7, 7);
            o.append(v0a.d8, 8);
            o.append(v0a.c8, 9);
            o.append(v0a.b8, 10);
        }

        public void a(C0071c c0071c) {
            this.a = c0071c.a;
            this.b = c0071c.b;
            this.d = c0071c.d;
            this.e = c0071c.e;
            this.f = c0071c.f;
            this.i = c0071c.i;
            this.g = c0071c.g;
            this.h = c0071c.h;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v0a.U7);
            this.a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (o.get(index)) {
                    case 1:
                        this.i = typedArrayObtainStyledAttributes.getFloat(index, this.i);
                        break;
                    case 2:
                        this.e = typedArrayObtainStyledAttributes.getInt(index, this.e);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.d = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            this.d = ul3.c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        this.f = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.b = c.G(typedArrayObtainStyledAttributes, index, this.b);
                        break;
                    case 6:
                        this.c = typedArrayObtainStyledAttributes.getInteger(index, this.c);
                        break;
                    case 7:
                        this.g = typedArrayObtainStyledAttributes.getFloat(index, this.g);
                        break;
                    case 8:
                        this.k = typedArrayObtainStyledAttributes.getInteger(index, this.k);
                        break;
                    case lo6.HASACTION_FIELD_NUMBER /* 9 */:
                        this.j = typedArrayObtainStyledAttributes.getFloat(index, this.j);
                        break;
                    case lo6.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                        int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i2 == 1) {
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.n = resourceId;
                            if (resourceId != -1) {
                                this.m = -2;
                            }
                        } else if (i2 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.l = string;
                            if (string.indexOf("/") > 0) {
                                this.n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.m = -2;
                            } else {
                                this.m = -1;
                            }
                        } else {
                            this.m = typedArrayObtainStyledAttributes.getInteger(index, this.n);
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class d {
        public boolean a = false;
        public int b = 0;
        public int c = 0;
        public float d = 1.0f;
        public float e = Float.NaN;

        public void a(d dVar) {
            this.a = dVar.a;
            this.b = dVar.b;
            this.d = dVar.d;
            this.e = dVar.e;
            this.c = dVar.c;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v0a.S8);
            this.a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == v0a.U8) {
                    this.d = typedArrayObtainStyledAttributes.getFloat(index, this.d);
                } else if (index == v0a.T8) {
                    this.b = typedArrayObtainStyledAttributes.getInt(index, this.b);
                    this.b = c.i[this.b];
                } else if (index == v0a.W8) {
                    this.c = typedArrayObtainStyledAttributes.getInt(index, this.c);
                } else if (index == v0a.V8) {
                    this.e = typedArrayObtainStyledAttributes.getFloat(index, this.e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class e {
        private static SparseIntArray o;
        public boolean a = false;
        public float b = 0.0f;
        public float c = 0.0f;
        public float d = 0.0f;
        public float e = 1.0f;
        public float f = 1.0f;
        public float g = Float.NaN;
        public float h = Float.NaN;
        public int i = -1;
        public float j = 0.0f;
        public float k = 0.0f;
        public float l = 0.0f;
        public boolean m = false;
        public float n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            o = sparseIntArray;
            sparseIntArray.append(v0a.k9, 1);
            o.append(v0a.l9, 2);
            o.append(v0a.m9, 3);
            o.append(v0a.i9, 4);
            o.append(v0a.j9, 5);
            o.append(v0a.e9, 6);
            o.append(v0a.f9, 7);
            o.append(v0a.g9, 8);
            o.append(v0a.h9, 9);
            o.append(v0a.n9, 10);
            o.append(v0a.o9, 11);
            o.append(v0a.p9, 12);
        }

        public void a(e eVar) {
            this.a = eVar.a;
            this.b = eVar.b;
            this.c = eVar.c;
            this.d = eVar.d;
            this.e = eVar.e;
            this.f = eVar.f;
            this.g = eVar.g;
            this.h = eVar.h;
            this.i = eVar.i;
            this.j = eVar.j;
            this.k = eVar.k;
            this.l = eVar.l;
            this.m = eVar.m;
            this.n = eVar.n;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v0a.d9);
            this.a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (o.get(index)) {
                    case 1:
                        this.b = typedArrayObtainStyledAttributes.getFloat(index, this.b);
                        break;
                    case 2:
                        this.c = typedArrayObtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 3:
                        this.d = typedArrayObtainStyledAttributes.getFloat(index, this.d);
                        break;
                    case 4:
                        this.e = typedArrayObtainStyledAttributes.getFloat(index, this.e);
                        break;
                    case 5:
                        this.f = typedArrayObtainStyledAttributes.getFloat(index, this.f);
                        break;
                    case 6:
                        this.g = typedArrayObtainStyledAttributes.getDimension(index, this.g);
                        break;
                    case 7:
                        this.h = typedArrayObtainStyledAttributes.getDimension(index, this.h);
                        break;
                    case 8:
                        this.j = typedArrayObtainStyledAttributes.getDimension(index, this.j);
                        break;
                    case lo6.HASACTION_FIELD_NUMBER /* 9 */:
                        this.k = typedArrayObtainStyledAttributes.getDimension(index, this.k);
                        break;
                    case lo6.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                        this.l = typedArrayObtainStyledAttributes.getDimension(index, this.l);
                        break;
                    case lo6.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                        this.m = true;
                        this.n = typedArrayObtainStyledAttributes.getDimension(index, this.n);
                        break;
                    case 12:
                        this.i = c.G(typedArrayObtainStyledAttributes, index, this.i);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        j.append(v0a.i0, 25);
        j.append(v0a.j0, 26);
        j.append(v0a.l0, 29);
        j.append(v0a.m0, 30);
        j.append(v0a.s0, 36);
        j.append(v0a.r0, 35);
        j.append(v0a.P, 4);
        j.append(v0a.O, 3);
        j.append(v0a.K, 1);
        j.append(v0a.M, 91);
        j.append(v0a.L, 92);
        j.append(v0a.B0, 6);
        j.append(v0a.C0, 7);
        j.append(v0a.W, 17);
        j.append(v0a.X, 18);
        j.append(v0a.Y, 19);
        j.append(v0a.G, 99);
        j.append(v0a.c, 27);
        j.append(v0a.n0, 32);
        j.append(v0a.o0, 33);
        j.append(v0a.V, 10);
        j.append(v0a.U, 9);
        j.append(v0a.F0, 13);
        j.append(v0a.I0, 16);
        j.append(v0a.G0, 14);
        j.append(v0a.D0, 11);
        j.append(v0a.H0, 15);
        j.append(v0a.E0, 12);
        j.append(v0a.v0, 40);
        j.append(v0a.g0, 39);
        j.append(v0a.f0, 41);
        j.append(v0a.u0, 42);
        j.append(v0a.e0, 20);
        j.append(v0a.t0, 37);
        j.append(v0a.T, 5);
        j.append(v0a.h0, 87);
        j.append(v0a.q0, 87);
        j.append(v0a.k0, 87);
        j.append(v0a.N, 87);
        j.append(v0a.J, 87);
        j.append(v0a.h, 24);
        j.append(v0a.j, 28);
        j.append(v0a.v, 31);
        j.append(v0a.w, 8);
        j.append(v0a.i, 34);
        j.append(v0a.k, 2);
        j.append(v0a.f, 23);
        j.append(v0a.g, 21);
        j.append(v0a.w0, 95);
        j.append(v0a.Z, 96);
        j.append(v0a.e, 22);
        j.append(v0a.l, 43);
        j.append(v0a.y, 44);
        j.append(v0a.t, 45);
        j.append(v0a.u, 46);
        j.append(v0a.s, 60);
        j.append(v0a.q, 47);
        j.append(v0a.r, 48);
        j.append(v0a.m, 49);
        j.append(v0a.n, 50);
        j.append(v0a.o, 51);
        j.append(v0a.p, 52);
        j.append(v0a.x, 53);
        j.append(v0a.x0, 54);
        j.append(v0a.a0, 55);
        j.append(v0a.y0, 56);
        j.append(v0a.b0, 57);
        j.append(v0a.z0, 58);
        j.append(v0a.c0, 59);
        j.append(v0a.Q, 61);
        j.append(v0a.S, 62);
        j.append(v0a.R, 63);
        j.append(v0a.z, 64);
        j.append(v0a.S0, 65);
        j.append(v0a.F, 66);
        j.append(v0a.T0, 67);
        j.append(v0a.L0, 79);
        j.append(v0a.d, 38);
        j.append(v0a.K0, 68);
        j.append(v0a.A0, 69);
        j.append(v0a.d0, 70);
        j.append(v0a.J0, 97);
        j.append(v0a.D, 71);
        j.append(v0a.B, 72);
        j.append(v0a.C, 73);
        j.append(v0a.E, 74);
        j.append(v0a.A, 75);
        j.append(v0a.M0, 76);
        j.append(v0a.p0, 77);
        j.append(v0a.U0, 78);
        j.append(v0a.I, 80);
        j.append(v0a.H, 81);
        j.append(v0a.N0, 82);
        j.append(v0a.R0, 83);
        j.append(v0a.Q0, 84);
        j.append(v0a.P0, 85);
        j.append(v0a.O0, 86);
        k.append(v0a.Y3, 6);
        k.append(v0a.Y3, 7);
        k.append(v0a.T2, 27);
        k.append(v0a.b4, 13);
        k.append(v0a.e4, 16);
        k.append(v0a.c4, 14);
        k.append(v0a.Z3, 11);
        k.append(v0a.d4, 15);
        k.append(v0a.a4, 12);
        k.append(v0a.S3, 40);
        k.append(v0a.L3, 39);
        k.append(v0a.K3, 41);
        k.append(v0a.R3, 42);
        k.append(v0a.J3, 20);
        k.append(v0a.Q3, 37);
        k.append(v0a.D3, 5);
        k.append(v0a.M3, 87);
        k.append(v0a.P3, 87);
        k.append(v0a.N3, 87);
        k.append(v0a.A3, 87);
        k.append(v0a.z3, 87);
        k.append(v0a.Y2, 24);
        k.append(v0a.a3, 28);
        k.append(v0a.m3, 31);
        k.append(v0a.n3, 8);
        k.append(v0a.Z2, 34);
        k.append(v0a.b3, 2);
        k.append(v0a.W2, 23);
        k.append(v0a.X2, 21);
        k.append(v0a.T3, 95);
        k.append(v0a.E3, 96);
        k.append(v0a.V2, 22);
        k.append(v0a.c3, 43);
        k.append(v0a.p3, 44);
        k.append(v0a.k3, 45);
        k.append(v0a.l3, 46);
        k.append(v0a.j3, 60);
        k.append(v0a.h3, 47);
        k.append(v0a.i3, 48);
        k.append(v0a.d3, 49);
        k.append(v0a.e3, 50);
        k.append(v0a.f3, 51);
        k.append(v0a.g3, 52);
        k.append(v0a.o3, 53);
        k.append(v0a.U3, 54);
        k.append(v0a.F3, 55);
        k.append(v0a.V3, 56);
        k.append(v0a.G3, 57);
        k.append(v0a.W3, 58);
        k.append(v0a.H3, 59);
        k.append(v0a.C3, 62);
        k.append(v0a.B3, 63);
        k.append(v0a.q3, 64);
        k.append(v0a.p4, 65);
        k.append(v0a.w3, 66);
        k.append(v0a.q4, 67);
        k.append(v0a.h4, 79);
        k.append(v0a.U2, 38);
        k.append(v0a.i4, 98);
        k.append(v0a.g4, 68);
        k.append(v0a.X3, 69);
        k.append(v0a.I3, 70);
        k.append(v0a.u3, 71);
        k.append(v0a.s3, 72);
        k.append(v0a.t3, 73);
        k.append(v0a.v3, 74);
        k.append(v0a.r3, 75);
        k.append(v0a.j4, 76);
        k.append(v0a.O3, 77);
        k.append(v0a.r4, 78);
        k.append(v0a.y3, 80);
        k.append(v0a.x3, 81);
        k.append(v0a.k4, 82);
        k.append(v0a.o4, 83);
        k.append(v0a.n4, 84);
        k.append(v0a.m4, 85);
        k.append(v0a.l4, 86);
        k.append(v0a.f4, 97);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int G(TypedArray typedArray, int i2, int i3) {
        int resourceId = typedArray.getResourceId(i2, i3);
        return resourceId == -1 ? typedArray.getInt(i2, -1) : resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:23:0x0038  */
    /* JADX WARN: Code duplicated, block: B:25:0x003d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0042  */
    /* JADX WARN: Code duplicated, block: B:29:0x0046  */
    /* JADX WARN: Code duplicated, block: B:31:0x004a  */
    /* JADX WARN: Code duplicated, block: B:33:0x004f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0054  */
    /* JADX WARN: Code duplicated, block: B:37:0x0058  */
    /* JADX WARN: Code duplicated, block: B:39:0x005c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0067  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    static void H(Object obj, TypedArray typedArray, int i2, int i3) {
        int dimensionPixelSize;
        boolean z;
        a.C0070a c0070a;
        b bVar;
        ConstraintLayout.b bVar2;
        if (obj == null) {
            return;
        }
        int i4 = typedArray.peekValue(i2).type;
        if (i4 == 3) {
            I(obj, typedArray.getString(i2), i3);
            return;
        }
        int i5 = 0;
        if (i4 != 5) {
            dimensionPixelSize = typedArray.getInt(i2, 0);
            if (dimensionPixelSize == -4) {
                z = true;
                i5 = -2;
            } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                z = false;
            }
            if (obj instanceof ConstraintLayout.b) {
                bVar2 = (ConstraintLayout.b) obj;
                if (i3 == 0) {
                    ((ViewGroup.MarginLayoutParams) bVar2).width = i5;
                    bVar2.a0 = z;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) bVar2).height = i5;
                    bVar2.b0 = z;
                    return;
                }
            }
            if (obj instanceof b) {
                bVar = (b) obj;
                if (i3 == 0) {
                    bVar.d = i5;
                    bVar.n0 = z;
                    return;
                } else {
                    bVar.e = i5;
                    bVar.o0 = z;
                    return;
                }
            }
            if (obj instanceof a.C0070a) {
                c0070a = (a.C0070a) obj;
                if (i3 == 0) {
                    c0070a.b(23, i5);
                    c0070a.d(80, z);
                } else {
                    c0070a.b(21, i5);
                    c0070a.d(81, z);
                }
            }
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i2, 0);
        i5 = dimensionPixelSize;
        z = false;
        if (obj instanceof ConstraintLayout.b) {
            bVar2 = (ConstraintLayout.b) obj;
            if (i3 == 0) {
                ((ViewGroup.MarginLayoutParams) bVar2).width = i5;
                bVar2.a0 = z;
                return;
            } else {
                ((ViewGroup.MarginLayoutParams) bVar2).height = i5;
                bVar2.b0 = z;
                return;
            }
        }
        if (obj instanceof b) {
            bVar = (b) obj;
            if (i3 == 0) {
                bVar.d = i5;
                bVar.n0 = z;
                return;
            } else {
                bVar.e = i5;
                bVar.o0 = z;
                return;
            }
        }
        if (obj instanceof a.C0070a) {
            c0070a = (a.C0070a) obj;
            if (i3 == 0) {
                c0070a.b(23, i5);
                c0070a.d(80, z);
            } else {
                c0070a.b(21, i5);
                c0070a.d(81, z);
            }
        }
    }

    static void I(Object obj, String str, int i2) {
        if (str == null) {
            return;
        }
        int iIndexOf = str.indexOf(61);
        int length = str.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = str.substring(0, iIndexOf);
        String strSubstring2 = str.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof ConstraintLayout.b) {
                    ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                    if (i2 == 0) {
                        ((ViewGroup.MarginLayoutParams) bVar).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) bVar).height = 0;
                    }
                    J(bVar, strTrim2);
                    return;
                }
                if (obj instanceof b) {
                    ((b) obj).A = strTrim2;
                    return;
                } else {
                    if (obj instanceof a.C0070a) {
                        ((a.C0070a) obj).c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f = Float.parseFloat(strTrim2);
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar2).width = 0;
                            bVar2.L = f;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar2).height = 0;
                            bVar2.M = f;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar3 = (b) obj;
                        if (i2 == 0) {
                            bVar3.d = 0;
                            bVar3.W = f;
                            return;
                        } else {
                            bVar3.e = 0;
                            bVar3.V = f;
                            return;
                        }
                    }
                    if (obj instanceof a.C0070a) {
                        a.C0070a c0070a = (a.C0070a) obj;
                        if (i2 == 0) {
                            c0070a.b(23, 0);
                            c0070a.a(39, f);
                            return;
                        } else {
                            c0070a.b(21, 0);
                            c0070a.a(40, f);
                            return;
                        }
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar4 = (ConstraintLayout.b) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar4).width = 0;
                            bVar4.V = fMax;
                            bVar4.P = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar4).height = 0;
                            bVar4.W = fMax;
                            bVar4.Q = 2;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar5 = (b) obj;
                        if (i2 == 0) {
                            bVar5.d = 0;
                            bVar5.f0 = fMax;
                            bVar5.Z = 2;
                            return;
                        } else {
                            bVar5.e = 0;
                            bVar5.g0 = fMax;
                            bVar5.a0 = 2;
                            return;
                        }
                    }
                    if (obj instanceof a.C0070a) {
                        a.C0070a c0070a2 = (a.C0070a) obj;
                        if (i2 == 0) {
                            c0070a2.b(23, 0);
                            c0070a2.b(54, 2);
                        } else {
                            c0070a2.b(21, 0);
                            c0070a2.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    static void J(ConstraintLayout.b bVar, String str) {
        float fAbs = Float.NaN;
        int i2 = -1;
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i3 = 0;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase("W")) {
                    i2 = 0;
                } else if (strSubstring.equalsIgnoreCase("H")) {
                    i2 = 1;
                }
                i3 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i3);
                    if (strSubstring2.length() > 0) {
                        fAbs = Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i3, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f = Float.parseFloat(strSubstring3);
                        float f2 = Float.parseFloat(strSubstring4);
                        if (f > 0.0f && f2 > 0.0f) {
                            fAbs = i2 == 1 ? Math.abs(f2 / f) : Math.abs(f / f2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        bVar.I = str;
        bVar.J = fAbs;
        bVar.K = i2;
    }

    private void K(a aVar, TypedArray typedArray, boolean z) {
        if (z) {
            L(aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArray.getIndex(i2);
            if (index != v0a.d && v0a.v != index && v0a.w != index) {
                aVar.d.a = true;
                aVar.e.b = true;
                aVar.c.a = true;
                aVar.f.a = true;
            }
            switch (j.get(index)) {
                case 1:
                    b bVar = aVar.e;
                    bVar.r = G(typedArray, index, bVar.r);
                    break;
                case 2:
                    b bVar2 = aVar.e;
                    bVar2.K = typedArray.getDimensionPixelSize(index, bVar2.K);
                    break;
                case 3:
                    b bVar3 = aVar.e;
                    bVar3.q = G(typedArray, index, bVar3.q);
                    break;
                case 4:
                    b bVar4 = aVar.e;
                    bVar4.p = G(typedArray, index, bVar4.p);
                    break;
                case 5:
                    aVar.e.A = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.e;
                    bVar5.E = typedArray.getDimensionPixelOffset(index, bVar5.E);
                    break;
                case 7:
                    b bVar6 = aVar.e;
                    bVar6.F = typedArray.getDimensionPixelOffset(index, bVar6.F);
                    break;
                case 8:
                    b bVar7 = aVar.e;
                    bVar7.L = typedArray.getDimensionPixelSize(index, bVar7.L);
                    break;
                case lo6.HASACTION_FIELD_NUMBER /* 9 */:
                    b bVar8 = aVar.e;
                    bVar8.x = G(typedArray, index, bVar8.x);
                    break;
                case lo6.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                    b bVar9 = aVar.e;
                    bVar9.w = G(typedArray, index, bVar9.w);
                    break;
                case lo6.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                    b bVar10 = aVar.e;
                    bVar10.R = typedArray.getDimensionPixelSize(index, bVar10.R);
                    break;
                case 12:
                    b bVar11 = aVar.e;
                    bVar11.S = typedArray.getDimensionPixelSize(index, bVar11.S);
                    break;
                case 13:
                    b bVar12 = aVar.e;
                    bVar12.O = typedArray.getDimensionPixelSize(index, bVar12.O);
                    break;
                case 14:
                    b bVar13 = aVar.e;
                    bVar13.Q = typedArray.getDimensionPixelSize(index, bVar13.Q);
                    break;
                case 15:
                    b bVar14 = aVar.e;
                    bVar14.T = typedArray.getDimensionPixelSize(index, bVar14.T);
                    break;
                case 16:
                    b bVar15 = aVar.e;
                    bVar15.P = typedArray.getDimensionPixelSize(index, bVar15.P);
                    break;
                case 17:
                    b bVar16 = aVar.e;
                    bVar16.f = typedArray.getDimensionPixelOffset(index, bVar16.f);
                    break;
                case 18:
                    b bVar17 = aVar.e;
                    bVar17.g = typedArray.getDimensionPixelOffset(index, bVar17.g);
                    break;
                case 19:
                    b bVar18 = aVar.e;
                    bVar18.h = typedArray.getFloat(index, bVar18.h);
                    break;
                case 20:
                    b bVar19 = aVar.e;
                    bVar19.y = typedArray.getFloat(index, bVar19.y);
                    break;
                case 21:
                    b bVar20 = aVar.e;
                    bVar20.e = typedArray.getLayoutDimension(index, bVar20.e);
                    break;
                case 22:
                    d dVar = aVar.c;
                    dVar.b = typedArray.getInt(index, dVar.b);
                    d dVar2 = aVar.c;
                    dVar2.b = i[dVar2.b];
                    break;
                case 23:
                    b bVar21 = aVar.e;
                    bVar21.d = typedArray.getLayoutDimension(index, bVar21.d);
                    break;
                case 24:
                    b bVar22 = aVar.e;
                    bVar22.H = typedArray.getDimensionPixelSize(index, bVar22.H);
                    break;
                case 25:
                    b bVar23 = aVar.e;
                    bVar23.j = G(typedArray, index, bVar23.j);
                    break;
                case 26:
                    b bVar24 = aVar.e;
                    bVar24.k = G(typedArray, index, bVar24.k);
                    break;
                case 27:
                    b bVar25 = aVar.e;
                    bVar25.G = typedArray.getInt(index, bVar25.G);
                    break;
                case 28:
                    b bVar26 = aVar.e;
                    bVar26.I = typedArray.getDimensionPixelSize(index, bVar26.I);
                    break;
                case 29:
                    b bVar27 = aVar.e;
                    bVar27.l = G(typedArray, index, bVar27.l);
                    break;
                case 30:
                    b bVar28 = aVar.e;
                    bVar28.m = G(typedArray, index, bVar28.m);
                    break;
                case 31:
                    b bVar29 = aVar.e;
                    bVar29.M = typedArray.getDimensionPixelSize(index, bVar29.M);
                    break;
                case 32:
                    b bVar30 = aVar.e;
                    bVar30.u = G(typedArray, index, bVar30.u);
                    break;
                case 33:
                    b bVar31 = aVar.e;
                    bVar31.v = G(typedArray, index, bVar31.v);
                    break;
                case 34:
                    b bVar32 = aVar.e;
                    bVar32.J = typedArray.getDimensionPixelSize(index, bVar32.J);
                    break;
                case 35:
                    b bVar33 = aVar.e;
                    bVar33.o = G(typedArray, index, bVar33.o);
                    break;
                case 36:
                    b bVar34 = aVar.e;
                    bVar34.n = G(typedArray, index, bVar34.n);
                    break;
                case 37:
                    b bVar35 = aVar.e;
                    bVar35.z = typedArray.getFloat(index, bVar35.z);
                    break;
                case 38:
                    aVar.a = typedArray.getResourceId(index, aVar.a);
                    break;
                case 39:
                    b bVar36 = aVar.e;
                    bVar36.W = typedArray.getFloat(index, bVar36.W);
                    break;
                case 40:
                    b bVar37 = aVar.e;
                    bVar37.V = typedArray.getFloat(index, bVar37.V);
                    break;
                case 41:
                    b bVar38 = aVar.e;
                    bVar38.X = typedArray.getInt(index, bVar38.X);
                    break;
                case 42:
                    b bVar39 = aVar.e;
                    bVar39.Y = typedArray.getInt(index, bVar39.Y);
                    break;
                case 43:
                    d dVar3 = aVar.c;
                    dVar3.d = typedArray.getFloat(index, dVar3.d);
                    break;
                case 44:
                    e eVar = aVar.f;
                    eVar.m = true;
                    eVar.n = typedArray.getDimension(index, eVar.n);
                    break;
                case 45:
                    e eVar2 = aVar.f;
                    eVar2.c = typedArray.getFloat(index, eVar2.c);
                    break;
                case 46:
                    e eVar3 = aVar.f;
                    eVar3.d = typedArray.getFloat(index, eVar3.d);
                    break;
                case 47:
                    e eVar4 = aVar.f;
                    eVar4.e = typedArray.getFloat(index, eVar4.e);
                    break;
                case 48:
                    e eVar5 = aVar.f;
                    eVar5.f = typedArray.getFloat(index, eVar5.f);
                    break;
                case 49:
                    e eVar6 = aVar.f;
                    eVar6.g = typedArray.getDimension(index, eVar6.g);
                    break;
                case 50:
                    e eVar7 = aVar.f;
                    eVar7.h = typedArray.getDimension(index, eVar7.h);
                    break;
                case 51:
                    e eVar8 = aVar.f;
                    eVar8.j = typedArray.getDimension(index, eVar8.j);
                    break;
                case 52:
                    e eVar9 = aVar.f;
                    eVar9.k = typedArray.getDimension(index, eVar9.k);
                    break;
                case 53:
                    e eVar10 = aVar.f;
                    eVar10.l = typedArray.getDimension(index, eVar10.l);
                    break;
                case 54:
                    b bVar40 = aVar.e;
                    bVar40.Z = typedArray.getInt(index, bVar40.Z);
                    break;
                case 55:
                    b bVar41 = aVar.e;
                    bVar41.a0 = typedArray.getInt(index, bVar41.a0);
                    break;
                case 56:
                    b bVar42 = aVar.e;
                    bVar42.b0 = typedArray.getDimensionPixelSize(index, bVar42.b0);
                    break;
                case 57:
                    b bVar43 = aVar.e;
                    bVar43.c0 = typedArray.getDimensionPixelSize(index, bVar43.c0);
                    break;
                case 58:
                    b bVar44 = aVar.e;
                    bVar44.d0 = typedArray.getDimensionPixelSize(index, bVar44.d0);
                    break;
                case 59:
                    b bVar45 = aVar.e;
                    bVar45.e0 = typedArray.getDimensionPixelSize(index, bVar45.e0);
                    break;
                case 60:
                    e eVar11 = aVar.f;
                    eVar11.b = typedArray.getFloat(index, eVar11.b);
                    break;
                case 61:
                    b bVar46 = aVar.e;
                    bVar46.B = G(typedArray, index, bVar46.B);
                    break;
                case 62:
                    b bVar47 = aVar.e;
                    bVar47.C = typedArray.getDimensionPixelSize(index, bVar47.C);
                    break;
                case 63:
                    b bVar48 = aVar.e;
                    bVar48.D = typedArray.getFloat(index, bVar48.D);
                    break;
                case 64:
                    C0071c c0071c = aVar.d;
                    c0071c.b = G(typedArray, index, c0071c.b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.d.d = typedArray.getString(index);
                    } else {
                        aVar.d.d = ul3.c[typedArray.getInteger(index, 0)];
                    }
                    break;
                case 66:
                    aVar.d.f = typedArray.getInt(index, 0);
                    break;
                case 67:
                    C0071c c0071c2 = aVar.d;
                    c0071c2.i = typedArray.getFloat(index, c0071c2.i);
                    break;
                case 68:
                    d dVar4 = aVar.c;
                    dVar4.e = typedArray.getFloat(index, dVar4.e);
                    break;
                case 69:
                    aVar.e.f0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.e.g0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    break;
                case 72:
                    b bVar49 = aVar.e;
                    bVar49.h0 = typedArray.getInt(index, bVar49.h0);
                    break;
                case 73:
                    b bVar50 = aVar.e;
                    bVar50.i0 = typedArray.getDimensionPixelSize(index, bVar50.i0);
                    break;
                case 74:
                    aVar.e.l0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.e;
                    bVar51.p0 = typedArray.getBoolean(index, bVar51.p0);
                    break;
                case 76:
                    C0071c c0071c3 = aVar.d;
                    c0071c3.e = typedArray.getInt(index, c0071c3.e);
                    break;
                case 77:
                    aVar.e.m0 = typedArray.getString(index);
                    break;
                case 78:
                    d dVar5 = aVar.c;
                    dVar5.c = typedArray.getInt(index, dVar5.c);
                    break;
                case 79:
                    C0071c c0071c4 = aVar.d;
                    c0071c4.g = typedArray.getFloat(index, c0071c4.g);
                    break;
                case 80:
                    b bVar52 = aVar.e;
                    bVar52.n0 = typedArray.getBoolean(index, bVar52.n0);
                    break;
                case 81:
                    b bVar53 = aVar.e;
                    bVar53.o0 = typedArray.getBoolean(index, bVar53.o0);
                    break;
                case 82:
                    C0071c c0071c5 = aVar.d;
                    c0071c5.c = typedArray.getInteger(index, c0071c5.c);
                    break;
                case 83:
                    e eVar12 = aVar.f;
                    eVar12.i = G(typedArray, index, eVar12.i);
                    break;
                case 84:
                    C0071c c0071c6 = aVar.d;
                    c0071c6.k = typedArray.getInteger(index, c0071c6.k);
                    break;
                case 85:
                    C0071c c0071c7 = aVar.d;
                    c0071c7.j = typedArray.getFloat(index, c0071c7.j);
                    break;
                case 86:
                    int i3 = typedArray.peekValue(index).type;
                    if (i3 == 1) {
                        aVar.d.n = typedArray.getResourceId(index, -1);
                        C0071c c0071c8 = aVar.d;
                        if (c0071c8.n != -1) {
                            c0071c8.m = -2;
                        }
                    } else if (i3 == 3) {
                        aVar.d.l = typedArray.getString(index);
                        if (aVar.d.l.indexOf("/") > 0) {
                            aVar.d.n = typedArray.getResourceId(index, -1);
                            aVar.d.m = -2;
                        } else {
                            aVar.d.m = -1;
                        }
                    } else {
                        C0071c c0071c9 = aVar.d;
                        c0071c9.m = typedArray.getInteger(index, c0071c9.n);
                    }
                    break;
                case 87:
                    Integer.toHexString(index);
                    j.get(index);
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    Integer.toHexString(index);
                    j.get(index);
                    break;
                case 91:
                    b bVar54 = aVar.e;
                    bVar54.s = G(typedArray, index, bVar54.s);
                    break;
                case 92:
                    b bVar55 = aVar.e;
                    bVar55.t = G(typedArray, index, bVar55.t);
                    break;
                case 93:
                    b bVar56 = aVar.e;
                    bVar56.N = typedArray.getDimensionPixelSize(index, bVar56.N);
                    break;
                case 94:
                    b bVar57 = aVar.e;
                    bVar57.U = typedArray.getDimensionPixelSize(index, bVar57.U);
                    break;
                case 95:
                    H(aVar.e, typedArray, index, 0);
                    break;
                case 96:
                    H(aVar.e, typedArray, index, 1);
                    break;
                case 97:
                    b bVar58 = aVar.e;
                    bVar58.q0 = typedArray.getInt(index, bVar58.q0);
                    break;
            }
        }
        b bVar59 = aVar.e;
        if (bVar59.l0 != null) {
            bVar59.k0 = null;
        }
    }

    private static void L(a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        a.C0070a c0070a = new a.C0070a();
        aVar.h = c0070a;
        aVar.d.a = false;
        aVar.e.b = false;
        aVar.c.a = false;
        aVar.f.a = false;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArray.getIndex(i2);
            switch (k.get(index)) {
                case 2:
                    c0070a.b(2, typedArray.getDimensionPixelSize(index, aVar.e.K));
                    break;
                case 3:
                case 4:
                case lo6.HASACTION_FIELD_NUMBER /* 9 */:
                case lo6.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Integer.toHexString(index);
                    j.get(index);
                    break;
                case 5:
                    c0070a.c(5, typedArray.getString(index));
                    break;
                case 6:
                    c0070a.b(6, typedArray.getDimensionPixelOffset(index, aVar.e.E));
                    break;
                case 7:
                    c0070a.b(7, typedArray.getDimensionPixelOffset(index, aVar.e.F));
                    break;
                case 8:
                    c0070a.b(8, typedArray.getDimensionPixelSize(index, aVar.e.L));
                    break;
                case lo6.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                    c0070a.b(11, typedArray.getDimensionPixelSize(index, aVar.e.R));
                    break;
                case 12:
                    c0070a.b(12, typedArray.getDimensionPixelSize(index, aVar.e.S));
                    break;
                case 13:
                    c0070a.b(13, typedArray.getDimensionPixelSize(index, aVar.e.O));
                    break;
                case 14:
                    c0070a.b(14, typedArray.getDimensionPixelSize(index, aVar.e.Q));
                    break;
                case 15:
                    c0070a.b(15, typedArray.getDimensionPixelSize(index, aVar.e.T));
                    break;
                case 16:
                    c0070a.b(16, typedArray.getDimensionPixelSize(index, aVar.e.P));
                    break;
                case 17:
                    c0070a.b(17, typedArray.getDimensionPixelOffset(index, aVar.e.f));
                    break;
                case 18:
                    c0070a.b(18, typedArray.getDimensionPixelOffset(index, aVar.e.g));
                    break;
                case 19:
                    c0070a.a(19, typedArray.getFloat(index, aVar.e.h));
                    break;
                case 20:
                    c0070a.a(20, typedArray.getFloat(index, aVar.e.y));
                    break;
                case 21:
                    c0070a.b(21, typedArray.getLayoutDimension(index, aVar.e.e));
                    break;
                case 22:
                    c0070a.b(22, i[typedArray.getInt(index, aVar.c.b)]);
                    break;
                case 23:
                    c0070a.b(23, typedArray.getLayoutDimension(index, aVar.e.d));
                    break;
                case 24:
                    c0070a.b(24, typedArray.getDimensionPixelSize(index, aVar.e.H));
                    break;
                case 27:
                    c0070a.b(27, typedArray.getInt(index, aVar.e.G));
                    break;
                case 28:
                    c0070a.b(28, typedArray.getDimensionPixelSize(index, aVar.e.I));
                    break;
                case 31:
                    c0070a.b(31, typedArray.getDimensionPixelSize(index, aVar.e.M));
                    break;
                case 34:
                    c0070a.b(34, typedArray.getDimensionPixelSize(index, aVar.e.J));
                    break;
                case 37:
                    c0070a.a(37, typedArray.getFloat(index, aVar.e.z));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, aVar.a);
                    aVar.a = resourceId;
                    c0070a.b(38, resourceId);
                    break;
                case 39:
                    c0070a.a(39, typedArray.getFloat(index, aVar.e.W));
                    break;
                case 40:
                    c0070a.a(40, typedArray.getFloat(index, aVar.e.V));
                    break;
                case 41:
                    c0070a.b(41, typedArray.getInt(index, aVar.e.X));
                    break;
                case 42:
                    c0070a.b(42, typedArray.getInt(index, aVar.e.Y));
                    break;
                case 43:
                    c0070a.a(43, typedArray.getFloat(index, aVar.c.d));
                    break;
                case 44:
                    c0070a.d(44, true);
                    c0070a.a(44, typedArray.getDimension(index, aVar.f.n));
                    break;
                case 45:
                    c0070a.a(45, typedArray.getFloat(index, aVar.f.c));
                    break;
                case 46:
                    c0070a.a(46, typedArray.getFloat(index, aVar.f.d));
                    break;
                case 47:
                    c0070a.a(47, typedArray.getFloat(index, aVar.f.e));
                    break;
                case 48:
                    c0070a.a(48, typedArray.getFloat(index, aVar.f.f));
                    break;
                case 49:
                    c0070a.a(49, typedArray.getDimension(index, aVar.f.g));
                    break;
                case 50:
                    c0070a.a(50, typedArray.getDimension(index, aVar.f.h));
                    break;
                case 51:
                    c0070a.a(51, typedArray.getDimension(index, aVar.f.j));
                    break;
                case 52:
                    c0070a.a(52, typedArray.getDimension(index, aVar.f.k));
                    break;
                case 53:
                    c0070a.a(53, typedArray.getDimension(index, aVar.f.l));
                    break;
                case 54:
                    c0070a.b(54, typedArray.getInt(index, aVar.e.Z));
                    break;
                case 55:
                    c0070a.b(55, typedArray.getInt(index, aVar.e.a0));
                    break;
                case 56:
                    c0070a.b(56, typedArray.getDimensionPixelSize(index, aVar.e.b0));
                    break;
                case 57:
                    c0070a.b(57, typedArray.getDimensionPixelSize(index, aVar.e.c0));
                    break;
                case 58:
                    c0070a.b(58, typedArray.getDimensionPixelSize(index, aVar.e.d0));
                    break;
                case 59:
                    c0070a.b(59, typedArray.getDimensionPixelSize(index, aVar.e.e0));
                    break;
                case 60:
                    c0070a.a(60, typedArray.getFloat(index, aVar.f.b));
                    break;
                case 62:
                    c0070a.b(62, typedArray.getDimensionPixelSize(index, aVar.e.C));
                    break;
                case 63:
                    c0070a.a(63, typedArray.getFloat(index, aVar.e.D));
                    break;
                case 64:
                    c0070a.b(64, G(typedArray, index, aVar.d.b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c0070a.c(65, typedArray.getString(index));
                    } else {
                        c0070a.c(65, ul3.c[typedArray.getInteger(index, 0)]);
                    }
                    break;
                case 66:
                    c0070a.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    c0070a.a(67, typedArray.getFloat(index, aVar.d.i));
                    break;
                case 68:
                    c0070a.a(68, typedArray.getFloat(index, aVar.c.e));
                    break;
                case 69:
                    c0070a.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    c0070a.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    break;
                case 72:
                    c0070a.b(72, typedArray.getInt(index, aVar.e.h0));
                    break;
                case 73:
                    c0070a.b(73, typedArray.getDimensionPixelSize(index, aVar.e.i0));
                    break;
                case 74:
                    c0070a.c(74, typedArray.getString(index));
                    break;
                case 75:
                    c0070a.d(75, typedArray.getBoolean(index, aVar.e.p0));
                    break;
                case 76:
                    c0070a.b(76, typedArray.getInt(index, aVar.d.e));
                    break;
                case 77:
                    c0070a.c(77, typedArray.getString(index));
                    break;
                case 78:
                    c0070a.b(78, typedArray.getInt(index, aVar.c.c));
                    break;
                case 79:
                    c0070a.a(79, typedArray.getFloat(index, aVar.d.g));
                    break;
                case 80:
                    c0070a.d(80, typedArray.getBoolean(index, aVar.e.n0));
                    break;
                case 81:
                    c0070a.d(81, typedArray.getBoolean(index, aVar.e.o0));
                    break;
                case 82:
                    c0070a.b(82, typedArray.getInteger(index, aVar.d.c));
                    break;
                case 83:
                    c0070a.b(83, G(typedArray, index, aVar.f.i));
                    break;
                case 84:
                    c0070a.b(84, typedArray.getInteger(index, aVar.d.k));
                    break;
                case 85:
                    c0070a.a(85, typedArray.getFloat(index, aVar.d.j));
                    break;
                case 86:
                    int i3 = typedArray.peekValue(index).type;
                    if (i3 == 1) {
                        aVar.d.n = typedArray.getResourceId(index, -1);
                        c0070a.b(89, aVar.d.n);
                        C0071c c0071c = aVar.d;
                        if (c0071c.n != -1) {
                            c0071c.m = -2;
                            c0070a.b(88, -2);
                        }
                    } else if (i3 == 3) {
                        aVar.d.l = typedArray.getString(index);
                        c0070a.c(90, aVar.d.l);
                        if (aVar.d.l.indexOf("/") > 0) {
                            aVar.d.n = typedArray.getResourceId(index, -1);
                            c0070a.b(89, aVar.d.n);
                            aVar.d.m = -2;
                            c0070a.b(88, -2);
                        } else {
                            aVar.d.m = -1;
                            c0070a.b(88, -1);
                        }
                    } else {
                        C0071c c0071c2 = aVar.d;
                        c0071c2.m = typedArray.getInteger(index, c0071c2.n);
                        c0070a.b(88, aVar.d.m);
                    }
                    break;
                case 87:
                    Integer.toHexString(index);
                    j.get(index);
                    break;
                case 93:
                    c0070a.b(93, typedArray.getDimensionPixelSize(index, aVar.e.N));
                    break;
                case 94:
                    c0070a.b(94, typedArray.getDimensionPixelSize(index, aVar.e.U));
                    break;
                case 95:
                    H(c0070a, typedArray, index, 0);
                    break;
                case 96:
                    H(c0070a, typedArray, index, 1);
                    break;
                case 97:
                    c0070a.b(97, typedArray.getInt(index, aVar.e.q0));
                    break;
                case 98:
                    if (MotionLayout.d1) {
                        int resourceId2 = typedArray.getResourceId(index, aVar.a);
                        aVar.a = resourceId2;
                        if (resourceId2 == -1) {
                            aVar.b = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        aVar.b = typedArray.getString(index);
                    } else {
                        aVar.a = typedArray.getResourceId(index, aVar.a);
                    }
                    break;
                case 99:
                    c0070a.d(99, typedArray.getBoolean(index, aVar.e.i));
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void O(a aVar, int i2, float f) {
        if (i2 == 19) {
            aVar.e.h = f;
            return;
        }
        if (i2 == 20) {
            aVar.e.y = f;
            return;
        }
        if (i2 == 37) {
            aVar.e.z = f;
            return;
        }
        if (i2 == 60) {
            aVar.f.b = f;
            return;
        }
        if (i2 == 63) {
            aVar.e.D = f;
            return;
        }
        if (i2 == 79) {
            aVar.d.g = f;
            return;
        }
        if (i2 == 85) {
            aVar.d.j = f;
            return;
        }
        if (i2 == 39) {
            aVar.e.W = f;
            return;
        }
        if (i2 == 40) {
            aVar.e.V = f;
            return;
        }
        switch (i2) {
            case 43:
                aVar.c.d = f;
                break;
            case 44:
                e eVar = aVar.f;
                eVar.n = f;
                eVar.m = true;
                break;
            case 45:
                aVar.f.c = f;
                break;
            case 46:
                aVar.f.d = f;
                break;
            case 47:
                aVar.f.e = f;
                break;
            case 48:
                aVar.f.f = f;
                break;
            case 49:
                aVar.f.g = f;
                break;
            case 50:
                aVar.f.h = f;
                break;
            case 51:
                aVar.f.j = f;
                break;
            case 52:
                aVar.f.k = f;
                break;
            case 53:
                aVar.f.l = f;
                break;
            default:
                switch (i2) {
                    case 67:
                        aVar.d.i = f;
                        break;
                    case 68:
                        aVar.c.e = f;
                        break;
                    case 69:
                        aVar.e.f0 = f;
                        break;
                    case 70:
                        aVar.e.g0 = f;
                        break;
                }
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void P(a aVar, int i2, int i3) {
        if (i2 == 6) {
            aVar.e.E = i3;
            return;
        }
        if (i2 == 7) {
            aVar.e.F = i3;
            return;
        }
        if (i2 == 8) {
            aVar.e.L = i3;
            return;
        }
        if (i2 == 27) {
            aVar.e.G = i3;
            return;
        }
        if (i2 == 28) {
            aVar.e.I = i3;
            return;
        }
        if (i2 == 41) {
            aVar.e.X = i3;
            return;
        }
        if (i2 == 42) {
            aVar.e.Y = i3;
            return;
        }
        if (i2 == 61) {
            aVar.e.B = i3;
            return;
        }
        if (i2 == 62) {
            aVar.e.C = i3;
            return;
        }
        if (i2 == 72) {
            aVar.e.h0 = i3;
            return;
        }
        if (i2 == 73) {
            aVar.e.i0 = i3;
            return;
        }
        if (i2 == 88) {
            aVar.d.m = i3;
            return;
        }
        if (i2 == 89) {
            aVar.d.n = i3;
            return;
        }
        switch (i2) {
            case 2:
                aVar.e.K = i3;
                break;
            case lo6.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                aVar.e.R = i3;
                break;
            case 12:
                aVar.e.S = i3;
                break;
            case 13:
                aVar.e.O = i3;
                break;
            case 14:
                aVar.e.Q = i3;
                break;
            case 15:
                aVar.e.T = i3;
                break;
            case 16:
                aVar.e.P = i3;
                break;
            case 17:
                aVar.e.f = i3;
                break;
            case 18:
                aVar.e.g = i3;
                break;
            case 31:
                aVar.e.M = i3;
                break;
            case 34:
                aVar.e.J = i3;
                break;
            case 38:
                aVar.a = i3;
                break;
            case 64:
                aVar.d.b = i3;
                break;
            case 66:
                aVar.d.f = i3;
                break;
            case 76:
                aVar.d.e = i3;
                break;
            case 78:
                aVar.c.c = i3;
                break;
            case 93:
                aVar.e.N = i3;
                break;
            case 94:
                aVar.e.U = i3;
                break;
            case 97:
                aVar.e.q0 = i3;
                break;
            default:
                switch (i2) {
                    case 21:
                        aVar.e.e = i3;
                        break;
                    case 22:
                        aVar.c.b = i3;
                        break;
                    case 23:
                        aVar.e.d = i3;
                        break;
                    case 24:
                        aVar.e.H = i3;
                        break;
                    default:
                        switch (i2) {
                            case 54:
                                aVar.e.Z = i3;
                                break;
                            case 55:
                                aVar.e.a0 = i3;
                                break;
                            case 56:
                                aVar.e.b0 = i3;
                                break;
                            case 57:
                                aVar.e.c0 = i3;
                                break;
                            case 58:
                                aVar.e.d0 = i3;
                                break;
                            case 59:
                                aVar.e.e0 = i3;
                                break;
                            default:
                                switch (i2) {
                                    case 82:
                                        aVar.d.c = i3;
                                        break;
                                    case 83:
                                        aVar.f.i = i3;
                                        break;
                                    case 84:
                                        aVar.d.k = i3;
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Q(a aVar, int i2, String str) {
        if (i2 == 5) {
            aVar.e.A = str;
            return;
        }
        if (i2 == 65) {
            aVar.d.d = str;
            return;
        }
        if (i2 == 74) {
            b bVar = aVar.e;
            bVar.l0 = str;
            bVar.k0 = null;
        } else if (i2 == 77) {
            aVar.e.m0 = str;
        } else {
            if (i2 != 90) {
                return;
            }
            aVar.d.l = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void R(a aVar, int i2, boolean z) {
        if (i2 == 44) {
            aVar.f.m = z;
            return;
        }
        if (i2 == 75) {
            aVar.e.p0 = z;
        } else if (i2 == 80) {
            aVar.e.n0 = z;
        } else {
            if (i2 != 81) {
                return;
            }
            aVar.e.o0 = z;
        }
    }

    private String X(int i2) {
        switch (i2) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public static a m(Context context, XmlPullParser xmlPullParser) {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSetAsAttributeSet, v0a.S2);
        L(aVar, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    private int[] u(View view, String str) {
        int iIntValue;
        Object objK;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < strArrSplit.length) {
            String strTrim = strArrSplit[i2].trim();
            try {
                iIntValue = az9.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objK = ((ConstraintLayout) view.getParent()).k(0, strTrim)) != null && (objK instanceof Integer)) {
                iIntValue = ((Integer) objK).intValue();
            }
            iArr[i3] = iIntValue;
            i2++;
            i3++;
        }
        return i3 != strArrSplit.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    private a v(Context context, AttributeSet attributeSet, boolean z) {
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? v0a.S2 : v0a.b);
        K(aVar, typedArrayObtainStyledAttributes, z);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    private a w(int i2) {
        if (!this.h.containsKey(Integer.valueOf(i2))) {
            this.h.put(Integer.valueOf(i2), new a());
        }
        return this.h.get(Integer.valueOf(i2));
    }

    public a A(int i2) {
        return w(i2);
    }

    public int B(int i2) {
        return w(i2).c.b;
    }

    public int C(int i2) {
        return w(i2).c.c;
    }

    public int D(int i2) {
        return w(i2).e.d;
    }

    public void E(Context context, int i2) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    a aVarV = v(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarV.e.a = true;
                    }
                    this.h.put(Integer.valueOf(aVarV.a), aVarV);
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void F(Context context, XmlPullParser xmlPullParser) {
        try {
            int eventType = xmlPullParser.getEventType();
            a aVarV = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlPullParser.getName();
                } else if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case -2025855158:
                            if (!name.equals("Layout")) {
                                continue;
                            } else {
                                if (aVarV == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarV.e.b(context, Xml.asAttributeSet(xmlPullParser));
                            }
                            break;
                        case -1984451626:
                            if (!name.equals("Motion")) {
                                continue;
                            } else {
                                if (aVarV == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarV.d.b(context, Xml.asAttributeSet(xmlPullParser));
                            }
                            break;
                        case -1962203927:
                            if (!name.equals("ConstraintOverride")) {
                                continue;
                            } else {
                                aVarV = v(context, Xml.asAttributeSet(xmlPullParser), true);
                            }
                            break;
                        case -1269513683:
                            if (!name.equals("PropertySet")) {
                                continue;
                            } else {
                                if (aVarV == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarV.c.b(context, Xml.asAttributeSet(xmlPullParser));
                            }
                            break;
                        case -1238332596:
                            if (!name.equals("Transform")) {
                                continue;
                            } else {
                                if (aVarV == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarV.f.b(context, Xml.asAttributeSet(xmlPullParser));
                            }
                            break;
                        case -71750448:
                            if (!name.equals("Guideline")) {
                                continue;
                            } else {
                                aVarV = v(context, Xml.asAttributeSet(xmlPullParser), false);
                                b bVar = aVarV.e;
                                bVar.a = true;
                                bVar.b = true;
                            }
                            break;
                        case 366511058:
                            if (!name.equals("CustomMethod")) {
                                continue;
                            }
                            break;
                        case 1331510167:
                            if (!name.equals("Barrier")) {
                                continue;
                            } else {
                                aVarV = v(context, Xml.asAttributeSet(xmlPullParser), false);
                                aVarV.e.j0 = 1;
                            }
                            break;
                        case 1791837707:
                            if (!name.equals("CustomAttribute")) {
                                continue;
                            }
                            break;
                        case 1803088381:
                            if (!name.equals("Constraint")) {
                                continue;
                            } else {
                                aVarV = v(context, Xml.asAttributeSet(xmlPullParser), false);
                            }
                            break;
                        default:
                            continue;
                    }
                    if (aVarV == null) {
                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                    }
                    ConstraintAttribute.i(context, xmlPullParser, aVarV.g);
                } else if (eventType == 3) {
                    String lowerCase = xmlPullParser.getName().toLowerCase(Locale.ROOT);
                    switch (lowerCase.hashCode()) {
                        case -2075718416:
                            if (!lowerCase.equals("guideline")) {
                                break;
                            }
                            break;
                        case -190376483:
                            if (!lowerCase.equals("constraint")) {
                            }
                            break;
                        case 426575017:
                            if (!lowerCase.equals("constraintoverride")) {
                            }
                            break;
                        case 2146106725:
                            if (!lowerCase.equals("constraintset")) {
                                continue;
                            } else {
                                return;
                            }
                            break;
                        default:
                            continue;
                    }
                    this.h.put(Integer.valueOf(aVarV.a), aVarV);
                    aVarV = null;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    public void M(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.g && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.h.containsKey(Integer.valueOf(id))) {
                this.h.put(Integer.valueOf(id), new a());
            }
            a aVar = this.h.get(Integer.valueOf(id));
            if (aVar != null) {
                if (!aVar.e.b) {
                    aVar.g(id, bVar);
                    if (childAt instanceof androidx.constraintlayout.widget.a) {
                        aVar.e.k0 = ((androidx.constraintlayout.widget.a) childAt).getReferencedIds();
                        if (childAt instanceof Barrier) {
                            Barrier barrier = (Barrier) childAt;
                            aVar.e.p0 = barrier.getAllowsGoneWidget();
                            aVar.e.h0 = barrier.getType();
                            aVar.e.i0 = barrier.getMargin();
                        }
                    }
                    aVar.e.b = true;
                }
                d dVar = aVar.c;
                if (!dVar.a) {
                    dVar.b = childAt.getVisibility();
                    aVar.c.d = childAt.getAlpha();
                    aVar.c.a = true;
                }
                e eVar = aVar.f;
                if (!eVar.a) {
                    eVar.a = true;
                    eVar.b = childAt.getRotation();
                    aVar.f.c = childAt.getRotationX();
                    aVar.f.d = childAt.getRotationY();
                    aVar.f.e = childAt.getScaleX();
                    aVar.f.f = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (pivotX != 0.0d || pivotY != 0.0d) {
                        e eVar2 = aVar.f;
                        eVar2.g = pivotX;
                        eVar2.h = pivotY;
                    }
                    aVar.f.j = childAt.getTranslationX();
                    aVar.f.k = childAt.getTranslationY();
                    aVar.f.l = childAt.getTranslationZ();
                    e eVar3 = aVar.f;
                    if (eVar3.m) {
                        eVar3.n = childAt.getElevation();
                    }
                }
            }
        }
    }

    public void N(c cVar) {
        for (Integer num : cVar.h.keySet()) {
            num.intValue();
            a aVar = cVar.h.get(num);
            if (!this.h.containsKey(num)) {
                this.h.put(num, new a());
            }
            a aVar2 = this.h.get(num);
            if (aVar2 != null) {
                b bVar = aVar2.e;
                if (!bVar.b) {
                    bVar.a(aVar.e);
                }
                d dVar = aVar2.c;
                if (!dVar.a) {
                    dVar.a(aVar.c);
                }
                e eVar = aVar2.f;
                if (!eVar.a) {
                    eVar.a(aVar.f);
                }
                C0071c c0071c = aVar2.d;
                if (!c0071c.a) {
                    c0071c.a(aVar.d);
                }
                for (String str : aVar.g.keySet()) {
                    if (!aVar2.g.containsKey(str)) {
                        aVar2.g.put(str, aVar.g.get(str));
                    }
                }
            }
        }
    }

    public void S(int i2, String str) {
        w(i2).e.A = str;
    }

    public void T(boolean z) {
        this.g = z;
    }

    public void U(String str) {
        this.d = str.split(",");
        int i2 = 0;
        while (true) {
            String[] strArr = this.d;
            if (i2 >= strArr.length) {
                return;
            }
            strArr[i2] = strArr[i2].trim();
            i2++;
        }
    }

    public void V(boolean z) {
        this.a = z;
    }

    public void W(int i2, float f) {
        w(i2).e.z = f;
    }

    public void g(ConstraintLayout constraintLayout) {
        a aVar;
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!this.h.containsKey(Integer.valueOf(id))) {
                hq2.d(childAt);
            } else {
                if (this.g && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (this.h.containsKey(Integer.valueOf(id)) && (aVar = this.h.get(Integer.valueOf(id))) != null) {
                    ConstraintAttribute.j(childAt, aVar.g);
                }
            }
        }
    }

    public void h(c cVar) {
        for (a aVar : cVar.h.values()) {
            if (aVar.h != null) {
                if (aVar.b == null) {
                    aVar.h.e(x(aVar.a));
                } else {
                    Iterator<Integer> it = this.h.keySet().iterator();
                    while (it.hasNext()) {
                        a aVarX = x(it.next().intValue());
                        String str = aVarX.e.m0;
                        if (str != null && aVar.b.matches(str)) {
                            aVar.h.e(aVarX);
                            aVarX.g.putAll((HashMap) aVar.g.clone());
                        }
                    }
                }
            }
        }
    }

    public void i(ConstraintLayout constraintLayout) {
        k(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public void j(androidx.constraintlayout.widget.a aVar, ConstraintWidget constraintWidget, ConstraintLayout.b bVar, SparseArray<ConstraintWidget> sparseArray) {
        a aVar2;
        int id = aVar.getId();
        if (this.h.containsKey(Integer.valueOf(id)) && (aVar2 = this.h.get(Integer.valueOf(id))) != null && (constraintWidget instanceof gc5)) {
            aVar.p(aVar2, (gc5) constraintWidget, bVar, sparseArray);
        }
    }

    void k(ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        HashSet<Integer> hashSet = new HashSet(this.h.keySet());
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!this.h.containsKey(Integer.valueOf(id))) {
                hq2.d(childAt);
            } else {
                if (this.g && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1 && this.h.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    a aVar = this.h.get(Integer.valueOf(id));
                    if (aVar != null) {
                        if (childAt instanceof Barrier) {
                            aVar.e.j0 = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(aVar.e.h0);
                            barrier.setMargin(aVar.e.i0);
                            barrier.setAllowsGoneWidget(aVar.e.p0);
                            b bVar = aVar.e;
                            int[] iArr = bVar.k0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = bVar.l0;
                                if (str != null) {
                                    bVar.k0 = u(barrier, str);
                                    barrier.setReferencedIds(aVar.e.k0);
                                }
                            }
                        }
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                        bVar2.b();
                        aVar.e(bVar2);
                        if (z) {
                            ConstraintAttribute.j(childAt, aVar.g);
                        }
                        childAt.setLayoutParams(bVar2);
                        d dVar = aVar.c;
                        if (dVar.c == 0) {
                            childAt.setVisibility(dVar.b);
                        }
                        childAt.setAlpha(aVar.c.d);
                        childAt.setRotation(aVar.f.b);
                        childAt.setRotationX(aVar.f.c);
                        childAt.setRotationY(aVar.f.d);
                        childAt.setScaleX(aVar.f.e);
                        childAt.setScaleY(aVar.f.f);
                        e eVar = aVar.f;
                        if (eVar.i != -1) {
                            View viewFindViewById = ((View) childAt.getParent()).findViewById(aVar.f.i);
                            if (viewFindViewById != null) {
                                float top = (viewFindViewById.getTop() + viewFindViewById.getBottom()) / 2.0f;
                                float left = (viewFindViewById.getLeft() + viewFindViewById.getRight()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    float left2 = left - childAt.getLeft();
                                    float top2 = top - childAt.getTop();
                                    childAt.setPivotX(left2);
                                    childAt.setPivotY(top2);
                                }
                            }
                        } else {
                            if (!Float.isNaN(eVar.g)) {
                                childAt.setPivotX(aVar.f.g);
                            }
                            if (!Float.isNaN(aVar.f.h)) {
                                childAt.setPivotY(aVar.f.h);
                            }
                        }
                        childAt.setTranslationX(aVar.f.j);
                        childAt.setTranslationY(aVar.f.k);
                        childAt.setTranslationZ(aVar.f.l);
                        e eVar2 = aVar.f;
                        if (eVar2.m) {
                            childAt.setElevation(eVar2.n);
                        }
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            a aVar2 = this.h.get(num);
            if (aVar2 != null) {
                if (aVar2.e.j0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    b bVar3 = aVar2.e;
                    int[] iArr2 = bVar3.k0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.l0;
                        if (str2 != null) {
                            bVar3.k0 = u(barrier2, str2);
                            barrier2.setReferencedIds(aVar2.e.k0);
                        }
                    }
                    barrier2.setType(aVar2.e.h0);
                    barrier2.setMargin(aVar2.e.i0);
                    ConstraintLayout.b bVarI = constraintLayout.generateDefaultLayoutParams();
                    barrier2.w();
                    aVar2.e(bVarI);
                    constraintLayout.addView(barrier2, bVarI);
                }
                if (aVar2.e.a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.b bVarI2 = constraintLayout.generateDefaultLayoutParams();
                    aVar2.e(bVarI2);
                    constraintLayout.addView(guideline, bVarI2);
                }
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = constraintLayout.getChildAt(i3);
            if (childAt2 instanceof androidx.constraintlayout.widget.a) {
                ((androidx.constraintlayout.widget.a) childAt2).j(constraintLayout);
            }
        }
    }

    public void l(int i2, ConstraintLayout.b bVar) {
        a aVar;
        if (!this.h.containsKey(Integer.valueOf(i2)) || (aVar = this.h.get(Integer.valueOf(i2))) == null) {
            return;
        }
        aVar.e(bVar);
    }

    public void n(Context context, int i2) {
        o((ConstraintLayout) LayoutInflater.from(context).inflate(i2, (ViewGroup) null));
    }

    public void o(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.h.clear();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.g && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.h.containsKey(Integer.valueOf(id))) {
                this.h.put(Integer.valueOf(id), new a());
            }
            a aVar = this.h.get(Integer.valueOf(id));
            if (aVar != null) {
                aVar.g = ConstraintAttribute.b(this.f, childAt);
                aVar.g(id, bVar);
                aVar.c.b = childAt.getVisibility();
                aVar.c.d = childAt.getAlpha();
                aVar.f.b = childAt.getRotation();
                aVar.f.c = childAt.getRotationX();
                aVar.f.d = childAt.getRotationY();
                aVar.f.e = childAt.getScaleX();
                aVar.f.f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    e eVar = aVar.f;
                    eVar.g = pivotX;
                    eVar.h = pivotY;
                }
                aVar.f.j = childAt.getTranslationX();
                aVar.f.k = childAt.getTranslationY();
                aVar.f.l = childAt.getTranslationZ();
                e eVar2 = aVar.f;
                if (eVar2.m) {
                    eVar2.n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar.e.p0 = barrier.getAllowsGoneWidget();
                    aVar.e.k0 = barrier.getReferencedIds();
                    aVar.e.h0 = barrier.getType();
                    aVar.e.i0 = barrier.getMargin();
                }
            }
        }
    }

    public void p(c cVar) {
        this.h.clear();
        for (Integer num : cVar.h.keySet()) {
            a aVar = cVar.h.get(num);
            if (aVar != null) {
                this.h.put(num, aVar.clone());
            }
        }
    }

    public void q(androidx.constraintlayout.widget.d dVar) {
        int childCount = dVar.getChildCount();
        this.h.clear();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = dVar.getChildAt(i2);
            androidx.constraintlayout.widget.d.a aVar = (androidx.constraintlayout.widget.d.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.g && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.h.containsKey(Integer.valueOf(id))) {
                this.h.put(Integer.valueOf(id), new a());
            }
            a aVar2 = this.h.get(Integer.valueOf(id));
            if (aVar2 != null) {
                if (childAt instanceof androidx.constraintlayout.widget.a) {
                    aVar2.i((androidx.constraintlayout.widget.a) childAt, id, aVar);
                }
                aVar2.h(id, aVar);
            }
        }
    }

    public void r(int i2, int i3, int i4, int i5) {
        if (!this.h.containsKey(Integer.valueOf(i2))) {
            this.h.put(Integer.valueOf(i2), new a());
        }
        a aVar = this.h.get(Integer.valueOf(i2));
        if (aVar == null) {
            return;
        }
        switch (i3) {
            case 1:
                if (i5 == 1) {
                    b bVar = aVar.e;
                    bVar.j = i4;
                    bVar.k = -1;
                    return;
                } else if (i5 == 2) {
                    b bVar2 = aVar.e;
                    bVar2.k = i4;
                    bVar2.j = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + X(i5) + " undefined");
                }
            case 2:
                if (i5 == 1) {
                    b bVar3 = aVar.e;
                    bVar3.l = i4;
                    bVar3.m = -1;
                    return;
                } else if (i5 == 2) {
                    b bVar4 = aVar.e;
                    bVar4.m = i4;
                    bVar4.l = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + X(i5) + " undefined");
                }
            case 3:
                if (i5 == 3) {
                    b bVar5 = aVar.e;
                    bVar5.n = i4;
                    bVar5.o = -1;
                    bVar5.r = -1;
                    bVar5.s = -1;
                    bVar5.t = -1;
                    return;
                }
                if (i5 != 4) {
                    throw new IllegalArgumentException("right to " + X(i5) + " undefined");
                }
                b bVar6 = aVar.e;
                bVar6.o = i4;
                bVar6.n = -1;
                bVar6.r = -1;
                bVar6.s = -1;
                bVar6.t = -1;
                return;
            case 4:
                if (i5 == 4) {
                    b bVar7 = aVar.e;
                    bVar7.q = i4;
                    bVar7.p = -1;
                    bVar7.r = -1;
                    bVar7.s = -1;
                    bVar7.t = -1;
                    return;
                }
                if (i5 != 3) {
                    throw new IllegalArgumentException("right to " + X(i5) + " undefined");
                }
                b bVar8 = aVar.e;
                bVar8.p = i4;
                bVar8.q = -1;
                bVar8.r = -1;
                bVar8.s = -1;
                bVar8.t = -1;
                return;
            case 5:
                if (i5 == 5) {
                    b bVar9 = aVar.e;
                    bVar9.r = i4;
                    bVar9.q = -1;
                    bVar9.p = -1;
                    bVar9.n = -1;
                    bVar9.o = -1;
                    return;
                }
                if (i5 == 3) {
                    b bVar10 = aVar.e;
                    bVar10.s = i4;
                    bVar10.q = -1;
                    bVar10.p = -1;
                    bVar10.n = -1;
                    bVar10.o = -1;
                    return;
                }
                if (i5 != 4) {
                    throw new IllegalArgumentException("right to " + X(i5) + " undefined");
                }
                b bVar11 = aVar.e;
                bVar11.t = i4;
                bVar11.q = -1;
                bVar11.p = -1;
                bVar11.n = -1;
                bVar11.o = -1;
                return;
            case 6:
                if (i5 == 6) {
                    b bVar12 = aVar.e;
                    bVar12.v = i4;
                    bVar12.u = -1;
                    return;
                } else if (i5 == 7) {
                    b bVar13 = aVar.e;
                    bVar13.u = i4;
                    bVar13.v = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + X(i5) + " undefined");
                }
            case 7:
                if (i5 == 7) {
                    b bVar14 = aVar.e;
                    bVar14.x = i4;
                    bVar14.w = -1;
                    return;
                } else if (i5 == 6) {
                    b bVar15 = aVar.e;
                    bVar15.w = i4;
                    bVar15.x = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + X(i5) + " undefined");
                }
            default:
                throw new IllegalArgumentException(X(i3) + " to " + X(i5) + " unknown");
        }
    }

    public void s(int i2, int i3, int i4, float f) {
        b bVar = w(i2).e;
        bVar.B = i3;
        bVar.C = i4;
        bVar.D = f;
    }

    public void t(int i2, int i3) {
        w(i2).e.e = i3;
    }

    public a x(int i2) {
        if (this.h.containsKey(Integer.valueOf(i2))) {
            return this.h.get(Integer.valueOf(i2));
        }
        return null;
    }

    public int y(int i2) {
        return w(i2).e.e;
    }

    public int[] z() {
        Integer[] numArr = (Integer[]) this.h.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = numArr[i2].intValue();
        }
        return iArr;
    }
}
