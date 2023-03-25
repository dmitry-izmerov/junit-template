package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class MainServiceTest {

    @Mock
    private ServiceA serviceA;
    @Mock
    private ServiceB serviceB;
    @InjectMocks
    private MainService mainService;

    @Test
    void getText() {
        when(serviceA.getNum()).thenReturn(1);
        when(serviceB.getStr(anyString())).thenReturn("str");

        var text = mainService.getText("str");

        assertEquals("1str", text);
    }
}