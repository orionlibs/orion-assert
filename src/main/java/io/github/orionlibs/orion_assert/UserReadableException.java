package io.github.orionlibs.orion_assert;

public class UserReadableException extends OrionCheckedException
{
    private static final String DefaultErrorMessage = "There was an error.";


    public UserReadableException()
    {
        super(DefaultErrorMessage);
    }


    public UserReadableException(String message)
    {
        super(message);
    }


    public UserReadableException(String errorMessage, Object... arguments)
    {
        super(String.format(errorMessage, arguments));
    }


    public UserReadableException(Throwable cause, String errorMessage, Object... arguments)
    {
        super(String.format(errorMessage, arguments), cause);
    }


    public UserReadableException(Throwable cause)
    {
        super(cause, DefaultErrorMessage);
    }
}