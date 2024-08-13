package io.github.orionlibs.orion_assert;

public class OrionUncheckedException extends RuntimeException
{
    private static final String DefaultErrorMessage = "There was an error.";


    public OrionUncheckedException(String errorMessage)
    {
        super(errorMessage);
    }


    public OrionUncheckedException(String errorMessage, Object... arguments)
    {
        super(String.format(errorMessage, arguments));
    }


    public OrionUncheckedException(Throwable cause, String errorMessage, Object... arguments)
    {
        super(String.format(errorMessage, arguments), cause);
    }


    public OrionUncheckedException(Throwable cause)
    {
        super(DefaultErrorMessage, cause);
    }
}