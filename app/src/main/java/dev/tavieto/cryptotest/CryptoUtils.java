package dev.tavieto.cryptotest;

import org.spongycastle.jce.ECNamedCurveTable;
import org.spongycastle.jce.spec.ECParameterSpec;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Security;

// Adicione a biblioteca Spongy Castle ao seu projeto

public class CryptoUtils {
    public static KeyPair getKeys() throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        // Geração de chaves ECC
        Security.insertProviderAt(new org.spongycastle.jce.provider.BouncyCastleProvider(), 1);
        KeyPairGenerator keyPairGeneratorECC = KeyPairGenerator.getInstance("ECDSA", "SC");
        ECParameterSpec ecSpec = ECNamedCurveTable.getParameterSpec("secp256r1");
        keyPairGeneratorECC.initialize(ecSpec);
        KeyPair keyPairECC = keyPairGeneratorECC.generateKeyPair();
        return keyPairECC;
    }
}

//    public static String getPrivateKeyBase64() {
//        return "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCV2uyFPVPSnzxPpPud6m8zoENWB4WdlcewVx5xLVu/GIpE8Ps4UZg8qz8wCt/bkDiJgXDaRRANb+ItPgOlBU2MED9iD/UiBp5jnengiybOIb+0XY1jewLNc5GnwxT1E0wyxNyMrHFDoGvOYhbOU8wiy7z/Mxc/IOK9Tm8PdpiP5WDtfVR8a92lC61aCv0oqbnuKzdp/BVZMJ+S2LC7AzwJeO0eV0mqrRZrK3KJsnFQHi2q6RRDMlQIfRWEEeTV7XH35cOn8TJ8g2kczOM0kKA+t/LNuar0AxaoEXTgHic0EgnaIRC7vaiDRftnm1JRDEAsS9oXyDB6qDLzbORVl0BdAgMBAAECggEABMytNJtBOwa0lMxw7p7ajum8Hl5BTknEyoYPyIouXRF5JDofoa8jVBYcAProLo0Q8n590c/Scsu5j79juH5R/IFstkRSkpNpsUEWg4WRaZq1HB6+74e6EEB6UsgxvKOwlhOuCKdhPUw/B64mktcmO5sQ44+MWA5ClNOVRQaEXl9qzXeVX5nymS2uvHoKg64kfcUCblMQOuMeg5btnsIvb1y0uT8PAmQRLOMAsixqefZ7o9IoKXPix6b/dLkpb2MCr5znliHWIR7CrHipCimspd4uQ0Qo9zmL5z2PBJz7t9u5BWcfbRDoRYjs5/fohF7BNC5df0e398xFldiUzj4LAQKBgQDIv7ZV1vn6dkTqkyav8GPRXuaHinmyoQ0+xFxADMdcEsmmHvhjS4AH6Ly1GDDS0OvaXk/DldcYsXlZoRLFA4liJoXxcxu5vfAnKcvZ3WrGqsvx8NuZZatH+euXGbgrFHWBH7oaTlCtm/gG3MzJKQNHymL4H8zk6qjvB+S4W4NzwQKBgQC/GVzI1o6GO03n9Mbo4N4Y3h4AFXqDKtzVrrjJQ4pF+tBw1ix/gJWhuWqFr1Ps/qcXn1CBY1GwuXc4M2qtHB/A9C8C/K3sfhIAjIO35Ay/p9KegZZytqZ1L36Ac9RSIGlTDJZtUXSfYKItgwYXc/wYGcKgJuk240S8xVZU2x4DnQKBgEZdzM/x9tWwNx/yTJFHNfXhyfSguV+/zCDAO4XH9Ol1PHGaUX6crFgZYGwp+pMq4EE+5b6s+ySQsPSV3TpprvJUhobHzmQhC9jucaIAVrkkjTBVOORgGtWz6LyiK0gOd9G3CUjHQshX72yYYL/yPFAhxOcsXmmvR1/h6G4mxcEBAoGAK1DNZjyz65svqn8iQxENZqeaNzynG2owykKjYgNsKTaT3q+9QF1eDV1g1tKJ/HMwXrte3SUtFBjF/DgzWu/ABtWSfmPV7IAbBoLTLHCFrz+UDxeiiXf7PR651tXqb38nQIre4gKPo7ycpiJH1DMXFkNoiTKotCdJolw8mFlecUUCgYBnisDVY4jS84SE532l5Zha7eLxCstGH2c3xz+5MwmQsiFuk/oSI010K/2FzCPSLSqXjFQa5oY9qjljAWpGd36uvtLfYg2qTlUnto56EU0gYO/P/DKT0AQAVJl5pGLCz28Vd6EH9mEv2bwO0XaX4wWxuxH0v7PJiPJm2lfi8zjknA==";
//    }

//    public static String getPrivateKeyBase64() {
//        return "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCV2uyFPVPSnzxPpPud6m8zoENW\n" +
//                "B4WdlcewVx5xLVu/GIpE8Ps4UZg8qz8wCt/bkDiJgXDaRRANb+ItPgOlBU2MED9iD/UiBp5jneng\n" +
//                "iybOIb+0XY1jewLNc5GnwxT1E0wyxNyMrHFDoGvOYhbOU8wiy7z/Mxc/IOK9Tm8PdpiP5WDtfVR8\n" +
//                "a92lC61aCv0oqbnuKzdp/BVZMJ+S2LC7AzwJeO0eV0mqrRZrK3KJsnFQHi2q6RRDMlQIfRWEEeTV\n" +
//                "7XH35cOn8TJ8g2kczOM0kKA+t/LNuar0AxaoEXTgHic0EgnaIRC7vaiDRftnm1JRDEAsS9oXyDB6\n" +
//                "qDLzbORVl0BdAgMBAAECggEABMytNJtBOwa0lMxw7p7ajum8Hl5BTknEyoYPyIouXRF5JDofoa8j\n" +
//                "VBYcAProLo0Q8n590c/Scsu5j79juH5R/IFstkRSkpNpsUEWg4WRaZq1HB6+74e6EEB6UsgxvKOw\n" +
//                "lhOuCKdhPUw/B64mktcmO5sQ44+MWA5ClNOVRQaEXl9qzXeVX5nymS2uvHoKg64kfcUCblMQOuMe\n" +
//                "g5btnsIvb1y0uT8PAmQRLOMAsixqefZ7o9IoKXPix6b/dLkpb2MCr5znliHWIR7CrHipCimspd4u\n" +
//                "Q0Qo9zmL5z2PBJz7t9u5BWcfbRDoRYjs5/fohF7BNC5df0e398xFldiUzj4LAQKBgQDIv7ZV1vn6\n" +
//                "dkTqkyav8GPRXuaHinmyoQ0+xFxADMdcEsmmHvhjS4AH6Ly1GDDS0OvaXk/DldcYsXlZoRLFA4li\n" +
//                "JoXxcxu5vfAnKcvZ3WrGqsvx8NuZZatH+euXGbgrFHWBH7oaTlCtm/gG3MzJKQNHymL4H8zk6qjv\n" +
//                "B+S4W4NzwQKBgQC/GVzI1o6GO03n9Mbo4N4Y3h4AFXqDKtzVrrjJQ4pF+tBw1ix/gJWhuWqFr1Ps\n" +
//                "/qcXn1CBY1GwuXc4M2qtHB/A9C8C/K3sfhIAjIO35Ay/p9KegZZytqZ1L36Ac9RSIGlTDJZtUXSf\n" +
//                "YKItgwYXc/wYGcKgJuk240S8xVZU2x4DnQKBgEZdzM/x9tWwNx/yTJFHNfXhyfSguV+/zCDAO4XH\n" +
//                "9Ol1PHGaUX6crFgZYGwp+pMq4EE+5b6s+ySQsPSV3TpprvJUhobHzmQhC9jucaIAVrkkjTBVOORg\n" +
//                "GtWz6LyiK0gOd9G3CUjHQshX72yYYL/yPFAhxOcsXmmvR1/h6G4mxcEBAoGAK1DNZjyz65svqn8i\n" +
//                "QxENZqeaNzynG2owykKjYgNsKTaT3q+9QF1eDV1g1tKJ/HMwXrte3SUtFBjF/DgzWu/ABtWSfmPV\n" +
//                "7IAbBoLTLHCFrz+UDxeiiXf7PR651tXqb38nQIre4gKPo7ycpiJH1DMXFkNoiTKotCdJolw8mFle\n" +
//                "cUUCgYBnisDVY4jS84SE532l5Zha7eLxCstGH2c3xz+5MwmQsiFuk/oSI010K/2FzCPSLSqXjFQa\n" +
//                "5oY9qjljAWpGd36uvtLfYg2qTlUnto56EU0gYO/P/DKT0AQAVJl5pGLCz28Vd6EH9mEv2bwO0XaX\n" +
//                "4wWxuxH0v7PJiPJm2lfi8zjknA==";
//    }

//    public static String getEncryptedMessage() {
//        return "IypK+T0xSfN42j8kp4Mn6gAPTi2F7jA7c7rS1C0bkqXslFOCob0/Xfb0nBtNDFTFIZuh9I1yZOHr\n" +
//                "CifadYhUX53sf8kATE99ojVNlZgY08YHm7CoY95zX/zjXAhUF8RC/ic0592Rf93fSWHhXnpQxxjH\n" +
//                "0Q2CpdE1UWNbY8PeehoGE3IBb5rqoCdZeSyzA3Qv7y3pN2aqrWtR5tgHLrQWmDQxaNwgyUe5dG9n\n" +
//                "/iohfIcvkQJjQdFBgkZoG3Isj8BZi2pkQs2H1WyJUreIg4BjtVaGINeglsPtQPo1HEKbREqR6ja7\n" +
//                "AZP3+uNBmKD36J0PC582XnhrF2i+j2t3sUSYDA==";
//    }