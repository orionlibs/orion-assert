package io.github.orionlibs.orion_assert;

public class InaccessibleException extends OrionCheckedException
{
    private static final String DefaultErrorMessage = "Error trying to access the required field/component/resource.";


    public InaccessibleException()
    {
        super(DefaultErrorMessage);
    }


    public InaccessibleException(String message)
    {
        super(message);
    }


    public InaccessibleException(String errorMessage, Object... arguments)
    {
        super(String.format(errorMessage, arguments));
    }


    public InaccessibleException(Throwable cause, String errorMessage, Object... arguments)
    {
        super(String.format(errorMessage, arguments), cause);
    }


    public InaccessibleException(Throwable cause)
    {
        super(cause, DefaultErrorMessage);
    }
}