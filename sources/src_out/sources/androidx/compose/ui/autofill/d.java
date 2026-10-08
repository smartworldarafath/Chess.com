package androidx.compose.ui.autofill;

import com.google.inputmethod.i02;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003J\u0018\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H¦\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/autofill/d;", "", "other", "a", "(Landroidx/compose/ui/autofill/d;)Landroidx/compose/ui/autofill/d;", "Lcom/google/android/fk;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: androidx.compose.ui.autofill.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bl\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\bR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\bR\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u001c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u001b\u0010\bR\u0017\u0010\u001f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u0017\u0010\"\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b!\u0010\bR\u0017\u0010%\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\bR\u0017\u0010(\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u0006\u001a\u0004\b'\u0010\bR\u0017\u0010+\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010\bR\u0017\u0010.\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010\u0006\u001a\u0004\b-\u0010\bR\u0017\u00101\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u0010\u0006\u001a\u0004\b0\u0010\bR\u0017\u00104\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u0010\u0006\u001a\u0004\b3\u0010\bR\u0017\u00107\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b5\u0010\u0006\u001a\u0004\b6\u0010\bR\u0017\u0010:\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b8\u0010\u0006\u001a\u0004\b9\u0010\bR\u0017\u0010=\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b;\u0010\u0006\u001a\u0004\b<\u0010\bR\u0017\u0010@\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b>\u0010\u0006\u001a\u0004\b?\u0010\bR\u0017\u0010C\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bA\u0010\u0006\u001a\u0004\bB\u0010\bR\u0017\u0010F\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bD\u0010\u0006\u001a\u0004\bE\u0010\bR\u0017\u0010I\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bG\u0010\u0006\u001a\u0004\bH\u0010\bR\u0017\u0010L\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bJ\u0010\u0006\u001a\u0004\bK\u0010\bR\u0017\u0010O\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bM\u0010\u0006\u001a\u0004\bN\u0010\bR\u0017\u0010R\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bP\u0010\u0006\u001a\u0004\bQ\u0010\bR\u0017\u0010T\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bS\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010W\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bU\u0010\u0006\u001a\u0004\bV\u0010\bR\u0017\u0010Z\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bX\u0010\u0006\u001a\u0004\bY\u0010\bR\u0017\u0010]\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b[\u0010\u0006\u001a\u0004\b\\\u0010\bR\u0017\u0010`\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b^\u0010\u0006\u001a\u0004\b_\u0010\bR\u0017\u0010c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\ba\u0010\u0006\u001a\u0004\bb\u0010\bR\u0017\u0010f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bd\u0010\u0006\u001a\u0004\be\u0010\bR\u0017\u0010i\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bg\u0010\u0006\u001a\u0004\bh\u0010\bR\u0017\u0010l\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bj\u0010\u0006\u001a\u0004\bk\u0010\bR\u0017\u0010o\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bm\u0010\u0006\u001a\u0004\bn\u0010\b¨\u0006p"}, d2 = {"Landroidx/compose/ui/autofill/d$a;", "", "<init>", "()V", "Landroidx/compose/ui/autofill/d;", "b", "Landroidx/compose/ui/autofill/d;", "d", "()Landroidx/compose/ui/autofill/d;", "Username", "c", "Password", "a", "EmailAddress", "e", "getNewUsername", "NewUsername", "f", "getNewPassword", "NewPassword", "g", "getPostalAddress", "PostalAddress", "h", "getPostalCode", "PostalCode", "i", "getCreditCardNumber", "CreditCardNumber", "j", "getCreditCardSecurityCode", "CreditCardSecurityCode", "k", "getCreditCardExpirationDate", "CreditCardExpirationDate", "l", "getCreditCardExpirationMonth", "CreditCardExpirationMonth", "m", "getCreditCardExpirationYear", "CreditCardExpirationYear", "n", "getCreditCardExpirationDay", "CreditCardExpirationDay", "o", "getAddressCountry", "AddressCountry", "p", "getAddressRegion", "AddressRegion", "q", "getAddressLocality", "AddressLocality", "r", "getAddressStreet", "AddressStreet", "s", "getAddressAuxiliaryDetails", "AddressAuxiliaryDetails", "t", "getPostalCodeExtended", "PostalCodeExtended", "u", "getPersonFullName", "PersonFullName", "v", "getPersonFirstName", "PersonFirstName", "w", "getPersonLastName", "PersonLastName", "x", "getPersonMiddleName", "PersonMiddleName", "y", "getPersonMiddleInitial", "PersonMiddleInitial", "z", "getPersonNamePrefix", "PersonNamePrefix", "A", "getPersonNameSuffix", "PersonNameSuffix", "B", "PhoneNumber", "C", "getPhoneNumberDevice", "PhoneNumberDevice", "D", "getPhoneCountryCode", "PhoneCountryCode", "E", "getPhoneNumberNational", "PhoneNumberNational", "F", "getGender", "Gender", "G", "getBirthDateFull", "BirthDateFull", "H", "getBirthDateDay", "BirthDateDay", "I", "getBirthDateMonth", "BirthDateMonth", "J", "getBirthDateYear", "BirthDateYear", "K", "getSmsOtpCode", "SmsOtpCode", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private static final d Username = i02.a("username");

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private static final d Password = i02.a("password");

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private static final d EmailAddress = i02.a("emailAddress");

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private static final d NewUsername = i02.a("newUsername");

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private static final d NewPassword = i02.a("newPassword");

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private static final d PostalAddress = i02.a("postalAddress");

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private static final d PostalCode = i02.a("postalCode");

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private static final d CreditCardNumber = i02.a("creditCardNumber");

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private static final d CreditCardSecurityCode = i02.a("creditCardSecurityCode");

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private static final d CreditCardExpirationDate = i02.a("creditCardExpirationDate");

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private static final d CreditCardExpirationMonth = i02.a("creditCardExpirationMonth");

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private static final d CreditCardExpirationYear = i02.a("creditCardExpirationYear");

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        private static final d CreditCardExpirationDay = i02.a("creditCardExpirationDay");

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        private static final d AddressCountry = i02.a("addressCountry");

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        private static final d AddressRegion = i02.a("addressRegion");

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        private static final d AddressLocality = i02.a("addressLocality");

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        private static final d AddressStreet = i02.a("streetAddress");

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        private static final d AddressAuxiliaryDetails = i02.a("extendedAddress");

        /* JADX INFO: renamed from: t, reason: from kotlin metadata */
        private static final d PostalCodeExtended = i02.a("extendedPostalCode");

        /* JADX INFO: renamed from: u, reason: from kotlin metadata */
        private static final d PersonFullName = i02.a("personName");

        /* JADX INFO: renamed from: v, reason: from kotlin metadata */
        private static final d PersonFirstName = i02.a("personGivenName");

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private static final d PersonLastName = i02.a("personFamilyName");

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private static final d PersonMiddleName = i02.a("personMiddleName");

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        private static final d PersonMiddleInitial = i02.a("personMiddleInitial");

        /* JADX INFO: renamed from: z, reason: from kotlin metadata */
        private static final d PersonNamePrefix = i02.a("personNamePrefix");

        /* JADX INFO: renamed from: A, reason: from kotlin metadata */
        private static final d PersonNameSuffix = i02.a("personNameSuffix");

        /* JADX INFO: renamed from: B, reason: from kotlin metadata */
        private static final d PhoneNumber = i02.a("phoneNumber");

        /* JADX INFO: renamed from: C, reason: from kotlin metadata */
        private static final d PhoneNumberDevice = i02.a("phoneNumberDevice");

        /* JADX INFO: renamed from: D, reason: from kotlin metadata */
        private static final d PhoneCountryCode = i02.a("phoneCountryCode");

        /* JADX INFO: renamed from: E, reason: from kotlin metadata */
        private static final d PhoneNumberNational = i02.a("phoneNational");

        /* JADX INFO: renamed from: F, reason: from kotlin metadata */
        private static final d Gender = i02.a("gender");

        /* JADX INFO: renamed from: G, reason: from kotlin metadata */
        private static final d BirthDateFull = i02.a("birthDateFull");

        /* JADX INFO: renamed from: H, reason: from kotlin metadata */
        private static final d BirthDateDay = i02.a("birthDateDay");

        /* JADX INFO: renamed from: I, reason: from kotlin metadata */
        private static final d BirthDateMonth = i02.a("birthDateMonth");

        /* JADX INFO: renamed from: J, reason: from kotlin metadata */
        private static final d BirthDateYear = i02.a("birthDateYear");

        /* JADX INFO: renamed from: K, reason: from kotlin metadata */
        private static final d SmsOtpCode = i02.a("smsOTPCode");

        private Companion() {
        }

        public final d a() {
            return EmailAddress;
        }

        public final d b() {
            return Password;
        }

        public final d c() {
            return PhoneNumber;
        }

        public final d d() {
            return Username;
        }
    }

    d a(d other);
}
