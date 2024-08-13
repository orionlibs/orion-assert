package io.github.orionlibs.orion_assert;

public class InvalidArgumentException extends OrionUncheckedException
{
    private static final String DefaultErrorMessage = "The given input is invalid.";


    public InvalidArgumentException()
    {
        super(DefaultErrorMessage);
    }


    public InvalidArgumentException(String message)
    {
        super(message);
    }


    public InvalidArgumentException(String errorMessage, Object... arguments)
    {
        super(String.format(errorMessage, arguments));
    }


    public InvalidArgumentException(Throwable cause, String errorMessage, Object... arguments)
    {
        super(String.format(errorMessage, arguments), cause);
    }


    public InvalidArgumentException(Throwable cause)
    {
        super(cause, DefaultErrorMessage);
    }
}