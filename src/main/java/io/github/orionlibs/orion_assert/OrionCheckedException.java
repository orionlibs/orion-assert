package io.github.orionlibs.orion_assert;

public class OrionCheckedException extends Exception
{
    private static final String DefaultErrorMessage = "There was an error.";


    public OrionCheckedException(String errorMessage)
    {
        super(errorMessage);
    }


    public OrionCheckedException(String errorMessage, Object... arguments)
    {
        super(String.format(errorMessage, arguments));
    }


    public OrionCheckedException(Throwable cause, String errorMessage, Object... arguments)
    {
        super(String.format(errorMessage, arguments), cause);
    }


    public OrionCheckedException(Throwable cause)
    {
        super(DefaultErrorMessage, cause);
    }
}