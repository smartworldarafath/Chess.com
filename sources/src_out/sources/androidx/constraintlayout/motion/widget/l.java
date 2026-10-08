package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import com.google.inputmethod.az9;
import com.google.inputmethod.d7c;
import com.google.inputmethod.hq2;
import com.google.inputmethod.ul3;
import com.google.inputmethod.v0a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class l {
    private final MotionLayout a;
    private MotionEvent m;
    private MotionLayout.f p;
    private boolean q;
    final o r;
    float s;
    float t;
    d7c b = null;
    b c = null;
    private boolean d = false;
    private ArrayList<b> e = new ArrayList<>();
    private b f = null;
    private ArrayList<b> g = new ArrayList<>();
    private SparseArray<androidx.constraintlayout.widget.c> h = new SparseArray<>();
    private HashMap<String, Integer> i = new HashMap<>();
    private SparseIntArray j = new SparseIntArray();
    private int k = 400;
    private int l = 0;
    private boolean n = false;
    private boolean o = false;

    class a implements Interpolator {
        final /* synthetic */ ul3 a;

        a(ul3 ul3Var) {
            this.a = ul3Var;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return (float) this.a.a(f);
        }
    }

    l(Context context, MotionLayout motionLayout, int i) {
        this.a = motionLayout;
        this.r = new o(motionLayout);
        J(context, i);
        this.h.put(az9.a, new androidx.constraintlayout.widget.c());
        this.i.put("motion_base", Integer.valueOf(az9.a));
    }

    private boolean H(int i) {
        int i2 = this.j.get(i);
        int size = this.j.size();
        while (i2 > 0) {
            if (i2 == i) {
                return true;
            }
            int i3 = size - 1;
            if (size < 0) {
                return true;
            }
            i2 = this.j.get(i2);
            size = i3;
        }
        return false;
    }

    private boolean I() {
        return this.p != null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void J(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            b bVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                K(context, xml);
                            }
                            break;
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                d dVar = new d(context, xml);
                                if (bVar != null) {
                                    bVar.k.add(dVar);
                                }
                            }
                            break;
                        case -687739768:
                            if (name.equals("Include")) {
                                M(context, xml);
                            }
                            break;
                        case 61998586:
                            if (name.equals("ViewTransition")) {
                                this.r.a(new n(context, xml));
                            }
                            break;
                        case 269306229:
                            if (name.equals("Transition")) {
                                ArrayList<b> arrayList = this.e;
                                bVar = new b(this, context, xml);
                                arrayList.add(bVar);
                                if (this.c == null && !bVar.b) {
                                    this.c = bVar;
                                    if (bVar.l != null) {
                                        this.c.l.x(this.q);
                                    }
                                }
                                if (bVar.b) {
                                    if (bVar.c == -1) {
                                        this.f = bVar;
                                    } else {
                                        this.g.add(bVar);
                                    }
                                    this.e.remove(bVar);
                                }
                            }
                            break;
                        case 312750793:
                            if (name.equals("OnClick") && bVar != null && !this.a.isInEditMode()) {
                                bVar.u(context, xml);
                            }
                            break;
                        case 327855227:
                            if (name.equals("OnSwipe")) {
                                if (bVar == null) {
                                    context.getResources().getResourceEntryName(i);
                                    xml.getLineNumber();
                                }
                                if (bVar != null) {
                                    bVar.l = new m(context, this.a, xml);
                                }
                            }
                            break;
                        case 793277014:
                            if (name.equals("MotionScene")) {
                                N(context, xml);
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                this.b = new d7c(context, xml);
                            }
                            break;
                        case 1942574248:
                            if (name.equals("include")) {
                                M(context, xml);
                            }
                            break;
                    }
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    private int K(Context context, XmlPullParser xmlPullParser) {
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.T(false);
        int attributeCount = xmlPullParser.getAttributeCount();
        int iQ = -1;
        int iQ2 = -1;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            attributeName.getClass();
            switch (attributeName) {
                case "deriveConstraintsFrom":
                    iQ2 = q(context, attributeValue);
                    break;
                case "constraintRotate":
                    try {
                        cVar.e = Integer.parseInt(attributeValue);
                        break;
                    } catch (NumberFormatException unused) {
                        attributeValue.getClass();
                        switch (attributeValue) {
                            case "x_left":
                                cVar.e = 4;
                                break;
                            case "left":
                                cVar.e = 2;
                                break;
                            case "none":
                                cVar.e = 0;
                                break;
                            case "right":
                                cVar.e = 1;
                                break;
                            case "x_right":
                                cVar.e = 3;
                                break;
                        }
                    }
                    break;
                case "id":
                    iQ = q(context, attributeValue);
                    this.i.put(Z(attributeValue), Integer.valueOf(iQ));
                    cVar.b = hq2.c(context, iQ);
                    break;
                case "stateLabels":
                    cVar.U(attributeValue);
                    break;
            }
        }
        if (iQ != -1) {
            if (this.a.W != 0) {
                cVar.V(true);
            }
            cVar.F(context, xmlPullParser);
            if (iQ2 != -1) {
                this.j.put(iQ, iQ2);
            }
            this.h.put(iQ, cVar);
        }
        return iQ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int L(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return K(context, xml);
                }
            }
            return -1;
        } catch (IOException | XmlPullParserException unused) {
            return -1;
        }
    }

    private void M(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), v0a.Y9);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == v0a.Z9) {
                L(context, typedArrayObtainStyledAttributes.getResourceId(index, -1));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void N(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), v0a.r8);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == v0a.s8) {
                int i2 = typedArrayObtainStyledAttributes.getInt(index, this.k);
                this.k = i2;
                if (i2 < 8) {
                    this.k = 8;
                }
            } else if (index == v0a.t8) {
                this.l = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void R(int i, MotionLayout motionLayout) {
        androidx.constraintlayout.widget.c cVar = this.h.get(i);
        cVar.c = cVar.b;
        int i2 = this.j.get(i);
        if (i2 > 0) {
            R(i2, motionLayout);
            androidx.constraintlayout.widget.c cVar2 = this.h.get(i2);
            if (cVar2 == null) {
                hq2.c(this.a.getContext(), i2);
                return;
            }
            cVar.c += "/" + cVar2.c;
            cVar.N(cVar2);
        } else {
            cVar.c += "  layout";
            cVar.M(motionLayout);
        }
        cVar.h(cVar);
    }

    public static String Z(String str) {
        if (str == null) {
            return "";
        }
        int iIndexOf = str.indexOf(47);
        return iIndexOf < 0 ? str : str.substring(iIndexOf + 1);
    }

    private int q(Context context, String str) {
        int identifier;
        if (str.contains("/")) {
            identifier = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
        } else {
            identifier = -1;
        }
        return (identifier != -1 || str.length() <= 1) ? identifier : Integer.parseInt(str.substring(1));
    }

    private int x(int i) {
        int iC;
        d7c d7cVar = this.b;
        return (d7cVar == null || (iC = d7cVar.c(i, -1, -1)) == -1) ? i : iC;
    }

    float A() {
        b bVar = this.c;
        if (bVar == null || bVar.l == null) {
            return 0.0f;
        }
        return this.c.l.m();
    }

    float B() {
        b bVar = this.c;
        if (bVar == null || bVar.l == null) {
            return 0.0f;
        }
        return this.c.l.n();
    }

    float C() {
        b bVar = this.c;
        if (bVar == null || bVar.l == null) {
            return 0.0f;
        }
        return this.c.l.o();
    }

    public float D() {
        b bVar = this.c;
        if (bVar != null) {
            return bVar.i;
        }
        return 0.0f;
    }

    int E() {
        b bVar = this.c;
        if (bVar == null) {
            return -1;
        }
        return bVar.d;
    }

    public b F(int i) {
        for (b bVar : this.e) {
            if (bVar.a == i) {
                return bVar;
            }
        }
        return null;
    }

    public List<b> G(int i) {
        int iX = x(i);
        ArrayList arrayList = new ArrayList();
        for (b bVar : this.e) {
            if (bVar.d == iX || bVar.c == iX) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    void O(float f, float f2) {
        b bVar = this.c;
        if (bVar == null || bVar.l == null) {
            return;
        }
        this.c.l.u(f, f2);
    }

    void P(float f, float f2) {
        b bVar = this.c;
        if (bVar == null || bVar.l == null) {
            return;
        }
        this.c.l.v(f, f2);
    }

    void Q(MotionEvent motionEvent, int i, MotionLayout motionLayout) {
        MotionLayout.f fVar;
        MotionEvent motionEvent2;
        RectF rectF = new RectF();
        if (this.p == null) {
            this.p = this.a.q0();
        }
        this.p.a(motionEvent);
        if (i != -1) {
            int action = motionEvent.getAction();
            boolean z = false;
            if (action == 0) {
                this.s = motionEvent.getRawX();
                this.t = motionEvent.getRawY();
                this.m = motionEvent;
                this.n = false;
                if (this.c.l != null) {
                    RectF rectFF = this.c.l.f(this.a, rectF);
                    if (rectFF != null && !rectFF.contains(this.m.getX(), this.m.getY())) {
                        this.m = null;
                        this.n = true;
                        return;
                    }
                    RectF rectFP = this.c.l.p(this.a, rectF);
                    if (rectFP == null || rectFP.contains(this.m.getX(), this.m.getY())) {
                        this.o = false;
                    } else {
                        this.o = true;
                    }
                    this.c.l.w(this.s, this.t);
                    return;
                }
                return;
            }
            if (action == 2 && !this.n) {
                float rawY = motionEvent.getRawY() - this.t;
                float rawX = motionEvent.getRawX() - this.s;
                if ((rawX == 0.0d && rawY == 0.0d) || (motionEvent2 = this.m) == null) {
                    return;
                }
                b bVarH = h(i, rawX, rawY, motionEvent2);
                if (bVarH != null) {
                    motionLayout.setTransition(bVarH);
                    RectF rectFP2 = this.c.l.p(this.a, rectF);
                    if (rectFP2 != null && !rectFP2.contains(this.m.getX(), this.m.getY())) {
                        z = true;
                    }
                    this.o = z;
                    this.c.l.y(this.s, this.t);
                }
            }
        }
        if (this.n) {
            return;
        }
        b bVar = this.c;
        if (bVar != null && bVar.l != null && !this.o) {
            this.c.l.s(motionEvent, this.p, i, this);
        }
        this.s = motionEvent.getRawX();
        this.t = motionEvent.getRawY();
        if (motionEvent.getAction() != 1 || (fVar = this.p) == null) {
            return;
        }
        fVar.recycle();
        this.p = null;
        int i2 = motionLayout.E;
        if (i2 != -1) {
            g(motionLayout, i2);
        }
    }

    void S(MotionLayout motionLayout) {
        for (int i = 0; i < this.h.size(); i++) {
            int iKeyAt = this.h.keyAt(i);
            if (H(iKeyAt)) {
                return;
            }
            R(iKeyAt, motionLayout);
        }
    }

    public void T(int i, androidx.constraintlayout.widget.c cVar) {
        this.h.put(i, cVar);
    }

    public void U(int i) {
        b bVar = this.c;
        if (bVar != null) {
            bVar.E(i);
        } else {
            this.k = i;
        }
    }

    public void V(boolean z) {
        this.q = z;
        b bVar = this.c;
        if (bVar == null || bVar.l == null) {
            return;
        }
        this.c.l.x(this.q);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0039  */
    /* JADX WARN: Code duplicated, block: B:40:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0096  */
    /* JADX WARN: Code duplicated, block: B:48:0x006d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0075 A[SYNTHETIC] */
    void W(int i, int i2) {
        int iC;
        int iC2;
        b bVar;
        Iterator<b> it;
        b bVar2;
        b bVar3;
        b next;
        d7c d7cVar = this.b;
        if (d7cVar != null) {
            iC = d7cVar.c(i, -1, -1);
            if (iC == -1) {
                iC = i;
            }
            iC2 = this.b.c(i2, -1, -1);
            if (iC2 == -1) {
            }
            bVar = this.c;
            if (bVar == null && bVar.c == i2 && this.c.d == i) {
                return;
            }
            it = this.e.iterator();
            while (true) {
                if (it.hasNext()) {
                    bVar2 = this.f;
                    for (b bVar4 : this.g) {
                        if (bVar4.c == i2) {
                            bVar2 = bVar4;
                        }
                    }
                    bVar3 = new b(this, bVar2);
                    bVar3.d = iC;
                    bVar3.c = iC2;
                    if (iC != -1) {
                        this.e.add(bVar3);
                    }
                    this.c = bVar3;
                    return;
                }
                next = it.next();
                if ((next.c != iC2 && next.d == iC) || (next.c == i2 && next.d == i)) {
                    break;
                }
            }
            this.c = next;
            if (next != null || next.l == null) {
            }
            this.c.l.x(this.q);
            return;
        }
        iC = i;
        iC2 = i2;
        bVar = this.c;
        if (bVar == null) {
        }
        it = this.e.iterator();
        while (true) {
            if (it.hasNext()) {
                bVar2 = this.f;
                while (r3.hasNext()) {
                    if (bVar4.c == i2) {
                        bVar2 = bVar4;
                    }
                }
                bVar3 = new b(this, bVar2);
                bVar3.d = iC;
                bVar3.c = iC2;
                if (iC != -1) {
                    this.e.add(bVar3);
                }
                this.c = bVar3;
                return;
            }
            next = it.next();
            if (next.c != iC2) {
            }
        }
        this.c = next;
        if (next != null) {
        }
    }

    public void X(b bVar) {
        this.c = bVar;
        if (bVar == null || bVar.l == null) {
            return;
        }
        this.c.l.x(this.q);
    }

    void Y() {
        b bVar = this.c;
        if (bVar == null || bVar.l == null) {
            return;
        }
        this.c.l.z();
    }

    boolean a0() {
        Iterator<b> it = this.e.iterator();
        while (it.hasNext()) {
            if (it.next().l != null) {
                return true;
            }
        }
        b bVar = this.c;
        return (bVar == null || bVar.l == null) ? false : true;
    }

    public void b0(int i, View... viewArr) {
        this.r.h(i, viewArr);
    }

    public void f(MotionLayout motionLayout, int i) {
        for (b bVar : this.e) {
            if (bVar.m.size() > 0) {
                Iterator it = bVar.m.iterator();
                while (it.hasNext()) {
                    ((b.a) it.next()).c(motionLayout);
                }
            }
        }
        for (b bVar2 : this.g) {
            if (bVar2.m.size() > 0) {
                Iterator it2 = bVar2.m.iterator();
                while (it2.hasNext()) {
                    ((b.a) it2.next()).c(motionLayout);
                }
            }
        }
        for (b bVar3 : this.e) {
            if (bVar3.m.size() > 0) {
                Iterator it3 = bVar3.m.iterator();
                while (it3.hasNext()) {
                    ((b.a) it3.next()).a(motionLayout, i, bVar3);
                }
            }
        }
        for (b bVar4 : this.g) {
            if (bVar4.m.size() > 0) {
                Iterator it4 = bVar4.m.iterator();
                while (it4.hasNext()) {
                    ((b.a) it4.next()).a(motionLayout, i, bVar4);
                }
            }
        }
    }

    boolean g(MotionLayout motionLayout, int i) {
        b bVar;
        if (I() || this.d) {
            return false;
        }
        for (b bVar2 : this.e) {
            if (bVar2.n != 0 && ((bVar = this.c) != bVar2 || !bVar.D(2))) {
                if (i == bVar2.d && (bVar2.n == 4 || bVar2.n == 2)) {
                    MotionLayout.TransitionState transitionState = MotionLayout.TransitionState.FINISHED;
                    motionLayout.setState(transitionState);
                    motionLayout.setTransition(bVar2);
                    if (bVar2.n == 4) {
                        motionLayout.A0();
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.d0(true);
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                        motionLayout.setState(transitionState);
                        motionLayout.r0();
                    }
                    return true;
                }
                if (i == bVar2.c && (bVar2.n == 3 || bVar2.n == 1)) {
                    MotionLayout.TransitionState transitionState2 = MotionLayout.TransitionState.FINISHED;
                    motionLayout.setState(transitionState2);
                    motionLayout.setTransition(bVar2);
                    if (bVar2.n == 3) {
                        motionLayout.C0();
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                    } else {
                        motionLayout.setProgress(0.0f);
                        motionLayout.d0(true);
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                        motionLayout.setState(transitionState2);
                        motionLayout.r0();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public b h(int i, float f, float f2, MotionEvent motionEvent) {
        if (i == -1) {
            return this.c;
        }
        List<b> listG = G(i);
        RectF rectF = new RectF();
        float f3 = 0.0f;
        b bVar = null;
        for (b bVar2 : listG) {
            if (!bVar2.o && bVar2.l != null) {
                bVar2.l.x(this.q);
                RectF rectFP = bVar2.l.p(this.a, rectF);
                if (rectFP == null || motionEvent == null || rectFP.contains(motionEvent.getX(), motionEvent.getY())) {
                    RectF rectFF = bVar2.l.f(this.a, rectF);
                    if (rectFF == null || motionEvent == null || rectFF.contains(motionEvent.getX(), motionEvent.getY())) {
                        float fA = bVar2.l.a(f, f2);
                        if (bVar2.l.l && motionEvent != null) {
                            float x = motionEvent.getX() - bVar2.l.i;
                            float y = motionEvent.getY() - bVar2.l.j;
                            fA = ((float) (Math.atan2(f2 + y, f + x) - Math.atan2(x, y))) * 10.0f;
                        }
                        float f4 = fA * (bVar2.c == i ? -1.0f : 1.1f);
                        if (f4 > f3) {
                            bVar = bVar2;
                            f3 = f4;
                        }
                    }
                }
            }
        }
        return bVar;
    }

    public int i() {
        b bVar = this.c;
        if (bVar != null) {
            return bVar.p;
        }
        return -1;
    }

    int j() {
        b bVar = this.c;
        if (bVar == null || bVar.l == null) {
            return 0;
        }
        return this.c.l.d();
    }

    androidx.constraintlayout.widget.c k(int i) {
        return l(i, -1, -1);
    }

    androidx.constraintlayout.widget.c l(int i, int i2, int i3) {
        int iC;
        d7c d7cVar = this.b;
        if (d7cVar != null && (iC = d7cVar.c(i, i2, i3)) != -1) {
            i = iC;
        }
        if (this.h.get(i) != null) {
            return this.h.get(i);
        }
        hq2.c(this.a.getContext(), i);
        SparseArray<androidx.constraintlayout.widget.c> sparseArray = this.h;
        return sparseArray.get(sparseArray.keyAt(0));
    }

    public int[] m() {
        int size = this.h.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = this.h.keyAt(i);
        }
        return iArr;
    }

    public ArrayList<b> n() {
        return this.e;
    }

    public int o() {
        b bVar = this.c;
        return bVar != null ? bVar.h : this.k;
    }

    int p() {
        b bVar = this.c;
        if (bVar == null) {
            return -1;
        }
        return bVar.c;
    }

    public Interpolator r() {
        int i = this.c.e;
        if (i == -2) {
            return AnimationUtils.loadInterpolator(this.a.getContext(), this.c.g);
        }
        if (i == -1) {
            return new a(ul3.c(this.c.f));
        }
        if (i == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i == 1) {
            return new AccelerateInterpolator();
        }
        if (i == 2) {
            return new DecelerateInterpolator();
        }
        if (i == 4) {
            return new BounceInterpolator();
        }
        if (i == 5) {
            return new OvershootInterpolator();
        }
        if (i != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    public void s(j jVar) {
        b bVar = this.c;
        if (bVar != null) {
            Iterator it = bVar.k.iterator();
            while (it.hasNext()) {
                ((d) it.next()).b(jVar);
            }
        } else {
            b bVar2 = this.f;
            if (bVar2 != null) {
                Iterator it2 = bVar2.k.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).b(jVar);
                }
            }
        }
    }

    float t() {
        b bVar = this.c;
        if (bVar == null || bVar.l == null) {
            return 0.0f;
        }
        return this.c.l.g();
    }

    float u() {
        b bVar = this.c;
        if (bVar == null || bVar.l == null) {
            return 0.0f;
        }
        return this.c.l.h();
    }

    boolean v() {
        b bVar = this.c;
        if (bVar == null || bVar.l == null) {
            return false;
        }
        return this.c.l.i();
    }

    float w(float f, float f2) {
        b bVar = this.c;
        if (bVar == null || bVar.l == null) {
            return 0.0f;
        }
        return this.c.l.j(f, f2);
    }

    int y() {
        b bVar = this.c;
        if (bVar == null || bVar.l == null) {
            return 0;
        }
        return this.c.l.k();
    }

    float z() {
        b bVar = this.c;
        if (bVar == null || bVar.l == null) {
            return 0.0f;
        }
        return this.c.l.l();
    }

    public static class b {
        private int a;
        private boolean b;
        private int c;
        private int d;
        private int e;
        private String f;
        private int g;
        private int h;
        private float i;
        private final l j;
        private ArrayList<d> k;
        private m l;
        private ArrayList<a> m;
        private int n;
        private boolean o;
        private int p;
        private int q;
        private int r;

        public static class a implements View.OnClickListener {
            private final b a;
            int b;
            int c;

            public a(Context context, b bVar, XmlPullParser xmlPullParser) {
                this.b = -1;
                this.c = 17;
                this.a = bVar;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), v0a.v8);
                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                for (int i = 0; i < indexCount; i++) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i);
                    if (index == v0a.x8) {
                        this.b = typedArrayObtainStyledAttributes.getResourceId(index, this.b);
                    } else if (index == v0a.w8) {
                        this.c = typedArrayObtainStyledAttributes.getInt(index, this.c);
                    }
                }
                typedArrayObtainStyledAttributes.recycle();
            }

            public void a(MotionLayout motionLayout, int i, b bVar) {
                boolean z;
                View viewFindViewById;
                int i2 = this.b;
                View view = motionLayout;
                if (i2 != -1) {
                    viewFindViewById = motionLayout.findViewById(i2);
                }
                if (view == null) {
                    view = viewFindViewById;
                    return;
                }
                int i3 = bVar.d;
                int i4 = bVar.c;
                if (i3 == -1) {
                    view = viewFindViewById;
                    view.setOnClickListener(this);
                    return;
                }
                int i5 = this.c;
                boolean z2 = false;
                if ((i5 & 1) == 0 || i != i3) {
                    view = viewFindViewById;
                    z = false;
                } else {
                    z = true;
                }
                boolean z3 = ((i5 & 1) != 0 && i == i3) | z | ((i5 & 256) != 0 && i == i3) | ((i5 & 16) != 0 && i == i4);
                if ((i5 & 4096) != 0 && i == i4) {
                    z2 = true;
                }
                if (z3 || z2) {
                    view.setOnClickListener(this);
                }
            }

            boolean b(b bVar, MotionLayout motionLayout) {
                b bVar2 = this.a;
                if (bVar2 == bVar) {
                    return true;
                }
                int i = bVar2.c;
                int i2 = this.a.d;
                if (i2 == -1) {
                    return motionLayout.E != i;
                }
                int i3 = motionLayout.E;
                return i3 == i2 || i3 == i;
            }

            public void c(MotionLayout motionLayout) {
                View viewFindViewById;
                int i = this.b;
                if (i == -1 || (viewFindViewById = motionLayout.findViewById(i)) == null) {
                    return;
                }
                viewFindViewById.setOnClickListener(null);
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MotionLayout motionLayout = this.a.j.a;
                if (motionLayout.p0()) {
                    if (this.a.d == -1) {
                        int currentState = motionLayout.getCurrentState();
                        if (currentState == -1) {
                            motionLayout.D0(this.a.c);
                            return;
                        }
                        b bVar = new b(this.a.j, this.a);
                        bVar.d = currentState;
                        bVar.c = this.a.c;
                        motionLayout.setTransition(bVar);
                        motionLayout.A0();
                        return;
                    }
                    b bVar2 = this.a.j.c;
                    int i = this.c;
                    boolean z = false;
                    boolean z2 = ((i & 1) == 0 && (i & 256) == 0) ? false : true;
                    boolean z3 = ((i & 16) == 0 && (i & 4096) == 0) ? false : true;
                    if (z2 && z3) {
                        b bVar3 = this.a.j.c;
                        b bVar4 = this.a;
                        if (bVar3 != bVar4) {
                            motionLayout.setTransition(bVar4);
                        }
                        if (motionLayout.getCurrentState() != motionLayout.getEndState() && motionLayout.getProgress() <= 0.5f) {
                            z3 = false;
                            z = z2;
                        }
                    } else {
                        z = z2;
                    }
                    if (b(bVar2, motionLayout)) {
                        if (z && (this.c & 1) != 0) {
                            motionLayout.setTransition(this.a);
                            motionLayout.A0();
                            return;
                        }
                        if (z3 && (this.c & 16) != 0) {
                            motionLayout.setTransition(this.a);
                            motionLayout.C0();
                        } else if (z && (this.c & 256) != 0) {
                            motionLayout.setTransition(this.a);
                            motionLayout.setProgress(1.0f);
                        } else {
                            if (!z3 || (this.c & 4096) == 0) {
                                return;
                            }
                            motionLayout.setTransition(this.a);
                            motionLayout.setProgress(0.0f);
                        }
                    }
                }
            }
        }

        b(l lVar, b bVar) {
            this.a = -1;
            this.b = false;
            this.c = -1;
            this.d = -1;
            this.e = 0;
            this.f = null;
            this.g = -1;
            this.h = 400;
            this.i = 0.0f;
            this.k = new ArrayList<>();
            this.l = null;
            this.m = new ArrayList<>();
            this.n = 0;
            this.o = false;
            this.p = -1;
            this.q = 0;
            this.r = 0;
            this.j = lVar;
            this.h = lVar.k;
            if (bVar != null) {
                this.p = bVar.p;
                this.e = bVar.e;
                this.f = bVar.f;
                this.g = bVar.g;
                this.h = bVar.h;
                this.k = bVar.k;
                this.i = bVar.i;
                this.q = bVar.q;
            }
        }

        private void v(l lVar, Context context, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                if (index == v0a.t9) {
                    this.c = typedArray.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.c);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                        cVar.E(context, this.c);
                        lVar.h.append(this.c, cVar);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.c = lVar.L(context, this.c);
                    }
                } else if (index == v0a.u9) {
                    this.d = typedArray.getResourceId(index, this.d);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.d);
                    if ("layout".equals(resourceTypeName2)) {
                        androidx.constraintlayout.widget.c cVar2 = new androidx.constraintlayout.widget.c();
                        cVar2.E(context, this.d);
                        lVar.h.append(this.d, cVar2);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.d = lVar.L(context, this.d);
                    }
                } else if (index == v0a.x9) {
                    int i2 = typedArray.peekValue(index).type;
                    if (i2 == 1) {
                        int resourceId = typedArray.getResourceId(index, -1);
                        this.g = resourceId;
                        if (resourceId != -1) {
                            this.e = -2;
                        }
                    } else if (i2 == 3) {
                        String string = typedArray.getString(index);
                        this.f = string;
                        if (string != null) {
                            if (string.indexOf("/") > 0) {
                                this.g = typedArray.getResourceId(index, -1);
                                this.e = -2;
                            } else {
                                this.e = -1;
                            }
                        }
                    } else {
                        this.e = typedArray.getInteger(index, this.e);
                    }
                } else if (index == v0a.v9) {
                    int i3 = typedArray.getInt(index, this.h);
                    this.h = i3;
                    if (i3 < 8) {
                        this.h = 8;
                    }
                } else if (index == v0a.z9) {
                    this.i = typedArray.getFloat(index, this.i);
                } else if (index == v0a.s9) {
                    this.n = typedArray.getInteger(index, this.n);
                } else if (index == v0a.r9) {
                    this.a = typedArray.getResourceId(index, this.a);
                } else if (index == v0a.A9) {
                    this.o = typedArray.getBoolean(index, this.o);
                } else if (index == v0a.y9) {
                    this.p = typedArray.getInteger(index, -1);
                } else if (index == v0a.w9) {
                    this.q = typedArray.getInteger(index, 0);
                } else if (index == v0a.B9) {
                    this.r = typedArray.getInteger(index, 0);
                }
            }
            if (this.d == -1) {
                this.b = true;
            }
        }

        private void w(l lVar, Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v0a.q9);
            v(lVar, context, typedArrayObtainStyledAttributes);
            typedArrayObtainStyledAttributes.recycle();
        }

        public int A() {
            return this.d;
        }

        public m B() {
            return this.l;
        }

        public boolean C() {
            return !this.o;
        }

        public boolean D(int i) {
            return (i & this.r) != 0;
        }

        public void E(int i) {
            this.h = Math.max(i, 8);
        }

        public void F(int i, String str, int i2) {
            this.e = i;
            this.f = str;
            this.g = i2;
        }

        public void G(int i) {
            this.p = i;
        }

        public void t(d dVar) {
            this.k.add(dVar);
        }

        public void u(Context context, XmlPullParser xmlPullParser) {
            this.m.add(new a(context, this, xmlPullParser));
        }

        public int x() {
            return this.n;
        }

        public int y() {
            return this.c;
        }

        public int z() {
            return this.q;
        }

        public b(int i, l lVar, int i2, int i3) {
            this.a = -1;
            this.b = false;
            this.c = -1;
            this.d = -1;
            this.e = 0;
            this.f = null;
            this.g = -1;
            this.h = 400;
            this.i = 0.0f;
            this.k = new ArrayList<>();
            this.l = null;
            this.m = new ArrayList<>();
            this.n = 0;
            this.o = false;
            this.p = -1;
            this.q = 0;
            this.r = 0;
            this.a = i;
            this.j = lVar;
            this.d = i2;
            this.c = i3;
            this.h = lVar.k;
            this.q = lVar.l;
        }

        b(l lVar, Context context, XmlPullParser xmlPullParser) {
            this.a = -1;
            this.b = false;
            this.c = -1;
            this.d = -1;
            this.e = 0;
            this.f = null;
            this.g = -1;
            this.h = 400;
            this.i = 0.0f;
            this.k = new ArrayList<>();
            this.l = null;
            this.m = new ArrayList<>();
            this.n = 0;
            this.o = false;
            this.p = -1;
            this.q = 0;
            this.r = 0;
            this.h = lVar.k;
            this.q = lVar.l;
            this.j = lVar;
            w(lVar, context, Xml.asAttributeSet(xmlPullParser));
        }
    }
}
