package io.github.orionlibs.orion_assert;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Assert
{
    public static void notNull(Object object, String errorMessage)
    {
        if(object == null)
        {
            throw new IllegalArgumentException(errorMessage);
        }
    }


    public static void notNull(String errorMessage, Object object, Object... objects)
    {
        notNull(object, errorMessage);
        if(objects != null && objects.length > 0)
        {
            Arrays.stream(objects).forEach(obj -> notNull(obj, errorMessage));
        }
    }


    public static void notEmpty(String object, String errorMessage)
    {
        notNull(object, errorMessage);
        if(object == null || object.isEmpty())
        {
            throw new IllegalArgumentException(errorMessage);
        }
    }


    public static void notEmpty(Collection<?> object, String errorMessage)
    {
        notNull(object, errorMessage);
        if(object == null || object.isEmpty())
        {
            throw new IllegalArgumentException(errorMessage);
        }
    }


    public static void notEmpty(Object[] array, String errorMessage)
    {
        notNull(array, errorMessage);
        if(array.length == 0)
        {
            throw new InvalidArgumentException(errorMessage);
        }
    }


    public static void notEmpty(int[] array, String errorMessage)
    {
        notNull(array, errorMessage);
        if(array.length == 0)
        {
            throw new InvalidArgumentException(errorMessage);
        }
    }


    public static void lengthsMatch(String errorMessage, Object[] array1, Object[] array2, Object[]... arrays)
    {
        notNull(array1, errorMessage);
        notNull(array2, errorMessage);
        int length = array1.length;
        boolean length2Matches = length != array2.length;
        if(length2Matches)
        {
            throw new InvalidArgumentException(errorMessage);
        }
        if(arrays != null && arrays.length > 0)
        {
            Arrays.stream(arrays).forEach(array -> notNull(array, errorMessage));
            if(Arrays.stream(arrays).anyMatch(array -> array.length != length))
            {
                throw new InvalidArgumentException(errorMessage);
            }
        }
    }


    public static void lengthsMatch(String errorMessage, String string1, String string2, String... strings)
    {
        notNull(string1, errorMessage);
        notNull(string2, errorMessage);
        int length = string1.length();
        boolean length2Matches = length != string2.length();
        if(length2Matches)
        {
            throw new InvalidArgumentException(errorMessage);
        }
        if(strings != null && strings.length > 0)
        {
            Arrays.stream(strings).forEach(string -> notNull(string, errorMessage));
            if(Arrays.stream(strings).anyMatch(string -> string.length() != length))
            {
                throw new InvalidArgumentException(errorMessage);
            }
        }
    }


    public static void notEmpty(Map<?, ?> mapper, String errorMessage)
    {
        notNull(mapper, errorMessage);
        if(mapper.isEmpty())
        {
            throw new InvalidArgumentException(errorMessage);
        }
    }


    public static void notEmpty(byte[] array, String errorMessage)
    {
        notNull(array, errorMessage);
        if(array.length == 0)
        {
            throw new InvalidArgumentException(errorMessage);
        }
    }


    public static void notEmpty(short[] array, String errorMessage)
    {
        notNull(array, errorMessage);
        if(array.length == 0)
        {
            throw new InvalidArgumentException(errorMessage);
        }
    }


    public static void notEmpty(long[] array, String errorMessage)
    {
        notNull(array, errorMessage);
        if(array.length == 0)
        {
            throw new InvalidArgumentException(errorMessage);
        }
    }


    public static void notEmpty(float[] array, String errorMessage)
    {
        notNull(array, errorMessage);
        if(array.length == 0)
        {
            throw new InvalidArgumentException(errorMessage);
        }
    }


    public static void notEmpty(double[] array, String errorMessage)
    {
        notNull(array, errorMessage);
        if(array.length == 0)
        {
            throw new InvalidArgumentException(errorMessage);
        }
    }


    public static void notEmpty(boolean[] array, String errorMessage)
    {
        notNull(array, errorMessage);
        if(array.length == 0)
        {
            throw new InvalidArgumentException(errorMessage);
        }
    }


    public static void notEmpty(char[] array, String errorMessage)
    {
        notNull(array, errorMessage);
        if(array.length == 0)
        {
            throw new InvalidArgumentException(errorMessage);
        }
    }


    public static void notEmpty(String errorMessage, Object[] array1, Object[] array2, Object[]... arrays)
    {
        notEmpty(array1, errorMessage);
        notEmpty(array2, errorMessage);
        if(arrays != null && arrays.length > 0)
        {
            Arrays.stream(arrays).forEach(array -> notEmpty(array, errorMessage));
        }
    }


    public static void hasLength(Object[] array, int length, String errorMessage)
    {
        notNull(array, errorMessage);
        if(array.length != length)
        {
            throw new InvalidArgumentException(errorMessage);
        }
    }


    public static void hasLength(byte[] array, int length, String errorMessage)
    {
        notNull(array, errorMessage);
        if(array.length != length)
        {
            throw new InvalidArgumentException(errorMessage);
        }
    }


    public static void hasLength(short[] array, int length, String errorMessage)
    {
        notNull(array, errorMessage);
        if(array.length != length)
        {
            throw new InvalidArgumentException(errorMessage);
        }
    }


    public static void hasLength(int[] array, int length, String errorMessage)
    {
        notNull(array, errorMessage);
        if(array.length != length)
        {
            throw new InvalidArgumentException(errorMessage);
        }
    }


    public static void hasLength(long[] array, int length, String errorMessage)
    {
        notNull(array, errorMessage);
        if(array.length != length)
        {
            throw new InvalidArgumentException(errorMessage);
        }
    }


    public static void hasLength(boolean[] array, int length, String errorMessage)
    {
        notNull(array, errorMessage);
        if(array.length != length)
        {
            throw new InvalidArgumentException(errorMessage);
        }
    }


    public static void hasLength(char[] array, int length, String errorMessage)
    {
        notNull(array, errorMessage);
        if(array.length != length)
        {
            throw new InvalidArgumentException(errorMessage);
        }
    }


    public static void hasLength(float[] array, int length, String errorMessage)
    {
        notNull(array, errorMessage);
        if(array.length != length)
        {
            throw new InvalidArgumentException(errorMessage);
        }
    }


    public static void hasLength(double[] array, int length, String errorMessage)
    {
        notNull(array, errorMessage);
        if(array.length != length)
        {
            throw new InvalidArgumentException(errorMessage);
        }
    }


    public static void hasLength(String s, int length, String errorMessage)
    {
        notNull(s, errorMessage);
        if(s.length() != length)
        {
            throw new InvalidArgumentException(errorMessage);
        }
    }


    public static void hasLengthAtLeast(Object[] array, int length, String errorMessage)
    {
        notNull(array, errorMessage);
        if(array.length < length)
        {
            throw new InvalidArgumentException(errorMessage);
        }
    }


    public static void hasLengthAtLeast(List<?> array, int length, String errorMessage)
    {
        notNull(array, errorMessage);
        if(array.size() < length)
        {
            throw new InvalidArgumentException(errorMessage);
        }
    }


    public static void isZero(int x, String errorMessage)
    {
        if(x != 0)
        {
            throw new InvalidArgumentException(errorMessage);
        }
    }


    public static void isNotZero(long x, String errorMessage)
    {
        if(x == 0)
        {
            throw new InvalidArgumentException(errorMessage);
        }
    }


    public static void isNotZero(Number x, String errorMessage)
    {
        if(new BigDecimal(x.toString()).compareTo(BigDecimal.ZERO) == 0)
        {
            throw new InvalidArgumentException(errorMessage);
        }
    }


    public static void isZero(long x, String errorMessage)
    {
        if(x != 0)
        {
            throw new InvalidArgumentException(errorMessage);
        }
    }


    public static void isPositive(int x, String errorMessage)
    {
        if(x <= 0)
        {
            throw new InvalidArgumentException(errorMessage);
        }
    }


    public static void isNonNegative(int x, String errorMessage)
    {
        if(x < 0)
        {
            throw new InvalidArgumentException(errorMessage);
        }
    }


    public static void isNonNegative(long x, String errorMessage)
    {
        if(x < 0)
        {
            throw new InvalidArgumentException(errorMessage);
        }
    }


    public static void withinRange(int x, int lowerBound, int upperBound, String errorMessage)
    {
        if(x < lowerBound || x >= upperBound)
        {
            throw new InvalidArgumentException(errorMessage);
        }
    }


    public static void isGreaterThan(int x, int y, String errorMessage)
    {
        if(x <= y)
        {
            throw new InvalidArgumentException(errorMessage);
        }
    }


    public static void isGreaterOrEqualTo(int x, int y, String errorMessage)
    {
        if(x < y)
        {
            throw new InvalidArgumentException(errorMessage);
        }
    }


    public static void isLessThanOrEqualTo(int x, int y, String errorMessage)
    {
        if(x > y)
        {
            throw new InvalidArgumentException(errorMessage);
        }
    }


    public static void isLessThan(int x, int y, String errorMessage)
    {
        if(x >= y)
        {
            throw new InvalidArgumentException(errorMessage);
        }
    }


    public static void areEqual(int x, int y, String errorMessage)
    {
        if(x != y)
        {
            throw new InvalidArgumentException(errorMessage);
        }
    }


    public static void areEqual(long x, long y, String errorMessage)
    {
        if(x != y)
        {
            throw new InvalidArgumentException(errorMessage);
        }
    }


    public static void areNotEqual(int x, int y, String errorMessage)
    {
        if(x == y)
        {
            throw new InvalidArgumentException(errorMessage);
        }
    }


    public static void isTrue(boolean condition, String errorMessage)
    {
        if(!condition)
        {
            throw new InvalidArgumentException(errorMessage);
        }
    }


    public static void isFalse(boolean condition, String errorMessage)
    {
        if(condition)
        {
            throw new InvalidArgumentException(errorMessage);
        }
    }
}