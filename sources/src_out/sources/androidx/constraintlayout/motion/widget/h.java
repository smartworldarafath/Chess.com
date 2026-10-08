package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.google.inputmethod.hq2;
import com.google.inputmethod.lo6;
import com.google.inputmethod.pae;
import com.google.inputmethod.v0a;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class h extends androidx.constraintlayout.motion.widget.a {
    private boolean A;
    float g = 0.1f;
    int h;
    int i;
    int j;
    RectF k;
    RectF l;
    HashMap<String, Method> m;
    private int n;
    private String o;
    private int p;
    private String q;
    private String r;
    private int s;
    private int t;
    private View u;
    private boolean v;
    private boolean w;
    private boolean x;
    private float y;
    private float z;

    private static class a {
        private static SparseIntArray a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(v0a.t6, 8);
            a.append(v0a.x6, 4);
            a.append(v0a.y6, 1);
            a.append(v0a.z6, 2);
            a.append(v0a.u6, 7);
            a.append(v0a.A6, 6);
            a.append(v0a.C6, 5);
            a.append(v0a.w6, 9);
            a.append(v0a.v6, 10);
            a.append(v0a.B6, 11);
            a.append(v0a.D6, 12);
            a.append(v0a.E6, 13);
            a.append(v0a.F6, 14);
        }

        public static void a(h hVar, TypedArray typedArray, Context context) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (a.get(index)) {
                    case 1:
                        hVar.q = typedArray.getString(index);
                        break;
                    case 2:
                        hVar.r = typedArray.getString(index);
                        break;
                    case 3:
                    default:
                        Integer.toHexString(index);
                        a.get(index);
                        break;
                    case 4:
                        hVar.o = typedArray.getString(index);
                        break;
                    case 5:
                        hVar.g = typedArray.getFloat(index, hVar.g);
                        break;
                    case 6:
                        hVar.s = typedArray.getResourceId(index, hVar.s);
                        break;
                    case 7:
                        if (MotionLayout.d1) {
                            int resourceId = typedArray.getResourceId(index, hVar.b);
                            hVar.b = resourceId;
                            if (resourceId == -1) {
                                hVar.c = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            hVar.c = typedArray.getString(index);
                        } else {
                            hVar.b = typedArray.getResourceId(index, hVar.b);
                        }
                        break;
                    case 8:
                        int integer = typedArray.getInteger(index, hVar.a);
                        hVar.a = integer;
                        hVar.y = (integer + 0.5f) / 100.0f;
                        break;
                    case lo6.HASACTION_FIELD_NUMBER /* 9 */:
                        hVar.t = typedArray.getResourceId(index, hVar.t);
                        break;
                    case lo6.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                        hVar.A = typedArray.getBoolean(index, hVar.A);
                        break;
                    case lo6.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                        hVar.p = typedArray.getResourceId(index, hVar.p);
                        break;
                    case 12:
                        hVar.j = typedArray.getResourceId(index, hVar.j);
                        break;
                    case 13:
                        hVar.h = typedArray.getResourceId(index, hVar.h);
                        break;
                    case 14:
                        hVar.i = typedArray.getResourceId(index, hVar.i);
                        break;
                }
            }
        }
    }

    public h() {
        int i = androidx.constraintlayout.motion.widget.a.f;
        this.h = i;
        this.i = i;
        this.j = i;
        this.k = new RectF();
        this.l = new RectF();
        this.m = new HashMap<>();
        this.n = -1;
        this.o = null;
        int i2 = androidx.constraintlayout.motion.widget.a.f;
        this.p = i2;
        this.q = null;
        this.r = null;
        this.s = i2;
        this.t = i2;
        this.u = null;
        this.v = true;
        this.w = true;
        this.x = true;
        this.y = Float.NaN;
        this.A = false;
        this.d = 5;
        this.e = new HashMap<>();
    }

    private void v(String str, View view) {
        Method method;
        if (str == null) {
            return;
        }
        if (str.startsWith(".")) {
            w(str, view);
            return;
        }
        if (this.m.containsKey(str)) {
            method = this.m.get(str);
            if (method == null) {
                return;
            }
        } else {
            method = null;
        }
        if (method == null) {
            try {
                method = view.getClass().getMethod(str, null);
                this.m.put(str, method);
            } catch (NoSuchMethodException unused) {
                this.m.put(str, null);
                view.getClass();
                hq2.d(view);
                return;
            }
        }
        try {
            method.invoke(view, null);
        } catch (Exception unused2) {
            view.getClass();
            hq2.d(view);
        }
    }

    private void w(String str, View view) {
        boolean z = str.length() == 1;
        if (!z) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.e.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z || lowerCase.matches(str)) {
                ConstraintAttribute constraintAttribute = this.e.get(str2);
                if (constraintAttribute != null) {
                    constraintAttribute.a(view);
                }
            }
        }
    }

    private void x(RectF rectF, View view, boolean z) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public void a(HashMap<String, pae> map) {
    }

    @Override // androidx.constraintlayout.motion.widget.a
    /* JADX INFO: renamed from: b */
    public androidx.constraintlayout.motion.widget.a clone() {
        return new h().c(this);
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public androidx.constraintlayout.motion.widget.a c(androidx.constraintlayout.motion.widget.a aVar) {
        super.c(aVar);
        h hVar = (h) aVar;
        this.n = hVar.n;
        this.o = hVar.o;
        this.p = hVar.p;
        this.q = hVar.q;
        this.r = hVar.r;
        this.s = hVar.s;
        this.t = hVar.t;
        this.u = hVar.u;
        this.g = hVar.g;
        this.v = hVar.v;
        this.w = hVar.w;
        this.x = hVar.x;
        this.y = hVar.y;
        this.z = hVar.z;
        this.A = hVar.A;
        this.k = hVar.k;
        this.l = hVar.l;
        this.m = hVar.m;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public void d(HashSet<String> hashSet) {
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public void e(Context context, AttributeSet attributeSet) {
        a.a(this, context.obtainStyledAttributes(attributeSet, v0a.s6), context);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x008d  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00af  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:59:0x00db  */
    public void u(float f, View view) {
        boolean z;
        boolean z2;
        boolean z3;
        float f2;
        float f3;
        float f4;
        float f5;
        boolean z4;
        boolean z5 = true;
        boolean z6 = false;
        if (this.t != androidx.constraintlayout.motion.widget.a.f) {
            if (this.u == null) {
                this.u = ((ViewGroup) view.getParent()).findViewById(this.t);
            }
            x(this.k, this.u, this.A);
            x(this.l, view, this.A);
            if (this.k.intersect(this.l)) {
                if (this.v) {
                    this.v = false;
                    z = true;
                } else {
                    z = false;
                }
                if (this.x) {
                    this.x = false;
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.w = true;
            } else {
                if (this.v) {
                    z = false;
                } else {
                    this.v = true;
                    z = true;
                }
                if (this.w) {
                    this.w = false;
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.x = true;
                z6 = z4;
                z3 = false;
            }
        } else {
            if (this.v) {
                float f6 = this.y;
                if ((f - f6) * (this.z - f6) < 0.0f) {
                    this.v = false;
                    z = true;
                }
                if (this.w) {
                    f4 = this.y;
                    f5 = f - f4;
                    if ((this.z - f4) * f5 >= 0.0f && f5 < 0.0f) {
                        this.w = false;
                        z2 = true;
                    }
                    if (this.x) {
                        f2 = this.y;
                        f3 = f - f2;
                        if ((this.z - f2) * f3 < 0.0f || f3 <= 0.0f) {
                            z5 = false;
                        } else {
                            this.x = false;
                        }
                        z3 = z5;
                    } else {
                        if (Math.abs(f - this.y) > this.g) {
                            this.x = true;
                        }
                        z3 = false;
                    }
                    z6 = z2;
                } else if (Math.abs(f - this.y) > this.g) {
                    this.w = true;
                }
                z2 = false;
                if (this.x) {
                    f2 = this.y;
                    f3 = f - f2;
                    if ((this.z - f2) * f3 < 0.0f) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    z3 = z5;
                } else {
                    if (Math.abs(f - this.y) > this.g) {
                        this.x = true;
                    }
                    z3 = false;
                }
                z6 = z2;
            } else if (Math.abs(f - this.y) > this.g) {
                this.v = true;
            }
            z = false;
            if (this.w) {
                f4 = this.y;
                f5 = f - f4;
                if ((this.z - f4) * f5 >= 0.0f) {
                }
                if (this.x) {
                    f2 = this.y;
                    f3 = f - f2;
                    if ((this.z - f2) * f3 < 0.0f) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    z3 = z5;
                } else {
                    if (Math.abs(f - this.y) > this.g) {
                        this.x = true;
                    }
                    z3 = false;
                }
                z6 = z2;
            } else if (Math.abs(f - this.y) > this.g) {
                this.w = true;
            }
            z2 = false;
            if (this.x) {
                f2 = this.y;
                f3 = f - f2;
                if ((this.z - f2) * f3 < 0.0f) {
                    z5 = false;
                } else {
                    z5 = false;
                }
                z3 = z5;
            } else {
                if (Math.abs(f - this.y) > this.g) {
                    this.x = true;
                }
                z3 = false;
            }
            z6 = z2;
        }
        this.z = f;
        if (z6 || z || z3) {
            ((MotionLayout) view.getParent()).i0(this.s, z3, f);
        }
        View viewFindViewById = this.p == androidx.constraintlayout.motion.widget.a.f ? view : ((MotionLayout) view.getParent()).findViewById(this.p);
        if (z6) {
            String str = this.q;
            if (str != null) {
                v(str, viewFindViewById);
            }
            if (this.h != androidx.constraintlayout.motion.widget.a.f) {
                ((MotionLayout) view.getParent()).I0(this.h, viewFindViewById);
            }
        }
        if (z3) {
            String str2 = this.r;
            if (str2 != null) {
                v(str2, viewFindViewById);
            }
            if (this.i != androidx.constraintlayout.motion.widget.a.f) {
                ((MotionLayout) view.getParent()).I0(this.i, viewFindViewById);
            }
        }
        if (z) {
            String str3 = this.o;
            if (str3 != null) {
                v(str3, viewFindViewById);
            }
            if (this.j != androidx.constraintlayout.motion.widget.a.f) {
                ((MotionLayout) view.getParent()).I0(this.j, viewFindViewById);
            }
        }
    }
}
