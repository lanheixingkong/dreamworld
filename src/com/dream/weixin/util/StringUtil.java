package com.dream.weixin.util;

import java.util.Date;
import java.util.Random;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
/**
 * 
 * @author lkl_wmx
 *
 */
public class StringUtil {
	private static String KEY = "ailkContact";
	private static DESKeySpec dks;
	private static SecretKeyFactory keyFactory;
	private static SecretKey secretKey;
	
	static {
		try {
			dks = new DESKeySpec(KEY.getBytes());
			keyFactory = SecretKeyFactory.getInstance("DES");
			secretKey = keyFactory.generateSecret(dks);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Pattern pattern4UID = Pattern.compile("^[a-z0-9]{32}$");

	public static String getUUID32() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}

	public static boolean isUID(String str) {
		return str != null && pattern4UID.matcher(str.toLowerCase()).find();
	}

	public static String getDateRandomStr() {
		Date now = new Date();
		long l = now.getTime();
		return l + "";
	}

	/***
	 * 加密
	 * 
	 * @param data
	 * @return
	 * @throws Exception
	 */
	public static String encryptDES(String data) throws Exception {
		Cipher cipher = Cipher.getInstance("DES");
		cipher.init(Cipher.ENCRYPT_MODE, secretKey);
		byte[] bs = cipher.doFinal(data.getBytes());

		return byte2hex(bs);
	}

	public static String decryptDES(String data) throws Exception {
		Cipher cipher = Cipher.getInstance("DES");
		cipher.init(Cipher.DECRYPT_MODE, secretKey);
		byte[] bs = cipher.doFinal(hex2byte(data));
		return new String(bs);
	}

	public static void main(String[] args) {
//		String ols = "44433L<，，住,2xsloSSS";
//		System.out.println(ols);
//		/*
//		 * try{ String mm = encryptDES(ols); System.out.println(mm); String sss
//		 * = decryptDES("005F345327F6F93C775EF2FD094A685F");
//		 * System.out.println(sss);
//		 * 
//		 * }catch(Exception e){ e.printStackTrace(); }
//		 */
//		String str = getUUID32();
//		System.out.println(str);

		
//		String code = createVerifyCode();
//		System.out.println(code);
//		System.out.println(isMobileNO("18514725836"));
		
		RandomString(10);
		System.out.println(RandomString(10));
		System.out.println(RandomString(10));
		System.out.println(RandomString(10));
		System.out.println(RandomString(10));
	}

	/**
	 * 将二进制转化为16进制字符串
	 * 
	 * @param b
	 *            二进制字节数组
	 * @return String
	 */
	public static String byte2hex(byte[] b) {
		String hs = "";
		String stmp = "";
		for (int n = 0; n < b.length; n++) {
			stmp = (java.lang.Integer.toHexString(b[n] & 0XFF));
			if (stmp.length() == 1) {
				hs = hs + "0" + stmp;
			} else {
				hs = hs + stmp;
			}
		}
		return hs.toUpperCase();
	}

	/**
	 * 十六进制字符串转化为2进制
	 * 
	 * @param hex
	 * @return
	 */
	public static byte[] hex2byte(String hex) {
		byte[] tmp = hex.getBytes();
		int ttt = tmp.length / 2;
		byte[] ret = new byte[ttt];
		for (int i = 0; i < ttt; i++) {
			ret[i] = uniteBytes(tmp[i * 2], tmp[i * 2 + 1]);
		}
		return ret;
	}

	/**
	 * 将两个ASCII字符合成一个字节； 如："EF"--> 0xEF
	 * 
	 * @param src0
	 *            byte
	 * @param src1
	 *            byte
	 * @return byte
	 */
	public static byte uniteBytes(byte src0, byte src1) {
		byte _b0 = Byte.decode("0x" + new String(new byte[] { src0 }))
				.byteValue();
		_b0 = (byte) (_b0 << 4);
		byte _b1 = Byte.decode("0x" + new String(new byte[] { src1 }))
				.byteValue();
		byte ret = (byte) (_b0 ^ _b1);
		return ret;
	}

	public static String createVerifyCode() {
		// 生成随机类
		Random random = new Random();

		String sRand = "";
		for (int i = 0; i < 4; i++) {
			String rand = String.valueOf(random.nextInt(10));
			sRand += rand;

		}
		return sRand;
	}

	public static boolean isMobileNO(String mobiles){     
        Pattern p = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0-9]))\\d{8}$");     
        Matcher m = p.matcher(mobiles);     
         
        return m.matches();     
    } 
	
	/** 产生一个随机的字符串*/
	public static String RandomString(int length) {
		String str = "abcd0123456789";
		Random random = new Random();
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < length; i++) {
			int num = random.nextInt(14);
			buf.append(str.charAt(num));
		}
		return buf.toString();
	}

    /** 空字符串。 */
    public static final String EMPTY_STRING = "";

    /**
     * 比较两个字符串（大小写敏感）。
     * <pre>
     * StringUtil.equals(null, null)   = true
     * StringUtil.equals(null, "abc")  = false
     * StringUtil.equals("abc", null)  = false
     * StringUtil.equals("abc", "abc") = true
     * StringUtil.equals("abc", "ABC") = false
     * </pre>
     *
     * @param str1 要比较的字符串1
     * @param str2 要比较的字符串2
     *
     * @return 如果两个字符串相同，或者都是<code>null</code>，则返回<code>true</code>
     */
    public static boolean equals(String str1, String str2) {
        if (str1 == null) {
            return str2 == null;
        }

        return str1.equals(str2);
    }

    /**
     * 比较两个字符串（大小写不敏感）。
     * <pre>
     * StringUtil.equalsIgnoreCase(null, null)   = true
     * StringUtil.equalsIgnoreCase(null, "abc")  = false
     * StringUtil.equalsIgnoreCase("abc", null)  = false
     * StringUtil.equalsIgnoreCase("abc", "abc") = true
     * StringUtil.equalsIgnoreCase("abc", "ABC") = true
     * </pre>
     *
     * @param str1 要比较的字符串1
     * @param str2 要比较的字符串2
     *
     * @return 如果两个字符串相同，或者都是<code>null</code>，则返回<code>true</code>
     */
    public static boolean equalsIgnoreCase(String str1, String str2) {
        if (str1 == null) {
            return str2 == null;
        }

        return str1.equalsIgnoreCase(str2);
    }

    /**
     * 检查字符串是否是空白：<code>null</code>、空字符串<code>""</code>或只有空白字符。
     * <pre>
     * StringUtil.isBlank(null)      = true
     * StringUtil.isBlank("")        = true
     * StringUtil.isBlank(" ")       = true
     * StringUtil.isBlank("bob")     = false
     * StringUtil.isBlank("  bob  ") = false
     * </pre>
     *
     * @param str 要检查的字符串
     *
     * @return 如果为空白, 则返回<code>true</code>
     */
    public static boolean isBlank(String str) {
        int length;

        if ((str == null) || ((length = str.length()) == 0)) {
            return true;
        }

        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    /**
     * 检查字符串是否不是空白：<code>null</code>、空字符串<code>""</code>或只有空白字符。
     * <pre>
     * StringUtil.isBlank(null)      = false
     * StringUtil.isBlank("")        = false
     * StringUtil.isBlank(" ")       = false
     * StringUtil.isBlank("bob")     = true
     * StringUtil.isBlank("  bob  ") = true
     * </pre>
     *
     * @param str 要检查的字符串
     *
     * @return 如果为空白, 则返回<code>true</code>
     */
    public static boolean isNotBlank(String str) {
        int length;

        if ((str == null) || ((length = str.length()) == 0)) {
            return false;
        }

        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return true;
            }
        }

        return false;
    }

    /**
     * 检查字符串是否为<code>null</code>或空字符串<code>""</code>。
     * <pre>
     * StringUtil.isEmpty(null)      = true
     * StringUtil.isEmpty("")        = true
     * StringUtil.isEmpty(" ")       = false
     * StringUtil.isEmpty("bob")     = false
     * StringUtil.isEmpty("  bob  ") = false
     * </pre>
     *
     * @param str 要检查的字符串
     *
     * @return 如果为空, 则返回<code>true</code>
     */
    public static boolean isEmpty(String str) {
        return ((str == null) || (str.length() == 0));
    }

    /**
     * 检查字符串是否不是<code>null</code>和空字符串<code>""</code>。
     * <pre>
     * StringUtil.isEmpty(null)      = false
     * StringUtil.isEmpty("")        = false
     * StringUtil.isEmpty(" ")       = true
     * StringUtil.isEmpty("bob")     = true
     * StringUtil.isEmpty("  bob  ") = true
     * </pre>
     *
     * @param str 要检查的字符串
     *
     * @return 如果不为空, 则返回<code>true</code>
     */
    public static boolean isNotEmpty(String str) {
        return ((str != null) && (str.length() > 0));
    }

    /**
     * 在字符串中查找指定字符串，并返回第一个匹配的索引值。如果字符串为<code>null</code>或未找到，则返回<code>-1</code>。
     * <pre>
     * StringUtil.indexOf(null, *)          = -1
     * StringUtil.indexOf(*, null)          = -1
     * StringUtil.indexOf("", "")           = 0
     * StringUtil.indexOf("aabaabaa", "a")  = 0
     * StringUtil.indexOf("aabaabaa", "b")  = 2
     * StringUtil.indexOf("aabaabaa", "ab") = 1
     * StringUtil.indexOf("aabaabaa", "")   = 0
     * </pre>
     *
     * @param str 要扫描的字符串
     * @param searchStr 要查找的字符串
     *
     * @return 第一个匹配的索引值。如果字符串为<code>null</code>或未找到，则返回<code>-1</code>
     */
    public static int indexOf(String str, String searchStr) {
        if ((str == null) || (searchStr == null)) {
            return -1;
        }

        return str.indexOf(searchStr);
    }

    /**
     * 在字符串中查找指定字符串，并返回第一个匹配的索引值。如果字符串为<code>null</code>或未找到，则返回<code>-1</code>。
     * <pre>
     * StringUtil.indexOf(null, *, *)          = -1
     * StringUtil.indexOf(*, null, *)          = -1
     * StringUtil.indexOf("", "", 0)           = 0
     * StringUtil.indexOf("aabaabaa", "a", 0)  = 0
     * StringUtil.indexOf("aabaabaa", "b", 0)  = 2
     * StringUtil.indexOf("aabaabaa", "ab", 0) = 1
     * StringUtil.indexOf("aabaabaa", "b", 3)  = 5
     * StringUtil.indexOf("aabaabaa", "b", 9)  = -1
     * StringUtil.indexOf("aabaabaa", "b", -1) = 2
     * StringUtil.indexOf("aabaabaa", "", 2)   = 2
     * StringUtil.indexOf("abc", "", 9)        = 3
     * </pre>
     *
     * @param str 要扫描的字符串
     * @param searchStr 要查找的字符串
     * @param startPos 开始搜索的索引值，如果小于0，则看作0
     *
     * @return 第一个匹配的索引值。如果字符串为<code>null</code>或未找到，则返回<code>-1</code>
     */
    public static int indexOf(String str, String searchStr, int startPos) {
        if ((str == null) || (searchStr == null)) {
            return -1;
        }

        // JDK1.3及以下版本的bug：不能正确处理下面的情况
        if ((searchStr.length() == 0) && (startPos >= str.length())) {
            return str.length();
        }

        return str.indexOf(searchStr, startPos);
    }

    /**
     * 取指定字符串的子串。
     * 
     * <p>
     * 负的索引代表从尾部开始计算。如果字符串为<code>null</code>，则返回<code>null</code>。
     * <pre>
     * StringUtil.substring(null, *, *)    = null
     * StringUtil.substring("", * ,  *)    = "";
     * StringUtil.substring("abc", 0, 2)   = "ab"
     * StringUtil.substring("abc", 2, 0)   = ""
     * StringUtil.substring("abc", 2, 4)   = "c"
     * StringUtil.substring("abc", 4, 6)   = ""
     * StringUtil.substring("abc", 2, 2)   = ""
     * StringUtil.substring("abc", -2, -1) = "b"
     * StringUtil.substring("abc", -4, 2)  = "ab"
     * </pre>
     * </p>
     *
     * @param str 字符串
     * @param start 起始索引，如果为负数，表示从尾部计算
     * @param end 结束索引（不含），如果为负数，表示从尾部计算
     *
     * @return 子串，如果原始串为<code>null</code>，则返回<code>null</code>
     */
    public static String substring(String str, int start, int end) {
        if (str == null) {
            return null;
        }

        if (end < 0) {
            end = str.length() + end;
        }

        if (start < 0) {
            start = str.length() + start;
        }

        if (end > str.length()) {
            end = str.length();
        }

        if (start > end) {
            return EMPTY_STRING;
        }

        if (start < 0) {
            start = 0;
        }

        if (end < 0) {
            end = 0;
        }

        return str.substring(start, end);
    }

    /**
     * 检查字符串中是否包含指定的字符串。如果字符串为<code>null</code>，将返回<code>false</code>。
     * <pre>
     * StringUtil.contains(null, *)     = false
     * StringUtil.contains(*, null)     = false
     * StringUtil.contains("", "")      = true
     * StringUtil.contains("abc", "")   = true
     * StringUtil.contains("abc", "a")  = true
     * StringUtil.contains("abc", "z")  = false
     * </pre>
     *
     * @param str 要扫描的字符串
     * @param searchStr 要查找的字符串
     *
     * @return 如果找到，则返回<code>true</code>
     */
    public static boolean contains(String str, String searchStr) {
        if ((str == null) || (searchStr == null)) {
            return false;
        }

        return str.indexOf(searchStr) >= 0;
    }

    /**
     * <p>Checks if the String contains only unicode digits.
     * A decimal point is not a unicode digit and returns false.</p>
     *
     * <p><code>null</code> will return <code>false</code>.
     * An empty String ("") will return <code>true</code>.</p>
     *
     * <pre>
     * StringUtils.isNumeric(null)   = false
     * StringUtils.isNumeric("")     = true
     * StringUtils.isNumeric("  ")   = false
     * StringUtils.isNumeric("123")  = true
     * StringUtils.isNumeric("12 3") = false
     * StringUtils.isNumeric("ab2c") = false
     * StringUtils.isNumeric("12-3") = false
     * StringUtils.isNumeric("12.3") = false
     * </pre>
     *
     * @param str  the String to check, may be null
     * @return <code>true</code> if only contains digits, and is non-null
     */
    public static boolean isNumeric(String str) {
        if (str == null) {
            return false;
        }
        int sz = str.length();
        for (int i = 0; i < sz; i++) {
            if (Character.isDigit(str.charAt(i)) == false) {
                return false;
            }
        }
        return true;
    }
    
}
