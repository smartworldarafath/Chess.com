package com.google.inputmethod;

import androidx.compose.ui.autofill.AutofillType;
import com.google.android.qjd;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.b0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\"6\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002`\u00038\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007\"\u001e\u0010\f\u001a\u00020\u0002*\u00020\u00018@X\u0080\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\u0004\u0010\t¨\u0006\r"}, d2 = {"Ljava/util/HashMap;", "Landroidx/compose/ui/autofill/AutofillType;", "", "Lkotlin/collections/HashMap;", "a", "Ljava/util/HashMap;", "getAndroidAutofillTypes$annotations", "()V", "androidAutofillTypes", "(Landroidx/compose/ui/autofill/AutofillType;)Ljava/lang/String;", "getAndroidType$annotations", "(Landroidx/compose/ui/autofill/AutofillType;)V", "androidType", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class sh {
    private static final HashMap<AutofillType, String> a = b0.l(new Pair[]{qjd.a(AutofillType.EmailAddress, "emailAddress"), qjd.a(AutofillType.Username, "username"), qjd.a(AutofillType.Password, "password"), qjd.a(AutofillType.NewUsername, "newUsername"), qjd.a(AutofillType.NewPassword, "newPassword"), qjd.a(AutofillType.PostalAddress, "postalAddress"), qjd.a(AutofillType.PostalCode, "postalCode"), qjd.a(AutofillType.CreditCardNumber, "creditCardNumber"), qjd.a(AutofillType.CreditCardSecurityCode, "creditCardSecurityCode"), qjd.a(AutofillType.CreditCardExpirationDate, "creditCardExpirationDate"), qjd.a(AutofillType.CreditCardExpirationMonth, "creditCardExpirationMonth"), qjd.a(AutofillType.CreditCardExpirationYear, "creditCardExpirationYear"), qjd.a(AutofillType.CreditCardExpirationDay, "creditCardExpirationDay"), qjd.a(AutofillType.AddressCountry, "addressCountry"), qjd.a(AutofillType.AddressRegion, "addressRegion"), qjd.a(AutofillType.AddressLocality, "addressLocality"), qjd.a(AutofillType.AddressStreet, "streetAddress"), qjd.a(AutofillType.AddressAuxiliaryDetails, "extendedAddress"), qjd.a(AutofillType.PostalCodeExtended, "extendedPostalCode"), qjd.a(AutofillType.PersonFullName, "personName"), qjd.a(AutofillType.PersonFirstName, "personGivenName"), qjd.a(AutofillType.PersonLastName, "personFamilyName"), qjd.a(AutofillType.PersonMiddleName, "personMiddleName"), qjd.a(AutofillType.PersonMiddleInitial, "personMiddleInitial"), qjd.a(AutofillType.PersonNamePrefix, "personNamePrefix"), qjd.a(AutofillType.PersonNameSuffix, "personNameSuffix"), qjd.a(AutofillType.PhoneNumber, "phoneNumber"), qjd.a(AutofillType.PhoneNumberDevice, "phoneNumberDevice"), qjd.a(AutofillType.PhoneCountryCode, "phoneCountryCode"), qjd.a(AutofillType.PhoneNumberNational, "phoneNational"), qjd.a(AutofillType.Gender, "gender"), qjd.a(AutofillType.BirthDateFull, "birthDateFull"), qjd.a(AutofillType.BirthDateDay, "birthDateDay"), qjd.a(AutofillType.BirthDateMonth, "birthDateMonth"), qjd.a(AutofillType.BirthDateYear, "birthDateYear"), qjd.a(AutofillType.SmsOtpCode, "smsOTPCode")});

    public static final String a(AutofillType autofillType) {
        String str = a.get(autofillType);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Unsupported autofill type");
    }
}
