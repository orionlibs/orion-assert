package io.github.orionlibs.orion_assert;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

class ExceptionStacktraceMessages
{
    static String run(Throwable exception)
    {
        Assert.notNull(exception, "The exception input cannot be null.");
        List<String> errorMessages = new ArrayList<>();
        errorMessages.add(exception.getClass().getName() + " = " + exception.getMessage());
        Throwable throwable = exception;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printer = new PrintStream(outputStream);
        if(exception.getCause() != null)
        {
            while((throwable = throwable.getCause()) != null)
            {
                printStackTrace(throwable, errorMessages, outputStream, printer);
            }
        }
        else
        {
            printStackTrace(throwable, errorMessages, outputStream, printer);
        }
        String errorMessage = "";
        for(int i = errorMessages.size() - 1; i >= 0; i--)
        {
            errorMessage += errorMessages.get(i);
            if(i > 0)
            {
                errorMessage += "\n";
            }
        }
        return errorMessage;
    }


    private static void printStackTrace(Throwable throwable, List<String> errorMessages, ByteArrayOutputStream outputStream, PrintStream printer)
    {
        errorMessages.add(throwable.getClass().getName() + " = " + throwable.getMessage());
        throwable.printStackTrace(printer);
        errorMessages.add("\nStackTrace = " + outputStream.toString(StandardCharsets.UTF_8));
    }
}