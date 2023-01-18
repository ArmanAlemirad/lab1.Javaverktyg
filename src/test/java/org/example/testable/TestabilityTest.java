package org.example.testable;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


import static org.mockito.ArgumentMatchers.anyString;


class TestabilityTest {

    Logger logger = new LoggerImpl(); //Use own double
    MailSender mailSender = Mockito.mock(MailSender.class); //Use mockito to mock mail sender

Testability testability = new Testability(logger, mailSender);

@Test
    void runShouldRunAndSendMail(){
    testability.run();
    //Logger.loggerIsCalling assertTrue
    Mockito.verify(mailSender).sendMail(anyString(), anyString());
}

}