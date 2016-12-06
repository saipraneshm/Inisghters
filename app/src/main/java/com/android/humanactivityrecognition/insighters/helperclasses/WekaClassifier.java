package com.android.humanactivityrecognition.insighters.helperclasses;

/**
 * Created by sai pranesh on 20-Nov-16.
 */
public class WekaClassifier {

    public static double classify(Object[] i)
            throws Exception {

        double p = Double.NaN;
        p = WekaClassifier.N2464e18a0(i);
        return p;
    }
    static double N2464e18a0(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() <= 2.9777884) {
            p = WekaClassifier.N392f4c721(i);
        } else if (((Double) i[2]).doubleValue() > 2.9777884) {
            p = WekaClassifier.N151d99de18(i);
        }
        return p;
    }
    static double N392f4c721(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() <= 2.0493898) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() > 2.0493898) {
            p = WekaClassifier.N2b3cf0472(i);
        }
        return p;
    }
    static double N2b3cf0472(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -1.6755953) {
            p = WekaClassifier.N6430be523(i);
        } else if (((Double) i[0]).doubleValue() > -1.6755953) {
            p = 2;
        }
        return p;
    }
    static double N6430be523(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 2;
        } else if (((Double) i[0]).doubleValue() <= -3.8903902) {
            p = 2;
        } else if (((Double) i[0]).doubleValue() > -3.8903902) {
            p = WekaClassifier.N675b7bef4(i);
        }
        return p;
    }
    static double N675b7bef4(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 1.3983635) {
            p = WekaClassifier.N2454f7aa5(i);
        } else if (((Double) i[1]).doubleValue() > 1.3983635) {
            p = 2;
        }
        return p;
    }
    static double N2454f7aa5(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() <= -2.1167603) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() > -2.1167603) {
            p = WekaClassifier.N682695af6(i);
        }
        return p;
    }
    static double N682695af6(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -2.0934906) {
            p = WekaClassifier.N98574d77(i);
        } else if (((Double) i[0]).doubleValue() > -2.0934906) {
            p = WekaClassifier.N1722581d16(i);
        }
        return p;
    }
    static double N98574d77(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 2.4988768) {
            p = WekaClassifier.N353df20b8(i);
        } else if (((Double) i[2]).doubleValue() > 2.4988768) {
            p = WekaClassifier.N6a00da3910(i);
        }
        return p;
    }
    static double N353df20b8(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 0.23888162) {
            p = WekaClassifier.N36d7baa19(i);
        } else if (((Double) i[1]).doubleValue() > 0.23888162) {
            p = 2;
        }
        return p;
    }
    static double N36d7baa19(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() <= -1.1495385) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() > -1.1495385) {
            p = 1;
        }
        return p;
    }
    static double N6a00da3910(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() <= -1.6555905) {
            p = WekaClassifier.N4801386211(i);
        } else if (((Double) i[1]).doubleValue() > -1.6555905) {
            p = WekaClassifier.N19ff949e13(i);
        }
        return p;
    }
    static double N4801386211(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -2.930503) {
            p = WekaClassifier.N127636c312(i);
        } else if (((Double) i[0]).doubleValue() > -2.930503) {
            p = 2;
        }
        return p;
    }
    static double N127636c312(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 2;
        } else if (((Double) i[0]).doubleValue() <= -3.5260773) {
            p = 2;
        } else if (((Double) i[0]).doubleValue() > -3.5260773) {
            p = 1;
        }
        return p;
    }
    static double N19ff949e13(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -3.3562775) {
            p = WekaClassifier.N7542548a14(i);
        } else if (((Double) i[0]).doubleValue() > -3.3562775) {
            p = 1;
        }
        return p;
    }
    static double N7542548a14(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 2.9127624) {
            p = WekaClassifier.N34c1b06815(i);
        } else if (((Double) i[2]).doubleValue() > 2.9127624) {
            p = 1;
        }
        return p;
    }
    static double N34c1b06815(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 2;
        } else if (((Double) i[0]).doubleValue() <= -3.8094742) {
            p = 2;
        } else if (((Double) i[0]).doubleValue() > -3.8094742) {
            p = 1;
        }
        return p;
    }
    static double N1722581d16(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() <= -0.57995415) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() > -0.57995415) {
            p = WekaClassifier.N729c650317(i);
        }
        return p;
    }
    static double N729c650317(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() <= 2.6494834) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() > 2.6494834) {
            p = 1;
        }
        return p;
    }
    static double N151d99de18(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -0.7567196) {
            p = WekaClassifier.N2c6639e519(i);
        } else if (((Double) i[0]).doubleValue() > -0.7567196) {
            p = WekaClassifier.N152230ba98(i);
        }
        return p;
    }
    static double N2c6639e519(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -2.0744476) {
            p = WekaClassifier.N29817ec420(i);
        } else if (((Double) i[0]).doubleValue() > -2.0744476) {
            p = WekaClassifier.N49d0fbe370(i);
        }
        return p;
    }
    static double N29817ec420(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() <= -5.1690817) {
            p = WekaClassifier.N3824a28a21(i);
        } else if (((Double) i[1]).doubleValue() > -5.1690817) {
            p = WekaClassifier.N5cbaaffc23(i);
        }
        return p;
    }
    static double N3824a28a21(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() <= 6.5474396) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() > 6.5474396) {
            p = WekaClassifier.N418e0f3922(i);
        }
        return p;
    }
    static double N418e0f3922(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() <= -6.2355795) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() > -6.2355795) {
            p = 1;
        }
        return p;
    }
    static double N5cbaaffc23(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 4.3079243) {
            p = WekaClassifier.N7e6f8df124(i);
        } else if (((Double) i[2]).doubleValue() > 4.3079243) {
            p = WekaClassifier.N2c0bc73d43(i);
        }
        return p;
    }
    static double N7e6f8df124(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 2.194303) {
            p = WekaClassifier.N63c2504425(i);
        } else if (((Double) i[1]).doubleValue() > 2.194303) {
            p = WekaClassifier.N245cf5d638(i);
        }
        return p;
    }
    static double N63c2504425(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -2.1774597) {
            p = WekaClassifier.N52846cc226(i);
        } else if (((Double) i[1]).doubleValue() > -2.1774597) {
            p = WekaClassifier.Nffca87e35(i);
        }
        return p;
    }
    static double N52846cc226(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() <= -2.6618652) {
            p = WekaClassifier.N5bc8fc2127(i);
        } else if (((Double) i[1]).doubleValue() > -2.6618652) {
            p = WekaClassifier.N4b0cc16d32(i);
        }
        return p;
    }
    static double N5bc8fc2127(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -5.1284637) {
            p = WekaClassifier.N594af2ac28(i);
        } else if (((Double) i[0]).doubleValue() > -5.1284637) {
            p = 2;
        }
        return p;
    }
    static double N594af2ac28(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 2;
        } else if (((Double) i[0]).doubleValue() <= -8.293167) {
            p = 2;
        } else if (((Double) i[0]).doubleValue() > -8.293167) {
            p = WekaClassifier.N287bd9b129(i);
        }
        return p;
    }
    static double N287bd9b129(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() <= -4.399011) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() > -4.399011) {
            p = WekaClassifier.N5968520030(i);
        }
        return p;
    }
    static double N5968520030(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -6.0841827) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -6.0841827) {
            p = WekaClassifier.N455d84f831(i);
        }
        return p;
    }
    static double N455d84f831(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 2;
        } else if (((Double) i[0]).doubleValue() <= -5.497087) {
            p = 2;
        } else if (((Double) i[0]).doubleValue() > -5.497087) {
            p = 1;
        }
        return p;
    }
    static double N4b0cc16d32(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 2;
        } else if (((Double) i[0]).doubleValue() <= -8.877548) {
            p = 2;
        } else if (((Double) i[0]).doubleValue() > -8.877548) {
            p = WekaClassifier.N3dcc3fec33(i);
        }
        return p;
    }
    static double N3dcc3fec33(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() <= 3.168641) {
            p = WekaClassifier.N262f820734(i);
        } else if (((Double) i[2]).doubleValue() > 3.168641) {
            p = 1;
        }
        return p;
    }
    static double N262f820734(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -2.9586887) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -2.9586887) {
            p = 2;
        }
        return p;
    }
    static double Nffca87e35(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -4.1965485) {
            p = WekaClassifier.N2256074536(i);
        } else if (((Double) i[0]).doubleValue() > -4.1965485) {
            p = 1;
        }
        return p;
    }
    static double N2256074536(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 3.6958992) {
            p = WekaClassifier.N7eb97fbc37(i);
        } else if (((Double) i[2]).doubleValue() > 3.6958992) {
            p = 1;
        }
        return p;
    }
    static double N7eb97fbc37(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 1.7734146) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > 1.7734146) {
            p = 2;
        }
        return p;
    }
    static double N245cf5d638(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() <= 3.9356186) {
            p = WekaClassifier.N4e09067b39(i);
        } else if (((Double) i[2]).doubleValue() > 3.9356186) {
            p = WekaClassifier.N2a3736de42(i);
        }
        return p;
    }
    static double N4e09067b39(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() <= 2.3744495) {
            p = WekaClassifier.N5c774cd040(i);
        } else if (((Double) i[1]).doubleValue() > 2.3744495) {
            p = 2;
        }
        return p;
    }
    static double N5c774cd040(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() <= 3.4093432) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() > 3.4093432) {
            p = WekaClassifier.N69869c7d41(i);
        }
        return p;
    }
    static double N69869c7d41(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 3.8120618) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > 3.8120618) {
            p = 2;
        }
        return p;
    }
    static double N2a3736de42(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 3.6651611) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > 3.6651611) {
            p = 2;
        }
        return p;
    }
    static double N2c0bc73d43(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 6.6192017) {
            p = WekaClassifier.N4afc0fa044(i);
        } else if (((Double) i[1]).doubleValue() > 6.6192017) {
            p = WekaClassifier.N696c0f2768(i);
        }
        return p;
    }
    static double N4afc0fa044(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -2.609651) {
            p = WekaClassifier.N174417f645(i);
        } else if (((Double) i[1]).doubleValue() > -2.609651) {
            p = WekaClassifier.N192f6f2e51(i);
        }
        return p;
    }
    static double N174417f645(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -4.1917877) {
            p = WekaClassifier.N4d6420646(i);
        } else if (((Double) i[0]).doubleValue() > -4.1917877) {
            p = WekaClassifier.N5c3dcfe348(i);
        }
        return p;
    }
    static double N4d6420646(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -13.374069) {
            p = WekaClassifier.N76164f8e47(i);
        } else if (((Double) i[0]).doubleValue() > -13.374069) {
            p = 1;
        }
        return p;
    }
    static double N76164f8e47(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 2;
        } else if (((Double) i[0]).doubleValue() <= -15.256943) {
            p = 2;
        } else if (((Double) i[0]).doubleValue() > -15.256943) {
            p = 1;
        }
        return p;
    }
    static double N5c3dcfe348(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -2.7800148) {
            p = WekaClassifier.N6b71883549(i);
        } else if (((Double) i[1]).doubleValue() > -2.7800148) {
            p = 1;
        }
        return p;
    }
    static double N6b71883549(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -3.853775) {
            p = WekaClassifier.N5d81312f50(i);
        } else if (((Double) i[0]).doubleValue() > -3.853775) {
            p = 2;
        }
        return p;
    }
    static double N5d81312f50(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() <= 5.657499) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() > 5.657499) {
            p = 1;
        }
        return p;
    }
    static double N192f6f2e51(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -3.3372345) {
            p = WekaClassifier.N2b5fe93f52(i);
        } else if (((Double) i[0]).doubleValue() > -3.3372345) {
            p = WekaClassifier.N188f1c8458(i);
        }
        return p;
    }
    static double N2b5fe93f52(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -13.556128) {
            p = WekaClassifier.N4c88ec4153(i);
        } else if (((Double) i[0]).doubleValue() > -13.556128) {
            p = 1;
        }
        return p;
    }
    static double N4c88ec4153(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 7.6734166) {
            p = WekaClassifier.N18d4a4b654(i);
        } else if (((Double) i[2]).doubleValue() > 7.6734166) {
            p = WekaClassifier.N7a60ee9d55(i);
        }
        return p;
    }
    static double N18d4a4b654(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() <= 6.5656314) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() > 6.5656314) {
            p = 1;
        }
        return p;
    }
    static double N7a60ee9d55(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -17.043411) {
            p = WekaClassifier.N2e22f6ff56(i);
        } else if (((Double) i[0]).doubleValue() > -17.043411) {
            p = 1;
        }
        return p;
    }
    static double N2e22f6ff56(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 2;
        } else if (((Double) i[0]).doubleValue() <= -19.24205) {
            p = 2;
        } else if (((Double) i[0]).doubleValue() > -19.24205) {
            p = WekaClassifier.N25c3ed9e57(i);
        }
        return p;
    }
    static double N25c3ed9e57(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() <= 0.7137714) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() > 0.7137714) {
            p = 1;
        }
        return p;
    }
    static double N188f1c8458(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 2.8344116) {
            p = WekaClassifier.N65660d0e59(i);
        } else if (((Double) i[1]).doubleValue() > 2.8344116) {
            p = WekaClassifier.N44452e7265(i);
        }
        return p;
    }
    static double N65660d0e59(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 8.848068) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > 8.848068) {
            p = WekaClassifier.N5c4a8a5360(i);
        }
        return p;
    }
    static double N5c4a8a5360(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 9.368179) {
            p = WekaClassifier.N665f335961(i);
        } else if (((Double) i[2]).doubleValue() > 9.368179) {
            p = 1;
        }
        return p;
    }
    static double N665f335961(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -2.6557946) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -2.6557946) {
            p = WekaClassifier.N654782a62(i);
        }
        return p;
    }
    static double N654782a62(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 0.74684644) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > 0.74684644) {
            p = WekaClassifier.N538f1b9363(i);
        }
        return p;
    }
    static double N538f1b9363(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -2.5029144) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -2.5029144) {
            p = WekaClassifier.N5b9f1ba364(i);
        }
        return p;
    }
    static double N5b9f1ba364(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 0.866701) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > 0.866701) {
            p = 1;
        }
        return p;
    }
    static double N44452e7265(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() <= 8.851639) {
            p = WekaClassifier.N61f59bf866(i);
        } else if (((Double) i[2]).doubleValue() > 8.851639) {
            p = 1;
        }
        return p;
    }
    static double N61f59bf866(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -2.4715643) {
            p = WekaClassifier.N4a8d47d667(i);
        } else if (((Double) i[0]).doubleValue() > -2.4715643) {
            p = 2;
        }
        return p;
    }
    static double N4a8d47d667(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 3.751714) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > 3.751714) {
            p = 2;
        }
        return p;
    }
    static double N696c0f2768(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -4.0180206) {
            p = WekaClassifier.N4379ac669(i);
        } else if (((Double) i[0]).doubleValue() > -4.0180206) {
            p = 2;
        }
        return p;
    }
    static double N4379ac669(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 7.6629944) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > 7.6629944) {
            p = 2;
        }
        return p;
    }
    static double N49d0fbe370(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 8.748093) {
            p = WekaClassifier.N6943b6f871(i);
        } else if (((Double) i[2]).doubleValue() > 8.748093) {
            p = WekaClassifier.N595b58b889(i);
        }
        return p;
    }
    static double N6943b6f871(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 2.585738) {
            p = WekaClassifier.N60df99c072(i);
        } else if (((Double) i[1]).doubleValue() > 2.585738) {
            p = 2;
        }
        return p;
    }
    static double N60df99c072(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -1.3829498) {
            p = WekaClassifier.N5806ceb773(i);
        } else if (((Double) i[0]).doubleValue() > -1.3829498) {
            p = WekaClassifier.N3397695684(i);
        }
        return p;
    }
    static double N5806ceb773(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 3.5344691) {
            p = WekaClassifier.N16c739b774(i);
        } else if (((Double) i[2]).doubleValue() > 3.5344691) {
            p = WekaClassifier.N6247b9e175(i);
        }
        return p;
    }
    static double N16c739b774(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() <= -1.0287433) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() > -1.0287433) {
            p = 1;
        }
        return p;
    }
    static double N6247b9e175(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -0.3279953) {
            p = WekaClassifier.N7e4a3df076(i);
        } else if (((Double) i[1]).doubleValue() > -0.3279953) {
            p = 1;
        }
        return p;
    }
    static double N7e4a3df076(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() <= -2.8742392) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() > -2.8742392) {
            p = WekaClassifier.N10d737f877(i);
        }
        return p;
    }
    static double N10d737f877(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -1.6778307) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -1.6778307) {
            p = WekaClassifier.N3ff2aed478(i);
        }
        return p;
    }
    static double N3ff2aed478(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() <= 4.916505) {
            p = WekaClassifier.N6025807a79(i);
        } else if (((Double) i[2]).doubleValue() > 4.916505) {
            p = WekaClassifier.Naafb6c83(i);
        }
        return p;
    }
    static double N6025807a79(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() <= -1.4320147) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() > -1.4320147) {
            p = WekaClassifier.N4faf843380(i);
        }
        return p;
    }
    static double N4faf843380(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -1.525281) {
            p = WekaClassifier.N66ee02c981(i);
        } else if (((Double) i[0]).doubleValue() > -1.525281) {
            p = 2;
        }
        return p;
    }
    static double N66ee02c981(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -0.83048874) {
            p = WekaClassifier.N4c4094ce82(i);
        } else if (((Double) i[1]).doubleValue() > -0.83048874) {
            p = 1;
        }
        return p;
    }
    static double N4c4094ce82(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -1.1502917) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > -1.1502917) {
            p = 2;
        }
        return p;
    }
    static double Naafb6c83(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 7.0223236) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > 7.0223236) {
            p = 2;
        }
        return p;
    }
    static double N3397695684(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() <= -0.82829595) {
            p = WekaClassifier.N25f9cda785(i);
        } else if (((Double) i[1]).doubleValue() > -0.82829595) {
            p = WekaClassifier.N3af13c7f87(i);
        }
        return p;
    }
    static double N25f9cda785(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() <= -1.3251907) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() > -1.3251907) {
            p = WekaClassifier.N6dd7cb3286(i);
        }
        return p;
    }
    static double N6dd7cb3286(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() <= 4.223955) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() > 4.223955) {
            p = 1;
        }
        return p;
    }
    static double N3af13c7f87(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() <= 3.9052277) {
            p = WekaClassifier.N32242fae88(i);
        } else if (((Double) i[2]).doubleValue() > 3.9052277) {
            p = 1;
        }
        return p;
    }
    static double N32242fae88(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 1.0489596) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > 1.0489596) {
            p = 2;
        }
        return p;
    }
    static double N595b58b889(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 0.7492355) {
            p = WekaClassifier.Na8686fa90(i);
        } else if (((Double) i[1]).doubleValue() > 0.7492355) {
            p = WekaClassifier.N17ffa13b94(i);
        }
        return p;
    }
    static double Na8686fa90(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() <= -0.06756389) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() > -0.06756389) {
            p = WekaClassifier.N39a7511191(i);
        }
        return p;
    }
    static double N39a7511191(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= 9.941849) {
            p = WekaClassifier.N2a6d50d492(i);
        } else if (((Double) i[2]).doubleValue() > 9.941849) {
            p = 1;
        }
        return p;
    }
    static double N2a6d50d492(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 0.6000468) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > 0.6000468) {
            p = WekaClassifier.N297043b993(i);
        }
        return p;
    }
    static double N297043b993(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -1.7956513) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > -1.7956513) {
            p = 1;
        }
        return p;
    }
    static double N17ffa13b94(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -1.9504514) {
            p = WekaClassifier.N14d3550c95(i);
        } else if (((Double) i[0]).doubleValue() > -1.9504514) {
            p = 1;
        }
        return p;
    }
    static double N14d3550c95(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() <= 9.030167) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() > 9.030167) {
            p = WekaClassifier.N54f84cb296(i);
        }
        return p;
    }
    static double N54f84cb296(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 1.0247183) {
            p = WekaClassifier.N7f3eb01f97(i);
        } else if (((Double) i[1]).doubleValue() > 1.0247183) {
            p = 1;
        }
        return p;
    }
    static double N7f3eb01f97(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 0.832885) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > 0.832885) {
            p = 0;
        }
        return p;
    }
    static double N152230ba98(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 0.692935) {
            p = WekaClassifier.N1bd76c2799(i);
        } else if (((Double) i[0]).doubleValue() > 0.692935) {
            p = WekaClassifier.N5c4b672b113(i);
        }
        return p;
    }
    static double N1bd76c2799(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() <= 9.064682) {
            p = WekaClassifier.Nd5c2e33100(i);
        } else if (((Double) i[2]).doubleValue() > 9.064682) {
            p = WekaClassifier.N600032ab109(i);
        }
        return p;
    }
    static double Nd5c2e33100(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() <= 3.8973114) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() > 3.8973114) {
            p = WekaClassifier.N768d9cf101(i);
        }
        return p;
    }
    static double N768d9cf101(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() <= -0.24779987) {
            p = WekaClassifier.N34b8e78102(i);
        } else if (((Double) i[1]).doubleValue() > -0.24779987) {
            p = WekaClassifier.N519c8af8106(i);
        }
        return p;
    }
    static double N34b8e78102(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 2;
        } else if (((Double) i[0]).doubleValue() <= 0.3325858) {
            p = 2;
        } else if (((Double) i[0]).doubleValue() > 0.3325858) {
            p = WekaClassifier.N235d6c62103(i);
        }
        return p;
    }
    static double N235d6c62103(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 0.42347443) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > 0.42347443) {
            p = WekaClassifier.N4f9ce38c104(i);
        }
        return p;
    }
    static double N4f9ce38c104(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -1.3631711) {
            p = WekaClassifier.Nefbed11105(i);
        } else if (((Double) i[1]).doubleValue() > -1.3631711) {
            p = 2;
        }
        return p;
    }
    static double Nefbed11105(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() <= -2.7836294) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() > -2.7836294) {
            p = 1;
        }
        return p;
    }
    static double N519c8af8106(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 1.1360627) {
            p = WekaClassifier.N19ead2d5107(i);
        } else if (((Double) i[1]).doubleValue() > 1.1360627) {
            p = 2;
        }
        return p;
    }
    static double N19ead2d5107(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -0.30494213) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -0.30494213) {
            p = WekaClassifier.N31c2c2e7108(i);
        }
        return p;
    }
    static double N31c2c2e7108(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() <= 0.04938793) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() > 0.04938793) {
            p = 1;
        }
        return p;
    }
    static double N600032ab109(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 0.71691376) {
            p = WekaClassifier.N55febf19110(i);
        } else if (((Double) i[1]).doubleValue() > 0.71691376) {
            p = 1;
        }
        return p;
    }
    static double N55febf19110(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= 10.025162) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > 10.025162) {
            p = WekaClassifier.N1a4db309111(i);
        }
        return p;
    }
    static double N1a4db309111(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= 10.242966) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > 10.242966) {
            p = WekaClassifier.N3dbf8f5d112(i);
        }
        return p;
    }
    static double N3dbf8f5d112(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() <= -0.37242585) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() > -0.37242585) {
            p = 1;
        }
        return p;
    }
    static double N5c4b672b113(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 4.6911387) {
            p = WekaClassifier.N7ced0dcc114(i);
        } else if (((Double) i[2]).doubleValue() > 4.6911387) {
            p = WekaClassifier.N627521e3130(i);
        }
        return p;
    }
    static double N7ced0dcc114(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 2.4172962) {
            p = WekaClassifier.Nbcf2ca3115(i);
        } else if (((Double) i[1]).doubleValue() > 2.4172962) {
            p = 2;
        }
        return p;
    }
    static double Nbcf2ca3115(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() <= -2.127245) {
            p = WekaClassifier.N4a4b9fe0116(i);
        } else if (((Double) i[1]).doubleValue() > -2.127245) {
            p = WekaClassifier.N60b403c121(i);
        }
        return p;
    }
    static double N4a4b9fe0116(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() <= 4.0635223) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() > 4.0635223) {
            p = WekaClassifier.N4dbecbbd117(i);
        }
        return p;
    }
    static double N4dbecbbd117(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() <= -4.653535) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() > -4.653535) {
            p = WekaClassifier.N59292cab118(i);
        }
        return p;
    }
    static double N59292cab118(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 2;
        } else if (((Double) i[0]).doubleValue() <= 4.621408) {
            p = WekaClassifier.N2b71b919119(i);
        } else if (((Double) i[0]).doubleValue() > 4.621408) {
            p = 1;
        }
        return p;
    }
    static double N2b71b919119(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 1.424078) {
            p = WekaClassifier.N3d538708120(i);
        } else if (((Double) i[0]).doubleValue() > 1.424078) {
            p = 2;
        }
        return p;
    }
    static double N3d538708120(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() <= -2.4746246) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() > -2.4746246) {
            p = 1;
        }
        return p;
    }
    static double N60b403c121(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 3.9284267) {
            p = WekaClassifier.N16576822122(i);
        } else if (((Double) i[0]).doubleValue() > 3.9284267) {
            p = WekaClassifier.N1407df63128(i);
        }
        return p;
    }
    static double N16576822122(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 3.3092983) {
            p = WekaClassifier.N30c8b280123(i);
        } else if (((Double) i[2]).doubleValue() > 3.3092983) {
            p = WekaClassifier.N11020856124(i);
        }
        return p;
    }
    static double N30c8b280123(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() <= 3.1101508) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() > 3.1101508) {
            p = 1;
        }
        return p;
    }
    static double N11020856124(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 3.8004913) {
            p = WekaClassifier.N4dd4a0ea125(i);
        } else if (((Double) i[2]).doubleValue() > 3.8004913) {
            p = 1;
        }
        return p;
    }
    static double N4dd4a0ea125(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 3.3316965) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > 3.3316965) {
            p = WekaClassifier.N60efd70a126(i);
        }
        return p;
    }
    static double N60efd70a126(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() <= 3.477578) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() > 3.477578) {
            p = WekaClassifier.N15462525127(i);
        }
        return p;
    }
    static double N15462525127(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 0.8070718) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > 0.8070718) {
            p = 2;
        }
        return p;
    }
    static double N1407df63128(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() <= 4.1873016) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() > 4.1873016) {
            p = WekaClassifier.N7cbcfef9129(i);
        }
        return p;
    }
    static double N7cbcfef9129(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 0.54067373) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > 0.54067373) {
            p = 2;
        }
        return p;
    }
    static double N627521e3130(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 5.028617) {
            p = WekaClassifier.N463e5f85131(i);
        } else if (((Double) i[1]).doubleValue() > 5.028617) {
            p = WekaClassifier.N20fb774158(i);
        }
        return p;
    }
    static double N463e5f85131(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 2.1610663) {
            p = WekaClassifier.N6ce87ce6132(i);
        } else if (((Double) i[0]).doubleValue() > 2.1610663) {
            p = WekaClassifier.N7ef3204144(i);
        }
        return p;
    }
    static double N6ce87ce6132(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 0.7811909) {
            p = WekaClassifier.N77381cb4133(i);
        } else if (((Double) i[0]).doubleValue() > 0.7811909) {
            p = WekaClassifier.N8ffe3fa135(i);
        }
        return p;
    }
    static double N77381cb4133(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() <= 9.163467) {
            p = WekaClassifier.N3c095189134(i);
        } else if (((Double) i[2]).doubleValue() > 9.163467) {
            p = 0;
        }
        return p;
    }
    static double N3c095189134(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 4.849045) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > 4.849045) {
            p = 2;
        }
        return p;
    }
    static double N8ffe3fa135(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() <= -2.795166) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() > -2.795166) {
            p = WekaClassifier.N275fa14f136(i);
        }
        return p;
    }
    static double N275fa14f136(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 2.2337902) {
            p = WekaClassifier.N1035d4ac137(i);
        } else if (((Double) i[1]).doubleValue() > 2.2337902) {
            p = WekaClassifier.N3c56843a143(i);
        }
        return p;
    }
    static double N1035d4ac137(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 6.979477) {
            p = WekaClassifier.N66c64a3a138(i);
        } else if (((Double) i[2]).doubleValue() > 6.979477) {
            p = WekaClassifier.N213335fa142(i);
        }
        return p;
    }
    static double N66c64a3a138(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 1.1057081) {
            p = WekaClassifier.N11d1952b139(i);
        } else if (((Double) i[0]).doubleValue() > 1.1057081) {
            p = 1;
        }
        return p;
    }
    static double N11d1952b139(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 5.2780175) {
            p = WekaClassifier.N4bde0b87140(i);
        } else if (((Double) i[2]).doubleValue() > 5.2780175) {
            p = 2;
        }
        return p;
    }
    static double N4bde0b87140(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 0.9813234) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > 0.9813234) {
            p = WekaClassifier.N75f036e4141(i);
        }
        return p;
    }
    static double N75f036e4141(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -1.5626522) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > -1.5626522) {
            p = 2;
        }
        return p;
    }
    static double N213335fa142(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 2;
        } else if (((Double) i[0]).doubleValue() <= 2.0250487) {
            p = 2;
        } else if (((Double) i[0]).doubleValue() > 2.0250487) {
            p = 1;
        }
        return p;
    }
    static double N3c56843a143(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() <= 12.803055) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() > 12.803055) {
            p = 1;
        }
        return p;
    }
    static double N7ef3204144(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() <= -7.040556) {
            p = WekaClassifier.N735c630b145(i);
        } else if (((Double) i[1]).doubleValue() > -7.040556) {
            p = WekaClassifier.N43872e7e147(i);
        }
        return p;
    }
    static double N735c630b145(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() <= -9.106747) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() > -9.106747) {
            p = WekaClassifier.N4b78047f146(i);
        }
        return p;
    }
    static double N4b78047f146(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -7.415292) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > -7.415292) {
            p = 2;
        }
        return p;
    }
    static double N43872e7e147(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 4.027008) {
            p = WekaClassifier.N3d865b18148(i);
        } else if (((Double) i[0]).doubleValue() > 4.027008) {
            p = WekaClassifier.N5d924d0e154(i);
        }
        return p;
    }
    static double N3d865b18148(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 1.5846695) {
            p = WekaClassifier.N2dd23398149(i);
        } else if (((Double) i[1]).doubleValue() > 1.5846695) {
            p = WekaClassifier.N53dd71c3152(i);
        }
        return p;
    }
    static double N2dd23398149(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -3.2142158) {
            p = WekaClassifier.N260281a1150(i);
        } else if (((Double) i[1]).doubleValue() > -3.2142158) {
            p = 1;
        }
        return p;
    }
    static double N260281a1150(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() <= -4.5742354) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() > -4.5742354) {
            p = WekaClassifier.N5c0cafc1151(i);
        }
        return p;
    }
    static double N5c0cafc1151(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() <= 6.7259674) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() > 6.7259674) {
            p = 1;
        }
        return p;
    }
    static double N53dd71c3152(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 2;
        } else if (((Double) i[0]).doubleValue() <= 3.457881) {
            p = 2;
        } else if (((Double) i[0]).doubleValue() > 3.457881) {
            p = WekaClassifier.N6fafc6d3153(i);
        }
        return p;
    }
    static double N6fafc6d3153(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() <= 5.254898) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() > 5.254898) {
            p = 1;
        }
        return p;
    }
    static double N5d924d0e154(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 5.478653) {
            p = WekaClassifier.N645993da155(i);
        } else if (((Double) i[2]).doubleValue() > 5.478653) {
            p = 1;
        }
        return p;
    }
    static double N645993da155(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 1.2806745) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > 1.2806745) {
            p = WekaClassifier.N5cb2b5fb156(i);
        }
        return p;
    }
    static double N5cb2b5fb156(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 6.303097) {
            p = WekaClassifier.N4d3a79e0157(i);
        } else if (((Double) i[0]).doubleValue() > 6.303097) {
            p = 2;
        }
        return p;
    }
    static double N4d3a79e0157(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 3.5393095) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > 3.5393095) {
            p = 2;
        }
        return p;
    }
    static double N20fb774158(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() <= 6.013397) {
            p = WekaClassifier.N2ae023ac159(i);
        } else if (((Double) i[1]).doubleValue() > 6.013397) {
            p = 2;
        }
        return p;
    }
    static double N2ae023ac159(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 2;
        } else if (((Double) i[0]).doubleValue() <= 6.2847795) {
            p = 2;
        } else if (((Double) i[0]).doubleValue() > 6.2847795) {
            p = WekaClassifier.N63344666160(i);
        }
        return p;
    }
    static double N63344666160(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 13.075741) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > 13.075741) {
            p = 2;
        }
        return p;
    }

   }
