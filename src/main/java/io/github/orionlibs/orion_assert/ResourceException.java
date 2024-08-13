package io.github.orionlibs.orion_assert;

public class ResourceException extends OrionCheckedException
{
    private static final String DefaultErrorMessage = "Error trying to access the required resource.";


    public ResourceException()
    {
        super(DefaultErrorMessage);
    }


    public ResourceException(String message)
    {
        super(message);
    }


    public ResourceException(String errorMessage, Object... arguments)
    {
        super(String.format(errorMessage, arguments));
    }


    public ResourceException(Throwable cause, String errorMessage, Object... arguments)
    {
        super(String.format(errorMessage, arguments), cause);
    }


    public ResourceException(Throwable cause)
    {
        super(cause, DefaultErrorMessage);
    }
}