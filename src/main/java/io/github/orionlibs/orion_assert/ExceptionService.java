package io.github.orionlibs.orion_assert;

public class ExceptionService
{
    public static String getAllErrorMessagesFromTheHierarchy(Throwable exception)
    {
        return ExceptionStacktraceMessages.run(exception);
    }
}